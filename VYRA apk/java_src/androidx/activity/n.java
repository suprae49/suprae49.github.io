package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.IntentSenderRequest;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends b.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.e0 f227h;

    public n(androidx.fragment.app.e0 e0Var) {
        this.f227h = e0Var;
    }

    @Override // b.h
    public final void b(int i4, c.a aVar, Object obj) {
        Bundle bundleExtra;
        int i5;
        aVar.getClass();
        androidx.fragment.app.e0 e0Var = this.f227h;
        a3.h0 h0VarB = aVar.b(e0Var, obj);
        if (h0VarB != null) {
            new Handler(Looper.getMainLooper()).post(new m(this, i4, h0VarB, 0));
            return;
        }
        Intent intentA = aVar.a(e0Var, obj);
        if (intentA.getExtras() != null) {
            Bundle extras = intentA.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentA.setExtrasClassLoader(e0Var.getClassLoader());
            }
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            b0.a.a(e0Var, stringArrayExtra, i4);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
            e0Var.startActivityForResult(intentA, i4, bundle);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            intentSenderRequest.getClass();
            i5 = i4;
            try {
                e0Var.startIntentSenderForResult(intentSenderRequest.f, i5, intentSenderRequest.f250g, intentSenderRequest.f251h, intentSenderRequest.f252i, 0, bundle);
            } catch (IntentSender.SendIntentException e5) {
                e = e5;
                new Handler(Looper.getMainLooper()).post(new m(this, i5, e, 1));
            }
        } catch (IntentSender.SendIntentException e6) {
            e = e6;
            i5 = i4;
        }
    }
}
