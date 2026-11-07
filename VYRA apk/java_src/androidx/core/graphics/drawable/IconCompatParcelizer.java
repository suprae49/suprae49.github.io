package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.q;
import java.nio.charset.Charset;
import r1.a;
import r1.b;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f496a = -1;
        byte[] bArr = null;
        iconCompat.f498c = null;
        iconCompat.f499d = null;
        iconCompat.f500e = 0;
        iconCompat.f = 0;
        iconCompat.f501g = null;
        iconCompat.f502h = IconCompat.f495k;
        iconCompat.f503i = null;
        iconCompat.f496a = !aVar.e(1) ? -1 : ((b) aVar).f3499e.readInt();
        byte[] bArr2 = iconCompat.f498c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f3499e;
            int i4 = parcel.readInt();
            if (i4 >= 0) {
                bArr = new byte[i4];
                parcel.readByteArray(bArr);
            }
        } else {
            bArr = bArr2;
        }
        iconCompat.f498c = bArr;
        iconCompat.f499d = aVar.f(iconCompat.f499d, 3);
        int i5 = iconCompat.f500e;
        if (aVar.e(4)) {
            i5 = ((b) aVar).f3499e.readInt();
        }
        iconCompat.f500e = i5;
        int i6 = iconCompat.f;
        if (aVar.e(5)) {
            i6 = ((b) aVar).f3499e.readInt();
        }
        iconCompat.f = i6;
        iconCompat.f501g = (ColorStateList) aVar.f(iconCompat.f501g, 6);
        String string = iconCompat.f503i;
        if (aVar.e(7)) {
            string = ((b) aVar).f3499e.readString();
        }
        iconCompat.f503i = string;
        String string2 = iconCompat.f504j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f3499e.readString();
        }
        iconCompat.f504j = string2;
        iconCompat.f502h = PorterDuff.Mode.valueOf(iconCompat.f503i);
        switch (iconCompat.f496a) {
            case -1:
                Parcelable parcelable = iconCompat.f499d;
                if (parcelable != null) {
                    iconCompat.f497b = parcelable;
                    return iconCompat;
                }
                q.q("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f499d;
                if (parcelable2 != null) {
                    iconCompat.f497b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f498c;
                iconCompat.f497b = bArr3;
                iconCompat.f496a = 3;
                iconCompat.f500e = 0;
                iconCompat.f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f498c, Charset.forName("UTF-16"));
                iconCompat.f497b = str;
                if (iconCompat.f496a == 2 && iconCompat.f504j == null) {
                    iconCompat.f504j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f497b = iconCompat.f498c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f503i = iconCompat.f502h.name();
        switch (iconCompat.f496a) {
            case -1:
                iconCompat.f499d = (Parcelable) iconCompat.f497b;
                break;
            case 1:
            case 5:
                iconCompat.f499d = (Parcelable) iconCompat.f497b;
                break;
            case 2:
                iconCompat.f498c = ((String) iconCompat.f497b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f498c = (byte[]) iconCompat.f497b;
                break;
            case 4:
            case 6:
                iconCompat.f498c = iconCompat.f497b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i4 = iconCompat.f496a;
        if (-1 != i4) {
            aVar.h(1);
            ((b) aVar).f3499e.writeInt(i4);
        }
        byte[] bArr = iconCompat.f498c;
        if (bArr != null) {
            aVar.h(2);
            Parcel parcel = ((b) aVar).f3499e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f499d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f3499e.writeParcelable(parcelable, 0);
        }
        int i5 = iconCompat.f500e;
        if (i5 != 0) {
            aVar.h(4);
            ((b) aVar).f3499e.writeInt(i5);
        }
        int i6 = iconCompat.f;
        if (i6 != 0) {
            aVar.h(5);
            ((b) aVar).f3499e.writeInt(i6);
        }
        ColorStateList colorStateList = iconCompat.f501g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f3499e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f503i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f3499e.writeString(str);
        }
        String str2 = iconCompat.f504j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f3499e.writeString(str2);
        }
    }
}
