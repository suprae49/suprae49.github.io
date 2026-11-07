package com.google.android.material.button;

import a3.e0;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import co.median.android.eeqadjy.R;
import com.google.android.material.datepicker.i;
import i2.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p0.p0;
import r2.a0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends g {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f1359x = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinkedHashSet f1360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1362t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1363u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f1364v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public HashSet f1365w;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(f3.a.b(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.f1360r = new LinkedHashSet();
        this.f1361s = false;
        this.f1365w = new HashSet();
        TypedArray typedArrayF = a0.f(getContext(), attributeSet, a2.a.f29u, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayF.getBoolean(7, false));
        this.f1364v = typedArrayF.getResourceId(2, -1);
        this.f1363u = typedArrayF.getBoolean(4, false);
        if (this.f2282k == null) {
            this.f2282k = e0.b(new a3.a(0.0f));
        }
        setEnabled(typedArrayF.getBoolean(0, true));
        typedArrayF.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.f1362t ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if ((getChildAt(i5) instanceof MaterialButton) && getChildAt(i5).getVisibility() != 8) {
                i4++;
            }
        }
        return i4;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // i2.g, android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i4, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        l(materialButton.getId(), materialButton.f1357z);
        p0.m(materialButton, new i(1, this));
    }

    public int getCheckedButtonId() {
        if (!this.f1362t || this.f1365w.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f1365w.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            int id = ((MaterialButton) getChildAt(i4)).getId();
            if (this.f1365w.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final void l(int i4, boolean z4) {
        if (i4 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i4);
            return;
        }
        HashSet hashSet = new HashSet(this.f1365w);
        if (z4 && !hashSet.contains(Integer.valueOf(i4))) {
            if (this.f1362t && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i4));
        } else {
            if (z4 || !hashSet.contains(Integer.valueOf(i4))) {
                return;
            }
            if (!this.f1363u || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i4));
            }
        }
        m(hashSet);
    }

    public final void m(Set set) {
        HashSet hashSet = this.f1365w;
        this.f1365w = new HashSet(set);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            int id = ((MaterialButton) getChildAt(i4)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f1361s = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f1361s = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f1360r.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.timepicker.i) it.next()).a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.f1364v;
        if (i4 != -1) {
            m(Collections.singleton(Integer.valueOf(i4)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f1362t ? 1 : 2));
    }

    public void setSelectionRequired(boolean z4) {
        this.f1363u = z4;
    }

    public void setSingleSelection(boolean z4) {
        if (this.f1362t != z4) {
            this.f1362t = z4;
            m(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            ((MaterialButton) getChildAt(i4)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i4) {
        setSingleSelection(getResources().getBoolean(i4));
    }
}
