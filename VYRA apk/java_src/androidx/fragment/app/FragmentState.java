package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new b(4);
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f628m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bundle f629o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bundle f632r;

    public FragmentState(Parcel parcel) {
        this.f = parcel.readString();
        this.f622g = parcel.readString();
        this.f623h = parcel.readInt() != 0;
        this.f624i = parcel.readInt();
        this.f625j = parcel.readInt();
        this.f626k = parcel.readString();
        this.f627l = parcel.readInt() != 0;
        this.f628m = parcel.readInt() != 0;
        this.n = parcel.readInt() != 0;
        this.f629o = parcel.readBundle();
        this.f630p = parcel.readInt() != 0;
        this.f632r = parcel.readBundle();
        this.f631q = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f);
        sb.append(" (");
        sb.append(this.f622g);
        sb.append(")}:");
        if (this.f623h) {
            sb.append(" fromLayout");
        }
        int i4 = this.f625j;
        if (i4 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i4));
        }
        String str = this.f626k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f627l) {
            sb.append(" retainInstance");
        }
        if (this.f628m) {
            sb.append(" removing");
        }
        if (this.n) {
            sb.append(" detached");
        }
        if (this.f630p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f);
        parcel.writeString(this.f622g);
        parcel.writeInt(this.f623h ? 1 : 0);
        parcel.writeInt(this.f624i);
        parcel.writeInt(this.f625j);
        parcel.writeString(this.f626k);
        parcel.writeInt(this.f627l ? 1 : 0);
        parcel.writeInt(this.f628m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeBundle(this.f629o);
        parcel.writeInt(this.f630p ? 1 : 0);
        parcel.writeBundle(this.f632r);
        parcel.writeInt(this.f631q);
    }

    public FragmentState(Fragment fragment) {
        this.f = fragment.getClass().getName();
        this.f622g = fragment.mWho;
        this.f623h = fragment.mFromLayout;
        this.f624i = fragment.mFragmentId;
        this.f625j = fragment.mContainerId;
        this.f626k = fragment.mTag;
        this.f627l = fragment.mRetainInstance;
        this.f628m = fragment.mRemoving;
        this.n = fragment.mDetached;
        this.f629o = fragment.mArguments;
        this.f630p = fragment.mHidden;
        this.f631q = fragment.mMaxState.ordinal();
    }
}
