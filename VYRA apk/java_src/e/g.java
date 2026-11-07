package e;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import co.median.android.eeqadjy.R;
import java.util.WeakHashMap;
import k.t1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.activity.s implements DialogInterface, k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d0 f1924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f1925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f1926k;

    /* JADX WARN: Type inference failed for: r2v2, types: [e.e0] */
    public g(ContextThemeWrapper contextThemeWrapper, int i4) {
        int i5;
        int iF = f(contextThemeWrapper, i4);
        if (iF == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i5 = typedValue.resourceId;
        } else {
            i5 = iF;
        }
        super(contextThemeWrapper, i5);
        this.f1925j = new p0.k() { // from class: e.e0
            @Override // p0.k
            public final boolean e(KeyEvent keyEvent) {
                return this.f.h(keyEvent);
            }
        };
        q qVarD = d();
        if (iF == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iF = typedValue2.resourceId;
        }
        ((d0) qVarD).Y = iF;
        qVarD.d();
        this.f1926k = new e(getContext(), this, getWindow());
    }

    public static int f(Context context, int i4) {
        if (((i4 >>> 24) & 255) >= 1) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.s, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        d0 d0Var = (d0) d();
        d0Var.x();
        ((ViewGroup) d0Var.F.findViewById(android.R.id.content)).addView(view, layoutParams);
        d0Var.f1887r.a(d0Var.f1886q.getCallback());
    }

    public final q d() {
        if (this.f1924i == null) {
            o oVar = q.f;
            this.f1924i = new d0(getContext(), getWindow(), this, this);
        }
        return this.f1924i;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return e4.a.t(this.f1925j, getWindow().getDecorView(), this, keyEvent);
    }

    public final void e(Bundle bundle) {
        d().a();
        super.onCreate(bundle);
        d().d();
    }

    @Override // android.app.Dialog
    public final View findViewById(int i4) {
        d0 d0Var = (d0) d();
        d0Var.x();
        return d0Var.f1886q.findViewById(i4);
    }

    public final void g(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().n(charSequence);
    }

    public final boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().b();
    }

    @Override // androidx.activity.s, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i4;
        ListAdapter listAdapter;
        View viewFindViewById;
        e(bundle);
        e eVar = this.f1926k;
        eVar.f1897b.setContentView(eVar.f1919z);
        Context context = eVar.f1896a;
        Window window = eVar.f1898c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        EditText editText = eVar.f1901g;
        if (editText == null) {
            editText = null;
        }
        boolean z4 = editText != null;
        if (!z4 || !e.a(editText)) {
            window.setFlags(131072, 131072);
        }
        if (z4) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(editText, new ViewGroup.LayoutParams(-1, -1));
            if (eVar.f1902h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (eVar.f != null) {
                ((LinearLayout.LayoutParams) ((t1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = e.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = e.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = e.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        eVar.f1911r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        eVar.f1911r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        eVar.f1915v = textView;
        if (textView != null) {
            String str = eVar.f1900e;
            if (str != null) {
                textView.setText(str);
            } else {
                textView.setVisibility(8);
                eVar.f1911r.removeView(eVar.f1915v);
                if (eVar.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) eVar.f1911r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(eVar.f1911r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(eVar.f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupB2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        eVar.f1903i = button;
        com.google.android.material.datepicker.k kVar = eVar.F;
        button.setOnClickListener(kVar);
        boolean zIsEmpty = TextUtils.isEmpty(eVar.f1904j);
        Button button2 = eVar.f1903i;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i4 = 0;
        } else {
            button2.setText(eVar.f1904j);
            eVar.f1903i.setVisibility(0);
            i4 = 1;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        eVar.f1906l = button3;
        button3.setOnClickListener(kVar);
        boolean zIsEmpty2 = TextUtils.isEmpty(eVar.f1907m);
        Button button4 = eVar.f1906l;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(eVar.f1907m);
            eVar.f1906l.setVisibility(0);
            i4 |= 2;
        }
        Button button5 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        eVar.f1908o = button5;
        button5.setOnClickListener(kVar);
        boolean zIsEmpty3 = TextUtils.isEmpty(eVar.f1909p);
        Button button6 = eVar.f1908o;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(eVar.f1909p);
            eVar.f1908o.setVisibility(0);
            i4 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i4 == 1) {
                Button button7 = eVar.f1903i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i4 == 2) {
                Button button8 = eVar.f1906l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i4 == 4) {
                Button button9 = eVar.f1908o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i4 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (eVar.f1916w != null) {
            viewGroupB.addView(eVar.f1916w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            eVar.f1913t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(eVar.f1899d) || !eVar.D) {
                window.findViewById(R.id.title_template).setVisibility(8);
                eVar.f1913t.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                eVar.f1914u = textView2;
                textView2.setText(eVar.f1899d);
                Drawable drawable = eVar.f1912s;
                if (drawable != null) {
                    eVar.f1913t.setImageDrawable(drawable);
                } else {
                    eVar.f1914u.setPadding(eVar.f1913t.getPaddingLeft(), eVar.f1913t.getPaddingTop(), eVar.f1913t.getPaddingRight(), eVar.f1913t.getPaddingBottom());
                    eVar.f1913t.setVisibility(8);
                }
            }
        }
        boolean z5 = viewGroup.getVisibility() != 8;
        int i5 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z6 = viewGroupB3.getVisibility() != 8;
        if (!z6 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = eVar.f1911r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (eVar.f1900e == null && eVar.f == null) ? null : viewGroupB.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = eVar.f;
        if (alertController$RecycleListView != null && (!z6 || i5 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i5 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f, alertController$RecycleListView.getPaddingRight(), z6 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f255g);
        }
        if (!z5) {
            View view = eVar.f;
            if (view == null) {
                view = eVar.f1911r;
            }
            if (view != null) {
                int i6 = z6 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = p0.p0.f3233a;
                view.setScrollIndicators(i5 | i6, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = eVar.f;
        if (alertController$RecycleListView2 == null || (listAdapter = eVar.f1917x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i7 = eVar.f1918y;
        if (i7 > -1) {
            alertController$RecycleListView2.setItemChecked(i7, true);
            alertController$RecycleListView2.setSelection(i7);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1926k.f1911r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i4, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1926k.f1911r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i4, keyEvent);
        }
        return true;
    }

    @Override // androidx.activity.s, android.app.Dialog
    public final void onStop() {
        super.onStop();
        d0 d0Var = (d0) d();
        d0Var.C();
        u1.h0 h0Var = d0Var.f1889t;
        if (h0Var != null) {
            h0Var.k0(false);
        }
    }

    @Override // androidx.activity.s, android.app.Dialog
    public final void setContentView(int i4) {
        c();
        d().h(i4);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i4) {
        super.setTitle(i4);
        d().n(getContext().getString(i4));
    }

    @Override // androidx.activity.s, android.app.Dialog
    public final void setContentView(View view) {
        c();
        d().k(view);
    }

    @Override // androidx.activity.s, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        d().l(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        g(charSequence);
        e eVar = this.f1926k;
        eVar.f1899d = charSequence;
        TextView textView = eVar.f1914u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
