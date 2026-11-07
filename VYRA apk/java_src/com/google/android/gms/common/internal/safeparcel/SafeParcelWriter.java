package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static int beginObjectHeader(Parcel parcel) {
        return zza(parcel, 20293);
    }

    public static void finishObjectHeader(Parcel parcel, int i4) {
        zzb(parcel, i4);
    }

    public static void writeBigDecimal(Parcel parcel, int i4, BigDecimal bigDecimal, boolean z4) {
        if (bigDecimal == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            zzb(parcel, iZza);
        }
    }

    public static void writeBigDecimalArray(Parcel parcel, int i4, BigDecimal[] bigDecimalArr, boolean z4) {
        if (bigDecimalArr == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i5 = 0; i5 < length; i5++) {
            parcel.writeByteArray(bigDecimalArr[i5].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i5].scale());
        }
        zzb(parcel, iZza);
    }

    public static void writeBigInteger(Parcel parcel, int i4, BigInteger bigInteger, boolean z4) {
        if (bigInteger == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeByteArray(bigInteger.toByteArray());
            zzb(parcel, iZza);
        }
    }

    public static void writeBigIntegerArray(Parcel parcel, int i4, BigInteger[] bigIntegerArr, boolean z4) {
        if (bigIntegerArr == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        zzb(parcel, iZza);
    }

    public static void writeBoolean(Parcel parcel, int i4, boolean z4) {
        zzc(parcel, i4, 4);
        parcel.writeInt(z4 ? 1 : 0);
    }

    public static void writeBooleanArray(Parcel parcel, int i4, boolean[] zArr, boolean z4) {
        if (zArr == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeBooleanArray(zArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeBooleanList(Parcel parcel, int i4, List<Boolean> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(list.get(i5).booleanValue() ? 1 : 0);
        }
        zzb(parcel, iZza);
    }

    public static void writeBooleanObject(Parcel parcel, int i4, Boolean bool, boolean z4) {
        if (bool != null) {
            zzc(parcel, i4, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z4) {
            zzc(parcel, i4, 0);
        }
    }

    public static void writeBundle(Parcel parcel, int i4, Bundle bundle, boolean z4) {
        if (bundle == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeBundle(bundle);
            zzb(parcel, iZza);
        }
    }

    public static void writeByte(Parcel parcel, int i4, byte b5) {
        zzc(parcel, i4, 4);
        parcel.writeInt(b5);
    }

    public static void writeByteArray(Parcel parcel, int i4, byte[] bArr, boolean z4) {
        if (bArr == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeByteArray(bArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeByteArrayArray(Parcel parcel, int i4, byte[][] bArr, boolean z4) {
        if (bArr == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        zzb(parcel, iZza);
    }

    public static void writeByteArraySparseArray(Parcel parcel, int i4, SparseArray<byte[]> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeByteArray(sparseArray.valueAt(i5));
        }
        zzb(parcel, iZza);
    }

    public static void writeChar(Parcel parcel, int i4, char c4) {
        zzc(parcel, i4, 4);
        parcel.writeInt(c4);
    }

    public static void writeCharArray(Parcel parcel, int i4, char[] cArr, boolean z4) {
        if (cArr == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeCharArray(cArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeDouble(Parcel parcel, int i4, double d5) {
        zzc(parcel, i4, 8);
        parcel.writeDouble(d5);
    }

    public static void writeDoubleArray(Parcel parcel, int i4, double[] dArr, boolean z4) {
        if (dArr == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeDoubleArray(dArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeDoubleList(Parcel parcel, int i4, List<Double> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeDouble(list.get(i5).doubleValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeDoubleObject(Parcel parcel, int i4, Double d5, boolean z4) {
        if (d5 != null) {
            zzc(parcel, i4, 8);
            parcel.writeDouble(d5.doubleValue());
        } else if (z4) {
            zzc(parcel, i4, 0);
        }
    }

    public static void writeDoubleSparseArray(Parcel parcel, int i4, SparseArray<Double> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeDouble(sparseArray.valueAt(i5).doubleValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeFloat(Parcel parcel, int i4, float f) {
        zzc(parcel, i4, 4);
        parcel.writeFloat(f);
    }

    public static void writeFloatArray(Parcel parcel, int i4, float[] fArr, boolean z4) {
        if (fArr == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeFloatArray(fArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeFloatList(Parcel parcel, int i4, List<Float> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeFloat(list.get(i5).floatValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeFloatObject(Parcel parcel, int i4, Float f, boolean z4) {
        if (f != null) {
            zzc(parcel, i4, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z4) {
            zzc(parcel, i4, 0);
        }
    }

    public static void writeFloatSparseArray(Parcel parcel, int i4, SparseArray<Float> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeFloat(sparseArray.valueAt(i5).floatValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeIBinder(Parcel parcel, int i4, IBinder iBinder, boolean z4) {
        if (iBinder == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeStrongBinder(iBinder);
            zzb(parcel, iZza);
        }
    }

    public static void writeIBinderArray(Parcel parcel, int i4, IBinder[] iBinderArr, boolean z4) {
        if (iBinderArr == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeBinderArray(iBinderArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeIBinderList(Parcel parcel, int i4, List<IBinder> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeBinderList(list);
            zzb(parcel, iZza);
        }
    }

    public static void writeIBinderSparseArray(Parcel parcel, int i4, SparseArray<IBinder> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeStrongBinder(sparseArray.valueAt(i5));
        }
        zzb(parcel, iZza);
    }

    public static void writeInt(Parcel parcel, int i4, int i5) {
        zzc(parcel, i4, 4);
        parcel.writeInt(i5);
    }

    public static void writeIntArray(Parcel parcel, int i4, int[] iArr, boolean z4) {
        if (iArr == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeIntArray(iArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeIntegerList(Parcel parcel, int i4, List<Integer> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(list.get(i5).intValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeIntegerObject(Parcel parcel, int i4, Integer num, boolean z4) {
        if (num != null) {
            zzc(parcel, i4, 4);
            parcel.writeInt(num.intValue());
        } else if (z4) {
            zzc(parcel, i4, 0);
        }
    }

    public static void writeList(Parcel parcel, int i4, List list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeList(list);
            zzb(parcel, iZza);
        }
    }

    public static void writeLong(Parcel parcel, int i4, long j4) {
        zzc(parcel, i4, 8);
        parcel.writeLong(j4);
    }

    public static void writeLongArray(Parcel parcel, int i4, long[] jArr, boolean z4) {
        if (jArr == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeLongArray(jArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeLongList(Parcel parcel, int i4, List<Long> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeLong(list.get(i5).longValue());
        }
        zzb(parcel, iZza);
    }

    public static void writeLongObject(Parcel parcel, int i4, Long l4, boolean z4) {
        if (l4 != null) {
            zzc(parcel, i4, 8);
            parcel.writeLong(l4.longValue());
        } else if (z4) {
            zzc(parcel, i4, 0);
        }
    }

    public static void writeParcel(Parcel parcel, int i4, Parcel parcel2, boolean z4) {
        if (parcel2 == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            zzb(parcel, iZza);
        }
    }

    public static void writeParcelArray(Parcel parcel, int i4, Parcel[] parcelArr, boolean z4) {
        if (parcelArr == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        parcel.writeInt(parcelArr.length);
        for (Parcel parcel2 : parcelArr) {
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, iZza);
    }

    public static void writeParcelList(Parcel parcel, int i4, List<Parcel> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            Parcel parcel2 = list.get(i5);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, iZza);
    }

    public static void writeParcelSparseArray(Parcel parcel, int i4, SparseArray<Parcel> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            Parcel parcelValueAt = sparseArray.valueAt(i5);
            if (parcelValueAt != null) {
                parcel.writeInt(parcelValueAt.dataSize());
                parcel.appendFrom(parcelValueAt, 0, parcelValueAt.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        zzb(parcel, iZza);
    }

    public static void writeParcelable(Parcel parcel, int i4, Parcelable parcelable, int i5, boolean z4) {
        if (parcelable == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcelable.writeToParcel(parcel, i5);
            zzb(parcel, iZza);
        }
    }

    public static void writePendingIntent(Parcel parcel, int i4, PendingIntent pendingIntent, boolean z4) {
        if (pendingIntent == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            zzb(parcel, iZza);
        }
    }

    public static void writeShort(Parcel parcel, int i4, short s2) {
        zzc(parcel, i4, 4);
        parcel.writeInt(s2);
    }

    public static void writeSparseBooleanArray(Parcel parcel, int i4, SparseBooleanArray sparseBooleanArray, boolean z4) {
        if (sparseBooleanArray == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            zzb(parcel, iZza);
        }
    }

    public static void writeSparseIntArray(Parcel parcel, int i4, SparseIntArray sparseIntArray, boolean z4) {
        if (sparseIntArray == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseIntArray.keyAt(i5));
            parcel.writeInt(sparseIntArray.valueAt(i5));
        }
        zzb(parcel, iZza);
    }

    public static void writeSparseLongArray(Parcel parcel, int i4, SparseLongArray sparseLongArray, boolean z4) {
        if (sparseLongArray == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseLongArray.keyAt(i5));
            parcel.writeLong(sparseLongArray.valueAt(i5));
        }
        zzb(parcel, iZza);
    }

    public static void writeString(Parcel parcel, int i4, String str, boolean z4) {
        if (str == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeString(str);
            zzb(parcel, iZza);
        }
    }

    public static void writeStringArray(Parcel parcel, int i4, String[] strArr, boolean z4) {
        if (strArr == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeStringArray(strArr);
            zzb(parcel, iZza);
        }
    }

    public static void writeStringList(Parcel parcel, int i4, List<String> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i4, 0);
            }
        } else {
            int iZza = zza(parcel, i4);
            parcel.writeStringList(list);
            zzb(parcel, iZza);
        }
    }

    public static void writeStringSparseArray(Parcel parcel, int i4, SparseArray<String> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            parcel.writeString(sparseArray.valueAt(i5));
        }
        zzb(parcel, iZza);
    }

    public static <T extends Parcelable> void writeTypedArray(Parcel parcel, int i4, T[] tArr, int i5, boolean z4) {
        if (tArr == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        parcel.writeInt(tArr.length);
        for (T t4 : tArr) {
            if (t4 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t4, i5);
            }
        }
        zzb(parcel, iZza);
    }

    public static <T extends Parcelable> void writeTypedList(Parcel parcel, int i4, List<T> list, boolean z4) {
        if (list == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            T t4 = list.get(i5);
            if (t4 == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, t4, 0);
            }
        }
        zzb(parcel, iZza);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(Parcel parcel, int i4, SparseArray<T> sparseArray, boolean z4) {
        if (sparseArray == null) {
            if (z4) {
                zzc(parcel, i4, 0);
                return;
            }
            return;
        }
        int iZza = zza(parcel, i4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(sparseArray.keyAt(i5));
            T tValueAt = sparseArray.valueAt(i5);
            if (tValueAt == null) {
                parcel.writeInt(0);
            } else {
                zzd(parcel, tValueAt, 0);
            }
        }
        zzb(parcel, iZza);
    }

    private static int zza(Parcel parcel, int i4) {
        parcel.writeInt(i4 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void zzb(Parcel parcel, int i4) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i4 - 4);
        parcel.writeInt(iDataPosition - i4);
        parcel.setDataPosition(iDataPosition);
    }

    private static void zzc(Parcel parcel, int i4, int i5) {
        parcel.writeInt(i4 | (i5 << 16));
    }

    private static void zzd(Parcel parcel, Parcelable parcelable, int i4) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i4);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
