package androidx.emoji2.text;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import k1.l0;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f552h;

    public i(List list, int i4, Throwable th) {
        this.f = 0;
        h0.g(list, "initCallbacks cannot be null");
        this.f552h = new ArrayList(list);
        this.f551g = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f552h;
                int size = arrayList.size();
                int i4 = 0;
                if (this.f551g == 1) {
                    while (i4 < size) {
                        ((h) arrayList.get(i4)).b();
                        i4++;
                    }
                } else {
                    while (i4 < size) {
                        ((h) arrayList.get(i4)).a();
                        i4++;
                    }
                }
                break;
            case 1:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.l) this.f552h).f1436m;
                if (!recyclerView.B) {
                    l0 l0Var = recyclerView.f932r;
                    if (l0Var != null) {
                        l0Var.y0(recyclerView, this.f551g);
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    }
                    break;
                }
                break;
            case 2:
                e0.b bVar = (e0.b) ((a3.h0) this.f552h).f84g;
                if (bVar != null) {
                    bVar.h(this.f551g);
                }
                break;
            default:
                ((u2.f) this.f552h).k(this.f551g);
                break;
        }
    }

    public /* synthetic */ i(int i4, int i5, Object obj) {
        this.f = i5;
        this.f552h = obj;
        this.f551g = i4;
    }
}
