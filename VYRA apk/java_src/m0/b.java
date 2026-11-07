package m0;

import a3.h0;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.emoji2.text.p;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f3053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i1.a f3054h;

    public /* synthetic */ b(i1.a aVar, View view, int i4) {
        this.f = i4;
        this.f3054h = aVar;
        this.f3053g = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        p1.h hVar;
        switch (this.f) {
            case 0:
                i1.a aVar = this.f3054h;
                if (((g) aVar.f).b()) {
                    return false;
                }
                this.f3053g.getViewTreeObserver().removeOnPreDrawListener(this);
                h0 h0Var = (h0) aVar.f2239h;
                if (h0Var != null && (hVar = (p1.h) aVar.f2238g) != null) {
                    aVar.f2238g = null;
                    ((p) h0Var.f84g).n().postOnAnimation(new androidx.activity.p(h0Var, 4, hVar));
                }
                return true;
            default:
                if (((g) ((f) this.f3054h).f).b()) {
                    return false;
                }
                this.f3053g.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
        }
    }
}
