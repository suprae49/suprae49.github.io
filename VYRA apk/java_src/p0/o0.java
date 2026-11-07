package p0;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import co.median.android.eeqadjy.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f3228d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap f3229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SparseArray f3230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f3231c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f3229a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewA = a(viewGroup.getChildAt(childCount));
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || (size = arrayList.size() - 1) < 0) {
            return null;
        }
        throw androidx.fragment.app.u.i(size, arrayList);
    }
}
