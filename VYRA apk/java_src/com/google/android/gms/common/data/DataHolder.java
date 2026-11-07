package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.fragment.app.q;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.sqlite.CursorWrapper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();
    private static final Builder zaf = new zab(new String[0], null);

    @SafeParcelable.VersionField(id = 1000)
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;
    boolean zae;

    @SafeParcelable.Field(getter = "getColumns", id = 1)
    private final String[] zag;

    @SafeParcelable.Field(getter = "getWindows", id = 2)
    private final CursorWindow[] zah;

    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int zai;

    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    private final Bundle zaj;
    private boolean zak;

    public DataHolder(Cursor cursor, int i4, Bundle bundle) {
        int startPosition;
        CursorWrapper cursorWrapper = new CursorWrapper(cursor);
        String[] columnNames = cursorWrapper.getColumnNames();
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                startPosition = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                startPosition = window.getNumRows();
            }
            while (startPosition < count && cursorWrapper.moveToPosition(startPosition)) {
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(startPosition);
                    cursorWrapper.fillWindow(startPosition, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                startPosition = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
            this(columnNames, (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]), i4, bundle);
        } catch (Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @KeepForSdk
    public static Builder builder(String[] strArr) {
        return new Builder(strArr, null, 0 == true ? 1 : 0);
    }

    @KeepForSdk
    public static DataHolder empty(int i4) {
        return new DataHolder(zaf, i4, (Bundle) null);
    }

    private final void zae(String str, int i4) {
        Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            q.q("No such column: ".concat(String.valueOf(str)));
        } else if (isClosed()) {
            q.q("Buffer is closed.");
        } else if (i4 < 0 || i4 >= this.zad) {
            throw new CursorIndexOutOfBoundsException(i4, this.zad);
        }
    }

    private static CursorWindow[] zaf(Builder builder, int i4) {
        if (builder.zaa.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayList = builder.zab;
        int size = arrayList.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow);
        cursorWindow.setNumColumns(builder.zaa.length);
        int i5 = 0;
        boolean z4 = false;
        while (i5 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    Log.d("DataHolder", "Allocating additional cursor window for large data set (row " + i5 + ")");
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i5);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                Map map = (Map) arrayList.get(i5);
                int i6 = 0;
                boolean zPutDouble = true;
                while (true) {
                    if (i6 >= builder.zaa.length) {
                        z4 = zPutDouble ? false : true;
                        i5++;
                    } else if (zPutDouble) {
                        String str = builder.zaa[i6];
                        Object obj = map.get(str);
                        if (obj == null) {
                            zPutDouble = cursorWindow.putNull(i5, i6);
                        } else if (obj instanceof String) {
                            zPutDouble = cursorWindow.putString((String) obj, i5, i6);
                        } else if (obj instanceof Long) {
                            zPutDouble = cursorWindow.putLong(((Long) obj).longValue(), i5, i6);
                        } else if (obj instanceof Integer) {
                            zPutDouble = cursorWindow.putLong(((Integer) obj).intValue(), i5, i6);
                        } else if (obj instanceof Boolean) {
                            zPutDouble = cursorWindow.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i5, i6);
                        } else if (obj instanceof byte[]) {
                            zPutDouble = cursorWindow.putBlob((byte[]) obj, i5, i6);
                        } else if (obj instanceof Double) {
                            zPutDouble = cursorWindow.putDouble(((Double) obj).doubleValue(), i5, i6);
                        } else {
                            if (!(obj instanceof Float)) {
                                throw new IllegalArgumentException("Unsupported object for column " + str + ": " + obj.toString());
                            }
                            zPutDouble = cursorWindow.putDouble(((Float) obj).floatValue(), i5, i6);
                        }
                        i6++;
                    }
                    if (z4) {
                        throw new zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                    }
                    Log.d("DataHolder", "Couldn't populate window data for row " + i5 + " - allocating new window.");
                    cursorWindow.freeLastRow();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i5);
                    cursorWindow.setNumColumns(builder.zaa.length);
                    arrayList2.add(cursorWindow);
                    i5--;
                    i5++;
                }
            } catch (RuntimeException e5) {
                int size2 = arrayList2.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    ((CursorWindow) arrayList2.get(i7)).close();
                }
                throw e5;
            }
        }
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            try {
                if (!this.zae) {
                    this.zae = true;
                    int i4 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.zah;
                        if (i4 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i4].close();
                        i4++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            if (this.zak && this.zah.length > 0 && !isClosed()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public boolean getBoolean(String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getLong(i4, this.zab.getInt(str)) == 1;
    }

    @KeepForSdk
    public byte[] getByteArray(String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getBlob(i4, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getCount() {
        return this.zad;
    }

    @KeepForSdk
    public int getInteger(String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getInt(i4, this.zab.getInt(str));
    }

    @KeepForSdk
    public long getLong(String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getLong(i4, this.zab.getInt(str));
    }

    @KeepForSdk
    public Bundle getMetadata() {
        return this.zaj;
    }

    @KeepForSdk
    public int getStatusCode() {
        return this.zai;
    }

    @KeepForSdk
    public String getString(String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getString(i4, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getWindowIndex(int i4) {
        int length;
        int i5 = 0;
        Preconditions.checkState(i4 >= 0 && i4 < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i5 >= length) {
                break;
            }
            if (i4 < iArr[i5]) {
                i5--;
                break;
            }
            i5++;
        }
        return i5 == length ? i5 - 1 : i5;
    }

    @KeepForSdk
    public boolean hasColumn(String str) {
        return this.zab.containsKey(str);
    }

    @KeepForSdk
    public boolean hasNull(String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].isNull(i4, this.zab.getInt(str));
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z4;
        synchronized (this) {
            z4 = this.zae;
        }
        return z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        String[] strArr = this.zag;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, strArr, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zah, i4, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i4 & 1) != 0) {
            close();
        }
    }

    public final double zaa(String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getDouble(i4, this.zab.getInt(str));
    }

    public final float zab(String str, int i4, int i5) {
        zae(str, i4);
        return this.zah[i5].getFloat(i4, this.zab.getInt(str));
    }

    public final void zac(String str, int i4, int i5, CharArrayBuffer charArrayBuffer) {
        zae(str, i4);
        this.zah[i5].copyStringToBuffer(i4, this.zab.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.zab = new Bundle();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr = this.zag;
            if (i5 >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i5], i5);
            i5++;
        }
        this.zac = new int[this.zah.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zah;
            if (i4 >= cursorWindowArr.length) {
                this.zad = numRows;
                return;
            }
            this.zac[i4] = numRows;
            numRows += this.zah[i4].getNumRows() - (numRows - cursorWindowArr[i4].getStartPosition());
            i4++;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    @KeepForSdk
    public static class Builder {
        private final String[] zaa;
        private final ArrayList zab = new ArrayList();
        private final HashMap zac = new HashMap();

        public /* synthetic */ Builder(String[] strArr, String str, zac zacVar) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        @KeepForSdk
        public DataHolder build(int i4, Bundle bundle) {
            return new DataHolder(this, i4, bundle);
        }

        @KeepForSdk
        public Builder withRow(ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap map = new HashMap(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return zaa(map);
        }

        public Builder zaa(HashMap map) {
            Asserts.checkNotNull(map);
            this.zab.add(map);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @KeepForSdk
        public DataHolder build(int i4) {
            return new DataHolder(this, i4);
        }
    }

    @SafeParcelable.Constructor
    public DataHolder(@SafeParcelable.Param(id = 1000) int i4, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i5, @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = i4;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i5;
        this.zaj = bundle;
    }

    @KeepForSdk
    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i4, Bundle bundle) {
        this.zae = false;
        this.zak = true;
        this.zaa = 1;
        this.zag = (String[]) Preconditions.checkNotNull(strArr);
        this.zah = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zai = i4;
        this.zaj = bundle;
        zad();
    }

    private DataHolder(Builder builder, int i4, Bundle bundle) {
        this(builder.zaa, zaf(builder, -1), i4, (Bundle) null);
    }
}
