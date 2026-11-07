package k1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2729a;

    public /* synthetic */ a0(RecyclerView recyclerView) {
        this.f2729a = recyclerView;
    }

    public void a(a aVar) {
        int i4 = aVar.f2725a;
        RecyclerView recyclerView = this.f2729a;
        if (i4 == 1) {
            recyclerView.f932r.X(aVar.f2726b, aVar.f2728d);
            return;
        }
        if (i4 == 2) {
            recyclerView.f932r.a0(aVar.f2726b, aVar.f2728d);
        } else if (i4 == 4) {
            recyclerView.f932r.b0(aVar.f2726b, aVar.f2728d);
        } else {
            if (i4 != 8) {
                return;
            }
            recyclerView.f932r.Z(aVar.f2726b, aVar.f2728d);
        }
    }

    public x0 b(int i4) {
        RecyclerView recyclerView = this.f2729a;
        int iN = recyclerView.f918j.n();
        x0 x0Var = null;
        for (int i5 = 0; i5 < iN; i5++) {
            x0 x0VarI = RecyclerView.I(recyclerView.f918j.m(i5));
            if (x0VarI != null && !x0VarI.h() && x0VarI.f2947c == i4) {
                if (!((ArrayList) recyclerView.f918j.f580d).contains(x0VarI.f2945a)) {
                    x0Var = x0VarI;
                    break;
                }
                x0Var = x0VarI;
            }
        }
        if (x0Var != null) {
            if (!((ArrayList) recyclerView.f918j.f580d).contains(x0Var.f2945a)) {
                return x0Var;
            }
        }
        return null;
    }

    public void c(int i4, int i5, Object obj) {
        int i6;
        int i7;
        RecyclerView recyclerView = this.f2729a;
        int iN = recyclerView.f918j.n();
        int i8 = i5 + i4;
        for (int i9 = 0; i9 < iN; i9++) {
            View viewM = recyclerView.f918j.m(i9);
            x0 x0VarI = RecyclerView.I(viewM);
            if (x0VarI != null && !x0VarI.o() && (i7 = x0VarI.f2947c) >= i4 && i7 < i8) {
                x0VarI.a(2);
                if (obj == null) {
                    x0VarI.a(1024);
                } else if ((1024 & x0VarI.f2953j) == 0) {
                    if (x0VarI.f2954k == null) {
                        ArrayList arrayList = new ArrayList();
                        x0VarI.f2954k = arrayList;
                        x0VarI.f2955l = Collections.unmodifiableList(arrayList);
                    }
                    x0VarI.f2954k.add(obj);
                }
                ((m0) viewM.getLayoutParams()).f2853c = true;
            }
        }
        v1.b bVar = recyclerView.f913g;
        ArrayList arrayList2 = (ArrayList) bVar.f4290e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            x0 x0Var = (x0) arrayList2.get(size);
            if (x0Var != null && (i6 = x0Var.f2947c) >= i4 && i6 < i8) {
                x0Var.a(2);
                bVar.h(size);
            }
        }
        recyclerView.f927o0 = true;
    }

    public void d(int i4, int i5) {
        RecyclerView recyclerView = this.f2729a;
        int iN = recyclerView.f918j.n();
        for (int i6 = 0; i6 < iN; i6++) {
            x0 x0VarI = RecyclerView.I(recyclerView.f918j.m(i6));
            if (x0VarI != null && !x0VarI.o() && x0VarI.f2947c >= i4) {
                x0VarI.l(i5, false);
                recyclerView.f920k0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f913g.f4290e;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            x0 x0Var = (x0) arrayList.get(i7);
            if (x0Var != null && x0Var.f2947c >= i4) {
                x0Var.l(i5, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f925n0 = true;
    }

    public void e(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        RecyclerView recyclerView = this.f2729a;
        int iN = recyclerView.f918j.n();
        int i13 = -1;
        if (i4 < i5) {
            i7 = i4;
            i6 = i5;
            i8 = -1;
        } else {
            i6 = i4;
            i7 = i5;
            i8 = 1;
        }
        for (int i14 = 0; i14 < iN; i14++) {
            x0 x0VarI = RecyclerView.I(recyclerView.f918j.m(i14));
            if (x0VarI != null && (i12 = x0VarI.f2947c) >= i7 && i12 <= i6) {
                if (i12 == i4) {
                    x0VarI.l(i5 - i4, false);
                } else {
                    x0VarI.l(i8, false);
                }
                recyclerView.f920k0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f913g.f4290e;
        if (i4 < i5) {
            i10 = i4;
            i9 = i5;
        } else {
            i9 = i4;
            i10 = i5;
            i13 = 1;
        }
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            x0 x0Var = (x0) arrayList.get(i15);
            if (x0Var != null && (i11 = x0Var.f2947c) >= i10 && i11 <= i9) {
                if (i11 == i4) {
                    x0Var.l(i5 - i4, false);
                } else {
                    x0Var.l(i13, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f925n0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public void f(x0 x0Var, g0 g0Var, g0 g0Var2) {
        boolean zG;
        x0Var.n(false);
        RecyclerView recyclerView = this.f2729a;
        i iVar = (i) recyclerView.P;
        if (g0Var != null) {
            iVar.getClass();
            int i4 = g0Var.f2780a;
            int i5 = g0Var2.f2780a;
            if (i4 == i5 && g0Var.f2781b == g0Var2.f2781b) {
                iVar.l(x0Var);
                x0Var.f2945a.setAlpha(0.0f);
                iVar.f2795i.add(x0Var);
                zG = true;
            } else {
                zG = iVar.g(x0Var, i4, g0Var.f2781b, i5, g0Var2.f2781b);
            }
        } else {
            iVar.l(x0Var);
            x0Var.f2945a.setAlpha(0.0f);
            iVar.f2795i.add(x0Var);
            zG = true;
        }
        if (zG) {
            recyclerView.S();
        }
    }

    public void g(x0 x0Var, g0 g0Var, g0 g0Var2) {
        boolean zG;
        RecyclerView recyclerView = this.f2729a;
        recyclerView.f913g.n(x0Var);
        recyclerView.f(x0Var);
        x0Var.n(false);
        i iVar = (i) recyclerView.P;
        iVar.getClass();
        int i4 = g0Var.f2780a;
        int i5 = g0Var.f2781b;
        View view = x0Var.f2945a;
        int left = g0Var2 == null ? view.getLeft() : g0Var2.f2780a;
        int top = g0Var2 == null ? view.getTop() : g0Var2.f2781b;
        if (x0Var.h() || (i4 == left && i5 == top)) {
            iVar.l(x0Var);
            iVar.f2794h.add(x0Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = iVar.g(x0Var, i4, i5, left, top);
        }
        if (zG) {
            recyclerView.S();
        }
    }

    public void h(int i4) {
        RecyclerView recyclerView = this.f2729a;
        View childAt = recyclerView.getChildAt(i4);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i4);
    }
}
