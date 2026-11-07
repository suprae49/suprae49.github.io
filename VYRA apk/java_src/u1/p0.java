package u1;

import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements b.b, OnFailureListener {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r0 f4050g;

    public /* synthetic */ p0(r0 r0Var, int i4) {
        this.f = i4;
        this.f4050g = r0Var;
    }

    @Override // b.b
    public void a(Object obj) {
        switch (this.f) {
            case 0:
                Map map = (Map) obj;
                Boolean bool = (Boolean) map.get("android.permission.ACCESS_FINE_LOCATION");
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                Boolean bool2 = (Boolean) map.get("android.permission.ACCESS_COARSE_LOCATION");
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                r0 r0Var = this.f4050g;
                if (zBooleanValue && zBooleanValue2) {
                    r0Var.a();
                } else {
                    y yVar = r0Var.f4072b;
                    if (yVar != null) {
                        yVar.a(false);
                    }
                }
                break;
            default:
                int i4 = ((ActivityResult) obj).f;
                y yVar2 = this.f4050g.f4072b;
                if (i4 != -1) {
                    if (yVar2 != null) {
                        yVar2.a(false);
                    }
                } else if (yVar2 != null) {
                    yVar2.a(true);
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        exc.getClass();
        if (exc instanceof ResolvableApiException) {
            PendingIntent resolution = ((ResolvableApiException) exc).getResolution();
            resolution.getClass();
            IntentSender intentSender = resolution.getIntentSender();
            intentSender.getClass();
            this.f4050g.f4074d.a(new IntentSenderRequest(intentSender, null, 0, 0));
        }
    }
}
