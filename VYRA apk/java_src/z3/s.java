package z3;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4924a;

    public s(boolean z4) {
        this.f4924a = z4;
    }

    @Override // z3.x
    public final boolean b() {
        return this.f4924a;
    }

    @Override // z3.x
    public final f0 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f4924a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
