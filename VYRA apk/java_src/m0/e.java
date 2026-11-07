package m0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import androidx.activity.x;
import co.median.android.MainActivity;
import com.google.android.gms.common.api.Api;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MainActivity f3059g;

    public e(f fVar, MainActivity mainActivity) {
        this.f = fVar;
        this.f3059g = mainActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (com.google.android.gms.common.internal.a.y(view2)) {
            SplashScreenView splashScreenViewR = com.google.android.gms.common.internal.a.r(view2);
            splashScreenViewR.getClass();
            WindowInsets windowInsetsBuild = x.l().build();
            windowInsetsBuild.getClass();
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            this.f.f3061j = (windowInsetsBuild == splashScreenViewR.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
            View decorView = this.f3059g.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
