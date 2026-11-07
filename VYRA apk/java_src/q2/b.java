package q2;

import a3.g0;
import a3.m;
import a3.o;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable.ConstantState f3453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3457e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3462k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3464m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3465o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f3466p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3467q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f3468r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3469s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m f3470t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3471u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3472v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f3473w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int[] f3474x;

    public b(b bVar) {
        this.f3454b = 0;
        this.f3455c = false;
        this.f3456d = Integer.MIN_VALUE;
        this.f3457e = false;
        this.f = Integer.MIN_VALUE;
        this.f3458g = Integer.MIN_VALUE;
        this.f3459h = Integer.MIN_VALUE;
        this.f3460i = Integer.MIN_VALUE;
        this.f3461j = Float.NaN;
        this.f3462k = Integer.MIN_VALUE;
        this.f3463l = Float.NaN;
        this.f3464m = Integer.MIN_VALUE;
        this.n = Float.NaN;
        this.f3465o = Integer.MIN_VALUE;
        this.f3466p = Float.NaN;
        this.f3467q = Integer.MIN_VALUE;
        this.f3468r = Float.NaN;
        this.f3469s = Integer.MIN_VALUE;
        this.f3470t = null;
        this.f3471u = Integer.MIN_VALUE;
        this.f3472v = Integer.MIN_VALUE;
        this.f3473w = null;
        this.f3474x = FocusRingDrawable.f1489v;
        if (bVar != null) {
            this.f3453a = bVar.f3453a;
            this.f3454b = bVar.f3454b;
            this.f3455c = bVar.f3455c;
            this.f3456d = bVar.f3456d;
            this.f3457e = bVar.f3457e;
            this.f = bVar.f;
            this.f3458g = bVar.f3458g;
            this.f3459h = bVar.f3459h;
            this.f3460i = bVar.f3460i;
            this.f3461j = bVar.f3461j;
            this.f3462k = bVar.f3462k;
            this.f3463l = bVar.f3463l;
            this.f3464m = bVar.f3464m;
            this.n = bVar.n;
            this.f3465o = bVar.f3465o;
            this.f3466p = bVar.f3466p;
            this.f3467q = bVar.f3467q;
            this.f3468r = bVar.f3468r;
            this.f3469s = bVar.f3469s;
            this.f3471u = bVar.f3471u;
            this.f3472v = bVar.f3472v;
            m mVar = bVar.f3470t;
            if (mVar instanceof o) {
                this.f3470t = ((o) mVar).k().a();
            } else if (mVar instanceof g0) {
                this.f3470t = ((g0) mVar).i().b();
            } else {
                this.f3470t = mVar;
            }
            if (bVar.f3473w != null) {
                this.f3473w = new Rect(bVar.f3473w);
            }
            int[] iArr = bVar.f3474x;
            this.f3474x = Arrays.copyOf(iArr, iArr.length);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.f3453a;
        return (constantState != null ? constantState.getChangingConfigurations() : 0) | this.f3454b;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, null, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources, null);
    }
}
