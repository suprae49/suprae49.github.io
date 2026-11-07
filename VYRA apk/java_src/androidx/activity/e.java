package androidx.activity;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.r {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f190g;

    public /* synthetic */ e(int i4, Object obj) {
        this.f = i4;
        this.f190g = obj;
    }

    @Override // androidx.lifecycle.r
    public final void a(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
        Window window;
        View viewPeekDecorView;
        switch (this.f) {
            case 0:
                androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) this.f190g;
                if (mVar == androidx.lifecycle.m.ON_STOP && (window = e0Var.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                androidx.fragment.app.e0 e0Var2 = (androidx.fragment.app.e0) this.f190g;
                if (mVar == androidx.lifecycle.m.ON_DESTROY) {
                    e0Var2.f233g.f1b = null;
                    if (!e0Var2.isChangingConfigurations()) {
                        e0Var2.getViewModelStore().a();
                    }
                    l lVar = e0Var2.f237k;
                    androidx.fragment.app.e0 e0Var3 = lVar.f216i;
                    e0Var3.getWindow().getDecorView().removeCallbacks(lVar);
                    e0Var3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(lVar);
                }
                break;
            default:
                l1.c cVar = (l1.c) this.f190g;
                cVar.getClass();
                if (mVar == androidx.lifecycle.m.ON_START) {
                    cVar.f = true;
                } else if (mVar == androidx.lifecycle.m.ON_STOP) {
                    cVar.f = false;
                }
                break;
        }
    }
}
