package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.IntentSenderRequest;
import co.median.android.eeqadjy.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.t, androidx.lifecycle.u0, androidx.lifecycle.i, l1.e {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    y mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.s0 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    u0 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    h0 mHost;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.v mLifecycleRegistry;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    l1.d mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    View mView;
    l1 mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    u0 mChildFragmentManager = new v0();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new s(this, 0);
    androidx.lifecycle.n mMaxState = androidx.lifecycle.n.f845j;
    androidx.lifecycle.a0 mViewLifecycleOwnerLiveData = new androidx.lifecycle.a0();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<a0> mOnPreAttachedListeners = new ArrayList<>();
    private final a0 mSavedStateAttachListener = new t(this);

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new b0();
        public final Bundle f;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            parcel.writeBundle(this.f);
        }
    }

    public Fragment() {
        e();
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) o0.b(str, context.getClassLoader()).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return fragment;
            }
            bundle.setClassLoader(fragment.getClass().getClassLoader());
            fragment.setArguments(bundle);
            return fragment;
        } catch (IllegalAccessException e5) {
            throw new z(u.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e5);
        } catch (InstantiationException e6) {
            throw new z(u.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e6);
        } catch (NoSuchMethodException e7) {
            throw new z(u.m("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e7);
        } catch (InvocationTargetException e8) {
            throw new z(u.m("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e8);
        }
    }

    public final y b() {
        if (this.mAnimationInfo == null) {
            y yVar = new y();
            yVar.f792i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            yVar.f793j = obj;
            yVar.f794k = null;
            yVar.f795l = obj;
            yVar.f796m = null;
            yVar.n = obj;
            yVar.f799q = 1.0f;
            yVar.f800r = null;
            this.mAnimationInfo = yVar;
        }
        return this.mAnimationInfo;
    }

    public final int c() {
        androidx.lifecycle.n nVar = this.mMaxState;
        return (nVar == androidx.lifecycle.n.f842g || this.mParentFragment == null) ? nVar.ordinal() : Math.min(nVar.ordinal(), this.mParentFragment.c());
    }

    public void callStartTransitionListener(boolean z4) {
        ViewGroup viewGroup;
        u0 u0Var;
        y yVar = this.mAnimationInfo;
        if (yVar != null) {
            yVar.f801s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (u0Var = this.mFragmentManager) == null) {
            return;
        }
        l lVarH = l.h(viewGroup, u0Var.E());
        lVarH.j();
        if (z4) {
            this.mHost.f697h.post(new f(3, lVarH));
        } else {
            lVarH.d();
        }
    }

    public g0 createFragmentContainer() {
        return new v(this);
    }

    public final Fragment d(boolean z4) {
        String str;
        if (z4) {
            d1.b bVar = d1.c.f1656a;
            d1.c.b(new d1.e(this, "Attempting to get target fragment from fragment " + this));
            d1.c.a(this).getClass();
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        u0 u0Var = this.mFragmentManager;
        if (u0Var == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return u0Var.f751c.b(str);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment fragmentD = d(false);
        if (fragmentD != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentD);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(getViewModelStore(), g1.b.f2143e);
            String canonicalName = g1.b.class.getCanonicalName();
            if (canonicalName == null) {
                q.q("Local and anonymous classes can not be ViewModels");
                return;
            }
            p.l lVar = ((g1.b) tVar.e("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), g1.b.class)).f2144d;
            if (lVar.f3159h > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                if (lVar.f3159h > 0) {
                    if (lVar.f3158g[0] != null) {
                        q.c();
                        return;
                    }
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(lVar.f[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.u(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final void e() {
        this.mLifecycleRegistry = new androidx.lifecycle.v(this);
        this.mSavedStateRegistryController = new l1.d(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        a0 a0Var = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            a0Var.a();
        } else {
            this.mOnPreAttachedListeners.add(a0Var);
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final r f(c.a aVar, w wVar, b.b bVar) {
        if (this.mState > 1) {
            q.j(u.l("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        x xVar = new x(this, wVar, atomicReference, aVar, bVar);
        if (this.mState >= 0) {
            xVar.a();
        } else {
            this.mOnPreAttachedListeners.add(xVar);
        }
        return new r(atomicReference);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f751c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final e0 getActivity() {
        h0 h0Var = this.mHost;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        y yVar = this.mAnimationInfo;
        if (yVar == null || (bool = yVar.f798p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        y yVar = this.mAnimationInfo;
        if (yVar == null || (bool = yVar.f797o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        yVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final u0 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        q.j(u.l("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public Context getContext() {
        h0 h0Var = this.mHost;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f696g;
    }

    @Override // androidx.lifecycle.i
    public f1.b getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && u0.G(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        f1.c cVar = new f1.c(0);
        LinkedHashMap linkedHashMap = cVar.f2088a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.q0.f, application);
        }
        linkedHashMap.put(androidx.lifecycle.k0.f833a, this);
        linkedHashMap.put(androidx.lifecycle.k0.f834b, this);
        if (getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.k0.f835c, getArguments());
        }
        return cVar;
    }

    public androidx.lifecycle.s0 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            q.j("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && u0.G(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.n0(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 0;
        }
        return yVar.f786b;
    }

    public Object getEnterTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        return yVar.f792i;
    }

    public b0.r getEnterTransitionCallback() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        yVar.getClass();
        return null;
    }

    public int getExitAnim() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 0;
        }
        return yVar.f787c;
    }

    public Object getExitTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        return yVar.f794k;
    }

    public b0.r getExitTransitionCallback() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        yVar.getClass();
        return null;
    }

    public View getFocusedView() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        return yVar.f800r;
    }

    @Deprecated
    public final u0 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        h0 h0Var = this.mHost;
        if (h0Var == null) {
            return null;
        }
        return ((d0) h0Var).f670j;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        h0 h0Var = this.mHost;
        if (h0Var == null) {
            q.j("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        e.j jVar = ((d0) h0Var).f670j;
        LayoutInflater layoutInflaterCloneInContext = jVar.getLayoutInflater().cloneInContext(jVar);
        layoutInflaterCloneInContext.setFactory2(this.mChildFragmentManager.f);
        return layoutInflaterCloneInContext;
    }

    @Override // androidx.lifecycle.t
    public androidx.lifecycle.o getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public g1.a getLoaderManager() {
        return new g1.c(this, getViewModelStore());
    }

    public int getNextTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 0;
        }
        return yVar.f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final u0 getParentFragmentManager() {
        u0 u0Var = this.mFragmentManager;
        if (u0Var != null) {
            return u0Var;
        }
        q.j(u.l("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public boolean getPopDirection() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return false;
        }
        return yVar.f785a;
    }

    public int getPopEnterAnim() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 0;
        }
        return yVar.f788d;
    }

    public int getPopExitAnim() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 0;
        }
        return yVar.f789e;
    }

    public float getPostOnViewCreatedAlpha() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return 1.0f;
        }
        return yVar.f799q;
    }

    public Object getReenterTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        Object obj = yVar.f795l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        d1.b bVar = d1.c.f1656a;
        d1.c.b(new d1.d(this, "Attempting to get retain instance for fragment " + this));
        d1.c.a(this).getClass();
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        Object obj = yVar.f793j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // l1.e
    public final l1.c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f3011b;
    }

    public Object getSharedElementEnterTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        return yVar.f796m;
    }

    public Object getSharedElementReturnTransition() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return null;
        }
        Object obj = yVar.n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        y yVar = this.mAnimationInfo;
        return (yVar == null || (arrayList = yVar.f790g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        y yVar = this.mAnimationInfo;
        return (yVar == null || (arrayList = yVar.f791h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i4) {
        return getResources().getString(i4);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return d(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        d1.b bVar = d1.c.f1656a;
        d1.c.b(new d1.e(this, "Attempting to get target request code from fragment " + this));
        d1.c.a(this).getClass();
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i4) {
        return getResources().getText(i4);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.t getViewLifecycleOwner() {
        l1 l1Var = this.mViewLifecycleOwner;
        if (l1Var != null) {
            return l1Var;
        }
        q.j("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
        return null;
    }

    public androidx.lifecycle.z getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.u0
    public androidx.lifecycle.t0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            q.j("Can't access ViewModels from detached fragment");
            return null;
        }
        if (c() == 1) {
            q.j("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.mFragmentManager.L.f;
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) map.get(this.mWho);
        if (t0Var != null) {
            return t0Var;
        }
        androidx.lifecycle.t0 t0Var2 = new androidx.lifecycle.t0();
        map.put(this.mWho, t0Var2);
        return t0Var2;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        e();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new v0();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        u0 u0Var = this.mFragmentManager;
        if (u0Var != null) {
            Fragment fragment = this.mParentFragment;
            u0Var.getClass();
            if (fragment == null ? false : fragment.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            Fragment fragment = this.mParentFragment;
            if (!(fragment == null ? true : fragment.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        y yVar = this.mAnimationInfo;
        if (yVar == null) {
            return false;
        }
        return yVar.f801s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        u0 u0Var = this.mFragmentManager;
        if (u0Var == null) {
            return false;
        }
        return u0Var.E || u0Var.F;
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.L();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i4, int i5, Intent intent) {
        if (u0.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i4 + " resultCode: " + i5 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        h0 h0Var = this.mHost;
        e.j jVar = h0Var == null ? null : h0Var.f;
        if (jVar != null) {
            this.mCalled = false;
            onAttach((Activity) jVar);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        u0 u0Var = this.mChildFragmentManager;
        if (u0Var.f765s >= 1) {
            return;
        }
        u0Var.E = false;
        u0Var.F = false;
        u0Var.L.f779i = false;
        u0Var.t(1);
    }

    public Animation onCreateAnimation(int i4, boolean z4, int i5) {
        return null;
    }

    public Animator onCreateAnimator(int i4, boolean z4, int i5) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i4 = this.mContentLayoutId;
        if (i4 != 0) {
            return layoutInflater.inflate(i4, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        h0 h0Var = this.mHost;
        e.j jVar = h0Var == null ? null : h0Var.f;
        if (jVar != null) {
            this.mCalled = false;
            onInflate((Activity) jVar, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public abstract void onSaveInstanceState(Bundle bundle);

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.L();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new p1(u.l("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (u0.G(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
        u0 u0Var = this.mChildFragmentManager;
        u0Var.E = false;
        u0Var.F = false;
        u0Var.L.f779i = false;
        u0Var.t(4);
    }

    public void performAttach() {
        ArrayList<a0> arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            a0 a0Var = arrayList.get(i4);
            i4++;
            a0Var.a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f696g);
        if (!this.mCalled) {
            throw new p1(u.l("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator it = this.mFragmentManager.f760m.iterator();
        while (it.hasNext()) {
            ((x0) it.next()).e(this);
        }
        u0 u0Var = this.mChildFragmentManager;
        u0Var.E = false;
        u0Var.F = false;
        u0Var.L.f779i = false;
        u0Var.t(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.i(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.L();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new androidx.lifecycle.r() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.r
            public final void a(androidx.lifecycle.t tVar, androidx.lifecycle.m mVar) {
                View view;
                if (mVar != androidx.lifecycle.m.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.mSavedStateRegistryController.b(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new p1(u.l("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.e(androidx.lifecycle.m.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z4 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z4 = true;
        }
        return this.mChildFragmentManager.j(menu, menuInflater) | z4;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.L();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new l1(this, getViewModelStore());
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        l1 l1Var = this.mViewLifecycleOwner;
        if (viewOnCreateView == null) {
            if (l1Var.f722h == null) {
                this.mViewLifecycleOwner = null;
                return;
            } else {
                q.j("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        l1Var.c();
        View view = this.mView;
        l1 l1Var2 = this.mViewLifecycleOwner;
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, l1Var2);
        View view2 = this.mView;
        l1 l1Var3 = this.mViewLifecycleOwner;
        view2.getClass();
        view2.setTag(R.id.view_tree_view_model_store_owner, l1Var3);
        View view3 = this.mView;
        l1 l1Var4 = this.mViewLifecycleOwner;
        view3.getClass();
        view3.setTag(R.id.view_tree_saved_state_registry_owner, l1Var4);
        this.mViewLifecycleOwnerLiveData.e(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.k();
        this.mLifecycleRegistry.e(androidx.lifecycle.m.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new p1(u.l("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.t(1);
        if (this.mView != null) {
            l1 l1Var = this.mViewLifecycleOwner;
            l1Var.c();
            if (l1Var.f722h.f866c.compareTo(androidx.lifecycle.n.f843h) >= 0) {
                this.mViewLifecycleOwner.b(androidx.lifecycle.m.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new p1(u.l("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(getViewModelStore(), g1.b.f2143e);
        String canonicalName = g1.b.class.getCanonicalName();
        if (canonicalName == null) {
            q.q("Local and anonymous classes can not be ViewModels");
            return;
        }
        p.l lVar = ((g1.b) tVar.e("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), g1.b.class)).f2144d;
        if (lVar.f3159h <= 0) {
            this.mPerformedCreateView = false;
        } else {
            lVar.f3158g[0].getClass();
            q.c();
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new p1(u.l("Fragment ", this, " did not call through to super.onDetach()"));
        }
        u0 u0Var = this.mChildFragmentManager;
        if (u0Var.G) {
            return;
        }
        u0Var.k();
        this.mChildFragmentManager = new v0();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z4) {
        onMultiWindowModeChanged(z4);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.o(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.p(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.t(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.b(androidx.lifecycle.m.ON_PAUSE);
        }
        this.mLifecycleRegistry.e(androidx.lifecycle.m.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new p1(u.l("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z4) {
        onPictureInPictureModeChanged(z4);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z4 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z4 = true;
        }
        return this.mChildFragmentManager.s(menu) | z4;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zJ = u0.J(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zJ) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zJ);
            onPrimaryNavigationFragmentChanged(zJ);
            u0 u0Var = this.mChildFragmentManager;
            u0Var.a0();
            u0Var.q(u0Var.f769w);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.L();
        this.mChildFragmentManager.x(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new p1(u.l("Fragment ", this, " did not call through to super.onResume()"));
        }
        androidx.lifecycle.v vVar = this.mLifecycleRegistry;
        androidx.lifecycle.m mVar = androidx.lifecycle.m.ON_RESUME;
        vVar.e(mVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f722h.e(mVar);
        }
        u0 u0Var = this.mChildFragmentManager;
        u0Var.E = false;
        u0Var.F = false;
        u0Var.L.f779i = false;
        u0Var.t(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
        bundle.putParcelable("android:support:fragments", this.mChildFragmentManager.S());
    }

    public void performStart() {
        this.mChildFragmentManager.L();
        this.mChildFragmentManager.x(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new p1(u.l("Fragment ", this, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.v vVar = this.mLifecycleRegistry;
        androidx.lifecycle.m mVar = androidx.lifecycle.m.ON_START;
        vVar.e(mVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f722h.e(mVar);
        }
        u0 u0Var = this.mChildFragmentManager;
        u0Var.E = false;
        u0Var.F = false;
        u0Var.L.f779i = false;
        u0Var.t(5);
    }

    public void performStop() {
        u0 u0Var = this.mChildFragmentManager;
        u0Var.F = true;
        u0Var.L.f779i = true;
        u0Var.t(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.b(androidx.lifecycle.m.ON_STOP);
        }
        this.mLifecycleRegistry.e(androidx.lifecycle.m.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new p1(u.l("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.t(2);
    }

    public final void postponeEnterTransition(long j4, TimeUnit timeUnit) {
        b().f801s = true;
        u0 u0Var = this.mFragmentManager;
        Handler handler = u0Var != null ? u0Var.f766t.f697h : new Handler(Looper.getMainLooper());
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j4));
    }

    public final <I, O> b.c registerForActivityResult(c.a aVar, b.b bVar) {
        return f(aVar, new w(0, this), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i4) {
        if (this.mHost == null) {
            q.j(u.l("Fragment ", this, " not attached to Activity"));
            return;
        }
        u0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.B == null) {
            parentFragmentManager.f766t.getClass();
            return;
        }
        parentFragmentManager.C.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i4));
        parentFragmentManager.B.a(strArr);
    }

    public final e0 requireActivity() {
        e0 activity = getActivity();
        if (activity != null) {
            return activity;
        }
        q.j(u.l("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        q.j(u.l("Fragment ", this, " does not have any arguments."));
        return null;
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        q.j(u.l("Fragment ", this, " not attached to a context."));
        return null;
    }

    @Deprecated
    public final u0 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        q.j(u.l("Fragment ", this, " not attached to a host."));
        return null;
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            q.j(u.l("Fragment ", this, " is not attached to any Fragment or host"));
            return null;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        Context context = getContext();
        sb.append(" is not a child Fragment, it is directly attached to ");
        sb.append(context);
        throw new IllegalStateException(sb.toString());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        q.j(u.l("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.R(parcelable);
        u0 u0Var = this.mChildFragmentManager;
        u0Var.E = false;
        u0Var.F = false;
        u0Var.L.f779i = false;
        u0Var.t(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            l1 l1Var = this.mViewLifecycleOwner;
            l1Var.f723i.b(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new p1(u.l("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.b(androidx.lifecycle.m.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z4) {
        b().f798p = Boolean.valueOf(z4);
    }

    public void setAllowReturnTransitionOverlap(boolean z4) {
        b().f797o = Boolean.valueOf(z4);
    }

    public void setAnimations(int i4, int i5, int i6, int i7) {
        if (this.mAnimationInfo == null && i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            return;
        }
        b().f786b = i4;
        b().f787c = i5;
        b().f788d = i6;
        b().f789e = i7;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
        } else {
            q.j("Fragment already added and state has been saved");
        }
    }

    public void setEnterSharedElementCallback(b0.r rVar) {
        b().getClass();
    }

    public void setEnterTransition(Object obj) {
        b().f792i = obj;
    }

    public void setExitSharedElementCallback(b0.r rVar) {
        b().getClass();
    }

    public void setExitTransition(Object obj) {
        b().f794k = obj;
    }

    public void setFocusedView(View view) {
        b().f800r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z4) {
        if (this.mHasMenu != z4) {
            this.mHasMenu = z4;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((d0) this.mHost).f670j.invalidateOptionsMenu();
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            q.j("Fragment already added");
            return;
        }
        if (savedState == null || (bundle = savedState.f) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z4) {
        if (this.mMenuVisible != z4) {
            this.mMenuVisible = z4;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((d0) this.mHost).f670j.invalidateOptionsMenu();
            }
        }
    }

    public void setNextTransition(int i4) {
        if (this.mAnimationInfo == null && i4 == 0) {
            return;
        }
        b();
        this.mAnimationInfo.f = i4;
    }

    public void setPopDirection(boolean z4) {
        if (this.mAnimationInfo == null) {
            return;
        }
        b().f785a = z4;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        b().f799q = f;
    }

    public void setReenterTransition(Object obj) {
        b().f795l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z4) {
        d1.b bVar = d1.c.f1656a;
        d1.c.b(new d1.d(this, "Attempting to set retain instance for fragment " + this));
        d1.c.a(this).getClass();
        this.mRetainInstance = z4;
        u0 u0Var = this.mFragmentManager;
        if (u0Var == null) {
            this.mRetainInstanceChangedWhileDetached = true;
            return;
        }
        w0 w0Var = u0Var.L;
        if (z4) {
            w0Var.c(this);
        } else {
            w0Var.f(this);
        }
    }

    public void setReturnTransition(Object obj) {
        b().f793j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        b().f796m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        b();
        y yVar = this.mAnimationInfo;
        yVar.f790g = arrayList;
        yVar.f791h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        b().n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i4) {
        if (fragment != null) {
            d1.b bVar = d1.c.f1656a;
            d1.c.b(new d1.e(this, "Attempting to set target fragment " + fragment + " with request code " + i4 + " for fragment " + this));
            d1.c.a(this).getClass();
        }
        u0 u0Var = this.mFragmentManager;
        u0 u0Var2 = fragment != null ? fragment.mFragmentManager : null;
        if (u0Var != null && u0Var2 != null && u0Var != u0Var2) {
            q.q(u.l("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (Fragment fragmentD = fragment; fragmentD != null; fragmentD = fragmentD.d(false)) {
            if (fragmentD.equals(this)) {
                q.n("Setting ", fragment, " as the target of ", this, " would create a target cycle");
                return;
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i4;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z4) {
        d1.b bVar = d1.c.f1656a;
        d1.c.b(new d1.a(this, "Attempting to set user visible hint to " + z4 + " for fragment " + this));
        d1.c.a(this).getClass();
        boolean z5 = false;
        if (!this.mUserVisibleHint && z4 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            u0 u0Var = this.mFragmentManager;
            z0 z0VarF = u0Var.f(this);
            Fragment fragment = z0VarF.f804c;
            if (fragment.mDeferStart) {
                if (u0Var.f750b) {
                    u0Var.H = true;
                } else {
                    fragment.mDeferStart = false;
                    z0VarF.j();
                }
            }
        }
        this.mUserVisibleHint = z4;
        if (this.mState < 5 && !z4) {
            z5 = true;
        }
        this.mDeferStart = z5;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z4);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        h0 h0Var = this.mHost;
        if (h0Var != null) {
            return b0.a.b(((d0) h0Var).f670j, str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        h0 h0Var = this.mHost;
        if (h0Var != null) {
            c0.c.startActivity(h0Var.f696g, intent, bundle);
        } else {
            q.j(u.l("Fragment ", this, " not attached to Activity"));
        }
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i4, Bundle bundle) {
        if (this.mHost == null) {
            q.j(u.l("Fragment ", this, " not attached to Activity"));
            return;
        }
        u0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f772z != null) {
            parentFragmentManager.C.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i4));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.f772z.a(intent);
            return;
        }
        h0 h0Var = parentFragmentManager.f766t;
        if (i4 == -1) {
            c0.c.startActivity(h0Var.f696g, intent, bundle);
        } else {
            h0Var.getClass();
            q.j("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        if (this.mHost == null) {
            q.j(u.l("Fragment ", this, " not attached to Activity"));
            return;
        }
        if (u0.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i4 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        u0 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.A == null) {
            h0 h0Var = parentFragmentManager.f766t;
            if (i4 == -1) {
                h0Var.f.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
                return;
            } else {
                h0Var.getClass();
                q.j("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (u0.G(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + this);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        intentSender.getClass();
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent, i5, i6);
        parentFragmentManager.C.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i4));
        if (u0.G(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.A.a(intentSenderRequest);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !b().f801s) {
            return;
        }
        if (this.mHost == null) {
            b().f801s = false;
        } else if (Looper.myLooper() != this.mHost.f697h.getLooper()) {
            this.mHost.f697h.postAtFrontOfQueue(new s(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public final String getString(int i4, Object... objArr) {
        return getResources().getString(i4, objArr);
    }

    public final <I, O> b.c registerForActivityResult(c.a aVar, b.h hVar, b.b bVar) {
        return f(aVar, new w(2, hVar), bVar);
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    public void postponeEnterTransition() {
        b().f801s = true;
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onHiddenChanged(boolean z4) {
    }

    public void onMultiWindowModeChanged(boolean z4) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z4) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z4) {
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i4) {
        startActivityForResult(intent, i4, null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
    }
}
