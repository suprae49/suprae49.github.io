package e;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.e1;
import k.k3;
import k.m3;
import k.p3;
import p0.r0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends q implements j.k, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final p.k f1872m0 = new p.k(0);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int[] f1873n0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final boolean f1874o0 = !"robolectric".equals(Build.FINGERPRINT);
    public ActionBarContextView A;
    public PopupWindow B;
    public r C;
    public boolean E;
    public ViewGroup F;
    public TextView G;
    public View H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public c0[] Q;
    public c0 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Configuration W;
    public final int X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f1875a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public y f1876b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public y f1877c0;
    public boolean d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f1878e0;
    public boolean g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Rect f1880h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Rect f1881i0;
    public g0 j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public OnBackInvokedDispatcher f1882k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public OnBackInvokedCallback f1883l0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f1884o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Context f1885p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Window f1886q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public x f1887r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f1888s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public u1.h0 f1889t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i.h f1890u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CharSequence f1891v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ActionBarOverlayLayout f1892w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public s f1893x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s f1894y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public i.a f1895z;
    public r0 D = null;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final r f1879f0 = new r(this, 0);

    public d0(Context context, Window window, k kVar, Object obj) {
        j jVar = null;
        this.X = -100;
        this.f1885p = context;
        this.f1888s = kVar;
        this.f1884o = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof j)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    jVar = (j) context;
                    break;
                }
            }
            if (jVar != null) {
                this.X = ((d0) jVar.u()).X;
            }
        }
        if (this.X == -100) {
            String name = this.f1884o.getClass().getName();
            p.k kVar2 = f1872m0;
            Integer num = (Integer) kVar2.get(name);
            if (num != null) {
                this.X = num.intValue();
                kVar2.remove(this.f1884o.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        k.u.d();
    }

    public static k0.g q(Context context) {
        k0.g gVar;
        k0.g gVar2;
        if (Build.VERSION.SDK_INT >= 33 || (gVar = q.f1962h) == null) {
            return null;
        }
        k0.h hVar = gVar.f2722a;
        k0.g gVarB = v.b(context.getApplicationContext().getResources().getConfiguration());
        if (hVar.f2723a.isEmpty()) {
            gVar2 = k0.g.f2721b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i4 = 0;
            while (i4 < gVarB.f2722a.f2723a.size() + hVar.f2723a.size()) {
                Locale locale = i4 < hVar.f2723a.size() ? hVar.f2723a.get(i4) : gVarB.f2722a.f2723a.get(i4 - hVar.f2723a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i4++;
            }
            gVar2 = new k0.g(new k0.h(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return gVar2.f2722a.f2723a.isEmpty() ? gVarB : gVar2;
    }

    public static Configuration u(Context context, int i4, k0.g gVar, Configuration configuration, boolean z4) {
        int i5;
        if (i4 == 1) {
            i5 = 16;
        } else if (i4 != 2) {
            i5 = z4 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i5 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i5 | (configuration2.uiMode & (-49));
        if (gVar != null) {
            v.d(configuration2, gVar);
        }
        return configuration2;
    }

    public final a0 A(Context context) {
        if (this.f1876b0 == null) {
            if (androidx.emoji2.text.t.f576e == null) {
                Context applicationContext = context.getApplicationContext();
                androidx.emoji2.text.t.f576e = new androidx.emoji2.text.t(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f1876b0 = new y(this, androidx.emoji2.text.t.f576e);
        }
        return this.f1876b0;
    }

    public final c0 B(int i4) {
        c0[] c0VarArr = this.Q;
        if (c0VarArr == null || c0VarArr.length <= i4) {
            c0[] c0VarArr2 = new c0[i4 + 1];
            if (c0VarArr != null) {
                System.arraycopy(c0VarArr, 0, c0VarArr2, 0, c0VarArr.length);
            }
            this.Q = c0VarArr2;
            c0VarArr = c0VarArr2;
        }
        c0 c0Var = c0VarArr[i4];
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0();
        c0Var2.f1858a = i4;
        c0Var2.n = false;
        c0VarArr[i4] = c0Var2;
        return c0Var2;
    }

    public final void C() {
        x();
        if (this.K && this.f1889t == null) {
            Object obj = this.f1884o;
            if (obj instanceof Activity) {
                this.f1889t = new q0((Activity) obj, this.L);
            } else if (obj instanceof Dialog) {
                this.f1889t = new q0((Dialog) obj);
            }
            u1.h0 h0Var = this.f1889t;
            if (h0Var != null) {
                h0Var.Y(this.g0);
            }
        }
    }

    public final void D(int i4) {
        this.f1878e0 = (1 << i4) | this.f1878e0;
        if (this.d0) {
            return;
        }
        View decorView = this.f1886q.getDecorView();
        WeakHashMap weakHashMap = p0.p0.f3233a;
        decorView.postOnAnimation(this.f1879f0);
        this.d0 = true;
    }

    public final int E(Context context, int i4) {
        if (i4 != -100) {
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1 && i4 != 2) {
                        if (i4 != 3) {
                            androidx.fragment.app.q.j("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.f1877c0 == null) {
                            this.f1877c0 = new y(this, context);
                        }
                        return this.f1877c0.f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return A(context).f();
                }
            }
            return i4;
        }
        return -1;
    }

    public final boolean F() {
        boolean z4 = this.S;
        this.S = false;
        c0 c0VarB = B(0);
        if (!c0VarB.f1869m) {
            i.a aVar = this.f1895z;
            if (aVar != null) {
                aVar.a();
                return true;
            }
            C();
            u1.h0 h0Var = this.f1889t;
            if (h0Var == null || !h0Var.l()) {
                return false;
            }
        } else if (!z4) {
            t(c0VarB, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0165, code lost:
    
        if (r15.f2377k.getCount() > 0) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(e.c0 r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d0.G(e.c0, android.view.KeyEvent):void");
    }

    public final boolean H(c0 c0Var, int i4, KeyEvent keyEvent) {
        j.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0Var.f1867k || I(c0Var, keyEvent)) && (mVar = c0Var.f1864h) != null) {
            return mVar.performShortcut(i4, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:74:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0103  */
    /* JADX WARN: Code duplicated, block: B:82:0x0116  */
    public final boolean I(c0 c0Var, KeyEvent keyEvent) {
        j.m mVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.V) {
            boolean z4 = c0Var.f1867k;
            int i4 = c0Var.f1858a;
            if (z4) {
                return true;
            }
            c0 c0Var2 = this.R;
            if (c0Var2 != null && c0Var2 != c0Var) {
                t(c0Var2, false);
            }
            Window.Callback callback = this.f1886q.getCallback();
            if (callback != null) {
                c0Var.f1863g = callback.onCreatePanelView(i4);
            }
            boolean z5 = i4 == 0 || i4 == 108;
            if (z5 && (actionBarOverlayLayout4 = this.f1892w) != null) {
                actionBarOverlayLayout4.k();
                ((k3) actionBarOverlayLayout4.f310j).f2572l = true;
            }
            if (c0Var.f1863g == null && (!z5 || !(this.f1889t instanceof l0))) {
                j.m mVar2 = c0Var.f1864h;
                if (mVar2 == null || c0Var.f1870o) {
                    if (mVar2 == null) {
                        Context context = this.f1885p;
                        if ((i4 == 0 || i4 == 108) && this.f1892w != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(co.median.android.eeqadjy.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(co.median.android.eeqadjy.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(co.median.android.eeqadjy.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                i.c cVar = new i.c(context, 0);
                                cVar.getTheme().setTo(themeNewTheme);
                                context = cVar;
                            }
                        }
                        j.m mVar3 = new j.m(context);
                        mVar3.f2388e = this;
                        j.m mVar4 = c0Var.f1864h;
                        if (mVar3 != mVar4) {
                            if (mVar4 != null) {
                                mVar4.r(c0Var.f1865i);
                            }
                            c0Var.f1864h = mVar3;
                            j.i iVar = c0Var.f1865i;
                            if (iVar != null) {
                                mVar3.b(iVar, mVar3.f2384a);
                            }
                        }
                        if (c0Var.f1864h != null) {
                            if (z5 && (actionBarOverlayLayout2 = this.f1892w) != null) {
                                if (this.f1893x == null) {
                                    this.f1893x = new s(this, 3);
                                }
                                actionBarOverlayLayout2.l(c0Var.f1864h, this.f1893x);
                            }
                            c0Var.f1864h.y();
                            if (callback.onCreatePanelMenu(i4, c0Var.f1864h)) {
                                c0Var.f1870o = false;
                            } else {
                                mVar = c0Var.f1864h;
                                if (mVar != null) {
                                    if (mVar != null) {
                                        mVar.r(c0Var.f1865i);
                                    }
                                    c0Var.f1864h = null;
                                }
                                if (z5 && (actionBarOverlayLayout = this.f1892w) != null) {
                                    actionBarOverlayLayout.l(null, this.f1893x);
                                }
                            }
                        }
                    } else {
                        if (z5) {
                            if (this.f1893x == null) {
                                this.f1893x = new s(this, 3);
                            }
                            actionBarOverlayLayout2.l(c0Var.f1864h, this.f1893x);
                        }
                        c0Var.f1864h.y();
                        if (callback.onCreatePanelMenu(i4, c0Var.f1864h)) {
                            mVar = c0Var.f1864h;
                            if (mVar != null) {
                                if (mVar != null) {
                                    mVar.r(c0Var.f1865i);
                                }
                                c0Var.f1864h = null;
                            }
                            if (z5) {
                                actionBarOverlayLayout.l(null, this.f1893x);
                            }
                        } else {
                            c0Var.f1870o = false;
                        }
                    }
                }
                c0Var.f1864h.y();
                Bundle bundle = c0Var.f1871p;
                if (bundle != null) {
                    c0Var.f1864h.s(bundle);
                    c0Var.f1871p = null;
                }
                if (!callback.onPreparePanel(0, c0Var.f1863g, c0Var.f1864h)) {
                    if (z5 && (actionBarOverlayLayout3 = this.f1892w) != null) {
                        actionBarOverlayLayout3.l(null, this.f1893x);
                    }
                    c0Var.f1864h.x();
                    return false;
                }
                c0Var.f1864h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c0Var.f1864h.x();
            }
            c0Var.f1867k = true;
            c0Var.f1868l = false;
            this.R = c0Var;
            return true;
        }
        return false;
    }

    public final void J() {
        if (this.E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void K() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z4 = false;
            if (this.f1882k0 != null && (B(0).f1869m || this.f1895z != null)) {
                z4 = true;
            }
            if (z4 && this.f1883l0 == null) {
                this.f1883l0 = w.b(this.f1882k0, this);
            } else {
                if (z4 || (onBackInvokedCallback = this.f1883l0) == null) {
                    return;
                }
                w.c(this.f1882k0, onBackInvokedCallback);
                this.f1883l0 = null;
            }
        }
    }

    @Override // e.q
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1885p);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof d0) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // e.q
    public final void b() {
        if (this.f1889t != null) {
            C();
            if (this.f1889t.G()) {
                return;
            }
            D(0);
        }
    }

    @Override // e.q
    public final void d() {
        String strC;
        this.T = true;
        o(false, true);
        y();
        Object obj = this.f1884o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = b0.e.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e5) {
                    throw new IllegalArgumentException(e5);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                u1.h0 h0Var = this.f1889t;
                if (h0Var == null) {
                    this.g0 = true;
                } else {
                    h0Var.Y(true);
                }
            }
            synchronized (q.f1967m) {
                q.f(this);
                q.f1966l.add(new WeakReference(this));
            }
        }
        this.W = new Configuration(this.f1885p.getResources().getConfiguration());
        this.U = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // e.q
    public final void e() {
        if (this.f1884o instanceof Activity) {
            synchronized (q.f1967m) {
                q.f(this);
            }
        }
        if (this.d0) {
            this.f1886q.getDecorView().removeCallbacks(this.f1879f0);
        }
        this.V = true;
        if (this.X != -100) {
            Object obj = this.f1884o;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f1872m0.put(this.f1884o.getClass().getName(), Integer.valueOf(this.X));
            } else {
                f1872m0.remove(this.f1884o.getClass().getName());
            }
        } else {
            f1872m0.remove(this.f1884o.getClass().getName());
        }
        u1.h0 h0Var = this.f1889t;
        if (h0Var != null) {
            h0Var.O();
        }
        y yVar = this.f1876b0;
        if (yVar != null) {
            yVar.d();
        }
        y yVar2 = this.f1877c0;
        if (yVar2 != null) {
            yVar2.d();
        }
    }

    @Override // e.q
    public final boolean g(int i4) {
        if (i4 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i4 = 108;
        } else if (i4 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i4 = 109;
        }
        if (this.O && i4 == 108) {
            return false;
        }
        if (this.K && i4 == 1) {
            this.K = false;
        }
        if (i4 == 1) {
            J();
            this.O = true;
            return true;
        }
        if (i4 == 2) {
            J();
            this.I = true;
            return true;
        }
        if (i4 == 5) {
            J();
            this.J = true;
            return true;
        }
        if (i4 == 10) {
            J();
            this.M = true;
            return true;
        }
        if (i4 == 108) {
            J();
            this.K = true;
            return true;
        }
        if (i4 != 109) {
            return this.f1886q.requestFeature(i4);
        }
        J();
        this.L = true;
        return true;
    }

    @Override // e.q
    public final void h(int i4) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1885p).inflate(i4, viewGroup);
        this.f1887r.a(this.f1886q.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.g() != false) goto L20;
     */
    @Override // j.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(j.m r6) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d0.i(j.m):void");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // j.k
    public final boolean j(j.m mVar, MenuItem menuItem) {
        c0 c0Var;
        Window.Callback callback = this.f1886q.getCallback();
        if (callback != null && !this.V) {
            j.m mVarK = mVar.k();
            c0[] c0VarArr = this.Q;
            int length = c0VarArr != null ? c0VarArr.length : 0;
            for (int i4 = 0; i4 < length; i4++) {
                c0Var = c0VarArr[i4];
                if (c0Var != null && c0Var.f1864h == mVarK) {
                    if (c0Var != null) {
                        return callback.onMenuItemSelected(c0Var.f1858a, menuItem);
                    }
                }
            }
            c0Var = null;
            if (c0Var != null) {
                return callback.onMenuItemSelected(c0Var.f1858a, menuItem);
            }
        }
        return false;
    }

    @Override // e.q
    public final void k(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1887r.a(this.f1886q.getCallback());
    }

    @Override // e.q
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1887r.a(this.f1886q.getCallback());
    }

    @Override // e.q
    public final void n(CharSequence charSequence) {
        this.f1891v = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1892w;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        u1.h0 h0Var = this.f1889t;
        if (h0Var != null) {
            h0Var.n0(charSequence);
            return;
        }
        TextView textView = this.G;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00f8  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o(boolean z4, boolean z5) {
        int i4;
        boolean z6;
        if (this.V) {
            return false;
        }
        int i5 = this.X;
        if (i5 == -100) {
            i5 = q.f1961g;
        }
        Context context = this.f1885p;
        int iE = E(context, i5);
        int i6 = Build.VERSION.SDK_INT;
        k0.g gVarQ = i6 < 33 ? q(context) : null;
        if (!z5 && gVarQ != null) {
            gVarQ = v.b(context.getResources().getConfiguration());
        }
        Configuration configurationU = u(context, iE, gVarQ, null, false);
        boolean z7 = this.f1875a0;
        boolean z8 = true;
        Object obj = this.f1884o;
        if (z7 || !(obj instanceof Activity)) {
            this.f1875a0 = true;
            i4 = this.Z;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i4 = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i6 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.Z = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e5) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e5);
                    this.Z = 0;
                }
                this.f1875a0 = true;
                i4 = this.Z;
            }
        }
        Configuration configuration = this.W;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i7 = configuration.uiMode & 48;
        int i8 = configurationU.uiMode & 48;
        k0.g gVarB = v.b(configuration);
        k0.g gVarB2 = gVarQ == null ? null : v.b(configurationU);
        int i9 = i7 != i8 ? 512 : 0;
        if (gVarB2 != null && !gVarB.equals(gVarB2)) {
            i9 |= 8196;
        }
        if (((~i4) & i9) != 0 && z4 && this.T && ((f1874o0 || this.U) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z6 = false;
            } else {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 31 && (i9 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationU.getLayoutDirection());
                }
                if (i10 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new androidx.activity.k(4, activity));
                }
                z6 = true;
            }
        } else {
            z6 = false;
        }
        if (z6 || i9 == 0) {
            z8 = z6;
        } else {
            boolean z9 = (i9 & i4) == i9;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i8;
            if (gVarB2 != null) {
                v.d(configuration2, gVarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i11 = this.Y;
            if (i11 != 0) {
                context.setTheme(i11);
                context.getTheme().applyStyle(this.Y, true);
            }
            if (z9 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof androidx.lifecycle.t) {
                    if (((androidx.lifecycle.v) ((androidx.lifecycle.t) activity2).getLifecycle()).f866c.compareTo(androidx.lifecycle.n.f843h) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.U && !this.V) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (gVarB2 != null) {
            v.c(v.b(context.getResources().getConfiguration()));
        }
        if (i5 == 0) {
            A(context).m();
        } else {
            y yVar = this.f1876b0;
            if (yVar != null) {
                yVar.d();
            }
        }
        y yVar2 = this.f1877c0;
        if (i5 == 3) {
            if (yVar2 == null) {
                this.f1877c0 = new y(this, context);
            }
            this.f1877c0.m();
        } else if (yVar2 != null) {
            yVar2.d();
        }
        return z8;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View e0Var;
        View view2 = null;
        if (this.j0 == null) {
            int[] iArr = d.a.f1639j;
            Context context2 = this.f1885p;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.j0 = new g0();
            } else {
                try {
                    this.j0 = (g0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.j0 = new g0();
                }
            }
        }
        g0 g0Var = this.j0;
        int i4 = m3.f2587a;
        g0Var.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, d.a.A, 0, 0);
        byte b5 = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context cVar = (resourceId == 0 || ((context instanceof i.c) && ((i.c) context).f2180a == resourceId)) ? context : new i.c(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b5 = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b5 = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b5 = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b5 = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b5 = -1;
                }
                break;
            case -658531749:
                b5 = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b5 = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b5 = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b5 = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b5 = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b5 = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b5 = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b5 = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b5 = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b5 = -1;
                break;
        }
        switch (b5) {
            case 0:
                e0Var = new k.e0(cVar, attributeSet);
                break;
            case 1:
                e0Var = new k.r(cVar, attributeSet);
                break;
            case 2:
                e0Var = new k.a0(cVar, attributeSet);
                break;
            case 3:
                e0Var = g0Var.e(cVar, attributeSet);
                break;
            case 4:
                e0Var = new k.y(cVar, attributeSet, co.median.android.eeqadjy.R.attr.imageButtonStyle);
                break;
            case 5:
                e0Var = new k.g0(cVar, attributeSet);
                break;
            case 6:
                e0Var = new androidx.appcompat.widget.c(cVar, attributeSet);
                break;
            case 7:
                e0Var = g0Var.d(cVar, attributeSet);
                break;
            case 8:
                e0Var = new e1(cVar, attributeSet);
                break;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                e0Var = new k.z(cVar, attributeSet, 0);
                break;
            case 10:
                e0Var = g0Var.a(cVar, attributeSet);
                break;
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                e0Var = g0Var.c(cVar, attributeSet);
                break;
            case 12:
                e0Var = new k.w(cVar, attributeSet);
                break;
            case 13:
                e0Var = g0Var.b(cVar, attributeSet);
                break;
            default:
                e0Var = null;
                break;
        }
        if (e0Var != null || context == cVar) {
            view2 = e0Var;
        } else {
            Object[] objArr = g0Var.f1933a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = cVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i5 = 0;
                    while (true) {
                        String[] strArr = g0.f1931g;
                        if (i5 < 3) {
                            View viewF = g0Var.f(cVar, str, strArr[i5]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i5++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = g0Var.f(cVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
                objArr[0] = view2;
                objArr[1] = view2;
            } catch (Throwable th2) {
                objArr[0] = view2;
                objArr[1] = view2;
                throw th2;
            }
        }
        if (view2 != null) {
            Context context3 = view2.getContext();
            if ((context3 instanceof ContextWrapper) && view2.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, g0.f1928c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    view2.setOnClickListener(new f0(view2, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = cVar.obtainStyledAttributes(attributeSet, g0.f1929d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z4 = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = p0.p0.f3233a;
                    new p0.d0(co.median.android.eeqadjy.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).d(view2, Boolean.valueOf(z4));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = cVar.obtainStyledAttributes(attributeSet, g0.f1930e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    p0.p0.n(view2, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = cVar.obtainStyledAttributes(attributeSet, g0.f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z5 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = p0.p0.f3233a;
                    new p0.d0(co.median.android.eeqadjy.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).d(view2, Boolean.valueOf(z5));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return view2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    public final void p(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f1886q != null) {
            androidx.fragment.app.q.j("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof x) {
            androidx.fragment.app.q.j("AppCompat has already installed itself into the Window");
            return;
        }
        x xVar = new x(this, callback);
        this.f1887r = xVar;
        window.setCallback(xVar);
        androidx.emoji2.text.t tVarT = androidx.emoji2.text.t.t(this.f1885p, null, f1873n0);
        Drawable drawableJ = tVarT.j(0);
        if (drawableJ != null) {
            window.setBackgroundDrawable(drawableJ);
        }
        tVarT.v();
        this.f1886q = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f1882k0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f1883l0) != null) {
            w.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1883l0 = null;
        }
        Object obj = this.f1884o;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f1882k0 = w.a(activity);
            } else {
                this.f1882k0 = null;
            }
        } else {
            this.f1882k0 = null;
        }
        K();
    }

    public final void r(int i4, c0 c0Var, j.m mVar) {
        if (mVar == null) {
            if (c0Var == null && i4 >= 0) {
                c0[] c0VarArr = this.Q;
                if (i4 < c0VarArr.length) {
                    c0Var = c0VarArr[i4];
                }
            }
            if (c0Var != null) {
                mVar = c0Var.f1864h;
            }
        }
        if ((c0Var == null || c0Var.f1869m) && !this.V) {
            x xVar = this.f1887r;
            Window.Callback callback = this.f1886q.getCallback();
            xVar.getClass();
            try {
                xVar.f1994j = true;
                callback.onPanelClosed(i4, mVar);
            } finally {
                xVar.f1994j = false;
            }
        }
    }

    public final void s(j.m mVar) {
        androidx.appcompat.widget.b bVar;
        if (this.P) {
            return;
        }
        this.P = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1892w;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((k3) actionBarOverlayLayout.f310j).f2562a.f;
        if (actionMenuView != null && (bVar = actionMenuView.f330y) != null) {
            bVar.c();
            k.g gVar = bVar.f424z;
            if (gVar != null && gVar.b()) {
                gVar.f2449j.dismiss();
            }
        }
        Window.Callback callback = this.f1886q.getCallback();
        if (callback != null && !this.V) {
            callback.onPanelClosed(108, mVar);
        }
        this.P = false;
    }

    public final void t(c0 c0Var, boolean z4) {
        b0 b0Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z4 && c0Var.f1858a == 0 && (actionBarOverlayLayout = this.f1892w) != null) {
            actionBarOverlayLayout.k();
            if (((k3) actionBarOverlayLayout.f310j).f2562a.q()) {
                s(c0Var.f1864h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f1885p.getSystemService("window");
        if (windowManager != null && c0Var.f1869m && (b0Var = c0Var.f1862e) != null) {
            windowManager.removeView(b0Var);
            if (z4) {
                r(c0Var.f1858a, c0Var, null);
            }
        }
        c0Var.f1867k = false;
        c0Var.f1868l = false;
        c0Var.f1869m = false;
        c0Var.f = null;
        c0Var.n = true;
        if (this.R == c0Var) {
            this.R = null;
        }
        if (c0Var.f1858a == 0) {
            K();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:68:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x0121  */
    /* JADX WARN: Code duplicated, block: B:89:0x0125  */
    /* JADX WARN: Code duplicated, block: B:91:0x012d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0134 A[RETURN] */
    public final boolean v(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        c0 c0VarB;
        ActionBarOverlayLayout actionBarOverlayLayout;
        Context context;
        boolean z4;
        boolean zW;
        boolean zI;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        androidx.appcompat.widget.b bVar;
        c0 c0VarB2;
        Object obj = this.f1884o;
        if ((!(obj instanceof p0.k) && !(obj instanceof g)) || (decorView = this.f1886q.getDecorView()) == null || !e4.a.s(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                x xVar = this.f1887r;
                Window.Callback callback = this.f1886q.getCallback();
                xVar.getClass();
                try {
                    xVar.f1993i = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    xVar.f1993i = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.S = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    c0VarB2 = B(0);
                                    if (!c0VarB2.f1869m) {
                                        I(c0VarB2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.f1895z == null) {
                                    c0VarB = B(0);
                                    actionBarOverlayLayout = this.f1892w;
                                    context = this.f1885p;
                                    if (actionBarOverlayLayout != null) {
                                        actionBarOverlayLayout.k();
                                        toolbar = ((k3) actionBarOverlayLayout.f310j).f2562a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f) == null || !actionMenuView.f329x || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z4 = c0VarB.f1869m;
                                            if (!z4 || c0VarB.f1868l) {
                                                t(c0VarB, true);
                                                zW = z4;
                                            } else {
                                                if (c0VarB.f1867k) {
                                                    if (c0VarB.f1870o) {
                                                        c0VarB.f1867k = false;
                                                        zI = I(c0VarB, keyEvent);
                                                    } else {
                                                        zI = true;
                                                    }
                                                    if (zI) {
                                                        G(c0VarB, keyEvent);
                                                        zW = true;
                                                    }
                                                }
                                                zW = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1892w;
                                            actionBarOverlayLayout2.k();
                                            if (((k3) actionBarOverlayLayout2.f310j).f2562a.q()) {
                                                ActionBarOverlayLayout actionBarOverlayLayout3 = this.f1892w;
                                                actionBarOverlayLayout3.k();
                                                ActionMenuView actionMenuView2 = ((k3) actionBarOverlayLayout3.f310j).f2562a.f;
                                                if (actionMenuView2 != null && (bVar = actionMenuView2.f330y) != null && bVar.c()) {
                                                    zW = true;
                                                }
                                            } else if (!this.V && I(c0VarB, keyEvent)) {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = this.f1892w;
                                                actionBarOverlayLayout4.k();
                                                zW = ((k3) actionBarOverlayLayout4.f310j).f2562a.w();
                                            }
                                            zW = false;
                                        }
                                    } else {
                                        z4 = c0VarB.f1869m;
                                        if (z4) {
                                        }
                                        t(c0VarB, true);
                                        zW = z4;
                                    }
                                    if (zW) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (F()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    xVar.f1993i = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.S = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            c0VarB2 = B(0);
                            if (!c0VarB2.f1869m) {
                                I(c0VarB2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.f1895z == null) {
                            c0VarB = B(0);
                            actionBarOverlayLayout = this.f1892w;
                            context = this.f1885p;
                            if (actionBarOverlayLayout != null) {
                                actionBarOverlayLayout.k();
                                toolbar = ((k3) actionBarOverlayLayout.f310j).f2562a;
                                if (toolbar.getVisibility() == 0) {
                                    z4 = c0VarB.f1869m;
                                    if (z4) {
                                    }
                                    t(c0VarB, true);
                                    zW = z4;
                                } else {
                                    z4 = c0VarB.f1869m;
                                    if (z4) {
                                    }
                                    t(c0VarB, true);
                                    zW = z4;
                                }
                            } else {
                                z4 = c0VarB.f1869m;
                                if (z4) {
                                }
                                t(c0VarB, true);
                                zW = z4;
                            }
                            if (zW) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (F()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void w(int i4) {
        c0 c0VarB = B(i4);
        if (c0VarB.f1864h != null) {
            Bundle bundle = new Bundle();
            c0VarB.f1864h.u(bundle);
            if (bundle.size() > 0) {
                c0VarB.f1871p = bundle;
            }
            c0VarB.f1864h.y();
            c0VarB.f1864h.clear();
        }
        c0VarB.f1870o = true;
        c0VarB.n = true;
        if ((i4 == 108 || i4 == 0) && this.f1892w != null) {
            c0 c0VarB2 = B(0);
            c0VarB2.f1867k = false;
            I(c0VarB2, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        if (this.E) {
            return;
        }
        Context context = this.f1885p;
        int[] iArr = d.a.f1639j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            androidx.fragment.app.q.j("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        int i4 = 0;
        int i5 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.N = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        y();
        this.f1886q.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.O) {
            viewGroup = this.M ? (ViewGroup) layoutInflaterFrom.inflate(co.median.android.eeqadjy.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(co.median.android.eeqadjy.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.N) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(co.median.android.eeqadjy.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.L = false;
            this.K = false;
        } else if (this.K) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(co.median.android.eeqadjy.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new i.c(context, typedValue.resourceId) : context).inflate(co.median.android.eeqadjy.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(co.median.android.eeqadjy.R.id.decor_content_parent);
            this.f1892w = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.f1886q.getCallback());
            if (this.L) {
                this.f1892w.j(109);
            }
            if (this.I) {
                this.f1892w.j(2);
            }
            if (this.J) {
                this.f1892w.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.K + ", windowActionBarOverlay: " + this.L + ", android:windowIsFloating: " + this.N + ", windowActionModeOverlay: " + this.M + ", windowNoTitle: " + this.O + " }");
        }
        s sVar = new s(this, i4);
        WeakHashMap weakHashMap = p0.p0.f3233a;
        p0.h0.c(viewGroup, sVar);
        if (this.f1892w == null) {
            this.G = (TextView) viewGroup.findViewById(co.median.android.eeqadjy.R.id.title);
        }
        boolean z4 = p3.f2612a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e5) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e5);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e6) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e6);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(co.median.android.eeqadjy.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f1886q.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f1886q.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new s(this, i5));
        this.F = viewGroup;
        Object obj = this.f1884o;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1891v;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1892w;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                u1.h0 h0Var = this.f1889t;
                if (h0Var != null) {
                    h0Var.n0(title);
                } else {
                    TextView textView = this.G;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.F.findViewById(R.id.content);
        View decorView = this.f1886q.getDecorView();
        contentFrameLayout2.f339l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.E = true;
        c0 c0VarB = B(0);
        if (this.V || c0VarB.f1864h != null) {
            return;
        }
        D(108);
    }

    public final void y() {
        if (this.f1886q == null) {
            Object obj = this.f1884o;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.f1886q != null) {
            return;
        }
        androidx.fragment.app.q.j("We have not been given a Window");
    }

    public final Context z() {
        C();
        u1.h0 h0Var = this.f1889t;
        Context contextC = h0Var != null ? h0Var.C() : null;
        return contextC == null ? this.f1885p : contextC;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
