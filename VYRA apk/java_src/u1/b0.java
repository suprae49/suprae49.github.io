package u1;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ JsResult f3858g;

    public /* synthetic */ b0(JsResult jsResult, int i4) {
        this.f = i4;
        this.f3858g = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        switch (this.f) {
            case 0:
                this.f3858g.confirm();
                break;
            case 1:
                this.f3858g.confirm();
                break;
            case 2:
                this.f3858g.cancel();
                break;
            default:
                ((JsPromptResult) this.f3858g).cancel();
                break;
        }
    }
}
