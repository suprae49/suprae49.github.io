package d3;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import co.median.android.eeqadjy.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.y0;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends LinearLayout {
    public final o A;
    public final TextInputLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FrameLayout f1734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CheckableImageButton f1735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ColorStateList f1736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f1737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View.OnLongClickListener f1738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CheckableImageButton f1739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r f1740m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f1741o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f1742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f1743q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1744r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageView.ScaleType f1745s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View.OnLongClickListener f1746t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f1747u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y0 f1748v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1749w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public EditText f1750x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AccessibilityManager f1751y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public AccessibilityManager.TouchExplorationStateChangeListener f1752z;

    public s(TextInputLayout textInputLayout, androidx.emoji2.text.t tVar) {
        super(textInputLayout.getContext());
        this.n = 0;
        this.f1741o = new LinkedHashSet();
        this.A = new o(this);
        p pVar = new p(this);
        this.f1751y = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1734g = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f1735h = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f1739l = checkableImageButtonA2;
        this.f1740m = new r(this, tVar);
        y0 y0Var = new y0(getContext(), null);
        this.f1748v = y0Var;
        TypedArray typedArray = (TypedArray) tVar.f579c;
        if (typedArray.hasValue(38)) {
            this.f1736i = t2.i.i(getContext(), tVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f1737j = r2.a0.h(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            j(tVar.i(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.f1742p = t2.i.i(getContext(), tVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f1743q = r2.a0.h(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            h(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27)) {
                g(typedArray.getText(27));
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.f1742p = t2.i.i(getContext(), tVar, 55);
            }
            if (typedArray.hasValue(56)) {
                this.f1743q = r2.a0.h(typedArray.getInt(56, -1), null);
            }
            h(typedArray.getBoolean(54, false) ? 1 : 0);
            g(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            androidx.fragment.app.q.q("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.f1744r) {
            this.f1744r = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeL = e4.a.l(typedArray.getInt(31, -1));
            this.f1745s = scaleTypeL;
            checkableImageButtonA2.setScaleType(scaleTypeL);
            checkableImageButtonA.setScaleType(scaleTypeL);
        }
        y0Var.setVisibility(8);
        y0Var.setId(R.id.textinput_suffix_text);
        y0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        y0Var.setAccessibilityLiveRegion(1);
        y0Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            y0Var.setTextColor(tVar.h(74));
        }
        CharSequence text = typedArray.getText(72);
        this.f1747u = TextUtils.isEmpty(text) ? null : text;
        y0Var.setText(text);
        o();
        frameLayout.addView(checkableImageButtonA2);
        addView(y0Var);
        addView(frameLayout);
        addView(checkableImageButtonA);
        final int i4 = 0;
        checkableImageButtonA.setOnFocusableChangedListener(new r2.a(this) { // from class: d3.n

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ s f1727g;

            {
                this.f1727g = this;
            }

            @Override // r2.a
            public final void b() {
                switch (i4) {
                    case 0:
                        CheckableImageButton checkableImageButton = this.f1727g.f1735h;
                        e4.a.n0(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = this.f1727g.f1739l;
                        e4.a.n0(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        final int i5 = 1;
        checkableImageButtonA2.setOnFocusableChangedListener(new r2.a(this) { // from class: d3.n

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ s f1727g;

            {
                this.f1727g = this;
            }

            @Override // r2.a
            public final void b() {
                switch (i5) {
                    case 0:
                        CheckableImageButton checkableImageButton = this.f1727g.f1735h;
                        e4.a.n0(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = this.f1727g.f1739l;
                        e4.a.n0(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.f1573k0.add(pVar);
        if (textInputLayout.f1571j != null) {
            pVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new q(0, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i4) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i4);
        if (t2.i.v(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final t b() {
        t fVar;
        int i4 = this.n;
        r rVar = this.f1740m;
        SparseArray sparseArray = rVar.f1730a;
        t tVar = (t) sparseArray.get(i4);
        if (tVar != null) {
            return tVar;
        }
        s sVar = rVar.f1731b;
        if (i4 == -1) {
            fVar = new f(sVar, 0);
        } else if (i4 == 0) {
            fVar = new f(sVar, 1);
        } else if (i4 == 1) {
            fVar = new z(sVar, rVar.f1733d);
        } else if (i4 == 2) {
            fVar = new e(sVar);
        } else {
            if (i4 != 3) {
                androidx.fragment.app.q.q(androidx.fragment.app.u.k(i4, "Invalid end icon mode: "));
                return null;
            }
            fVar = new m(sVar);
        }
        sparseArray.append(i4, fVar);
        return fVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f1739l;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f1748v.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f1734g.getVisibility() == 0 && this.f1739l.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f1735h.getVisibility() == 0;
    }

    public final void f(boolean z4) {
        boolean z5;
        boolean zIsActivated;
        boolean z6;
        t tVarB = b();
        boolean zJ = tVarB.j();
        CheckableImageButton checkableImageButton = this.f1739l;
        boolean z7 = true;
        if (!zJ || (z6 = checkableImageButton.f1507i) == tVarB.k()) {
            z5 = false;
        } else {
            checkableImageButton.setChecked(!z6);
            z5 = true;
        }
        if (!(tVarB instanceof m) || (zIsActivated = checkableImageButton.isActivated()) == ((m) tVarB).f1721l) {
            z7 = z5;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z4 || z7) {
            e4.a.Z(this.f, checkableImageButton, this.f1742p);
        }
    }

    public final void g(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1739l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            e4.a.n0(checkableImageButton, charSequence);
        }
    }

    public final void h(int i4) {
        if (this.n == i4) {
            return;
        }
        t tVarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f1752z;
        AccessibilityManager accessibilityManager = this.f1751y;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.f1752z = null;
        tVarB.r();
        this.n = i4;
        Iterator it = this.f1741o.iterator();
        if (it.hasNext()) {
            throw androidx.fragment.app.u.j(it);
        }
        i(i4 != 0);
        t tVarB2 = b();
        int iD = this.f1740m.f1732c;
        if (iD == 0) {
            iD = tVarB2.d();
        }
        Drawable drawableW = iD != 0 ? h0.w(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f1739l;
        checkableImageButton.setImageDrawable(drawableW);
        TextInputLayout textInputLayout = this.f;
        if (drawableW != null) {
            e4.a.b(textInputLayout, checkableImageButton, this.f1742p, this.f1743q);
            e4.a.Z(textInputLayout, checkableImageButton, this.f1742p);
        }
        checkableImageButton.setCheckable(tVarB2.j());
        if (!tVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i4);
        }
        tVarB2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = tVarB2.h();
        this.f1752z = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.f1752z);
        }
        View.OnClickListener onClickListenerF = tVarB2.f();
        View.OnLongClickListener onLongClickListener = this.f1746t;
        checkableImageButton.setOnClickListener(onClickListenerF);
        e4.a.e0(checkableImageButton, onLongClickListener);
        int iC = tVarB2.c();
        g(iC != 0 ? getResources().getText(iC) : null);
        EditText editText = this.f1750x;
        if (editText != null) {
            tVarB2.l(editText);
            k(tVarB2);
        }
        e4.a.b(textInputLayout, checkableImageButton, this.f1742p, this.f1743q);
        f(true);
    }

    public final void i(boolean z4) {
        EditText editText;
        if (d() != z4) {
            CheckableImageButton checkableImageButton = this.f1739l;
            if (!z4 && checkableImageButton.hasFocus() && (editText = this.f1750x) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z4 ? 0 : 8);
            l();
            n();
            this.f.s();
        }
    }

    public final void j(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1735h;
        checkableImageButton.setImageDrawable(drawable);
        m();
        e4.a.b(this.f, checkableImageButton, this.f1736i, this.f1737j);
    }

    public final void k(t tVar) {
        if (this.f1750x == null) {
            return;
        }
        if (tVar.e() != null) {
            this.f1750x.setOnFocusChangeListener(tVar.e());
        }
        if (tVar.g() != null) {
            this.f1739l.setOnFocusChangeListener(tVar.g());
        }
    }

    public final void l() {
        this.f1734g.setVisibility((this.f1739l.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.f1747u == null || this.f1749w) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void m() {
        CheckableImageButton checkableImageButton = this.f1735h;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f1581p.f1776q && textInputLayout.o()) ? 0 : 8);
        l();
        n();
        if (this.n != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void n() {
        TextInputLayout textInputLayout = this.f;
        if (textInputLayout.f1571j == null) {
            return;
        }
        this.f1748v.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f1571j.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.f1571j.getPaddingEnd(), textInputLayout.f1571j.getPaddingBottom());
    }

    public final void o() {
        y0 y0Var = this.f1748v;
        int visibility = y0Var.getVisibility();
        int i4 = (this.f1747u == null || this.f1749w) ? 8 : 0;
        if (visibility != i4) {
            b().o(i4 == 0);
        }
        l();
        y0Var.setVisibility(i4);
        this.f.s();
    }
}
