package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.fragment.app.q;
import androidx.versionedparcelable.CustomVersionedParcelable;
import c0.a;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f495k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f500e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f504j;

    public static IconCompat a(int i4) {
        if (i4 == 0) {
            q.q("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat();
        iconCompat.f498c = null;
        iconCompat.f499d = null;
        iconCompat.f = 0;
        iconCompat.f501g = null;
        iconCompat.f502h = f495k;
        iconCompat.f503i = null;
        iconCompat.f496a = 2;
        iconCompat.f500e = i4;
        iconCompat.f497b = "";
        iconCompat.f504j = "";
        return iconCompat;
    }

    public final int b() {
        int i4 = this.f496a;
        if (i4 != -1) {
            if (i4 == 2) {
                return this.f500e;
            }
            q.i(this, "called getResId() on ");
            return 0;
        }
        Object obj = this.f497b;
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e5) {
            Log.e("IconCompat", "Unable to get icon resource", e5);
            return 0;
        } catch (NoSuchMethodException e6) {
            Log.e("IconCompat", "Unable to get icon resource", e6);
            return 0;
        } catch (InvocationTargetException e7) {
            Log.e("IconCompat", "Unable to get icon resource", e7);
            return 0;
        }
    }

    public final Uri c() {
        int i4 = this.f496a;
        if (i4 != -1) {
            if (i4 == 4 || i4 == 6) {
                return Uri.parse((String) this.f497b);
            }
            q.i(this, "called getUri() on ");
            return null;
        }
        Object obj = this.f497b;
        if (Build.VERSION.SDK_INT >= 28) {
            return a.l(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e5) {
            Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        } catch (NoSuchMethodException e6) {
            Log.e("IconCompat", "Unable to get icon uri", e6);
            return null;
        } catch (InvocationTargetException e7) {
            Log.e("IconCompat", "Unable to get icon uri", e7);
            return null;
        }
    }

    public final String toString() {
        String str;
        if (this.f496a == -1) {
            return String.valueOf(this.f497b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f496a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f496a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f497b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f497b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f504j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f500e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f497b);
                break;
        }
        if (this.f501g != null) {
            sb.append(" tint=");
            sb.append(this.f501g);
        }
        if (this.f502h != f495k) {
            sb.append(" mode=");
            sb.append(this.f502h);
        }
        sb.append(")");
        return sb.toString();
    }
}
