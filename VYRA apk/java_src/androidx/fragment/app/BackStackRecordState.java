package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new b(0);
    public final int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f604m;
    public final CharSequence n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f605o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CharSequence f606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f609s;

    public BackStackRecordState(a aVar) {
        int size = aVar.f652a.size();
        this.f = new int[size * 6];
        if (!aVar.f657g) {
            q.j("Not on back stack");
            throw null;
        }
        this.f598g = new ArrayList(size);
        this.f599h = new int[size];
        this.f600i = new int[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            b1 b1Var = (b1) aVar.f652a.get(i5);
            int i6 = i4 + 1;
            this.f[i4] = b1Var.f640a;
            ArrayList arrayList = this.f598g;
            Fragment fragment = b1Var.f641b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f;
            iArr[i6] = b1Var.f642c ? 1 : 0;
            iArr[i4 + 2] = b1Var.f643d;
            iArr[i4 + 3] = b1Var.f644e;
            int i7 = i4 + 5;
            iArr[i4 + 4] = b1Var.f;
            i4 += 6;
            iArr[i7] = b1Var.f645g;
            this.f599h[i5] = b1Var.f646h.ordinal();
            this.f600i[i5] = b1Var.f647i.ordinal();
        }
        this.f601j = aVar.f;
        this.f602k = aVar.f658h;
        this.f603l = aVar.f635r;
        this.f604m = aVar.f659i;
        this.n = aVar.f660j;
        this.f605o = aVar.f661k;
        this.f606p = aVar.f662l;
        this.f607q = aVar.f663m;
        this.f608r = aVar.n;
        this.f609s = aVar.f664o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeIntArray(this.f);
        parcel.writeStringList(this.f598g);
        parcel.writeIntArray(this.f599h);
        parcel.writeIntArray(this.f600i);
        parcel.writeInt(this.f601j);
        parcel.writeString(this.f602k);
        parcel.writeInt(this.f603l);
        parcel.writeInt(this.f604m);
        TextUtils.writeToParcel(this.n, parcel, 0);
        parcel.writeInt(this.f605o);
        TextUtils.writeToParcel(this.f606p, parcel, 0);
        parcel.writeStringList(this.f607q);
        parcel.writeStringList(this.f608r);
        parcel.writeInt(this.f609s ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f = parcel.createIntArray();
        this.f598g = parcel.createStringArrayList();
        this.f599h = parcel.createIntArray();
        this.f600i = parcel.createIntArray();
        this.f601j = parcel.readInt();
        this.f602k = parcel.readString();
        this.f603l = parcel.readInt();
        this.f604m = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.n = (CharSequence) creator.createFromParcel(parcel);
        this.f605o = parcel.readInt();
        this.f606p = (CharSequence) creator.createFromParcel(parcel);
        this.f607q = parcel.createStringArrayList();
        this.f608r = parcel.createStringArrayList();
        this.f609s = parcel.readInt() != 0;
    }
}
