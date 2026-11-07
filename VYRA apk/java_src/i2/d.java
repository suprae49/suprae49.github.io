package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f2272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f2273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f2274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ d[] f2275j;

    static {
        d dVar = new d("NONE", 0);
        f = dVar;
        d dVar2 = new d("START", 1);
        f2272g = dVar2;
        d dVar3 = new d("END", 2);
        f2273h = dVar3;
        d dVar4 = new d("BOTH", 3);
        f2274i = dVar4;
        f2275j = new d[]{dVar, dVar2, dVar3, dVar4};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f2275j.clone();
    }
}
