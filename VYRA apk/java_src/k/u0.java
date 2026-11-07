package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f2646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b3 f2647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b3 f2648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b3 f2649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b3 f2650e;
    public b3 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b3 f2651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b3 f2652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d1 f2653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2654j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2655k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f2656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2657m;

    public u0(TextView textView) {
        this.f2646a = textView;
        this.f2653i = new d1(textView);
    }

    public static b3 c(Context context, u uVar, int i4) {
        ColorStateList colorStateListF;
        synchronized (uVar) {
            colorStateListF = uVar.f2645a.f(context, i4);
        }
        if (colorStateListF == null) {
            return null;
        }
        b3 b3Var = new b3();
        b3Var.f2493d = true;
        b3Var.f2490a = colorStateListF;
        return b3Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i4 >= 30) {
            c0.b.i(editorInfo, text);
            return;
        }
        text.getClass();
        if (i4 >= 30) {
            c0.b.i(editorInfo, text);
            return;
        }
        int i5 = editorInfo.initialSelStart;
        int i6 = editorInfo.initialSelEnd;
        int i7 = i5 > i6 ? i6 : i5;
        if (i5 <= i6) {
            i5 = i6;
        }
        int length = text.length();
        if (i7 < 0 || i5 > length) {
            u1.h0.l0(editorInfo, null, 0, 0);
            return;
        }
        int i8 = editorInfo.inputType & 4095;
        if (i8 == 129 || i8 == 225 || i8 == 18) {
            u1.h0.l0(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            u1.h0.l0(editorInfo, text, i7, i5);
            return;
        }
        int i9 = i5 - i7;
        int i10 = i9 > 1024 ? 0 : i9;
        int i11 = 2048 - i10;
        int iMin = Math.min(text.length() - i5, i11 - Math.min(i7, (int) (((double) i11) * 0.8d)));
        int iMin2 = Math.min(i7, i11 - iMin);
        int i12 = i7 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i12))) {
            i12++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i5 + iMin) - 1))) {
            iMin--;
        }
        int i13 = iMin2 + i10;
        u1.h0.l0(editorInfo, i10 != i9 ? TextUtils.concat(text.subSequence(i12, i12 + iMin2), text.subSequence(i5, iMin + i5)) : text.subSequence(i12, i13 + iMin + i12), iMin2, i13);
    }

    public final void a(Drawable drawable, b3 b3Var) {
        if (drawable == null || b3Var == null) {
            return;
        }
        u.e(drawable, b3Var, this.f2646a.getDrawableState());
    }

    public final void b() {
        b3 b3Var = this.f2647b;
        TextView textView = this.f2646a;
        if (b3Var != null || this.f2648c != null || this.f2649d != null || this.f2650e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f2647b);
            a(compoundDrawables[1], this.f2648c);
            a(compoundDrawables[2], this.f2649d);
            a(compoundDrawables[3], this.f2650e);
        }
        if (this.f == null && this.f2651g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.f2651g);
    }

    public final ColorStateList d() {
        b3 b3Var = this.f2652h;
        if (b3Var != null) {
            return b3Var.f2490a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        b3 b3Var = this.f2652h;
        if (b3Var != null) {
            return b3Var.f2491b;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:226:0x0390  */
    /* JADX WARN: Code duplicated, block: B:228:0x0395  */
    /* JADX WARN: Code duplicated, block: B:231:0x039c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:232:0x039e  */
    /* JADX WARN: Code duplicated, block: B:234:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:236:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:238:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:241:? A[RETURN, SYNTHETIC] */
    public final void f(AttributeSet attributeSet, int i4) {
        boolean z4;
        boolean z5;
        String string;
        String string2;
        float dimensionPixelSize;
        int i5;
        ColorStateList colorStateList;
        int resourceId;
        int i6;
        int resourceId2;
        TextView textView = this.f2646a;
        Context context = textView.getContext();
        u uVarA = u.a();
        int[] iArr = d.a.f1637h;
        androidx.emoji2.text.t tVarS = androidx.emoji2.text.t.s(i4, 0, context, attributeSet, iArr);
        p0.p0.l(textView, textView.getContext(), iArr, attributeSet, (TypedArray) tVarS.f579c, i4);
        TypedArray typedArray = (TypedArray) tVarS.f579c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f2647b = c(context, uVarA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f2648c = c(context, uVarA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f2649d = c(context, uVarA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f2650e = c(context, uVarA, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, uVarA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f2651g = c(context, uVarA, typedArray.getResourceId(6, 0));
        }
        tVarS.v();
        boolean z6 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = d.a.f1653y;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(context, typedArrayObtainStyledAttributes);
            if (z6 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z4 = false;
                z5 = false;
            } else {
                z5 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z4 = true;
            }
            n(context, tVar);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            tVar.v();
        } else {
            z4 = false;
            z5 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i4, 0);
        androidx.emoji2.text.t tVar2 = new androidx.emoji2.text.t(context, typedArrayObtainStyledAttributes2);
        if (!z6 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z5 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z4 = true;
        }
        boolean z7 = z5;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (Build.VERSION.SDK_INT >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, tVar2);
        tVar2.v();
        if (!z6 && z4) {
            textView.setAllCaps(z7);
        }
        Typeface typeface = this.f2656l;
        if (typeface != null) {
            if (this.f2655k == -1) {
                textView.setTypeface(typeface, this.f2654j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            s0.d(textView, string);
        }
        if (string2 != null) {
            r0.b(textView, r0.a(string2));
        }
        d1 d1Var = this.f2653i;
        Context context2 = d1Var.f2512j;
        int[] iArr3 = d.a.f1638i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i4, 0);
        TextView textView2 = d1Var.f2511i;
        p0.p0.l(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i4);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            d1Var.f2504a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i7 = 0; i7 < length; i7++) {
                    iArr4[i7] = typedArrayObtainTypedArray.getDimensionPixelSize(i7, -1);
                }
                d1Var.f = d1.b(iArr4);
                d1Var.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!d1Var.j()) {
            d1Var.f2504a = 0;
        } else if (d1Var.f2504a == 1) {
            if (!d1Var.f2509g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i6 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                d1Var.k(dimension2, f, dimension);
            }
            d1Var.h();
        }
        if (p3.f2614c && d1Var.f2504a != 0) {
            int[] iArr5 = d1Var.f;
            if (iArr5.length > 0) {
                if (s0.a(textView) != -1.0f) {
                    s0.b(textView, Math.round(d1Var.f2507d), Math.round(d1Var.f2508e), Math.round(d1Var.f2506c), 0);
                } else {
                    s0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? uVarA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? uVarA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? uVarA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? uVarA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? uVarA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? uVarA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableB5 == null) {
                drawableB5 = compoundDrawablesRelative[0];
            }
            if (drawableB2 == null) {
                drawableB2 = compoundDrawablesRelative[1];
            }
            if (drawableB6 == null) {
                drawableB6 = compoundDrawablesRelative[2];
            }
            if (drawableB4 == null) {
                drawableB4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawablesRelative2[1];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableB2, compoundDrawablesRelative2[2], drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = c0.c.getColorStateList(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(j1.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i8 = typedValuePeekValue.data;
                i5 = i8 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i8);
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != -1) {
                u1.h0.d0(textView, dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != -1) {
                u1.h0.g0(textView, dimensionPixelSize3);
            }
            if (dimensionPixelSize != -1.0f) {
                if (i5 == -1) {
                    u1.h0.h0(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    o.a.h(textView, i5, dimensionPixelSize);
                } else {
                    u1.h0.h0(textView, Math.round(TypedValue.applyDimension(i5, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        dimensionPixelSize = -1.0f;
        i5 = -1;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != -1) {
            u1.h0.d0(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            u1.h0.g0(textView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (i5 == -1) {
                u1.h0.h0(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                o.a.h(textView, i5, dimensionPixelSize);
            } else {
                u1.h0.h0(textView, Math.round(TypedValue.applyDimension(i5, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i4) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i4, d.a.f1653y);
        androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f2646a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, tVar);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            s0.d(textView, string);
        }
        tVar.v();
        Typeface typeface = this.f2656l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2654j);
        }
    }

    public final void i(int i4, int i5, int i6, int i7) {
        d1 d1Var = this.f2653i;
        if (d1Var.j()) {
            DisplayMetrics displayMetrics = d1Var.f2512j.getResources().getDisplayMetrics();
            d1Var.k(TypedValue.applyDimension(i7, i4, displayMetrics), TypedValue.applyDimension(i7, i5, displayMetrics), TypedValue.applyDimension(i7, i6, displayMetrics));
            if (d1Var.h()) {
                d1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i4) {
        d1 d1Var = this.f2653i;
        if (d1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i4 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = d1Var.f2512j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArrCopyOf[i5] = Math.round(TypedValue.applyDimension(i4, iArr[i5], displayMetrics));
                    }
                }
                d1Var.f = d1.b(iArrCopyOf);
                if (!d1Var.i()) {
                    androidx.fragment.app.q.u(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                d1Var.f2509g = false;
            }
            if (d1Var.h()) {
                d1Var.a();
            }
        }
    }

    public final void k(int i4) {
        d1 d1Var = this.f2653i;
        if (d1Var.j()) {
            if (i4 == 0) {
                d1Var.f2504a = 0;
                d1Var.f2507d = -1.0f;
                d1Var.f2508e = -1.0f;
                d1Var.f2506c = -1.0f;
                d1Var.f = new int[0];
                d1Var.f2505b = false;
                return;
            }
            if (i4 != 1) {
                androidx.fragment.app.q.q(androidx.fragment.app.u.k(i4, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = d1Var.f2512j.getResources().getDisplayMetrics();
            d1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (d1Var.h()) {
                d1Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f2652h == null) {
            this.f2652h = new b3();
        }
        b3 b3Var = this.f2652h;
        b3Var.f2490a = colorStateList;
        b3Var.f2493d = colorStateList != null;
        this.f2647b = b3Var;
        this.f2648c = b3Var;
        this.f2649d = b3Var;
        this.f2650e = b3Var;
        this.f = b3Var;
        this.f2651g = b3Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f2652h == null) {
            this.f2652h = new b3();
        }
        b3 b3Var = this.f2652h;
        b3Var.f2491b = mode;
        b3Var.f2492c = mode != null;
        this.f2647b = b3Var;
        this.f2648c = b3Var;
        this.f2649d = b3Var;
        this.f2650e = b3Var;
        this.f = b3Var;
        this.f2651g = b3Var;
    }

    public final void n(Context context, androidx.emoji2.text.t tVar) {
        String string;
        int i4 = this.f2654j;
        TypedArray typedArray = (TypedArray) tVar.f579c;
        this.f2654j = typedArray.getInt(2, i4);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            int i6 = typedArray.getInt(11, -1);
            this.f2655k = i6;
            if (i6 != -1) {
                this.f2654j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f2657m = false;
                int i7 = typedArray.getInt(1, 1);
                if (i7 == 1) {
                    this.f2656l = Typeface.SANS_SERIF;
                    return;
                } else if (i7 == 2) {
                    this.f2656l = Typeface.SERIF;
                    return;
                } else {
                    if (i7 != 3) {
                        return;
                    }
                    this.f2656l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2656l = null;
        int i8 = typedArray.hasValue(12) ? 12 : 10;
        int i9 = this.f2655k;
        int i10 = this.f2654j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceK = tVar.k(i8, this.f2654j, new q0(this, i9, i10, new WeakReference(this.f2646a)));
                if (typefaceK != null) {
                    if (i5 < 28 || this.f2655k == -1) {
                        this.f2656l = typefaceK;
                    } else {
                        this.f2656l = t0.a(Typeface.create(typefaceK, 0), this.f2655k, (this.f2654j & 2) != 0);
                    }
                }
                this.f2657m = this.f2656l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2656l != null || (string = typedArray.getString(i8)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2655k == -1) {
            this.f2656l = Typeface.create(string, this.f2654j);
        } else {
            this.f2656l = t0.a(Typeface.create(string, 0), this.f2655k, (this.f2654j & 2) != 0);
        }
    }
}
