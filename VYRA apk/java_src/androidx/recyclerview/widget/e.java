package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f974b;

    public final void a() {
        int[] iArr = this.f973a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f974b = null;
    }

    public final void b(int i4) {
        int[] iArr = this.f973a;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i4, 10) + 1];
            this.f973a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int length = iArr.length;
            while (length <= i4) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f973a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.f973a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public final void c(int i4, int i5) {
        int[] iArr = this.f973a;
        if (iArr == null || i4 >= iArr.length) {
            return;
        }
        int i6 = i4 + i5;
        b(i6);
        int[] iArr2 = this.f973a;
        System.arraycopy(iArr2, i4, iArr2, i6, (iArr2.length - i4) - i5);
        Arrays.fill(this.f973a, i4, i6, -1);
        ArrayList arrayList = this.f974b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f974b.get(size);
            int i7 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f;
            if (i7 >= i4) {
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f = i7 + i5;
            }
        }
    }

    public final void d(int i4, int i5) {
        int[] iArr = this.f973a;
        if (iArr == null || i4 >= iArr.length) {
            return;
        }
        int i6 = i4 + i5;
        b(i6);
        int[] iArr2 = this.f973a;
        System.arraycopy(iArr2, i6, iArr2, i4, (iArr2.length - i4) - i5);
        int[] iArr3 = this.f973a;
        Arrays.fill(iArr3, iArr3.length - i5, iArr3.length, -1);
        ArrayList arrayList = this.f974b;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) this.f974b.get(size);
            int i7 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f;
            if (i7 >= i4) {
                if (i7 < i6) {
                    this.f974b.remove(size);
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f = i7 - i5;
                }
            }
        }
    }
}
