package b0;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationManager f1028a;

    static {
        new HashSet();
    }

    public n(Context context) {
        this.f1028a = (NotificationManager) context.getSystemService("notification");
    }
}
