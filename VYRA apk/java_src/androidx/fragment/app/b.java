package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f639a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f639a) {
            case 0:
                return new BackStackRecordState(parcel);
            case 1:
                return new BackStackState(parcel);
            case 2:
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
                fragmentManager$LaunchedFragmentInfo.f = parcel.readString();
                fragmentManager$LaunchedFragmentInfo.f614g = parcel.readInt();
                return fragmentManager$LaunchedFragmentInfo;
            case 3:
                FragmentManagerState fragmentManagerState = new FragmentManagerState();
                fragmentManagerState.f618j = null;
                fragmentManagerState.f619k = new ArrayList();
                fragmentManagerState.f620l = new ArrayList();
                fragmentManagerState.f = parcel.createStringArrayList();
                fragmentManagerState.f615g = parcel.createStringArrayList();
                fragmentManagerState.f616h = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
                fragmentManagerState.f617i = parcel.readInt();
                fragmentManagerState.f618j = parcel.readString();
                fragmentManagerState.f619k = parcel.createStringArrayList();
                fragmentManagerState.f620l = parcel.createTypedArrayList(BackStackState.CREATOR);
                fragmentManagerState.f621m = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
                return fragmentManagerState;
            default:
                return new FragmentState(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f639a) {
            case 0:
                return new BackStackRecordState[i4];
            case 1:
                return new BackStackState[i4];
            case 2:
                return new FragmentManager$LaunchedFragmentInfo[i4];
            case 3:
                return new FragmentManagerState[i4];
            default:
                return new FragmentState[i4];
        }
    }
}
