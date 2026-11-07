package e4;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.u;
import androidx.emoji2.text.v;
import androidx.fragment.app.q;
import b4.o;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import f0.b;
import i3.g;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import k0.c;
import k3.e;
import p0.k;
import p0.o0;
import p0.p0;
import p1.b0;
import q3.l;
import q3.p;
import r3.d;
import r3.f;
import r3.n;
import t1.i;
import u1.h0;
import z3.h;
import z3.x;
import z3.y;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f2059a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f2060b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f2061c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f2062d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f2063e = false;
    public static Field f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f2064g = true;

    public a() {
        new ConcurrentHashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class C(d dVar) {
        dVar.getClass();
        Class cls = dVar.f3611a;
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return cls;
    }

    public static Object G(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(bundle, str);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (ActivityResult.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static i3.c N(i3.c cVar) {
        cVar.getClass();
        e eVar = cVar instanceof e ? (e) cVar : null;
        if (eVar == null || (cVar = eVar.f2971h) != null) {
            return cVar;
        }
        g gVar = eVar.f2970g;
        gVar.getClass();
        h hVar = (h) gVar.a(i3.d.f);
        i3.c cVar2 = hVar != null ? new b4.c(hVar, eVar) : eVar;
        eVar.f2971h = cVar2;
        return cVar2;
    }

    public static boolean O(int i4) {
        if (i4 == 0) {
            return false;
        }
        ThreadLocal threadLocal = b.f2065a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i4);
        int iGreen = Color.green(i4);
        int iBlue = Color.blue(i4);
        if (dArr.length != 3) {
            q.q("outXyz must have a length of 3.");
            return false;
        }
        double d5 = ((double) iRed) / 255.0d;
        double dPow = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        double d6 = ((double) iGreen) / 255.0d;
        double dPow2 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        double d7 = ((double) iBlue) / 255.0d;
        double dPow3 = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d8 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d8;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d8 / 100.0d > 0.5d;
    }

    public static boolean P() {
        if (Build.VERSION.SDK_INT >= 29) {
            return o1.a.a();
        }
        try {
            if (f2060b == null) {
                f2059a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2060b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2060b.invoke(null, Long.valueOf(f2059a))).booleanValue();
        } catch (Exception e5) {
            if (!(e5 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e5);
                return false;
            }
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean R(String str) {
        t1.b bVar = i.f3709a;
        Set<t1.c> setUnmodifiableSet = Collections.unmodifiableSet(t1.c.f3703c);
        HashSet<t1.c> hashSet = new HashSet();
        for (t1.c cVar : setUnmodifiableSet) {
            if (cVar.f3704a.equals(str)) {
                hashSet.add(cVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        for (t1.c cVar2 : hashSet) {
            if (cVar2.a() || cVar2.b()) {
                return true;
            }
        }
        return false;
    }

    public static int U(int i4, int i5, float f4) {
        return b.b(b.d(i5, Math.round(Color.alpha(i5) * f4)), i4);
    }

    public static float V(EdgeEffect edgeEffect, float f4, float f5) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t0.b.c(edgeEffect, f4, f5);
        }
        edgeEffect.onPull(f4, f5);
        return f4;
    }

    public static g W(i3.e eVar, g gVar) {
        gVar.getClass();
        return h0.U(eVar, gVar);
    }

    public static void Z(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void a(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = m3.a.f3070a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = l3.a.f3039a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static int a0(Context context, TypedValue typedValue) {
        int i4 = typedValue.resourceId;
        return i4 != 0 ? c0.c.getColor(context, i4) : typedValue.data;
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void c(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static void d0(Window window, boolean z4) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 35) {
            c0.b.h(window, z4);
        } else {
            if (i4 >= 30) {
                c0.b.g(window, z4);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z4 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static void e0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z4 = onLongClickListener != null;
        boolean z5 = zHasOnClickListeners || z4;
        checkableImageButton.setFocusable(z5);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z4);
        checkableImageButton.setImportantForAccessibility(z5 ? 1 : 2);
    }

    public static Object i(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final Object i0(o oVar, o oVar2, p pVar) throws Throwable {
        Object eVar;
        int iB;
        Object objX;
        x xVar;
        if (pVar != null) {
            try {
                if (pVar instanceof g3.a) {
                    if (pVar instanceof f) {
                        iB = ((f) pVar).b();
                    } else if (pVar instanceof q3.a) {
                        iB = 0;
                    } else if (pVar instanceof l) {
                        iB = 1;
                    } else {
                        iB = pVar instanceof p ? 2 : -1;
                    }
                    if (iB == 2) {
                    }
                }
                n.b(pVar, "kotlin.jvm.functions.Function2");
                throw null;
            } catch (Throwable th) {
                eVar = new z3.e(th);
            }
        }
        eVar = pVar.f(oVar2, oVar);
        j3.a aVar = j3.a.f;
        if (eVar == aVar || (objX = oVar.x(eVar)) == z3.l.f4915c) {
            return aVar;
        }
        if (objX instanceof z3.e) {
            throw ((z3.e) objX).f4904a;
        }
        y yVar = objX instanceof y ? (y) objX : null;
        return (yVar == null || (xVar = yVar.f4932a) == null) ? objX : xVar;
    }

    public static final void j(Closeable closeable, Throwable th) {
        try {
            closeable.close();
        } catch (Throwable th2) {
            a(th, th2);
        }
    }

    public static void j0(ViewGroup viewGroup, boolean z4) {
        if (Build.VERSION.SDK_INT >= 29) {
            b0.b(viewGroup, z4);
        } else if (f2064g) {
            try {
                b0.b(viewGroup, z4);
            } catch (NoSuchMethodError unused) {
                f2064g = false;
            }
        }
    }

    public static int k(int i4, int i5) {
        return b.d(i4, (Color.alpha(i4) * i5) / 255);
    }

    public static int k0(Context context, int i4) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i4});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static ImageView.ScaleType l(int i4) {
        if (i4 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i4 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i4 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i4 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i4 != 5) {
            return i4 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static v m(Context context) {
        ProviderInfo providerInfo;
        l0.d dVar;
        ApplicationInfo applicationInfo;
        a3.f cVar = Build.VERSION.SDK_INT >= 28 ? new androidx.emoji2.text.c(2) : new a3.f(2);
        PackageManager packageManager = context.getPackageManager();
        h0.g(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            dVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrM = cVar.m(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrM) {
                    arrayList.add(signature.toByteArray());
                }
                dVar = new l0.d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e5) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e5);
                dVar = null;
            }
        }
        if (dVar == null) {
            return null;
        }
        return new v(new u(context, dVar));
    }

    public static ColorFilter n(int i4) {
        PorterDuff.Mode mode;
        if (Build.VERSION.SDK_INT >= 29) {
            Object objB = f0.a.b();
            if (objB != null) {
                return f0.a.a(i4, objB);
            }
        } else {
            switch (s.e.b(10)) {
                case 0:
                    mode = PorterDuff.Mode.CLEAR;
                    break;
                case 1:
                    mode = PorterDuff.Mode.SRC;
                    break;
                case 2:
                    mode = PorterDuff.Mode.DST;
                    break;
                case 3:
                    mode = PorterDuff.Mode.SRC_OVER;
                    break;
                case 4:
                    mode = PorterDuff.Mode.DST_OVER;
                    break;
                case 5:
                    mode = PorterDuff.Mode.SRC_IN;
                    break;
                case 6:
                    mode = PorterDuff.Mode.DST_IN;
                    break;
                case 7:
                    mode = PorterDuff.Mode.SRC_OUT;
                    break;
                case 8:
                    mode = PorterDuff.Mode.DST_OUT;
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    mode = PorterDuff.Mode.SRC_ATOP;
                    break;
                case 10:
                    mode = PorterDuff.Mode.DST_ATOP;
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    mode = PorterDuff.Mode.XOR;
                    break;
                case 12:
                    mode = PorterDuff.Mode.ADD;
                    break;
                case 13:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 14:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 15:
                    mode = PorterDuff.Mode.OVERLAY;
                    break;
                case 16:
                    mode = PorterDuff.Mode.DARKEN;
                    break;
                case 17:
                    mode = PorterDuff.Mode.LIGHTEN;
                    break;
                default:
                    mode = null;
                    break;
            }
            if (mode != null) {
                return new PorterDuffColorFilter(i4, mode);
            }
        }
        return null;
    }

    public static void n0(CheckableImageButton checkableImageButton, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }

    public static boolean s(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = p0.f3233a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = o0.f3228d;
        o0 o0Var = (o0) view.getTag(co.median.android.eeqadjy.R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (o0Var == null) {
            o0Var = new o0();
            o0Var.f3229a = null;
            o0Var.f3230b = null;
            o0Var.f3231c = null;
            view.setTag(co.median.android.eeqadjy.R.id.tag_unhandled_key_event_manager, o0Var);
        }
        WeakReference weakReference2 = o0Var.f3231c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        o0Var.f3231c = new WeakReference(keyEvent);
        if (o0Var.f3230b == null) {
            o0Var.f3230b = new SparseArray();
        }
        SparseArray sparseArray = o0Var.f3230b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(co.median.android.eeqadjy.R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        throw androidx.fragment.app.u.i(size, arrayList);
    }

    public static boolean t(k kVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (kVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return kVar.e(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f2061c) {
                            try {
                                f2062d = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f2061c = true;
                        }
                        Method method = f2062d;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (p0.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f2063e) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f2063e = true;
                }
                Field field = f;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (p0.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && p0.c(view, keyEvent)) || kVar.e(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static Integer u(Context context, int i4) {
        TypedValue typedValueP = t1.l.p(context.getTheme(), i4);
        if (typedValueP != null) {
            return Integer.valueOf(a0(context, typedValueP));
        }
        return null;
    }

    public static SharedPreferences x(ContextWrapper contextWrapper) {
        return contextWrapper.getSharedPreferences(contextWrapper.getPackageName() + "_preferences", 0);
    }

    public static float y(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return t0.b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static Set z() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public abstract int A();

    public abstract int B();

    public abstract int D();

    public abstract int E();

    public abstract int F(View view);

    public abstract int H(CoordinatorLayout coordinatorLayout);

    public abstract int I();

    public abstract int J(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int K();

    public abstract ViewPropertyAnimator L(View view, int i4);

    public abstract void M();

    public abstract boolean Q(float f4);

    public abstract boolean S(View view);

    public abstract boolean T(float f4, float f5);

    public abstract void X(r.f fVar, r.f fVar2);

    public abstract void Y(r.f fVar, Thread thread);

    public abstract void b0(boolean z4);

    public abstract void c0(boolean z4);

    public abstract int d(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float e(int i4);

    public abstract boolean f(r.g gVar, r.c cVar);

    public abstract void f0(int i4);

    public abstract boolean g(r.g gVar, Object obj, Object obj2);

    public abstract boolean g0(View view, float f4);

    public abstract boolean h(r.g gVar, r.f fVar, r.f fVar2);

    public abstract void h0(int i4);

    public abstract void l0(ViewGroup.MarginLayoutParams marginLayoutParams, int i4);

    public abstract void m0(ViewGroup.MarginLayoutParams marginLayoutParams, int i4, int i5);

    public abstract Typeface o(Context context, e0.f fVar, Resources resources, int i4);

    public abstract Typeface p(Context context, l0.i[] iVarArr, int i4);

    public Typeface q(Context context, List list, int i4) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract Typeface r(Context context, Resources resources, int i4, String str);

    public abstract int v(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract void w(a3.y yVar, float f4, float f5);
}
