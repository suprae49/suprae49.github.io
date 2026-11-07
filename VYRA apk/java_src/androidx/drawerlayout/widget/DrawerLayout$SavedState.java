package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import r2.s;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout$SavedState extends AbsSavedState {
    public static final Parcelable.Creator<DrawerLayout$SavedState> CREATOR = new s(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f530k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f531l;

    public DrawerLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f527h = 0;
        this.f527h = parcel.readInt();
        this.f528i = parcel.readInt();
        this.f529j = parcel.readInt();
        this.f530k = parcel.readInt();
        this.f531l = parcel.readInt();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f527h);
        parcel.writeInt(this.f528i);
        parcel.writeInt(this.f529j);
        parcel.writeInt(this.f530k);
        parcel.writeInt(this.f531l);
    }
}
