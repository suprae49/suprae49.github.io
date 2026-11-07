package u1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 {
    public static final i2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i2 f3968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i2 f3969h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i2 f3970i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ i2[] f3971j;

    static {
        i2 i2Var = new i2("Always", 0);
        f = i2Var;
        i2 i2Var2 = new i2("Reload", 1);
        f3968g = i2Var2;
        i2 i2Var3 = new i2("Never", 2);
        f3969h = i2Var3;
        f3971j = new i2[]{i2Var, i2Var2, i2Var3};
        f3970i = i2Var2;
    }

    public static i2 valueOf(String str) {
        return (i2) Enum.valueOf(i2.class, str);
    }

    public static i2[] values() {
        return (i2[]) f3971j.clone();
    }
}
