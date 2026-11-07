package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.q;
import co.median.android.eeqadjy.R;
import com.google.android.material.datepicker.k;
import j.a0;
import j.m;
import k.g;
import k.p3;
import p0.p0;
import p0.r0;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public final k.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ActionMenuView f290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r0 f293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f295m;
    public CharSequence n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f296o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f297p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f298q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f300s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f301t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f302u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f303v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f304w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f305x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f306y;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        k.a aVar = new k.a();
        aVar.f2465c = this;
        aVar.f2464b = false;
        this.f = aVar;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f289g = context;
        } else {
            this.f289g = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.f1634d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : h0.w(context, resourceId));
        this.f303v = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f304w = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f292j = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f306y = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i4, int i5) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i5);
        return Math.max(0, i4 - view.getMeasuredWidth());
    }

    public static int g(View view, int i4, int i5, int i6, boolean z4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = ((i6 - measuredHeight) / 2) + i5;
        if (z4) {
            view.layout(i4 - measuredWidth, i7, i4, measuredHeight + i7);
        } else {
            view.layout(i4, i7, i4 + measuredWidth, measuredHeight + i7);
        }
        return z4 ? -measuredWidth : measuredWidth;
    }

    public final void c(i.a aVar) {
        View view = this.f297p;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f306y, (ViewGroup) this, false);
            this.f297p = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f297p);
        }
        View viewFindViewById = this.f297p.findViewById(R.id.action_mode_close_button);
        this.f298q = viewFindViewById;
        viewFindViewById.setOnClickListener(new k(2, aVar));
        m mVarC = aVar.c();
        b bVar = this.f291i;
        if (bVar != null) {
            bVar.c();
            g gVar = bVar.f424z;
            if (gVar != null && gVar.b()) {
                gVar.f2449j.dismiss();
            }
        }
        b bVar2 = new b(getContext());
        this.f291i = bVar2;
        bVar2.f416r = true;
        bVar2.f417s = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        mVarC.b(this.f291i, this.f289g);
        b bVar3 = this.f291i;
        a0 a0Var = bVar3.f412m;
        if (a0Var == null) {
            a0 a0Var2 = (a0) bVar3.f408i.inflate(bVar3.f410k, (ViewGroup) this, false);
            bVar3.f412m = a0Var2;
            a0Var2.a(bVar3.f407h);
            bVar3.f(true);
        }
        a0 a0Var3 = bVar3.f412m;
        if (a0Var != a0Var3) {
            ((ActionMenuView) a0Var3).setPresenter(bVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) a0Var3;
        this.f290h = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f290h, layoutParams);
    }

    public final void d() {
        if (this.f300s == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f300s = linearLayout;
            this.f301t = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f302u = (TextView) this.f300s.findViewById(R.id.action_bar_subtitle);
            int i4 = this.f303v;
            if (i4 != 0) {
                this.f301t.setTextAppearance(getContext(), i4);
            }
            int i5 = this.f304w;
            if (i5 != 0) {
                this.f302u.setTextAppearance(getContext(), i5);
            }
        }
        this.f301t.setText(this.n);
        this.f302u.setText(this.f296o);
        boolean zIsEmpty = TextUtils.isEmpty(this.n);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f296o);
        this.f302u.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f300s.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f300s.getParent() == null) {
            addView(this.f300s);
        }
    }

    public final void e() {
        removeAllViews();
        this.f299r = null;
        this.f290h = null;
        this.f291i = null;
        View view = this.f298q;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f293k != null ? this.f.f2463a : getVisibility();
    }

    public int getContentHeight() {
        return this.f292j;
    }

    public CharSequence getSubtitle() {
        return this.f296o;
    }

    public CharSequence getTitle() {
        return this.n;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i4) {
        if (i4 != getVisibility()) {
            r0 r0Var = this.f293k;
            if (r0Var != null) {
                r0Var.b();
            }
            super.setVisibility(i4);
        }
    }

    public final r0 i(int i4, long j4) {
        r0 r0Var = this.f293k;
        if (r0Var != null) {
            r0Var.b();
        }
        k.a aVar = this.f;
        if (i4 != 0) {
            r0 r0VarA = p0.a(this);
            r0VarA.a(0.0f);
            r0VarA.c(j4);
            ((ActionBarContextView) aVar.f2465c).f293k = r0VarA;
            aVar.f2463a = i4;
            r0VarA.d(aVar);
            return r0VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        r0 r0VarA2 = p0.a(this);
        r0VarA2.a(1.0f);
        r0VarA2.c(j4);
        ((ActionBarContextView) aVar.f2465c).f293k = r0VarA2;
        aVar.f2463a = i4;
        r0VarA2.d(aVar);
        return r0VarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i4;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, d.a.f1631a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        b bVar = this.f291i;
        if (bVar != null) {
            Configuration configuration2 = bVar.f406g.getResources().getConfiguration();
            int i5 = configuration2.screenWidthDp;
            int i6 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i5 > 600 || ((i5 > 960 && i6 > 720) || (i5 > 720 && i6 > 960))) {
                i4 = 5;
            } else if (i5 >= 500 || ((i5 > 640 && i6 > 480) || (i5 > 480 && i6 > 640))) {
                i4 = 4;
            } else {
                i4 = i5 >= 360 ? 3 : 2;
            }
            bVar.f420v = i4;
            m mVar = bVar.f407h;
            if (mVar != null) {
                mVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f291i;
        if (bVar != null) {
            bVar.c();
            g gVar = this.f291i.f424z;
            if (gVar == null || !gVar.b()) {
                return;
            }
            gVar.f2449j.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f295m = false;
        }
        if (!this.f295m) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f295m = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f295m = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        boolean z5 = p3.f2612a;
        boolean z6 = getLayoutDirection() == 1;
        int paddingRight = z6 ? (i6 - i4) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        View view = this.f297p;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f297p.getLayoutParams();
            int i8 = z6 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i9 = z6 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i10 = z6 ? paddingRight - i8 : paddingRight + i8;
            int iG = g(this.f297p, i10, paddingTop, paddingTop2, z6) + i10;
            paddingRight = z6 ? iG - i9 : iG + i9;
        }
        LinearLayout linearLayout = this.f300s;
        if (linearLayout != null && this.f299r == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f300s, paddingRight, paddingTop, paddingTop2, z6);
        }
        View view2 = this.f299r;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z6);
        }
        int paddingLeft = z6 ? getPaddingLeft() : (i6 - i4) - getPaddingRight();
        ActionMenuView actionMenuView = this.f290h;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z6);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            q.j(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i5) == 0) {
            q.j(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i4);
        int size2 = this.f292j;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i5);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f297p;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f297p.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f290h;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f290h, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f300s;
        if (linearLayout != null && this.f299r == null) {
            if (this.f305x) {
                this.f300s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f300s.getMeasuredWidth();
                boolean z4 = measuredWidth <= paddingLeft;
                if (z4) {
                    paddingLeft -= measuredWidth;
                }
                this.f300s.setVisibility(z4 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f299r;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i8 = layoutParams.height;
            int i9 = i8 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i8 >= 0) {
                iMin = Math.min(i8, iMin);
            }
            this.f299r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(iMin, i9));
        }
        if (this.f292j > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f294l = false;
        }
        if (!this.f294l) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f294l = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f294l = false;
        return true;
    }

    public void setContentHeight(int i4) {
        this.f292j = i4;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f299r;
        if (view2 != null) {
            removeView(view2);
        }
        this.f299r = view;
        if (view != null && (linearLayout = this.f300s) != null) {
            removeView(linearLayout);
            this.f300s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f296o = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.n = charSequence;
        d();
        p0.n(this, charSequence);
    }

    public void setTitleOptional(boolean z4) {
        if (z4 != this.f305x) {
            requestLayout();
        }
        this.f305x = z4;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
