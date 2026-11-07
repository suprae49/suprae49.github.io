package d3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f1758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f1760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f1761e;

    public u(v vVar, int i4, TextView textView, int i5, TextView textView2) {
        this.f1761e = vVar;
        this.f1757a = i4;
        this.f1758b = textView;
        this.f1759c = i5;
        this.f1760d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        y0 y0Var;
        int i4 = this.f1757a;
        v vVar = this.f1761e;
        vVar.n = i4;
        vVar.f1772l = null;
        TextView textView = this.f1758b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f1759c == 1 && (y0Var = vVar.f1777r) != null) {
                y0Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f1760d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f1760d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
