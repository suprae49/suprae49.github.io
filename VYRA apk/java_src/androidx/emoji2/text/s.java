package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f571a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f575e;
    public int f;

    public s(w wVar) {
        this.f572b = wVar;
        this.f573c = wVar;
    }

    public final void a() {
        this.f571a = 1;
        this.f573c = this.f572b;
        this.f = 0;
    }

    public final boolean b() {
        a1.a aVarB = this.f573c.f590b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f10d).get(iA + aVarB.f7a) == 0) || this.f575e == 65039;
    }
}
