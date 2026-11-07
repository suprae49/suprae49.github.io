package com.google.android.material.badge;

import android.os.Parcel;
import android.os.Parcelable;
import b.a;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class BadgeState$State implements Parcelable {
    public static final Parcelable.Creator<BadgeState$State> CREATOR = new a(2);
    public Integer A;
    public Integer B;
    public Integer C;
    public Integer D;
    public Integer E;
    public Integer F;
    public Integer G;
    public Integer H;
    public Boolean I;
    public Integer J;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f1255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f1256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f1257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f1258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Integer f1259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Integer f1260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f1261m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f1262o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1263p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1264q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1265r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Locale f1266s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f1267t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f1268u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1269v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1270w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f1271x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f1272y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Integer f1273z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f);
        parcel.writeSerializable(this.f1255g);
        parcel.writeSerializable(this.f1256h);
        parcel.writeSerializable(this.f1257i);
        parcel.writeSerializable(this.f1258j);
        parcel.writeSerializable(this.f1259k);
        parcel.writeSerializable(this.f1260l);
        parcel.writeSerializable(this.f1261m);
        parcel.writeInt(this.n);
        parcel.writeString(this.f1262o);
        parcel.writeInt(this.f1263p);
        parcel.writeInt(this.f1264q);
        parcel.writeInt(this.f1265r);
        CharSequence charSequence = this.f1267t;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.f1268u;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.f1269v);
        parcel.writeSerializable(this.f1271x);
        parcel.writeSerializable(this.f1273z);
        parcel.writeSerializable(this.A);
        parcel.writeSerializable(this.B);
        parcel.writeSerializable(this.C);
        parcel.writeSerializable(this.D);
        parcel.writeSerializable(this.E);
        parcel.writeSerializable(this.H);
        parcel.writeSerializable(this.F);
        parcel.writeSerializable(this.G);
        parcel.writeSerializable(this.f1272y);
        parcel.writeSerializable(this.f1266s);
        parcel.writeSerializable(this.I);
        parcel.writeSerializable(this.J);
    }
}
