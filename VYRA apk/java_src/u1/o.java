package u1;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.DownloadListener;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import co.median.android.DownloadService;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import java.io.File;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements DownloadListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Uri f4015j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f4016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b.g f4018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e2 f4019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4020e;
    public DownloadService f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4021g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n f4022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f4023i;

    public o(MainActivity mainActivity) {
        m mVar = new m(this);
        this.f4023i = mVar;
        this.f4016a = mainActivity;
        z1.d dVar = x1.a.u(mainActivity).J0;
        if (!dVar.f4864b) {
            this.f4017b = 2;
        } else if (Build.VERSION.SDK_INT <= 28 && !dVar.f4865c) {
            this.f4017b = 2;
        } else {
            this.f4017b = 1;
        }
        mainActivity.bindService(new Intent(mainActivity, (Class<?>) DownloadService.class), mVar, 1);
        this.f4018c = (b.g) mainActivity.s(new androidx.fragment.app.r0(1), new p1.h(this, mainActivity));
    }

    public static Uri a(ContentResolver contentResolver, String str, String str2, String str3) {
        Uri contentUri;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", str2);
        contentValues.put("relative_path", str3);
        if (Objects.equals(str3, Environment.DIRECTORY_PICTURES)) {
            contentUri = MediaStore.Images.Media.getContentUri("external");
        } else {
            contentUri = Objects.equals(str3, Environment.DIRECTORY_DOWNLOADS) ? MediaStore.Files.getContentUri("external") : null;
        }
        if (contentUri == null) {
            return null;
        }
        try {
            Uri uriInsert = contentResolver.insert(contentUri, contentValues);
            return uriInsert == null ? c(contentUri, contentResolver, contentValues, str, str2) : uriInsert;
        } catch (IllegalStateException unused) {
            return c(contentUri, contentResolver, contentValues, str, str2);
        }
    }

    public static File b(File file, String str, String str2) {
        String name = str + "." + str2;
        if (new File(file, name).exists()) {
            String strSubstring = name.substring(0, name.lastIndexOf(46));
            String strSubstring2 = name.substring(name.lastIndexOf(46));
            File file2 = new File(file, strSubstring + "_1" + strSubstring2);
            int i4 = 1;
            while (file2.exists()) {
                i4++;
                file2 = new File(file, strSubstring + "_" + i4 + strSubstring2);
            }
            name = file2.getName();
        }
        return new File(file, name);
    }

    public static Uri c(Uri uri, ContentResolver contentResolver, ContentValues contentValues, String str, String str2) {
        try {
            try {
                contentValues.put("_display_name", e(contentResolver, uri, str, MimeTypeMap.getSingleton().getExtensionFromMimeType(str2)));
                return contentResolver.insert(uri, contentValues);
            } catch (IllegalStateException unused) {
                return null;
            }
        } catch (IllegalStateException unused2) {
            contentValues.put("_display_name", str + "_" + System.currentTimeMillis());
            return contentResolver.insert(uri, contentValues);
        }
    }

    public static String d(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            return null;
        }
        return iLastIndexOf == 0 ? str : str.substring(iLastIndexOf + 1);
    }

    public static String e(ContentResolver contentResolver, Uri uri, String str, String str2) {
        Cursor cursorQuery;
        String str3 = str;
        int i4 = 1;
        while (true) {
            ContentResolver contentResolver2 = contentResolver;
            Uri uri2 = uri;
            try {
                cursorQuery = contentResolver2.query(uri2, new String[]{"_display_name"}, "_display_name=?", new String[]{str3 + "." + str2}, null);
                if (cursorQuery == null) {
                    break;
                }
                try {
                    if (!cursorQuery.moveToFirst()) {
                        break;
                    }
                    cursorQuery.close();
                    str3 = str + " (" + i4 + ")";
                    i4++;
                    contentResolver = contentResolver2;
                    uri = uri2;
                } catch (Throwable th) {
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Exception e5) {
                Log.w("u1.o", "externalFileExists: ", e5);
                return str3;
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(x1.g gVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", false);
            jSONObject.put("error", str2);
            ((Activity) gVar).runOnUiThread(new androidx.emoji2.text.l(gVar, str, jSONObject, 1));
        } catch (JSONException unused) {
        }
    }

    public static void k(Activity activity, Uri uri, String str, boolean z4) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, str);
            intent.setFlags(268435457);
            activity.startActivity(intent);
            if (z4) {
                f4015j = uri;
            }
        } catch (ActivityNotFoundException unused) {
            activity.runOnUiThread(new androidx.activity.p(activity, 6, activity.getResources().getString(R.string.file_handler_not_found)));
        } catch (Exception e5) {
            x1.f.a().d("u1.o", "viewFile: Exception:", e5);
        }
    }

    public final void f(Uri uri, String str, final boolean z4, boolean z5, final String str2) {
        if (uri == null) {
            return;
        }
        int i4 = this.f4017b;
        MainActivity mainActivity = this.f4016a;
        if (i4 != 1) {
            if (z5) {
                k(mainActivity, uri, str, true);
                return;
            } else {
                mainActivity.runOnUiThread(new androidx.activity.p(this, 5, str2));
                return;
            }
        }
        if (z4) {
            Log.d("u1.o", "addFileToGallery: Adding to Albums . . .");
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(uri);
            mainActivity.sendBroadcast(intent);
        }
        if (z5) {
            k(mainActivity, uri, str, false);
        } else {
            mainActivity.runOnUiThread(new Runnable() { // from class: u1.l
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity mainActivity2 = this.f.f4016a;
                    if (z4) {
                        Toast.makeText(mainActivity2, R.string.file_download_finished_gallery, 0).show();
                    } else {
                        Toast.makeText(mainActivity2, String.format(mainActivity2.getString(R.string.file_download_finished_with_name), str2), 0).show();
                    }
                }
            });
        }
    }

    public final boolean h(n nVar) {
        if (Build.VERSION.SDK_INT > 28 || this.f4017b != 1 || c0.c.checkSelfPermission(this.f4016a, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        this.f4022h = nVar;
        this.f4018c.a(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
        return true;
    }

    public final void i(n nVar, String str) {
        DownloadService downloadService = this.f;
        androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(this, str, 15, false);
        downloadService.getClass();
        k kVar = new k(downloadService, nVar.f4006a, nVar.f4007b, nVar.f4008c, nVar.f4009d, nVar.f4010e, this.f4017b, pVar);
        downloadService.f1159h.put(Integer.valueOf(kVar.f3974a), kVar);
        Log.d("DownloadService", "startDownload: Starting download");
        kVar.f3976c = true;
        new Thread(new j(kVar, 0)).start();
    }

    public final void j(String str, String str2, String str3, boolean z4, boolean z5, String str4) {
        if (!this.f4021g) {
            x1.f.a().d("u1.o", "verifyAndStartDownload: Unable to start download.", new Exception("DownloadService not bound."));
            return;
        }
        n nVar = new n();
        nVar.f4006a = str;
        nVar.f4007b = str2;
        nVar.f4008c = str3;
        nVar.f4009d = z4;
        nVar.f4010e = z5;
        nVar.f = false;
        nVar.f4011g = str4;
        if (h(nVar)) {
            return;
        }
        i(nVar, str4);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j4) {
        String mimeTypeFromExtension;
        String str5;
        e2 e2Var = this.f4019d;
        if (e2Var != null) {
            e2Var.f3906g.removeCallbacksAndMessages(null);
            e2Var.f3907h = 4;
        }
        d3.d0 d0Var = new d3.d0(10, this);
        MainActivity mainActivity = this.f4016a;
        mainActivity.runOnUiThread(d0Var);
        String strS = TextUtils.isEmpty(str3) ? null : t2.i.s(str, str3, str4);
        if (str.startsWith("blob:")) {
            boolean z4 = this.f4017b == 2;
            if (h(new n(str, strS, z4, ""))) {
                return;
            }
            mainActivity.f1170a0.d(str, strS, z4, "");
            return;
        }
        this.f4020e = str;
        if (str4 == null || str4.equalsIgnoreCase("application/force-download") || str4.equalsIgnoreCase("application/octet-stream")) {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
            if (fileExtensionFromUrl == null || fileExtensionFromUrl.isEmpty() || (mimeTypeFromExtension = singleton.getMimeTypeFromExtension(fileExtensionFromUrl)) == null) {
                str5 = str4;
            } else {
                str5 = mimeTypeFromExtension;
            }
        } else {
            str5 = str4;
        }
        j(str, strS, str5, false, false, "");
    }
}
