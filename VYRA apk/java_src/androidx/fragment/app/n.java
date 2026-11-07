package androidx.fragment.app;

import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements DialogInterface.OnDismissListener {
    public final /* synthetic */ p f;

    public n(p pVar) {
        this.f = pVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        p pVar = this.f;
        if (pVar.mDialog != null) {
            pVar.onDismiss(pVar.mDialog);
        }
    }
}
