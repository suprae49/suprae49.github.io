package m0;

import a3.h0;
import android.view.View;
import androidx.emoji2.text.p;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1.a f3055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f3056b;

    public c(i1.a aVar, h0 h0Var) {
        this.f3055a = aVar;
        this.f3056b = h0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        view.getClass();
        if (view.isAttachedToWindow()) {
            view.removeOnLayoutChangeListener(this);
            i1.a aVar = this.f3055a;
            boolean zB = ((g) aVar.f).b();
            h0 h0Var = this.f3056b;
            if (zB) {
                aVar.f2239h = h0Var;
                return;
            }
            p1.h hVar = (p1.h) aVar.f2238g;
            if (hVar == null) {
                return;
            }
            aVar.f2238g = null;
            ((p) h0Var.f84g).n().postOnAnimation(new androidx.activity.p(h0Var, 4, hVar));
        }
    }
}
