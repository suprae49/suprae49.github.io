package r1;

import android.os.Parcel;
import android.util.SparseIntArray;
import p.f;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f3498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f3499e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3504k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new f(0), new f(0), new f(0));
    }

    @Override // r1.a
    public final b a() {
        Parcel parcel = this.f3499e;
        int iDataPosition = parcel.dataPosition();
        int i4 = this.f3503j;
        if (i4 == this.f) {
            i4 = this.f3500g;
        }
        return new b(parcel, iDataPosition, i4, this.f3501h + "  ", this.f3495a, this.f3496b, this.f3497c);
    }

    @Override // r1.a
    public final boolean e(int i4) {
        while (true) {
            int i5 = this.f3503j;
            int i6 = this.f3504k;
            if (i5 >= this.f3500g) {
                return i6 == i4;
            }
            if (i6 == i4) {
                return true;
            }
            if (String.valueOf(i6).compareTo(String.valueOf(i4)) > 0) {
                return false;
            }
            int i7 = this.f3503j;
            Parcel parcel = this.f3499e;
            parcel.setDataPosition(i7);
            int i8 = parcel.readInt();
            this.f3504k = parcel.readInt();
            this.f3503j += i8;
        }
    }

    @Override // r1.a
    public final void h(int i4) {
        int i5 = this.f3502i;
        SparseIntArray sparseIntArray = this.f3498d;
        Parcel parcel = this.f3499e;
        if (i5 >= 0) {
            int i6 = sparseIntArray.get(i5);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i6);
            parcel.writeInt(iDataPosition - i6);
            parcel.setDataPosition(iDataPosition);
        }
        this.f3502i = i4;
        sparseIntArray.put(i4, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i4);
    }

    public b(Parcel parcel, int i4, int i5, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.f3498d = new SparseIntArray();
        this.f3502i = -1;
        this.f3504k = -1;
        this.f3499e = parcel;
        this.f = i4;
        this.f3500g = i5;
        this.f3503j = i4;
        this.f3501h = str;
    }
}
