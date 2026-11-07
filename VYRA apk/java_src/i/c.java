package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.fragment.app.q;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ContextWrapper {
    public static Configuration f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f2181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f2182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f2183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f2184e;

    public c(Context context, int i4) {
        super(context);
        this.f2180a = i4;
    }

    public final void a(Configuration configuration) {
        if (this.f2184e != null) {
            q.j("getResources() or getAssets() has already been called");
        } else if (this.f2183d == null) {
            this.f2183d = new Configuration(configuration);
        } else {
            q.j("Override configuration has already been set");
        }
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f2181b == null) {
            this.f2181b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2181b.setTo(theme);
            }
        }
        this.f2181b.applyStyle(this.f2180a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f2184e == null) {
            Configuration configuration = this.f2183d;
            if (configuration == null) {
                this.f2184e = super.getResources();
            } else {
                if (f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f = configuration2;
                }
                if (configuration.equals(f)) {
                    this.f2184e = super.getResources();
                } else {
                    this.f2184e = createConfigurationContext(this.f2183d).getResources();
                }
            }
        }
        return this.f2184e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2182c == null) {
            this.f2182c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2182c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f2181b;
        if (theme != null) {
            return theme;
        }
        if (this.f2180a == 0) {
            this.f2180a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f2181b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i4) {
        if (this.f2180a != i4) {
            this.f2180a = i4;
            b();
        }
    }
}
