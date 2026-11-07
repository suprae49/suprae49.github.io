package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import co.median.android.eeqadjy.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p0.p0;
import x.o;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends h implements f {
    public final RectF A;
    public final Rect B;
    public final SparseArray C;
    public final a D;
    public final int[] E;
    public final float[] F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final String[] K;
    public float L;
    public final ColorStateList M;
    public j N;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ClockHandView f1607y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Rect f1608z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1608z = new Rect();
        this.A = new RectF();
        this.B = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.C = sparseArray;
        this.F = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a2.a.f19j, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        int i4 = 1;
        ColorStateList colorStateListH = t2.i.h(context, typedArrayObtainStyledAttributes, 1);
        this.M = colorStateListH;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f1607y = clockHandView;
        this.G = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListH.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListH.getDefaultColor());
        this.E = new int[]{colorForState, colorForState, colorStateListH.getDefaultColor()};
        clockHandView.f1611h.add(this);
        int defaultColor = c0.c.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListH2 = t2.i.h(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListH2 != null ? colorStateListH2.getDefaultColor() : defaultColor);
        typedArrayObtainStyledAttributes.recycle();
        setOutlineProvider(new c());
        setFocusable(true);
        setClipToOutline(true);
        this.D = new a(this, i4);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.K = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z4 = false;
        for (int i5 = 0; i5 < Math.max(this.K.length, size); i5++) {
            TextView textView = (TextView) sparseArray.get(i5);
            if (i5 >= this.K.length) {
                removeView(textView);
                sparseArray.remove(i5);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i5, textView);
                    addView(textView);
                }
                textView.setText(this.K[i5]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i5));
                int i6 = (i5 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i6));
                z4 = i6 > 1 ? true : z4;
                p0.m(textView, this.D);
                textView.setTextColor(this.M);
            }
        }
        ClockHandView clockHandView2 = this.f1607y;
        if (clockHandView2.f1610g && !z4) {
            clockHandView2.f1620r = 1;
        }
        clockHandView2.f1610g = z4;
        clockHandView2.invalidate();
        this.H = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.I = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.J = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.h
    public final void m() {
        o oVar = new o();
        oVar.b(this);
        HashMap map = new HashMap();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i5 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i5 == null) {
                    i5 = 1;
                }
                if (!map.containsKey(i5)) {
                    map.put(i5, new ArrayList());
                }
                ((List) map.get(i5)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iRound = this.f1627w;
            if (iIntValue == 2) {
                iRound = Math.round(iRound * 0.66f);
            }
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                Integer numValueOf = Integer.valueOf(id);
                HashMap map2 = oVar.f4634c;
                if (!map2.containsKey(numValueOf)) {
                    map2.put(Integer.valueOf(id), new x.j());
                }
                x.k kVar = ((x.j) map2.get(Integer.valueOf(id))).f4566d;
                kVar.f4604z = R.id.circle_center;
                kVar.A = iRound;
                kVar.B = size;
                size += 360.0f / list.size();
            }
        }
        oVar.a(this);
        setConstraintSet(null);
        requestLayout();
        int i6 = 0;
        while (true) {
            SparseArray sparseArray = this.C;
            if (i6 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i6)).setVisibility(0);
            i6++;
        }
    }

    public final void n() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.f1607y.f1615l;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i4 = 0;
        while (true) {
            sparseArray = this.C;
            int size = sparseArray.size();
            rect = this.f1608z;
            rectF = this.A;
            if (i4 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i4);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i4++;
        }
        for (int i5 = 0; i5 < sparseArray.size(); i5++) {
            TextView textView3 = (TextView) sparseArray.get(i5);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.B;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.E, this.F, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.K.length, false, 1));
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        int iIntValue;
        int length;
        int i5 = 0;
        while (true) {
            SparseArray sparseArray = this.C;
            if (i5 >= sparseArray.size()) {
                iIntValue = -1;
                break;
            }
            TextView textView = (TextView) sparseArray.valueAt(i5);
            if (textView.isSelected()) {
                iIntValue = ((Integer) textView.getTag(R.id.material_value_index)).intValue();
                break;
            }
            i5++;
        }
        if (!isShown() || iIntValue == -1) {
            return super.onKeyDown(i4, keyEvent);
        }
        if (i4 != 66) {
            switch (i4) {
                case 19:
                case 22:
                    length = (iIntValue + 1) % this.K.length;
                    break;
                case 20:
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    String[] strArr = this.K;
                    length = ((iIntValue - 1) + strArr.length) % strArr.length;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    break;
                default:
                    return super.onKeyDown(i4, keyEvent);
            }
            if (length == iIntValue) {
                return super.onKeyDown(i4, keyEvent);
            }
            int i6 = (length / 12) + 1;
            ClockHandView clockHandView = this.f1607y;
            if (i6 != clockHandView.f1620r) {
                clockHandView.f1620r = i6;
                clockHandView.invalidate();
            }
            clockHandView.a((length % 12) * 30.0f);
            n();
            return true;
        }
        j jVar = this.N;
        if (jVar != null) {
            jVar.f1629a.f1622v.isChecked();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.J / Math.max(Math.max(this.H / displayMetrics.heightPixels, this.I / displayMetrics.widthPixels), 1.0f));
        if (View.MeasureSpec.getMode(i4) != 0) {
            iMax = Math.min(iMax, View.MeasureSpec.getSize(i4));
        }
        if (View.MeasureSpec.getMode(i5) != 0) {
            iMax = Math.min(iMax, View.MeasureSpec.getSize(i5));
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        ClockHandView clockHandView = this.f1607y;
        int i6 = ((iMax / 2) - clockHandView.f1612i) - this.G;
        int i7 = this.f1627w;
        if (i6 != i7 && i6 != i7) {
            this.f1627w = i6;
            m();
            clockHandView.f1619q = this.f1627w;
            clockHandView.invalidate();
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
