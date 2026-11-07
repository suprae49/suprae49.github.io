package j;

import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements PopupWindow.OnDismissListener {
    public final /* synthetic */ w f;

    public v(w wVar) {
        this.f = wVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f.c();
    }
}
