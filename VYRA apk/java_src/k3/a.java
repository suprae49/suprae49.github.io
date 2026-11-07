package k3;

import i3.g;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements i3.c {
    public static final a f = new a();

    @Override // i3.c
    public final g d() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // i3.c
    public final void e(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
