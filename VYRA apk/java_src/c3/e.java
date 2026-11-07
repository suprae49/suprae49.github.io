package c3;

import android.os.Handler;
import android.os.Message;
import androidx.fragment.app.q;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f1155a;

    public e(f fVar) {
        this.f1155a = fVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        f fVar = this.f1155a;
        if (message.obj != null) {
            q.c();
            return false;
        }
        synchronized (fVar.f1157a) {
            throw null;
        }
    }
}
