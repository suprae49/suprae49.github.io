package androidx.emoji2.text;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import co.median.android.MainActivity;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import u1.g0;
import u1.h0;
import u1.o0;
import u1.w0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f591e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f595d;

    public x(Typeface typeface, a1.b bVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        this.f595d = typeface;
        this.f592a = bVar;
        this.f594c = new w(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i8 = iA + bVar.f7a;
            i4 = ((ByteBuffer) bVar.f10d).getInt(((ByteBuffer) bVar.f10d).getInt(i8) + i8);
        } else {
            i4 = 0;
        }
        this.f593b = new char[i4 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i9 = iA2 + bVar.f7a;
            i5 = ((ByteBuffer) bVar.f10d).getInt(((ByteBuffer) bVar.f10d).getInt(i9) + i9);
        } else {
            i5 = 0;
        }
        for (int i10 = 0; i10 < i5; i10++) {
            a0 a0Var = new a0(this, i10);
            a1.a aVarB = a0Var.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f10d).getInt(iA3 + aVarB.f7a) : 0, (char[]) this.f593b, i10 * 2);
            a1.a aVarB2 = a0Var.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i11 = iA4 + aVarB2.f7a;
                i6 = ((ByteBuffer) aVarB2.f10d).getInt(((ByteBuffer) aVarB2.f10d).getInt(i11) + i11);
            } else {
                i6 = 0;
            }
            h0.e("invalid metadata codepoint length", i6 > 0);
            w wVar = (w) this.f594c;
            a1.a aVarB3 = a0Var.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i12 = iA5 + aVarB3.f7a;
                i7 = ((ByteBuffer) aVarB3.f10d).getInt(((ByteBuffer) aVarB3.f10d).getInt(i12) + i12);
            } else {
                i7 = 0;
            }
            wVar.a(a0Var, 0, i7 - 1);
        }
    }

    public void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((p.k) this.f593b).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                a(arrayList2.get(i4), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public i.e b(i.a aVar) {
        ArrayList arrayList = (ArrayList) this.f594c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            i.e eVar = (i.e) arrayList.get(i4);
            if (eVar != null && eVar.f2192b == aVar) {
                return eVar;
            }
        }
        i.e eVar2 = new i.e((Context) this.f593b, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public void c(String str) {
        ArrayList arrayList = (ArrayList) this.f593b;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MainActivity mainActivity = ((w0) it.next()).f4118a;
            int i4 = MainActivity.G0;
            if (TextUtils.isEmpty(str)) {
                g0 g0Var = (g0) ((LinkedHashMap) mainActivity.E().f592a).get(mainActivity.X);
                if (!(g0Var != null ? g0Var.f3931b : false)) {
                    mainActivity.finish();
                    it.remove();
                }
            } else if (str.equals(mainActivity.X)) {
                mainActivity.finish();
                it.remove();
            }
        }
    }

    public boolean d(i.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f592a).onActionItemClicked(b(aVar), new j.t((Context) this.f593b, (h0.a) menuItem));
    }

    public boolean e(i.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f592a;
        i.e eVarB = b(aVar);
        p.k kVar = (p.k) this.f595d;
        Menu b0Var = (Menu) kVar.get(menu);
        if (b0Var == null) {
            b0Var = new j.b0((Context) this.f593b, (j.m) menu);
            kVar.put(menu, b0Var);
        }
        return callback.onCreateActionMode(eVarB, b0Var);
    }

    public void f(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f592a;
        linkedHashMap.remove(str);
        if (((u1.y) this.f594c) == null || linkedHashMap.size() > 1) {
            return;
        }
        u1.y yVar = (u1.y) this.f594c;
        MainActivity mainActivity = (MainActivity) yVar.f4143g;
        String str2 = (String) yVar.f;
        x xVar = (x) yVar.f4144h;
        ((o0) mainActivity.G).loadUrl(str2);
        xVar.f594c = null;
    }

    public x(int i4) {
        switch (i4) {
            case 3:
                this.f595d = null;
                this.f592a = new LinkedHashMap();
                this.f593b = new ArrayList();
                break;
            case 4:
            default:
                this.f592a = new p.f(0);
                this.f593b = new SparseArray();
                this.f594c = new p.h();
                this.f595d = new p.f(0);
                break;
            case 5:
                this.f592a = new o0.c(10);
                this.f593b = new p.k(0);
                this.f594c = new ArrayList();
                this.f595d = new HashSet();
                break;
        }
    }
}
