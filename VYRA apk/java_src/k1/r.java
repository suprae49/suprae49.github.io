package k1;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.emoji2.text.g f2880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2884e;

    public r() {
        c();
    }

    public final void a() {
        boolean z4 = this.f2883d;
        androidx.emoji2.text.g gVar = this.f2880a;
        this.f2882c = z4 ? gVar.g() : gVar.k();
    }

    public final void b(View view, int i4) {
        androidx.emoji2.text.g gVar = this.f2880a;
        int iL = Integer.MIN_VALUE == gVar.f548a ? 0 : gVar.l() - gVar.f548a;
        if (iL >= 0) {
            boolean z4 = this.f2883d;
            androidx.emoji2.text.g gVar2 = this.f2880a;
            if (z4) {
                int iB = gVar2.b(view);
                androidx.emoji2.text.g gVar3 = this.f2880a;
                this.f2882c = (Integer.MIN_VALUE != gVar3.f548a ? gVar3.l() - gVar3.f548a : 0) + iB;
            } else {
                this.f2882c = gVar2.e(view);
            }
            this.f2881b = i4;
            return;
        }
        this.f2881b = i4;
        boolean z5 = this.f2883d;
        androidx.emoji2.text.g gVar4 = this.f2880a;
        if (!z5) {
            int iE = gVar4.e(view);
            int iK = iE - this.f2880a.k();
            this.f2882c = iE;
            if (iK > 0) {
                int iG = (this.f2880a.g() - Math.min(0, (this.f2880a.g() - iL) - this.f2880a.b(view))) - (this.f2880a.c(view) + iE);
                if (iG < 0) {
                    this.f2882c -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (gVar4.g() - iL) - this.f2880a.b(view);
        this.f2882c = this.f2880a.g() - iG2;
        if (iG2 > 0) {
            int iC = this.f2882c - this.f2880a.c(view);
            int iK2 = this.f2880a.k();
            int iMin = iC - (Math.min(this.f2880a.e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.f2882c = Math.min(iG2, -iMin) + this.f2882c;
            }
        }
    }

    public final void c() {
        this.f2881b = -1;
        this.f2882c = Integer.MIN_VALUE;
        this.f2883d = false;
        this.f2884e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2881b + ", mCoordinate=" + this.f2882c + ", mLayoutFromEnd=" + this.f2883d + ", mValid=" + this.f2884e + '}';
    }
}
