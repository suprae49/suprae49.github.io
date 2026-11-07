package androidx.fragment.app;

import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements DialogInterface.OnCancelListener {
    public final /* synthetic */ p f;

    public m(p pVar) {
        this.f = pVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        p pVar = this.f;
        if (pVar.mDialog != null) {
            pVar.onCancel(pVar.mDialog);
        }
    }
}
