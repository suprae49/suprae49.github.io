package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements LayoutInflater.Factory2 {
    public final u0 f;

    public j0(u0 u0Var) {
        this.f = u0Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        z0 z0VarF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        u0 u0Var = this.f;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, u0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c1.a.f1116a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = Fragment.class.isAssignableFrom(o0.a(attributeValue, context.getClassLoader()));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment fragmentA = resourceId != -1 ? u0Var.A(resourceId) : null;
                    if (fragmentA == null && string != null) {
                        fragmentA = u0Var.B(string);
                    }
                    if (fragmentA == null && id != -1) {
                        fragmentA = u0Var.A(id);
                    }
                    if (fragmentA == null) {
                        o0 o0VarD = u0Var.D();
                        context.getClassLoader();
                        fragmentA = Fragment.instantiate(o0VarD.f735a.f766t.f696g, attributeValue, null);
                        fragmentA.mFromLayout = true;
                        fragmentA.mFragmentId = resourceId != 0 ? resourceId : id;
                        fragmentA.mContainerId = id;
                        fragmentA.mTag = string;
                        fragmentA.mInLayout = true;
                        fragmentA.mFragmentManager = u0Var;
                        h0 h0Var = u0Var.f766t;
                        fragmentA.mHost = h0Var;
                        fragmentA.onInflate((Context) h0Var.f696g, attributeSet, fragmentA.mSavedFragmentState);
                        z0VarF = u0Var.a(fragmentA);
                        if (u0.G(2)) {
                            Log.v("FragmentManager", "Fragment " + fragmentA + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (fragmentA.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        fragmentA.mInLayout = true;
                        fragmentA.mFragmentManager = u0Var;
                        h0 h0Var2 = u0Var.f766t;
                        fragmentA.mHost = h0Var2;
                        fragmentA.onInflate((Context) h0Var2.f696g, attributeSet, fragmentA.mSavedFragmentState);
                        z0VarF = u0Var.f(fragmentA);
                        if (u0.G(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fragmentA + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    d1.b bVar = d1.c.f1656a;
                    d1.c.b(new d1.a(fragmentA, "Attempting to use <fragment> tag to add fragment " + fragmentA + " to container " + viewGroup));
                    d1.c.a(fragmentA).getClass();
                    fragmentA.mContainer = viewGroup;
                    z0VarF.j();
                    z0VarF.i();
                    View view2 = fragmentA.mView;
                    if (view2 == null) {
                        q.j(u.m("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragmentA.mView.getTag() == null) {
                        fragmentA.mView.setTag(string);
                    }
                    fragmentA.mView.addOnAttachStateChangeListener(new i0(this, z0VarF));
                    return fragmentA.mView;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
