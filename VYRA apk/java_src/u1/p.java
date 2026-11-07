package u1;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.util.Log;
import android.webkit.WebChromeClient;
import androidx.core.content.FileProvider;
import co.median.android.eeqadjy.R;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.fragment.app.e0 f4041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z1.a f4042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f4043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f4044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f4045e;
    public r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4049j;

    public static boolean h(Uri uri, androidx.fragment.app.e0 e0Var) {
        Uri uri2;
        boolean z4;
        boolean z5;
        int columnIndex;
        try {
            uri2 = uri;
            try {
                Cursor cursorQuery = e0Var.getContentResolver().query(uri2, new String[]{"_size"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("_size")) < 0) {
                            cursorQuery.close();
                            z4 = false;
                        } else {
                            z4 = cursorQuery.getLong(columnIndex) > 0;
                            cursorQuery.close();
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            e4.a.j(cursorQuery, th);
                            throw th2;
                        }
                    }
                } else {
                    z4 = false;
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            uri2 = uri;
        }
        if (z4) {
            return true;
        }
        try {
            InputStream inputStreamOpenInputStream = e0Var.getContentResolver().openInputStream(uri2);
            if (inputStreamOpenInputStream != null) {
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i4 = inputStreamOpenInputStream.read(bArr);
                        if (i4 == -1) {
                            inputStreamOpenInputStream.close();
                            break;
                        }
                        if (i4 > 0) {
                            inputStreamOpenInputStream.close();
                            z5 = true;
                        }
                    }
                    z5 = false;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        e4.a.j(inputStreamOpenInputStream, th3);
                        throw th4;
                    }
                }
            } else {
                z5 = false;
            }
        } catch (IOException unused3) {
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:109:0x0213  */
    /* JADX WARN: Code duplicated, block: B:112:0x0229  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0116  */
    /* JADX WARN: Code duplicated, block: B:66:0x011c  */
    /* JADX WARN: Code duplicated, block: B:69:0x012f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0153  */
    /* JADX WARN: Code duplicated, block: B:74:0x015d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0161  */
    /* JADX WARN: Code duplicated, block: B:78:0x0172  */
    /* JADX WARN: Code duplicated, block: B:79:0x0174  */
    /* JADX WARN: Code duplicated, block: B:83:0x017b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0193  */
    /* JADX WARN: Code duplicated, block: B:89:0x019b  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a3  */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0161, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x0193, please report this as an issue */
    @Override // c.a
    public final Intent a(androidx.fragment.app.e0 e0Var, Object obj) {
        Intent intent;
        String str;
        StringBuilder sb;
        Iterator it;
        int i4;
        androidx.fragment.app.e0 e0Var2;
        Intent intentCreateChooser;
        String str2;
        boolean zEqualsIgnoreCase;
        Object next;
        List listI;
        Intent intent2;
        androidx.fragment.app.e0 e0Var3;
        r rVar;
        r rVar2;
        r rVar3 = (r) obj;
        rVar3.getClass();
        this.f4041a = e0Var;
        this.f = rVar3;
        x1.a aVarU = x1.a.u(e0Var);
        z1.a aVar = aVarU.f4686o1;
        aVar.getClass();
        this.f4042b = aVar;
        this.f4049j = aVarU.f4687p;
        this.f4048i = rVar3.f4069c;
        this.f4047h = rVar3.f4070d;
        this.f4045e = rVar3.f4068b;
        WebChromeClient.FileChooserParams fileChooserParams = rVar3.f4067a;
        if (fileChooserParams.getMode() == 1) {
            this.f4046g = true;
        }
        if (fileChooserParams.isCaptureEnabled()) {
            ArrayList arrayListJ = g() ? j() : k();
            if (arrayListJ.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return (Intent) arrayListJ.get(0);
        }
        ArrayList arrayList = new ArrayList();
        if (g()) {
            arrayList.addAll(j());
        }
        if ((this.f4048i && (rVar2 = this.f) != null) ? rVar2.b() : false) {
            arrayList.addAll(k());
        }
        if (g() ^ ((this.f4048i && (rVar = this.f) != null) ? rVar.b() : false)) {
            Intent intent3 = g() ? new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI) : new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
            intent3.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f4046g);
            androidx.fragment.app.e0 e0Var4 = this.f4041a;
            if (e0Var4 == null) {
                r3.g.c("context");
                throw null;
            }
            intentCreateChooser = Intent.createChooser(intent3, e0Var4.getString(R.string.choose_action));
        } else {
            r rVar4 = this.f;
            if (rVar4 == null) {
                intent = new Intent("android.intent.action.GET_CONTENT");
                List list = this.f4045e;
                if ((62 & 2) != 0) {
                    str = "";
                } else {
                    str = "[";
                }
                String str3 = (62 & 4) == 0 ? "]" : "";
                list.getClass();
                sb = new StringBuilder();
                sb.append((CharSequence) str);
                it = list.iterator();
                i4 = 0;
                while (it.hasNext()) {
                    next = it.next();
                    i4++;
                    if (i4 > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    if (next != null ? next instanceof CharSequence : true) {
                        sb.append((CharSequence) next);
                    } else if (next instanceof Character) {
                        sb.append(((Character) next).charValue());
                    } else {
                        sb.append((CharSequence) next.toString());
                    }
                }
                sb.append((CharSequence) str3);
                intent.setType(sb.toString());
                intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) this.f4045e.toArray(new String[0]));
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f4046g);
                intent.addCategory("android.intent.category.OPENABLE");
                if (i(intent).isEmpty()) {
                    str2 = Build.MANUFACTURER;
                    if (str2 == null) {
                        zEqualsIgnoreCase = false;
                    } else {
                        zEqualsIgnoreCase = str2.equalsIgnoreCase("samsung");
                    }
                    if (zEqualsIgnoreCase) {
                        intent = new Intent("com.sec.android.app.myfiles.PICK_DATA");
                        intent.putExtra("CONTENT_TYPE", "*/*");
                        intent.addCategory("android.intent.category.DEFAULT");
                    }
                }
                e0Var2 = this.f4041a;
                if (e0Var2 == null) {
                    r3.g.c("context");
                    throw null;
                }
                intentCreateChooser = Intent.createChooser(intent, e0Var2.getString(R.string.choose_action));
            } else {
                List list2 = rVar4.f4068b;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            String str4 = (String) it2.next();
                            str4.getClass();
                            if (str4.startsWith("image/") || str4.startsWith("video/")) {
                            }
                        } else {
                            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                            listI = i(new Intent("android.intent.action.PICK", uri));
                            if (listI.size() == 1) {
                                if (!listI.isEmpty()) {
                                    throw new NoSuchElementException("List is empty.");
                                }
                                if (r3.g.a(((ResolveInfo) listI.get(0)).activityInfo.packageName, "com.google.android.apps.photos")) {
                                }
                            }
                            intent2 = new Intent("android.intent.action.PICK", uri);
                            intent2.setType("image/*, video/*");
                            intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f4046g);
                            e0Var3 = this.f4041a;
                            if (e0Var3 != null) {
                                r3.g.c("context");
                                throw null;
                            }
                            intentCreateChooser = Intent.createChooser(intent2, e0Var3.getString(R.string.choose_action));
                        }
                        intent = new Intent("android.intent.action.GET_CONTENT");
                        List list3 = this.f4045e;
                        if ((62 & 2) != 0) {
                            str = "";
                        } else {
                            str = "[";
                        }
                        if ((62 & 4) == 0) {
                        }
                        list3.getClass();
                        sb = new StringBuilder();
                        sb.append((CharSequence) str);
                        it = list3.iterator();
                        i4 = 0;
                        while (it.hasNext()) {
                            next = it.next();
                            i4++;
                            if (i4 > 1) {
                                sb.append((CharSequence) ", ");
                            }
                            if (next != null ? next instanceof CharSequence : true) {
                                sb.append((CharSequence) next);
                            } else if (next instanceof Character) {
                                sb.append(((Character) next).charValue());
                            } else {
                                sb.append((CharSequence) next.toString());
                            }
                        }
                        sb.append((CharSequence) str3);
                        intent.setType(sb.toString());
                        intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) this.f4045e.toArray(new String[0]));
                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f4046g);
                        intent.addCategory("android.intent.category.OPENABLE");
                        if (i(intent).isEmpty()) {
                            str2 = Build.MANUFACTURER;
                            if (str2 == null) {
                                zEqualsIgnoreCase = false;
                            } else {
                                zEqualsIgnoreCase = str2.equalsIgnoreCase("samsung");
                            }
                            if (zEqualsIgnoreCase) {
                                intent = new Intent("com.sec.android.app.myfiles.PICK_DATA");
                                intent.putExtra("CONTENT_TYPE", "*/*");
                                intent.addCategory("android.intent.category.DEFAULT");
                            }
                        }
                        e0Var2 = this.f4041a;
                        if (e0Var2 == null) {
                            r3.g.c("context");
                            throw null;
                        }
                        intentCreateChooser = Intent.createChooser(intent, e0Var2.getString(R.string.choose_action));
                    }
                } else {
                    Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    listI = i(new Intent("android.intent.action.PICK", uri2));
                    if (listI.size() == 1) {
                        if (!listI.isEmpty()) {
                            throw new NoSuchElementException("List is empty.");
                        }
                        if (r3.g.a(((ResolveInfo) listI.get(0)).activityInfo.packageName, "com.google.android.apps.photos")) {
                            intent = new Intent("android.intent.action.GET_CONTENT");
                            List list4 = this.f4045e;
                            if ((62 & 2) != 0) {
                                str = "";
                            } else {
                                str = "[";
                            }
                            if ((62 & 4) == 0) {
                            }
                            list4.getClass();
                            sb = new StringBuilder();
                            sb.append((CharSequence) str);
                            it = list4.iterator();
                            i4 = 0;
                            while (it.hasNext()) {
                                next = it.next();
                                i4++;
                                if (i4 > 1) {
                                    sb.append((CharSequence) ", ");
                                }
                                if (next != null ? next instanceof CharSequence : true) {
                                    sb.append((CharSequence) next);
                                } else if (next instanceof Character) {
                                    sb.append(((Character) next).charValue());
                                } else {
                                    sb.append((CharSequence) next.toString());
                                }
                            }
                            sb.append((CharSequence) str3);
                            intent.setType(sb.toString());
                            intent.putExtra("android.intent.extra.MIME_TYPES", (String[]) this.f4045e.toArray(new String[0]));
                            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f4046g);
                            intent.addCategory("android.intent.category.OPENABLE");
                            if (i(intent).isEmpty()) {
                                str2 = Build.MANUFACTURER;
                                if (str2 == null) {
                                    zEqualsIgnoreCase = false;
                                } else {
                                    zEqualsIgnoreCase = str2.equalsIgnoreCase("samsung");
                                }
                                if (zEqualsIgnoreCase) {
                                    intent = new Intent("com.sec.android.app.myfiles.PICK_DATA");
                                    intent.putExtra("CONTENT_TYPE", "*/*");
                                    intent.addCategory("android.intent.category.DEFAULT");
                                }
                            }
                            e0Var2 = this.f4041a;
                            if (e0Var2 == null) {
                                r3.g.c("context");
                                throw null;
                            }
                            intentCreateChooser = Intent.createChooser(intent, e0Var2.getString(R.string.choose_action));
                        }
                    }
                    intent2 = new Intent("android.intent.action.PICK", uri2);
                    intent2.setType("image/*, video/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f4046g);
                    e0Var3 = this.f4041a;
                    if (e0Var3 != null) {
                        r3.g.c("context");
                        throw null;
                    }
                    intentCreateChooser = Intent.createChooser(intent2, e0Var3.getString(R.string.choose_action));
                }
            }
        }
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        return intentCreateChooser;
    }

    @Override // c.a
    public final Object c(int i4, Intent intent) {
        Object objNormalizeScheme;
        if (i4 != -1) {
            f();
            return new s(false, null, false);
        }
        if (intent != null) {
            if (intent.getData() != null) {
                Uri uriD = this.f4044d;
                if (uriD != null) {
                    androidx.fragment.app.e0 e0Var = this.f4041a;
                    if (e0Var == null) {
                        r3.g.c("context");
                        throw null;
                    }
                    if (h(uriD, e0Var)) {
                        Uri[] result = WebChromeClient.FileChooserParams.parseResult(i4, intent);
                        Uri uri = result != null ? result[0] : null;
                        Uri uriNormalizeScheme = uriD.normalizeScheme();
                        if (uri == null || (objNormalizeScheme = uri.normalizeScheme()) == null) {
                            objNormalizeScheme = Boolean.FALSE;
                        }
                        if (r3.g.a(uriNormalizeScheme, objNormalizeScheme)) {
                            z1.a aVar = this.f4042b;
                            if (aVar == null) {
                                r3.g.c("cameraConfig");
                                throw null;
                            }
                            if (aVar.f4856b && this.f4047h) {
                                uriD = d(uriD, "video");
                            }
                            return new s(true, new Uri[]{uriD}, false);
                        }
                    }
                }
                return new s(true, WebChromeClient.FileChooserParams.parseResult(i4, intent), false);
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                v3.b bVar = itemCount <= Integer.MIN_VALUE ? v3.b.f4406i : new v3.b(0, itemCount - 1, 1);
                ArrayList arrayList = new ArrayList();
                Iterator it = bVar.iterator();
                while (true) {
                    v3.a aVar2 = (v3.a) it;
                    boolean z4 = aVar2.f4404h;
                    if (!z4) {
                        return new s(true, (Uri[]) arrayList.toArray(new Uri[0]), false);
                    }
                    int i5 = aVar2.f4405i;
                    if (i5 != aVar2.f4403g) {
                        aVar2.f4405i = aVar2.f + i5;
                    } else {
                        if (!z4) {
                            throw new NoSuchElementException();
                        }
                        aVar2.f4404h = false;
                    }
                    Uri uri2 = clipData.getItemAt(i5).getUri();
                    if (uri2 != null) {
                        arrayList.add(uri2);
                    }
                }
            }
        }
        Uri uriD2 = this.f4043c;
        if (uriD2 != null) {
            androidx.fragment.app.e0 e0Var2 = this.f4041a;
            if (e0Var2 == null) {
                r3.g.c("context");
                throw null;
            }
            if (h(uriD2, e0Var2)) {
                z1.a aVar3 = this.f4042b;
                if (aVar3 == null) {
                    r3.g.c("cameraConfig");
                    throw null;
                }
                if (aVar3.f4856b && this.f4047h) {
                    uriD2 = d(uriD2, "image");
                }
                z1.a aVar4 = this.f4042b;
                if (aVar4 != null) {
                    return new s(true, new Uri[]{uriD2}, aVar4.f4855a == 1);
                }
                r3.g.c("cameraConfig");
                throw null;
            }
        }
        Uri uriD3 = this.f4044d;
        if (uriD3 != null) {
            androidx.fragment.app.e0 e0Var3 = this.f4041a;
            if (e0Var3 == null) {
                r3.g.c("context");
                throw null;
            }
            if (h(uriD3, e0Var3)) {
                z1.a aVar5 = this.f4042b;
                if (aVar5 == null) {
                    r3.g.c("cameraConfig");
                    throw null;
                }
                if (aVar5.f4856b && this.f4047h) {
                    uriD3 = d(uriD3, "video");
                }
                return new s(true, new Uri[]{uriD3}, false);
            }
        }
        f();
        return new s(false, null, false);
    }

    public final Uri d(Uri uri, String str) {
        g3.e eVar;
        Uri uriD;
        String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.equals("image")) {
            eVar = new g3.e(androidx.fragment.app.u.m("IMG_", str2, ".jpg"), "image/jpeg", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        } else {
            if (!lowerCase.equals("video")) {
                androidx.fragment.app.q.q("Unsupported media type: ".concat(str));
                return null;
            }
            eVar = new g3.e(androidx.fragment.app.u.m("VID_", str2, ".mp4"), "video/mp4", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        }
        Uri uri2 = (Uri) eVar.f2154h;
        int i4 = Build.VERSION.SDK_INT;
        String str3 = eVar.f;
        if (i4 >= 29) {
            androidx.fragment.app.e0 e0Var = this.f4041a;
            if (e0Var == null) {
                r3.g.c("context");
                throw null;
            }
            ContentResolver contentResolver = e0Var.getContentResolver();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str3);
            contentValues.put("mime_type", eVar.f2153g);
            contentValues.put("relative_path", Environment.DIRECTORY_DCIM + "/Camera");
            uriD = contentResolver.insert(uri2, contentValues);
        } else {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
            file.mkdirs();
            File file2 = new File(file, str3);
            androidx.fragment.app.e0 e0Var2 = this.f4041a;
            if (e0Var2 == null) {
                r3.g.c("context");
                throw null;
            }
            uriD = FileProvider.d(e0Var2, e0Var2.getPackageName() + ".fileprovider", file2);
        }
        if (uriD != null) {
            try {
                androidx.fragment.app.e0 e0Var3 = this.f4041a;
                if (e0Var3 == null) {
                    r3.g.c("context");
                    throw null;
                }
                InputStream inputStreamOpenInputStream = e0Var3.getContentResolver().openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    throw new IOException("Failed to open input stream for " + uri);
                }
                try {
                    androidx.fragment.app.e0 e0Var4 = this.f4041a;
                    if (e0Var4 == null) {
                        r3.g.c("context");
                        throw null;
                    }
                    OutputStream outputStreamOpenOutputStream = e0Var4.getContentResolver().openOutputStream(uriD);
                    if (outputStreamOpenOutputStream == null) {
                        throw new IOException("Failed to open output stream for " + uriD);
                    }
                    try {
                        byte[] bArr = new byte[8192];
                        for (int i5 = inputStreamOpenInputStream.read(bArr); i5 >= 0; i5 = inputStreamOpenInputStream.read(bArr)) {
                            outputStreamOpenOutputStream.write(bArr, 0, i5);
                        }
                        outputStreamOpenOutputStream.close();
                        inputStreamOpenInputStream.close();
                        f();
                        return uriD;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            e4.a.j(outputStreamOpenOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        e4.a.j(inputStreamOpenInputStream, th3);
                        throw th4;
                    }
                }
                Log.e("FileUploadContract", "Failed to copy " + str + " to gallery", e);
            } catch (Exception e5) {
                Log.e("FileUploadContract", "Failed to copy " + str + " to gallery", e5);
            }
        }
        return uri;
    }

    public final Uri e(boolean z4) {
        String str = z4 ? "temp_video_recording.mp4" : "temp_capture_image.jpg";
        androidx.fragment.app.e0 e0Var = this.f4041a;
        if (e0Var == null) {
            r3.g.c("context");
            throw null;
        }
        File file = new File(e0Var.getCacheDir(), "downloads");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        androidx.fragment.app.e0 e0Var2 = this.f4041a;
        if (e0Var2 == null) {
            r3.g.c("context");
            throw null;
        }
        Uri uriD = FileProvider.d(e0Var2, e0Var2.getApplicationContext().getPackageName() + ".fileprovider", file2);
        uriD.getClass();
        return uriD;
    }

    public final void f() {
        Uri uri = this.f4043c;
        if (uri != null) {
            androidx.fragment.app.e0 e0Var = this.f4041a;
            if (e0Var == null) {
                r3.g.c("context");
                throw null;
            }
            e0Var.getContentResolver().delete(uri, null, null);
            this.f4043c = null;
        }
        Uri uri2 = this.f4044d;
        if (uri2 != null) {
            androidx.fragment.app.e0 e0Var2 = this.f4041a;
            if (e0Var2 == null) {
                r3.g.c("context");
                throw null;
            }
            e0Var2.getContentResolver().delete(uri2, null, null);
            this.f4044d = null;
        }
    }

    public final boolean g() {
        r rVar;
        if (this.f4048i && (rVar = this.f) != null) {
            return rVar.a();
        }
        return false;
    }

    public final List i(Intent intent) {
        int i4 = Build.VERSION.SDK_INT;
        androidx.fragment.app.e0 e0Var = this.f4041a;
        if (i4 >= 33) {
            if (e0Var == null) {
                r3.g.c("context");
                throw null;
            }
            List listQueryIntentActivities = e0Var.getPackageManager().queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L));
            listQueryIntentActivities.getClass();
            return listQueryIntentActivities;
        }
        if (e0Var == null) {
            r3.g.c("context");
            throw null;
        }
        List<ResolveInfo> listQueryIntentActivities2 = e0Var.getPackageManager().queryIntentActivities(intent, 65536);
        listQueryIntentActivities2.getClass();
        return listQueryIntentActivities2;
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        androidx.fragment.app.e0 e0Var = this.f4041a;
        if (e0Var == null) {
            r3.g.c("context");
            throw null;
        }
        if (x1.a.u(e0Var).f4687p) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            Uri uriE = e(false);
            this.f4043c = uriE;
            intent.putExtra("output", uriE);
            for (ResolveInfo resolveInfo : i(intent)) {
                String str = resolveInfo.activityInfo.packageName;
                Intent intent2 = new Intent(intent);
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                intent2.setPackage(str);
                arrayList.add(intent2);
            }
        }
        return arrayList;
    }

    public final ArrayList k() {
        ArrayList arrayList = new ArrayList();
        if (this.f4049j) {
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            z1.a aVar = this.f4042b;
            if (aVar == null) {
                r3.g.c("cameraConfig");
                throw null;
            }
            if (aVar.f4855a == 2) {
                intent.putExtra("android.intent.extra.videoQuality", 1);
            } else {
                intent.putExtra("android.intent.extra.videoQuality", 0);
            }
            Uri uriE = e(true);
            this.f4044d = uriE;
            intent.putExtra("output", uriE);
            for (ResolveInfo resolveInfo : i(intent)) {
                String str = resolveInfo.activityInfo.packageName;
                Intent intent2 = new Intent(intent);
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                intent2.setPackage(str);
                arrayList.add(intent2);
            }
        }
        return arrayList;
    }
}
