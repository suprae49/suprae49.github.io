package u1;

import android.os.Build;
import co.median.android.MainActivity;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f3998a;

    static {
        g3.b[] bVarArr = {new g3.b("Notifications", "android.permission.POST_NOTIFICATIONS"), new g3.b("Camera", "android.permission.CAMERA"), new g3.b("Contacts", "android.permission.READ_CONTACTS"), new g3.b("Microphone", "android.permission.RECORD_AUDIO"), new g3.b("LocationWhenInUse", "android.permission.ACCESS_FINE_LOCATION"), new g3.b("LocationAlways", "android.permission.ACCESS_BACKGROUND_LOCATION")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(h3.p.o0(6));
        for (int i4 = 0; i4 < 6; i4++) {
            g3.b bVar = bVarArr[i4];
            linkedHashMap.put(bVar.f, bVar.f2150g);
        }
        f3998a = linkedHashMap;
    }

    public static final String a(MainActivity mainActivity, String str) {
        if (!r3.g.a(str, "android.permission.POST_NOTIFICATIONS") || Build.VERSION.SDK_INT >= 33) {
            return ((!r3.g.a(str, "android.permission.ACCESS_BACKGROUND_LOCATION") || Build.VERSION.SDK_INT >= 29) && c0.c.checkSelfPermission(mainActivity, str) != 0) ? "denied" : "granted";
        }
        return "granted";
    }
}
