package x;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4485m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public u.a f4486o;

    public boolean getAllowsGoneWidget() {
        return this.f4486o.f3740t0;
    }

    public int getMargin() {
        return this.f4486o.f3741u0;
    }

    public int getType() {
        return this.f4485m;
    }

    @Override // x.c
    public final void h(u.d dVar, boolean z4) {
        int i4 = this.f4485m;
        this.n = i4;
        if (z4) {
            if (i4 == 5) {
                this.n = 1;
            } else if (i4 == 6) {
                this.n = 0;
            }
        } else if (i4 == 5) {
            this.n = 0;
        } else if (i4 == 6) {
            this.n = 1;
        }
        if (dVar instanceof u.a) {
            ((u.a) dVar).f3739s0 = this.n;
        }
    }

    public void setAllowsGoneWidget(boolean z4) {
        this.f4486o.f3740t0 = z4;
    }

    public void setDpMargin(int i4) {
        this.f4486o.f3741u0 = (int) ((i4 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i4) {
        this.f4486o.f3741u0 = i4;
    }

    public void setType(int i4) {
        this.f4485m = i4;
    }
}
