package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Drawable.ConstantState {
    public PorterDuff.Mode A;
    public boolean B;
    public boolean C;
    public int[][] D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f2107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources f2108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2111e;
    public SparseArray f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable[] f2112g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f2115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2116k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2117l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2118m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2119o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2120p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2121q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2122r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2123s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2124t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2125u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2126v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2127w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ColorFilter f2128x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f2129y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f2130z;

    public c(c cVar, d dVar, Resources resources) {
        this.f2125u = true;
        this.f2107a = dVar;
        this.f2108b = resources != null ? resources : cVar != null ? cVar.f2108b : null;
        int i4 = resources != null ? resources.getDisplayMetrics().densityDpi : cVar != null ? cVar.f2109c : 0;
        i4 = i4 == 0 ? 160 : i4;
        this.f2109c = i4;
        if (cVar != null) {
            this.f2110d = cVar.f2110d;
            this.f2111e = cVar.f2111e;
            this.f2123s = true;
            this.f2124t = true;
            this.f2125u = cVar.f2125u;
            this.f2126v = cVar.f2126v;
            this.f2127w = cVar.f2127w;
            this.f2128x = cVar.f2128x;
            this.f2129y = cVar.f2129y;
            this.f2130z = cVar.f2130z;
            this.A = cVar.A;
            this.B = cVar.B;
            this.C = cVar.C;
            if (cVar.f2109c == i4) {
                if (cVar.f2114i) {
                    this.f2115j = cVar.f2115j != null ? new Rect(cVar.f2115j) : null;
                    this.f2114i = true;
                }
                if (cVar.f2116k) {
                    this.f2117l = cVar.f2117l;
                    this.f2118m = cVar.f2118m;
                    this.n = cVar.n;
                    this.f2119o = cVar.f2119o;
                    this.f2116k = true;
                }
            }
            if (cVar.f2120p) {
                this.f2121q = cVar.f2121q;
                this.f2120p = true;
            }
            if (cVar.f2122r) {
                this.f2122r = true;
            }
            Drawable[] drawableArr = cVar.f2112g;
            this.f2112g = new Drawable[drawableArr.length];
            this.f2113h = cVar.f2113h;
            SparseArray sparseArray = cVar.f;
            if (sparseArray != null) {
                this.f = sparseArray.clone();
            } else {
                this.f = new SparseArray(this.f2113h);
            }
            int i5 = this.f2113h;
            for (int i6 = 0; i6 < i5; i6++) {
                Drawable drawable = drawableArr[i6];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i6, constantState);
                    } else {
                        this.f2112g[i6] = drawableArr[i6];
                    }
                }
            }
        } else {
            this.f2112g = new Drawable[10];
            this.f2113h = 0;
        }
        if (cVar != null) {
            this.D = cVar.D;
        } else {
            this.D = new int[this.f2112g.length][];
        }
    }

    public final void a() {
        SparseArray sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int iKeyAt = this.f.keyAt(i4);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.valueAt(i4);
                Drawable[] drawableArr = this.f2112g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f2108b);
                drawableNewDrawable.setLayoutDirection(this.f2126v);
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f2107a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f = null;
        }
    }

    public final Drawable b(int i4) {
        int iIndexOfKey;
        Drawable drawable = this.f2112g[i4];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i4)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f.valueAt(iIndexOfKey)).newDrawable(this.f2108b);
        drawableNewDrawable.setLayoutDirection(this.f2126v);
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f2107a);
        this.f2112g[i4] = drawableMutate;
        this.f.removeAt(iIndexOfKey);
        if (this.f.size() == 0) {
            this.f = null;
        }
        return drawableMutate;
    }

    public final void c() {
        int[][] iArr = this.D;
        int[][] iArr2 = new int[iArr.length][];
        for (int length = iArr.length - 1; length >= 0; length--) {
            int[] iArr3 = this.D[length];
            iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
        }
        this.D = iArr2;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i4 = this.f2113h;
        Drawable[] drawableArr = this.f2112g;
        for (int i5 = 0; i5 < i4; i5++) {
            Drawable drawable = drawableArr[i5];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.get(i5);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f2110d | this.f2111e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new d(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new d(this, resources);
    }
}
