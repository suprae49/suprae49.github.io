package u1;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import co.median.android.DownloadService;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f3972g;

    public /* synthetic */ j(k kVar, int i4) {
        this.f = i4;
        this.f3972g = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[Catch: all -> 0x0061, Exception -> 0x0064, FileNotFoundException -> 0x0131, TryCatch #4 {FileNotFoundException -> 0x0131, Exception -> 0x0064, blocks: (B:7:0x0036, B:45:0x00f5, B:14:0x0058, B:23:0x006f, B:27:0x007e, B:29:0x0087, B:31:0x008b, B:32:0x00ac, B:34:0x00b0, B:35:0x00c4, B:38:0x00cd, B:21:0x0067, B:24:0x0073, B:26:0x007b), top: B:72:0x0036, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0 A[Catch: all -> 0x0061, Exception -> 0x0064, FileNotFoundException -> 0x0131, TryCatch #4 {FileNotFoundException -> 0x0131, Exception -> 0x0064, blocks: (B:7:0x0036, B:45:0x00f5, B:14:0x0058, B:23:0x006f, B:27:0x007e, B:29:0x0087, B:31:0x008b, B:32:0x00ac, B:34:0x00b0, B:35:0x00c4, B:38:0x00cd, B:21:0x0067, B:24:0x0073, B:26:0x007b), top: B:72:0x0036, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e4 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8 A[PHI: r0
      0x00e8: PHI (r0v12 java.io.File) = (r0v6 java.io.File), (r0v10 java.io.File), (r0v15 java.io.File), (r0v21 java.io.File) binds: [B:55:0x012e, B:61:0x0159, B:42:0x00e6, B:49:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5 A[Catch: all -> 0x0061, Exception -> 0x0064, FileNotFoundException -> 0x0131, TRY_ENTER, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x0131, Exception -> 0x0064, blocks: (B:7:0x0036, B:45:0x00f5, B:14:0x0058, B:23:0x006f, B:27:0x007e, B:29:0x0087, B:31:0x008b, B:32:0x00ac, B:34:0x00b0, B:35:0x00c4, B:38:0x00cd, B:21:0x0067, B:24:0x0073, B:26:0x007b), top: B:72:0x0036, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x010e A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x00f5, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        File file;
        File file2;
        o oVar;
        MainActivity mainActivity;
        switch (this.f) {
            case 0:
                k kVar = this.f3972g;
                DownloadService downloadService = kVar.f3989r;
                androidx.emoji2.text.p pVar = kVar.f3986o;
                String str = (String) pVar.f568g;
                o oVar2 = (o) pVar.f569h;
                Log.d("DownloadService", "startDownload: Thread started");
                try {
                    try {
                        Uri uri = Uri.parse(kVar.f3975b);
                        String scheme = uri.getScheme();
                        Objects.requireNonNull(scheme);
                        int iHashCode = scheme.hashCode();
                        if (iHashCode == 3076010) {
                            if (scheme.equals("data")) {
                                kVar.b();
                                kVar.f3988q = true;
                                kVar.f3976c = false;
                                if (kVar.f3980h == null) {
                                    kVar.f3980h = FileProvider.d(downloadService, downloadService.getApplicationContext().getPackageName() + ".fileprovider", kVar.f3979g);
                                }
                                oVar = downloadService.f1158g;
                                if (oVar != null) {
                                    oVar.f(kVar.f3980h, kVar.f3983k, kVar.f3984l, kVar.f3985m, (String) kVar.f3987p.get());
                                }
                                mainActivity = oVar2.f4016a;
                                if (!TextUtils.isEmpty(str)) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("success", true);
                                    mainActivity.runOnUiThread(new androidx.emoji2.text.l(mainActivity, str, jSONObject, 1));
                                }
                                if (!kVar.f3988q) {
                                    file2.delete();
                                }
                            } else {
                                o.g(oVar2.f4016a, str, "Unsupported URI scheme: " + uri.getScheme());
                                if (!kVar.f3988q) {
                                    file2.delete();
                                }
                            }
                            break;
                        } else if (iHashCode == 3213448) {
                            if (scheme.equals("http")) {
                                kVar.c();
                                kVar.f3988q = true;
                                kVar.f3976c = false;
                                if (kVar.f3980h == null) {
                                    kVar.f3980h = FileProvider.d(downloadService, downloadService.getApplicationContext().getPackageName() + ".fileprovider", kVar.f3979g);
                                }
                                oVar = downloadService.f1158g;
                                if (oVar != null) {
                                    oVar.f(kVar.f3980h, kVar.f3983k, kVar.f3984l, kVar.f3985m, (String) kVar.f3987p.get());
                                }
                                mainActivity = oVar2.f4016a;
                                if (!TextUtils.isEmpty(str)) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("success", true);
                                    mainActivity.runOnUiThread(new androidx.emoji2.text.l(mainActivity, str, jSONObject2, 1));
                                }
                                if (!kVar.f3988q) {
                                    file2.delete();
                                }
                            } else {
                                o.g(oVar2.f4016a, str, "Unsupported URI scheme: " + uri.getScheme());
                                if (!kVar.f3988q) {
                                    file2.delete();
                                }
                            }
                            break;
                        } else if (iHashCode == 99617003 && scheme.equals("https")) {
                            kVar.c();
                            kVar.f3988q = true;
                            kVar.f3976c = false;
                            if (kVar.f3980h == null && kVar.f3979g != null) {
                                kVar.f3980h = FileProvider.d(downloadService, downloadService.getApplicationContext().getPackageName() + ".fileprovider", kVar.f3979g);
                            }
                            oVar = downloadService.f1158g;
                            if (oVar != null) {
                                oVar.f(kVar.f3980h, kVar.f3983k, kVar.f3984l, kVar.f3985m, (String) kVar.f3987p.get());
                            }
                            mainActivity = oVar2.f4016a;
                            if (!TextUtils.isEmpty(str)) {
                                try {
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("success", true);
                                    mainActivity.runOnUiThread(new androidx.emoji2.text.l(mainActivity, str, jSONObject3, 1));
                                    break;
                                } catch (JSONException unused) {
                                }
                            }
                            if (!kVar.f3988q && file != null) {
                                file2.delete();
                            }
                        } else {
                            o.g(oVar2.f4016a, str, "Unsupported URI scheme: " + uri.getScheme());
                            if (!kVar.f3988q && file != null) {
                                file2.delete();
                            }
                        }
                    } finally {
                        if (!kVar.f3988q && (file = kVar.f3979g) != null) {
                            file.delete();
                        }
                        kVar.f3976c = false;
                        kVar.f3979g = null;
                        kVar.f3988q = false;
                        kVar.a();
                    }
                } catch (FileNotFoundException unused2) {
                    o.g(oVar2.f4016a, str, "Failed to create download file. filename = " + kVar.f3981i + ", mimetype = " + kVar.f3983k + ".");
                    if (!kVar.f3988q && file != null) {
                        file2.delete();
                    }
                } catch (Exception e5) {
                    o.g(oVar2.f4016a, str, "Unexpected error occurred: " + e5.getLocalizedMessage());
                    if (!kVar.f3988q && file != null) {
                        file2.delete();
                    }
                }
                return;
            default:
                DownloadService downloadService2 = this.f3972g.f3989r;
                Toast.makeText(downloadService2, downloadService2.getString(R.string.file_download_error), 0).show();
                return;
        }
    }
}
