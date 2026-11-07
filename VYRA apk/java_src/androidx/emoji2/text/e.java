package androidx.emoji2.text;

import android.os.Build;
import java.util.ArrayList;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f544e;

    public e(f fVar) {
        this.f544e = fVar;
    }

    @Override // u1.h0
    public final void P(Throwable th) {
        this.f544e.f545a.d(th);
    }

    @Override // u1.h0
    public final void R(x xVar) {
        f fVar = this.f544e;
        fVar.f547c = xVar;
        x xVar2 = fVar.f547c;
        k kVar = fVar.f545a;
        fVar.f546b = new t(xVar2, kVar.f560g, kVar.f562i, Build.VERSION.SDK_INT >= 34 ? o.a() : e4.a.z());
        k kVar2 = fVar.f545a;
        ArrayList arrayList = new ArrayList();
        kVar2.f555a.writeLock().lock();
        try {
            kVar2.f557c = 1;
            arrayList.addAll(kVar2.f556b);
            kVar2.f556b.clear();
            kVar2.f555a.writeLock().unlock();
            kVar2.f558d.post(new i(arrayList, kVar2.f557c, (Throwable) null));
        } catch (Throwable th) {
            kVar2.f555a.writeLock().unlock();
            throw th;
        }
    }
}
