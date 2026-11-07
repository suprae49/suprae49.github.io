package u1;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4114b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MainActivity f4116d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f4115c = new v(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f4117e = new HashMap();

    public w(MainActivity mainActivity) {
        this.f4116d = mainActivity;
        if (x1.a.u(mainActivity).J0.f4864b) {
            this.f4113a = 1;
        } else {
            this.f4113a = 2;
        }
    }

    public static void a(w wVar, JSONObject jSONObject) throws IOException {
        u uVar;
        String strF;
        int iIndexOf;
        HashMap map = wVar.f4117e;
        String strF2 = t2.i.F("id", jSONObject);
        if (TextUtils.isEmpty(strF2) || (uVar = (u) map.get(strF2)) == null || (strF = t2.i.F("data", jSONObject)) == null || (iIndexOf = strF.indexOf(";base64,")) == -1) {
            return;
        }
        byte[] bArrDecode = Base64.decode(strF.substring(iIndexOf + 8), 0);
        long length = uVar.f4106i + ((long) bArrDecode.length);
        long j4 = uVar.f4101c;
        OutputStream outputStream = uVar.f4105h;
        if (length <= j4) {
            outputStream.write(bArrDecode);
            uVar.f4106i += (long) bArrDecode.length;
            return;
        }
        try {
            outputStream.close();
            uVar.f.delete();
            map.remove(strF2);
        } catch (Exception unused) {
        }
        x1.f.a().d("w", "Received too many bytes. Expected " + uVar.f4101c, null);
        o.g(wVar.f4116d, uVar.f4107j, "Received too many bytes. Expected " + uVar.f4101c);
    }

    public static void b(w wVar, JSONObject jSONObject) throws IOException {
        String string;
        MainActivity mainActivity = wVar.f4116d;
        String strF = t2.i.F("id", jSONObject);
        if (TextUtils.isEmpty(strF)) {
            x1.f.a().d("w", androidx.fragment.app.u.m("Invalid identifier ", strF, " for fileEnd"), null);
            o.g(mainActivity, wVar.f4114b, "Unable to retrieve download info on file end.");
            return;
        }
        u uVar = (u) wVar.f4117e.get(strF);
        if (uVar == null) {
            x1.f.a().d("w", androidx.fragment.app.u.m("Invalid identifier ", strF, " for fileEnd"), null);
            o.g(mainActivity, wVar.f4114b, "Unable to retrieve download info on file end.");
            return;
        }
        OutputStream outputStream = uVar.f4105h;
        if (outputStream != null) {
            outputStream.close();
        }
        String strOptString = jSONObject.optString("error");
        if (!TextUtils.isEmpty(strOptString)) {
            o.g(mainActivity, uVar.f4107j, strOptString);
            return;
        }
        if (uVar.f4108k) {
            mainActivity.runOnUiThread(new androidx.activity.p(wVar, 7, uVar));
        } else {
            String str = uVar.f4100b;
            if (str == null || str.isEmpty()) {
                string = mainActivity.getString(R.string.file_download_finished);
            } else {
                string = String.format(mainActivity.getString(R.string.file_download_finished_with_name), uVar.f4100b + '.' + uVar.f4103e);
            }
            Toast.makeText(mainActivity, string, 0).show();
        }
        String str2 = uVar.f4107j;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", true);
            mainActivity.runOnUiThread(new androidx.emoji2.text.l(mainActivity, str2, jSONObject2, 1));
        } catch (JSONException unused) {
        }
    }

    public static void c(w wVar, JSONObject jSONObject) {
        MainActivity mainActivity = wVar.f4116d;
        String strF = t2.i.F("id", jSONObject);
        if (TextUtils.isEmpty(strF)) {
            x1.f.a().d("w", "Invalid file id", null);
            o.g(mainActivity, wVar.f4114b, "Unable to retrieve download info on file start.");
            return;
        }
        u uVar = (u) wVar.f4117e.get(strF);
        if (uVar == null) {
            o.g(mainActivity, wVar.f4114b, "Unable to retrieve download info on file start.");
            return;
        }
        int i4 = 0;
        if (TextUtils.isEmpty(uVar.f4100b)) {
            String strF2 = t2.i.F("name", jSONObject);
            uVar.f4100b = strF2;
            if (TextUtils.isEmpty(strF2)) {
                uVar.f4100b = "download";
            }
        } else {
            String strD = o.d(uVar.f4100b);
            uVar.f4103e = strD;
            if (!TextUtils.isEmpty(strD)) {
                if (Objects.equals(uVar.f4103e, uVar.f4100b)) {
                    uVar.f4100b = "download";
                } else {
                    String str = uVar.f4100b;
                    uVar.f4100b = str.substring(0, str.length() - (uVar.f4103e.length() + 1));
                }
                uVar.f4102d = MimeTypeMap.getSingleton().getMimeTypeFromExtension(uVar.f4103e);
            }
        }
        long jOptLong = jSONObject.optLong("size", -1L);
        if (jOptLong <= 0 || jOptLong > 1073741824) {
            x1.f.a().d("w", "Invalid file size", null);
            o.g(mainActivity, uVar.f4107j, "Invalid file size.");
            return;
        }
        uVar.f4101c = jOptLong;
        if (TextUtils.isEmpty(uVar.f4102d)) {
            String strF3 = t2.i.F("type", jSONObject);
            uVar.f4102d = strF3;
            if (TextUtils.isEmpty(strF3)) {
                x1.f.a().d("w", "Invalid file type", null);
                o.g(mainActivity, uVar.f4107j, "Invalid file type.");
                return;
            }
        }
        if (TextUtils.isEmpty(uVar.f4103e)) {
            uVar.f4103e = MimeTypeMap.getSingleton().getExtensionFromMimeType(uVar.f4102d);
        }
        if (Build.VERSION.SDK_INT < 29 && wVar.f4113a == 1) {
            mainActivity.G(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new p1.h(wVar, uVar));
        } else {
            wVar.e(uVar, true);
            mainActivity.runOnUiThread(new t(wVar, i4));
        }
    }

    public final void d(String str, String str2, boolean z4, String str3) {
        MainActivity mainActivity = this.f4116d;
        if (str == null || !str.startsWith("blob:")) {
            return;
        }
        this.f4114b = str3;
        u uVar = new u();
        String string = UUID.randomUUID().toString();
        uVar.f4099a = string;
        uVar.f4100b = str2;
        uVar.f4107j = str3;
        uVar.f4108k = z4;
        this.f4117e.put(string, uVar);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(mainActivity.getAssets().open("BlobDownloader.js"));
            byte[] bArr = new byte[1024];
            while (true) {
                int i4 = bufferedInputStream.read(bArr);
                if (i4 <= 0) {
                    mainActivity.V(byteArrayOutputStream.toString(), null);
                    mainActivity.V("medianDownloadBlobUrl(" + t2.i.x(str) + ", '" + uVar.f4099a + "', '" + uVar.f4100b + "')", null);
                    return;
                }
                byteArrayOutputStream.write(bArr, 0, i4);
            }
        } catch (IOException e5) {
            x1.f.a().d("w", e5.getMessage(), e5);
            o.g(mainActivity, str3, "IO Error - " + e5.getMessage());
        }
    }

    public final void e(u uVar, boolean z4) {
        MainActivity mainActivity = this.f4116d;
        if (!z4 || this.f4113a != 1) {
            uVar.f = o.b(mainActivity.getFilesDir(), uVar.f4100b, uVar.f4103e);
            uVar.f4105h = new BufferedOutputStream(new FileOutputStream(uVar.f));
        } else if (Build.VERSION.SDK_INT > 28) {
            ContentResolver contentResolver = mainActivity.getApplicationContext().getContentResolver();
            Uri uriA = o.a(contentResolver, uVar.f4100b, uVar.f4102d, Environment.DIRECTORY_DOWNLOADS);
            if (uriA != null) {
                uVar.f4105h = contentResolver.openOutputStream(uriA);
                uVar.f4104g = uriA;
            }
        } else {
            uVar.f = o.b(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), uVar.f4100b, uVar.f4103e);
            uVar.f4105h = new BufferedOutputStream(new FileOutputStream(uVar.f));
        }
        uVar.f4106i = 0L;
        this.f4117e.put(uVar.f4099a, uVar);
    }
}
