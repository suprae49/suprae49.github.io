package c2;

import a3.j;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.u;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import v2.l;
import v2.m;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1124c;

    public /* synthetic */ b(Object obj, int i4, Object obj2) {
        this.f1122a = i4;
        this.f1123b = obj;
        this.f1124c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i4 = this.f1122a;
        Object obj = this.f1124c;
        Object obj2 = this.f1123b;
        switch (i4) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) obj2;
                int i5 = AppBarLayout.G;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((j) obj).q(fFloatValue);
                Drawable drawable = appBarLayout.C;
                if (drawable instanceof j) {
                    ((j) drawable).q(fFloatValue);
                }
                Iterator it = appBarLayout.f1232w.iterator();
                if (it.hasNext()) {
                    throw u.j(it);
                }
                Iterator it2 = appBarLayout.f1233x.iterator();
                if (it2.hasNext()) {
                    throw u.j(it2);
                }
                return;
            case 1:
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) obj2;
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                layoutParams.height = ((Integer) animatedValue).intValue();
                ((View) obj).setLayoutParams(layoutParams);
                return;
            default:
                m mVar = (m) obj2;
                l lVar = (l) obj;
                if (lVar.a(true) && lVar.f4357m != 0 && mVar.isVisible()) {
                    mVar.invalidateSelf();
                    return;
                }
                return;
        }
    }
}
