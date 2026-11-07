package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f702e;

    /* JADX WARN: Code duplicated, block: B:74:0x00f4 A[Catch: RuntimeException -> 0x00fa, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00fa, blocks: (B:72:0x00ee, B:74:0x00f4), top: B:85:0x00ee }] */
    public final e c(Context context) {
        int enterAnim;
        e eVar;
        Animator animatorLoadAnimator;
        int iK0;
        if (this.f701d) {
            return this.f702e;
        }
        o1 o1Var = this.f704a;
        Fragment fragment = o1Var.f738c;
        boolean z4 = o1Var.f736a == 2;
        boolean z5 = this.f700c;
        int nextTransition = fragment.getNextTransition();
        if (z5) {
            enterAnim = z4 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim();
        } else {
            enterAnim = z4 ? fragment.getEnterAnim() : fragment.getExitAnim();
        }
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        e eVar2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z4, enterAnim);
            if (animationOnCreateAnimation != null) {
                eVar2 = new e(animationOnCreateAnimation);
            } else {
                Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z4, enterAnim);
                if (animatorOnCreateAnimator != null) {
                    eVar2 = new e(animatorOnCreateAnimator);
                } else {
                    if (enterAnim == 0 && nextTransition != 0) {
                        if (nextTransition == 4097) {
                            iK0 = z4 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        } else if (nextTransition == 8194) {
                            iK0 = z4 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                        } else if (nextTransition == 8197) {
                            iK0 = z4 ? e4.a.k0(context, android.R.attr.activityCloseEnterAnimation) : e4.a.k0(context, android.R.attr.activityCloseExitAnimation);
                        } else if (nextTransition == 4099) {
                            iK0 = z4 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                        } else if (nextTransition != 4100) {
                            iK0 = -1;
                        } else {
                            iK0 = z4 ? e4.a.k0(context, android.R.attr.activityOpenEnterAnimation) : e4.a.k0(context, android.R.attr.activityOpenExitAnimation);
                        }
                        enterAnim = iK0;
                    }
                    if (enterAnim != 0) {
                        boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(enterAnim));
                        if (zEquals) {
                            try {
                                Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, enterAnim);
                                if (animationLoadAnimation != null) {
                                    eVar = new e(animationLoadAnimation);
                                    eVar2 = eVar;
                                }
                            } catch (Resources.NotFoundException e5) {
                                throw e5;
                            } catch (RuntimeException unused) {
                                try {
                                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                                    if (animatorLoadAnimator != null) {
                                        eVar = new e(animatorLoadAnimator);
                                        eVar2 = eVar;
                                    }
                                } catch (RuntimeException e6) {
                                    if (zEquals) {
                                        throw e6;
                                    }
                                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, enterAnim);
                                    if (animationLoadAnimation2 != null) {
                                        eVar2 = new e(animationLoadAnimation2);
                                    }
                                }
                            }
                        } else {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, enterAnim);
                            if (animatorLoadAnimator != null) {
                                eVar = new e(animatorLoadAnimator);
                                eVar2 = eVar;
                            }
                        }
                    }
                }
            }
        }
        this.f702e = eVar2;
        this.f701d = true;
        return eVar2;
    }
}
