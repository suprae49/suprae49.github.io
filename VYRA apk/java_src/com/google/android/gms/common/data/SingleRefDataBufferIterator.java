package com.google.android.gms.common.data;

import androidx.fragment.app.q;
import androidx.fragment.app.u;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private Object zac;

    public SingleRefDataBufferIterator(DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final Object next() {
        boolean zHasNext = hasNext();
        int i4 = this.zab;
        if (!zHasNext) {
            throw new NoSuchElementException(u.k(i4, "Cannot advance the iterator beyond "));
        }
        int i5 = i4 + 1;
        this.zab = i5;
        if (i5 == 0) {
            Object objCheckNotNull = Preconditions.checkNotNull(this.zaa.get(0));
            this.zac = objCheckNotNull;
            if (!(objCheckNotNull instanceof DataBufferRef)) {
                q.j(u.m("DataBuffer reference of type ", String.valueOf(objCheckNotNull.getClass()), " is not movable"));
                return null;
            }
        } else {
            ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
        }
        return this.zac;
    }
}
