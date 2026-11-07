package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import co.median.android.eeqadjy.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p0.y1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f613i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, u0 u0Var) {
        View view;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.f = new ArrayList();
        this.f611g = new ArrayList();
        this.f613i = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i4 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.a.f1117b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentA = u0Var.A(id);
        if (classAttribute != null && fragmentA == null) {
            if (id == -1) {
                q.j(u.m("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
                throw null;
            }
            o0 o0VarD = u0Var.D();
            context.getClassLoader();
            Fragment fragmentInstantiate = Fragment.instantiate(o0VarD.f735a.f766t.f696g, classAttribute, null);
            fragmentInstantiate.getClass();
            fragmentInstantiate.onInflate(context, attributeSet, (Bundle) null);
            a aVar = new a(u0Var);
            aVar.f664o = true;
            fragmentInstantiate.mContainer = this;
            aVar.c(getId(), fragmentInstantiate, string, 1);
            if (aVar.f657g) {
                q.j("This transaction is already being added to the back stack");
                throw null;
            }
            aVar.f633p.y(aVar, true);
        }
        ArrayList arrayListD = u0Var.f751c.d();
        int size = arrayListD.size();
        while (i4 < size) {
            Object obj = arrayListD.get(i4);
            i4++;
            z0 z0Var = (z0) obj;
            Fragment fragment = z0Var.f804c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                z0Var.a();
            }
        }
    }

    public final void a(View view) {
        if (this.f611g.contains(view)) {
            this.f.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        y1 y1VarH;
        windowInsets.getClass();
        y1 y1VarH2 = y1.h(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f612h;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            windowInsetsOnApplyWindowInsets.getClass();
            y1VarH = y1.h(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = p0.p0.f3233a;
            WindowInsets windowInsetsG = y1VarH2.g();
            if (windowInsetsG != null && !windowInsetsG.equals(windowInsetsG)) {
                y1VarH2 = y1.h(this, windowInsetsG);
            }
            y1VarH = y1VarH2;
        }
        if (!y1VarH.f3268a.r()) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                p0.p0.b(getChildAt(i4), y1VarH);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.f613i) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        canvas.getClass();
        view.getClass();
        if (this.f613i) {
            ArrayList arrayList = this.f;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.f611g.remove(view);
        if (this.f.remove(view)) {
            this.f613i = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        e0 e0Var;
        Fragment fragment;
        u0 childFragmentManager;
        View view = this;
        while (true) {
            e0Var = null;
            if (view == null) {
                fragment = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (fragment == null) {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof e0) {
                    e0Var = (e0) context;
                    break;
                }
            }
            if (e0Var == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            childFragmentManager = ((d0) e0Var.f674y.f773g).f698i;
        } else {
            if (!fragment.isAdded()) {
                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            childFragmentManager = fragment.getChildFragmentManager();
        }
        return (F) childFragmentManager.A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i4) {
        View childAt = getChildAt(i4);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i4, int i5) {
        int i6 = i4 + i5;
        for (int i7 = i4; i7 < i6; i7++) {
            View childAt = getChildAt(i7);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i4, i5);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i4, int i5) {
        int i6 = i4 + i5;
        for (int i7 = i4; i7 < i6; i7++) {
            View childAt = getChildAt(i7);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i4, i5);
    }

    public final void setDrawDisappearingViewsLast(boolean z4) {
        this.f613i = z4;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.f612h = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.f611g.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        context.getClass();
        this.f = new ArrayList();
        this.f611g = new ArrayList();
        this.f613i = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.a.f1117b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }
}
