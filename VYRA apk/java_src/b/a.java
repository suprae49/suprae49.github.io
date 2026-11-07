package b;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.badge.BadgeState$State;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f975a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f975a) {
            case 0:
                parcel.getClass();
                return new ActivityResult(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 1:
                parcel.getClass();
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new IntentSenderRequest((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 2:
                BadgeState$State badgeState$State = new BadgeState$State();
                badgeState$State.n = 255;
                badgeState$State.f1263p = -2;
                badgeState$State.f1264q = -2;
                badgeState$State.f1265r = -2;
                badgeState$State.f1272y = Boolean.TRUE;
                badgeState$State.f = parcel.readInt();
                badgeState$State.f1255g = (Integer) parcel.readSerializable();
                badgeState$State.f1256h = (Integer) parcel.readSerializable();
                badgeState$State.f1257i = (Integer) parcel.readSerializable();
                badgeState$State.f1258j = (Integer) parcel.readSerializable();
                badgeState$State.f1259k = (Integer) parcel.readSerializable();
                badgeState$State.f1260l = (Integer) parcel.readSerializable();
                badgeState$State.f1261m = (Integer) parcel.readSerializable();
                badgeState$State.n = parcel.readInt();
                badgeState$State.f1262o = parcel.readString();
                badgeState$State.f1263p = parcel.readInt();
                badgeState$State.f1264q = parcel.readInt();
                badgeState$State.f1265r = parcel.readInt();
                badgeState$State.f1267t = parcel.readString();
                badgeState$State.f1268u = parcel.readString();
                badgeState$State.f1269v = parcel.readInt();
                badgeState$State.f1271x = (Integer) parcel.readSerializable();
                badgeState$State.f1273z = (Integer) parcel.readSerializable();
                badgeState$State.A = (Integer) parcel.readSerializable();
                badgeState$State.B = (Integer) parcel.readSerializable();
                badgeState$State.C = (Integer) parcel.readSerializable();
                badgeState$State.D = (Integer) parcel.readSerializable();
                badgeState$State.E = (Integer) parcel.readSerializable();
                badgeState$State.H = (Integer) parcel.readSerializable();
                badgeState$State.F = (Integer) parcel.readSerializable();
                badgeState$State.G = (Integer) parcel.readSerializable();
                badgeState$State.f1272y = (Boolean) parcel.readSerializable();
                badgeState$State.f1266s = (Locale) parcel.readSerializable();
                badgeState$State.I = (Boolean) parcel.readSerializable();
                badgeState$State.J = (Integer) parcel.readSerializable();
                return badgeState$State;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.f975a) {
            case 0:
                return new ActivityResult[i4];
            case 1:
                return new IntentSenderRequest[i4];
            case 2:
                return new BadgeState$State[i4];
            default:
                return new ParcelImpl[i4];
        }
    }
}
