package c3;

import android.os.Handler;
import android.os.Message;
import androidx.fragment.app.q;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 0) {
            message.obj.getClass();
            q.c();
            return false;
        }
        if (i4 != 1) {
            return false;
        }
        message.obj.getClass();
        q.c();
        return false;
    }
}
