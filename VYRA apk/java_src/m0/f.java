package m0;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.SplashScreen;
import android.window.SplashScreenView;
import androidx.emoji2.text.p;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import u1.h0;
import u1.v0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i1.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f3060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f3062k;

    public f(MainActivity mainActivity) {
        super(mainActivity);
        this.f3061j = true;
        this.f3062k = new e(this, mainActivity);
    }

    @Override // i1.a
    public final void a() {
        int i4;
        MainActivity mainActivity = (MainActivity) this.f2234b;
        Resources.Theme theme = mainActivity.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i4 = typedValue.resourceId) != 0) {
            mainActivity.setTheme(i4);
        }
        if (Build.VERSION.SDK_INT < 33) {
            View decorView = mainActivity.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(this.f3062k);
        }
    }

    @Override // i1.a
    public final void d(v0 v0Var) {
        this.f = v0Var;
        View viewFindViewById = ((MainActivity) this.f2234b).findViewById(android.R.id.content);
        ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
        if (this.f3060i != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f3060i);
        }
        b bVar = new b(this, viewFindViewById, 1);
        this.f3060i = bVar;
        viewTreeObserver.addOnPreDrawListener(bVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [m0.d] */
    @Override // i1.a
    public final void e(final p1.h hVar) {
        ((MainActivity) this.f2234b).getSplashScreen().setOnExitAnimationListener(new SplashScreen.OnExitAnimationListener() { // from class: m0.d
            @Override // android.window.SplashScreen.OnExitAnimationListener
            public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                f fVar = this.f3057a;
                MainActivity mainActivity = (MainActivity) fVar.f2234b;
                p1.h hVar2 = hVar;
                splashScreenView.getClass();
                if (Build.VERSION.SDK_INT < 33) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = mainActivity.getTheme();
                    Window window = mainActivity.getWindow();
                    if (theme.resolveAttribute(android.R.attr.statusBarColor, typedValue, true)) {
                        window.setStatusBarColor(typedValue.data);
                    }
                    if (theme.resolveAttribute(android.R.attr.navigationBarColor, typedValue, true)) {
                        window.setNavigationBarColor(typedValue.data);
                    }
                    if (theme.resolveAttribute(android.R.attr.windowDrawsSystemBarBackgrounds, typedValue, true)) {
                        if (typedValue.data != 0) {
                            window.addFlags(Integer.MIN_VALUE);
                        } else {
                            window.clearFlags(Integer.MIN_VALUE);
                        }
                    }
                    View decorView = window.getDecorView();
                    decorView.getClass();
                    ViewGroup viewGroup = (ViewGroup) decorView;
                    h0.d(theme, viewGroup, typedValue);
                    viewGroup.setOnHierarchyChangeListener(null);
                    window.setDecorFitsSystemWindows(fVar.f3061j);
                }
                a3.h0 h0Var = new a3.h0(mainActivity);
                p pVar = (p) h0Var.f84g;
                pVar.getClass();
                ((i) pVar).f3064j = splashScreenView;
                hVar2.b(h0Var);
            }
        });
    }
}
