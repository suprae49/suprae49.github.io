package com.google.android.gms.common.data;

import androidx.fragment.app.q;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa;
    private ArrayList zab;

    @KeepForSdk
    public EntityBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            try {
                if (!this.zaa) {
                    int count = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                    ArrayList arrayList = new ArrayList();
                    this.zab = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                        String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                        for (int i4 = 1; i4 < count; i4++) {
                            int windowIndex = this.mDataHolder.getWindowIndex(i4);
                            String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i4, windowIndex);
                            if (string2 == null) {
                                throw new NullPointerException("Missing value for markerColumn: " + primaryDataMarkerColumn + ", at row: " + i4 + ", for window: " + windowIndex);
                            }
                            if (!string2.equals(string)) {
                                this.zab.add(Integer.valueOf(i4));
                                string = string2;
                            }
                        }
                    }
                    this.zaa = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public final T get(int i4) {
        int iIntValue;
        int iIntValue2;
        zab();
        int iZaa = zaa(i4);
        int i5 = 0;
        if (i4 >= 0 && i4 != this.zab.size()) {
            if (i4 == this.zab.size() - 1) {
                iIntValue = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                iIntValue2 = ((Integer) this.zab.get(i4)).intValue();
            } else {
                iIntValue = ((Integer) this.zab.get(i4 + 1)).intValue();
                iIntValue2 = ((Integer) this.zab.get(i4)).intValue();
            }
            int i6 = iIntValue - iIntValue2;
            if (i6 == 1) {
                int iZaa2 = zaa(i4);
                int windowIndex = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(iZaa2);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, iZaa2, windowIndex) != null) {
                    i5 = 1;
                }
            } else {
                i5 = i6;
            }
        }
        return getEntry(iZaa, i5);
    }

    @KeepForSdk
    public String getChildDataMarkerColumn() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        zab();
        return this.zab.size();
    }

    @KeepForSdk
    public abstract T getEntry(int i4, int i5);

    @KeepForSdk
    public abstract String getPrimaryDataMarkerColumn();

    public final int zaa(int i4) {
        if (i4 >= 0 && i4 < this.zab.size()) {
            return ((Integer) this.zab.get(i4)).intValue();
        }
        q.k("Position ", i4, " is out of bounds for this buffer");
        return 0;
    }
}
