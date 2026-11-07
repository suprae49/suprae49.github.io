package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2597e;
    public Object f;

    public o(k1.a0 a0Var) {
        this.f2594b = new o0.c(30);
        this.f2595c = new ArrayList();
        this.f2596d = new ArrayList();
        this.f2593a = 0;
        this.f2597e = a0Var;
        this.f = new a3.h0(20, this);
    }

    public void a() {
        View view = (View) this.f2594b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((b3) this.f2596d) != null) {
                if (((b3) this.f) == null) {
                    this.f = new b3();
                }
                b3 b3Var = (b3) this.f;
                b3Var.f2490a = null;
                b3Var.f2493d = false;
                b3Var.f2491b = null;
                b3Var.f2492c = false;
                WeakHashMap weakHashMap = p0.p0.f3233a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    b3Var.f2493d = true;
                    b3Var.f2490a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    b3Var.f2492c = true;
                    b3Var.f2491b = backgroundTintMode;
                }
                if (b3Var.f2493d || b3Var.f2492c) {
                    u.e(background, b3Var, view.getDrawableState());
                    return;
                }
            }
            b3 b3Var2 = (b3) this.f2597e;
            if (b3Var2 != null) {
                u.e(background, b3Var2, view.getDrawableState());
                return;
            }
            b3 b3Var3 = (b3) this.f2596d;
            if (b3Var3 != null) {
                u.e(background, b3Var3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i4) {
        ArrayList arrayList = (ArrayList) this.f2596d;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            k1.a aVar = (k1.a) arrayList.get(i5);
            int i6 = aVar.f2725a;
            if (i6 != 8) {
                if (i6 == 1) {
                    int i7 = aVar.f2726b;
                    int i8 = aVar.f2728d + i7;
                    while (i7 < i8) {
                        if (g(i7, i5 + 1) == i4) {
                            return true;
                        }
                        i7++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(aVar.f2728d, i5 + 1) == i4) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f2596d;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((k1.a0) this.f2597e).a((k1.a) arrayList.get(i4));
        }
        q(arrayList);
        this.f2593a = 0;
    }

    public void d() {
        k1.a0 a0Var = (k1.a0) this.f2597e;
        c();
        ArrayList arrayList = (ArrayList) this.f2595c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            k1.a aVar = (k1.a) arrayList.get(i4);
            int i5 = aVar.f2725a;
            if (i5 == 1) {
                a0Var.a(aVar);
                a0Var.d(aVar.f2726b, aVar.f2728d);
            } else if (i5 == 2) {
                a0Var.a(aVar);
                int i6 = aVar.f2726b;
                int i7 = aVar.f2728d;
                RecyclerView recyclerView = a0Var.f2729a;
                recyclerView.O(i6, true, i7);
                recyclerView.f925n0 = true;
                recyclerView.f920k0.f2922c += i7;
            } else if (i5 == 4) {
                a0Var.a(aVar);
                a0Var.c(aVar.f2726b, aVar.f2728d, aVar.f2727c);
            } else if (i5 == 8) {
                a0Var.a(aVar);
                a0Var.e(aVar.f2726b, aVar.f2728d);
            }
        }
        q(arrayList);
        this.f2593a = 0;
    }

    public void e(k1.a aVar) {
        int i4;
        o0.c cVar = (o0.c) this.f2594b;
        int i5 = aVar.f2725a;
        if (i5 == 1 || i5 == 8) {
            androidx.fragment.app.q.q("should not dispatch add or move for pre layout");
            return;
        }
        int iU = u(aVar.f2726b, i5);
        int i6 = aVar.f2726b;
        int i7 = aVar.f2725a;
        if (i7 == 2) {
            i4 = 0;
        } else {
            if (i7 != 4) {
                androidx.fragment.app.q.p(aVar, "op should be remove or update.");
                return;
            }
            i4 = 1;
        }
        int i8 = 1;
        for (int i9 = 1; i9 < aVar.f2728d; i9++) {
            int iU2 = u((i4 * i9) + aVar.f2726b, aVar.f2725a);
            int i10 = aVar.f2725a;
            if (i10 == 2 ? iU2 != iU : !(i10 == 4 && iU2 == iU + 1)) {
                k1.a aVarL = l(aVar.f2727c, i10, iU, i8);
                f(aVarL, i6);
                aVarL.f2727c = null;
                cVar.c(aVarL);
                if (aVar.f2725a == 4) {
                    i6 += i8;
                }
                i8 = 1;
                iU = iU2;
            } else {
                i8++;
            }
        }
        Object obj = aVar.f2727c;
        aVar.f2727c = null;
        cVar.c(aVar);
        if (i8 > 0) {
            k1.a aVarL2 = l(obj, aVar.f2725a, iU, i8);
            f(aVarL2, i6);
            aVarL2.f2727c = null;
            cVar.c(aVarL2);
        }
    }

    public void f(k1.a aVar, int i4) {
        k1.a0 a0Var = (k1.a0) this.f2597e;
        a0Var.a(aVar);
        int i5 = aVar.f2725a;
        if (i5 != 2) {
            if (i5 == 4) {
                a0Var.c(i4, aVar.f2728d, aVar.f2727c);
                return;
            } else {
                androidx.fragment.app.q.q("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i6 = aVar.f2728d;
        RecyclerView recyclerView = a0Var.f2729a;
        recyclerView.O(i4, true, i6);
        recyclerView.f925n0 = true;
        recyclerView.f920k0.f2922c += i6;
    }

    public int g(int i4, int i5) {
        ArrayList arrayList = (ArrayList) this.f2596d;
        int size = arrayList.size();
        while (i5 < size) {
            k1.a aVar = (k1.a) arrayList.get(i5);
            int i6 = aVar.f2725a;
            int i7 = aVar.f2726b;
            if (i6 == 8) {
                if (i7 == i4) {
                    i4 = aVar.f2728d;
                } else {
                    if (i7 < i4) {
                        i4--;
                    }
                    if (aVar.f2728d <= i4) {
                        i4++;
                    }
                }
            } else if (i7 > i4) {
                continue;
            } else if (i6 == 2) {
                int i8 = aVar.f2728d;
                if (i4 < i7 + i8) {
                    return -1;
                }
                i4 -= i8;
            } else if (i6 == 1) {
                i4 += aVar.f2728d;
            }
            i5++;
        }
        return i4;
    }

    public ColorStateList h() {
        b3 b3Var = (b3) this.f2597e;
        if (b3Var != null) {
            return b3Var.f2490a;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        b3 b3Var = (b3) this.f2597e;
        if (b3Var != null) {
            return b3Var.f2491b;
        }
        return null;
    }

    public boolean j() {
        return ((ArrayList) this.f2595c).size() > 0;
    }

    public void k(AttributeSet attributeSet, int i4) {
        ColorStateList colorStateListF;
        View view = (View) this.f2594b;
        Context context = view.getContext();
        int[] iArr = d.a.B;
        androidx.emoji2.text.t tVarS = androidx.emoji2.text.t.s(i4, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) tVarS.f579c;
        View view2 = (View) this.f2594b;
        p0.p0.l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) tVarS.f579c, i4);
        try {
            if (typedArray.hasValue(0)) {
                this.f2593a = typedArray.getResourceId(0, -1);
                u uVar = (u) this.f2595c;
                Context context2 = view.getContext();
                int i5 = this.f2593a;
                synchronized (uVar) {
                    colorStateListF = uVar.f2645a.f(context2, i5);
                }
                if (colorStateListF != null) {
                    r(colorStateListF);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(tVarS.h(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(j1.c(typedArray.getInt(2, -1), null));
            }
            tVarS.v();
        } catch (Throwable th) {
            tVarS.v();
            throw th;
        }
    }

    public k1.a l(Object obj, int i4, int i5, int i6) {
        k1.a aVar = (k1.a) ((o0.c) this.f2594b).a();
        if (aVar != null) {
            aVar.f2725a = i4;
            aVar.f2726b = i5;
            aVar.f2728d = i6;
            aVar.f2727c = obj;
            return aVar;
        }
        k1.a aVar2 = new k1.a();
        aVar2.f2725a = i4;
        aVar2.f2726b = i5;
        aVar2.f2728d = i6;
        aVar2.f2727c = obj;
        return aVar2;
    }

    public void m() {
        this.f2593a = -1;
        r(null);
        a();
    }

    public void n(int i4) {
        ColorStateList colorStateListF;
        this.f2593a = i4;
        u uVar = (u) this.f2595c;
        if (uVar != null) {
            Context context = ((View) this.f2594b).getContext();
            synchronized (uVar) {
                colorStateListF = uVar.f2645a.f(context, i4);
            }
        } else {
            colorStateListF = null;
        }
        r(colorStateListF);
        a();
    }

    public void o(k1.a aVar) {
        k1.a0 a0Var = (k1.a0) this.f2597e;
        ((ArrayList) this.f2596d).add(aVar);
        int i4 = aVar.f2725a;
        if (i4 == 1) {
            a0Var.d(aVar.f2726b, aVar.f2728d);
            return;
        }
        if (i4 == 2) {
            int i5 = aVar.f2726b;
            int i6 = aVar.f2728d;
            RecyclerView recyclerView = a0Var.f2729a;
            recyclerView.O(i5, false, i6);
            recyclerView.f925n0 = true;
            return;
        }
        if (i4 == 4) {
            a0Var.c(aVar.f2726b, aVar.f2728d, aVar.f2727c);
        } else if (i4 == 8) {
            a0Var.e(aVar.f2726b, aVar.f2728d);
        } else {
            androidx.fragment.app.q.p(aVar, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018c  */
    /* JADX WARN: Code duplicated, block: B:103:0x019a  */
    /* JADX WARN: Code duplicated, block: B:104:0x019e  */
    /* JADX WARN: Code duplicated, block: B:186:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:75:0x0134  */
    /* JADX WARN: Code duplicated, block: B:76:0x0136  */
    /* JADX WARN: Code duplicated, block: B:78:0x013c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0147  */
    /* JADX WARN: Code duplicated, block: B:84:0x0152  */
    /* JADX WARN: Code duplicated, block: B:87:0x015d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:89:0x0165  */
    /* JADX WARN: Code duplicated, block: B:91:0x016b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0176  */
    /* JADX WARN: Code duplicated, block: B:97:0x0181  */
    public void p() {
        boolean z4;
        byte b5;
        k1.a aVarL;
        int i4;
        int i5;
        int i6;
        k1.a aVarL2;
        boolean z5;
        boolean z6;
        Object obj;
        k1.a aVar;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        o0.c cVar = (o0.c) this.f2594b;
        k1.a0 a0Var = (k1.a0) this.f2597e;
        a3.h0 h0Var = (a3.h0) this.f;
        ArrayList arrayList = (ArrayList) this.f2595c;
        h0Var.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z7 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((k1.a) arrayList.get(size)).f2725a == 8) {
                    if (z7) {
                        break;
                    }
                } else {
                    z7 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i15 = size + 1;
            o oVar = (o) h0Var.f84g;
            o0.c cVar2 = (o0.c) oVar.f2594b;
            k1.a aVar2 = (k1.a) arrayList.get(size);
            k1.a aVar3 = (k1.a) arrayList.get(i15);
            int i16 = aVar3.f2725a;
            if (i16 == 1) {
                int i17 = aVar2.f2728d;
                int i18 = aVar3.f2726b;
                int i19 = i17 < i18 ? -1 : 0;
                int i20 = aVar2.f2726b;
                if (i20 < i18) {
                    i19++;
                }
                if (i18 <= i20) {
                    aVar2.f2726b = i20 + aVar3.f2728d;
                }
                int i21 = aVar3.f2726b;
                if (i21 <= i17) {
                    aVar2.f2728d = i17 + aVar3.f2728d;
                }
                aVar3.f2726b = i21 + i19;
                arrayList.set(size, aVar3);
                arrayList.set(i15, aVar2);
            } else if (i16 == 2) {
                int i22 = aVar2.f2726b;
                int i23 = aVar2.f2728d;
                int i24 = aVar3.f2726b;
                if (i22 < i23) {
                    if (i24 == i22 && aVar3.f2728d == i23 - i22) {
                        z5 = false;
                        z6 = true;
                    } else {
                        z5 = false;
                        z6 = false;
                    }
                } else if (i24 == i23 + 1 && aVar3.f2728d == i22 - i23) {
                    z5 = true;
                    z6 = true;
                } else {
                    z5 = true;
                    z6 = false;
                }
                if (i23 < i24) {
                    aVar3.f2726b = i24 - 1;
                } else {
                    int i25 = aVar3.f2728d;
                    if (i23 < i24 + i25) {
                        aVar3.f2728d = i25 - 1;
                        aVar2.f2725a = 2;
                        aVar2.f2728d = 1;
                        if (aVar3.f2728d == 0) {
                            arrayList.remove(i15);
                            aVar3.f2727c = null;
                            cVar2.c(aVar3);
                        }
                    }
                }
                int i26 = aVar2.f2726b;
                int i27 = aVar3.f2726b;
                if (i26 <= i27) {
                    aVar3.f2726b = i27 + 1;
                } else {
                    int i28 = i27 + aVar3.f2728d;
                    if (i26 < i28) {
                        obj = null;
                        k1.a aVarL3 = oVar.l(null, 2, i26 + 1, i28 - i26);
                        aVar3.f2728d = aVar2.f2726b - aVar3.f2726b;
                        aVar = aVarL3;
                    }
                    if (z6) {
                        arrayList.set(size, aVar3);
                        arrayList.remove(i15);
                        aVar2.f2727c = obj;
                        cVar2.c(aVar2);
                    } else {
                        if (z5) {
                            if (aVar != null) {
                                i13 = aVar2.f2726b;
                                if (i13 > aVar.f2726b) {
                                    aVar2.f2726b = i13 - aVar.f2728d;
                                }
                                i14 = aVar2.f2728d;
                                if (i14 > aVar.f2726b) {
                                    aVar2.f2728d = i14 - aVar.f2728d;
                                }
                            }
                            i11 = aVar2.f2726b;
                            if (i11 > aVar3.f2726b) {
                                aVar2.f2726b = i11 - aVar3.f2728d;
                            }
                            i12 = aVar2.f2728d;
                            if (i12 > aVar3.f2726b) {
                                aVar2.f2728d = i12 - aVar3.f2728d;
                            }
                        } else {
                            if (aVar != null) {
                                i9 = aVar2.f2726b;
                                if (i9 >= aVar.f2726b) {
                                    aVar2.f2726b = i9 - aVar.f2728d;
                                }
                                i10 = aVar2.f2728d;
                                if (i10 >= aVar.f2726b) {
                                    aVar2.f2728d = i10 - aVar.f2728d;
                                }
                            }
                            i7 = aVar2.f2726b;
                            if (i7 >= aVar3.f2726b) {
                                aVar2.f2726b = i7 - aVar3.f2728d;
                            }
                            i8 = aVar2.f2728d;
                            if (i8 >= aVar3.f2726b) {
                                aVar2.f2728d = i8 - aVar3.f2728d;
                            }
                        }
                        arrayList.set(size, aVar3);
                        if (aVar2.f2726b != aVar2.f2728d) {
                            arrayList.set(i15, aVar2);
                        } else {
                            arrayList.remove(i15);
                        }
                        if (aVar != null) {
                            arrayList.add(size, aVar);
                        }
                    }
                }
                obj = null;
                aVar = null;
                if (z6) {
                    arrayList.set(size, aVar3);
                    arrayList.remove(i15);
                    aVar2.f2727c = obj;
                    cVar2.c(aVar2);
                } else {
                    if (z5) {
                        if (aVar != null) {
                            i13 = aVar2.f2726b;
                            if (i13 > aVar.f2726b) {
                                aVar2.f2726b = i13 - aVar.f2728d;
                            }
                            i14 = aVar2.f2728d;
                            if (i14 > aVar.f2726b) {
                                aVar2.f2728d = i14 - aVar.f2728d;
                            }
                        }
                        i11 = aVar2.f2726b;
                        if (i11 > aVar3.f2726b) {
                            aVar2.f2726b = i11 - aVar3.f2728d;
                        }
                        i12 = aVar2.f2728d;
                        if (i12 > aVar3.f2726b) {
                            aVar2.f2728d = i12 - aVar3.f2728d;
                        }
                    } else {
                        if (aVar != null) {
                            i9 = aVar2.f2726b;
                            if (i9 >= aVar.f2726b) {
                                aVar2.f2726b = i9 - aVar.f2728d;
                            }
                            i10 = aVar2.f2728d;
                            if (i10 >= aVar.f2726b) {
                                aVar2.f2728d = i10 - aVar.f2728d;
                            }
                        }
                        i7 = aVar2.f2726b;
                        if (i7 >= aVar3.f2726b) {
                            aVar2.f2726b = i7 - aVar3.f2728d;
                        }
                        i8 = aVar2.f2728d;
                        if (i8 >= aVar3.f2726b) {
                            aVar2.f2728d = i8 - aVar3.f2728d;
                        }
                    }
                    arrayList.set(size, aVar3);
                    if (aVar2.f2726b != aVar2.f2728d) {
                        arrayList.set(i15, aVar2);
                    } else {
                        arrayList.remove(i15);
                    }
                    if (aVar != null) {
                        arrayList.add(size, aVar);
                    }
                }
            } else if (i16 == 4) {
                int i29 = aVar2.f2728d;
                int i30 = aVar3.f2726b;
                if (i29 < i30) {
                    aVar3.f2726b = i30 - 1;
                } else {
                    int i31 = aVar3.f2728d;
                    if (i29 < i30 + i31) {
                        aVar3.f2728d = i31 - 1;
                        aVarL = oVar.l(aVar3.f2727c, 4, aVar2.f2726b, 1);
                    }
                    i4 = aVar2.f2726b;
                    i5 = aVar3.f2726b;
                    if (i4 <= i5) {
                        aVar3.f2726b = i5 + 1;
                    } else {
                        i6 = i5 + aVar3.f2728d;
                        if (i4 < i6) {
                            int i32 = i6 - i4;
                            aVarL2 = oVar.l(aVar3.f2727c, 4, i4 + 1, i32);
                            aVar3.f2728d -= i32;
                        }
                        arrayList.set(i15, aVar2);
                        if (aVar3.f2728d > 0) {
                            arrayList.set(size, aVar3);
                        } else {
                            arrayList.remove(size);
                            aVar3.f2727c = null;
                            cVar2.c(aVar3);
                        }
                        if (aVarL != null) {
                            arrayList.add(size, aVarL);
                        }
                        if (aVarL2 != null) {
                            arrayList.add(size, aVarL2);
                        }
                    }
                    aVarL2 = null;
                    arrayList.set(i15, aVar2);
                    if (aVar3.f2728d > 0) {
                        arrayList.set(size, aVar3);
                    } else {
                        arrayList.remove(size);
                        aVar3.f2727c = null;
                        cVar2.c(aVar3);
                    }
                    if (aVarL != null) {
                        arrayList.add(size, aVarL);
                    }
                    if (aVarL2 != null) {
                        arrayList.add(size, aVarL2);
                    }
                }
                aVarL = null;
                i4 = aVar2.f2726b;
                i5 = aVar3.f2726b;
                if (i4 <= i5) {
                    aVar3.f2726b = i5 + 1;
                } else {
                    i6 = i5 + aVar3.f2728d;
                    if (i4 < i6) {
                        int i33 = i6 - i4;
                        aVarL2 = oVar.l(aVar3.f2727c, 4, i4 + 1, i33);
                        aVar3.f2728d -= i33;
                    }
                    arrayList.set(i15, aVar2);
                    if (aVar3.f2728d > 0) {
                        arrayList.set(size, aVar3);
                    } else {
                        arrayList.remove(size);
                        aVar3.f2727c = null;
                        cVar2.c(aVar3);
                    }
                    if (aVarL != null) {
                        arrayList.add(size, aVarL);
                    }
                    if (aVarL2 != null) {
                        arrayList.add(size, aVarL2);
                    }
                }
                aVarL2 = null;
                arrayList.set(i15, aVar2);
                if (aVar3.f2728d > 0) {
                    arrayList.set(size, aVar3);
                } else {
                    arrayList.remove(size);
                    aVar3.f2727c = null;
                    cVar2.c(aVar3);
                }
                if (aVarL != null) {
                    arrayList.add(size, aVarL);
                }
                if (aVarL2 != null) {
                    arrayList.add(size, aVarL2);
                }
            }
        }
        int size2 = arrayList.size();
        for (int i34 = 0; i34 < size2; i34++) {
            k1.a aVarL4 = (k1.a) arrayList.get(i34);
            int i35 = aVarL4.f2725a;
            if (i35 == 1) {
                o(aVarL4);
            } else if (i35 == 2) {
                int i36 = aVarL4.f2726b;
                int i37 = aVarL4.f2728d + i36;
                int i38 = i36;
                int i39 = 0;
                byte b6 = -1;
                while (i38 < i37) {
                    if (a0Var.b(i38) != null || b(i38)) {
                        if (b6 == 0) {
                            e(l(null, 2, i36, i39));
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        b5 = 1;
                    } else {
                        if (b6 == 1) {
                            o(l(null, 2, i36, i39));
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        b5 = 0;
                    }
                    if (z4) {
                        i38 -= i39;
                        i37 -= i39;
                        i39 = 1;
                    } else {
                        i39++;
                    }
                    i38++;
                    b6 = b5;
                }
                if (i39 != aVarL4.f2728d) {
                    aVarL4.f2727c = null;
                    cVar.c(aVarL4);
                    aVarL4 = l(null, 2, i36, i39);
                }
                if (b6 == 0) {
                    e(aVarL4);
                } else {
                    o(aVarL4);
                }
            } else if (i35 == 4) {
                int i40 = aVarL4.f2726b;
                int i41 = aVarL4.f2728d + i40;
                int i42 = i40;
                int i43 = 0;
                byte b7 = -1;
                while (i40 < i41) {
                    if (a0Var.b(i40) != null || b(i40)) {
                        if (b7 == 0) {
                            e(l(aVarL4.f2727c, 4, i42, i43));
                            i42 = i40;
                            i43 = 0;
                        }
                        b7 = 1;
                    } else {
                        if (b7 == 1) {
                            o(l(aVarL4.f2727c, 4, i42, i43));
                            i42 = i40;
                            i43 = 0;
                        }
                        b7 = 0;
                    }
                    i43++;
                    i40++;
                }
                if (i43 != aVarL4.f2728d) {
                    Object obj2 = aVarL4.f2727c;
                    aVarL4.f2727c = null;
                    cVar.c(aVarL4);
                    aVarL4 = l(obj2, 4, i42, i43);
                }
                if (b7 == 0) {
                    e(aVarL4);
                } else {
                    o(aVarL4);
                }
            } else if (i35 == 8) {
                o(aVarL4);
            }
        }
        arrayList.clear();
    }

    public void q(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            k1.a aVar = (k1.a) arrayList.get(i4);
            aVar.f2727c = null;
            ((o0.c) this.f2594b).c(aVar);
        }
        arrayList.clear();
    }

    public void r(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((b3) this.f2596d) == null) {
                this.f2596d = new b3();
            }
            b3 b3Var = (b3) this.f2596d;
            b3Var.f2490a = colorStateList;
            b3Var.f2493d = true;
        } else {
            this.f2596d = null;
        }
        a();
    }

    public void s(ColorStateList colorStateList) {
        if (((b3) this.f2597e) == null) {
            this.f2597e = new b3();
        }
        b3 b3Var = (b3) this.f2597e;
        b3Var.f2490a = colorStateList;
        b3Var.f2493d = true;
        a();
    }

    public void t(PorterDuff.Mode mode) {
        if (((b3) this.f2597e) == null) {
            this.f2597e = new b3();
        }
        b3 b3Var = (b3) this.f2597e;
        b3Var.f2491b = mode;
        b3Var.f2492c = true;
        a();
    }

    public int u(int i4, int i5) {
        int i6;
        int i7;
        o0.c cVar = (o0.c) this.f2594b;
        ArrayList arrayList = (ArrayList) this.f2596d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k1.a aVar = (k1.a) arrayList.get(size);
            int i8 = aVar.f2725a;
            int i9 = aVar.f2726b;
            if (i8 == 8) {
                int i10 = aVar.f2728d;
                if (i9 < i10) {
                    i7 = i10;
                    i6 = i9;
                } else {
                    i6 = i10;
                    i7 = i9;
                }
                if (i4 < i6 || i4 > i7) {
                    if (i4 < i9) {
                        if (i5 == 1) {
                            aVar.f2726b = i9 + 1;
                            aVar.f2728d = i10 + 1;
                        } else if (i5 == 2) {
                            aVar.f2726b = i9 - 1;
                            aVar.f2728d = i10 - 1;
                        }
                    }
                } else if (i6 == i9) {
                    if (i5 == 1) {
                        aVar.f2728d = i10 + 1;
                    } else if (i5 == 2) {
                        aVar.f2728d = i10 - 1;
                    }
                    i4++;
                } else {
                    if (i5 == 1) {
                        aVar.f2726b = i9 + 1;
                    } else if (i5 == 2) {
                        aVar.f2726b = i9 - 1;
                    }
                    i4--;
                }
            } else if (i9 <= i4) {
                if (i8 == 1) {
                    i4 -= aVar.f2728d;
                } else if (i8 == 2) {
                    i4 += aVar.f2728d;
                }
            } else if (i5 == 1) {
                aVar.f2726b = i9 + 1;
            } else if (i5 == 2) {
                aVar.f2726b = i9 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            k1.a aVar2 = (k1.a) arrayList.get(size2);
            int i11 = aVar2.f2725a;
            int i12 = aVar2.f2728d;
            if (i11 == 8) {
                if (i12 == aVar2.f2726b || i12 < 0) {
                    arrayList.remove(size2);
                    aVar2.f2727c = null;
                    cVar.c(aVar2);
                }
            } else if (i12 <= 0) {
                arrayList.remove(size2);
                aVar2.f2727c = null;
                cVar.c(aVar2);
            }
        }
        return i4;
    }

    public o(View view) {
        this.f2593a = -1;
        this.f2594b = view;
        this.f2595c = u.a();
    }
}
