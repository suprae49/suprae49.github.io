package x3;

import java.util.Iterator;
import u1.q;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f4755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q3.l f4756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f4757c;

    public e(g gVar, q3.l lVar, q qVar) {
        this.f4755a = gVar;
        this.f4756b = lVar;
        this.f4757c = qVar;
    }

    @Override // x3.g
    public final Iterator iterator() {
        return new c(this);
    }
}
