package n0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f3071e = new byte[1792];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f3072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f3075d;

    static {
        for (int i4 = 0; i4 < 1792; i4++) {
            f3071e[i4] = Character.getDirectionality(i4);
        }
    }

    public a(CharSequence charSequence) {
        this.f3072a = charSequence;
        this.f3073b = charSequence.length();
    }

    public final byte a() {
        int i4 = this.f3074c - 1;
        CharSequence charSequence = this.f3072a;
        char cCharAt = charSequence.charAt(i4);
        this.f3075d = cCharAt;
        boolean zIsLowSurrogate = Character.isLowSurrogate(cCharAt);
        int i5 = this.f3074c;
        if (zIsLowSurrogate) {
            int iCodePointBefore = Character.codePointBefore(charSequence, i5);
            this.f3074c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f3074c = i5 - 1;
        char c4 = this.f3075d;
        return c4 < 1792 ? f3071e[c4] : Character.getDirectionality(c4);
    }
}
