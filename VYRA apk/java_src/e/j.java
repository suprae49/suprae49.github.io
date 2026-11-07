package e;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k.h2;
import k.m3;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends androidx.fragment.app.e0 implements k {
    public d0 D;

    public j() {
        this.f235i.f3011b.c("androidx:appcompat", new h(this));
        o(new i(this));
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        d0 d0Var = (d0) u();
        d0Var.x();
        ((ViewGroup) d0Var.F.findViewById(R.id.content)).addView(view, layoutParams);
        d0Var.f1887r.a(d0Var.f1886q.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0193  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:114:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:122:0x01de  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:136:0x020d A[Catch: all -> 0x0201, TRY_LEAVE, TryCatch #0 {, blocks: (B:127:0x01ef, B:129:0x01f3, B:135:0x020b, B:136:0x020d, B:138:0x0211, B:144:0x0221, B:143:0x0218, B:134:0x0204), top: B:154:0x01ef, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0115  */
    /* JADX WARN: Code duplicated, block: B:75:0x011d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0125  */
    /* JADX WARN: Code duplicated, block: B:81:0x012d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0139  */
    /* JADX WARN: Code duplicated, block: B:87:0x0148  */
    /* JADX WARN: Code duplicated, block: B:90:0x0157  */
    /* JADX WARN: Code duplicated, block: B:93:0x0166  */
    /* JADX WARN: Code duplicated, block: B:96:0x0175  */
    /* JADX WARN: Code duplicated, block: B:99:0x0184  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        Configuration configuration3;
        i.c cVar;
        Resources.Theme theme;
        Method method;
        float f;
        float f4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        d0 d0Var = (d0) u();
        d0Var.T = true;
        int i44 = d0Var.X;
        if (i44 == -100) {
            i44 = q.f1961g;
        }
        int iE = d0Var.E(context, i44);
        if (q.c(context) && q.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (q.n) {
                    try {
                        k0.g gVar = q.f1962h;
                        if (gVar == null) {
                            if (q.f1963i == null) {
                                q.f1963i = k0.g.a(b0.e.e(context));
                            }
                            if (!q.f1963i.f2722a.f2723a.isEmpty()) {
                                q.f1962h = q.f1963i;
                            }
                        } else if (!gVar.equals(q.f1963i)) {
                            k0.g gVar2 = q.f1962h;
                            q.f1963i = gVar2;
                            b0.e.d(context, gVar2.f2722a.f2723a.toLanguageTags());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!q.f1965k) {
                q.f.execute(new l(context, 0));
            }
        }
        k0.g gVarQ = d0.q(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(d0.u(context, iE, gVarQ, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof i.c) {
                    try {
                        ((i.c) context).a(d0.u(context, iE, gVarQ, null, false));
                    } catch (IllegalStateException unused2) {
                        if (d0.f1874o0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (configuration.equals(configuration2)) {
                                configuration3 = null;
                            } else {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f = configuration.fontScale;
                                    f4 = configuration2.fontScale;
                                    if (f != f4) {
                                        configuration3.fontScale = f4;
                                    }
                                    i4 = configuration.mcc;
                                    i5 = configuration2.mcc;
                                    if (i4 != i5) {
                                        configuration3.mcc = i5;
                                    }
                                    i6 = configuration.mnc;
                                    i7 = configuration2.mnc;
                                    if (i6 != i7) {
                                        configuration3.mnc = i7;
                                    }
                                    v.a(configuration, configuration2, configuration3);
                                    i8 = configuration.touchscreen;
                                    i9 = configuration2.touchscreen;
                                    if (i8 != i9) {
                                        configuration3.touchscreen = i9;
                                    }
                                    i10 = configuration.keyboard;
                                    i11 = configuration2.keyboard;
                                    if (i10 != i11) {
                                        configuration3.keyboard = i11;
                                    }
                                    i12 = configuration.keyboardHidden;
                                    i13 = configuration2.keyboardHidden;
                                    if (i12 != i13) {
                                        configuration3.keyboardHidden = i13;
                                    }
                                    i14 = configuration.navigation;
                                    i15 = configuration2.navigation;
                                    if (i14 != i15) {
                                        configuration3.navigation = i15;
                                    }
                                    i16 = configuration.navigationHidden;
                                    i17 = configuration2.navigationHidden;
                                    if (i16 != i17) {
                                        configuration3.navigationHidden = i17;
                                    }
                                    i18 = configuration.orientation;
                                    i19 = configuration2.orientation;
                                    if (i18 != i19) {
                                        configuration3.orientation = i19;
                                    }
                                    i20 = configuration.screenLayout & 15;
                                    i21 = configuration2.screenLayout & 15;
                                    if (i20 != i21) {
                                        configuration3.screenLayout |= i21;
                                    }
                                    i22 = configuration.screenLayout & 192;
                                    i23 = configuration2.screenLayout & 192;
                                    if (i22 != i23) {
                                        configuration3.screenLayout |= i23;
                                    }
                                    i24 = configuration.screenLayout & 48;
                                    i25 = configuration2.screenLayout & 48;
                                    if (i24 != i25) {
                                        configuration3.screenLayout |= i25;
                                    }
                                    i26 = configuration.screenLayout & 768;
                                    i27 = configuration2.screenLayout & 768;
                                    if (i26 != i27) {
                                        configuration3.screenLayout |= i27;
                                    }
                                    i28 = configuration.colorMode & 3;
                                    i29 = configuration2.colorMode & 3;
                                    if (i28 != i29) {
                                        configuration3.colorMode |= i29;
                                    }
                                    i30 = configuration.colorMode & 12;
                                    i31 = configuration2.colorMode & 12;
                                    if (i30 != i31) {
                                        configuration3.colorMode |= i31;
                                    }
                                    i32 = configuration.uiMode & 15;
                                    i33 = configuration2.uiMode & 15;
                                    if (i32 != i33) {
                                        configuration3.uiMode |= i33;
                                    }
                                    i34 = configuration.uiMode & 48;
                                    i35 = configuration2.uiMode & 48;
                                    if (i34 != i35) {
                                        configuration3.uiMode |= i35;
                                    }
                                    i36 = configuration.screenWidthDp;
                                    i37 = configuration2.screenWidthDp;
                                    if (i36 != i37) {
                                        configuration3.screenWidthDp = i37;
                                    }
                                    i38 = configuration.screenHeightDp;
                                    i39 = configuration2.screenHeightDp;
                                    if (i38 != i39) {
                                        configuration3.screenHeightDp = i39;
                                    }
                                    i40 = configuration.smallestScreenWidthDp;
                                    i41 = configuration2.smallestScreenWidthDp;
                                    if (i40 != i41) {
                                        configuration3.smallestScreenWidthDp = i41;
                                    }
                                    i42 = configuration.densityDpi;
                                    i43 = configuration2.densityDpi;
                                    if (i42 != i43) {
                                        configuration3.densityDpi = i43;
                                    }
                                }
                            }
                            Configuration configurationU = d0.u(context, iE, gVarQ, configuration3, true);
                            cVar = new i.c(context, co.median.android.eeqadjy.R.style.Theme_AppCompat_Empty);
                            cVar.a(configurationU);
                            try {
                                if (context.getTheme() != null) {
                                    theme = cVar.getTheme();
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        e0.k.a(theme);
                                    } else {
                                        synchronized (e0.b.f2010e) {
                                            if (e0.b.f2011g) {
                                                method = e0.b.f;
                                                if (method != null) {
                                                    method.invoke(theme, null);
                                                }
                                            } else {
                                                try {
                                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                                    e0.b.f = declaredMethod;
                                                    declaredMethod.setAccessible(true);
                                                } catch (NoSuchMethodException e5) {
                                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e5);
                                                }
                                                e0.b.f2011g = true;
                                                method = e0.b.f;
                                                if (method != null) {
                                                    try {
                                                        method.invoke(theme, null);
                                                    } catch (IllegalAccessException | InvocationTargetException e6) {
                                                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e6);
                                                        e0.b.f = null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = cVar;
                        }
                    }
                } else if (d0.f1874o0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f4 = configuration2.fontScale;
                            if (f != f4) {
                                configuration3.fontScale = f4;
                            }
                            i4 = configuration.mcc;
                            i5 = configuration2.mcc;
                            if (i4 != i5) {
                                configuration3.mcc = i5;
                            }
                            i6 = configuration.mnc;
                            i7 = configuration2.mnc;
                            if (i6 != i7) {
                                configuration3.mnc = i7;
                            }
                            v.a(configuration, configuration2, configuration3);
                            i8 = configuration.touchscreen;
                            i9 = configuration2.touchscreen;
                            if (i8 != i9) {
                                configuration3.touchscreen = i9;
                            }
                            i10 = configuration.keyboard;
                            i11 = configuration2.keyboard;
                            if (i10 != i11) {
                                configuration3.keyboard = i11;
                            }
                            i12 = configuration.keyboardHidden;
                            i13 = configuration2.keyboardHidden;
                            if (i12 != i13) {
                                configuration3.keyboardHidden = i13;
                            }
                            i14 = configuration.navigation;
                            i15 = configuration2.navigation;
                            if (i14 != i15) {
                                configuration3.navigation = i15;
                            }
                            i16 = configuration.navigationHidden;
                            i17 = configuration2.navigationHidden;
                            if (i16 != i17) {
                                configuration3.navigationHidden = i17;
                            }
                            i18 = configuration.orientation;
                            i19 = configuration2.orientation;
                            if (i18 != i19) {
                                configuration3.orientation = i19;
                            }
                            i20 = configuration.screenLayout & 15;
                            i21 = configuration2.screenLayout & 15;
                            if (i20 != i21) {
                                configuration3.screenLayout |= i21;
                            }
                            i22 = configuration.screenLayout & 192;
                            i23 = configuration2.screenLayout & 192;
                            if (i22 != i23) {
                                configuration3.screenLayout |= i23;
                            }
                            i24 = configuration.screenLayout & 48;
                            i25 = configuration2.screenLayout & 48;
                            if (i24 != i25) {
                                configuration3.screenLayout |= i25;
                            }
                            i26 = configuration.screenLayout & 768;
                            i27 = configuration2.screenLayout & 768;
                            if (i26 != i27) {
                                configuration3.screenLayout |= i27;
                            }
                            i28 = configuration.colorMode & 3;
                            i29 = configuration2.colorMode & 3;
                            if (i28 != i29) {
                                configuration3.colorMode |= i29;
                            }
                            i30 = configuration.colorMode & 12;
                            i31 = configuration2.colorMode & 12;
                            if (i30 != i31) {
                                configuration3.colorMode |= i31;
                            }
                            i32 = configuration.uiMode & 15;
                            i33 = configuration2.uiMode & 15;
                            if (i32 != i33) {
                                configuration3.uiMode |= i33;
                            }
                            i34 = configuration.uiMode & 48;
                            i35 = configuration2.uiMode & 48;
                            if (i34 != i35) {
                                configuration3.uiMode |= i35;
                            }
                            i36 = configuration.screenWidthDp;
                            i37 = configuration2.screenWidthDp;
                            if (i36 != i37) {
                                configuration3.screenWidthDp = i37;
                            }
                            i38 = configuration.screenHeightDp;
                            i39 = configuration2.screenHeightDp;
                            if (i38 != i39) {
                                configuration3.screenHeightDp = i39;
                            }
                            i40 = configuration.smallestScreenWidthDp;
                            i41 = configuration2.smallestScreenWidthDp;
                            if (i40 != i41) {
                                configuration3.smallestScreenWidthDp = i41;
                            }
                            i42 = configuration.densityDpi;
                            i43 = configuration2.densityDpi;
                            if (i42 != i43) {
                                configuration3.densityDpi = i43;
                            }
                        }
                    } else {
                        configuration3 = null;
                    }
                    Configuration configurationU2 = d0.u(context, iE, gVarQ, configuration3, true);
                    cVar = new i.c(context, co.median.android.eeqadjy.R.style.Theme_AppCompat_Empty);
                    cVar.a(configurationU2);
                    if (context.getTheme() != null) {
                        theme = cVar.getTheme();
                        if (Build.VERSION.SDK_INT >= 29) {
                            e0.k.a(theme);
                        } else {
                            synchronized (e0.b.f2010e) {
                                if (e0.b.f2011g) {
                                    Method declaredMethod2 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    e0.b.f = declaredMethod2;
                                    declaredMethod2.setAccessible(true);
                                    e0.b.f2011g = true;
                                    method = e0.b.f;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                } else {
                                    method = e0.b.f;
                                    if (method != null) {
                                        method.invoke(theme, null);
                                    }
                                }
                            }
                        }
                    }
                    context = cVar;
                }
            }
        } else if (context instanceof i.c) {
            ((i.c) context).a(d0.u(context, iE, gVarQ, null, false));
        } else if (d0.f1874o0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f4 = configuration2.fontScale;
                    if (f != f4) {
                        configuration3.fontScale = f4;
                    }
                    i4 = configuration.mcc;
                    i5 = configuration2.mcc;
                    if (i4 != i5) {
                        configuration3.mcc = i5;
                    }
                    i6 = configuration.mnc;
                    i7 = configuration2.mnc;
                    if (i6 != i7) {
                        configuration3.mnc = i7;
                    }
                    v.a(configuration, configuration2, configuration3);
                    i8 = configuration.touchscreen;
                    i9 = configuration2.touchscreen;
                    if (i8 != i9) {
                        configuration3.touchscreen = i9;
                    }
                    i10 = configuration.keyboard;
                    i11 = configuration2.keyboard;
                    if (i10 != i11) {
                        configuration3.keyboard = i11;
                    }
                    i12 = configuration.keyboardHidden;
                    i13 = configuration2.keyboardHidden;
                    if (i12 != i13) {
                        configuration3.keyboardHidden = i13;
                    }
                    i14 = configuration.navigation;
                    i15 = configuration2.navigation;
                    if (i14 != i15) {
                        configuration3.navigation = i15;
                    }
                    i16 = configuration.navigationHidden;
                    i17 = configuration2.navigationHidden;
                    if (i16 != i17) {
                        configuration3.navigationHidden = i17;
                    }
                    i18 = configuration.orientation;
                    i19 = configuration2.orientation;
                    if (i18 != i19) {
                        configuration3.orientation = i19;
                    }
                    i20 = configuration.screenLayout & 15;
                    i21 = configuration2.screenLayout & 15;
                    if (i20 != i21) {
                        configuration3.screenLayout |= i21;
                    }
                    i22 = configuration.screenLayout & 192;
                    i23 = configuration2.screenLayout & 192;
                    if (i22 != i23) {
                        configuration3.screenLayout |= i23;
                    }
                    i24 = configuration.screenLayout & 48;
                    i25 = configuration2.screenLayout & 48;
                    if (i24 != i25) {
                        configuration3.screenLayout |= i25;
                    }
                    i26 = configuration.screenLayout & 768;
                    i27 = configuration2.screenLayout & 768;
                    if (i26 != i27) {
                        configuration3.screenLayout |= i27;
                    }
                    i28 = configuration.colorMode & 3;
                    i29 = configuration2.colorMode & 3;
                    if (i28 != i29) {
                        configuration3.colorMode |= i29;
                    }
                    i30 = configuration.colorMode & 12;
                    i31 = configuration2.colorMode & 12;
                    if (i30 != i31) {
                        configuration3.colorMode |= i31;
                    }
                    i32 = configuration.uiMode & 15;
                    i33 = configuration2.uiMode & 15;
                    if (i32 != i33) {
                        configuration3.uiMode |= i33;
                    }
                    i34 = configuration.uiMode & 48;
                    i35 = configuration2.uiMode & 48;
                    if (i34 != i35) {
                        configuration3.uiMode |= i35;
                    }
                    i36 = configuration.screenWidthDp;
                    i37 = configuration2.screenWidthDp;
                    if (i36 != i37) {
                        configuration3.screenWidthDp = i37;
                    }
                    i38 = configuration.screenHeightDp;
                    i39 = configuration2.screenHeightDp;
                    if (i38 != i39) {
                        configuration3.screenHeightDp = i39;
                    }
                    i40 = configuration.smallestScreenWidthDp;
                    i41 = configuration2.smallestScreenWidthDp;
                    if (i40 != i41) {
                        configuration3.smallestScreenWidthDp = i41;
                    }
                    i42 = configuration.densityDpi;
                    i43 = configuration2.densityDpi;
                    if (i42 != i43) {
                        configuration3.densityDpi = i43;
                    }
                }
            } else {
                configuration3 = null;
            }
            Configuration configurationU3 = d0.u(context, iE, gVarQ, configuration3, true);
            cVar = new i.c(context, co.median.android.eeqadjy.R.style.Theme_AppCompat_Empty);
            cVar.a(configurationU3);
            if (context.getTheme() != null) {
                theme = cVar.getTheme();
                if (Build.VERSION.SDK_INT >= 29) {
                    e0.k.a(theme);
                } else {
                    synchronized (e0.b.f2010e) {
                        if (e0.b.f2011g) {
                            Method declaredMethod3 = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            e0.b.f = declaredMethod3;
                            declaredMethod3.setAccessible(true);
                            e0.b.f2011g = true;
                            method = e0.b.f;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        } else {
                            method = e0.b.f;
                            if (method != null) {
                                method.invoke(theme, null);
                            }
                        }
                    }
                }
            }
            context = cVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        u1.h0 h0VarV = v();
        if (getWindow().hasFeature(0)) {
            if (h0VarV == null || !h0VarV.k()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.q, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        u1.h0 h0VarV = v();
        if (keyCode == 82 && h0VarV != null && h0VarV.S(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i4) {
        d0 d0Var = (d0) u();
        d0Var.x();
        return d0Var.f1886q.findViewById(i4);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        d0 d0Var = (d0) u();
        if (d0Var.f1890u == null) {
            d0Var.C();
            u1.h0 h0Var = d0Var.f1889t;
            d0Var.f1890u = new i.h(h0Var != null ? h0Var.C() : d0Var.f1885p);
        }
        return d0Var.f1890u;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i4 = m3.f2587a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        u().b();
    }

    @Override // androidx.activity.q, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d0 d0Var = (d0) u();
        if (d0Var.K && d0Var.E) {
            d0Var.C();
            u1.h0 h0Var = d0Var.f1889t;
            if (h0Var != null) {
                h0Var.M();
            }
        }
        k.u uVarA = k.u.a();
        Context context = d0Var.f1885p;
        synchronized (uVarA) {
            h2 h2Var = uVarA.f2645a;
            synchronized (h2Var) {
                p.h hVar = (p.h) h2Var.f2538b.get(context);
                if (hVar != null) {
                    hVar.a();
                }
            }
        }
        d0Var.W = new Configuration(d0Var.f1885p.getResources().getConfiguration());
        d0Var.o(false, false);
    }

    @Override // androidx.fragment.app.e0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        u().e();
    }

    @Override // androidx.fragment.app.e0, androidx.activity.q, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        Intent intentA;
        if (!super.onMenuItemSelected(i4, menuItem)) {
            u1.h0 h0VarV = v();
            if (menuItem.getItemId() != 16908332 || h0VarV == null || (h0VarV.v() & 4) == 0 || (intentA = b0.e.a(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentA)) {
                navigateUpTo(intentA);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentA2 = b0.e.a(this);
            if (intentA2 == null) {
                intentA2 = b0.e.a(this);
            }
            if (intentA2 != null) {
                ComponentName component = intentA2.getComponent();
                if (component == null) {
                    component = intentA2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentB = b0.e.b(this, component);
                    while (intentB != null) {
                        arrayList.add(size, intentB);
                        intentB = b0.e.b(this, intentB.getComponent());
                    }
                    arrayList.add(intentA2);
                } catch (PackageManager.NameNotFoundException e5) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e5);
                }
            }
            if (arrayList.isEmpty()) {
                androidx.fragment.app.q.j("No intents added to TaskStackBuilder; cannot startActivities");
                return false;
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!c0.c.startActivities(this, intentArr, null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                startActivity(intent);
            }
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((d0) u()).x();
    }

    @Override // androidx.fragment.app.e0, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        d0 d0Var = (d0) u();
        d0Var.C();
        u1.h0 h0Var = d0Var.f1889t;
        if (h0Var != null) {
            h0Var.k0(true);
        }
    }

    @Override // androidx.fragment.app.e0, android.app.Activity
    public void onStart() {
        super.onStart();
        ((d0) u()).o(true, false);
    }

    @Override // androidx.fragment.app.e0, android.app.Activity
    public void onStop() {
        super.onStop();
        d0 d0Var = (d0) u();
        d0Var.C();
        u1.h0 h0Var = d0Var.f1889t;
        if (h0Var != null) {
            h0Var.k0(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i4) {
        super.onTitleChanged(charSequence, i4);
        u().n(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        u1.h0 h0VarV = v();
        if (getWindow().hasFeature(0)) {
            if (h0VarV == null || !h0VarV.T()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i4) {
        p();
        u().h(i4);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i4) {
        super.setTheme(i4);
        ((d0) u()).Y = i4;
    }

    public final q u() {
        if (this.D == null) {
            o oVar = q.f;
            this.D = new d0(this, null, this, this);
        }
        return this.D;
    }

    public final u1.h0 v() {
        d0 d0Var = (d0) u();
        d0Var.C();
        return d0Var.f1889t;
    }

    @Override // androidx.activity.q, android.app.Activity
    public void setContentView(View view) {
        p();
        u().k(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        u().l(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
