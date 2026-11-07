package u1;

import android.os.AsyncTask;
import android.util.Log;
import co.median.android.GoNativeApplication;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n1 f4038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.emoji2.text.x f4039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GoNativeApplication f4040c;

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        n1 n1Var = this.f4038a;
        HashMap map = new HashMap();
        androidx.emoji2.text.x xVar = this.f4039b;
        map.putAll(h0.y((GoNativeApplication) xVar.f592a));
        GoNativeApplication goNativeApplication = this.f4040c;
        if (goNativeApplication.a() != null) {
            map.putAll(goNativeApplication.a());
        }
        JSONObject jSONObject = (JSONObject) xVar.f593b;
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put("customData_" + next, ((JSONObject) xVar.f593b).opt(next));
            }
        }
        try {
            JSONObject jSONObject2 = new JSONObject(map);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(n1Var.f4012a).openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setDoOutput(true);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            outputStreamWriter.write(jSONObject2.toString());
            outputStreamWriter.close();
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 200 && responseCode <= 299) {
                return null;
            }
            Log.w("androidx.emoji2.text.x", "Recevied status code " + responseCode + " when posting to " + n1Var.f4012a);
            return null;
        } catch (Exception e5) {
            x1.f.a().d("androidx.emoji2.text.x", "Error posting to ".concat(n1Var.f4012a), e5);
            return null;
        }
    }
}
