package o;

import a3.f;
import a3.h0;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActivityOptions f3128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f3129d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f3126a = new Intent("android.intent.action.VIEW");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f3127b = new f(18);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3130e = true;

    public final h0 a() {
        Intent intent = this.f3126a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f3130e);
        this.f3127b.getClass();
        intent.putExtras(new Bundle());
        Bundle bundle2 = this.f3129d;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            if (this.f3128c == null) {
                this.f3128c = ActivityOptions.makeBasic();
            }
            a.i(this.f3128c);
        }
        if (i4 >= 36) {
            if (this.f3128c == null) {
                this.f3128c = ActivityOptions.makeBasic();
            }
            b.e(this.f3128c, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = this.f3128c;
        if (activityOptions != null) {
            activityOptions.toBundle();
        }
        return new h0(22, intent);
    }
}
