package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import r1.a;
import r1.b;
import r1.c;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarG = remoteActionCompat.f485a;
        boolean z4 = true;
        if (aVar.e(1)) {
            cVarG = aVar.g();
        }
        remoteActionCompat.f485a = (IconCompat) cVarG;
        CharSequence charSequence = remoteActionCompat.f486b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f3499e);
        }
        remoteActionCompat.f486b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f487c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f3499e);
        }
        remoteActionCompat.f487c = charSequence2;
        remoteActionCompat.f488d = (PendingIntent) aVar.f(remoteActionCompat.f488d, 4);
        boolean z5 = remoteActionCompat.f489e;
        if (aVar.e(5)) {
            z5 = ((b) aVar).f3499e.readInt() != 0;
        }
        remoteActionCompat.f489e = z5;
        boolean z6 = remoteActionCompat.f;
        if (!aVar.e(6)) {
            z4 = z6;
        } else if (((b) aVar).f3499e.readInt() == 0) {
            z4 = false;
        }
        remoteActionCompat.f = z4;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f485a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f486b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f3499e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f487c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f488d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z4 = remoteActionCompat.f489e;
        aVar.h(5);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z5 = remoteActionCompat.f;
        aVar.h(6);
        parcel.writeInt(z5 ? 1 : 0);
    }
}
