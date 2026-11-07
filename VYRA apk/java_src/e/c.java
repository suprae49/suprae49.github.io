package e;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f1857a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == -3 || i4 == -2 || i4 == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f1857a.get(), message.what);
        } else {
            if (i4 != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
