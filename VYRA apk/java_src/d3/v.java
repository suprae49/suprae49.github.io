package d3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import co.median.android.eeqadjy.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public ColorStateList A;
    public Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f1765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f1766e;
    public final TimeInterpolator f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f1767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextInputLayout f1768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f1769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f1771k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f1772l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f1773m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1774o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f1775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y0 f1777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f1778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1779t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1780u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f1781v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f1782w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1783x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public y0 f1784y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1785z;

    public v(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f1767g = context;
        this.f1768h = textInputLayout;
        this.f1773m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f1762a = t2.i.K(context, R.attr.motionDurationShort4, 217);
        this.f1763b = t2.i.K(context, R.attr.motionDurationMedium4, 167);
        this.f1764c = t2.i.K(context, R.attr.motionDurationShort4, 167);
        this.f1765d = t2.i.L(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, b2.a.f1050d);
        LinearInterpolator linearInterpolator = b2.a.f1047a;
        this.f1766e = t2.i.L(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f = t2.i.L(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(y0 y0Var, int i4) {
        if (this.f1769i == null && this.f1771k == null) {
            Context context = this.f1767g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f1769i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f1769i;
            TextInputLayout textInputLayout = this.f1768h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f1771k = new FrameLayout(context);
            this.f1769i.addView(this.f1771k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i4 == 0 || i4 == 1) {
            this.f1771k.setVisibility(0);
            this.f1771k.addView(y0Var);
        } else {
            this.f1769i.addView(y0Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f1769i.setVisibility(0);
        this.f1770j++;
    }

    public final void b() {
        if (this.f1769i != null) {
            TextInputLayout textInputLayout = this.f1768h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f1767g;
                boolean zV = t2.i.v(context);
                LinearLayout linearLayout = this.f1769i;
                int paddingStart = editText.getPaddingStart();
                if (zV) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zV) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zV) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f1772l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z4, y0 y0Var, int i4, int i5, int i6) {
        if (y0Var == null || !z4) {
            return;
        }
        if (i4 == i6 || i4 == i5) {
            boolean z5 = i6 == i4;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(y0Var, (Property<y0, Float>) View.ALPHA, z5 ? 1.0f : 0.0f);
            int i7 = this.f1764c;
            objectAnimatorOfFloat.setDuration(z5 ? this.f1763b : i7);
            objectAnimatorOfFloat.setInterpolator(z5 ? this.f1766e : this.f);
            if (i4 == i6 && i5 != 0) {
                objectAnimatorOfFloat.setStartDelay(i7);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i6 != i4 || i5 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(y0Var, (Property<y0, Float>) View.TRANSLATION_Y, -this.f1773m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f1762a);
            objectAnimatorOfFloat2.setInterpolator(this.f1765d);
            objectAnimatorOfFloat2.setStartDelay(i7);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i4) {
        if (i4 == 1) {
            return this.f1777r;
        }
        if (i4 != 2) {
            return null;
        }
        return this.f1784y;
    }

    public final void f() {
        this.f1775p = null;
        c();
        if (this.n == 1) {
            if (!this.f1783x || TextUtils.isEmpty(this.f1782w)) {
                this.f1774o = 0;
            } else {
                this.f1774o = 2;
            }
        }
        i(this.n, h(this.f1777r, ""), this.f1774o);
    }

    public final void g(y0 y0Var, int i4) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f1769i;
        if (linearLayout == null) {
            return;
        }
        if ((i4 == 0 || i4 == 1) && (frameLayout = this.f1771k) != null) {
            frameLayout.removeView(y0Var);
        } else {
            linearLayout.removeView(y0Var);
        }
        int i5 = this.f1770j - 1;
        this.f1770j = i5;
        LinearLayout linearLayout2 = this.f1769i;
        if (i5 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(y0 y0Var, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f1768h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f1774o == this.n && y0Var != null && TextUtils.equals(y0Var.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i4, boolean z4, int i5) {
        TextView textViewE;
        TextView textViewE2;
        v vVar = this;
        if (i4 == i5) {
            return;
        }
        if (z4) {
            AnimatorSet animatorSet = new AnimatorSet();
            vVar.f1772l = animatorSet;
            ArrayList arrayList = new ArrayList();
            vVar.d(arrayList, vVar.f1783x, vVar.f1784y, 2, i4, i5);
            vVar.d(arrayList, vVar.f1776q, vVar.f1777r, 1, i4, i5);
            int size = arrayList.size();
            long jMax = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Animator animator = (Animator) arrayList.get(i6);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            u uVar = new u(this, i5, e(i4), i4, vVar.e(i5));
            vVar = this;
            animatorSet.addListener(uVar);
            animatorSet.start();
        } else if (i4 != i5) {
            if (i5 != 0 && (textViewE2 = vVar.e(i5)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i4 != 0 && (textViewE = e(i4)) != null) {
                textViewE.setVisibility(4);
                if (i4 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            vVar.n = i5;
        }
        TextInputLayout textInputLayout = vVar.f1768h;
        textInputLayout.t();
        textInputLayout.w(z4, false);
        textInputLayout.z();
    }
}
