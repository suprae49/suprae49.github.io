package u2;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.BaselineLayout;
import k.l3;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends FrameLayout implements i {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int[] f4158o0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a3.f f4159p0 = new a3.f(22);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final e f4160q0 = new e(22);
    public final TextView A;
    public final TextView B;
    public final BaselineLayout C;
    public final TextView D;
    public final TextView E;
    public BaselineLayout F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public ColorStateList L;
    public boolean M;
    public j.o N;
    public ColorStateList O;
    public Drawable P;
    public Drawable Q;
    public ValueAnimator R;
    public a3.f S;
    public float T;
    public boolean U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f4161a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f4162b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f4163c0;
    public int d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f4164e0;
    public boolean f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public d2.a f4165f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f4166g;
    public int g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f4167h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f4168h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4169i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f4170i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4171j;
    public boolean j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4172k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f4173k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4174l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f4175l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f4176m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f4177m0;
    public float n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Rect f4178n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f4179o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f4180p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f4181q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f4182r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4184t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinearLayout f4185u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinearLayout f4186v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final View f4187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final FrameLayout f4188x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ImageView f4189y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final BaselineLayout f4190z;

    public f(Context context) {
        super(context);
        this.f = false;
        this.G = -1;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.M = false;
        this.S = f4159p0;
        this.T = 0.0f;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.f4161a0 = -2;
        this.f4162b0 = 0;
        this.f4163c0 = false;
        this.d0 = 0;
        this.f4164e0 = 0;
        this.f4168h0 = 0;
        this.f4170i0 = 49;
        this.j0 = false;
        this.f4173k0 = false;
        this.f4175l0 = false;
        this.f4177m0 = false;
        this.f4178n0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f4185u = (LinearLayout) findViewById(co.median.android.eeqadjy.R.id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(co.median.android.eeqadjy.R.id.navigation_bar_item_inner_content_container);
        this.f4186v = linearLayout;
        this.f4187w = findViewById(co.median.android.eeqadjy.R.id.navigation_bar_item_active_indicator_view);
        this.f4188x = (FrameLayout) findViewById(co.median.android.eeqadjy.R.id.navigation_bar_item_icon_container);
        this.f4189y = (ImageView) findViewById(co.median.android.eeqadjy.R.id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(co.median.android.eeqadjy.R.id.navigation_bar_item_labels_group);
        this.f4190z = baselineLayout;
        TextView textView = (TextView) findViewById(co.median.android.eeqadjy.R.id.navigation_bar_item_small_label_view);
        this.A = textView;
        TextView textView2 = (TextView) findViewById(co.median.android.eeqadjy.R.id.navigation_bar_item_large_label_view);
        this.B = textView2;
        float dimension = getResources().getDimension(co.median.android.eeqadjy.R.dimen.default_navigation_text_size);
        float dimension2 = getResources().getDimension(co.median.android.eeqadjy.R.dimen.default_navigation_active_text_size);
        BaselineLayout baselineLayout2 = new BaselineLayout(getContext(), null, 0);
        baselineLayout2.f = -1;
        this.C = baselineLayout2;
        baselineLayout2.setVisibility(8);
        this.C.setDuplicateParentStateEnabled(true);
        this.C.setMeasurePaddingFromBaseline(this.f4175l0);
        TextView textView3 = new TextView(getContext());
        this.D = textView3;
        textView3.setMaxLines(1);
        TextView textView4 = this.D;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.D.setDuplicateParentStateEnabled(true);
        this.D.setIncludeFontPadding(false);
        this.D.setGravity(16);
        this.D.setTextSize(dimension);
        TextView textView5 = new TextView(getContext());
        this.E = textView5;
        textView5.setMaxLines(1);
        this.E.setEllipsize(truncateAt);
        this.E.setDuplicateParentStateEnabled(true);
        this.E.setVisibility(4);
        this.E.setIncludeFontPadding(false);
        this.E.setGravity(16);
        this.E.setTextSize(dimension2);
        this.C.addView(this.D);
        this.C.addView(this.E);
        this.F = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.f4169i = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f4171j = baselineLayout.getPaddingBottom();
        this.f4172k = 0;
        this.f4174l = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.D.setImportantForAccessibility(2);
        this.E.setImportantForAccessibility(2);
        setFocusable(true);
        a();
        this.f4162b0 = getResources().getDimensionPixelSize(co.median.android.eeqadjy.R.dimen.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new j2.a(2, (g2.a) this));
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i4 = 0;
        for (int i5 = 0; i5 < iIndexOfChild; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if ((childAt instanceof f) && childAt.getVisibility() == 0) {
                i4++;
            }
        }
        return i4;
    }

    private int getSuggestedIconWidth() {
        d2.a aVar = this.f4165f0;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.f4165f0.f1660j.f1669b.B.intValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4188x.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.f4189y.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void i(View view, int i4, int i5, int i6) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i4;
        layoutParams.bottomMargin = i5;
        layoutParams.gravity = i6;
        view.setLayoutParams(layoutParams);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    public final void a() {
        float textSize = this.A.getTextSize();
        float textSize2 = this.B.getTextSize();
        this.f4176m = textSize - textSize2;
        this.n = (textSize2 * 1.0f) / textSize;
        this.f4179o = (textSize * 1.0f) / textSize2;
        float textSize3 = this.D.getTextSize();
        float textSize4 = this.E.getTextSize();
        this.f4180p = textSize3 - textSize4;
        this.f4181q = (textSize4 * 1.0f) / textSize3;
        this.f4182r = (textSize3 * 1.0f) / textSize4;
    }

    @Override // j.z
    public final void b(j.o oVar) {
        this.N = oVar;
        setCheckable(oVar.isCheckable());
        setChecked(oVar.isChecked());
        setEnabled(oVar.isEnabled());
        setIcon(oVar.getIcon());
        setTitle(oVar.f2412e);
        setId(oVar.f2408a);
        if (!TextUtils.isEmpty(oVar.f2422q)) {
            setContentDescription(oVar.f2422q);
        }
        l3.a(this, !TextUtils.isEmpty(oVar.f2423r) ? oVar.f2423r : oVar.f2412e);
        m();
        this.f = true;
    }

    public final void c() {
        Drawable rippleDrawable = this.f4167h;
        Drawable drawable = null;
        drawable = null;
        drawable = null;
        drawable = null;
        boolean z4 = true;
        if (this.f4166g != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.U && activeIndicatorDrawable != null) {
                RippleDrawable rippleDrawable2 = new RippleDrawable(y2.a.b(this.f4166g), null, activeIndicatorDrawable);
                FocusRingDrawable.e(getContext(), rippleDrawable2, activeIndicatorDrawable instanceof a3.j ? (a3.j) activeIndicatorDrawable : null);
                drawable = rippleDrawable2;
                z4 = false;
            } else if (rippleDrawable == null) {
                ColorStateList colorStateList = this.f4166g;
                int[] iArr = y2.a.f4796d;
                int iA = y2.a.a(colorStateList, y2.a.f4795c);
                int[] iArr2 = y2.a.f4794b;
                rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{iA, y2.a.a(colorStateList, iArr2), y2.a.a(colorStateList, y2.a.f4793a)}), null, null);
                Context context = getContext();
                ColorDrawable colorDrawable = FocusRingDrawable.f1488u;
                if (t1.l.q(context.getTheme(), co.median.android.eeqadjy.R.attr.focusRingsEnabled, false)) {
                    rippleDrawable = new FocusRingDrawable(context, rippleDrawable);
                }
            }
        }
        FrameLayout frameLayout = this.f4188x;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setForeground(drawable);
        setBackground(rippleDrawable);
        setDefaultFocusHighlightEnabled(z4);
    }

    public final void d(float f, float f4) {
        a3.f fVar = this.S;
        fVar.getClass();
        float fA = b2.a.a(0.4f, 1.0f, f);
        View view = this.f4187w;
        view.setScaleX(fA);
        view.setScaleY(fVar.j(f));
        view.setAlpha(b2.a.b(0.0f, 1.0f, f4 == 0.0f ? 0.8f : 0.0f, f4 == 0.0f ? 1.0f : 0.2f, f));
        this.T = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.U) {
            this.f4188x.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        int i4 = this.f4189y.getLayoutParams().width > 0 ? this.f4174l : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.C.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i4 : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i4 : 0;
        }
    }

    public final void f(TextView textView, TextView textView2, float f, float f4) {
        i(this.f4185u, this.g0 == 0 ? (int) (this.f4169i + f4) : 0, 0, this.f4170i0);
        int i4 = this.g0;
        i(this.f4186v, i4 == 0 ? 0 : this.f4178n0.top, i4 == 0 ? 0 : this.f4178n0.bottom, i4 == 0 ? 17 : 8388627);
        int i5 = this.f4171j;
        BaselineLayout baselineLayout = this.f4190z;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), i5);
        this.F.setVisibility(0);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView.setVisibility(0);
        textView2.setScaleX(f);
        textView2.setScaleY(f);
        textView2.setVisibility(4);
    }

    public final void g() {
        int i4 = this.f4169i;
        i(this.f4185u, i4, i4, this.g0 == 0 ? 17 : this.f4170i0);
        i(this.f4186v, 0, 0, 17);
        BaselineLayout baselineLayout = this.f4190z;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), 0);
        this.F.setVisibility(8);
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.f4187w.getBackground();
    }

    public d2.a getBadge() {
        return this.f4165f0;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.C;
    }

    public int getItemBackgroundResId() {
        return co.median.android.eeqadjy.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // j.z
    public j.o getItemData() {
        return this.N;
    }

    public int getItemDefaultMarginResId() {
        return co.median.android.eeqadjy.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.G;
    }

    public BaselineLayout getLabelGroup() {
        return this.f4190z;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        LinearLayout linearLayout = this.f4185u;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        return linearLayout.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.g0 == 1) {
            LinearLayout linearLayout = this.f4186v;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            return linearLayout.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        BaselineLayout baselineLayout = this.f4190z;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), baselineLayout.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    public final void h(TextView textView, int i4) {
        int iRound;
        if (this.f4177m0) {
            textView.setTextAppearance(i4);
            return;
        }
        textView.setTextAppearance(i4);
        Context context = textView.getContext();
        if (i4 == 0) {
            iRound = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i4, d.a.f1653y);
            TypedValue typedValue = new TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                int complexUnit = typedValue.getComplexUnit();
                int i5 = typedValue.data;
                iRound = complexUnit == 2 ? Math.round(TypedValue.complexToFloat(i5) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(i5, context.getResources().getDisplayMetrics());
            } else {
                iRound = 0;
            }
        }
        if (iRound != 0) {
            textView.setTextSize(0, iRound);
        }
    }

    public final void j(View view) {
        if (this.f4165f0 != null) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                d2.a aVar = this.f4165f0;
                if (aVar != null) {
                    if (aVar.d() != null) {
                        aVar.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(aVar);
                    }
                }
            }
            this.f4165f0 = null;
        }
    }

    public final void k(int i4) {
        if (i4 > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.V, i4 - (this.d0 * 2));
            int iMax = this.W;
            if (this.g0 == 1) {
                int measuredWidth = i4 - (this.f4164e0 * 2);
                int i5 = this.f4161a0;
                if (i5 != -1) {
                    measuredWidth = i5 == -2 ? this.f4185u.getMeasuredWidth() : Math.min(i5, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.f4162b0, this.f4186v.getMeasuredHeight());
            }
            View view = this.f4187w;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.f4163c0 && this.f4183s == 2) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void l(TextView textView, int i4) {
        if (textView == null) {
            return;
        }
        h(textView, i4);
        a();
        textView.setMinimumHeight(t2.i.o(textView.getContext(), i4));
        ColorStateList colorStateList = this.L;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        TextView textView2 = this.B;
        textView2.setTypeface(textView2.getTypeface(), this.M ? 1 : 0);
        TextView textView3 = this.E;
        textView3.setTypeface(textView3.getTypeface(), this.M ? 1 : 0);
    }

    public final void m() {
        j.o oVar = this.N;
        if (oVar != null) {
            setVisibility((!oVar.isVisible() || (!this.j0 && this.f4173k0)) ? 8 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        j.o oVar = this.N;
        if (oVar != null && oVar.isCheckable() && this.N.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4158o0);
        }
        return iArrOnCreateDrawableState;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d2.a aVar = this.f4165f0;
        if (aVar != null && aVar.isVisible()) {
            j.o oVar = this.N;
            CharSequence charSequence = oVar.f2412e;
            if (!TextUtils.isEmpty(oVar.f2422q)) {
                charSequence = this.N.f2422q;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) charSequence);
            sb.append(", ");
            d2.a aVar2 = this.f4165f0;
            d2.b bVar = aVar2.f1660j;
            Object quantityString = null;
            if (aVar2.isVisible()) {
                BadgeState$State badgeState$State = bVar.f1669b;
                if (badgeState$State.f1262o != null) {
                    quantityString = badgeState$State.f1267t;
                    if (quantityString == null) {
                        quantityString = aVar2.f1660j.f1669b.f1262o;
                    }
                } else if (!aVar2.g()) {
                    quantityString = badgeState$State.f1268u;
                } else if (badgeState$State.f1269v != 0 && (context = (Context) aVar2.f.get()) != null) {
                    if (aVar2.f1663m != -2) {
                        int iE = aVar2.e();
                        int i4 = aVar2.f1663m;
                        if (iE <= i4) {
                            quantityString = context.getResources().getQuantityString(badgeState$State.f1269v, aVar2.e(), Integer.valueOf(aVar2.e()));
                        } else {
                            quantityString = context.getString(badgeState$State.f1270w, Integer.valueOf(i4));
                        }
                    } else {
                        quantityString = context.getResources().getQuantityString(badgeState$State.f1269v, aVar2.e(), Integer.valueOf(aVar2.e()));
                    }
                }
            }
            sb.append(quantityString);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c3.f.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).f1157a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) q0.c.f3367g.f3374a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(co.median.android.eeqadjy.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        post(new androidx.emoji2.text.i(i4, 3, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.f4187w.setBackground(drawable);
        c();
    }

    public void setActiveIndicatorEnabled(boolean z4) {
        this.U = z4;
        c();
        this.f4187w.setVisibility(z4 ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i4) {
        this.f4162b0 = i4;
        k(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i4) {
        this.f4164e0 = i4;
        if (this.g0 == 1) {
            setPadding(i4, 0, i4, 0);
        }
        k(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.f4178n0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i4) {
        this.f4161a0 = i4;
        k(getWidth());
    }

    public void setActiveIndicatorHeight(int i4) {
        this.W = i4;
        k(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i4) {
        if (this.f4172k != i4) {
            this.f4172k = i4;
            ((LinearLayout.LayoutParams) this.f4190z.getLayoutParams()).topMargin = i4;
            if (this.C.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.C.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i4 : 0;
                if (getLayoutDirection() == 1) {
                    i4 = 0;
                }
                layoutParams.leftMargin = i4;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i4) {
        this.d0 = i4;
        k(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z4) {
        this.f4163c0 = z4;
    }

    public void setActiveIndicatorWidth(int i4) {
        this.V = i4;
        k(getWidth());
    }

    public void setBadge(d2.a aVar) {
        d2.a aVar2 = this.f4165f0;
        if (aVar2 == aVar) {
            return;
        }
        ImageView imageView = this.f4189y;
        if (aVar2 != null && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            j(imageView);
        }
        this.f4165f0 = aVar;
        int i4 = this.f4168h0;
        d2.b bVar = aVar.f1660j;
        if (bVar.f1678l != i4) {
            bVar.f1678l = i4;
            aVar.j();
        }
        if (imageView == null || this.f4165f0 == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        d2.a aVar3 = this.f4165f0;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        aVar3.setBounds(rect);
        aVar3.i(imageView, null);
        if (aVar3.d() != null) {
            aVar3.d().setForeground(aVar3);
        } else {
            imageView.getOverlay().add(aVar3);
        }
    }

    public void setCheckable(boolean z4) {
        refreshDrawableState();
    }

    public void setChecked(boolean z4) {
        TextView textView = this.B;
        setLabelPivots(textView);
        TextView textView2 = this.A;
        setLabelPivots(textView2);
        TextView textView3 = this.E;
        setLabelPivots(textView3);
        TextView textView4 = this.D;
        setLabelPivots(textView4);
        float f = z4 ? 1.0f : 0.0f;
        if (this.U && this.f && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.R;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.R = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.T, f);
            this.R = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new d(this, f));
            this.R.setInterpolator(t2.i.L(getContext(), co.median.android.eeqadjy.R.attr.motionEasingEmphasizedInterpolator, b2.a.f1048b));
            this.R.setDuration(t2.i.K(getContext(), co.median.android.eeqadjy.R.attr.motionDurationLong2, getResources().getInteger(co.median.android.eeqadjy.R.integer.material_motion_duration_long_1)));
            this.R.start();
        } else {
            d(f, f);
        }
        float f4 = this.f4176m;
        float f5 = this.n;
        float f6 = this.f4179o;
        if (this.g0 == 1) {
            f4 = this.f4180p;
            f5 = this.f4181q;
            f6 = this.f4182r;
            textView = textView3;
            textView2 = textView4;
        }
        int i4 = this.f4183s;
        if (i4 != -1) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        g();
                    }
                } else if (z4) {
                    f(textView, textView2, f5, f4);
                } else {
                    f(textView2, textView, f6, 0.0f);
                }
            } else if (z4) {
                f(textView, textView2, f5, 0.0f);
            } else {
                g();
            }
        } else if (this.f4184t) {
            if (z4) {
                f(textView, textView2, f5, 0.0f);
            } else {
                g();
            }
        } else if (z4) {
            f(textView, textView2, f5, f4);
        } else {
            f(textView2, textView, f6, 0.0f);
        }
        refreshDrawableState();
        setSelected(z4);
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        this.A.setEnabled(z4);
        this.B.setEnabled(z4);
        this.D.setEnabled(z4);
        this.E.setEnabled(z4);
        this.f4189y.setEnabled(z4);
    }

    @Override // u2.i
    public void setExpanded(boolean z4) {
        this.j0 = z4;
        m();
    }

    public void setHorizontalTextAppearanceActive(int i4) {
        this.J = i4;
        if (i4 == 0) {
            i4 = this.H;
        }
        l(this.E, i4);
    }

    public void setHorizontalTextAppearanceInactive(int i4) {
        this.K = i4;
        if (i4 == 0) {
            i4 = this.I;
        }
        TextView textView = this.D;
        if (textView == null) {
            return;
        }
        h(textView, i4);
        a();
        textView.setMinimumHeight(t2.i.o(textView.getContext(), i4));
        ColorStateList colorStateList = this.L;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.P) {
            return;
        }
        this.P = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.Q = drawable;
            ColorStateList colorStateList = this.O;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.f4189y.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i4) {
        if (this.f4174l != i4) {
            this.f4174l = i4;
            e();
            requestLayout();
        }
    }

    public void setIconSize(int i4) {
        ImageView imageView = this.f4189y;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i4;
        layoutParams.height = i4;
        imageView.setLayoutParams(layoutParams);
        e();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.O = colorStateList;
        if (this.N == null || (drawable = this.Q) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.Q.invalidateSelf();
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f4167h = drawable;
        c();
    }

    public void setItemGravity(int i4) {
        this.f4170i0 = i4;
        requestLayout();
    }

    public void setItemIconGravity(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.g0 != i4) {
            this.g0 = i4;
            this.f4168h0 = 0;
            BaselineLayout baselineLayout = this.f4190z;
            this.F = baselineLayout;
            LinearLayout linearLayout = this.f4186v;
            int i11 = 8;
            if (i4 == 1) {
                if (this.C.getParent() == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    linearLayout.addView(this.C, layoutParams);
                    e();
                }
                Rect rect = this.f4178n0;
                int i12 = rect.left;
                int i13 = rect.right;
                int i14 = rect.top;
                i5 = rect.bottom;
                this.f4168h0 = 1;
                int i15 = this.f4164e0;
                this.F = this.C;
                i9 = i14;
                i8 = i13;
                i7 = i12;
                i6 = i15;
                i10 = 0;
            } else {
                i5 = 0;
                i6 = 0;
                i7 = 0;
                i8 = 0;
                i9 = 0;
                i10 = 8;
                i11 = 0;
            }
            baselineLayout.setVisibility(i11);
            this.C.setVisibility(i10);
            ((FrameLayout.LayoutParams) this.f4185u.getLayoutParams()).gravity = this.f4170i0;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.leftMargin = i7;
            layoutParams2.rightMargin = i8;
            layoutParams2.topMargin = i9;
            layoutParams2.bottomMargin = i5;
            setPadding(i6, 0, i6, 0);
            k(getWidth());
            c();
        }
    }

    public void setItemPaddingBottom(int i4) {
        if (this.f4171j != i4) {
            this.f4171j = i4;
            j.o oVar = this.N;
            if (oVar != null) {
                setChecked(oVar.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i4) {
        if (this.f4169i != i4) {
            this.f4169i = i4;
            j.o oVar = this.N;
            if (oVar != null) {
                setChecked(oVar.isChecked());
            }
        }
    }

    public void setItemPosition(int i4) {
        this.G = i4;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f4166g = colorStateList;
        c();
    }

    public void setLabelFontScalingEnabled(boolean z4) {
        this.f4177m0 = z4;
        setTextAppearanceActive(this.H);
        setTextAppearanceInactive(this.I);
        setHorizontalTextAppearanceActive(this.J);
        setHorizontalTextAppearanceInactive(this.K);
    }

    public void setLabelMaxLines(int i4) {
        TextView textView = this.A;
        textView.setMaxLines(i4);
        TextView textView2 = this.B;
        textView2.setMaxLines(i4);
        this.D.setMaxLines(i4);
        this.E.setMaxLines(i4);
        if (Build.VERSION.SDK_INT > 34) {
            textView.setGravity(17);
            textView2.setGravity(17);
        } else if (i4 > 1) {
            textView.setEllipsize(null);
            textView2.setEllipsize(null);
            textView.setGravity(17);
            textView2.setGravity(17);
        } else {
            textView.setGravity(16);
            textView2.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i4) {
        if (this.f4183s != i4) {
            this.f4183s = i4;
            if (this.f4163c0 && i4 == 2) {
                this.S = f4160q0;
            } else {
                this.S = f4159p0;
            }
            k(getWidth());
            j.o oVar = this.N;
            if (oVar != null) {
                setChecked(oVar.isChecked());
            }
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z4) {
        this.f4175l0 = z4;
        this.f4190z.setMeasurePaddingFromBaseline(z4);
        this.A.setIncludeFontPadding(z4);
        this.B.setIncludeFontPadding(z4);
        this.C.setMeasurePaddingFromBaseline(z4);
        this.D.setIncludeFontPadding(z4);
        this.E.setIncludeFontPadding(z4);
        requestLayout();
    }

    @Override // u2.i
    public void setOnlyShowWhenExpanded(boolean z4) {
        this.f4173k0 = z4;
        m();
    }

    public void setShifting(boolean z4) {
        if (this.f4184t != z4) {
            this.f4184t = z4;
            j.o oVar = this.N;
            if (oVar != null) {
                setChecked(oVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i4) {
        this.H = i4;
        l(this.B, i4);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z4) {
        this.M = z4;
        setTextAppearanceActive(this.H);
        setHorizontalTextAppearanceActive(this.J);
        TextView textView = this.B;
        textView.setTypeface(textView.getTypeface(), this.M ? 1 : 0);
        TextView textView2 = this.E;
        textView2.setTypeface(textView2.getTypeface(), this.M ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i4) {
        this.I = i4;
        TextView textView = this.A;
        if (textView == null) {
            return;
        }
        h(textView, i4);
        a();
        textView.setMinimumHeight(t2.i.o(textView.getContext(), i4));
        ColorStateList colorStateList = this.L;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        if (colorStateList != null) {
            this.A.setTextColor(colorStateList);
            this.B.setTextColor(colorStateList);
            this.D.setTextColor(colorStateList);
            this.E.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.A.setText(charSequence);
        this.B.setText(charSequence);
        this.D.setText(charSequence);
        this.E.setText(charSequence);
        j.o oVar = this.N;
        if (oVar == null || TextUtils.isEmpty(oVar.f2422q)) {
            setContentDescription(charSequence);
        }
        j.o oVar2 = this.N;
        if (oVar2 != null && !TextUtils.isEmpty(oVar2.f2423r)) {
            charSequence = this.N.f2423r;
        }
        l3.a(this, charSequence);
    }

    public void setItemBackground(int i4) {
        setItemBackground(i4 == 0 ? null : getContext().getDrawable(i4));
    }
}
