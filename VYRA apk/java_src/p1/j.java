package p1;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f3295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3296b;

    public j(View view, ArrayList arrayList) {
        this.f3295a = view;
        this.f3296b = arrayList;
    }

    @Override // p1.p
    public final void a(r rVar) {
        rVar.z(this);
        this.f3295a.setVisibility(8);
        ArrayList arrayList = this.f3296b;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((View) arrayList.get(i4)).setVisibility(0);
        }
    }

    @Override // p1.p
    public final void f(r rVar) {
        rVar.z(this);
        rVar.a(this);
    }

    @Override // p1.p
    public final void b(r rVar) {
    }

    @Override // p1.p
    public final void c() {
    }

    @Override // p1.p
    public final void d() {
    }
}
