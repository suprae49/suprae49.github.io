package k;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.e f2592a;

    public n2(androidx.appcompat.widget.e eVar) {
        this.f2592a = eVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        androidx.appcompat.widget.e eVar = this.f2592a;
        View.OnFocusChangeListener onFocusChangeListener = eVar.Q;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(eVar, z4);
        }
    }
}
