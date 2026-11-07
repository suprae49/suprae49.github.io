package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ArrayList f708i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ArrayList f709j;

    public j1(int i4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f = i4;
        this.f706g = arrayList;
        this.f707h = arrayList2;
        this.f708i = arrayList3;
        this.f709j = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i4 = 0; i4 < this.f; i4++) {
            View view = (View) this.f706g.get(i4);
            String str = (String) this.f707h.get(i4);
            WeakHashMap weakHashMap = p0.p0.f3233a;
            view.setTransitionName(str);
            ((View) this.f708i.get(i4)).setTransitionName((String) this.f709j.get(i4));
        }
    }
}
