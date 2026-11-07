package u1;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ JsResult f3863g;

    public /* synthetic */ c0(JsResult jsResult, int i4) {
        this.f = i4;
        this.f3863g = jsResult;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f) {
            case 0:
                this.f3863g.cancel();
                break;
            default:
                this.f3863g.cancel();
                break;
        }
    }
}
