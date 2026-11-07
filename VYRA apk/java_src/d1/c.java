package d1;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1656a = b.f1655a;

    public static b a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager().getClass();
            }
            fragment = fragment.getParentFragment();
        }
        return f1656a;
    }

    public static void b(g gVar) {
        if (u0.G(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(gVar.f.getClass().getName()), gVar);
        }
    }

    public static final void c(Fragment fragment, String str) {
        str.getClass();
        b(new a(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str));
        a(fragment).getClass();
    }
}
