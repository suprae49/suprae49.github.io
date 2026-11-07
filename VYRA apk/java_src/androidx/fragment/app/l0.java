package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements b.b {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u0 f720g;

    public /* synthetic */ l0(u0 u0Var, int i4) {
        this.f = i4;
        this.f720g = u0Var;
    }

    @Override // b.b
    public final void a(Object obj) {
        switch (this.f) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    iArr[i4] = ((Boolean) arrayList.get(i4)).booleanValue() ? 0 : -1;
                }
                u0 u0Var = this.f720g;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) u0Var.C.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = fragmentManager$LaunchedFragmentInfo.f;
                    int i5 = fragmentManager$LaunchedFragmentInfo.f614g;
                    Fragment fragmentC = u0Var.f751c.c(str);
                    if (fragmentC == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    } else {
                        fragmentC.onRequestPermissionsResult(i5, strArr, iArr);
                    }
                }
                break;
            case 1:
                ActivityResult activityResult = (ActivityResult) obj;
                u0 u0Var2 = this.f720g;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) u0Var2.C.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = fragmentManager$LaunchedFragmentInfo2.f;
                    int i6 = fragmentManager$LaunchedFragmentInfo2.f614g;
                    Fragment fragmentC2 = u0Var2.f751c.c(str2);
                    if (fragmentC2 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        fragmentC2.onActivityResult(i6, activityResult.f, activityResult.f249g);
                    }
                }
                break;
            default:
                ActivityResult activityResult2 = (ActivityResult) obj;
                u0 u0Var3 = this.f720g;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) u0Var3.C.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = fragmentManager$LaunchedFragmentInfo3.f;
                    int i7 = fragmentManager$LaunchedFragmentInfo3.f614g;
                    Fragment fragmentC3 = u0Var3.f751c.c(str3);
                    if (fragmentC3 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        fragmentC3.onActivityResult(i7, activityResult2.f, activityResult2.f249g);
                    }
                }
                break;
        }
    }
}
