package u1;

import android.webkit.ConsoleMessage;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3869a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        f3869a = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3869a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f3869a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f3869a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f3869a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
