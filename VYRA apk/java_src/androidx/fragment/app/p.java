package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import co.median.android.eeqadjy.R;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class p extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDismissed;
    private Handler mHandler;
    private boolean mShownByMe;
    private boolean mViewDestroyed;
    private Runnable mDismissRunnable = new f(2, this);
    private DialogInterface.OnCancelListener mOnCancelListener = new m(this);
    private DialogInterface.OnDismissListener mOnDismissListener = new n(this);
    private int mStyle = 0;
    private int mTheme = 0;
    private boolean mCancelable = true;
    private boolean mShowsDialog = true;
    private int mBackStackId = -1;
    private androidx.lifecycle.b0 mObserver = new w(1, this);
    private boolean mDialogCreated = false;

    @Override // androidx.fragment.app.Fragment
    public g0 createFragmentContainer() {
        return new o(this, super.createFragmentContainer());
    }

    public void dismiss() {
        g(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        g(true, false, false);
    }

    public void dismissNow() {
        g(false, false, true);
    }

    public final void g(boolean z4, boolean z5, boolean z6) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z5) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z6) {
                u0 parentFragmentManager = getParentFragmentManager();
                int i4 = this.mBackStackId;
                if (i4 < 0) {
                    parentFragmentManager.getClass();
                    q.q(u.k(i4, "Bad id: "));
                    return;
                }
                parentFragmentManager.N(i4, 1);
            } else {
                u0 parentFragmentManager2 = getParentFragmentManager();
                int i5 = this.mBackStackId;
                parentFragmentManager2.getClass();
                if (i5 < 0) {
                    q.q(u.k(i5, "Bad id: "));
                    return;
                }
                parentFragmentManager2.v(new t0(parentFragmentManager2, i5), z4);
            }
            this.mBackStackId = -1;
            return;
        }
        u0 parentFragmentManager3 = getParentFragmentManager();
        parentFragmentManager3.getClass();
        a aVar = new a(parentFragmentManager3);
        aVar.f664o = true;
        u0 u0Var = this.mFragmentManager;
        u0 u0Var2 = aVar.f633p;
        if (u0Var != null && u0Var != u0Var2) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new b1(this, 3));
        if (z6) {
            if (aVar.f657g) {
                q.j("This transaction is already being added to the back stack");
                return;
            } else {
                u0Var2.y(aVar, false);
                return;
            }
        }
        if (z4) {
            aVar.e(true);
        } else {
            aVar.e(false);
        }
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().d(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (u0.G(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.s(requireContext(), getTheme());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        androidx.lifecycle.z viewLifecycleOwnerLiveData = getViewLifecycleOwnerLiveData();
        androidx.lifecycle.b0 b0Var = this.mObserver;
        viewLifecycleOwnerLiveData.getClass();
        androidx.lifecycle.z.a("removeObserver");
        androidx.lifecycle.y yVar = (androidx.lifecycle.y) viewLifecycleOwnerLiveData.f878b.b(b0Var);
        if (yVar == null) {
            return;
        }
        yVar.c();
        yVar.b(false);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (u0.G(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        g(true, true, false);
    }

    public View onFindViewById(int i4) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i4);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z4 = this.mShowsDialog;
        if (z4 && !this.mCreatingDialog) {
            if (z4 && !this.mDialogCreated) {
                try {
                    this.mCreatingDialog = true;
                    Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                    this.mDialog = dialogOnCreateDialog;
                    if (this.mShowsDialog) {
                        setupDialog(dialogOnCreateDialog, this.mStyle);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.mDialog.setOwnerActivity((Activity) context);
                        }
                        this.mDialog.setCancelable(this.mCancelable);
                        this.mDialog.setOnCancelListener(this.mOnCancelListener);
                        this.mDialog.setOnDismissListener(this.mOnDismissListener);
                        this.mDialogCreated = true;
                    } else {
                        this.mDialog = null;
                    }
                    this.mCreatingDialog = false;
                } catch (Throwable th) {
                    this.mCreatingDialog = false;
                    throw th;
                }
            }
            if (u0.G(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (u0.G(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.mShowsDialog) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterOnGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i4 = this.mStyle;
        if (i4 != 0) {
            bundle.putInt(SAVED_STYLE, i4);
        }
        int i5 = this.mTheme;
        if (i5 != 0) {
            bundle.putInt(SAVED_THEME, i5);
        }
        boolean z4 = this.mCancelable;
        if (!z4) {
            bundle.putBoolean(SAVED_CANCELABLE, z4);
        }
        boolean z5 = this.mShowsDialog;
        if (!z5) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z5);
        }
        int i6 = this.mBackStackId;
        if (i6 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i6);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z4) {
        this.mCancelable = z4;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z4);
        }
    }

    public void setShowsDialog(boolean z4) {
        this.mShowsDialog = z4;
    }

    public void setStyle(int i4, int i5) {
        if (u0.G(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i4 + ", " + i5);
        }
        this.mStyle = i4;
        if (i4 == 2 || i4 == 3) {
            this.mTheme = android.R.style.Theme.Panel;
        }
        if (i5 != 0) {
            this.mTheme = i5;
        }
    }

    public void setupDialog(Dialog dialog, int i4) {
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(u0 u0Var, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        u0Var.getClass();
        a aVar = new a(u0Var);
        aVar.f664o = true;
        aVar.c(0, this, str, 1);
        aVar.e(false);
    }

    public void showNow(u0 u0Var, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        u0Var.getClass();
        a aVar = new a(u0Var);
        aVar.f664o = true;
        aVar.c(0, this, str, 1);
        if (aVar.f657g) {
            q.j("This transaction is already being added to the back stack");
        } else {
            aVar.f633p.y(aVar, false);
        }
    }

    public int show(c1 c1Var, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        c1Var.c(0, this, str, 1);
        this.mViewDestroyed = false;
        int iE = ((a) c1Var).e(false);
        this.mBackStackId = iE;
        return iE;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
