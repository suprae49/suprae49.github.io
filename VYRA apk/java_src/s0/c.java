package s0;

import android.graphics.RectF;
import androidx.emoji2.text.p;
import androidx.fragment.app.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p0.a1;
import p0.t0;
import p0.y1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3662b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f3663c;

    public c(e eVar) {
        this.f3663c = eVar;
    }

    @Override // p0.t0
    public final void a(a1 a1Var) {
        ArrayList arrayList = this.f3663c.f3666b;
        if ((a1Var.f3162a.d() & 519) != 0) {
            this.f3662b.remove(a1Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i4 = aVar.f3659c;
                boolean z4 = i4 > 0;
                int i5 = i4 - 1;
                aVar.f3659c = i5;
                if (z4 && i5 == 0) {
                    ArrayList arrayList2 = aVar.f3657a;
                    int size2 = arrayList2.size() - 1;
                    if (size2 >= 0) {
                        throw u.i(size2, arrayList2);
                    }
                }
            }
        }
    }

    @Override // p0.t0
    public final void b(a1 a1Var) {
        ArrayList arrayList = this.f3663c.f3666b;
        if ((a1Var.f3162a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((a) arrayList.get(size)).f3659c++;
            }
        }
    }

    @Override // p0.t0
    public final y1 c(y1 y1Var, List list) {
        ArrayList arrayList = this.f3663c.f3666b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        for (int size = list.size() - 1; size >= 0; size--) {
            a1 a1Var = (a1) list.get(size);
            Integer num = (Integer) this.f3662b.get(a1Var);
            if (num != null) {
                int iIntValue = num.intValue();
                float fA = a1Var.f3162a.a();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fA;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fA;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fA;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fA;
                }
            }
        }
        f0.c.b(y1Var.f3268a.h(519), y1Var.f3268a.h(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList2 = ((a) arrayList.get(size2)).f3657a;
            int size3 = arrayList2.size() - 1;
            if (size3 >= 0) {
                throw u.i(size3, arrayList2);
            }
        }
        return y1Var;
    }

    @Override // p0.t0
    public final p d(a1 a1Var, p pVar) {
        if ((a1Var.f3162a.d() & 519) != 0) {
            f0.c cVar = (f0.c) pVar.f569h;
            f0.c cVar2 = (f0.c) pVar.f568g;
            int i4 = cVar.f2067a != cVar2.f2067a ? 1 : 0;
            if (cVar.f2068b != cVar2.f2068b) {
                i4 |= 2;
            }
            if (cVar.f2069c != cVar2.f2069c) {
                i4 |= 4;
            }
            if (cVar.f2070d != cVar2.f2070d) {
                i4 |= 8;
            }
            this.f3662b.put(a1Var, Integer.valueOf(i4));
        }
        return pVar;
    }
}
