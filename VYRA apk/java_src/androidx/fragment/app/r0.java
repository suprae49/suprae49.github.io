package androidx.fragment.app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f744a;

    public /* synthetic */ r0(int i4) {
        this.f744a = i4;
    }

    @Override // c.a
    public final Intent a(e0 e0Var, Object obj) {
        Bundle bundleExtra;
        switch (this.f744a) {
            case 0:
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = intentSenderRequest.f250g;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        intentSenderRequest = new IntentSenderRequest(intentSenderRequest.f, null, intentSenderRequest.f251h, intentSenderRequest.f252i);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
                if (u0.G(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                intentPutExtra.getClass();
                return intentPutExtra;
            case 2:
                String str = (String) obj;
                str.getClass();
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                intentPutExtra2.getClass();
                return intentPutExtra2;
            case 3:
                Intent intent3 = (Intent) obj;
                intent3.getClass();
                return intent3;
            default:
                IntentSenderRequest intentSenderRequest2 = (IntentSenderRequest) obj;
                intentSenderRequest2.getClass();
                Intent intentPutExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest2);
                intentPutExtra3.getClass();
                return intentPutExtra3;
        }
    }

    @Override // c.a
    public a3.h0 b(e0 e0Var, Object obj) {
        switch (this.f744a) {
            case 1:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new a3.h0(5, h3.n.f);
                }
                for (String str : strArr) {
                    if (c0.c.checkSelfPermission(e0Var, str) != 0) {
                        return null;
                    }
                }
                int iO0 = h3.p.o0(strArr.length);
                if (iO0 < 16) {
                    iO0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iO0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new a3.h0(5, linkedHashMap);
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                if (c0.c.checkSelfPermission(e0Var, str3) != 0) {
                    return null;
                }
                return new a3.h0(5, Boolean.TRUE);
            default:
                return super.b(e0Var, obj);
        }
    }

    @Override // c.a
    public final Object c(int i4, Intent intent) {
        switch (this.f744a) {
            case 0:
                return new ActivityResult(i4, intent);
            case 1:
                if (i4 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i5 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i5 == 0));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(h3.g.u0(arrayList2), h3.g.u0(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new g3.b(it.next(), it2.next()));
                        }
                        return h3.p.p0(arrayList3);
                    }
                }
                return h3.n.f;
            case 2:
                if (intent == null || i4 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z4 = false;
                if (intArrayExtra2 != null) {
                    for (int i6 : intArrayExtra2) {
                        if (i6 == 0) {
                            z4 = true;
                        }
                    }
                }
                return Boolean.valueOf(z4);
            case 3:
                return new ActivityResult(i4, intent);
            default:
                return new ActivityResult(i4, intent);
        }
    }
}
