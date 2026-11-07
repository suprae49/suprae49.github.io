package k1;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((androidx.recyclerview.widget.b) ((d0) ((Observable) this).mObservers.get(size))).f972a;
            recyclerView.i(null);
            recyclerView.f920k0.f = true;
            recyclerView.U(true);
            if (!recyclerView.f916i.j()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i4, int i5) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((androidx.recyclerview.widget.b) ((d0) ((Observable) this).mObservers.get(size))).f972a;
            recyclerView.i(null);
            k.o oVar = recyclerView.f916i;
            ArrayList arrayList = (ArrayList) oVar.f2595c;
            if (i5 >= 1) {
                arrayList.add(oVar.l(null, 4, i4, i5));
                oVar.f2593a |= 4;
                if (arrayList.size() == 1) {
                    int[] iArr = RecyclerView.D0;
                    if (recyclerView.f943x && recyclerView.f941w) {
                        y yVar = recyclerView.f923m;
                        WeakHashMap weakHashMap = p0.p0.f3233a;
                        recyclerView.postOnAnimation(yVar);
                    } else {
                        recyclerView.E = true;
                        recyclerView.requestLayout();
                    }
                }
            }
        }
    }
}
