package androidx.fragment.app;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c1 implements s0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u0 f633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f635r;

    public a(u0 u0Var) {
        u0Var.D();
        h0 h0Var = u0Var.f766t;
        if (h0Var != null) {
            h0Var.f696g.getClassLoader();
        }
        this.f652a = new ArrayList();
        this.f664o = false;
        this.f635r = -1;
        this.f633p = u0Var;
    }

    @Override // androidx.fragment.app.s0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (u0.G(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f657g) {
            return true;
        }
        u0 u0Var = this.f633p;
        if (u0Var.f752d == null) {
            u0Var.f752d = new ArrayList();
        }
        u0Var.f752d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.c1
    public final void c(int i4, Fragment fragment, String str, int i5) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            d1.c.c(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(fragment);
                String str4 = fragment.mTag;
                sb.append(": was ");
                sb.append(str4);
                sb.append(" now ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
            fragment.mTag = str;
        }
        if (i4 != 0) {
            if (i4 == -1) {
                q.n("Can't add fragment ", fragment, " with tag ", str, " to container view with no id");
                return;
            }
            int i6 = fragment.mFragmentId;
            if (i6 != 0 && i6 != i4) {
                StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                sb2.append(fragment);
                int i7 = fragment.mFragmentId;
                sb2.append(": was ");
                sb2.append(i7);
                sb2.append(" now ");
                sb2.append(i4);
                throw new IllegalStateException(sb2.toString());
            }
            fragment.mFragmentId = i4;
            fragment.mContainerId = i4;
        }
        b(new b1(fragment, i5));
        fragment.mFragmentManager = this.f633p;
    }

    public final void d(int i4) {
        ArrayList arrayList = this.f652a;
        if (this.f657g) {
            if (u0.G(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i4);
            }
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                b1 b1Var = (b1) arrayList.get(i5);
                Fragment fragment = b1Var.f641b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i4;
                    if (u0.G(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + b1Var.f641b + " to " + b1Var.f641b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final int e(boolean z4) {
        if (this.f634q) {
            q.j("commit already called");
            return 0;
        }
        if (u0.G(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new m1());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f634q = true;
        boolean z5 = this.f657g;
        u0 u0Var = this.f633p;
        if (z5) {
            this.f635r = u0Var.f756i.getAndIncrement();
        } else {
            this.f635r = -1;
        }
        u0Var.v(this, z4);
        return this.f635r;
    }

    public final void f(String str, PrintWriter printWriter, boolean z4) {
        String str2;
        ArrayList arrayList = this.f652a;
        if (z4) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f658h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f635r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f634q);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.f653b != 0 || this.f654c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f653b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f654c));
            }
            if (this.f655d != 0 || this.f656e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f655d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f656e));
            }
            if (this.f659i != 0 || this.f660j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f659i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f660j);
            }
            if (this.f661k != 0 || this.f662l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f661k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f662l);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            b1 b1Var = (b1) arrayList.get(i4);
            switch (b1Var.f640a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + b1Var.f640a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i4);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(b1Var.f641b);
            if (z4) {
                if (b1Var.f643d != 0 || b1Var.f644e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(b1Var.f643d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(b1Var.f644e));
                }
                if (b1Var.f != 0 || b1Var.f645g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(b1Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(b1Var.f645g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f635r >= 0) {
            sb.append(" #");
            sb.append(this.f635r);
        }
        if (this.f658h != null) {
            sb.append(" ");
            sb.append(this.f658h);
        }
        sb.append("}");
        return sb.toString();
    }
}
