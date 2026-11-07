package p1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.k1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class m extends k1 {
    @Override // androidx.fragment.app.k1
    public final void a(View view, Object obj) {
        ((r) obj).b(view);
    }

    @Override // androidx.fragment.app.k1
    public final void b(Object obj, ArrayList arrayList) {
        r rVar = (r) obj;
        if (rVar == null) {
            return;
        }
        int i4 = 0;
        if (rVar instanceof x) {
            x xVar = (x) rVar;
            int size = xVar.H.size();
            while (i4 < size) {
                b((i4 < 0 || i4 >= xVar.H.size()) ? null : (r) xVar.H.get(i4), arrayList);
                i4++;
            }
            return;
        }
        if (k1.h(rVar.f3331j) && k1.h(rVar.f3332k)) {
            int size2 = arrayList.size();
            while (i4 < size2) {
                rVar.b((View) arrayList.get(i4));
                i4++;
            }
        }
    }

    @Override // androidx.fragment.app.k1
    public final void c(ViewGroup viewGroup, Object obj) {
        v.a(viewGroup, (r) obj);
    }

    @Override // androidx.fragment.app.k1
    public final boolean e(Object obj) {
        return obj instanceof r;
    }

    @Override // androidx.fragment.app.k1
    public final Object f(Object obj) {
        if (obj != null) {
            return ((r) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.k1
    public final Object i(Object obj, Object obj2, Object obj3) {
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        r rVar3 = (r) obj3;
        if (rVar != null && rVar2 != null) {
            x xVar = new x();
            xVar.L(rVar);
            xVar.L(rVar2);
            xVar.O(1);
            rVar = xVar;
        } else if (rVar == null) {
            rVar = rVar2 != null ? rVar2 : null;
        }
        if (rVar3 == null) {
            return rVar;
        }
        x xVar2 = new x();
        if (rVar != null) {
            xVar2.L(rVar);
        }
        xVar2.L(rVar3);
        return xVar2;
    }

    @Override // androidx.fragment.app.k1
    public final Object j(Object obj, Object obj2) {
        x xVar = new x();
        if (obj != null) {
            xVar.L((r) obj);
        }
        xVar.L((r) obj2);
        return xVar;
    }

    @Override // androidx.fragment.app.k1
    public final void k(Object obj, View view, ArrayList arrayList) {
        ((r) obj).a(new j(view, arrayList));
    }

    @Override // androidx.fragment.app.k1
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((r) obj).a(new k(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.k1
    public final void m(View view, Object obj) {
        if (view != null) {
            k1.g(view, new Rect());
            ((r) obj).E(new i());
        }
    }

    @Override // androidx.fragment.app.k1
    public final void n(Object obj, Rect rect) {
        ((r) obj).E(new i());
    }

    @Override // androidx.fragment.app.k1
    public final void o(Object obj, k0.e eVar, androidx.fragment.app.c cVar) {
        r rVar = (r) obj;
        eVar.a(new h(rVar, cVar));
        rVar.a(new l(cVar));
    }

    @Override // androidx.fragment.app.k1
    public final void p(Object obj, View view, ArrayList arrayList) {
        x xVar = (x) obj;
        ArrayList arrayList2 = xVar.f3332k;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            k1.d(arrayList2, (View) arrayList.get(i4));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(xVar, arrayList);
    }

    @Override // androidx.fragment.app.k1
    public final void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        x xVar = (x) obj;
        if (xVar != null) {
            ArrayList arrayList3 = xVar.f3332k;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(xVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.k1
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        x xVar = new x();
        xVar.L((r) obj);
        return xVar;
    }

    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        r rVar = (r) obj;
        int i4 = 0;
        if (rVar instanceof x) {
            x xVar = (x) rVar;
            int size = xVar.H.size();
            while (i4 < size) {
                s((i4 < 0 || i4 >= xVar.H.size()) ? null : (r) xVar.H.get(i4), arrayList, arrayList2);
                i4++;
            }
            return;
        }
        if (k1.h(rVar.f3331j)) {
            ArrayList arrayList3 = rVar.f3332k;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i4 < size2) {
                    rVar.b((View) arrayList2.get(i4));
                    i4++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    rVar.A((View) arrayList.get(size3));
                }
            }
        }
    }
}
