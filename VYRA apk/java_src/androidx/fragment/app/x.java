package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.a f782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.b f783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fragment f784e;

    public x(Fragment fragment, w wVar, AtomicReference atomicReference, c.a aVar, b.b bVar) {
        this.f784e = fragment;
        this.f780a = wVar;
        this.f781b = atomicReference;
        this.f782c = aVar;
        this.f783d = bVar;
    }

    @Override // androidx.fragment.app.a0
    public final void a() {
        b.h hVarJ;
        Fragment fragment = this.f784e;
        String strGenerateActivityResultKey = fragment.generateActivityResultKey();
        w wVar = this.f780a;
        switch (wVar.f) {
            case 0:
                Fragment fragment2 = (Fragment) wVar.f773g;
                Object obj = fragment2.mHost;
                hVarJ = !(obj instanceof b.i) ? fragment2.requireActivity().n : ((b.i) obj).j();
                break;
            default:
                hVarJ = (b.h) wVar.f773g;
                break;
        }
        this.f781b.set(hVarJ.c(strGenerateActivityResultKey, fragment, this.f782c, this.f783d));
    }
}
