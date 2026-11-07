package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.emoji2.text.t;
import k.p3;
import k.t1;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f345k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f347m;
    public int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f348o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f349p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f350q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f351r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f353t;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f = true;
        this.f341g = -1;
        this.f342h = 0;
        this.f344j = 8388659;
        int[] iArr = d.a.f1643o;
        t tVarS = t.s(i4, 0, context, attributeSet, iArr);
        p0.l(this, context, iArr, attributeSet, (TypedArray) tVarS.f579c, i4);
        TypedArray typedArray = (TypedArray) tVarS.f579c;
        int i5 = typedArray.getInt(1, -1);
        if (i5 >= 0) {
            setOrientation(i5);
        }
        int i6 = typedArray.getInt(0, -1);
        if (i6 >= 0) {
            setGravity(i6);
        }
        boolean z4 = typedArray.getBoolean(2, true);
        if (!z4) {
            setBaselineAligned(z4);
        }
        this.f346l = typedArray.getFloat(4, -1.0f);
        this.f341g = typedArray.getInt(3, -1);
        this.f347m = typedArray.getBoolean(7, false);
        setDividerDrawable(tVarS.i(5));
        this.f352s = typedArray.getInt(8, 0);
        this.f353t = typedArray.getDimensionPixelSize(6, 0);
        tVarS.v();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t1;
    }

    public final void d(Canvas canvas, int i4) {
        this.f349p.setBounds(getPaddingLeft() + this.f353t, i4, (getWidth() - getPaddingRight()) - this.f353t, this.f351r + i4);
        this.f349p.draw(canvas);
    }

    public final void e(Canvas canvas, int i4) {
        this.f349p.setBounds(i4, getPaddingTop() + this.f353t, this.f350q + i4, (getHeight() - getPaddingBottom()) - this.f353t);
        this.f349p.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public t1 generateDefaultLayoutParams() {
        int i4 = this.f343i;
        if (i4 == 0) {
            return new t1(-2, -2);
        }
        if (i4 == 1) {
            return new t1(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public t1 generateLayoutParams(AttributeSet attributeSet) {
        return new t1(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i4;
        if (this.f341g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i5 = this.f341g;
        if (childCount <= i5) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i5);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f341g == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f342h;
        if (this.f343i == 1 && (i4 = this.f344j & 112) != 48) {
            if (i4 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f345k) / 2;
            } else if (i4 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f345k;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((t1) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f341g;
    }

    public Drawable getDividerDrawable() {
        return this.f349p;
    }

    public int getDividerPadding() {
        return this.f353t;
    }

    public int getDividerWidth() {
        return this.f350q;
    }

    public int getGravity() {
        return this.f344j;
    }

    public int getOrientation() {
        return this.f343i;
    }

    public int getShowDividers() {
        return this.f352s;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f346l;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public t1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof t1) {
            return new t1((t1) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new t1((ViewGroup.MarginLayoutParams) layoutParams) : new t1(layoutParams);
    }

    public final boolean i(int i4) {
        if (i4 == 0) {
            return (this.f352s & 1) != 0;
        }
        int childCount = getChildCount();
        int i5 = this.f352s;
        if (i4 == childCount) {
            return (i5 & 4) != 0;
        }
        if ((i5 & 2) != 0) {
            for (int i6 = i4 - 1; i6 >= 0; i6--) {
                if (getChildAt(i6).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i4;
        int bottom;
        if (this.f349p == null) {
            return;
        }
        int i5 = 0;
        if (this.f343i == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i5 < virtualChildCount) {
                View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8 && i(i5)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((t1) childAt.getLayoutParams())).topMargin) - this.f351r);
                }
                i5++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f351r;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((t1) childAt2.getLayoutParams())).bottomMargin;
                }
                d(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z4 = p3.f2612a;
        boolean z5 = getLayoutDirection() == 1;
        while (i5 < virtualChildCount2) {
            View childAt3 = getChildAt(i5);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i5)) {
                t1 t1Var = (t1) childAt3.getLayoutParams();
                e(canvas, z5 ? childAt3.getRight() + ((LinearLayout.LayoutParams) t1Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) t1Var).leftMargin) - this.f350q);
            }
            i5++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                t1 t1Var2 = (t1) childAt4.getLayoutParams();
                if (z5) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) t1Var2).leftMargin;
                    i4 = this.f350q;
                    right = left - i4;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) t1Var2).rightMargin;
                }
            } else if (z5) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i4 = this.f350q;
                right = left - i4;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x015a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x0167  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:70:0x016f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x0183  */
    /* JADX WARN: Code duplicated, block: B:76:0x018a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0191  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int paddingLeft;
        int i8;
        int i9;
        int i10;
        int i11;
        int baseline;
        int i12;
        int i13;
        int i14;
        int measuredHeight;
        int i15;
        int paddingTop;
        int i16;
        int i17;
        int i18;
        int i19 = 8;
        char c4 = 2;
        if (this.f343i == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i20 = i6 - i4;
            int paddingRight = i20 - getPaddingRight();
            int paddingRight2 = (i20 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i21 = this.f344j;
            int i22 = i21 & 112;
            int i23 = 8388615 & i21;
            if (i22 != 16) {
                paddingTop = i22 != 80 ? getPaddingTop() : ((getPaddingTop() + i7) - i5) - this.f345k;
            } else {
                paddingTop = getPaddingTop() + (((i7 - i5) - this.f345k) / 2);
            }
            int i24 = 0;
            while (i24 < virtualChildCount) {
                View childAt = getChildAt(i24);
                if (childAt != null && childAt.getVisibility() != i19) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    t1 t1Var = (t1) childAt.getLayoutParams();
                    int i25 = ((LinearLayout.LayoutParams) t1Var).gravity;
                    if (i25 < 0) {
                        i25 = i23;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i25, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i18 = ((LinearLayout.LayoutParams) t1Var).leftMargin + paddingLeft2;
                        } else {
                            i16 = paddingRight - measuredWidth;
                            i17 = ((LinearLayout.LayoutParams) t1Var).rightMargin;
                        }
                        if (i(i24)) {
                            paddingTop += this.f351r;
                        }
                        int i26 = paddingTop + ((LinearLayout.LayoutParams) t1Var).topMargin;
                        childAt.layout(i18, i26, measuredWidth + i18, i26 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) t1Var).bottomMargin + i26;
                    } else {
                        i16 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) t1Var).leftMargin;
                        i17 = ((LinearLayout.LayoutParams) t1Var).rightMargin;
                    }
                    i18 = i16 - i17;
                    if (i(i24)) {
                        paddingTop += this.f351r;
                    }
                    int i27 = paddingTop + ((LinearLayout.LayoutParams) t1Var).topMargin;
                    childAt.layout(i18, i27, measuredWidth + i18, i27 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) t1Var).bottomMargin + i27;
                }
                i24++;
                c4 = c4;
                i19 = 8;
            }
            return;
        }
        boolean z5 = p3.f2612a;
        boolean z6 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i28 = i7 - i5;
        int paddingBottom = i28 - getPaddingBottom();
        int paddingBottom2 = (i28 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i29 = this.f344j;
        int i30 = 8388615 & i29;
        int i31 = i29 & 112;
        boolean z7 = this.f;
        int[] iArr = this.n;
        int[] iArr2 = this.f348o;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i30, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i6) - i4) - this.f345k;
        } else {
            paddingLeft = getPaddingLeft() + (((i6 - i4) - this.f345k) / 2);
        }
        if (z6) {
            i9 = virtualChildCount2 - 1;
            i8 = -1;
        } else {
            i8 = 1;
            i9 = 0;
        }
        int i32 = 0;
        while (i32 < virtualChildCount2) {
            int i33 = (i8 * i32) + i9;
            View childAt2 = getChildAt(i33);
            if (childAt2 == null) {
                i10 = i9;
            } else {
                i10 = i9;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    t1 t1Var2 = (t1) childAt2.getLayoutParams();
                    int i34 = paddingLeft;
                    if (z7) {
                        i11 = paddingTop2;
                        baseline = ((LinearLayout.LayoutParams) t1Var2).height != -1 ? childAt2.getBaseline() : -1;
                        i12 = ((LinearLayout.LayoutParams) t1Var2).gravity;
                        if (i12 < 0) {
                            i12 = i31;
                        }
                        i13 = i12 & 112;
                        if (i13 != 16) {
                            if (i13 != 48) {
                                i14 = i11 + ((LinearLayout.LayoutParams) t1Var2).topMargin;
                                if (baseline != -1) {
                                    i14 = (iArr[1] - baseline) + i14;
                                }
                            } else if (i13 != 80) {
                                i14 = i11;
                            } else {
                                i14 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) t1Var2).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (i(i33)) {
                                i15 = i34 + this.f350q;
                            } else {
                                i15 = i34;
                            }
                            int i35 = i15 + ((LinearLayout.LayoutParams) t1Var2).leftMargin;
                            childAt2.layout(i35, i14, i35 + measuredWidth2, i14 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) t1Var2).rightMargin + i35;
                        } else {
                            i14 = ((paddingBottom2 - measuredHeight3) / 2) + i11 + ((LinearLayout.LayoutParams) t1Var2).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) t1Var2).bottomMargin;
                        }
                        i14 -= measuredHeight;
                        if (i(i33)) {
                            i15 = i34 + this.f350q;
                        } else {
                            i15 = i34;
                        }
                        int i36 = i15 + ((LinearLayout.LayoutParams) t1Var2).leftMargin;
                        childAt2.layout(i36, i14, i36 + measuredWidth2, i14 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) t1Var2).rightMargin + i36;
                    } else {
                        i11 = paddingTop2;
                    }
                    i12 = ((LinearLayout.LayoutParams) t1Var2).gravity;
                    if (i12 < 0) {
                        i12 = i31;
                    }
                    i13 = i12 & 112;
                    if (i13 != 16) {
                        if (i13 != 48) {
                            i14 = i11 + ((LinearLayout.LayoutParams) t1Var2).topMargin;
                            if (baseline != -1) {
                                i14 = (iArr[1] - baseline) + i14;
                            }
                        } else if (i13 != 80) {
                            i14 = i11;
                        } else {
                            i14 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) t1Var2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (i(i33)) {
                            i15 = i34 + this.f350q;
                        } else {
                            i15 = i34;
                        }
                        int i37 = i15 + ((LinearLayout.LayoutParams) t1Var2).leftMargin;
                        childAt2.layout(i37, i14, i37 + measuredWidth2, i14 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) t1Var2).rightMargin + i37;
                    } else {
                        i14 = ((paddingBottom2 - measuredHeight3) / 2) + i11 + ((LinearLayout.LayoutParams) t1Var2).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) t1Var2).bottomMargin;
                    }
                    i14 -= measuredHeight;
                    if (i(i33)) {
                        i15 = i34 + this.f350q;
                    } else {
                        i15 = i34;
                    }
                    int i38 = i15 + ((LinearLayout.LayoutParams) t1Var2).leftMargin;
                    childAt2.layout(i38, i14, i38 + measuredWidth2, i14 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) t1Var2).rightMargin + i38;
                }
                i32++;
                i9 = i10;
                paddingTop2 = i11;
            }
            i11 = paddingTop2;
            i32++;
            i9 = i10;
            paddingTop2 = i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:229:0x04de  */
    /* JADX WARN: Code duplicated, block: B:232:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:234:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:236:0x0500  */
    /* JADX WARN: Code duplicated, block: B:238:0x0521  */
    /* JADX WARN: Code duplicated, block: B:244:0x0531  */
    /* JADX WARN: Code duplicated, block: B:247:0x0538 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:249:0x053b  */
    /* JADX WARN: Code duplicated, block: B:251:0x0542 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x0545  */
    /* JADX WARN: Code duplicated, block: B:368:0x0793  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int iMax;
        int i9;
        int baseline;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        boolean z4;
        boolean z5;
        t1 t1Var;
        View view;
        int i14;
        int[] iArr2;
        int i15;
        int i16;
        boolean z6;
        int i17;
        int measuredHeight;
        boolean z7;
        boolean z8;
        int iMax2;
        int i18;
        int baseline2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z9;
        int i24;
        int i25;
        int i26;
        View view2;
        boolean z10;
        LinearLayoutCompat linearLayoutCompat = this;
        int i27 = -2;
        int iMax3 = 0;
        int i28 = 1073741824;
        int i29 = 8;
        if (linearLayoutCompat.f343i == 1) {
            linearLayoutCompat.f345k = 0;
            int virtualChildCount = linearLayoutCompat.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            int i30 = linearLayoutCompat.f341g;
            boolean z11 = linearLayoutCompat.f347m;
            int i31 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z12 = false;
            int i32 = 0;
            boolean z13 = false;
            boolean z14 = true;
            float f = 0.0f;
            int iMax6 = 0;
            while (i31 < virtualChildCount) {
                int i33 = mode;
                View childAt = linearLayoutCompat.getChildAt(i31);
                if (childAt == null) {
                    linearLayoutCompat.f345k = linearLayoutCompat.f345k;
                } else {
                    if (childAt.getVisibility() != i29) {
                        if (linearLayoutCompat.i(i31)) {
                            linearLayoutCompat.f345k += linearLayoutCompat.f351r;
                        }
                        t1 t1Var2 = (t1) childAt.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) t1Var2).weight;
                        f += f4;
                        if (mode2 == i28 && ((LinearLayout.LayoutParams) t1Var2).height == 0 && f4 > 0.0f) {
                            int i34 = linearLayoutCompat.f345k;
                            linearLayoutCompat.f345k = Math.max(i34, ((LinearLayout.LayoutParams) t1Var2).topMargin + i34 + ((LinearLayout.LayoutParams) t1Var2).bottomMargin);
                            view2 = childAt;
                            i23 = mode2;
                            i24 = i30;
                            z9 = z11;
                            i25 = i31;
                            z12 = true;
                            i26 = i33;
                        } else {
                            if (((LinearLayout.LayoutParams) t1Var2).height != 0 || f4 <= 0.0f) {
                                i22 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) t1Var2).height = i27;
                                i22 = 0;
                            }
                            i23 = mode2;
                            z9 = z11;
                            i24 = i30;
                            i25 = i31;
                            i26 = i33;
                            linearLayoutCompat.measureChildWithMargins(childAt, i4, 0, i5, f == 0.0f ? linearLayoutCompat.f345k : 0);
                            if (i22 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) t1Var2).height = i22;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i35 = linearLayoutCompat.f345k;
                            view2 = childAt;
                            linearLayoutCompat.f345k = Math.max(i35, i35 + measuredHeight2 + ((LinearLayout.LayoutParams) t1Var2).topMargin + ((LinearLayout.LayoutParams) t1Var2).bottomMargin);
                            if (z9) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i24 >= 0 && i24 == i25 + 1) {
                            linearLayoutCompat.f342h = linearLayoutCompat.f345k;
                        }
                        if (i25 < i24 && ((LinearLayout.LayoutParams) t1Var2).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i26 == 1073741824 || ((LinearLayout.LayoutParams) t1Var2).width != -1) {
                            z10 = false;
                        } else {
                            z10 = true;
                            z13 = true;
                        }
                        int i36 = ((LinearLayout.LayoutParams) t1Var2).leftMargin + ((LinearLayout.LayoutParams) t1Var2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i36;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z15 = z10;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i32, measuredState);
                        if (z14) {
                            i32 = iCombineMeasuredStates;
                            boolean z16 = ((LinearLayout.LayoutParams) t1Var2).width == -1;
                            if (((LinearLayout.LayoutParams) t1Var2).weight > 0.0f) {
                                if (!z15) {
                                    i36 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i36);
                            } else {
                                if (!z15) {
                                    i36 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i36);
                            }
                            z14 = z16;
                        } else {
                            i32 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) t1Var2).weight > 0.0f) {
                            if (!z15) {
                                i36 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i36);
                        } else {
                            if (!z15) {
                                i36 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i36);
                        }
                        z14 = z16;
                    }
                    i31 = i25 + 1;
                    i30 = i24;
                    mode = i26;
                    z11 = z9;
                    mode2 = i23;
                    i27 = -2;
                    i28 = 1073741824;
                    i29 = 8;
                }
                i23 = mode2;
                i24 = i30;
                z9 = z11;
                i25 = i31;
                i26 = i33;
                i31 = i25 + 1;
                i30 = i24;
                mode = i26;
                z11 = z9;
                mode2 = i23;
                i27 = -2;
                i28 = 1073741824;
                i29 = 8;
            }
            int i37 = mode;
            int i38 = mode2;
            boolean z17 = z11;
            int i39 = i32;
            int i40 = i5;
            if (linearLayoutCompat.f345k > 0 && linearLayoutCompat.i(virtualChildCount)) {
                linearLayoutCompat.f345k += linearLayoutCompat.f351r;
            }
            if (z17 && (i38 == Integer.MIN_VALUE || i38 == 0)) {
                linearLayoutCompat.f345k = 0;
                for (int i41 = 0; i41 < virtualChildCount; i41++) {
                    View childAt2 = linearLayoutCompat.getChildAt(i41);
                    if (childAt2 == null) {
                        linearLayoutCompat.f345k = linearLayoutCompat.f345k;
                    } else if (childAt2.getVisibility() != 8) {
                        t1 t1Var3 = (t1) childAt2.getLayoutParams();
                        int i42 = linearLayoutCompat.f345k;
                        linearLayoutCompat.f345k = Math.max(i42, i42 + iMax6 + ((LinearLayout.LayoutParams) t1Var3).topMargin + ((LinearLayout.LayoutParams) t1Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.f345k;
            linearLayoutCompat.f345k = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, linearLayoutCompat.getSuggestedMinimumHeight()), i40, 0);
            int i43 = (iResolveSizeAndState & 16777215) - linearLayoutCompat.f345k;
            if (z12 || (i43 != 0 && f > 0.0f)) {
                float f5 = linearLayoutCompat.f346l;
                if (f5 > 0.0f) {
                    f = f5;
                }
                linearLayoutCompat.f345k = 0;
                int iCombineMeasuredStates2 = i39;
                int i44 = 0;
                while (i44 < virtualChildCount) {
                    View childAt3 = linearLayoutCompat.getChildAt(i44);
                    if (childAt3.getVisibility() == 8) {
                        i44 = i44;
                    } else {
                        t1 t1Var4 = (t1) childAt3.getLayoutParams();
                        float f6 = ((LinearLayout.LayoutParams) t1Var4).weight;
                        if (f6 > 0.0f) {
                            int i45 = (int) ((i43 * f6) / f);
                            f -= f6;
                            i43 -= i45;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + ((LinearLayout.LayoutParams) t1Var4).leftMargin + ((LinearLayout.LayoutParams) t1Var4).rightMargin, ((LinearLayout.LayoutParams) t1Var4).width);
                            if (((LinearLayout.LayoutParams) t1Var4).height == 0) {
                                i21 = 1073741824;
                                if (i38 == 1073741824) {
                                    if (i45 <= 0) {
                                        i45 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i45, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i21 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i45;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i21));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i46 = ((LinearLayout.LayoutParams) t1Var4).leftMargin + ((LinearLayout.LayoutParams) t1Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i46;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i37 != 1073741824) {
                            i20 = -1;
                            if (((LinearLayout.LayoutParams) t1Var4).width == -1) {
                                measuredWidth2 = i46;
                            }
                        } else {
                            i20 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z18 = z14 && ((LinearLayout.LayoutParams) t1Var4).width == i20;
                        int i47 = linearLayoutCompat.f345k;
                        linearLayoutCompat.f345k = Math.max(i47, childAt3.getMeasuredHeight() + i47 + ((LinearLayout.LayoutParams) t1Var4).topMargin + ((LinearLayout.LayoutParams) t1Var4).bottomMargin);
                        z14 = z18;
                    }
                    i44++;
                }
                linearLayoutCompat.f345k = linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + linearLayoutCompat.f345k;
                i39 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z17 && i38 != 1073741824) {
                    for (int i48 = 0; i48 < virtualChildCount; i48++) {
                        View childAt4 = linearLayoutCompat.getChildAt(i48);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((t1) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z14 || i37 == 1073741824) {
                iMax4 = iMax3;
            }
            linearLayoutCompat.setMeasuredDimension(View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + iMax4, linearLayoutCompat.getSuggestedMinimumWidth()), i4, i39), iResolveSizeAndState);
            if (z13) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredWidth(), 1073741824);
                int i49 = 0;
                while (i49 < virtualChildCount) {
                    View childAt5 = linearLayoutCompat.getChildAt(i49);
                    if (childAt5.getVisibility() != 8) {
                        t1 t1Var5 = (t1) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) t1Var5).width == -1) {
                            int i50 = ((LinearLayout.LayoutParams) t1Var5).height;
                            ((LinearLayout.LayoutParams) t1Var5).height = childAt5.getMeasuredHeight();
                            linearLayoutCompat.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i40, 0);
                            ((LinearLayout.LayoutParams) t1Var5).height = i50;
                        }
                    }
                    i49++;
                    i40 = i5;
                }
                return;
            }
            return;
        }
        int i51 = i4;
        linearLayoutCompat.f345k = 0;
        int virtualChildCount2 = linearLayoutCompat.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i51);
        int mode4 = View.MeasureSpec.getMode(i5);
        if (linearLayoutCompat.n == null || linearLayoutCompat.f348o == null) {
            linearLayoutCompat.n = new int[4];
            linearLayoutCompat.f348o = new int[4];
        }
        int[] iArr3 = linearLayoutCompat.n;
        int[] iArr4 = linearLayoutCompat.f348o;
        iArr3[3] = -1;
        char c4 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z19 = linearLayoutCompat.f;
        boolean z20 = linearLayoutCompat.f347m;
        boolean z21 = mode3 == 1073741824;
        float f7 = 0.0f;
        boolean z22 = true;
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z23 = false;
        boolean z24 = false;
        while (i52 < virtualChildCount2) {
            char c5 = c4;
            View childAt6 = linearLayoutCompat.getChildAt(i52);
            if (childAt6 == null) {
                linearLayoutCompat.f345k = linearLayoutCompat.f345k;
                i13 = i52;
                i18 = i54;
                iArr2 = iArr3;
                iArr = iArr4;
                z4 = z19;
                z5 = z20;
            } else {
                int i55 = i53;
                if (childAt6.getVisibility() == 8) {
                    i51 = i4;
                    i13 = i52;
                    i18 = i54;
                    iArr = iArr4;
                    z4 = z19;
                    z5 = z20;
                    i53 = i55;
                    iArr2 = iArr3;
                } else {
                    if (linearLayoutCompat.i(i52)) {
                        linearLayoutCompat.f345k += linearLayoutCompat.f350q;
                    }
                    t1 t1Var6 = (t1) childAt6.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) t1Var6).weight;
                    f7 += f8;
                    int i56 = i52;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) t1Var6).width == 0 && f8 > 0.0f) {
                        int i57 = linearLayoutCompat.f345k;
                        int i58 = ((LinearLayout.LayoutParams) t1Var6).leftMargin;
                        if (z21) {
                            linearLayoutCompat.f345k = i58 + ((LinearLayout.LayoutParams) t1Var6).rightMargin + i57;
                        } else {
                            linearLayoutCompat.f345k = Math.max(i57, i57 + i58 + ((LinearLayout.LayoutParams) t1Var6).rightMargin);
                        }
                        if (z19) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z4 = z19;
                            z5 = z20;
                            i14 = i55;
                            i13 = i56;
                            t1Var = t1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i51 = i4;
                            i15 = i54;
                            i12 = iMax7;
                        } else {
                            view = childAt6;
                            z4 = z19;
                            z5 = z20;
                            z24 = true;
                            i14 = i55;
                            i13 = i56;
                            i16 = 1073741824;
                            t1Var = t1Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i51 = i4;
                            i15 = i54;
                            i12 = iMax7;
                        }
                        if (mode4 == i16 && ((LinearLayout.LayoutParams) t1Var).height == -1) {
                            z6 = true;
                            z23 = true;
                        } else {
                            z6 = false;
                        }
                        i17 = ((LinearLayout.LayoutParams) t1Var).topMargin + ((LinearLayout.LayoutParams) t1Var).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i17;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z4) {
                            baseline2 = view.getBaseline();
                            z7 = z6;
                            if (baseline2 != -1) {
                                i19 = ((LinearLayout.LayoutParams) t1Var).gravity;
                                if (i19 < 0) {
                                    i19 = linearLayoutCompat.f344j;
                                }
                                int i59 = (((i19 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i59] = Math.max(iArr2[i59], baseline2);
                                iArr[i59] = Math.max(iArr[i59], measuredHeight - baseline2);
                            }
                        } else {
                            z7 = z6;
                        }
                        int iMax9 = Math.max(i14, measuredHeight);
                        if (z22 || ((LinearLayout.LayoutParams) t1Var).height != -1) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (((LinearLayout.LayoutParams) t1Var).weight > 0.0f) {
                            if (!z7) {
                                i17 = measuredHeight;
                            }
                            iMax7 = Math.max(i12, i17);
                            iMax2 = i15;
                        } else {
                            if (!z7) {
                                i17 = measuredHeight;
                            }
                            iMax2 = Math.max(i15, i17);
                            iMax7 = i12;
                        }
                        int i60 = iMax2;
                        i53 = iMax9;
                        i18 = i60;
                        z22 = z8;
                    } else {
                        if (((LinearLayout.LayoutParams) t1Var6).width != 0 || f8 <= 0.0f) {
                            i11 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) t1Var6).width = -2;
                            i11 = 0;
                        }
                        iArr = iArr4;
                        i12 = iMax7;
                        i13 = i56;
                        z4 = z19;
                        z5 = z20;
                        int i61 = i11;
                        t1Var = t1Var6;
                        view = childAt6;
                        i14 = i55;
                        i51 = i4;
                        iArr2 = iArr3;
                        i15 = i54;
                        linearLayoutCompat.measureChildWithMargins(view, i51, f7 == 0.0f ? linearLayoutCompat.f345k : 0, i5, 0);
                        if (i61 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) t1Var).width = i61;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        int i62 = linearLayoutCompat.f345k;
                        int i63 = ((LinearLayout.LayoutParams) t1Var).leftMargin;
                        if (z21) {
                            linearLayoutCompat.f345k = i63 + measuredWidth3 + ((LinearLayout.LayoutParams) t1Var).rightMargin + i62;
                        } else {
                            linearLayoutCompat.f345k = Math.max(i62, i62 + measuredWidth3 + i63 + ((LinearLayout.LayoutParams) t1Var).rightMargin);
                        }
                        if (z5) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i16 = 1073741824;
                    if (mode4 == i16) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    i17 = ((LinearLayout.LayoutParams) t1Var).topMargin + ((LinearLayout.LayoutParams) t1Var).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i17;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z4) {
                        baseline2 = view.getBaseline();
                        z7 = z6;
                        if (baseline2 != -1) {
                            i19 = ((LinearLayout.LayoutParams) t1Var).gravity;
                            if (i19 < 0) {
                                i19 = linearLayoutCompat.f344j;
                            }
                            int i510 = (((i19 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i510] = Math.max(iArr2[i510], baseline2);
                            iArr[i510] = Math.max(iArr[i510], measuredHeight - baseline2);
                        }
                    } else {
                        z7 = z6;
                    }
                    int iMax10 = Math.max(i14, measuredHeight);
                    if (z22) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (((LinearLayout.LayoutParams) t1Var).weight > 0.0f) {
                        if (!z7) {
                            i17 = measuredHeight;
                        }
                        iMax7 = Math.max(i12, i17);
                        iMax2 = i15;
                    } else {
                        if (!z7) {
                            i17 = measuredHeight;
                        }
                        iMax2 = Math.max(i15, i17);
                        iMax7 = i12;
                    }
                    int i64 = iMax2;
                    i53 = iMax10;
                    i18 = i64;
                    z22 = z8;
                }
            }
            i54 = i18;
            i52 = i13 + 1;
            c4 = c5;
            iArr3 = iArr2;
            iArr4 = iArr;
            z19 = z4;
            z20 = z5;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c6 = c4;
        boolean z25 = z19;
        boolean z26 = z20;
        int i65 = i53;
        int i66 = i54;
        int i67 = iMax7;
        if (linearLayoutCompat.f345k > 0 && linearLayoutCompat.i(virtualChildCount2)) {
            linearLayoutCompat.f345k += linearLayoutCompat.f350q;
        }
        int i68 = iArr5[1];
        int iMax11 = (i68 == -1 && iArr5[0] == -1 && iArr5[c6] == -1 && iArr5[3] == -1) ? i65 : Math.max(i65, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c6]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i68, iArr5[c6]))));
        if (z26 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            linearLayoutCompat.f345k = 0;
            for (int i69 = 0; i69 < virtualChildCount2; i69++) {
                View childAt7 = linearLayoutCompat.getChildAt(i69);
                if (childAt7 == null) {
                    linearLayoutCompat.f345k = linearLayoutCompat.f345k;
                } else if (childAt7.getVisibility() != 8) {
                    t1 t1Var7 = (t1) childAt7.getLayoutParams();
                    int i70 = linearLayoutCompat.f345k;
                    if (z21) {
                        linearLayoutCompat.f345k = ((LinearLayout.LayoutParams) t1Var7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) t1Var7).rightMargin + i70;
                    } else {
                        linearLayoutCompat.f345k = Math.max(i70, i70 + iMax8 + ((LinearLayout.LayoutParams) t1Var7).leftMargin + ((LinearLayout.LayoutParams) t1Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.f345k;
        linearLayoutCompat.f345k = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, linearLayoutCompat.getSuggestedMinimumWidth()), i51, 0);
        int i71 = (iResolveSizeAndState2 & 16777215) - linearLayoutCompat.f345k;
        if (z24 || (i71 != 0 && f7 > 0.0f)) {
            float f9 = linearLayoutCompat.f346l;
            if (f9 > 0.0f) {
                f7 = f9;
            }
            iArr5[3] = -1;
            iArr5[c6] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c6] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            linearLayoutCompat.f345k = 0;
            iMax11 = -1;
            int i72 = 0;
            while (i72 < virtualChildCount2) {
                View childAt8 = linearLayoutCompat.getChildAt(i72);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    t1 t1Var8 = (t1) childAt8.getLayoutParams();
                    float f10 = ((LinearLayout.LayoutParams) t1Var8).weight;
                    if (f10 > 0.0f) {
                        int i73 = (int) ((i71 * f10) / f7);
                        f7 -= f10;
                        i71 -= i73;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + ((LinearLayout.LayoutParams) t1Var8).topMargin + ((LinearLayout.LayoutParams) t1Var8).bottomMargin, ((LinearLayout.LayoutParams) t1Var8).height);
                        if (((LinearLayout.LayoutParams) t1Var8).width == 0) {
                            i10 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i73 <= 0) {
                                    i73 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i73, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i10 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i73;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i10), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    int i74 = linearLayoutCompat.f345k;
                    if (z21) {
                        linearLayoutCompat.f345k = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) t1Var8).leftMargin + ((LinearLayout.LayoutParams) t1Var8).rightMargin + i74;
                    } else {
                        linearLayoutCompat.f345k = Math.max(i74, childAt8.getMeasuredWidth() + i74 + ((LinearLayout.LayoutParams) t1Var8).leftMargin + ((LinearLayout.LayoutParams) t1Var8).rightMargin);
                    }
                    boolean z27 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) t1Var8).height == -1;
                    int i75 = ((LinearLayout.LayoutParams) t1Var8).topMargin + ((LinearLayout.LayoutParams) t1Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i75;
                    iMax11 = Math.max(iMax11, measuredHeight4);
                    if (!z27) {
                        i75 = measuredHeight4;
                    }
                    int iMax12 = Math.max(i66, i75);
                    if (z22) {
                        i9 = -1;
                        boolean z28 = ((LinearLayout.LayoutParams) t1Var8).height == -1;
                        if (!z25 && (baseline = childAt8.getBaseline()) != i9) {
                            int i76 = ((LinearLayout.LayoutParams) t1Var8).gravity;
                            if (i76 < 0) {
                                i76 = linearLayoutCompat.f344j;
                            }
                            int i77 = (((i76 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i77] = Math.max(iArr5[i77], baseline);
                            iArr6[i77] = Math.max(iArr6[i77], measuredHeight4 - baseline);
                        }
                        z22 = z28;
                        i66 = iMax12;
                    } else {
                        i9 = -1;
                    }
                    if (!z25) {
                    }
                    z22 = z28;
                    i66 = iMax12;
                }
                i72++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i6 = iResolveSizeAndState2;
            i7 = -16777216;
            linearLayoutCompat.f345k = linearLayoutCompat.getPaddingRight() + linearLayoutCompat.getPaddingLeft() + linearLayoutCompat.f345k;
            int i78 = iArr5[1];
            if (i78 == -1 && iArr5[0] == -1 && iArr5[c6] == -1 && iArr5[3] == -1) {
                i8 = 0;
            } else {
                i8 = 0;
                iMax11 = Math.max(iMax11, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c6]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i78, iArr5[c6]))));
            }
            iMax = i66;
        } else {
            iMax = Math.max(i66, i67);
            if (z26 && mode3 != 1073741824) {
                for (int i79 = 0; i79 < virtualChildCount2; i79++) {
                    View childAt9 = linearLayoutCompat.getChildAt(i79);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((t1) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = iResolveSizeAndState2;
            i7 = -16777216;
            i8 = 0;
        }
        if (!z22 && mode4 != 1073741824) {
            iMax11 = iMax;
        }
        linearLayoutCompat.setMeasuredDimension(i6 | (iCombineMeasuredStates3 & i7), View.resolveSizeAndState(Math.max(linearLayoutCompat.getPaddingBottom() + linearLayoutCompat.getPaddingTop() + iMax11, linearLayoutCompat.getSuggestedMinimumHeight()), i5, iCombineMeasuredStates3 << 16));
        if (z23) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(linearLayoutCompat.getMeasuredHeight(), 1073741824);
            int i80 = i8;
            while (i80 < virtualChildCount2) {
                View childAt10 = linearLayoutCompat.getChildAt(i80);
                if (childAt10.getVisibility() != 8) {
                    t1 t1Var9 = (t1) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) t1Var9).height == -1) {
                        int i81 = ((LinearLayout.LayoutParams) t1Var9).width;
                        ((LinearLayout.LayoutParams) t1Var9).width = childAt10.getMeasuredWidth();
                        linearLayoutCompat.measureChildWithMargins(childAt10, i51, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) t1Var9).width = i81;
                    }
                }
                i80++;
                linearLayoutCompat = this;
                i51 = i4;
            }
        }
    }

    public void setBaselineAligned(boolean z4) {
        this.f = z4;
    }

    public void setBaselineAlignedChildIndex(int i4) {
        if (i4 >= 0 && i4 < getChildCount()) {
            this.f341g = i4;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f349p) {
            return;
        }
        this.f349p = drawable;
        if (drawable != null) {
            this.f350q = drawable.getIntrinsicWidth();
            this.f351r = drawable.getIntrinsicHeight();
        } else {
            this.f350q = 0;
            this.f351r = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i4) {
        this.f353t = i4;
    }

    public void setGravity(int i4) {
        if (this.f344j != i4) {
            if ((8388615 & i4) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            this.f344j = i4;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i4) {
        int i5 = i4 & 8388615;
        int i6 = this.f344j;
        if ((8388615 & i6) != i5) {
            this.f344j = i5 | ((-8388616) & i6);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z4) {
        this.f347m = z4;
    }

    public void setOrientation(int i4) {
        if (this.f343i != i4) {
            this.f343i = i4;
            requestLayout();
        }
    }

    public void setShowDividers(int i4) {
        if (i4 != this.f352s) {
            requestLayout();
        }
        this.f352s = i4;
    }

    public void setVerticalGravity(int i4) {
        int i5 = i4 & 112;
        int i6 = this.f344j;
        if ((i6 & 112) != i5) {
            this.f344j = i5 | (i6 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f346l = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
