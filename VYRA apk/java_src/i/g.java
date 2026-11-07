package i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.q;
import j.o;
import j.p;
import j.t;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ h E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Menu f2196a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2204j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f2205k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f2206l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2207m;
    public char n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2208o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public char f2209p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2210q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2211r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2212s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2213t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2214u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2215v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2216w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f2217x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f2218y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p f2219z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2197b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2198c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2199d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2200e = 0;
    public boolean f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2201g = true;

    public g(h hVar, Menu menu) {
        this.E = hVar;
        this.f2196a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f2223c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e5) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e5);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        h hVar = this.E;
        Context context = hVar.f2223c;
        boolean z4 = false;
        menuItem.setChecked(this.f2212s).setVisible(this.f2213t).setEnabled(this.f2214u).setCheckable(this.f2211r >= 1).setTitleCondensed(this.f2206l).setIcon(this.f2207m);
        int i4 = this.f2215v;
        if (i4 >= 0) {
            menuItem.setShowAsAction(i4);
        }
        if (this.f2218y != null) {
            if (context.isRestricted()) {
                q.j("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            if (hVar.f2224d == null) {
                hVar.f2224d = h.a(context);
            }
            Object obj = hVar.f2224d;
            String str = this.f2218y;
            f fVar = new f();
            fVar.f2194a = obj;
            Class<?> cls = obj.getClass();
            try {
                fVar.f2195b = cls.getMethod(str, f.f2193c);
                menuItem.setOnMenuItemClickListener(fVar);
            } catch (Exception e5) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e5);
                throw inflateException;
            }
        }
        if (this.f2211r >= 2) {
            if (menuItem instanceof o) {
                ((o) menuItem).f(true);
            } else if (menuItem instanceof t) {
                t tVar = (t) menuItem;
                h0.a aVar = tVar.f2439c;
                try {
                    if (tVar.f2440d == null) {
                        tVar.f2440d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    tVar.f2440d.invoke(aVar, Boolean.TRUE);
                } catch (Exception e6) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e6);
                }
            }
        }
        String str2 = this.f2217x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, h.f2220e, hVar.f2221a));
            z4 = true;
        }
        int i5 = this.f2216w;
        if (i5 > 0) {
            if (z4) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i5);
            }
        }
        p pVar = this.f2219z;
        if (pVar != null) {
            if (menuItem instanceof h0.a) {
                ((h0.a) menuItem).b(pVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z5 = menuItem instanceof h0.a;
        if (z5) {
            ((h0.a) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z5) {
            ((h0.a) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c4 = this.n;
        int i6 = this.f2208o;
        if (z5) {
            ((h0.a) menuItem).setAlphabeticShortcut(c4, i6);
        } else {
            menuItem.setAlphabeticShortcut(c4, i6);
        }
        char c5 = this.f2209p;
        int i7 = this.f2210q;
        if (z5) {
            ((h0.a) menuItem).setNumericShortcut(c5, i7);
        } else {
            menuItem.setNumericShortcut(c5, i7);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z5) {
                ((h0.a) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z5) {
                ((h0.a) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
