package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new b(3);
    public ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public BackStackRecordState[] f616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f621m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.f);
        parcel.writeStringList(this.f615g);
        parcel.writeTypedArray(this.f616h, i4);
        parcel.writeInt(this.f617i);
        parcel.writeString(this.f618j);
        parcel.writeStringList(this.f619k);
        parcel.writeTypedList(this.f620l);
        parcel.writeTypedList(this.f621m);
    }
}
