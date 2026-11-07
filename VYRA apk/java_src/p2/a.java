package p2;

import android.content.Context;
import co.median.android.eeqadjy.R;
import t1.l;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final int f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f3360e;

    public a(Context context) {
        boolean zQ = l.q(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        Integer numU = e4.a.u(context, R.attr.elevationOverlayColor);
        int iIntValue = numU != null ? numU.intValue() : 0;
        Integer numU2 = e4.a.u(context, R.attr.elevationOverlayAccentColor);
        int iIntValue2 = numU2 != null ? numU2.intValue() : 0;
        Integer numU3 = e4.a.u(context, R.attr.colorSurface);
        int iIntValue3 = numU3 != null ? numU3.intValue() : 0;
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f3356a = zQ;
        this.f3357b = iIntValue;
        this.f3358c = iIntValue2;
        this.f3359d = iIntValue3;
        this.f3360e = f4;
    }
}
