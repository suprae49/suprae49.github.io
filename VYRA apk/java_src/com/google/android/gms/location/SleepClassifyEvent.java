package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "SleepClassifyEventCreator")
public class SleepClassifyEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new zzao();

    @SafeParcelable.Field(getter = "getTimestampSec", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getConfidence", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getMotion", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getLight", id = 4)
    private final int zzd;

    @SafeParcelable.Field(getter = "getNoise", id = 5)
    private final int zze;

    @SafeParcelable.Field(getter = "getLightDiff", id = 6)
    private final int zzf;

    @SafeParcelable.Field(getter = "getNightOrDay", id = 7)
    private final int zzg;

    @SafeParcelable.Field(getter = "getConfidenceOverwrittenByAlarmClockTrigger", id = 8)
    private final boolean zzh;

    @SafeParcelable.Field(getter = "getPresenceConfidence", id = ConnectionResult.SERVICE_INVALID)
    private final int zzi;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public SleepClassifyEvent(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) int i5, @SafeParcelable.Param(id = 3) int i6, @SafeParcelable.Param(id = 4) int i7, @SafeParcelable.Param(id = 5) int i8, @SafeParcelable.Param(id = 6) int i9, @SafeParcelable.Param(id = 7) int i10, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = ConnectionResult.SERVICE_INVALID) int i11) {
        this.zza = i4;
        this.zzb = i5;
        this.zzc = i6;
        this.zzd = i7;
        this.zze = i8;
        this.zzf = i9;
        this.zzg = i10;
        this.zzh = z4;
        this.zzi = i11;
    }

    public static List<SleepClassifyEvent> extractEvents(Intent intent) {
        Preconditions.checkNotNull(intent);
        if (!hasEvents(intent)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            byte[] bArr = (byte[]) arrayList.get(i4);
            Preconditions.checkNotNull(bArr);
            arrayList2.add((SleepClassifyEvent) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean hasEvents(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        return this.zza == sleepClassifyEvent.zza && this.zzb == sleepClassifyEvent.zzb;
    }

    public int getConfidence() {
        return this.zzb;
    }

    public int getLight() {
        return this.zzd;
    }

    public int getMotion() {
        return this.zzc;
    }

    public long getTimestampMillis() {
        return ((long) this.zza) * 1000;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb));
    }

    public String toString() {
        int i4 = this.zza;
        int length = String.valueOf(i4).length();
        int i5 = this.zzb;
        int length2 = String.valueOf(i5).length();
        int i6 = this.zzc;
        int length3 = String.valueOf(i6).length();
        int i7 = this.zzd;
        StringBuilder sb = new StringBuilder(length + 6 + length2 + 8 + length3 + 7 + String.valueOf(i7).length());
        sb.append(i4);
        sb.append(" Conf:");
        sb.append(i5);
        sb.append(" Motion:");
        sb.append(i6);
        sb.append(" Light:");
        sb.append(i7);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        Preconditions.checkNotNull(parcel);
        int i5 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i5);
        SafeParcelWriter.writeInt(parcel, 2, getConfidence());
        SafeParcelWriter.writeInt(parcel, 3, getMotion());
        SafeParcelWriter.writeInt(parcel, 4, getLight());
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
