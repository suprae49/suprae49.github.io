package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f = parcel.readInt();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f961g = parcel.readInt();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f963i = parcel.readInt() == 1;
        int i4 = parcel.readInt();
        if (i4 > 0) {
            int[] iArr = new int[i4];
            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f962h = iArr;
            parcel.readIntArray(iArr);
        }
        return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i4];
    }
}
