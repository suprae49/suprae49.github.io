package u1;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.MimeTypeMap;
import co.median.android.DownloadService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HttpURLConnection f3977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InputStream f3978e;
    public FileOutputStream f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f3980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f3981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f3982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f3983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3985m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.emoji2.text.p f3986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicReference f3987p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ DownloadService f3989r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public File f3979g = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3988q = false;

    public k(DownloadService downloadService, String str, String str2, String str3, boolean z4, boolean z5, int i4, androidx.emoji2.text.p pVar) {
        this.f3989r = downloadService;
        int i5 = downloadService.f1160i;
        downloadService.f1160i = i5 + 1;
        this.f3974a = i5;
        this.f3975b = str;
        this.f3981i = str2;
        this.f3983k = str3;
        this.f3976c = false;
        this.f3984l = z4;
        this.f3985m = z5;
        this.n = i4;
        this.f3986o = pVar;
        this.f3987p = new AtomicReference(str2);
    }

    public final void a() {
        try {
            InputStream inputStream = this.f3978e;
            if (inputStream != null) {
                inputStream.close();
            }
            FileOutputStream fileOutputStream = this.f;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            HttpURLConnection httpURLConnection = this.f3977d;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (IOException e5) {
            x1.f.a().d("DownloadService", "startDownload: ", e5);
        }
    }

    public final void b() throws IOException {
        String schemeSpecificPart = Uri.parse(this.f3975b).getSchemeSpecificPart();
        this.f3983k = schemeSpecificPart.substring(0, schemeSpecificPart.indexOf(";"));
        this.f3982j = MimeTypeMap.getSingleton().getExtensionFromMimeType(this.f3983k);
        if (TextUtils.isEmpty(this.f3981i)) {
            int iIndexOf = schemeSpecificPart.indexOf("filename=");
            if (iIndexOf != -1) {
                int i4 = iIndexOf + 9;
                int iIndexOf2 = schemeSpecificPart.indexOf(";", i4);
                this.f3981i = Uri.decode(iIndexOf2 != -1 ? schemeSpecificPart.substring(i4, iIndexOf2) : schemeSpecificPart.substring(i4));
            }
            if (TextUtils.isEmpty(this.f3981i)) {
                this.f3981i = "download";
            }
        }
        if (!Objects.equals(this.f3981i, "download")) {
            String strD = o.d(this.f3981i);
            if (!TextUtils.isEmpty(strD)) {
                this.f3982j = strD;
                if (!Objects.equals(this.f3981i, strD)) {
                    String str = this.f3981i;
                    this.f3981i = str.substring(0, str.length() - (strD.length() + 1));
                    this.f3983k = MimeTypeMap.getSingleton().getMimeTypeFromExtension(this.f3982j);
                }
            }
        }
        d();
        if (schemeSpecificPart.contains(";base64")) {
            this.f.write(Base64.decode(schemeSpecificPart.substring(schemeSpecificPart.indexOf(";base64,") + 8), 0));
        } else {
            this.f.write(schemeSpecificPart.substring(schemeSpecificPart.indexOf(",") + 1).getBytes(StandardCharsets.UTF_8));
        }
    }

    public final void c() throws IOException {
        String str = this.f3975b;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f3977d = httpURLConnection;
        httpURLConnection.setInstanceFollowRedirects(true);
        this.f3977d.setRequestProperty("User-Agent", this.f3989r.f1161j);
        this.f3977d.setConnectTimeout(5000);
        this.f3977d.connect();
        if (this.f3977d.getResponseCode() != 200) {
            x1.f.a().d("DownloadService", "Server returned HTTP " + this.f3977d.getResponseCode() + " " + this.f3977d.getResponseMessage(), null);
            this.f3976c = false;
            String str2 = "Response code: " + this.f3977d.getResponseCode() + ". " + this.f3977d.getResponseMessage();
            androidx.emoji2.text.p pVar = this.f3986o;
            o.g(((o) pVar.f569h).f4016a, (String) pVar.f568g, str2);
            return;
        }
        Log.d("DownloadService", "startDownload: File size in MB: " + (((double) this.f3977d.getContentLength()) / 1048576.0d));
        if (this.f3977d.getHeaderField("Content-Type") != null) {
            this.f3983k = this.f3977d.getHeaderField("Content-Type");
        }
        if (TextUtils.isEmpty(this.f3981i)) {
            String strS = t2.i.s(str, this.f3977d.getHeaderField("Content-Disposition"), this.f3983k);
            int iLastIndexOf = strS.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                this.f3981i = strS;
                this.f3982j = "";
            } else if (iLastIndexOf == 0) {
                this.f3981i = "download";
                this.f3982j = strS.substring(1);
            } else {
                this.f3981i = strS.substring(0, iLastIndexOf);
                this.f3982j = strS.substring(iLastIndexOf + 1);
            }
            if (!TextUtils.isEmpty(this.f3982j)) {
                this.f3983k = MimeTypeMap.getSingleton().getMimeTypeFromExtension(this.f3982j);
            }
        } else {
            String strD = o.d(this.f3981i);
            this.f3982j = strD;
            if (TextUtils.isEmpty(strD)) {
                this.f3982j = MimeTypeMap.getSingleton().getExtensionFromMimeType(this.f3983k);
            } else if (Objects.equals(this.f3981i, this.f3982j)) {
                this.f3981i = "download";
            } else {
                String str3 = this.f3981i;
                this.f3981i = str3.substring(0, str3.length() - (this.f3982j.length() + 1));
                this.f3983k = MimeTypeMap.getSingleton().getMimeTypeFromExtension(this.f3982j);
            }
        }
        d();
        int contentLength = this.f3977d.getContentLength();
        this.f3978e = this.f3977d.getInputStream();
        byte[] bArr = new byte[4096];
        int i4 = 0;
        while (true) {
            int i5 = this.f3978e.read(bArr);
            if (i5 == -1 || !this.f3976c) {
                return;
            }
            this.f.write(bArr, 0, i5);
            i4 += i5;
            Log.d("DownloadService", "startDownload: Download progress: " + ((i4 * 100) / contentLength));
        }
    }

    public final void d() {
        AtomicReference atomicReference = this.f3987p;
        DownloadService downloadService = this.f3989r;
        if (this.n != 1) {
            this.f3985m = true;
            File fileB = o.b(downloadService.getFilesDir(), this.f3981i, this.f3982j);
            this.f3979g = fileB;
            atomicReference.set(fileB.getName());
            this.f = new FileOutputStream(this.f3979g);
            return;
        }
        if (Build.VERSION.SDK_INT <= 28) {
            if (this.f3984l) {
                this.f3979g = o.b(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), this.f3981i, this.f3982j);
            } else {
                this.f3979g = o.b(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), this.f3981i, this.f3982j);
            }
            atomicReference.set(this.f3979g.getName());
            this.f = new FileOutputStream(this.f3979g);
            return;
        }
        ContentResolver contentResolver = downloadService.getApplicationContext().getContentResolver();
        if (this.f3984l && this.f3983k.contains("image")) {
            this.f3980h = o.a(contentResolver, this.f3981i, this.f3983k, Environment.DIRECTORY_PICTURES);
        } else {
            this.f3980h = o.a(contentResolver, this.f3981i, this.f3983k, Environment.DIRECTORY_DOWNLOADS);
            this.f3984l = false;
        }
        Uri uri = this.f3980h;
        String string = null;
        if (uri == null) {
            this.f3976c = false;
            downloadService.f.post(new j(this, 1));
            x1.f.a().d("DownloadService", "Error creating file - filename: " + this.f3981i + ", mimetype: " + this.f3983k, null);
            return;
        }
        Cursor cursorQuery = contentResolver.query(uri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery != null) {
            try {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndex("_display_name")) : null;
                cursorQuery.close();
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        atomicReference.set(string);
        this.f = (FileOutputStream) contentResolver.openOutputStream(this.f3980h);
    }
}
