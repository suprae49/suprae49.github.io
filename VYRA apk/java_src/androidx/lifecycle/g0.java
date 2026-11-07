package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, m mVar) {
        mVar.getClass();
        if (activity instanceof t) {
            o lifecycle = ((t) activity).getLifecycle();
            if (lifecycle instanceof v) {
                ((v) lifecycle).e(mVar);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            i0.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new i0.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new i0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
