package i2;

import a3.e0;
import a3.f0;
import a3.g0;
import a3.h0;
import a3.i0;
import a3.j0;
import a3.m;
import a3.o;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.q;
import co.median.android.eeqadjy.R;
import com.google.android.gms.common.api.Api;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;
import r2.a0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends LinearLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f2277q = null;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f2278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0 f2279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f2280i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer[] f2281j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e0 f2282k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g0 f2283l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2284m;
    public j0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f2285o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f2286p;

    /* JADX WARN: Type inference failed for: r0v3, types: [i2.e] */
    public g(Context context, AttributeSet attributeSet) {
        e0 e0VarB;
        int next;
        int next2;
        super(f3.a.b(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f = 0;
        this.f2278g = new ArrayList();
        final MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.f2279h = new h0(14, materialButtonToggleGroup);
        this.f2280i = new Comparator() { // from class: i2.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.f1357z).compareTo(Boolean.valueOf(materialButton2.f1357z));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup2 = materialButtonToggleGroup;
                return Integer.compare(materialButtonToggleGroup2.indexOfChild(materialButton), materialButtonToggleGroup2.indexOfChild(materialButton2));
            }
        };
        this.f2285o = true;
        new HashMap();
        new HashMap();
        new ArrayList();
        new ArrayList();
        this.f2286p = new ArrayList();
        Context context2 = getContext();
        TypedArray typedArrayF = a0.f(context2, attributeSet, a2.a.f27s, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayF.hasValue(2)) {
            int resourceId = typedArrayF.getResourceId(2, 0);
            j0 j0Var = null;
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    XmlResourceParser xml = context2.getResources().getXml(resourceId);
                    try {
                        j0 j0Var2 = new j0();
                        j0Var2.f109c = new int[10][];
                        j0Var2.f110d = new h0[10];
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            j0Var2.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        j0Var = j0Var2;
                    } catch (Throwable th) {
                        if (xml == null) {
                            throw th;
                        }
                        try {
                            xml.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
            }
            this.n = j0Var;
        }
        if (typedArrayF.hasValue(6)) {
            g0 g0VarG = g0.g(context2, typedArrayF, 6);
            this.f2283l = g0VarG;
            if (g0VarG == null) {
                this.f2283l = new f0(o.f(context2, typedArrayF.getResourceId(6, 0), typedArrayF.getResourceId(7, 0)).a()).b();
            }
        }
        if (typedArrayF.hasValue(3)) {
            a3.a aVar = new a3.a(0.0f);
            int resourceId2 = typedArrayF.getResourceId(3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    try {
                        e0VarB = new e0();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml2);
                        do {
                            next = xml2.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml2.getName().equals("selector")) {
                            e0VarB.d(context2, xml2, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml2.close();
                    } catch (Throwable th3) {
                        if (xml2 == null) {
                            throw th3;
                        }
                        try {
                            xml2.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    e0VarB = e0.b(aVar);
                }
            } else {
                e0VarB = e0.b(o.i(typedArrayF, 3, aVar));
            }
            this.f2282k = e0VarB;
        }
        this.f2284m = typedArrayF.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayF.getBoolean(0, true));
        setOverflowMode(typedArrayF.getInt(5, 0));
        getResources().getDimensionPixelOffset(R.dimen.m3_btn_group_overflow_item_icon_horizontal_padding);
        typedArrayF.recycle();
    }

    public static LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new f(layoutParams.width, layoutParams.height);
    }

    public static f f(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new f((LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (i(i4)) {
                return i4;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (i(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i4 = firstVisibleChildIndex + 1; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            View childAt2 = getChildAt(i4 - 1);
            if ((childAt instanceof MaterialButton) && (childAt2 instanceof MaterialButton)) {
                MaterialButton materialButton = (MaterialButton) childAt;
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (this.f2284m <= 0) {
                    iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    iMin = 0;
                }
            } else {
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsD = d(childAt);
            if (getOrientation() == 0) {
                layoutParamsD.setMarginEnd(0);
                layoutParamsD.setMarginStart(this.f2284m - iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = this.f2284m - iMin;
                layoutParamsD.setMarginStart(0);
            }
            childAt.setLayoutParams(layoutParamsD);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParamsD2 = d((MaterialButton) getChildAt(firstVisibleChildIndex));
        if (getOrientation() == 1) {
            layoutParamsD2.topMargin = 0;
            layoutParamsD2.bottomMargin = 0;
        } else {
            layoutParamsD2.setMarginEnd(0);
            layoutParamsD2.setMarginStart(0);
            layoutParamsD2.leftMargin = 0;
            layoutParamsD2.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        j();
        this.f2285o = true;
        int iIndexOfChild = indexOfChild(null);
        if (iIndexOfChild < 0 || i4 != -1) {
            super.addView(view, i4, layoutParams);
        } else {
            super.addView(view, iIndexOfChild, layoutParams);
        }
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f2279h);
        this.f2278g.add(materialButton.getShapeAppearance());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        if (firstVisibleChildIndex == -1 || this.n == null) {
            return;
        }
        if (this.f != 2) {
            c(firstVisibleChildIndex, lastVisibleChildIndex);
            return;
        }
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f2286p;
            if (i4 >= arrayList.size()) {
                return;
            }
            c(((Integer) arrayList.get(i4)).intValue(), (i4 == arrayList.size() + (-1) ? getChildCount() : ((Integer) arrayList.get(i4 + 1)).intValue()) - 1);
            i4++;
        }
    }

    public final void c(int i4, int i5) {
        float fMax;
        if (i4 == i5) {
            ((MaterialButton) getChildAt(i4)).setWidthChangeDirection(d.f);
            return;
        }
        int iMin = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i6 = i4;
        while (i6 <= i5) {
            if (i(i6)) {
                ((MaterialButton) getChildAt(i6)).setWidthChangeDirection(i6 == i4 ? d.f2273h : i6 == i5 ? d.f2272g : d.f2274i);
                int iMin2 = 0;
                if (i(i6) && this.n != null) {
                    MaterialButton materialButton = (MaterialButton) getChildAt(i6);
                    j0 j0Var = this.n;
                    int width = materialButton.getWidth();
                    int i7 = -width;
                    for (int i8 = 0; i8 < j0Var.f107a; i8++) {
                        i0 i0Var = (i0) j0Var.f110d[i8].f84g;
                        int i9 = i0Var.f86a;
                        float f = i0Var.f87b;
                        if (i9 == 2) {
                            fMax = Math.max(i7, f);
                        } else {
                            if (i9 == 1) {
                                fMax = Math.max(i7, width * f);
                            }
                        }
                        i7 = (int) fMax;
                    }
                    int iMax = Math.max(0, i7);
                    MaterialButton materialButtonH = h(i6);
                    int allowedWidthDecrease = materialButtonH == null ? 0 : materialButtonH.getAllowedWidthDecrease();
                    MaterialButton materialButtonG = g(i6);
                    iMin2 = Math.min(iMax, allowedWidthDecrease + (materialButtonG != null ? materialButtonG.getAllowedWidthDecrease() : 0));
                }
                if (i6 != i4 && i6 != i5) {
                    iMin2 /= 2;
                }
                iMin = Math.min(iMin, iMin2);
            }
            i6++;
        }
        while (i4 <= i5) {
            if (i(i4)) {
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i4);
                materialButton2.setSizeChange(this.n);
                materialButton2.setWidthChangeMax(iMin * 2);
            }
            i4++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f2280i);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            treeMap.put((MaterialButton) getChildAt(i4), Integer.valueOf(i4));
        }
        this.f2281j = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final f generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        f fVar = new f(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a2.a.f28t);
        typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.getText(1);
        typedArrayObtainStyledAttributes.recycle();
        return fVar;
    }

    public final MaterialButton g(int i4) {
        int childCount = getChildCount();
        int i5 = i4 + 1;
        while (true) {
            if (i5 >= childCount) {
                i5 = -1;
                break;
            }
            if (i(i5)) {
                break;
            }
            i5++;
        }
        ArrayList arrayList = this.f2286p;
        if (!arrayList.isEmpty()) {
            int i6 = 0;
            while (i6 < arrayList.size()) {
                int iIntValue = ((Integer) arrayList.get(i6)).intValue();
                int iIntValue2 = i6 == arrayList.size() + (-1) ? childCount - 1 : ((Integer) arrayList.get(i6 + 1)).intValue() - 1;
                if (i4 >= iIntValue && i4 <= iIntValue2 && (i5 < iIntValue || i5 > iIntValue2)) {
                    return null;
                }
                i6++;
            }
        }
        if (i5 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i5);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    public j0 getButtonSizeChange() {
        return this.n;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i5) {
        Integer[] numArr = this.f2281j;
        if (numArr != null && i5 < numArr.length) {
            return numArr[i5].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i5;
    }

    public a3.d getInnerCornerSize() {
        return this.f2282k.f48b;
    }

    public e0 getInnerCornerSizeStateList() {
        return this.f2282k;
    }

    public Drawable getOverflowButtonIcon() {
        throw null;
    }

    public int getOverflowMode() {
        return this.f;
    }

    public o getShapeAppearance() {
        g0 g0Var = this.f2283l;
        if (g0Var == null) {
            return null;
        }
        return g0Var.h();
    }

    public int getSpacing() {
        return this.f2284m;
    }

    public g0 getStateListShapeAppearance() {
        return this.f2283l;
    }

    public final MaterialButton h(int i4) {
        int childCount = getChildCount();
        int i5 = i4 - 1;
        while (true) {
            if (i5 < 0) {
                i5 = -1;
                break;
            }
            if (i(i5)) {
                break;
            }
            i5--;
        }
        ArrayList arrayList = this.f2286p;
        if (!arrayList.isEmpty()) {
            int i6 = 0;
            while (i6 < arrayList.size()) {
                int iIntValue = ((Integer) arrayList.get(i6)).intValue();
                int iIntValue2 = i6 == arrayList.size() + (-1) ? childCount : ((Integer) arrayList.get(i6 + 1)).intValue();
                if (i4 >= iIntValue && i4 < iIntValue2 && (i5 < iIntValue || i5 >= iIntValue2)) {
                    return null;
                }
                i6++;
            }
        }
        if (i5 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i5);
    }

    public final boolean i(int i4) {
        return getChildAt(i4).getVisibility() != 8;
    }

    public final void j() {
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i4);
            LinearLayout.LayoutParams layoutParams = materialButton.H;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.H = null;
                materialButton.E = -2.1474836E9f;
            }
        }
    }

    public final void k() {
        int i4;
        if (!(this.f2282k == null && this.f2283l == null) && this.f2285o) {
            this.f2285o = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i5 = 0;
            while (i5 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i5);
                if (materialButton.getVisibility() != 8) {
                    boolean z4 = i5 == firstVisibleChildIndex;
                    boolean z5 = i5 == lastVisibleChildIndex;
                    Object obj = this.f2283l;
                    ArrayList arrayList = this.f2278g;
                    if (obj == null || (!z4 && !z5)) {
                        obj = (m) arrayList.get(i5);
                    }
                    f0 f0Var = !(obj instanceof g0) ? new f0((o) arrayList.get(i5)) : ((g0) obj).i();
                    boolean z6 = getOrientation() == 0;
                    boolean z7 = getLayoutDirection() == 1;
                    if (z6) {
                        i4 = z4 ? 5 : 0;
                        if (z5) {
                            i4 |= 10;
                        }
                        if (z7) {
                            i4 = ((i4 & 5) << 1) | ((i4 & 10) >> 1);
                        }
                    } else {
                        i4 = z4 ? 3 : 0;
                        if (z5) {
                            i4 |= 12;
                        }
                    }
                    int i6 = ~i4;
                    e0 e0Var = this.f2282k;
                    if ((i6 | 1) == i6) {
                        f0Var.f59e = e0Var;
                    }
                    if ((i6 | 2) == i6) {
                        f0Var.f = e0Var;
                    }
                    if ((i6 | 4) == i6) {
                        f0Var.f60g = e0Var;
                    }
                    if ((i6 | 8) == i6) {
                        f0Var.f61h = e0Var;
                    }
                    g0 g0VarB = f0Var.b();
                    boolean zE = g0VarB.e();
                    g0 g0VarH = g0VarB;
                    if (!zE) {
                        g0VarH = g0VarB.h();
                    }
                    materialButton.setShapeAppearance(g0VarH);
                }
                i5++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (z4) {
            j();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int paddingBottom;
        a();
        if (this.f != 2) {
            paddingBottom = 0;
        } else {
            if (getOrientation() == 1) {
                q.q("The wrap overflow mode is not compatible to the vertical orientation.");
                return;
            }
            if (View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE) {
                q.q("The wrap overflow mode is not compatible with wrap_content layout width.");
                return;
            }
            ArrayList arrayList = this.f2286p;
            arrayList.clear();
            int size = View.MeasureSpec.getSize(i4);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            int iMax = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                if (i(i8)) {
                    View view = (MaterialButton) getChildAt(i8);
                    measureChild(view, i4, i5);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth > 0) {
                        LinearLayout.LayoutParams layoutParamsD = d(view);
                        if (i6 + measuredWidth + (arrayList2.isEmpty() ? 0 : this.f2284m) > size || arrayList2.isEmpty()) {
                            if (!arrayList2.isEmpty()) {
                                arrayList3.add(Integer.valueOf(i6));
                            }
                            i7 += iMax + (arrayList.isEmpty() ? 0 : this.f2284m);
                            arrayList.add(Integer.valueOf(i8));
                            layoutParamsD.setMarginStart(-i6);
                            arrayList2.clear();
                            i6 = 0;
                            iMax = 0;
                        }
                        i6 += measuredWidth + (i6 == 0 ? 0 : this.f2284m);
                        iMax = Math.max(iMax, measuredHeight);
                        arrayList2.add(Integer.valueOf(i8));
                        layoutParamsD.topMargin += i7;
                        view.setLayoutParams(layoutParamsD);
                    }
                }
            }
            arrayList3.add(Integer.valueOf(i6));
            int iIntValue = ((Integer) Collections.max(arrayList3)).intValue();
            int i9 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                int iIntValue2 = ((Integer) arrayList.get(i10)).intValue();
                int iIntValue3 = ((Integer) arrayList3.get(i10)).intValue();
                MaterialButton materialButton = (MaterialButton) getChildAt(iIntValue2);
                LinearLayout.LayoutParams layoutParamsD2 = d(materialButton);
                int i11 = layoutParamsD2.gravity & 8388615;
                int absoluteGravity = Gravity.getAbsoluteGravity(i11, getLayoutDirection());
                int i12 = iIntValue - iIntValue3;
                if (i11 != 8388611) {
                    if (absoluteGravity == 1) {
                        i12 /= 2;
                    }
                    layoutParamsD2.setMarginStart((layoutParamsD2.getMarginStart() + i12) - i9);
                    materialButton.setLayoutParams(layoutParamsD2);
                    i9 = i12;
                }
            }
            paddingBottom = getPaddingBottom() + getPaddingTop() + i7 + iMax;
        }
        k();
        super.onMeasure(i4, i5);
        if (this.f != 2 || paddingBottom == getMeasuredHeight()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), paddingBottom);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f2278g.remove(iIndexOfChild);
        }
        this.f2285o = true;
        k();
        j();
        a();
    }

    public void setButtonSizeChange(j0 j0Var) {
        if (this.n != j0Var) {
            this.n = j0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            ((MaterialButton) getChildAt(i4)).setEnabled(z4);
        }
    }

    public void setInnerCornerSize(a3.d dVar) {
        this.f2282k = e0.b(dVar);
        this.f2285o = true;
        k();
        invalidate();
    }

    public void setInnerCornerSizeStateList(e0 e0Var) {
        this.f2282k = e0Var;
        this.f2285o = true;
        k();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i4) {
        if (getOrientation() != i4) {
            this.f2285o = true;
        }
        super.setOrientation(i4);
    }

    public void setOverflowButtonIcon(Drawable drawable) {
        throw null;
    }

    public void setOverflowButtonIconResource(int i4) {
        throw null;
    }

    public void setOverflowMode(int i4) {
        if (this.f != i4) {
            this.f = i4;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(o oVar) {
        this.f2283l = new f0(oVar).b();
        this.f2285o = true;
        k();
        invalidate();
    }

    public void setSpacing(int i4) {
        this.f2284m = i4;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(g0 g0Var) {
        this.f2283l = g0Var;
        this.f2285o = true;
        k();
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return f(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return f(layoutParams);
    }
}
