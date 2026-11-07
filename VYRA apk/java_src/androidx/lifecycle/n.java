package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n f842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final n f845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ n[] f846k;

    static {
        n nVar = new n("DESTROYED", 0);
        f = nVar;
        n nVar2 = new n("INITIALIZED", 1);
        f842g = nVar2;
        n nVar3 = new n("CREATED", 2);
        f843h = nVar3;
        n nVar4 = new n("STARTED", 3);
        f844i = nVar4;
        n nVar5 = new n("RESUMED", 4);
        f845j = nVar5;
        f846k = new n[]{nVar, nVar2, nVar3, nVar4, nVar5};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f846k.clone();
    }
}
