package d3;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import co.median.android.eeqadjy.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import k.a2;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends k.n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a2 f1789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AccessibilityManager f1790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f1791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f1792m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f1793o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f1794p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1795q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ColorStateList f1796r;

    public y(Context context, AttributeSet attributeSet) {
        super(f3.a.b(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f1791l = new int[]{android.R.attr.state_selected};
        this.f1792m = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayF = r2.a0.f(context2, attributeSet, a2.a.f25q, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayF.hasValue(0) && typedArrayF.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.n = typedArrayF.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f1793o = typedArrayF.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayF.hasValue(2)) {
            this.f1794p = ColorStateList.valueOf(typedArrayF.getColor(2, 0));
        }
        this.f1795q = typedArrayF.getColor(4, 0);
        this.f1796r = t2.i.h(context2, typedArrayF, 5);
        this.f1790k = (AccessibilityManager) context2.getSystemService("accessibility");
        a2 a2Var = new a2(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f1789j = a2Var;
        a2Var.D = true;
        a2Var.E.setFocusable(true);
        a2Var.f2481t = this;
        a2Var.E.setInputMethodMode(2);
        a2Var.p(getAdapter());
        a2Var.f2482u = new w(0, this);
        if (typedArrayF.hasValue(6)) {
            setSimpleItems(typedArrayF.getResourceId(6, 0));
        }
        typedArrayF.recycle();
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f1790k;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f1789j.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f1794p;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.K) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.f1793o;
    }

    public int getSimpleItemSelectedColor() {
        return this.f1795q;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f1796r;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean isPopupShowing() {
        a2 a2Var = this.f1789j;
        if (a2Var == null || !a2Var.E.isShowing()) {
            return super.isPopupShowing();
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.K && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1789j.dismiss();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (isPopupShowing()) {
            return super.onKeyDown(i4, keyEvent);
        }
        boolean z4 = i4 == 66 || i4 == 23;
        boolean z5 = i4 == 62;
        if (getKeyListener() == null ? !(z4 || z5) : !(z4 && getMaxLines() == 1)) {
            return super.onKeyDown(i4, keyEvent);
        }
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.getEndIconView().performClick();
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                a2 a2Var = this.f1789j;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !a2Var.E.isShowing() ? -1 : a2Var.f2470h.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = a2Var.E.getBackground();
                if (background != null) {
                    Rect rect = this.f1792m;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z4);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t4) {
        super.setAdapter(t4);
        this.f1789j.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        a2 a2Var = this.f1789j;
        if (a2Var != null) {
            a2Var.h(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i4) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i4));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f1794p = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof a3.j) {
            ((a3.j) dropDownBackground).r(this.f1794p);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f1789j.f2483v = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i4) {
        super.setRawInputType(i4);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.u();
        }
    }

    public void setSimpleItemSelectedColor(int i4) {
        this.f1795q = i4;
        if (getAdapter() instanceof x) {
            ((x) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f1796r = colorStateList;
        if (getAdapter() instanceof x) {
            ((x) getAdapter()).a();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new x(this, getContext(), this.n, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f1789j.c();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(int i4) {
        setSimpleItems(getResources().getStringArray(i4));
    }
}
