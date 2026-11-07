package e;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static k0.g b(Configuration configuration) {
        return k0.g.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(k0.g gVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(gVar.f2722a.f2723a.toLanguageTags()));
    }

    public static void d(Configuration configuration, k0.g gVar) {
        configuration.setLocales(LocaleList.forLanguageTags(gVar.f2722a.f2723a.toLanguageTags()));
    }
}
