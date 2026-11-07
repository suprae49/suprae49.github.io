package q1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f3434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f3435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f3436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3437e;
    public Bitmap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f3438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f3439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f3443l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f3433a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new o(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new o(this);
    }
}
