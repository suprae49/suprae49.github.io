package u0;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import k.x2;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x2 f3844a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(x2 x2Var) {
        super(new Handler());
        this.f3844a = x2Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        Cursor cursor;
        x2 x2Var = this.f3844a;
        if (!x2Var.f3845g || (cursor = x2Var.f3846h) == null || cursor.isClosed()) {
            return;
        }
        x2Var.f = x2Var.f3846h.requery();
    }
}
