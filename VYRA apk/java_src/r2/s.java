package r2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout$SavedState;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3580a;

    public /* synthetic */ s(int i4) {
        this.f3580a = i4;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3580a) {
            case 0:
                return new ParcelableSparseArray(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return AbsSavedState.f526g;
                }
                androidx.fragment.app.q.j("superState must be null");
                return null;
            default:
                return new DrawerLayout$SavedState(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f3580a) {
            case 0:
                return new ParcelableSparseArray[i4];
            case 1:
                return new AbsSavedState[i4];
            default:
                return new DrawerLayout$SavedState[i4];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f3580a) {
            case 0:
                return new ParcelableSparseArray(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.f526g;
                }
                androidx.fragment.app.q.j("superState must be null");
                return null;
            default:
                return new DrawerLayout$SavedState(parcel, classLoader);
        }
    }
}
