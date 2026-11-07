package g2;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import co.median.android.eeqadjy.R;
import java.util.ArrayList;
import u2.j;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends j {
    public final int g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int f2146h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final int f2147i0;
    public final int j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f2148k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final ArrayList f2149l0;

    public b(Context context) {
        super(context);
        this.f2149l0 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.g0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.f2146h0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.f2147i0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.j0 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        int measuredWidth = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                if (getLayoutDirection() == 1) {
                    int i11 = i8 - measuredWidth;
                    childAt.layout(i11 - childAt.getMeasuredWidth(), 0, i11, i9);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i9);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        int i6;
        int iMax;
        int i7;
        int iMin;
        int i8;
        int i9;
        int i10;
        int size = View.MeasureSpec.getSize(i4);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        int childCount = getChildCount();
        ArrayList arrayList = this.f2149l0;
        arrayList.clear();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5), Integer.MIN_VALUE);
        int i11 = 0;
        if (getItemIconGravity() == 0) {
            int labelVisibilityMode = getLabelVisibilityMode();
            int i12 = this.f2147i0;
            if (labelVisibilityMode != -1 ? labelVisibilityMode != 0 : currentVisibleContentItemCount <= 3) {
                iMin = Math.min(size / (currentVisibleContentItemCount != 0 ? currentVisibleContentItemCount : 1), i12);
                i8 = size - (currentVisibleContentItemCount * iMin);
                for (i9 = 0; i9 < childCount; i9++) {
                    if (getChildAt(i9).getVisibility() != 8) {
                        i10 = 0;
                    } else if (i8 > 0) {
                        i10 = iMin + 1;
                        i8--;
                    } else {
                        i10 = iMin;
                    }
                    arrayList.add(Integer.valueOf(i10));
                }
            } else if (this.f2148k0) {
                View childAt = getChildAt(getSelectedItemPosition());
                int visibility = childAt.getVisibility();
                int iMax2 = this.j0;
                if (visibility != 8) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), iMakeMeasureSpec);
                    iMax2 = Math.max(iMax2, childAt.getMeasuredWidth());
                }
                int i13 = currentVisibleContentItemCount - (childAt.getVisibility() != 8 ? 1 : 0);
                int iMin2 = Math.min(size - (this.f2146h0 * i13), Math.min(iMax2, i12));
                int i14 = size - iMin2;
                int iMin3 = Math.min(i14 / (i13 != 0 ? i13 : 1), this.g0);
                int i15 = i14 - (i13 * iMin3);
                int i16 = 0;
                while (i16 < childCount) {
                    if (getChildAt(i16).getVisibility() != 8) {
                        i7 = i16 == getSelectedItemPosition() ? iMin2 : iMin3;
                        if (i15 > 0) {
                            i7++;
                            i15--;
                        }
                    } else {
                        i7 = 0;
                    }
                    arrayList.add(Integer.valueOf(i7));
                    i16++;
                }
            } else {
                iMin = Math.min(size / (currentVisibleContentItemCount != 0 ? currentVisibleContentItemCount : 1), i12);
                i8 = size - (currentVisibleContentItemCount * iMin);
                while (i9 < childCount) {
                    if (getChildAt(i9).getVisibility() != 8) {
                        i10 = 0;
                    } else if (i8 > 0) {
                        i10 = iMin + 1;
                        i8--;
                    } else {
                        i10 = iMin;
                    }
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            i6 = 0;
            iMax = 0;
            while (i11 < childCount) {
                View childAt2 = getChildAt(i11);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(((Integer) arrayList.get(i11)).intValue(), 1073741824), iMakeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    int measuredWidth = childAt2.getMeasuredWidth() + i6;
                    iMax = Math.max(iMax, childAt2.getMeasuredHeight());
                    i6 = measuredWidth;
                }
                i11++;
            }
        } else {
            if (currentVisibleContentItemCount == 0) {
                currentVisibleContentItemCount = 1;
            }
            float f = size;
            float fMin = Math.min((currentVisibleContentItemCount + 3) / 10.0f, 0.9f) * f;
            float f4 = currentVisibleContentItemCount;
            int iRound = Math.round(fMin / f4);
            int iRound2 = Math.round(f / f4);
            int i17 = 0;
            int iMax3 = 0;
            while (i11 < childCount) {
                View childAt3 = getChildAt(i11);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound2, Integer.MIN_VALUE), iMakeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < iRound) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(iRound, 1073741824), iMakeMeasureSpec);
                    }
                    int measuredWidth2 = childAt3.getMeasuredWidth() + i17;
                    iMax3 = Math.max(iMax3, childAt3.getMeasuredHeight());
                    i17 = measuredWidth2;
                }
                i11++;
            }
            i6 = i17;
            iMax = iMax3;
        }
        setMeasuredDimension(i6, Math.max(iMax, getSuggestedMinimumHeight()));
    }

    public void setItemHorizontalTranslationEnabled(boolean z4) {
        this.f2148k0 = z4;
    }
}
