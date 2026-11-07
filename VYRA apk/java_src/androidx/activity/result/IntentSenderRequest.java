package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import b.a;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a(1);
    public final IntentSender f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Intent f250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f252i;

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i4, int i5) {
        this.f = intentSender;
        this.f250g = intent;
        this.f251h = i4;
        this.f252i = i5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.getClass();
        parcel.writeParcelable(this.f, i4);
        parcel.writeParcelable(this.f250g, i4);
        parcel.writeInt(this.f251h);
        parcel.writeInt(this.f252i);
    }
}
