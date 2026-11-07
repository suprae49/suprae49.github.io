package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import co.median.android.eeqadjy.R;
import java.util.WeakHashMap;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f333h;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f333h = -1;
        int[] iArr = d.a.f1640k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        p0.l(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f);
        }
    }

    private void setStacked(boolean z4) {
        if (this.f332g != z4) {
            if (!z4 || this.f) {
                this.f332g = z4;
                setOrientation(z4 ? 1 : 0);
                setGravity(z4 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z4 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int iMakeMeasureSpec;
        boolean z4;
        int i6;
        int size = View.MeasureSpec.getSize(i4);
        int paddingBottom = 0;
        if (this.f) {
            if (size > this.f333h && this.f332g) {
                setStacked(false);
            }
            this.f333h = size;
        }
        if (this.f332g || View.MeasureSpec.getMode(i4) != 1073741824) {
            iMakeMeasureSpec = i4;
            z4 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z4 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i5);
        if (this.f && !this.f332g && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z4 = true;
        }
        if (z4) {
            super.onMeasure(i4, i5);
        }
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            i6 = -1;
            if (i7 >= childCount) {
                i7 = -1;
                break;
            } else if (getChildAt(i7).getVisibility() == 0) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            View childAt = getChildAt(i7);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f332g) {
                int childCount2 = getChildCount();
                for (int i8 = i7 + 1; i8 < childCount2; i8++) {
                    if (getChildAt(i8).getVisibility() == 0) {
                        i6 = i8;
                        break;
                    }
                }
                paddingBottom = i6 >= 0 ? getChildAt(i6).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = p0.f3233a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i5 == 0) {
                super.onMeasure(i4, i5);
            }
        }
    }

    public void setAllowStacking(boolean z4) {
        if (this.f != z4) {
            this.f = z4;
            if (!z4 && this.f332g) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
