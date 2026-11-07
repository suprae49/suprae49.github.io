package b0;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f1008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f1009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1012e;
    public final CharSequence f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PendingIntent f1013g;

    public i(int i4, String str, PendingIntent pendingIntent) {
        IconCompat iconCompatA = i4 == 0 ? null : IconCompat.a(i4);
        Bundle bundle = new Bundle();
        this.f1011d = true;
        this.f1009b = iconCompatA;
        if (iconCompatA != null) {
            int iIntValue = iconCompatA.f496a;
            if (iIntValue == -1) {
                Object obj = iconCompatA.f497b;
                if (Build.VERSION.SDK_INT >= 28) {
                    iIntValue = c0.a.k(obj);
                } else {
                    try {
                        iIntValue = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                    } catch (IllegalAccessException e5) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e5);
                        iIntValue = -1;
                    } catch (NoSuchMethodException e6) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e6);
                        iIntValue = -1;
                    } catch (InvocationTargetException e7) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e7);
                        iIntValue = -1;
                    }
                }
            }
            if (iIntValue == 2) {
                this.f1012e = iconCompatA.b();
            }
        }
        this.f = j.a(str);
        this.f1013g = pendingIntent;
        this.f1008a = bundle;
        this.f1010c = true;
        this.f1011d = true;
    }
}
