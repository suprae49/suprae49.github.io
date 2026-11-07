package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends g {
    final /* synthetic */ f0 this$0;

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public static final class a extends g {
        final /* synthetic */ f0 this$0;

        public a(f0 f0Var) {
            this.this$0 = f0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            f0 f0Var = this.this$0;
            int i4 = f0Var.f + 1;
            f0Var.f = i4;
            if (i4 == 1 && f0Var.f822i) {
                f0Var.f824k.e(m.ON_START);
                f0Var.f822i = false;
            }
        }
    }

    public e0(f0 f0Var) {
        this.this$0 = f0Var;
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i4 = i0.f827g;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((i0) fragmentFindFragmentByTag).f = this.this$0.f826m;
        }
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        f0 f0Var = this.this$0;
        int i4 = f0Var.f820g - 1;
        f0Var.f820g = i4;
        if (i4 == 0) {
            Handler handler = f0Var.f823j;
            handler.getClass();
            handler.postDelayed(f0Var.f825l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        d0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        f0 f0Var = this.this$0;
        int i4 = f0Var.f - 1;
        f0Var.f = i4;
        if (i4 == 0 && f0Var.f821h) {
            f0Var.f824k.e(m.ON_STOP);
            f0Var.f822i = true;
        }
    }
}
