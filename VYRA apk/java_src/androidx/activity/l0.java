package androidx.activity;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends r3.h implements q3.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l0 f217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l0 f218i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f219g;

    static {
        int i4 = 1;
        f217h = new l0(i4, 0);
        f218i = new l0(i4, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i4, int i5) {
        super(i4);
        this.f219g = i5;
    }

    @Override // q3.l
    public final Object g(Object obj) {
        switch (this.f219g) {
            case 0:
                ((Resources) obj).getClass();
                return Boolean.TRUE;
            default:
                ((Resources) obj).getClass();
                return Boolean.FALSE;
        }
    }
}
