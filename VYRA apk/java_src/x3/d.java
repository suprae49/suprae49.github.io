package x3;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f4752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q3.l f4754c;

    public d(g gVar, boolean z4, q3.l lVar) {
        this.f4752a = gVar;
        this.f4753b = z4;
        this.f4754c = lVar;
    }

    @Override // x3.g
    public final Iterator iterator() {
        return new c(this);
    }
}
