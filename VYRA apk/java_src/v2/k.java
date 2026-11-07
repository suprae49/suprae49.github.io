package v2;

import e.a0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends e {
    public int getIndeterminateAnimationType() {
        return this.f.f4360q;
    }

    public int getIndicatorDirection() {
        return this.f.f4363t;
    }

    public int getIndicatorInset() {
        return this.f.f4362s;
    }

    public int getIndicatorSize() {
        return this.f.f4361r;
    }

    public void setIndeterminateAnimationType(int i4) {
        l lVar = this.f;
        if (lVar.f4360q == i4) {
            return;
        }
        if (b() && isIndeterminate()) {
            androidx.fragment.app.q.j("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        lVar.f4360q = i4;
        lVar.b();
        a0 jVar = i4 == 1 ? new j(getContext(), lVar) : new h(lVar);
        s indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.f4401t = jVar;
        jVar.f1839a = indeterminateDrawable;
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f4401t.k(this.f4308r);
        }
        invalidate();
    }

    public void setIndicatorDirection(int i4) {
        this.f.f4363t = i4;
        invalidate();
    }

    public void setIndicatorInset(int i4) {
        l lVar = this.f;
        if (lVar.f4362s != i4) {
            lVar.f4362s = i4;
            invalidate();
        }
    }

    public void setIndicatorSize(int i4) {
        int iMax = Math.max(i4, getTrackThickness() * 2);
        l lVar = this.f;
        if (lVar.f4361r != iMax) {
            lVar.f4361r = iMax;
            lVar.b();
            requestLayout();
            invalidate();
        }
    }

    @Override // v2.e
    public void setTrackThickness(int i4) {
        super.setTrackThickness(i4);
        this.f.b();
    }
}
