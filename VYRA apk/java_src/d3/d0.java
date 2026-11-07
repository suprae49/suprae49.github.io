package d3;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import e.l0;
import java.util.WeakHashMap;
import k.p1;
import p0.p0;
import u1.e2;
import u1.h2;
import u1.o0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1697g;

    public /* synthetic */ d0(int i4, Object obj) {
        this.f = i4;
        this.f1697g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f;
        Object obj = this.f1697g;
        switch (i4) {
            case 0:
                CheckableImageButton checkableImageButton = ((TextInputLayout) obj).f1567h.f1739l;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 1:
                l0 l0Var = (l0) obj;
                Window.Callback callback = l0Var.f;
                Menu menuU0 = l0Var.u0();
                j.m mVar = menuU0 instanceof j.m ? (j.m) menuU0 : null;
                if (mVar != null) {
                    mVar.y();
                }
                try {
                    menuU0.clear();
                    if (!callback.onCreatePanelMenu(0, menuU0) || !callback.onPreparePanel(0, null, menuU0)) {
                        menuU0.clear();
                    }
                    if (mVar != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (mVar != null) {
                        mVar.x();
                    }
                }
                break;
            case 2:
                g.d dVar = (g.d) obj;
                dVar.b(true);
                dVar.invalidateSelf();
                return;
            case 3:
                b3.g gVar = (b3.g) obj;
                gVar.f1074c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) gVar.f1076e;
                w0.e eVar = bottomSheetBehavior.V;
                if (eVar != null && eVar.g()) {
                    gVar.a(gVar.f1073b);
                    return;
                } else {
                    if (bottomSheetBehavior.U == 2) {
                        bottomSheetBehavior.K(gVar.f1073b);
                        return;
                    }
                    return;
                }
            case 4:
                p1 p1Var = (p1) obj;
                p1Var.f2610q = null;
                p1Var.drawableStateChanged();
                return;
            case 5:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) obj;
                if (searchView$SearchAutoComplete.f357l) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f357l = false;
                    return;
                }
                return;
            case 6:
                ((Toolbar) obj).w();
                return;
            case 7:
                k1.l lVar = (k1.l) obj;
                ValueAnimator valueAnimator = lVar.f2836z;
                int i5 = lVar.A;
                if (i5 == 1) {
                    valueAnimator.cancel();
                } else if (i5 != 2) {
                    return;
                }
                lVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 8:
                ((StaggeredGridLayoutManager) obj).B0();
                return;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                t0.c cVar = (t0.c) obj;
                p1 p1Var2 = cVar.f3682h;
                t0.a aVar = cVar.f;
                if (cVar.f3693t) {
                    if (cVar.f3691r) {
                        cVar.f3691r = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f3676e = jCurrentAnimationTimeMillis;
                        aVar.f3677g = -1L;
                        aVar.f = jCurrentAnimationTimeMillis;
                        aVar.f3678h = 0.5f;
                    }
                    if ((aVar.f3677g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f3677g + ((long) aVar.f3679i)) || !cVar.e()) {
                        cVar.f3693t = false;
                        return;
                    }
                    if (cVar.f3692s) {
                        cVar.f3692s = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        p1Var2.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j4 = jCurrentAnimationTimeMillis2 - aVar.f;
                    aVar.f = jCurrentAnimationTimeMillis2;
                    cVar.f3695v.scrollListBy((int) (j4 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f3675d));
                    WeakHashMap weakHashMap = p0.f3233a;
                    p1Var2.postOnAnimation(this);
                    return;
                }
                return;
            case 10:
                ((u1.o) obj).f4016a.m0();
                return;
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                ((WebView) obj).setWebViewClient(null);
                return;
            case 12:
                ((o0) ((x1.i) obj)).reload();
                return;
            case 13:
                ((e2) obj).f3901a.m0();
                return;
            case 14:
                h2 h2Var = (h2) obj;
                h2Var.f3952h.loadUrl(h2Var.f3953i);
                return;
            default:
                ((w0.e) obj).o(0);
                return;
        }
    }
}
