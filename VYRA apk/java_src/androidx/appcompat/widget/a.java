package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f405a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f405a) {
            case 0:
                ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
                actionMenuPresenter$SavedState.f = parcel.readInt();
                return actionMenuPresenter$SavedState;
            default:
                AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(parcel);
                appCompatSpinner$SavedState.f = parcel.readByte() != 0;
                return appCompatSpinner$SavedState;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f405a) {
            case 0:
                return new ActionMenuPresenter$SavedState[i4];
            default:
                return new AppCompatSpinner$SavedState[i4];
        }
    }
}
