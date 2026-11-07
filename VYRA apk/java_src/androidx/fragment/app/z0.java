package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import co.median.android.eeqadjy.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f805d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f806e = -1;

    public z0(e eVar, a1 a1Var, ClassLoader classLoader, o0 o0Var, FragmentState fragmentState) {
        this.f802a = eVar;
        this.f803b = a1Var;
        Fragment fragmentInstantiate = Fragment.instantiate(o0Var.f735a.f766t.f696g, fragmentState.f, null);
        Bundle bundle = fragmentState.f629o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentInstantiate.setArguments(bundle);
        fragmentInstantiate.mWho = fragmentState.f622g;
        fragmentInstantiate.mFromLayout = fragmentState.f623h;
        fragmentInstantiate.mRestored = true;
        fragmentInstantiate.mFragmentId = fragmentState.f624i;
        fragmentInstantiate.mContainerId = fragmentState.f625j;
        fragmentInstantiate.mTag = fragmentState.f626k;
        fragmentInstantiate.mRetainInstance = fragmentState.f627l;
        fragmentInstantiate.mRemoving = fragmentState.f628m;
        fragmentInstantiate.mDetached = fragmentState.n;
        fragmentInstantiate.mHidden = fragmentState.f630p;
        fragmentInstantiate.mMaxState = androidx.lifecycle.n.values()[fragmentState.f631q];
        Bundle bundle2 = fragmentState.f632r;
        if (bundle2 != null) {
            fragmentInstantiate.mSavedFragmentState = bundle2;
        } else {
            fragmentInstantiate.mSavedFragmentState = new Bundle();
        }
        this.f804c = fragmentInstantiate;
        if (u0.G(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentInstantiate);
        }
    }

    public final void a() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.f803b.f;
        Fragment fragment = this.f804c;
        ViewGroup viewGroup = fragment.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(fragment);
            for (int i4 = iIndexOf - 1; i4 >= 0; i4--) {
                Fragment fragment2 = (Fragment) arrayList.get(i4);
                if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                Fragment fragment3 = (Fragment) arrayList.get(iIndexOf);
                if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, iIndexOfChild);
    }

    public final void b() {
        boolean zG = u0.G(3);
        Fragment fragment = this.f804c;
        if (zG) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        z0 z0Var = null;
        a1 a1Var = this.f803b;
        if (fragment2 != null) {
            z0 z0Var2 = (z0) ((HashMap) a1Var.f636g).get(fragment2.mWho);
            if (z0Var2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                Fragment fragment3 = fragment.mTarget;
                sb.append(" declared target fragment ");
                sb.append(fragment3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            z0Var = z0Var2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (z0Var = (z0) ((HashMap) a1Var.f636g).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                String str2 = fragment.mTargetWho;
                sb2.append(" declared target fragment ");
                sb2.append(str2);
                sb2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (z0Var != null) {
            z0Var.j();
        }
        u0 u0Var = fragment.mFragmentManager;
        fragment.mHost = u0Var.f766t;
        fragment.mParentFragment = u0Var.f768v;
        e eVar = this.f802a;
        eVar.g(false);
        fragment.performAttach();
        eVar.b(false);
    }

    public final int c() {
        o1 o1Var;
        Fragment fragment = this.f804c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f806e;
        int iOrdinal = fragment.mMaxState.ordinal();
        int i4 = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (fragment.mFromLayout) {
            boolean z4 = fragment.mInLayout;
            int i5 = this.f806e;
            if (z4) {
                iMin = Math.max(i5, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i5 < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            l lVarI = l.i(viewGroup, fragment.getParentFragmentManager());
            o1 o1VarF = lVarI.f(fragment);
            int i6 = o1VarF != null ? o1VarF.f737b : 0;
            ArrayList arrayList = lVarI.f717c;
            int size = arrayList.size();
            while (true) {
                if (i4 >= size) {
                    o1Var = null;
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                o1Var = (o1) obj;
                if (o1Var.f738c.equals(fragment) && !o1Var.f) {
                    break;
                }
            }
            i4 = (o1Var == null || !(i6 == 0 || i6 == 1)) ? i6 : o1Var.f737b;
        }
        if (i4 == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i4 == 3) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.mRemoving) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (u0.G(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + fragment);
        }
        return iMin;
    }

    public final void d() {
        boolean zG = u0.G(3);
        Fragment fragment = this.f804c;
        if (zG) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        boolean z4 = fragment.mIsCreated;
        Bundle bundle = fragment.mSavedFragmentState;
        if (z4) {
            fragment.restoreChildFragmentState(bundle);
            fragment.mState = 1;
        } else {
            e eVar = this.f802a;
            eVar.h(false);
            fragment.performCreate(fragment.mSavedFragmentState);
            eVar.c(false);
        }
    }

    public final void e() {
        String resourceName;
        Fragment fragment = this.f804c;
        if (fragment.mFromLayout) {
            return;
        }
        if (u0.G(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            int i4 = fragment.mContainerId;
            if (i4 == 0) {
                viewGroup = null;
            } else {
                if (i4 == -1) {
                    q.q(u.l("Cannot create fragment ", fragment, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.f767u.n(i4);
                if (viewGroup == null) {
                    if (!fragment.mRestored) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    d1.b bVar = d1.c.f1656a;
                    d1.c.b(new d1.a(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    d1.c.a(fragment).getClass();
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment.mSavedFragmentState);
        View view = fragment.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                a();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            View view2 = fragment.mView;
            WeakHashMap weakHashMap = p0.p0.f3233a;
            boolean zIsAttachedToWindow = view2.isAttachedToWindow();
            View view3 = fragment.mView;
            if (zIsAttachedToWindow) {
                view3.requestApplyInsets();
            } else {
                view3.addOnAttachStateChangeListener(new y0(view3));
            }
            fragment.performViewCreated();
            this.f802a.m(false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (u0.G(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void f() {
        Fragment fragmentB;
        boolean zG = u0.G(3);
        Fragment fragment = this.f804c;
        if (zG) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        int i4 = 0;
        boolean zIsChangingConfigurations = true;
        boolean z4 = fragment.mRemoving && !fragment.isInBackStack();
        a1 a1Var = this.f803b;
        if (z4 && !fragment.mBeingSaved) {
        }
        if (!z4) {
            w0 w0Var = (w0) a1Var.f638i;
            if (!((w0Var.f775d.containsKey(fragment.mWho) && w0Var.f777g) ? w0Var.f778h : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (fragmentB = a1Var.b(str)) != null && fragmentB.mRetainInstance) {
                    fragment.mTarget = fragmentB;
                }
                fragment.mState = 0;
                return;
            }
        }
        h0 h0Var = fragment.mHost;
        if (h0Var instanceof androidx.lifecycle.u0) {
            zIsChangingConfigurations = ((w0) a1Var.f638i).f778h;
        } else {
            e.j jVar = h0Var.f696g;
            if (jVar != null) {
                zIsChangingConfigurations = true ^ jVar.isChangingConfigurations();
            }
        }
        if ((z4 && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            ((w0) a1Var.f638i).d(fragment);
        }
        fragment.performDestroy();
        this.f802a.d(false);
        ArrayList arrayListD = a1Var.d();
        int size = arrayListD.size();
        while (i4 < size) {
            Object obj = arrayListD.get(i4);
            i4++;
            z0 z0Var = (z0) obj;
            if (z0Var != null) {
                Fragment fragment2 = z0Var.f804c;
                if (fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str2 = fragment.mTargetWho;
        if (str2 != null) {
            fragment.mTarget = a1Var.b(str2);
        }
        a1Var.h(this);
    }

    public final void g() {
        View view;
        boolean zG = u0.G(3);
        Fragment fragment = this.f804c;
        if (zG) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f802a.n(false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.e(null);
        fragment.mInLayout = false;
    }

    public final void h() {
        boolean zG = u0.G(3);
        Fragment fragment = this.f804c;
        if (zG) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        this.f802a.e(false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            w0 w0Var = (w0) this.f803b.f638i;
            if (!((w0Var.f775d.containsKey(fragment.mWho) && w0Var.f777g) ? w0Var.f778h : true)) {
                return;
            }
        }
        if (u0.G(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.initState();
    }

    public final void i() {
        Fragment fragment = this.f804c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (u0.G(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f802a.m(false);
                fragment.mState = 2;
            }
        }
    }

    public final void j() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z4 = this.f805d;
        Fragment fragment = this.f804c;
        if (z4) {
            if (u0.G(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.f805d = true;
            boolean z5 = false;
            while (true) {
                int iC = c();
                int i4 = fragment.mState;
                a1 a1Var = this.f803b;
                if (iC == i4) {
                    if (!z5 && i4 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (u0.G(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment);
                        }
                        ((w0) a1Var.f638i).d(fragment);
                        a1Var.h(this);
                        if (u0.G(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            l lVarI = l.i(viewGroup, fragment.getParentFragmentManager());
                            if (fragment.mHidden) {
                                if (u0.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragment);
                                }
                                lVarI.b(3, 1, this);
                            } else {
                                if (u0.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragment);
                                }
                                lVarI.b(2, 1, this);
                            }
                        }
                        u0 u0Var = fragment.mFragmentManager;
                        if (u0Var != null && fragment.mAdded && u0.H(fragment)) {
                            u0Var.D = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.n();
                    }
                    return;
                }
                e eVar = this.f802a;
                if (iC <= i4) {
                    switch (i4 - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (((FragmentState) ((HashMap) a1Var.f637h).get(fragment.mWho)) == null) {
                                    m();
                                }
                            }
                            f();
                            break;
                        case 1:
                            g();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (u0.G(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.mBeingSaved) {
                                m();
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                n();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                l lVarI2 = l.i(viewGroup2, fragment.getParentFragmentManager());
                                if (u0.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragment);
                                }
                                lVarI2.b(1, 3, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (u0.G(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + fragment);
                            }
                            fragment.performStop();
                            eVar.l(false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (u0.G(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
                            }
                            fragment.performPause();
                            eVar.f(false);
                            break;
                    }
                } else {
                    switch (i4 + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            if (u0.G(3)) {
                                Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
                            }
                            fragment.performActivityCreated(fragment.mSavedFragmentState);
                            eVar.a(false);
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                l lVarI3 = l.i(viewGroup3, fragment.getParentFragmentManager());
                                int iB = u.b(fragment.mView.getVisibility());
                                if (u0.G(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragment);
                                }
                                lVarI3.b(iB, 2, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (u0.G(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + fragment);
                            }
                            fragment.performStart();
                            eVar.k(false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            l();
                            break;
                    }
                }
                z5 = true;
            }
        } finally {
            this.f805d = false;
        }
    }

    public final void k(ClassLoader classLoader) {
        Fragment fragment = this.f804c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("android:view_registry_state");
        fragment.mTargetWho = fragment.mSavedFragmentState.getString("android:target_state");
        if (fragment.mTargetWho != null) {
            fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Boolean bool = fragment.mSavedUserVisibleHint;
        if (bool != null) {
            fragment.mUserVisibleHint = bool.booleanValue();
            fragment.mSavedUserVisibleHint = null;
        } else {
            fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        if (fragment.mUserVisibleHint) {
            return;
        }
        fragment.mDeferStart = true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    public final void l() {
        boolean zRequestFocus;
        String str;
        boolean zG = u0.G(3);
        Fragment fragment = this.f804c;
        if (zG) {
            Log.d("FragmentManager", "moveto RESUMED: " + fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView == fragment.mView) {
                zRequestFocus = focusedView.requestFocus();
                if (u0.G(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(focusedView);
                    sb.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb.append(str);
                    sb.append(" on Fragment ");
                    sb.append(fragment);
                    sb.append(" resulting in focused view ");
                    sb.append(fragment.mView.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == fragment.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                zRequestFocus = focusedView.requestFocus();
                if (u0.G(2)) {
                    StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                    sb2.append(focusedView);
                    sb2.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb2.append(str);
                    sb2.append(" on Fragment ");
                    sb2.append(fragment);
                    sb2.append(" resulting in focused view ");
                    sb2.append(fragment.mView.findFocus());
                    Log.v("FragmentManager", sb2.toString());
                }
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.f802a.i(false);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final void m() {
        Fragment fragment = this.f804c;
        FragmentState fragmentState = new FragmentState(fragment);
        if (fragment.mState <= -1 || fragmentState.f632r != null) {
            fragmentState.f632r = fragment.mSavedFragmentState;
        } else {
            Bundle bundle = new Bundle();
            fragment.performSaveInstanceState(bundle);
            this.f802a.j(false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (fragment.mView != null) {
                n();
            }
            if (fragment.mSavedViewState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
            }
            if (fragment.mSavedViewRegistryState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", fragment.mSavedViewRegistryState);
            }
            if (!fragment.mUserVisibleHint) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
            }
            fragmentState.f632r = bundle;
            if (fragment.mTargetWho != null) {
                if (bundle == null) {
                    fragmentState.f632r = new Bundle();
                }
                fragmentState.f632r.putString("android:target_state", fragment.mTargetWho);
                int i4 = fragment.mTargetRequestCode;
                if (i4 != 0) {
                    fragmentState.f632r.putInt("android:target_req_state", i4);
                }
            }
        }
    }

    public final void n() {
        Fragment fragment = this.f804c;
        if (fragment.mView == null) {
            return;
        }
        if (u0.G(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f723i.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public z0(e eVar, a1 a1Var, Fragment fragment) {
        this.f802a = eVar;
        this.f803b = a1Var;
        this.f804c = fragment;
    }

    public z0(e eVar, a1 a1Var, Fragment fragment, FragmentState fragmentState) {
        this.f802a = eVar;
        this.f803b = a1Var;
        this.f804c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f632r;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
