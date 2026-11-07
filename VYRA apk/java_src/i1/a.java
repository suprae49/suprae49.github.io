package i1;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.m;
import androidx.emoji2.text.p;
import androidx.fragment.app.q;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import u1.h0;
import u1.v0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f2236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2237e;
    public Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f2238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f2239h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public a(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        ?? r4;
        this.f2233a = false;
        this.f2234b = executor;
        this.f2235c = dVar;
        this.f2238g = str;
        this.f = file;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 31) {
            switch (i4) {
                case 26:
                    r4 = e.f2253g;
                    break;
                case 27:
                    r4 = e.f;
                    break;
                case 28:
                case 29:
                case 30:
                    r4 = e.f2252e;
                    break;
                default:
                    r4 = 0;
                    break;
            }
        } else {
            r4 = e.f2251d;
        }
        this.f2236d = r4;
    }

    public void a() {
        int i4;
        TypedValue typedValue = new TypedValue();
        MainActivity mainActivity = (MainActivity) this.f2234b;
        Resources.Theme theme = mainActivity.getTheme();
        if (theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true)) {
            this.f2235c = Integer.valueOf(typedValue.resourceId);
            this.f2236d = Integer.valueOf(typedValue.data);
        }
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            this.f2237e = h0.w(mainActivity, typedValue.resourceId);
        }
        if (theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true)) {
            this.f2233a = typedValue.resourceId == R.dimen.splashscreen_icon_size_with_background;
        }
        if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i4 = typedValue.resourceId) == 0) {
            return;
        }
        mainActivity.setTheme(i4);
    }

    public FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e5) {
            String message = e5.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((d) this.f2235c).n();
            return null;
        }
    }

    public void c(int i4, Serializable serializable) {
        ((Executor) this.f2234b).execute(new m(this, i4, serializable, 2));
    }

    public void d(v0 v0Var) {
        this.f = v0Var;
        View viewFindViewById = ((MainActivity) this.f2234b).findViewById(android.R.id.content);
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new m0.b(this, viewFindViewById, 0));
    }

    public void e(p1.h hVar) {
        float dimension;
        this.f2238g = hVar;
        MainActivity mainActivity = (MainActivity) this.f2234b;
        a3.h0 h0Var = new a3.h0(mainActivity);
        Integer num = (Integer) this.f2235c;
        Integer num2 = (Integer) this.f2236d;
        ViewGroup viewGroupN = ((p) h0Var.f84g).n();
        if (num != null && num.intValue() != 0) {
            viewGroupN.setBackgroundResource(num.intValue());
        } else if (num2 != null) {
            viewGroupN.setBackgroundColor(num2.intValue());
        } else {
            viewGroupN.setBackground(mainActivity.getWindow().getDecorView().getBackground());
        }
        Drawable drawable = (Drawable) this.f2237e;
        if (drawable != null) {
            ImageView imageView = (ImageView) viewGroupN.findViewById(R.id.splashscreen_icon_view);
            if (this.f2233a) {
                Drawable drawableW = h0.w(imageView.getContext(), R.drawable.icon_background);
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_with_background) * 0.6666667f;
                if (drawableW != null) {
                    imageView.setBackground(new m0.a(drawableW, dimension));
                }
            } else {
                dimension = imageView.getResources().getDimension(R.dimen.splashscreen_icon_size_no_background) * 0.6666667f;
            }
            imageView.setImageDrawable(new m0.a(drawable, dimension));
        }
        viewGroupN.addOnLayoutChangeListener(new m0.c(this, h0Var));
    }

    public a(MainActivity mainActivity) {
        this.f2234b = mainActivity;
        this.f = new q(15);
    }
}
