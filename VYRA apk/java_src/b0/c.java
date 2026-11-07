package b0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Activity f995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f997i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f998j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f999k = false;

    public c(Activity activity) {
        this.f995g = activity;
        this.f996h = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f995g == activity) {
            this.f995g = null;
            this.f998j = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f998j || this.f999k || this.f997i) {
            return;
        }
        Object obj = this.f;
        try {
            Object obj2 = d.f1002c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f996h) {
                d.f1005g.postAtFrontOfQueue(new b(d.f1001b.get(activity), obj2, 2, false));
                this.f999k = true;
                this.f = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f995g == activity) {
            this.f997i = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
