package u1;

import android.util.Log;
import android.webkit.ValueCallback;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends k3.e implements q3.p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r0.b f3898j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Exception f3899k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(r0.b bVar, Exception exc, i3.c cVar) {
        super(cVar);
        this.f3898j = bVar;
        this.f3899k = exc;
    }

    @Override // q3.p
    public final Object f(Object obj, Object obj2) throws Throwable {
        e1 e1Var = (e1) h((i3.c) obj2, (z3.j) obj);
        g3.g gVar = g3.g.f2156a;
        e1Var.i(gVar);
        return gVar;
    }

    @Override // k3.e
    public final i3.c h(i3.c cVar, Object obj) {
        return new e1(this.f3898j, this.f3899k, cVar);
    }

    @Override // k3.e
    public final Object i(Object obj) throws Throwable {
        h0.q0(obj);
        Log.e("u1.e2", "onFailure: ", this.f3899k);
        e2 e2Var = (e2) this.f3898j.f;
        ValueCallback valueCallback = e2Var.f3916r;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
            e2Var.f3916r = null;
        }
        return g3.g.f2156a;
    }
}
