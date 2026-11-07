package k1;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ThreadLocal f2860j = new ThreadLocal();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final m f2861k = new m(0);
    public ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f2862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f2863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f2864i;

    public static x0 c(RecyclerView recyclerView, int i4, long j4) {
        int iN = recyclerView.f918j.n();
        for (int i5 = 0; i5 < iN; i5++) {
            x0 x0VarI = RecyclerView.I(recyclerView.f918j.m(i5));
            if (x0VarI.f2947c == i4 && !x0VarI.f()) {
                return null;
            }
        }
        v1.b bVar = recyclerView.f913g;
        try {
            recyclerView.P();
            x0 x0VarM = bVar.m(i4, j4);
            if (x0VarM != null) {
                if (!x0VarM.e() || x0VarM.f()) {
                    bVar.a(x0VarM, false);
                } else {
                    bVar.i(x0VarM.f2945a);
                }
            }
            return x0VarM;
        } finally {
            recyclerView.Q(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i4, int i5) {
        if (recyclerView.f941w && this.f2862g == 0) {
            this.f2862g = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        c2.h hVar = recyclerView.j0;
        hVar.f1142a = i4;
        hVar.f1143b = i5;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    public final void b(long j4) {
        n nVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        n nVar2;
        ArrayList arrayList = this.f2864i;
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i5);
            int windowVisibility = recyclerView3.getWindowVisibility();
            c2.h hVar = recyclerView3.j0;
            if (windowVisibility == 0) {
                hVar.c(recyclerView3, false);
                i4 += hVar.f1144c;
            }
        }
        arrayList.ensureCapacity(i4);
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i7);
            if (recyclerView4.getWindowVisibility() == 0) {
                c2.h hVar2 = recyclerView4.j0;
                int iAbs = Math.abs(hVar2.f1143b) + Math.abs(hVar2.f1142a);
                for (int i8 = 0; i8 < hVar2.f1144c * 2; i8 += 2) {
                    if (i6 >= arrayList.size()) {
                        nVar2 = new n();
                        arrayList.add(nVar2);
                    } else {
                        nVar2 = (n) arrayList.get(i6);
                    }
                    int[] iArr = (int[]) hVar2.f1145d;
                    int i9 = iArr[i8 + 1];
                    nVar2.f2855a = i9 <= iAbs;
                    nVar2.f2856b = iAbs;
                    nVar2.f2857c = i9;
                    nVar2.f2858d = recyclerView4;
                    nVar2.f2859e = iArr[i8];
                    i6++;
                }
            }
        }
        Collections.sort(arrayList, f2861k);
        for (int i10 = 0; i10 < arrayList.size() && (recyclerView = (nVar = (n) arrayList.get(i10)).f2858d) != null; i10++) {
            x0 x0VarC = c(recyclerView, nVar.f2859e, nVar.f2855a ? Long.MAX_VALUE : j4);
            if (x0VarC != null && x0VarC.f2946b != null && x0VarC.e() && !x0VarC.f() && (recyclerView2 = (RecyclerView) x0VarC.f2946b.get()) != null) {
                if (recyclerView2.G && recyclerView2.f918j.n() != 0) {
                    v1.b bVar = recyclerView2.f913g;
                    h0 h0Var = recyclerView2.P;
                    if (h0Var != null) {
                        h0Var.e();
                    }
                    l0 l0Var = recyclerView2.f932r;
                    if (l0Var != null) {
                        l0Var.h0(bVar);
                        recyclerView2.f932r.i0(bVar);
                    }
                    ((ArrayList) bVar.f4288c).clear();
                    bVar.g();
                }
                c2.h hVar3 = recyclerView2.j0;
                hVar3.c(recyclerView2, true);
                if (hVar3.f1144c != 0) {
                    try {
                        int i11 = k0.i.f2724a;
                        Trace.beginSection("RV Nested Prefetch");
                        u0 u0Var = recyclerView2.f920k0;
                        b0 b0Var = recyclerView2.f930q;
                        u0Var.f2923d = 1;
                        u0Var.f2924e = b0Var.a();
                        u0Var.f2925g = false;
                        u0Var.f2926h = false;
                        u0Var.f2927i = false;
                        for (int i12 = 0; i12 < hVar3.f1144c * 2; i12 += 2) {
                            c(recyclerView2, ((int[]) hVar3.f1145d)[i12], j4);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i13 = k0.i.f2724a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            nVar.f2855a = false;
            nVar.f2856b = 0;
            nVar.f2857c = 0;
            nVar.f2858d = null;
            nVar.f2859e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f;
        try {
            int i4 = k0.i.f2724a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i5);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f2863h);
                }
            }
            this.f2862g = 0L;
        } finally {
            this.f2862g = 0L;
            int i6 = k0.i.f2724a;
            Trace.endSection();
        }
    }
}
