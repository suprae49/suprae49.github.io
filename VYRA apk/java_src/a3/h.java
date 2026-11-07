package a3;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class h extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f70a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p2.a f71b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f72c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f73d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f74e;
    public PorterDuff.Mode f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f75g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f76h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f77i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f78j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f79k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f80l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f81m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f82o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint.Style f83p;

    public h(h hVar) {
        this.f72c = null;
        this.f73d = null;
        this.f74e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.f75g = null;
        this.f76h = 1.0f;
        this.f77i = 1.0f;
        this.f79k = 255;
        this.f80l = 0.0f;
        this.f81m = 0.0f;
        this.n = 0;
        this.f82o = 0;
        this.f83p = Paint.Style.FILL_AND_STROKE;
        this.f70a = hVar.f70a;
        this.f71b = hVar.f71b;
        this.f78j = hVar.f78j;
        this.f72c = hVar.f72c;
        this.f73d = hVar.f73d;
        this.f = hVar.f;
        this.f74e = hVar.f74e;
        this.f79k = hVar.f79k;
        this.f76h = hVar.f76h;
        this.f82o = hVar.f82o;
        this.f77i = hVar.f77i;
        this.f80l = hVar.f80l;
        this.f81m = hVar.f81m;
        this.n = hVar.n;
        this.f83p = hVar.f83p;
        if (hVar.f75g != null) {
            this.f75g = new Rect(hVar.f75g);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        j jVar = new j(this);
        jVar.f92k = true;
        jVar.f93l = true;
        return jVar;
    }

    public h(m mVar) {
        this.f72c = null;
        this.f73d = null;
        this.f74e = null;
        this.f = PorterDuff.Mode.SRC_IN;
        this.f75g = null;
        this.f76h = 1.0f;
        this.f77i = 1.0f;
        this.f79k = 255;
        this.f80l = 0.0f;
        this.f81m = 0.0f;
        this.n = 0;
        this.f82o = 0;
        this.f83p = Paint.Style.FILL_AND_STROKE;
        this.f70a = mVar;
        this.f71b = null;
    }
}
