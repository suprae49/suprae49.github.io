package t1;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f3703c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3705b;

    public c(String str, String str2) {
        this.f3704a = str;
        this.f3705b = str2;
        f3703c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f3701a;
        String str = this.f3705b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }
}
