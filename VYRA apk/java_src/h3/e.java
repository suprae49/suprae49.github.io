package h3;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements x3.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2178b;

    public /* synthetic */ e(int i4, Object obj) {
        this.f2177a = i4;
        this.f2178b = obj;
    }

    @Override // x3.g
    public final Iterator iterator() {
        switch (this.f2177a) {
            case 0:
                return new r3.a((Object[]) this.f2178b);
            case 1:
                return new x3.f(this);
            default:
                return (Iterator) this.f2178b;
        }
    }
}
