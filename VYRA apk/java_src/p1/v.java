package p1;

import android.view.ViewGroup;
import co.median.android.eeqadjy.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3350a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f3351b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f3352c = new ArrayList();

    public static void a(ViewGroup viewGroup, r rVar) {
        ArrayList arrayList = f3352c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (rVar == null) {
            rVar = f3350a;
        }
        r rVarClone = rVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                ((r) obj).y(viewGroup);
            }
        }
        rVarClone.i(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            androidx.fragment.app.q.c();
            return;
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        u uVar = new u();
        uVar.f = rVarClone;
        uVar.f3349g = viewGroup;
        viewGroup.addOnAttachStateChangeListener(uVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(uVar);
    }

    public static p.f b() {
        p.f fVar;
        ThreadLocal threadLocal = f3351b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (fVar = (p.f) weakReference.get()) != null) {
            return fVar;
        }
        p.f fVar2 = new p.f(0);
        threadLocal.set(new WeakReference(fVar2));
        return fVar2;
    }
}
