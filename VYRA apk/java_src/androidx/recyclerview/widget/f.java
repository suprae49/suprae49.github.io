package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager.SavedState savedState = new StaggeredGridLayoutManager.SavedState();
        savedState.f = parcel.readInt();
        savedState.f964g = parcel.readInt();
        int i4 = parcel.readInt();
        savedState.f965h = i4;
        if (i4 > 0) {
            int[] iArr = new int[i4];
            savedState.f966i = iArr;
            parcel.readIntArray(iArr);
        }
        int i5 = parcel.readInt();
        savedState.f967j = i5;
        if (i5 > 0) {
            int[] iArr2 = new int[i5];
            savedState.f968k = iArr2;
            parcel.readIntArray(iArr2);
        }
        savedState.f970m = parcel.readInt() == 1;
        savedState.n = parcel.readInt() == 1;
        savedState.f971o = parcel.readInt() == 1;
        savedState.f969l = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new StaggeredGridLayoutManager.SavedState[i4];
    }
}
