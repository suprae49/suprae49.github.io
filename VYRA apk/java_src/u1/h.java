package u1;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.widget.Toast;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3939b;

    public h(x1.a aVar) {
        this.f3938a = 2;
        this.f3939b = aVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        boolean z4;
        switch (this.f3938a) {
            case 0:
                Context context = (Context) ((WeakReference) this.f3939b).get();
                if (context != null) {
                    JSONObject jSONObject = new JSONObject(h0.y(context));
                    try {
                        jSONObject.put("event", "launch");
                        try {
                            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://events.gonative.io/api/events/new").openConnection();
                            httpURLConnection.setRequestMethod("POST");
                            httpURLConnection.setRequestProperty("Content-Type", "application/json");
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setDoInput(false);
                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
                            outputStreamWriter.write(jSONObject.toString());
                            outputStreamWriter.close();
                            httpURLConnection.connect();
                            httpURLConnection.getResponseCode();
                            httpURLConnection.disconnect();
                        } catch (Exception e5) {
                            x1.f.a().d("a3.f", e5.getMessage(), e5);
                        }
                    } catch (JSONException e6) {
                        x1.f.a().d("a3.f", e6.getMessage(), e6);
                    }
                    break;
                }
                return null;
            case 1:
                String[] strArr = (String[]) objArr;
                s0 s0Var = (s0) ((WeakReference) this.f3939b).get();
                if (s0Var == null) {
                    return null;
                }
                try {
                    URL url = new URL(strArr[0]);
                    HttpURLConnection httpURLConnection2 = null;
                    int i4 = 0;
                    do {
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        httpURLConnection2 = (HttpURLConnection) url.openConnection();
                        httpURLConnection2.setInstanceFollowRedirects(true);
                        httpURLConnection2.setRequestProperty("User-Agent", x1.a.u(s0Var.f4091a).f4673k);
                        httpURLConnection2.connect();
                        int responseCode = httpURLConnection2.getResponseCode();
                        if (responseCode == 301 || responseCode == 302) {
                            i4++;
                            url = new URL(url, httpURLConnection2.getHeaderField("Location"));
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (isCancelled() || !z4) {
                        }
                        String string = httpURLConnection2.getURL().toString();
                        httpURLConnection2.disconnect();
                        return string;
                    } while (i4 < 10);
                    String string2 = httpURLConnection2.getURL().toString();
                    httpURLConnection2.disconnect();
                    return string2;
                } catch (Exception e7) {
                    x1.f fVarA = x1.f.a();
                    int i5 = s0.f4090d;
                    fVarA.d("u1.s0", e7.getMessage(), e7);
                    return null;
                }
            default:
                x1.a aVar = (x1.a) this.f3939b;
                aVar.Z0 = SystemClock.elapsedRealtime();
                try {
                    JSONObject jSONObject2 = new JSONObject(x1.a.a(aVar));
                    byte[] bArr = {-21, 41, 13, -62, 113, 29, -7, 48, 26, -97, 4, 125, -107, 4, -80, 115, 26, -127, 22, 50, -39, -33, 96, -105, 25, -46, 123, -62, -90, 109, -33, 58, 71, -100, -107, 56, -20, -16, -5, 116};
                    byte[] bArr2 = {-125, 93, 121, -78, 2, 39, -42, 31, 118, -10, 103, 24, -5, 119, -43, 93, 125, -18, 120, 83, -83, -74, 22, -14, 55, -69, 20, -19, -54, 4, -68, 95, 41, -17, -16, 91, -124, -107, -104, 31};
                    byte[] bArr3 = new byte[40];
                    for (int i6 = 0; i6 < 40; i6++) {
                        bArr3[i6] = (byte) (bArr[i6] ^ bArr2[i6]);
                    }
                    HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(new String(bArr3, Charset.forName("US-ASCII"))).openConnection();
                    httpURLConnection3.setRequestMethod("POST");
                    httpURLConnection3.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection3.setDoOutput(true);
                    OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(httpURLConnection3.getOutputStream(), "UTF-8");
                    outputStreamWriter2.write(jSONObject2.toString());
                    outputStreamWriter2.close();
                    httpURLConnection3.connect();
                    if (httpURLConnection3.getResponseCode() != 200) {
                        throw new Exception("Non-200 response");
                    }
                    ByteArrayOutputStream byteArrayOutputStream = httpURLConnection3.getContentLength() > 0 ? new ByteArrayOutputStream(httpURLConnection3.getContentLength()) : new ByteArrayOutputStream();
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection3.getInputStream());
                    t1.l.g(bufferedInputStream, byteArrayOutputStream);
                    bufferedInputStream.close();
                    byteArrayOutputStream.close();
                    return new JSONObject(byteArrayOutputStream.toString("UTF-8"));
                } catch (Exception unused) {
                    return null;
                }
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Object obj) {
        JSONObject jSONObjectN;
        switch (this.f3938a) {
            case 1:
                String str = (String) obj;
                s0 s0Var = (s0) ((WeakReference) this.f3939b).get();
                if (s0Var != null) {
                    androidx.emoji2.text.p.l().o(str);
                    if (str == null) {
                        s0Var.f4093c = false;
                        s0Var.setChanged();
                        s0Var.notifyObservers();
                    } else {
                        x1.a aVarU = x1.a.u(s0Var.f4091a);
                        ArrayList arrayList = aVarU.N;
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            if (((Pattern) arrayList.get(i4)).matcher(str).matches()) {
                                JSONObject jSONObject = (JSONObject) aVarU.O.get(i4);
                                s0Var.f4093c = jSONObject.optBoolean("loggedIn", false);
                                x1.a.y(jSONObject, "menuName", null);
                                s0Var.setChanged();
                                s0Var.notifyObservers();
                            }
                        }
                    }
                    break;
                }
                break;
            case 2:
                x1.a aVar = (x1.a) this.f3939b;
                Context context = aVar.f4647a;
                HashMap map = aVar.f4660e1;
                x1.f fVar = aVar.T;
                x1.f fVar2 = aVar.U;
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 != null) {
                    boolean zOptBoolean = jSONObject2.optBoolean("isLicensed", true);
                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("splashPageConfig");
                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("widgetConfig");
                    if (jSONObjectOptJSONObject2 != null) {
                        aVar.f4672j1 = new z1.g(jSONObjectOptJSONObject2);
                    }
                    if (zOptBoolean) {
                        if (jSONObjectOptJSONObject == null) {
                            JSONObject jSONObjectN2 = aVar.n("splashpage.json");
                            if (jSONObjectN2 != null && jSONObjectN2.has("splashPageUrl")) {
                                aVar.V = map;
                                aVar.j("splashpage.json").delete();
                            }
                        } else {
                            x1.a.b(aVar, jSONObjectOptJSONObject);
                        }
                    }
                    boolean zOptBoolean2 = jSONObject2.optBoolean("isLicensedForPush", true);
                    aVar.f4655c1 = jSONObject2.optBoolean("isPublished", false);
                    String strY = x1.a.y(jSONObject2, "alert", null);
                    if (strY != null && !strY.isEmpty() && (zOptBoolean || !aVar.f4655c1 || (jSONObjectN = aVar.n("splashpage.json")) == null || !jSONObjectN.has("splashPageUrl"))) {
                        Toast.makeText(context, strY, 1).show();
                    }
                    if (!zOptBoolean) {
                        zOptBoolean2 = false;
                    }
                    if (!zOptBoolean && aVar.f4649a1) {
                        aVar.f4649a1 = false;
                        if (!aVar.f4655c1) {
                            aVar.j("splashpage.json").delete();
                            String strG = t2.i.G("unlicensedUrl", jSONObject2);
                            if (strG == null) {
                                strG = "https://gonative.io/unlicensed";
                            }
                            String strG2 = t2.i.G("unlicensedLabel", jSONObject2);
                            if (strG2 == null) {
                                strG2 = "Disabled";
                            }
                            aVar.f4658e = aVar.f4656d;
                            aVar.f4656d = strG;
                            if (jSONObject2.optBoolean("disableRedirects")) {
                                aVar.V = null;
                            } else {
                                HashMap map2 = new HashMap();
                                aVar.V = map2;
                                map2.put("*", strG);
                            }
                            ArrayList arrayList2 = fVar.f4716a;
                            aVar.f4662f1 = arrayList2;
                            arrayList2.clear();
                            JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("regexInternalExternalRules");
                            if (jSONArrayOptJSONArray != null) {
                                aVar.l(jSONArrayOptJSONArray);
                            } else {
                                fVar.f4716a.add(new x1.l("internal", Pattern.compile(".*")));
                            }
                            aVar.f4664g1 = new HashMap(aVar.G);
                            for (String str2 : aVar.G.keySet()) {
                                try {
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put(ImagesContract.URL, strG);
                                    jSONObject3.put("label", strG2);
                                    JSONArray jSONArray = new JSONArray();
                                    jSONArray.put(jSONObject3);
                                    aVar.G.put(str2, jSONArray);
                                } catch (JSONException unused) {
                                }
                            }
                            aVar.f4667h1 = new HashMap(aVar.Y);
                            for (String str3 : aVar.Y.keySet()) {
                                try {
                                    JSONObject jSONObject4 = new JSONObject();
                                    jSONObject4.put(ImagesContract.URL, strG);
                                    jSONObject4.put("label", strG2);
                                    jSONObject4.put("icon", "fa-ban");
                                    JSONArray jSONArray2 = new JSONArray();
                                    jSONArray2.put(jSONObject4);
                                    aVar.Y.put(str3, jSONArray2);
                                } catch (JSONException unused2) {
                                }
                            }
                            fVar2.f();
                            fVar2.g();
                        } else if (jSONObjectOptJSONObject != null) {
                            x1.a.b(aVar, jSONObjectOptJSONObject);
                        }
                    }
                    if (!zOptBoolean2 && aVar.f4652b1) {
                        aVar.f4652b1 = false;
                        aVar.f4670i1 = aVar.K0;
                        aVar.K0 = false;
                    }
                    if (zOptBoolean && !aVar.f4649a1) {
                        aVar.f4649a1 = true;
                        aVar.f4656d = aVar.f4658e;
                        aVar.V = map;
                        fVar.f4716a = aVar.f4662f1;
                        aVar.G = aVar.f4664g1;
                        aVar.Y = aVar.f4667h1;
                        fVar2.f();
                        fVar2.g();
                    }
                    if (zOptBoolean2 && !aVar.f4652b1) {
                        aVar.f4652b1 = true;
                        aVar.K0 = aVar.f4670i1;
                        break;
                    }
                }
                break;
            default:
                super.onPostExecute(obj);
                break;
        }
    }

    public /* synthetic */ h(int i4) {
        this.f3938a = i4;
    }
}
