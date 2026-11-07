package u1;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import co.median.android.MainActivity;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3854g;

    public /* synthetic */ a0(int i4, Object obj) {
        this.f = i4;
        this.f3854g = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f) {
            case 0:
                ((JsPromptResult) this.f3854g).cancel();
                break;
            default:
                ((MainActivity) this.f3854g).B0 = "";
                break;
        }
    }
}
