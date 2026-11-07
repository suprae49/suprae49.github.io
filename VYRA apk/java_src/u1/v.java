package u1;

import android.util.Log;
import android.webkit.JavascriptInterface;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f4110a;

    public v(w wVar) {
        this.f4110a = wVar;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        Log.d("w", "got message " + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strF = t2.i.F("event", jSONObject);
            boolean zEquals = "fileStart".equals(strF);
            w wVar = this.f4110a;
            if (zEquals) {
                w.c(wVar, jSONObject);
                return;
            }
            if ("fileChunk".equals(strF)) {
                w.a(wVar, jSONObject);
                return;
            }
            if ("fileEnd".equals(strF)) {
                w.b(wVar, jSONObject);
                return;
            }
            x1.f.a().d("w", "Invalid event " + strF, null);
        } catch (IOException e5) {
            x1.f.a().d("w", "IO Error", e5);
        } catch (JSONException e6) {
            x1.f.a().d("w", "Error parsing message as json", e6);
        }
    }
}
