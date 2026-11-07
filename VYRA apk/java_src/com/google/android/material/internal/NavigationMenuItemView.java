package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.datepicker.i;
import e0.l;
import j.o;
import j.z;
import k.l3;
import k.t1;
import p0.p0;
import r2.d;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends d implements z {
    public static final int[] L = {R.attr.state_checked};
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public final CheckedTextView E;
    public FrameLayout F;
    public o G;
    public ColorStateList H;
    public boolean I;
    public Drawable J;
    public final i K;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = true;
        i iVar = new i(3, this);
        this.K = iVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(co.median.android.eeqadjy.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(co.median.android.eeqadjy.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(co.median.android.eeqadjy.R.id.design_menu_item_text);
        this.E = checkedTextView;
        p0.m(checkedTextView, iVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.F == null) {
                this.F = (FrameLayout) ((ViewStub) findViewById(co.median.android.eeqadjy.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.F.removeAllViews();
            this.F.addView(view);
        }
    }

    @Override // j.z
    public final void b(o oVar) {
        StateListDrawable stateListDrawable;
        this.G = oVar;
        int i4 = oVar.f2408a;
        if (i4 > 0) {
            setId(i4);
        }
        setVisibility(oVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(co.median.android.eeqadjy.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(L, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setTitle(oVar.f2412e);
        setIcon(oVar.getIcon());
        setActionView(oVar.getActionView());
        setContentDescription(oVar.f2422q);
        l3.a(this, oVar.f2423r);
        o oVar2 = this.G;
        CharSequence charSequence = oVar2.f2412e;
        CheckedTextView checkedTextView = this.E;
        if (charSequence == null && oVar2.getIcon() == null && this.G.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.F;
            if (frameLayout != null) {
                t1 t1Var = (t1) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) t1Var).width = -1;
                this.F.setLayoutParams(t1Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.F;
        if (frameLayout2 != null) {
            t1 t1Var2 = (t1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) t1Var2).width = -2;
            this.F.setLayoutParams(t1Var2);
        }
    }

    @Override // j.z
    public o getItemData() {
        return this.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        o oVar = this.G;
        if (oVar != null && oVar.isCheckable() && this.G.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, L);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z4) {
        refreshDrawableState();
        if (this.C != z4) {
            this.C = z4;
            this.K.h(this.E, 2048);
        }
    }

    public void setChecked(boolean z4) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.E;
        checkedTextView.setChecked(z4);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z4 && this.D) ? 1 : 0);
    }

    public void setHorizontalPadding(int i4) {
        setPadding(i4, getPaddingTop(), i4, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.I) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.H);
            }
            int i4 = this.A;
            drawable.setBounds(0, 0, i4, i4);
        } else if (this.B) {
            if (this.J == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = l.f2031a;
                Drawable drawable2 = resources.getDrawable(co.median.android.eeqadjy.R.drawable.navigation_empty_icon, theme);
                this.J = drawable2;
                if (drawable2 != null) {
                    int i5 = this.A;
                    drawable2.setBounds(0, 0, i5, i5);
                }
            }
            drawable = this.J;
        }
        this.E.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i4) {
        this.E.setCompoundDrawablePadding(i4);
    }

    public void setIconSize(int i4) {
        this.A = i4;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.H = colorStateList;
        this.I = colorStateList != null;
        o oVar = this.G;
        if (oVar != null) {
            setIcon(oVar.getIcon());
        }
    }

    public void setMaxLines(int i4) {
        this.E.setMaxLines(i4);
    }

    public void setNeedsEmptyIcon(boolean z4) {
        this.B = z4;
    }

    public void setTextAppearance(int i4) {
        this.E.setTextAppearance(i4);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.E.setText(charSequence);
    }
}
