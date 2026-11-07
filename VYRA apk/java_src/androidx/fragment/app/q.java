package androidx.fragment.app;

import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.server.response.FastParser;
import java.io.FileNotFoundException;
import p0.t1;
import p0.y1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements d3.g0, m0.g, p1.q, p0.q {
    public final /* synthetic */ int f;

    public /* synthetic */ q(int i4) {
        this.f = i4;
    }

    public static /* synthetic */ void c() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void e(int i4, int i5, Object obj) {
        StringBuilder sb = new StringBuilder(i4);
        sb.append(obj);
        sb.append(i5);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void f(int i4, String str) throws FastParser.ParseException {
        throw new FastParser.ParseException(str + ((char) i4));
    }

    public static /* synthetic */ void g(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void j(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void k(String str, int i4, Object obj) {
        throw new IllegalArgumentException(str + i4 + obj);
    }

    public static /* synthetic */ void l(String str, int i4, Object obj, int i5) {
        throw new IndexOutOfBoundsException(str + i4 + obj + i5);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void o(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void q(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void r(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void s(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void t(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void v(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // p1.q
    public void a(p1.p pVar, p1.r rVar) {
        switch (this.f) {
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                pVar.e(rVar);
                break;
            case 19:
                pVar.a(rVar);
                break;
            case 20:
                pVar.b(rVar);
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                pVar.c();
                break;
            default:
                pVar.d();
                break;
        }
    }

    @Override // m0.g
    public boolean b() {
        return false;
    }

    @Override // p0.q
    public y1 d(View view, y1 y1Var) {
        y0.f fVar = (y0.f) view;
        t1 t1Var = y1Var.f3268a;
        boolean z4 = false;
        boolean z5 = t1Var.m().f2068b > 0;
        fVar.D = y1Var;
        fVar.E = z5;
        if (!z5 && fVar.getBackground() == null) {
            z4 = true;
        }
        fVar.setWillNotDraw(z4);
        fVar.requestLayout();
        return t1Var.c();
    }
}
