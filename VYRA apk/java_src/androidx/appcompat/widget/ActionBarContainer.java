package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import co.median.android.eeqadjy.R;
import k.k2;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f288m;
    public final int n;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new k.b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.f1631a);
        boolean z4 = false;
        this.f284i = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f285j = typedArrayObtainStyledAttributes.getDrawable(2);
        this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f287l = true;
            this.f286k = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f287l ? !(this.f284i != null || this.f285j != null) : this.f286k == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f284i;
        if (drawable != null && drawable.isStateful()) {
            this.f284i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f285j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f285j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f286k;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f286k.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f284i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f285j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f286k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f282g = findViewById(R.id.action_bar);
        this.f283h = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        boolean z5 = true;
        if (this.f287l) {
            Drawable drawable = this.f286k;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z5 = false;
            }
        } else {
            if (this.f284i == null) {
                z5 = false;
            } else if (this.f282g.getVisibility() == 0) {
                this.f284i.setBounds(this.f282g.getLeft(), this.f282g.getTop(), this.f282g.getRight(), this.f282g.getBottom());
            } else {
                View view = this.f283h;
                if (view == null || view.getVisibility() != 0) {
                    this.f284i.setBounds(0, 0, 0, 0);
                } else {
                    this.f284i.setBounds(this.f283h.getLeft(), this.f283h.getTop(), this.f283h.getRight(), this.f283h.getBottom());
                }
            }
            this.f288m = false;
        }
        if (z5) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        if (this.f282g == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i6 = this.n) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i4, i5);
        if (this.f282g == null) {
            return;
        }
        View.MeasureSpec.getMode(i5);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f284i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f284i);
        }
        this.f284i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f282g;
            if (view != null) {
                this.f284i.setBounds(view.getLeft(), this.f282g.getTop(), this.f282g.getRight(), this.f282g.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f287l ? !(this.f284i != null || this.f285j != null) : this.f286k == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f286k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f286k);
        }
        this.f286k = drawable;
        boolean z4 = this.f287l;
        boolean z5 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z4 && (drawable2 = this.f286k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z4 ? !(this.f284i != null || this.f285j != null) : this.f286k == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f285j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f285j);
        }
        this.f285j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f288m && this.f285j != null) {
                throw null;
            }
        }
        boolean z4 = false;
        if (!this.f287l ? !(this.f284i != null || this.f285j != null) : this.f286k == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z4) {
        this.f = z4;
        setDescendantFocusability(z4 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z4 = i4 == 0;
        Drawable drawable = this.f284i;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
        Drawable drawable2 = this.f285j;
        if (drawable2 != null) {
            drawable2.setVisible(z4, false);
        }
        Drawable drawable3 = this.f286k;
        if (drawable3 != null) {
            drawable3.setVisible(z4, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f284i;
        boolean z4 = this.f287l;
        if (drawable == drawable2 && !z4) {
            return true;
        }
        if (drawable == this.f285j && this.f288m) {
            return true;
        }
        return (drawable == this.f286k && z4) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public void setTabContainer(k2 k2Var) {
    }
}
