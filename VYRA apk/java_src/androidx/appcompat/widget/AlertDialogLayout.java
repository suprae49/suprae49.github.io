package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import co.median.android.eeqadjy.R;
import java.util.WeakHashMap;
import k.t1;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int j(View view) {
        WeakHashMap weakHashMap = p0.f3233a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return j(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int paddingLeft = getPaddingLeft();
        int i11 = i6 - i4;
        int paddingRight = i11 - getPaddingRight();
        int paddingRight2 = (i11 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i12 = gravity & 112;
        int i13 = gravity & 8388615;
        int paddingTop = i12 != 16 ? i12 != 80 ? getPaddingTop() : ((getPaddingTop() + i7) - i5) - measuredHeight : (((i7 - i5) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                t1 t1Var = (t1) childAt.getLayoutParams();
                int i15 = ((LinearLayout.LayoutParams) t1Var).gravity;
                if (i15 < 0) {
                    i15 = i13;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i15, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i10 = ((LinearLayout.LayoutParams) t1Var).leftMargin + paddingLeft;
                    } else {
                        i8 = paddingRight - measuredWidth;
                        i9 = ((LinearLayout.LayoutParams) t1Var).rightMargin;
                    }
                    if (i(i14)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i16 = paddingTop + ((LinearLayout.LayoutParams) t1Var).topMargin;
                    childAt.layout(i10, i16, measuredWidth + i10, i16 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) t1Var).bottomMargin + i16;
                } else {
                    i8 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) t1Var).leftMargin;
                    i9 = ((LinearLayout.LayoutParams) t1Var).rightMargin;
                }
                i10 = i8 - i9;
                if (i(i14)) {
                    paddingTop += intrinsicHeight;
                }
                int i17 = paddingTop + ((LinearLayout.LayoutParams) t1Var).topMargin;
                childAt.layout(i10, i17, measuredWidth + i10, i17 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) t1Var).bottomMargin + i17;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i4, int i5) {
        int iCombineMeasuredStates;
        int iJ;
        int measuredHeight;
        int measuredHeight2;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = alertDialogLayout.getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i4, i5);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i4);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i4, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i4, 0);
            iJ = j(view2);
            measuredHeight = view2.getMeasuredHeight() - iJ;
            paddingBottom += iJ;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iJ = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i4, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i7 = size - paddingBottom;
        if (view2 != null) {
            int i8 = paddingBottom - iJ;
            int iMin = Math.min(i7, measuredHeight);
            if (iMin > 0) {
                i7 -= iMin;
                iJ += iMin;
            }
            view2.measure(i4, View.MeasureSpec.makeMeasureSpec(iJ, 1073741824));
            paddingBottom = i8 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i7 > 0) {
            view3.measure(i4, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i7, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = alertDialogLayout.getChildAt(i9);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int i10 = i5;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + iMax, i4, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i10, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i11 = 0;
            while (i11 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i11);
                if (childAt3.getVisibility() != 8) {
                    t1 t1Var = (t1) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) t1Var).width == -1) {
                        int i12 = ((LinearLayout.LayoutParams) t1Var).height;
                        ((LinearLayout.LayoutParams) t1Var).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i10, 0);
                        ((LinearLayout.LayoutParams) t1Var).height = i12;
                    }
                }
                i11++;
                alertDialogLayout = this;
                i10 = i5;
            }
        }
    }
}
