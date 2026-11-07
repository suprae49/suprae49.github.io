package k0;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f2721b = new g(new h(new LocaleList(new Locale[0])));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f2722a;

    public g(h hVar) {
        this.f2722a = hVar;
    }

    public static g a(String str) {
        if (str == null || str.isEmpty()) {
            return f2721b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i4 = 0; i4 < length; i4++) {
            localeArr[i4] = Locale.forLanguageTag(strArrSplit[i4]);
        }
        return new g(new h(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f2722a.equals(((g) obj).f2722a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2722a.f2723a.hashCode();
    }

    public final String toString() {
        return this.f2722a.f2723a.toString();
    }
}
