package r2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends LinearLayoutCompat {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f3542u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f3543v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f3544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f3545x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f3546y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3547z;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f3543v = new Rect();
        this.f3544w = new Rect();
        this.f3545x = 119;
        this.f3546y = true;
        this.f3547z = false;
        a0.a(context, attributeSet, 0, 0);
        int[] iArr = a2.a.f23o;
        a0.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f3545x = typedArrayObtainStyledAttributes.getInt(1, this.f3545x);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f3546y = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f3542u;
        if (drawable != null) {
            if (this.f3547z) {
                this.f3547z = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z4 = this.f3546y;
                Rect rect = this.f3543v;
                if (z4) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i4 = this.f3545x;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f3544w;
                Gravity.apply(i4, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f4) {
        super.drawableHotspotChanged(f, f4);
        Drawable drawable = this.f3542u;
        if (drawable != null) {
            drawable.setHotspot(f, f4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3542u;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f3542u.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f3542u;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f3545x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3542u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        this.f3547z = z4 | this.f3547z;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.f3547z = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f3542u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f3542u);
            }
            this.f3542u = drawable;
            this.f3547z = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f3545x == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i4) {
        if (this.f3545x != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f3545x = i4;
            if (i4 == 119 && this.f3542u != null) {
                this.f3542u.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3542u;
    }
}
