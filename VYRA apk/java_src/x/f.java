package x;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4541e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f4543h;

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f4543h = constraintLayout;
        this.f4537a = constraintLayout2;
    }

    public static boolean a(int i4, int i5, int i6) {
        if (i4 == i5) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i6 == size;
        }
        return false;
    }

    public final void b(u.d dVar, v.b bVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        boolean z4;
        int measuredWidth;
        int baseline;
        int i4;
        if (dVar == null) {
            return;
        }
        u.c cVar = dVar.K;
        u.c cVar2 = dVar.I;
        if (dVar.g0 == 8) {
            bVar.f4232e = 0;
            bVar.f = 0;
            bVar.f4233g = 0;
            return;
        }
        if (dVar.T == null) {
            return;
        }
        s sVar = ConstraintLayout.f451u;
        int i5 = bVar.f4228a;
        int i6 = bVar.f4229b;
        int i7 = bVar.f4230c;
        int i8 = bVar.f4231d;
        int i9 = this.f4538b + this.f4539c;
        int i10 = this.f4540d;
        View view = dVar.f3774f0;
        int iB = s.e.b(i5);
        if (iB == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (iB == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i10, -2);
        } else if (iB == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i10, -2);
            boolean z5 = dVar.f3793r == 1;
            int i11 = bVar.f4236j;
            if (i11 == 1 || i11 == 2) {
                boolean z6 = view.getMeasuredHeight() == dVar.k();
                if (bVar.f4236j == 2 || !z5 || ((z5 && z6) || dVar.A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dVar.q(), 1073741824);
                }
            }
        } else if (iB != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i12 = this.f;
            int i13 = cVar2 != null ? cVar2.f3762g : 0;
            if (cVar != null) {
                i13 += cVar.f3762g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i12, i10 + i13, -1);
        }
        int iB2 = s.e.b(i6);
        if (iB2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        } else if (iB2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4542g, i9, -2);
        } else if (iB2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f4542g, i9, -2);
            boolean z7 = dVar.f3794s == 1;
            int i14 = bVar.f4236j;
            if (i14 == 1 || i14 == 2) {
                boolean z8 = view.getMeasuredWidth() == dVar.q();
                if (bVar.f4236j == 2 || !z7 || ((z7 && z8) || dVar.B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dVar.k(), 1073741824);
                }
            }
        } else if (iB2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i15 = this.f4542g;
            int i16 = cVar2 != null ? dVar.J.f3762g : 0;
            if (cVar != null) {
                i16 += dVar.L.f3762g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i15, i9 + i16, -1);
        }
        u.e eVar = (u.e) dVar.T;
        ConstraintLayout constraintLayout = this.f4543h;
        if (eVar != null && u.j.c(constraintLayout.n, 256) && view.getMeasuredWidth() == dVar.q() && view.getMeasuredWidth() < eVar.q() && view.getMeasuredHeight() == dVar.k() && view.getMeasuredHeight() < eVar.k() && view.getBaseline() == dVar.f3766a0 && !dVar.z() && a(dVar.G, iMakeMeasureSpec, dVar.q()) && a(dVar.H, iMakeMeasureSpec2, dVar.k())) {
            bVar.f4232e = dVar.q();
            bVar.f = dVar.k();
            bVar.f4233g = dVar.f3766a0;
            return;
        }
        boolean z9 = i5 == 3;
        boolean z10 = i6 == 3;
        boolean z11 = i6 == 4 || i6 == 1;
        boolean z12 = i5 == 4 || i5 == 1;
        boolean z13 = z9 && dVar.W > 0.0f;
        boolean z14 = z10 && dVar.W > 0.0f;
        if (view == null) {
            return;
        }
        e eVar2 = (e) view.getLayoutParams();
        int i17 = bVar.f4236j;
        if (i17 != 1 && i17 != 2 && z9 && dVar.f3793r == 0 && z10 && dVar.f3794s == 0) {
            z4 = false;
            measuredWidth = 0;
            baseline = 0;
            i4 = -1;
            iMax = 0;
        } else {
            if ((view instanceof t) && (dVar instanceof u.g)) {
                ((t) view).j((u.g) dVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            dVar.G = iMakeMeasureSpec;
            dVar.H = iMakeMeasureSpec2;
            dVar.f3775g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i18 = dVar.f3796u;
            int iMax2 = i18 > 0 ? Math.max(i18, measuredWidth2) : measuredWidth2;
            int i19 = dVar.f3797v;
            if (i19 > 0) {
                iMax2 = Math.min(i19, iMax2);
            }
            int i20 = dVar.f3799x;
            iMax = i20 > 0 ? Math.max(i20, measuredHeight) : measuredHeight;
            int i21 = iMakeMeasureSpec2;
            int i22 = dVar.f3800y;
            if (i22 > 0) {
                iMax = Math.min(i22, iMax);
            }
            if (!u.j.c(constraintLayout.n, 1)) {
                if (z13 && z11) {
                    iMax2 = (int) ((iMax * dVar.W) + 0.5f);
                } else if (z14 && z12) {
                    iMax = (int) ((iMax2 / dVar.W) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z4 = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i21;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                dVar.G = iMakeMeasureSpec;
                dVar.H = iMakeMeasureSpec3;
                z4 = false;
                dVar.f3775g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i4 = -1;
        }
        boolean z15 = baseline != i4 ? true : z4;
        bVar.f4235i = (measuredWidth == bVar.f4230c && iMax == bVar.f4231d) ? z4 : true;
        boolean z16 = eVar2.f4505c0 ? true : z15;
        if (z16 && baseline != -1 && dVar.f3766a0 != baseline) {
            bVar.f4235i = true;
        }
        bVar.f4232e = measuredWidth;
        bVar.f = iMax;
        bVar.f4234h = z16;
        bVar.f4233g = baseline;
    }
}
