package r2;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import co.median.android.eeqadjy.R;
import com.google.android.material.internal.NavigationMenuItemView;
import j.e0;
import java.util.ArrayList;
import k1.x0;
import p0.p0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends k1.b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f3554d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j.o f3555e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f3556g;

    public i(q qVar) {
        this.f3556g = qVar;
        g();
    }

    @Override // k1.b0
    public final int a() {
        return this.f3554d.size();
    }

    @Override // k1.b0
    public final long b(int i4) {
        return i4;
    }

    @Override // k1.b0
    public final int c(int i4) {
        k kVar = (k) this.f3554d.get(i4);
        if (kVar instanceof l) {
            return 2;
        }
        if (kVar instanceof j) {
            return 3;
        }
        if (kVar instanceof m) {
            return ((m) kVar).f3559a.hasSubMenu() ? 1 : 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    @Override // k1.b0
    public final void d(x0 x0Var, int i4) {
        View view = ((p) x0Var).f2945a;
        int iC = c(i4);
        ArrayList arrayList = this.f3554d;
        q qVar = this.f3556g;
        if (iC != 0) {
            if (iC != 1) {
                if (iC != 2) {
                    return;
                }
                l lVar = (l) arrayList.get(i4);
                view.setPaddingRelative(qVar.f3577x, lVar.f3557a, qVar.f3578y, lVar.f3558b);
                return;
            }
            TextView textView = (TextView) view;
            textView.setText(((m) arrayList.get(i4)).f3559a.f2412e);
            textView.setTextAppearance(qVar.f3566l);
            textView.setPaddingRelative(qVar.f3579z, textView.getPaddingTop(), qVar.A, textView.getPaddingBottom());
            ColorStateList colorStateList = qVar.f3567m;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            p0.m(textView, new h(this, i4, true));
            return;
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
        navigationMenuItemView.setIconTintList(qVar.f3570q);
        navigationMenuItemView.setTextAppearance(qVar.n);
        ColorStateList colorStateList2 = qVar.f3569p;
        if (colorStateList2 != null) {
            navigationMenuItemView.setTextColor(colorStateList2);
        }
        Drawable drawable = qVar.f3571r;
        navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
        RippleDrawable rippleDrawable = qVar.f3572s;
        if (rippleDrawable != null) {
            navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        m mVar = (m) arrayList.get(i4);
        navigationMenuItemView.setNeedsEmptyIcon(mVar.f3560b);
        int i5 = qVar.f3573t;
        int i6 = qVar.f3574u;
        navigationMenuItemView.setPadding(i5, i6, i5, i6);
        navigationMenuItemView.setIconPadding(qVar.f3575v);
        if (qVar.B) {
            navigationMenuItemView.setIconSize(qVar.f3576w);
        }
        navigationMenuItemView.setMaxLines(qVar.D);
        j.o oVar = mVar.f3559a;
        navigationMenuItemView.D = qVar.f3568o;
        navigationMenuItemView.b(oVar);
        p0.m(navigationMenuItemView, new h(this, i4, false));
    }

    @Override // k1.b0
    public final x0 e(ViewGroup viewGroup, int i4) {
        q qVar = this.f3556g;
        if (i4 == 0) {
            LayoutInflater layoutInflater = qVar.f3565k;
            com.google.android.material.datepicker.k kVar = qVar.H;
            View viewInflate = layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false);
            o oVar = new o(viewInflate);
            viewInflate.setOnClickListener(kVar);
            return oVar;
        }
        if (i4 == 1) {
            return new g(qVar.f3565k.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
        if (i4 == 2) {
            return new g(qVar.f3565k.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
        if (i4 != 3) {
            return null;
        }
        return new g(qVar.f3561g);
    }

    @Override // k1.b0
    public final void f(x0 x0Var) {
        p pVar = (p) x0Var;
        if (pVar instanceof o) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) pVar.f2945a;
            FrameLayout frameLayout = navigationMenuItemView.F;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.E.setCompoundDrawables(null, null, null, null);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g() {
        if (this.f) {
            return;
        }
        this.f = true;
        ArrayList arrayList = this.f3554d;
        arrayList.clear();
        arrayList.add(new j());
        q qVar = this.f3556g;
        int size = qVar.f3562h.l().size();
        boolean z4 = false;
        int i4 = -1;
        int i5 = 0;
        boolean z5 = false;
        int size2 = 0;
        while (i5 < size) {
            j.o oVar = (j.o) qVar.f3562h.l().get(i5);
            if (oVar.isChecked()) {
                h(oVar);
            }
            if (oVar.isCheckable()) {
                oVar.f(z4);
            }
            if (oVar.hasSubMenu()) {
                e0 e0Var = oVar.f2420o;
                if (e0Var.hasVisibleItems()) {
                    if (i5 != 0) {
                        arrayList.add(new l(qVar.F, z4 ? 1 : 0));
                    }
                    arrayList.add(new m(oVar));
                    int size3 = e0Var.f.size();
                    int i6 = z4 ? 1 : 0;
                    int i7 = i6;
                    while (i6 < size3) {
                        j.o oVar2 = (j.o) e0Var.getItem(i6);
                        if (oVar2.isVisible()) {
                            if (i7 == 0 && oVar2.getIcon() != null) {
                                i7 = 1;
                            }
                            if (oVar2.isCheckable()) {
                                oVar2.f(z4);
                            }
                            if (oVar2.isChecked()) {
                                h(oVar2);
                            }
                            arrayList.add(new m(oVar2));
                        }
                        i6++;
                        z4 = false;
                    }
                    if (i7 != 0) {
                        int size4 = arrayList.size();
                        for (int size5 = arrayList.size(); size5 < size4; size5++) {
                            ((m) arrayList.get(size5)).f3560b = true;
                        }
                    }
                }
            } else {
                int i8 = oVar.f2409b;
                if (i8 != i4) {
                    size2 = arrayList.size();
                    z5 = oVar.getIcon() != null;
                    if (i5 != 0) {
                        size2++;
                        int i9 = qVar.F;
                        arrayList.add(new l(i9, i9));
                    }
                } else if (!z5 && oVar.getIcon() != null) {
                    int size6 = arrayList.size();
                    for (int i10 = size2; i10 < size6; i10++) {
                        ((m) arrayList.get(i10)).f3560b = true;
                    }
                    z5 = true;
                }
                m mVar = new m(oVar);
                mVar.f3560b = z5;
                arrayList.add(mVar);
                i4 = i8;
            }
            i5++;
            z4 = false;
        }
        this.f = z4;
    }

    public final void h(j.o oVar) {
        if (this.f3555e == oVar || !oVar.isCheckable()) {
            return;
        }
        j.o oVar2 = this.f3555e;
        if (oVar2 != null) {
            oVar2.setChecked(false);
        }
        this.f3555e = oVar;
        oVar.setChecked(true);
    }
}
