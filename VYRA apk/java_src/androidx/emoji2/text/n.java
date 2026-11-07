package androidx.emoji2.text;

import android.os.Trace;
import android.webkit.CookieManager;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {
    public final /* synthetic */ int f;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                try {
                    int i4 = k0.i.f2724a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (k.f554k != null) {
                        k.a().c();
                        break;
                    }
                    return;
                } finally {
                    int i5 = k0.i.f2724a;
                    Trace.endSection();
                }
            default:
                CookieManager.getInstance().flush();
                return;
        }
    }
}
