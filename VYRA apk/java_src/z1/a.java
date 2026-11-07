package z1;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.fragment.app.u;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4855a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4856b = true;

    public static final boolean a(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("camera_config_prefs", 0);
        return sharedPreferences.contains("captureQuality") || sharedPreferences.contains("saveToGallery");
    }

    public final void b(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("camera_config_prefs", 0);
        sharedPreferences.getClass();
        String string = sharedPreferences.getString("captureQuality", "HIGH");
        this.f4855a = u.s(string != null ? string : "HIGH");
        this.f4856b = sharedPreferences.getBoolean("saveToGallery", false);
    }

    public final void c(Activity activity) {
        activity.getClass();
        SharedPreferences sharedPreferences = activity.getSharedPreferences("camera_config_prefs", 0);
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("captureQuality", u.p(this.f4855a));
        editorEdit.putBoolean("saveToGallery", this.f4856b);
        editorEdit.apply();
    }

    public final boolean d() {
        return this.f4856b;
    }

    public final void e(int i4) {
        if (i4 == 0) {
            throw null;
        }
        this.f4855a = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4855a == aVar.f4855a && this.f4856b == aVar.f4856b;
    }

    public final void f(boolean z4) {
        this.f4856b = z4;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4856b) + (s.e.b(this.f4855a) * 31);
    }

    public final String toString() {
        String str;
        int i4 = this.f4855a;
        boolean z4 = this.f4856b;
        StringBuilder sb = new StringBuilder("CameraConfig(captureQuality=");
        if (i4 != 1) {
            str = i4 != 2 ? "null" : "HIGH";
        } else {
            str = "LOW";
        }
        sb.append(str);
        sb.append(", saveToGallery=");
        sb.append(z4);
        sb.append(")");
        return sb.toString();
    }
}
