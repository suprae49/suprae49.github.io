package p1;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f3306e;

    public k(m mVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f3306e = mVar;
        this.f3302a = obj;
        this.f3303b = arrayList;
        this.f3304c = obj2;
        this.f3305d = arrayList2;
    }

    @Override // p1.p
    public final void a(r rVar) {
        rVar.z(this);
    }

    @Override // p1.s, p1.p
    public final void f(r rVar) {
        m mVar = this.f3306e;
        Object obj = this.f3302a;
        if (obj != null) {
            mVar.s(obj, this.f3303b, null);
        }
        Object obj2 = this.f3304c;
        if (obj2 != null) {
            mVar.s(obj2, this.f3305d, null);
        }
    }
}
