package m0;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.window.SplashScreenView;
import androidx.emoji2.text.p;
import co.median.android.MainActivity;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SplashScreenView f3064j;

    @Override // androidx.emoji2.text.p
    public final ViewGroup n() {
        SplashScreenView splashScreenView = this.f3064j;
        if (splashScreenView != null) {
            return splashScreenView;
        }
        r3.g.c("platformView");
        throw null;
    }

    @Override // androidx.emoji2.text.p
    public final void w() {
        MainActivity mainActivity = (MainActivity) this.f568g;
        SplashScreenView splashScreenView = this.f3064j;
        if (splashScreenView == null) {
            r3.g.c("platformView");
            throw null;
        }
        splashScreenView.remove();
        if (Build.VERSION.SDK_INT < 33) {
            Resources.Theme theme = mainActivity.getTheme();
            theme.getClass();
            View decorView = mainActivity.getWindow().getDecorView();
            decorView.getClass();
            h0.d(theme, decorView, new TypedValue());
        }
    }

    @Override // androidx.emoji2.text.p
    public final void j() {
    }
}
