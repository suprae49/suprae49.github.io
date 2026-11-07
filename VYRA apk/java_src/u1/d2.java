package u1;

import android.app.Activity;
import android.os.AsyncTask;
import android.security.KeyChain;
import android.util.Pair;
import android.webkit.ClientCertRequest;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f3873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ClientCertRequest f3874b;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Activity activity = this.f3873a;
        String str = ((String[]) objArr)[0];
        try {
            return new Pair(KeyChain.getPrivateKey(activity, str), KeyChain.getCertificateChain(activity, str));
        } catch (Exception e5) {
            x1.f.a().d("u1.e2", "Error getting private key for alias " + str, e5);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Pair pair = (Pair) obj;
        ClientCertRequest clientCertRequest = this.f3874b;
        if (pair != null) {
            Object obj2 = pair.first;
            boolean z4 = obj2 != null;
            Object obj3 = pair.second;
            if ((obj3 != null) & z4) {
                clientCertRequest.proceed((PrivateKey) obj2, (X509Certificate[]) obj3);
                return;
            }
        }
        clientCertRequest.ignore();
    }
}
