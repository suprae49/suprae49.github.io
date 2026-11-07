package p0;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends a1.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3184e;

    public d0(int i4, Class cls, int i5, int i6, int i7) {
        this.f3184e = i7;
        this.f7a = i4;
        this.f10d = cls;
        this.f9c = i5;
        this.f8b = i6;
    }

    @Override // a1.c
    public final Object b(View view) {
        switch (this.f3184e) {
            case 0:
                return Boolean.valueOf(k0.c(view));
            case 1:
                return k0.a(view);
            case 2:
                return m0.b(view);
            default:
                return Boolean.valueOf(k0.b(view));
        }
    }

    @Override // a1.c
    public final void c(View view, Object obj) {
        switch (this.f3184e) {
            case 0:
                k0.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                k0.e(view, (CharSequence) obj);
                break;
            case 2:
                m0.c(view, (CharSequence) obj);
                break;
            default:
                k0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // a1.c
    public final boolean e(Object obj, Object obj2) {
        boolean zEquals;
        switch (this.f3184e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !zEquals;
    }
}
