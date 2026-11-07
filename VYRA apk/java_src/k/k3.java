package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k3 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Toolbar f2562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f2564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f2565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f2566e;
    public Drawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f2568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f2569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f2570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f2571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.appcompat.widget.b f2573m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Drawable f2574o;

    public k3(Toolbar toolbar, boolean z4) {
        Drawable drawable;
        this.n = 0;
        this.f2562a = toolbar;
        this.f2568h = toolbar.getTitle();
        this.f2569i = toolbar.getSubtitle();
        this.f2567g = this.f2568h != null;
        this.f = toolbar.getNavigationIcon();
        androidx.emoji2.text.t tVarS = androidx.emoji2.text.t.s(R.attr.actionBarStyle, 0, toolbar.getContext(), null, d.a.f1631a);
        TypedArray typedArray = (TypedArray) tVarS.f579c;
        int i4 = 15;
        this.f2574o = tVarS.i(15);
        if (z4) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f2567g = true;
                this.f2568h = text;
                if ((this.f2563b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.f2567g) {
                        p0.p0.n(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f2569i = text2;
                if ((this.f2563b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableI = tVarS.i(20);
            if (drawableI != null) {
                this.f2566e = drawableI;
                d();
            }
            Drawable drawableI2 = tVarS.i(17);
            if (drawableI2 != null) {
                this.f2565d = drawableI2;
                d();
            }
            if (this.f == null && (drawable = this.f2574o) != null) {
                this.f = drawable;
                if ((this.f2563b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f2564c;
                if (view != null && (this.f2563b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f2564c = viewInflate;
                if (viewInflate != null && (this.f2563b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                a(this.f2563b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.e();
                toolbar.f398y.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f390q = resourceId2;
                y0 y0Var = toolbar.f381g;
                if (y0Var != null) {
                    y0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f391r = resourceId3;
                y0 y0Var2 = toolbar.f382h;
                if (y0Var2 != null) {
                    y0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f2574o = toolbar.getNavigationIcon();
            } else {
                i4 = 11;
            }
            this.f2563b = i4;
        }
        tVarS.v();
        if (R.string.abc_action_bar_up_description != this.n) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                b(this.n);
            }
        }
        this.f2570j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new j3(this));
    }

    public final void a(int i4) {
        View view;
        int i5 = this.f2563b ^ i4;
        this.f2563b = i4;
        if (i5 != 0) {
            int i6 = i5 & 4;
            Toolbar toolbar = this.f2562a;
            if (i6 != 0) {
                if ((i4 & 4) != 0) {
                    c();
                }
                if ((this.f2563b & 4) != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.f2574o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i5 & 3) != 0) {
                d();
            }
            if ((i5 & 8) != 0) {
                if ((i4 & 8) != 0) {
                    toolbar.setTitle(this.f2568h);
                    toolbar.setSubtitle(this.f2569i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i5 & 16) == 0 || (view = this.f2564c) == null) {
                return;
            }
            if ((i4 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b(int i4) {
        this.f2570j = i4 == 0 ? null : this.f2562a.getContext().getString(i4);
        c();
    }

    public final void c() {
        if ((this.f2563b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f2570j);
            Toolbar toolbar = this.f2562a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.n);
            } else {
                toolbar.setNavigationContentDescription(this.f2570j);
            }
        }
    }

    public final void d() {
        Drawable drawable;
        int i4 = this.f2563b;
        if ((i4 & 2) == 0) {
            drawable = null;
        } else if ((i4 & 1) == 0 || (drawable = this.f2566e) == null) {
            drawable = this.f2565d;
        }
        this.f2562a.setLogo(drawable);
    }
}
