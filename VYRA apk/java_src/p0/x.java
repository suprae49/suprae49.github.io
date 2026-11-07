package p0;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f3260g;

    public /* synthetic */ x(View view, int i4) {
        this.f = i4;
        this.f3260g = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                View view = this.f3260g;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            default:
                View view2 = this.f3260g;
                ((InputMethodManager) c0.c.getSystemService(view2.getContext(), InputMethodManager.class)).showSoftInput(view2, 1);
                break;
        }
    }
}
