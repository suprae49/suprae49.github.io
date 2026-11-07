package d4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f1806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f1807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f1808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f1809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ b[] f1810k;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f1806g = bVar2;
        b bVar3 = new b("PARKING", 2);
        f1807h = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f1808i = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f1809j = bVar5;
        f1810k = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1810k.clone();
    }
}
