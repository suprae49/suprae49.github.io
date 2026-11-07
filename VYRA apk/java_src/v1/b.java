package v1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.text.TextPaint;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.emoji2.text.t;
import androidx.fragment.app.q;
import androidx.fragment.app.u;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import co.median.android.eeqadjy.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.WeakHashMap;
import k1.a0;
import k1.b0;
import k1.g0;
import k1.h0;
import k1.l0;
import k1.m0;
import k1.q0;
import k1.u0;
import k1.x0;
import k1.y0;
import k1.z0;
import org.json.JSONObject;
import p0.p0;
import r3.g;
import r3.l;
import r3.n;
import t2.i;
import y3.j;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f4289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Serializable f4290e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f4291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f4292h;

    /* JADX WARN: Code duplicated, block: B:34:0x00c9  */
    public b(Context context, int i4, int i5, String str) {
        a aVar;
        String strC;
        String strA;
        context.getClass();
        this.f4288c = context;
        this.f4289d = str;
        this.f4286a = i4;
        this.f4287b = i5;
        l.f3614a.getClass();
        String strA2 = null;
        if (!b.class.isAnonymousClass()) {
            if (b.class.isLocalClass()) {
                strA2 = b.class.getSimpleName();
                Method enclosingMethod = b.class.getEnclosingMethod();
                if (enclosingMethod != null) {
                    strA2 = j.y(strA2, enclosingMethod.getName() + '$');
                } else {
                    Constructor<?> enclosingConstructor = b.class.getEnclosingConstructor();
                    if (enclosingConstructor != null) {
                        strA2 = j.y(strA2, enclosingConstructor.getName() + '$');
                    } else {
                        int iIndexOf = strA2.indexOf(36, 0);
                        if (iIndexOf != -1) {
                            strA2 = strA2.substring(iIndexOf + 1, strA2.length());
                        }
                    }
                }
            } else if (b.class.isArray()) {
                Class<?> componentType = b.class.getComponentType();
                if (componentType.isPrimitive() && (strA = n.a(componentType.getName())) != null) {
                    strA2 = strA.concat("Array");
                }
                if (strA2 == null) {
                    strA2 = "Array";
                }
            } else {
                strA2 = n.a(b.class.getName());
                if (strA2 == null) {
                    strA2 = b.class.getSimpleName();
                }
            }
        }
        this.f4290e = strA2;
        if (str.startsWith("custom")) {
            aVar = a.f4278c;
        } else {
            boolean zStartsWith = str.startsWith("fas");
            a aVar2 = a.f;
            if (zStartsWith) {
                aVar = aVar2;
            } else if (str.startsWith("fab")) {
                aVar = a.f4280e;
            } else if (str.startsWith("far")) {
                aVar = a.f4279d;
            } else if (str.startsWith("fal")) {
                aVar = a.f4282h;
            } else if (str.startsWith("fat")) {
                aVar = a.f4281g;
            } else if (str.startsWith("md")) {
                aVar = a.f4283i;
            } else {
                aVar = aVar2;
            }
        }
        this.f4291g = aVar;
        if (aVar == null) {
            strC = c();
        } else {
            try {
                InputStream inputStreamOpen = context.getAssets().open(aVar.f4285b.concat(".json"));
                inputStreamOpen.getClass();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, y3.a.f4798a), 8192);
                try {
                    StringWriter stringWriter = new StringWriter();
                    char[] cArr = new char[8192];
                    for (int i6 = bufferedReader.read(cArr); i6 >= 0; i6 = bufferedReader.read(cArr)) {
                        stringWriter.write(cArr, 0, i6);
                    }
                    String string = stringWriter.toString();
                    string.getClass();
                    bufferedReader.close();
                    JSONObject jSONObject = new JSONObject(string);
                    if (j.t(str, "-")) {
                        String strSubstring = str.substring(j.v(str, "-", 0, 6) + 1);
                        strC = jSONObject.optLong(strSubstring) == 0 ? c() : String.format("%s", Arrays.copyOf(new Object[]{Character.valueOf((char) jSONObject.getLong(strSubstring))}, 1));
                    } else {
                        strC = c();
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        e4.a.j(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (Exception e5) {
                Log.e((String) this.f4290e, "glyphForIconName: ", e5);
                strC = c();
            }
        }
        this.f = strC;
        Context context2 = (Context) this.f4288c;
        String str2 = context2.getCacheDir().getAbsolutePath() + ((Object) "/");
        String str3 = "@" + context2.getResources().getDisplayMetrics().density + 'x';
        int iHashCode = (((a) this.f4291g).f4284a + ':' + ((String) this.f4289d) + ':' + this.f4287b).hashCode();
        i.b(32);
        String string2 = Integer.toString(iHashCode, 32);
        string2.getClass();
        this.f4292h = new File(str2 + string2 + '_' + this.f4286a + str3 + ".png");
    }

    public void a(x0 x0Var, boolean z4) {
        RecyclerView.j(x0Var);
        View view = x0Var.f2945a;
        RecyclerView recyclerView = (RecyclerView) this.f4292h;
        z0 z0Var = recyclerView.f933r0;
        if (z0Var != null) {
            y0 y0Var = z0Var.f2967e;
            p0.m(view, y0Var != null ? (p0.b) y0Var.f2964e.remove(view) : null);
        }
        if (z4) {
            ArrayList arrayList = recyclerView.f934s;
            if (arrayList.size() > 0) {
                throw u.i(0, arrayList);
            }
            b0 b0Var = recyclerView.f930q;
            if (b0Var != null) {
                b0Var.f(x0Var);
            }
            if (recyclerView.f920k0 != null) {
                recyclerView.f919k.y(x0Var);
            }
        }
        x0Var.f2961s = null;
        x0Var.f2960r = null;
        q0 q0VarE = e();
        q0VarE.getClass();
        int i4 = x0Var.f;
        ArrayList arrayList2 = q0VarE.a(i4).f2866a;
        if (((k1.p0) q0VarE.f2878a.get(i4)).f2867b <= arrayList2.size()) {
            return;
        }
        x0Var.m();
        arrayList2.add(x0Var);
    }

    public int b(int i4) {
        RecyclerView recyclerView = (RecyclerView) this.f4292h;
        u0 u0Var = recyclerView.f920k0;
        if (i4 >= 0 && i4 < u0Var.b()) {
            return !u0Var.f2925g ? i4 : recyclerView.f916i.g(i4, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i4 + ". State item count is " + u0Var.b() + recyclerView.y());
    }

    public String c() {
        this.f4291g = a.f4279d;
        return String.format("%s", Arrays.copyOf(new Object[]{(char) 61529}, 1));
    }

    public Drawable d() {
        File file = (File) this.f4292h;
        if (!file.exists()) {
            try {
                k();
            } catch (Exception e5) {
                Log.w((String) this.f4290e, "getDrawable: Error occurred while saving image for iconName " + ((Object) ((String) this.f4289d)), e5);
                return ((Context) this.f4288c).getDrawable(R.drawable.ic_default);
            }
        }
        return Drawable.createFromPath(file.getPath());
    }

    public q0 e() {
        if (((q0) this.f4291g) == null) {
            q0 q0Var = new q0();
            q0Var.f2878a = new SparseArray();
            q0Var.f2879b = 0;
            this.f4291g = q0Var;
        }
        return (q0) this.f4291g;
    }

    public View f(int i4) {
        return m(i4, Long.MAX_VALUE).f2945a;
    }

    public void g() {
        ArrayList arrayList = (ArrayList) this.f4290e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.D0;
        h hVar = ((RecyclerView) this.f4292h).j0;
        int[] iArr2 = (int[]) hVar.f1145d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        hVar.f1144c = 0;
    }

    public void h(int i4) {
        ArrayList arrayList = (ArrayList) this.f4290e;
        a((x0) arrayList.get(i4), true);
        arrayList.remove(i4);
    }

    public void i(View view) {
        RecyclerView recyclerView = (RecyclerView) this.f4292h;
        x0 x0VarI = RecyclerView.I(view);
        if (x0VarI.j()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (x0VarI.i()) {
            x0VarI.n.n(x0VarI);
        } else if (x0VarI.p()) {
            x0VarI.f2953j &= -33;
        }
        j(x0VarI);
        if (recyclerView.P == null || x0VarI.g()) {
            return;
        }
        recyclerView.P.d(x0VarI);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x009c A[LOOP:2: B:43:0x008f->B:47:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x009f A[EDGE_INSN: B:74:0x009f->B:48:0x009f BREAK  A[LOOP:1: B:39:0x007a->B:46:0x0099], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x009f A[EDGE_INSN: B:75:0x009f->B:48:0x009f BREAK  A[LOOP:1: B:39:0x007a->B:46:0x0099, LOOP_LABEL: LOOP:1: B:39:0x007a->B:46:0x0099], SYNTHETIC] */
    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public void j(x0 x0Var) {
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList = (ArrayList) this.f4290e;
        RecyclerView recyclerView = (RecyclerView) this.f4292h;
        h hVar = recyclerView.j0;
        boolean zI = x0Var.i();
        View view = x0Var.f2945a;
        boolean z6 = false;
        boolean z7 = true;
        if (zI || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(x0Var.i());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.y());
            throw new IllegalArgumentException(sb.toString());
        }
        if (x0Var.j()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + x0Var + recyclerView.y());
        }
        if (x0Var.o()) {
            q.q("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.y()));
            return;
        }
        if ((x0Var.f2953j & 16) == 0) {
            WeakHashMap weakHashMap = p0.f3233a;
            if (view.hasTransientState()) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        if (x0Var.g()) {
            if (this.f4287b <= 0 || (x0Var.f2953j & 526) != 0) {
                z5 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f4287b && size > 0) {
                    h(0);
                    size--;
                }
                int[] iArr = RecyclerView.D0;
                if (size > 0) {
                    int i8 = x0Var.f2947c;
                    if (((int[]) hVar.f1145d) != null) {
                        int i9 = hVar.f1144c * 2;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= i9) {
                                i4 = size - 1;
                                loop1: while (i4 >= 0) {
                                    i5 = ((x0) arrayList.get(i4)).f2947c;
                                    if (((int[]) hVar.f1145d) != null) {
                                        break;
                                    }
                                    i6 = hVar.f1144c * 2;
                                    i7 = 0;
                                    while (true) {
                                        if (i7 < i6) {
                                            break loop1;
                                        } else if (((int[]) hVar.f1145d)[i7] == i5) {
                                            break;
                                        } else {
                                            i7 += 2;
                                        }
                                    }
                                    i4--;
                                }
                                size = i4 + 1;
                            } else if (((int[]) hVar.f1145d)[i10] != i8) {
                                i10 += 2;
                            }
                        }
                    } else {
                        i4 = size - 1;
                        loop1: while (i4 >= 0) {
                            i5 = ((x0) arrayList.get(i4)).f2947c;
                            if (((int[]) hVar.f1145d) != null) {
                                break;
                                break;
                            }
                            i6 = hVar.f1144c * 2;
                            i7 = 0;
                            while (true) {
                                if (i7 < i6) {
                                    break loop1;
                                    break loop1;
                                } else if (((int[]) hVar.f1145d)[i7] == i5) {
                                    break;
                                } else {
                                    i7 += 2;
                                }
                            }
                            i4--;
                        }
                        size = i4 + 1;
                    }
                }
                arrayList.add(size, x0Var);
                z5 = true;
            }
            if (z5) {
                z7 = false;
            } else {
                a(x0Var, true);
            }
            z6 = z5;
        } else {
            z7 = false;
        }
        recyclerView.f919k.y(x0Var);
        if (z6 || z7 || !z4) {
            return;
        }
        x0Var.f2961s = null;
        x0Var.f2960r = null;
    }

    public void k() throws IOException {
        String str = (String) this.f;
        float f = this.f4286a;
        Context context = (Context) this.f4288c;
        float fApplyDimension = TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
        if (((a) this.f4291g).f4284a.equals(a.f4283i.f4284a) || ((a) this.f4291g).f4284a.equals(a.f4278c.f4284a)) {
            fApplyDimension *= 1.5f;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(this.f4287b);
        textPaint.setTextSize(fApplyDimension);
        textPaint.setAntiAlias(true);
        if (!g.a(str, "?")) {
            textPaint.setTypeface(Typeface.createFromAsset(context.getAssets(), ((a) this.f4291g).f4284a));
        }
        Rect rect = new Rect();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.width() + 5, rect.height() + 5, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        new Canvas(bitmapCreateBitmap).drawText(str, ((bitmapCreateBitmap.getWidth() - rect.width()) / 2.0f) - rect.left, ((bitmapCreateBitmap.getHeight() - rect.height()) / 2.0f) - rect.top, textPaint);
        FileOutputStream fileOutputStream = new FileOutputStream((File) this.f4292h);
        try {
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                e4.a.j(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public void l(View view) {
        h0 h0Var;
        RecyclerView recyclerView = (RecyclerView) this.f4292h;
        x0 x0VarI = RecyclerView.I(view);
        if ((x0VarI.f2953j & 12) == 0 && x0VarI.k() && (h0Var = recyclerView.P) != null) {
            k1.i iVar = (k1.i) h0Var;
            if (x0VarI.c().isEmpty() && iVar.f2793g && !x0VarI.f()) {
                if (((ArrayList) this.f4289d) == null) {
                    this.f4289d = new ArrayList();
                }
                x0VarI.n = this;
                x0VarI.f2957o = true;
                ((ArrayList) this.f4289d).add(x0VarI);
                return;
            }
        }
        if (x0VarI.f() && !x0VarI.h() && !recyclerView.f930q.f2735b) {
            q.q("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.y()));
            return;
        }
        x0VarI.n = this;
        x0VarI.f2957o = false;
        ((ArrayList) this.f4288c).add(x0VarI);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01df  */
    /* JADX WARN: Code duplicated, block: B:177:0x0330 A[EDGE_INSN: B:177:0x0330->B:178:0x0331 BREAK  A[LOOP:6: B:172:0x0318->B:176:0x032d]] */
    /* JADX WARN: Code duplicated, block: B:251:0x047c  */
    /* JADX WARN: Code duplicated, block: B:253:0x0485  */
    /* JADX WARN: Code duplicated, block: B:254:0x0488  */
    /* JADX WARN: Code duplicated, block: B:256:0x048b  */
    /* JADX WARN: Code duplicated, block: B:258:0x0491  */
    /* JADX WARN: Code duplicated, block: B:262:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:264:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:267:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:272:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:278:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:280:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:282:0x0507  */
    /* JADX WARN: Code duplicated, block: B:286:0x050f  */
    /* JADX WARN: Code duplicated, block: B:288:0x0513  */
    /* JADX WARN: Code duplicated, block: B:290:0x0519  */
    /* JADX WARN: Code duplicated, block: B:291:0x051b  */
    /* JADX WARN: Code duplicated, block: B:293:0x051f  */
    /* JADX WARN: Code duplicated, block: B:294:0x0524  */
    /* JADX WARN: Code duplicated, block: B:299:0x0537  */
    /* JADX WARN: Code duplicated, block: B:302:0x053c  */
    /* JADX WARN: Code duplicated, block: B:306:0x0545  */
    /* JADX WARN: Code duplicated, block: B:307:0x054f  */
    /* JADX WARN: Code duplicated, block: B:309:0x0555  */
    /* JADX WARN: Code duplicated, block: B:310:0x055f  */
    /* JADX WARN: Code duplicated, block: B:313:0x0565 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:315:0x0569  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095 A[EDGE_INSN: B:36:0x0095->B:37:0x0099 BREAK  A[LOOP:0: B:14:0x0030->B:20:0x004f]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public x0 m(int i4, long j4) {
        x0 x0Var;
        boolean z4;
        boolean z5;
        x0 x0VarE;
        long j5;
        long j6;
        boolean z6;
        b0 b0Var;
        boolean z7;
        long nanoTime;
        long j7;
        AccessibilityManager accessibilityManager;
        boolean z8;
        boolean z9;
        boolean z10;
        z0 z0Var;
        y0 y0Var;
        View.AccessibilityDelegate accessibilityDelegateD;
        p0.b bVar;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        m0 m0Var;
        boolean z11;
        x0 x0Var2;
        int i5;
        x0 x0Var3;
        View view;
        x0 x0Var4;
        boolean z12;
        int size;
        int iG;
        ArrayList arrayList2 = (ArrayList) this.f4288c;
        ArrayList arrayList3 = (ArrayList) this.f4290e;
        RecyclerView recyclerView = (RecyclerView) this.f4292h;
        u0 u0Var = recyclerView.f920k0;
        if (i4 < 0 || i4 >= u0Var.b()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i4 + "(" + i4 + "). Item count:" + u0Var.b() + recyclerView.y());
        }
        if (u0Var.f2925g) {
            ArrayList arrayList4 = (ArrayList) this.f4289d;
            if (arrayList4 != null && (size = arrayList4.size()) != 0) {
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        if (recyclerView.f930q.f2735b && (iG = recyclerView.f916i.g(i4, 0)) > 0 && iG < recyclerView.f930q.a()) {
                            long jB = recyclerView.f930q.b(iG);
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size) {
                                    x0Var = null;
                                    z4 = true;
                                    x0VarE = null;
                                    break;
                                }
                                x0 x0Var5 = (x0) ((ArrayList) this.f4289d).get(i7);
                                if (!x0Var5.p()) {
                                    x0Var = null;
                                    z4 = true;
                                    if (x0Var5.f2949e == jB) {
                                        x0Var5.a(32);
                                        x0VarE = x0Var5;
                                        break;
                                    }
                                }
                                i7++;
                            }
                        } else {
                            x0Var = null;
                            z4 = true;
                            x0VarE = null;
                            break;
                        }
                    } else {
                        x0VarE = (x0) ((ArrayList) this.f4289d).get(i6);
                        if (!x0VarE.p() && x0VarE.b() == i4) {
                            x0VarE.a(32);
                            x0Var = null;
                            z4 = true;
                            break;
                        }
                        i6++;
                    }
                }
            } else {
                x0Var = null;
                z4 = true;
                x0VarE = null;
                break;
            }
            z5 = x0VarE != null ? z4 : false;
        } else {
            x0Var = null;
            z4 = true;
            z5 = false;
            x0VarE = null;
        }
        if (x0VarE == null) {
            int size2 = arrayList2.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size2) {
                    ArrayList arrayList5 = (ArrayList) recyclerView.f918j.f580d;
                    int size3 = arrayList5.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size3) {
                            view = x0Var;
                            break;
                        }
                        view = (View) arrayList5.get(i9);
                        x0 x0VarI = RecyclerView.I(view);
                        if (x0VarI.b() == i4 && !x0VarI.f() && !x0VarI.h()) {
                            break;
                        }
                        i9++;
                    }
                    if (view == 0) {
                        int size4 = arrayList3.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size4) {
                                x0Var4 = x0Var;
                                break;
                            }
                            x0Var4 = (x0) arrayList3.get(i10);
                            if (!x0Var4.f() && x0Var4.b() == i4 && !x0Var4.d()) {
                                arrayList3.remove(i10);
                                break;
                            }
                            i10++;
                        }
                    } else {
                        x0 x0VarI2 = RecyclerView.I(view);
                        t tVar = recyclerView.f918j;
                        k1.b bVar2 = (k1.b) tVar.f579c;
                        int iIndexOfChild = ((a0) tVar.f578b).f2729a.indexOfChild(view);
                        if (iIndexOfChild < 0) {
                            q.p(view, "view is not a child, cannot hide ");
                            return x0Var;
                        }
                        if (!bVar2.d(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                        bVar2.a(iIndexOfChild);
                        tVar.x(view);
                        t tVar2 = recyclerView.f918j;
                        k1.b bVar3 = (k1.b) tVar2.f579c;
                        int iIndexOfChild2 = ((a0) tVar2.f578b).f2729a.indexOfChild(view);
                        int iB = (iIndexOfChild2 == -1 || bVar3.d(iIndexOfChild2)) ? -1 : iIndexOfChild2 - bVar3.b(iIndexOfChild2);
                        if (iB == -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + x0VarI2 + recyclerView.y());
                        }
                        recyclerView.f918j.d(iB);
                        l(view);
                        x0VarI2.a(8224);
                        x0Var4 = x0VarI2;
                        break;
                    }
                } else {
                    x0Var4 = (x0) arrayList2.get(i8);
                    if (!x0Var4.p() && x0Var4.b() == i4 && !x0Var4.f() && (u0Var.f2925g || !x0Var4.h())) {
                        x0Var4.a(32);
                        break;
                    }
                    i8++;
                }
            }
            if (x0Var4 != null) {
                if (x0Var4.h()) {
                    z12 = u0Var.f2925g;
                } else {
                    int i11 = x0Var4.f2947c;
                    if (i11 < 0 || i11 >= recyclerView.f930q.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + x0Var4 + recyclerView.y());
                    }
                    if (u0Var.f2925g || recyclerView.f930q.c(x0Var4.f2947c) == x0Var4.f) {
                        b0 b0Var2 = recyclerView.f930q;
                        if (!b0Var2.f2735b || x0Var4.f2949e == b0Var2.b(x0Var4.f2947c)) {
                            z12 = z4;
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = false;
                    }
                }
                if (z12) {
                    x0VarE = x0Var4;
                    z5 = z4;
                } else {
                    x0Var4.a(4);
                    if (x0Var4.i()) {
                        recyclerView.removeDetachedView(x0Var4.f2945a, false);
                        x0Var4.n.n(x0Var4);
                    } else if (x0Var4.p()) {
                        x0Var4.f2953j &= -33;
                    }
                    j(x0Var4);
                    x0VarE = x0Var;
                }
            } else {
                x0VarE = x0Var4;
            }
        }
        if (x0VarE == null) {
            int iG2 = recyclerView.f916i.g(i4, 0);
            if (iG2 >= 0) {
                j5 = 3;
                if (iG2 < recyclerView.f930q.a()) {
                    int iC = recyclerView.f930q.c(iG2);
                    b0 b0Var3 = recyclerView.f930q;
                    j6 = 4;
                    if (b0Var3.f2735b) {
                        long jB2 = b0Var3.b(iG2);
                        int size5 = arrayList2.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                i5 = iG2;
                                int size6 = arrayList3.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        x0 x0Var6 = (x0) arrayList3.get(size6);
                                        if (x0Var6.f2949e != jB2 || x0Var6.d()) {
                                            size6--;
                                        } else {
                                            if (iC == x0Var6.f) {
                                                arrayList3.remove(size6);
                                                x0Var3 = x0Var6;
                                                break;
                                            }
                                            h(size6);
                                        }
                                    }
                                    x0Var3 = null;
                                    break;
                                }
                            }
                            x0Var3 = (x0) arrayList2.get(size5);
                            i5 = iG2;
                            long j8 = x0Var3.f2949e;
                            View view2 = x0Var3.f2945a;
                            if (j8 == jB2 && !x0Var3.p()) {
                                if (iC == x0Var3.f) {
                                    x0Var3.a(32);
                                    if (!x0Var3.h() || u0Var.f2925g) {
                                        break;
                                        break;
                                    }
                                    x0Var3.f2953j = (x0Var3.f2953j & (-15)) | 2;
                                    break;
                                }
                                arrayList2.remove(size5);
                                recyclerView.removeDetachedView(view2, false);
                                x0 x0VarI3 = RecyclerView.I(view2);
                                x0VarI3.n = null;
                                x0VarI3.f2957o = false;
                                x0VarI3.f2953j &= -33;
                                j(x0VarI3);
                            }
                            size5--;
                            iG2 = i5;
                        }
                        if (x0Var3 != null) {
                            x0Var3.f2947c = i5;
                            x0VarE = x0Var3;
                            z5 = z4;
                        } else {
                            x0VarE = x0Var3;
                        }
                    }
                    if (x0VarE == null) {
                        k1.p0 p0Var = (k1.p0) e().f2878a.get(iC);
                        if (p0Var == null) {
                            x0Var2 = null;
                            break;
                        }
                        ArrayList arrayList6 = p0Var.f2866a;
                        if (!arrayList6.isEmpty()) {
                            int size7 = arrayList6.size() - 1;
                            while (true) {
                                if (size7 < 0) {
                                    x0Var2 = null;
                                    break;
                                }
                                if (!((x0) arrayList6.get(size7)).d()) {
                                    x0Var2 = (x0) arrayList6.remove(size7);
                                    break;
                                }
                                size7--;
                            }
                        } else {
                            x0Var2 = null;
                            break;
                        }
                        if (x0Var2 != null) {
                            x0Var2.m();
                            int[] iArr = RecyclerView.D0;
                        }
                        x0VarE = x0Var2;
                    }
                    if (x0VarE == null) {
                        long nanoTime2 = recyclerView.getNanoTime();
                        if (j4 != Long.MAX_VALUE) {
                            long j9 = ((q0) this.f4291g).a(iC).f2868c;
                            if (!((j9 == 0 || j9 + nanoTime2 < j4) ? z4 : false)) {
                                return null;
                            }
                        }
                        b0 b0Var4 = recyclerView.f930q;
                        b0Var4.getClass();
                        try {
                            int i12 = k0.i.f2724a;
                            Trace.beginSection("RV CreateView");
                            x0VarE = b0Var4.e(recyclerView, iC);
                            if (x0VarE.f2945a.getParent() != null) {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            x0VarE.f = iC;
                            Trace.endSection();
                            int[] iArr2 = RecyclerView.D0;
                            RecyclerView recyclerViewD = RecyclerView.D(x0VarE.f2945a);
                            if (recyclerViewD != null) {
                                x0VarE.f2946b = new WeakReference(recyclerViewD);
                            }
                            long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                            k1.p0 p0VarA = ((q0) this.f4291g).a(iC);
                            long j10 = p0VarA.f2868c;
                            if (j10 != 0) {
                                nanoTime3 = (nanoTime3 / 4) + ((j10 / 4) * 3);
                            }
                            p0VarA.f2868c = nanoTime3;
                        } catch (Throwable th) {
                            int i13 = k0.i.f2724a;
                            Trace.endSection();
                            throw th;
                        }
                    }
                }
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i4 + "(offset:" + iG2 + ").state:" + u0Var.b() + recyclerView.y());
        }
        j5 = 3;
        j6 = 4;
        View view3 = x0VarE.f2945a;
        if (z5 && !u0Var.f2925g) {
            int i14 = x0VarE.f2953j;
            if ((i14 & 8192) != 0 ? z4 : false) {
                x0VarE.f2953j = i14 & (-8193);
                if (u0Var.f2928j) {
                    h0.b(x0VarE);
                    h0 h0Var = recyclerView.P;
                    x0VarE.c();
                    h0Var.getClass();
                    g0 g0Var = new g0();
                    g0Var.a(x0VarE);
                    recyclerView.V(x0VarE, g0Var);
                }
            }
        }
        if (!u0Var.f2925g || !x0VarE.e()) {
            if (x0VarE.e()) {
                if (((x0VarE.f2953j & 2) != 0 ? z4 : false) || x0VarE.f()) {
                }
                layoutParams2 = view3.getLayoutParams();
                if (layoutParams2 == null) {
                    m0Var = (m0) recyclerView.generateDefaultLayoutParams();
                    view3.setLayoutParams(m0Var);
                } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                    m0Var = (m0) layoutParams2;
                } else {
                    m0Var = (m0) recyclerView.generateLayoutParams(layoutParams2);
                    view3.setLayoutParams(m0Var);
                }
                m0Var.f2851a = x0VarE;
                if (z5 || !z10) {
                    z11 = z6;
                } else {
                    z11 = z9;
                }
                m0Var.f2854d = z11;
                return x0VarE;
            }
            z6 = false;
            int iG3 = recyclerView.f916i.g(i4, 0);
            x0VarE.f2961s = null;
            x0VarE.f2960r = recyclerView;
            int i15 = x0VarE.f;
            long nanoTime4 = recyclerView.getNanoTime();
            if (j4 != Long.MAX_VALUE) {
                long j11 = ((q0) this.f4291g).a(i15).f2869d;
                if (j11 == 0 || j11 + nanoTime4 < j4) {
                    b0Var = recyclerView.f930q;
                    b0Var.getClass();
                    if (x0VarE.f2961s == null) {
                        z7 = z4;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        x0VarE.f2947c = iG3;
                        if (b0Var.f2735b) {
                            x0VarE.f2949e = b0Var.b(iG3);
                        }
                        x0VarE.f2953j = (x0VarE.f2953j & (-520)) | 1;
                        int i16 = k0.i.f2724a;
                        Trace.beginSection("RV OnBindView");
                    }
                    x0VarE.f2961s = b0Var;
                    x0VarE.c();
                    b0Var.d(x0VarE, iG3);
                    if (z7) {
                        arrayList = x0VarE.f2954k;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        x0VarE.f2953j &= -1025;
                        layoutParams = view3.getLayoutParams();
                        if (layoutParams instanceof m0) {
                            ((m0) layoutParams).f2853c = z4;
                        }
                        int i17 = k0.i.f2724a;
                        Trace.endSection();
                    }
                    nanoTime = recyclerView.getNanoTime() - nanoTime4;
                    k1.p0 p0VarA2 = ((q0) this.f4291g).a(x0VarE.f);
                    j7 = p0VarA2.f2869d;
                    if (j7 != 0) {
                        nanoTime = (nanoTime / j6) + ((j7 / j6) * j5);
                    }
                    p0VarA2.f2869d = nanoTime;
                    accessibilityManager = recyclerView.F;
                    if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        WeakHashMap weakHashMap = p0.f3233a;
                        z9 = true;
                        if (view3.getImportantForAccessibility() == 0) {
                            view3.setImportantForAccessibility(1);
                        }
                        z0Var = recyclerView.f933r0;
                        if (z0Var != null) {
                            y0Var = z0Var.f2967e;
                            if (y0Var != null) {
                                accessibilityDelegateD = p0.d(view3);
                                if (accessibilityDelegateD == null) {
                                    bVar = null;
                                } else if (accessibilityDelegateD instanceof p0.a) {
                                    bVar = ((p0.a) accessibilityDelegateD).f3160a;
                                } else {
                                    bVar = new p0.b(accessibilityDelegateD);
                                }
                                if (bVar != null && bVar != y0Var) {
                                    y0Var.f2964e.put(view3, bVar);
                                }
                            }
                            p0.m(view3, y0Var);
                        }
                    } else {
                        z9 = true;
                    }
                    if (u0Var.f2925g) {
                        x0VarE.f2950g = i4;
                    }
                    z10 = z9;
                } else {
                    z10 = false;
                    z9 = z4;
                }
            } else {
                b0Var = recyclerView.f930q;
                b0Var.getClass();
                if (x0VarE.f2961s == null) {
                    z7 = z4;
                } else {
                    z7 = false;
                }
                if (z7) {
                    x0VarE.f2947c = iG3;
                    if (b0Var.f2735b) {
                        x0VarE.f2949e = b0Var.b(iG3);
                    }
                    x0VarE.f2953j = (x0VarE.f2953j & (-520)) | 1;
                    int i18 = k0.i.f2724a;
                    Trace.beginSection("RV OnBindView");
                }
                x0VarE.f2961s = b0Var;
                x0VarE.c();
                b0Var.d(x0VarE, iG3);
                if (z7) {
                    arrayList = x0VarE.f2954k;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    x0VarE.f2953j &= -1025;
                    layoutParams = view3.getLayoutParams();
                    if (layoutParams instanceof m0) {
                        ((m0) layoutParams).f2853c = z4;
                    }
                    int i19 = k0.i.f2724a;
                    Trace.endSection();
                }
                nanoTime = recyclerView.getNanoTime() - nanoTime4;
                k1.p0 p0VarA3 = ((q0) this.f4291g).a(x0VarE.f);
                j7 = p0VarA3.f2869d;
                if (j7 != 0) {
                    nanoTime = (nanoTime / j6) + ((j7 / j6) * j5);
                }
                p0VarA3.f2869d = nanoTime;
                accessibilityManager = recyclerView.F;
                if (accessibilityManager == null) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z8) {
                    WeakHashMap weakHashMap2 = p0.f3233a;
                    z9 = true;
                    if (view3.getImportantForAccessibility() == 0) {
                        view3.setImportantForAccessibility(1);
                    }
                    z0Var = recyclerView.f933r0;
                    if (z0Var != null) {
                        y0Var = z0Var.f2967e;
                        if (y0Var != null) {
                            accessibilityDelegateD = p0.d(view3);
                            if (accessibilityDelegateD == null) {
                                bVar = null;
                            } else if (accessibilityDelegateD instanceof p0.a) {
                                bVar = ((p0.a) accessibilityDelegateD).f3160a;
                            } else {
                                bVar = new p0.b(accessibilityDelegateD);
                            }
                            if (bVar != null) {
                                y0Var.f2964e.put(view3, bVar);
                            }
                        }
                        p0.m(view3, y0Var);
                    }
                } else {
                    z9 = true;
                }
                if (u0Var.f2925g) {
                    x0VarE.f2950g = i4;
                }
                z10 = z9;
            }
            layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 == null) {
                m0Var = (m0) recyclerView.generateDefaultLayoutParams();
                view3.setLayoutParams(m0Var);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                m0Var = (m0) recyclerView.generateLayoutParams(layoutParams2);
                view3.setLayoutParams(m0Var);
            } else {
                m0Var = (m0) layoutParams2;
            }
            m0Var.f2851a = x0VarE;
            if (z5) {
                z11 = z6;
            } else {
                z11 = z6;
            }
            m0Var.f2854d = z11;
            return x0VarE;
        }
        x0VarE.f2950g = i4;
        z9 = z4;
        z10 = false;
        z6 = false;
        layoutParams2 = view3.getLayoutParams();
        if (layoutParams2 == null) {
            m0Var = (m0) recyclerView.generateDefaultLayoutParams();
            view3.setLayoutParams(m0Var);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            m0Var = (m0) recyclerView.generateLayoutParams(layoutParams2);
            view3.setLayoutParams(m0Var);
        } else {
            m0Var = (m0) layoutParams2;
        }
        m0Var.f2851a = x0VarE;
        if (z5) {
            z11 = z6;
        } else {
            z11 = z6;
        }
        m0Var.f2854d = z11;
        return x0VarE;
    }

    public void n(x0 x0Var) {
        if (x0Var.f2957o) {
            ((ArrayList) this.f4289d).remove(x0Var);
        } else {
            ((ArrayList) this.f4288c).remove(x0Var);
        }
        x0Var.n = null;
        x0Var.f2957o = false;
        x0Var.f2953j &= -33;
    }

    public void o() {
        ArrayList arrayList = (ArrayList) this.f4290e;
        l0 l0Var = ((RecyclerView) this.f4292h).f932r;
        this.f4287b = this.f4286a + (l0Var != null ? l0Var.f2845j : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f4287b; size--) {
            h(size);
        }
    }

    public b(RecyclerView recyclerView) {
        this.f4292h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f4288c = arrayList;
        this.f4289d = null;
        this.f4290e = new ArrayList();
        this.f = Collections.unmodifiableList(arrayList);
        this.f4286a = 2;
        this.f4287b = 2;
    }
}
