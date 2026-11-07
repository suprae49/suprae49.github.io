package n1;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RectF f3094a = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f3095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f3096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f3097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3098e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f3099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f3101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f3103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f3105m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Path f3106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f3107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f3108q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3109r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3110s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3111t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3112u;

    public c() {
        Paint paint = new Paint();
        this.f3095b = paint;
        Paint paint2 = new Paint();
        this.f3096c = paint2;
        Paint paint3 = new Paint();
        this.f3097d = paint3;
        this.f3098e = 0.0f;
        this.f = 0.0f;
        this.f3099g = 0.0f;
        this.f3100h = 5.0f;
        this.f3107p = 1.0f;
        this.f3111t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i4) {
        this.f3102j = i4;
        this.f3112u = this.f3101i[i4];
    }
}
