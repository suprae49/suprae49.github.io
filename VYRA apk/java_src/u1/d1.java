package u1;

import android.content.Context;
import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.core.content.FileProvider;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends k3.e implements q3.p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r0.b f3870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f3871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ File f3872l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(r0.b bVar, Context context, File file, i3.c cVar) {
        super(cVar);
        this.f3870j = bVar;
        this.f3871k = context;
        this.f3872l = file;
    }

    @Override // q3.p
    public final Object f(Object obj, Object obj2) throws Throwable {
        d1 d1Var = (d1) h((i3.c) obj2, (z3.j) obj);
        g3.g gVar = g3.g.f2156a;
        d1Var.i(gVar);
        return gVar;
    }

    @Override // k3.e
    public final i3.c h(i3.c cVar, Object obj) {
        return new d1(this.f3870j, this.f3871k, this.f3872l, cVar);
    }

    @Override // k3.e
    public final Object i(Object obj) throws Throwable {
        h0.q0(obj);
        Context context = this.f3871k;
        context.getClass();
        Uri uriD = FileProvider.d(context, context.getApplicationContext().getPackageName() + ".fileprovider", this.f3872l);
        uriD.getClass();
        e2 e2Var = (e2) this.f3870j.f;
        ValueCallback valueCallback = e2Var.f3916r;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(new Uri[]{uriD});
            e2Var.f3916r = null;
        }
        return g3.g.f2156a;
    }
}
