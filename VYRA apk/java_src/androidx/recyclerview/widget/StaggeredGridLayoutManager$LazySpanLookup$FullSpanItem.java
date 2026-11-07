package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new d();
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f962h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f963i;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f + ", mGapDir=" + this.f961g + ", mHasUnwantedGapAfter=" + this.f963i + ", mGapPerSpan=" + Arrays.toString(this.f962h) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f);
        parcel.writeInt(this.f961g);
        parcel.writeInt(this.f963i ? 1 : 0);
        int[] iArr = this.f962h;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f962h);
        }
    }
}
