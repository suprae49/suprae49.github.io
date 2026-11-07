package x1;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4711a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            LinkedHashMap linkedHashMap = d.f4712g;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LinkedHashMap linkedHashMap2 = d.f4712g;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LinkedHashMap linkedHashMap3 = d.f4712g;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f4711a = iArr;
    }
}
