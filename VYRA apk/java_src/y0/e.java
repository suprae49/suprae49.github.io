package y0;

import android.view.View;
import androidx.activity.k;
import t2.i;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w0.e f4771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f4772c = new k(20, this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f4773d;

    public e(f fVar, int i4) {
        this.f4773d = fVar;
        this.f4770a = i4;
    }

    @Override // t2.i
    public final void A() {
        this.f4773d.postDelayed(this.f4772c, 160L);
    }

    @Override // t2.i
    public final void B(View view, int i4) {
        ((c) view.getLayoutParams()).f4768c = false;
        int i5 = this.f4770a == 3 ? 5 : 3;
        f fVar = this.f4773d;
        View viewE = fVar.e(i5);
        if (viewE != null) {
            fVar.c(viewE, true);
        }
    }

    @Override // t2.i
    public final void C(int i4) {
        this.f4773d.v(this.f4771b.f4445t, i4);
    }

    @Override // t2.i
    public final void D(View view, int i4, int i5) {
        int width = view.getWidth();
        f fVar = this.f4773d;
        float width2 = (fVar.b(view, 3) ? i4 + width : fVar.getWidth() - i4) / width;
        fVar.r(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        fVar.invalidate();
    }

    @Override // t2.i
    public final void E(View view, float f, float f4) {
        int i4;
        float f5 = ((c) view.getLayoutParams()).f4767b;
        int width = view.getWidth();
        f fVar = this.f4773d;
        if (fVar.b(view, 3)) {
            i4 = (f > 0.0f || (f == 0.0f && f5 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = fVar.getWidth();
            if (f < 0.0f || (f == 0.0f && f5 > 0.5f)) {
                width2 -= width;
            }
            i4 = width2;
        }
        this.f4771b.p(i4, view.getTop());
        fVar.invalidate();
    }

    @Override // t2.i
    public final boolean Q(View view, int i4) {
        if (!f.m(view)) {
            return false;
        }
        int i5 = this.f4770a;
        f fVar = this.f4773d;
        return fVar.b(view, i5) && fVar.h(view) == 0;
    }

    @Override // t2.i
    public final int c(View view, int i4) {
        f fVar = this.f4773d;
        if (fVar.b(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i4, 0));
        }
        int width = fVar.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i4, width));
    }

    @Override // t2.i
    public final int d(View view, int i4) {
        return view.getTop();
    }

    @Override // t2.i
    public final int q(View view) {
        if (f.m(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // t2.i
    public final void z(int i4, int i5) {
        int i6 = i4 & 1;
        f fVar = this.f4773d;
        View viewE = i6 == 1 ? fVar.e(3) : fVar.e(5);
        if (viewE == null || fVar.h(viewE) != 0) {
            return;
        }
        this.f4771b.b(viewE, i5);
    }
}
