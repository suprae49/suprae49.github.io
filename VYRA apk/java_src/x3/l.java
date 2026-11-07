package x3;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4761a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3.a f4763c;

    public l(String str, y3.i iVar) {
        str.getClass();
        this.f4762b = str;
        this.f4763c = iVar;
    }

    @Override // x3.g
    public final Iterator iterator() {
        switch (this.f4761a) {
            case 0:
                return new k(this);
            default:
                return new y3.b(this);
        }
    }

    public l(g gVar, q3.l lVar) {
        this.f4762b = gVar;
        this.f4763c = lVar;
    }
}
