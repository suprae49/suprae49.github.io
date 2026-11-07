package z2;

import android.graphics.Paint;
import android.graphics.Path;
import f0.b;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f4881i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f4882j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f4883k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f4884l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f4885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f4886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f4887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4889e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f4890g = new Path();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f4891h;

    public a() {
        Paint paint = new Paint();
        this.f4891h = paint;
        Paint paint2 = new Paint();
        this.f4885a = paint2;
        this.f4888d = b.d(-16777216, 68);
        this.f4889e = b.d(-16777216, 20);
        this.f = b.d(-16777216, 0);
        paint2.setColor(this.f4888d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f4886b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f4887c = new Paint(paint3);
    }
}
