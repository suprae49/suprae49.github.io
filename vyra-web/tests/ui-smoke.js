const fs = require('fs');
const vm = require('vm');
const html = fs.readFileSync(require('path').join(__dirname, '..', 'index.html'), 'utf8');
async function main() {
const script = html.split('<script>')[1].split('</script>')[0];
class FakeClassList {
  constructor(){this.s=new Set();}
  toggle(k,force){if(force===undefined)force=!this.s.has(k);if(force)this.s.add(k);else this.s.delete(k);return force;}
  add(k){this.s.add(k)} remove(k){this.s.delete(k)} contains(k){return this.s.has(k)}
}
class El {
  constructor(id=''){this.id=id;this.value='';this.textContent='';this.hidden=false;this.disabled=false;this.style={display:'none'};this.classList=new FakeClassList();this.listeners={};this.children=[];this.selectionStart=0;this.selectionEnd=0;this.scrollTop=0;this.options=[];this.attributes={};this.dataset={};this.onclick=null;this.files=[];this.parentElement=null;}
  addEventListener(n,f){(this.listeners[n] ||= []).push(f)}
  dispatchEvent(e){for(const f of this.listeners[e.type]||[])f(e);return true;}
  setRangeText(t,a,b,mode){this.value=this.value.slice(0,a)+t+this.value.slice(b);const p=a+t.length;if(mode==='select'){this.selectionStart=a;this.selectionEnd=p;}else this.selectionStart=this.selectionEnd=p;}
  setSelectionRange(a,b){this.selectionStart=a;this.selectionEnd=b}
  focus(){} select(){this.selectionStart=0;this.selectionEnd=this.value.length}
  click(){if(this.onclick)this.onclick();}
  replaceChildren(...xs){this.children=xs}
  appendChild(x){this.children.push(x);return x}
  querySelector(){return new El('child')}
  setAttribute(k,v){this.attributes[k]=String(v)}
  removeAttribute(k){delete this.attributes[k]}
}
const ids=['src','out','cout','status','languageMode','completionPopup','lineNumbers','cursorInfo','docInfo','editorFileName','tabOut','tabC','compileBtn','runBtn','demoBtn','resetBtn','restoreBtn','clearOutputBtn','openBtn','saveBtn','copyBtn','downloadBtn','howBtn','file','backupFile','exportBackupBtn','importBackupBtn','mobileQuickTools','findBtn','findPanel','findQuery','replaceText','findNextBtn','replaceOneBtn','replaceAllBtn','findCloseBtn','findCount','mobileEditorBtn','mobileOutputBtn','themeBtn'];
const elements=Object.fromEntries(ids.map(id=>[id,new El(id)]));
elements.languageMode.value='vyra';elements.languageMode.options=[{value:'vyra',text:'VYRA'},{value:'python',text:'Python'},{value:'c',text:'C'}];
Object.defineProperty(elements.languageMode,'selectedIndex',{get(){return this.options.findIndex(o=>o.value===this.value)}});
const main=new El('main');main.dataset={mobileView:'editor'};
const root=new El('root');
const document={documentElement:root,getElementById:id=>elements[id] ||= new El(id),createElement:tag=>new El(tag),querySelector:q=>q==='main'?main:new El(q)};
const store=new Map();const localStorage={getItem:k=>store.has(k)?store.get(k):null,setItem:(k,v)=>store.set(k,String(v)),removeItem:k=>store.delete(k)};
let timerId=0;const timers=new Map();const ctx={document,window:{addEventListener(){}},localStorage,navigator:{clipboard:{writeText:async()=>{}}},Blob,URL:{createObjectURL:()=>'',revokeObjectURL:()=>{}},Event,performance:{now:()=>0},setTimeout:(f)=>{const id=++timerId;timers.set(id,f);return id;},clearTimeout:(id)=>timers.delete(id),confirm:()=>true,console};
vm.createContext(ctx);vm.runInContext(script,ctx);
const browserProgram = 'value = 2.5\nwhile value > 0:\n    print(value)\n    value -= 1.25';
const browserCompiled = vm.runInContext(`VYRA.compile(${JSON.stringify(browserProgram)})`, ctx);
if (!browserCompiled.ok || !browserCompiled.c.includes('int main(void)')) throw Error('Browser compiler rejected a supported numeric loop');
const browserRun = vm.runInContext(`VYRA.run(${JSON.stringify(browserCompiled.js)})`, ctx);
if (browserRun.error || browserRun.output !== '2.5\n1.25\n') throw Error('Browser numeric runtime output mismatch: ' + browserRun.output);
const undefinedCheck = vm.runInContext(`VYRA.compile('print(missing_value)')`, ctx);
if (undefinedCheck.ok || !undefinedCheck.errors.join(' ').includes('Undefined variable')) throw Error('Undefined variable was not rejected');
const moduloCheck = vm.runInContext(`VYRA.compile('print(fmod(17, 5))')`, ctx);
if (!moduloCheck.ok) throw Error('fmod() should work: ' + moduloCheck.errors.join(' '));
const moduloRun = vm.runInContext(`VYRA.run(${JSON.stringify(moduloCheck.js)})`, ctx);
if (moduloRun.error || !moduloRun.output.includes('2')) throw Error('fmod runtime failed: ' + moduloRun.output);
const percentCheck = vm.runInContext(`VYRA.compile('print(5 % 2)')`, ctx);
if (percentCheck.ok || !percentCheck.errors.join(' ').includes("fmod")) throw Error('% operator should suggest fmod: ' + percentCheck.errors.join(' '));
const src=elements.src,mode=elements.languageMode;
if(mode.value!=='vyra'||!src.value.startsWith('fn main():'))throw Error('VYRA not default');
if(!elements.out.textContent.includes('Hello, Supreme'))throw Error('VYRA startup output missing');
mode.value='python';mode.dispatchEvent({type:'change'});
if(!src.value.includes('range(1, 6)'))throw Error('Python demo missing');
elements.runBtn.click();if(!elements.out.textContent.includes('Python code editing'))throw Error('Python message incorrect');
mode.value='c';mode.dispatchEvent({type:'change'});if(!src.value.includes('#include <stdio.h>'))throw Error('C demo missing');
elements.runBtn.click();if(!elements.out.textContent.includes('C code editing')||elements.out.textContent.includes('PYTHON'))throw Error('C message wrong or stale');
mode.value='vyra';mode.dispatchEvent({type:'change'});src.value='print("fresh output")';src.dispatchEvent({type:'input'});elements.tabC.click();if(!elements.cout.textContent.includes('fresh output'))throw Error('Generated C not refreshed');
if(elements.lineNumbers.textContent.split('\n').length!==src.value.split('\n').length)throw Error('Line number gutter mismatch');
src.value='if value > 0:';src.selectionStart=src.selectionEnd=src.value.length;src.dispatchEvent({type:'keydown',key:'Enter',ctrlKey:false,metaKey:false,altKey:false,shiftKey:false,preventDefault(){}});if(src.value!=='if value > 0:\n    ')throw Error('Auto-indent failed');
src.value='print("hello")';src.selectionStart=0;src.selectionEnd=src.value.length;src.dispatchEvent({type:'keydown',key:'/',ctrlKey:true,metaKey:false,shiftKey:false,preventDefault(){}});if(src.value!=='# print("hello")')throw Error('Comment toggle failed');
// A pending autosave must flush to the OLD language before the selector changes.
src.value='pending VYRA draft';src.dispatchEvent({type:'input'});mode.value='python';mode.dispatchEvent({type:'change'});
if(store.get('vyra-ide-draft-v1:vyra')!=='pending VYRA draft')throw Error('Pending autosave was saved into the wrong language');
src.value='alpha beta alpha';src.selectionStart=0;src.selectionEnd=0;elements.findBtn.click();elements.findQuery.value='alpha';elements.findQuery.dispatchEvent({type:'input'});if(elements.findCount.textContent!=='2 matches')throw Error('Find count failed: '+elements.findCount.textContent);elements.findNextBtn.click();if(src.selectionStart!==0||src.selectionEnd!==5)throw Error('Find next failed');elements.replaceText.value='gamma';elements.replaceAllBtn.click();if(src.value!=='gamma beta gamma')throw Error('Replace all failed: '+src.value);
elements.mobileOutputBtn.click();if(main.dataset.mobileView!=='output')throw Error('Mobile Output view failed');elements.mobileEditorBtn.click();if(main.dataset.mobileView!=='editor')throw Error('Mobile Editor view failed');
elements.themeBtn.click();if(root.attributes['data-theme']!=='dark')throw Error('Theme toggle failed');
// Outdent must work when the caret is inside code, not only in leading whitespace.
src.value='    print(\"x\")';src.selectionStart=src.selectionEnd=8;src.dispatchEvent({type:'keydown',key:'Tab',shiftKey:true,ctrlKey:false,metaKey:false,altKey:false,preventDefault(){}});if(src.value!=='print(\"x\")')throw Error('Shift+Tab failed with caret inside an indented line');
// A selection ending at the next line start must not modify that next line.
src.value='one\ntwo\nthree';src.selectionStart=0;src.selectionEnd=4;src.dispatchEvent({type:'keydown',key:'Tab',shiftKey:false,ctrlKey:false,metaKey:false,altKey:false,preventDefault(){}});if(src.value!=='    one\ntwo\nthree')throw Error('Tab changed a line outside the selection boundary: '+src.value);
// Editor display controls persist their settings.
elements.fontUpBtn.click();if(src.style.fontSize!=='14px')throw Error('Editor font size increase failed');elements.wrapBtn.click();if(src.style.whiteSpace!=='pre-wrap'||elements.wrapBtn.attributes['aria-pressed']!=='true')throw Error('Word-wrap preference failed');if(!store.has('vyra-ide-editor-prefs-v1'))throw Error('Editor preferences were not persisted');
// Bottom dock mirrors the mobile editor/output state.
elements.dockOutputBtn.click();if(main.dataset.mobileView!=='output'||!elements.dockOutputBtn.classList.contains('active'))throw Error('Bottom dock Output action failed');elements.dockEditorBtn.click();if(main.dataset.mobileView!=='editor'||!elements.dockEditorBtn.classList.contains('active'))throw Error('Bottom dock Editor action failed');
mode.value='vyra';src.value='print(\"dock run\")';src.dispatchEvent({type:'input'});elements.dockRunBtn.click();if(main.dataset.mobileView!=='output'||!elements.out.textContent.includes('dock run'))throw Error('Bottom dock Run action failed');
if(!html.includes('.mobileDock { position:fixed')||!html.includes('env(safe-area-inset-bottom)'))throw Error('Responsive bottom dock CSS or safe-area support missing');
const guide=fs.readFileSync(require('path').join(__dirname,'..','how-to.html'),'utf8');if(!guide.includes('Mobile bottom dock')||!guide.includes('Editor display settings'))throw Error('How-to guide does not cover the new phone controls');const guideIds=[...guide.matchAll(/<section class=\"docSection\" id=\"([^\"]+)\"/g)].map(m=>m[1]);if(new Set(guideIds).size!==guideIds.length)throw Error('How-to guide contains duplicate section IDs');
// Touch quick-insert templates follow the selected language and insert at the caret.
const quick=elements.mobileQuickTools;
if(!quick.children.length)throw Error('Mobile quick-insert controls were not rendered');
const printQuick=quick.children.find(x=>x.textContent==='print()');
if(!printQuick)throw Error('VYRA print quick insert missing');
src.value='';src.selectionStart=src.selectionEnd=0;printQuick.dispatchEvent({type:'click'});
if(src.value!=='print("")'||src.selectionStart!==7)throw Error('Quick insert did not place the caret inside print quotes: '+src.value+' @ '+src.selectionStart);
mode.value='c';mode.dispatchEvent({type:'change'});
if(!quick.children.some(x=>x.textContent==='printf()'))throw Error('C quick-insert templates did not update');
// Backup payload contains each language draft and the current editor settings.
src.value='backup test';src.dispatchEvent({type:'input'});
const backup=vm.runInContext('makeProjectBackup()',ctx);
if(backup.format!=='vyra-ide-backup'||backup.version!==1||backup.drafts.c!=='backup test')throw Error('Project backup payload missing active draft');
const guideHasBackup=fs.readFileSync(require('path').join(__dirname,'..','how-to.html'),'utf8').includes('id="backup"');
if(!guideHasBackup)throw Error('Guide missing project backup and quick insert instructions');
const swSource=fs.readFileSync(require('path').join(__dirname,'..','sw.js'),'utf8');
const manifest=JSON.parse(fs.readFileSync(require('path').join(__dirname,'..','manifest.webmanifest'),'utf8'));
if(!html.includes('rel="manifest"')||!swSource.includes("caches.open(CACHE_NAME)")||!manifest.icons.some(icon=>icon.sizes==='192x192'))throw Error('Installable/offline app shell metadata missing');
// Import validates and restores the backup asynchronously.
const importedBackup = {format:'vyra-ide-backup',version:1,activeLanguage:'vyra',drafts:{vyra:'print("restored backup")',python:'print("py")'},fileNames:{vyra:'restored.vy',python:'restored.py'},theme:'light',editorPreferences:{fontSize:16,wordWrap:true}};
await vm.runInContext(`importProjectBackup({size:1,text:()=>Promise.resolve(${JSON.stringify(JSON.stringify(importedBackup))})})`,ctx);
if(src.value!=='print("restored backup")'||elements.editorFileName.textContent!=='restored.vy')throw Error('Import backup did not restore active VYRA draft and filename');
if(root.attributes['data-theme']!=='light'||src.style.fontSize!=='16px')throw Error('Import backup did not restore theme/editor preferences');
await vm.runInContext('importProjectBackup({size:1,text:()=>Promise.resolve("{}")})',ctx);
if(!elements.status.textContent.startsWith('Backup not restored:'))throw Error('Malformed backup was not rejected with a status message');
console.log('VYRA UI + compiler smoke tests passed: defaults, language modes, runtime notices, numeric execution, error handling, generated C refresh, line numbers, indentation/outdent boundary, comments, Find/Replace, mobile view switcher/dock, theme, font size, word wrap, mobile quick insert, project backup, and updated guide.');

}
main().catch(error => { console.error(error); process.exitCode = 1; });
