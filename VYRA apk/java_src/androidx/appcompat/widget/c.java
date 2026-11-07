package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.emoji2.text.t;
import k.i0;
import k.j0;
import k.k0;
import k.l0;
import k.n0;
import k.o;
import k.o0;
import k.z2;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Spinner {
    public static final int[] n = {R.attr.spinnerMode};
    public final o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SpinnerAdapter f427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o0 f429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f431m;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public c(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, co.median.android.eeqadjy.R.attr.spinnerStyle);
        this.f431m = new Rect();
        z2.a(this, getContext());
        int[] iArr = d.a.f1651w;
        t tVarS = t.s(co.median.android.eeqadjy.R.attr.spinnerStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) tVarS.f579c;
        this.f = new o(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f425g = new i.c(context, resourceId);
        } else {
            this.f425g = context;
        }
        int i4 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n, co.median.android.eeqadjy.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i4 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e5) {
                    e = e5;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i4 != 0) {
                        k0 k0Var = new k0(this);
                        this.f429k = k0Var;
                        k0Var.f2560h = typedArray.getString(2);
                    } else if (i4 == 1) {
                        n0 n0Var = new n0(this, this.f425g, attributeSet);
                        t tVarS2 = t.s(co.median.android.eeqadjy.R.attr.spinnerStyle, 0, this.f425g, attributeSet, iArr);
                        this.f430l = ((TypedArray) tVarS2.f579c).getLayoutDimension(3, -2);
                        n0Var.h(tVarS2.i(1));
                        n0Var.H = typedArray.getString(2);
                        tVarS2.v();
                        this.f429k = n0Var;
                        this.f426h = new i0(this, this, n0Var);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(co.median.android.eeqadjy.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    tVarS.v();
                    this.f428j = true;
                    spinnerAdapter = this.f427i;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f427i = null;
                    }
                    this.f.k(attributeSet, co.median.android.eeqadjy.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i4 != 0) {
            k0 k0Var2 = new k0(this);
            this.f429k = k0Var2;
            k0Var2.f2560h = typedArray.getString(2);
        } else if (i4 == 1) {
            n0 n0Var2 = new n0(this, this.f425g, attributeSet);
            t tVarS3 = t.s(co.median.android.eeqadjy.R.attr.spinnerStyle, 0, this.f425g, attributeSet, iArr);
            this.f430l = ((TypedArray) tVarS3.f579c).getLayoutDimension(3, -2);
            n0Var2.h(tVarS3.i(1));
            n0Var2.H = typedArray.getString(2);
            tVarS3.v();
            this.f429k = n0Var2;
            this.f426h = new i0(this, this, n0Var2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(co.median.android.eeqadjy.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        tVarS.v();
        this.f428j = true;
        spinnerAdapter = this.f427i;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f427i = null;
        }
        this.f.k(attributeSet, co.median.android.eeqadjy.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i4 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f431m;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f;
        if (oVar != null) {
            oVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        o0 o0Var = this.f429k;
        return o0Var != null ? o0Var.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        o0 o0Var = this.f429k;
        return o0Var != null ? o0Var.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f429k != null ? this.f430l : super.getDropDownWidth();
    }

    public final o0 getInternalPopup() {
        return this.f429k;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        o0 o0Var = this.f429k;
        return o0Var != null ? o0Var.d() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f425g;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        o0 o0Var = this.f429k;
        return o0Var != null ? o0Var.o() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f;
        if (oVar != null) {
            return oVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f;
        if (oVar != null) {
            return oVar.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o0 o0Var = this.f429k;
        if (o0Var == null || !o0Var.b()) {
            return;
        }
        o0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f429k == null || View.MeasureSpec.getMode(i4) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (!appCompatSpinner$SavedState.f || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new j.d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(super.onSaveInstanceState());
        o0 o0Var = this.f429k;
        appCompatSpinner$SavedState.f = o0Var != null && o0Var.b();
        return appCompatSpinner$SavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i0 i0Var = this.f426h;
        if (i0Var == null || !i0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        o0 o0Var = this.f429k;
        if (o0Var == null) {
            return super.performClick();
        }
        if (o0Var.b()) {
            return true;
        }
        o0Var.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f428j) {
            this.f427i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        o0 o0Var = this.f429k;
        if (o0Var != null) {
            Context context = this.f425g;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            l0 l0Var = new l0();
            l0Var.f = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                l0Var.f2580g = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                j0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            o0Var.p(l0Var);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f;
        if (oVar != null) {
            oVar.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        o oVar = this.f;
        if (oVar != null) {
            oVar.n(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i4) {
        o0 o0Var = this.f429k;
        if (o0Var == null) {
            super.setDropDownHorizontalOffset(i4);
        } else {
            o0Var.j(i4);
            o0Var.l(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i4) {
        o0 o0Var = this.f429k;
        if (o0Var != null) {
            o0Var.i(i4);
        } else {
            super.setDropDownVerticalOffset(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i4) {
        if (this.f429k != null) {
            this.f430l = i4;
        } else {
            super.setDropDownWidth(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        o0 o0Var = this.f429k;
        if (o0Var != null) {
            o0Var.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i4) {
        setPopupBackgroundDrawable(h0.w(getPopupContext(), i4));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        o0 o0Var = this.f429k;
        if (o0Var != null) {
            o0Var.e(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f;
        if (oVar != null) {
            oVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f;
        if (oVar != null) {
            oVar.t(mode);
        }
    }
}
