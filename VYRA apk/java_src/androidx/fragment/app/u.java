package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class u {
    public static final void a(View view, int i4) {
        int iB = s.e.b(i4);
        if (iB == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (u0.G(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iB == 1) {
            if (u0.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (iB == 2) {
            if (u0.G(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iB != 3) {
            return;
        }
        if (u0.G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static int b(int i4) {
        if (i4 == 0) {
            return 2;
        }
        if (i4 == 4) {
            return 4;
        }
        if (i4 == 8) {
            return 3;
        }
        q.q(k(i4, "Unknown visibility "));
        return 0;
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static int d(String str) {
        return s(str);
    }

    public static int e(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("NONE")) {
            return 1;
        }
        if (str.equals("ERROR")) {
            return 2;
        }
        if (str.equals("INFO")) {
            return 3;
        }
        if (str.equals("DEBUG")) {
            return 4;
        }
        q.q("No enum constant co.median.median_core.dto.CustomerIOLogLevel.".concat(str));
        return 0;
    }

    public static int f(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("US")) {
            return 1;
        }
        if (str.equals("EU")) {
            return 2;
        }
        q.q("No enum constant co.median.median_core.dto.CustomerIORegion.".concat(str));
        return 0;
    }

    public static int g(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("DEVELOPMENT")) {
            return 1;
        }
        if (str.equals("PRODUCTION")) {
            return 2;
        }
        q.q("No enum constant co.median.median_core.dto.Environment.".concat(str));
        return 0;
    }

    public static int h(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("DEVELOPMENT")) {
            return 1;
        }
        if (str.equals("STAGING")) {
            return 2;
        }
        if (str.equals("PRODUCTION")) {
            return 3;
        }
        q.q("No enum constant co.median.median_core.dto.GrowEnvironment.".concat(str));
        return 0;
    }

    public static ClassCastException i(int i4, ArrayList arrayList) {
        arrayList.get(i4).getClass();
        return new ClassCastException();
    }

    public static ClassCastException j(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String k(int i4, String str) {
        return str + i4;
    }

    public static String l(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ void n(Object obj) {
        if (obj == null) {
            return;
        }
        q.c();
    }

    public static /* synthetic */ String o(int i4) {
        switch (i4) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String p(int i4) {
        if (i4 == 1) {
            return "LOW";
        }
        if (i4 == 2) {
            return "HIGH";
        }
        throw null;
    }

    public static /* synthetic */ String q(int i4) {
        if (i4 == 1) {
            return "NONE";
        }
        if (i4 != 2) {
            return i4 != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    public static /* synthetic */ String r(int i4) {
        if (i4 == 1) {
            return "REMOVED";
        }
        if (i4 == 2) {
            return "VISIBLE";
        }
        if (i4 != 3) {
            return i4 != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }

    public static /* synthetic */ int s(String str) {
        if (str == null) {
            throw new NullPointerException("Name is null");
        }
        if (str.equals("LOW")) {
            return 1;
        }
        if (str.equals("HIGH")) {
            return 2;
        }
        q.q("No enum constant co.median.median_core.dto.CaptureQuality.".concat(str));
        return 0;
    }
}
