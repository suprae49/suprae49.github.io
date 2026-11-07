package b3;

import a3.h0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.emoji2.text.p;
import co.median.android.MainActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.sidesheet.SideSheetBehavior;
import d3.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p0.s0;
import p1.r;
import u1.r1;
import y3.j;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1071b;

    public f(s0 s0Var, View view) {
        this.f1070a = 4;
        this.f1071b = s0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1070a) {
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1071b;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.f314o = false;
                break;
            case 4:
                ((s0) this.f1071b).b();
                break;
            case 5:
            case 6:
            default:
                super.onAnimationCancel(animator);
                break;
            case 7:
                super.onAnimationCancel(animator);
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) this.f1071b;
                focusRingDrawable.f1500p = 1.0f;
                focusRingDrawable.invalidateSelf();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f1070a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f1071b;
                sideSheetBehavior.x(5);
                WeakReference weakReference = sideSheetBehavior.f1548u;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                ((View) sideSheetBehavior.f1548u.get()).requestLayout();
                return;
            case 1:
                m mVar = (m) this.f1071b;
                mVar.p();
                mVar.f1726r.start();
                return;
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f1071b;
                bottomSheetBehavior.K(5);
                WeakReference weakReference2 = bottomSheetBehavior.d0;
                if (weakReference2 == null || weakReference2.get() == null) {
                    return;
                }
                ((View) bottomSheetBehavior.d0.get()).requestLayout();
                return;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1071b;
                actionBarOverlayLayout.B = null;
                actionBarOverlayLayout.f314o = false;
                return;
            case 4:
                ((s0) this.f1071b).a();
                return;
            case 5:
                ((r) this.f1071b).n();
                animator.removeListener(this);
                return;
            case 6:
                q1.e eVar = (q1.e) this.f1071b;
                ArrayList arrayList = new ArrayList(eVar.f3395j);
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((v2.d) arrayList.get(i4)).a(eVar);
                }
                return;
            case 7:
            default:
                super.onAnimationEnd(animator);
                return;
            case 8:
                t2.f fVar = (t2.f) this.f1071b;
                fVar.f3723b.setTranslationY(0.0f);
                fVar.b(0.0f);
                return;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                MainActivity mainActivity = (MainActivity) this.f1071b;
                h0 h0Var = mainActivity.f1189x0;
                if (h0Var != null) {
                    ((p) h0Var.f84g).w();
                    mainActivity.f1189x0 = null;
                }
                String str = x1.a.u(mainActivity).v0;
                r1 r1Var = mainActivity.D0;
                if (r1Var != null && str != null && !j.w(str)) {
                    r1Var.f4085l = str;
                    h0 h0Var2 = r1Var.f4079e;
                    if (h0Var2 == null) {
                        r3.g.c("insetsController");
                        throw null;
                    }
                    ((e4.a) h0Var2.f84g).c0(r1Var.b(str));
                }
                String str2 = x1.a.u(mainActivity).f4704w0;
                r1 r1Var2 = mainActivity.D0;
                if (r1Var2 == null || str2 == null || j.w(str2)) {
                    return;
                }
                r1Var2.f4086m = str2;
                h0 h0Var3 = r1Var2.f4079e;
                if (h0Var3 == null) {
                    r3.g.c("insetsController");
                    throw null;
                }
                ((e4.a) h0Var3.f84g).b0(r1Var2.b(str2));
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1070a) {
            case 4:
                ((s0) this.f1071b).c();
                break;
            case 5:
            default:
                super.onAnimationStart(animator);
                break;
            case 6:
                q1.e eVar = (q1.e) this.f1071b;
                ArrayList arrayList = new ArrayList(eVar.f3395j);
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((v2.d) arrayList.get(i4)).b(eVar);
                }
                break;
        }
    }

    public /* synthetic */ f(int i4, Object obj) {
        this.f1070a = i4;
        this.f1071b = obj;
    }
}
