package r2;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends FrameLayout {
    public Drawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f3581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Rect f3582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3585k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3586l;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect = this.f3582h;
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f3581g == null || this.f == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f3583i) {
            rect.set(0, 0, width, this.f3581g.top);
            this.f.setBounds(rect);
            this.f.draw(canvas);
        }
        if (this.f3584j) {
            rect.set(0, height - this.f3581g.bottom, width, height);
            this.f.setBounds(rect);
            this.f.draw(canvas);
        }
        if (this.f3585k) {
            Rect rect2 = this.f3581g;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f.setBounds(rect);
            this.f.draw(canvas);
        }
        if (this.f3586l) {
            Rect rect3 = this.f3581g;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.f.setBounds(rect);
            this.f.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z4) {
        this.f3584j = z4;
    }

    public void setDrawLeftInsetForeground(boolean z4) {
        this.f3585k = z4;
    }

    public void setDrawRightInsetForeground(boolean z4) {
        this.f3586l = z4;
    }

    public void setDrawTopInsetForeground(boolean z4) {
        this.f3583i = z4;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f = drawable;
    }
}
