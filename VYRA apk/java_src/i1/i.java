package i1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r.h f2263a = new r.h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f2264b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a3.f f2265c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? g.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static a3.f b() {
        a3.f fVar = new a3.f(16);
        f2265c = fVar;
        r.h hVar = f2263a;
        hVar.getClass();
        if (r.g.f3490k.g(hVar, null, fVar)) {
            r.g.b(hVar);
        }
        return f2265c;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    public static void c(Context context, boolean z4) {
        int i4;
        boolean z5;
        int i5;
        File file;
        boolean z6;
        File file2;
        long length;
        boolean z7;
        File file3;
        h hVarA;
        h hVar;
        int i6;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z4 || f2265c == null) {
            synchronized (f2264b) {
                if (z4) {
                    i4 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        long jA = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            hVarA = h.a(file3);
                        } else {
                            hVarA = null;
                        }
                        if (hVarA == null) {
                            if (!z5) {
                                i4 = 327680;
                            } else if (z6) {
                                i4 = 1;
                            } else if (z7) {
                                i4 = 2;
                            }
                        } else if (!z5) {
                            i4 = 327680;
                        } else if (z6) {
                            i4 = 1;
                        } else if (z7) {
                            i4 = 2;
                        }
                        if (z4) {
                            i4 = 2;
                        }
                        if (hVarA != null) {
                            i4 = 3;
                        }
                        hVar = new h(1, i4, jA, length);
                        if (hVarA != null) {
                            hVar.b(file3);
                        } else {
                            hVar.b(file3);
                        }
                        b();
                        return;
                    }
                    b();
                    return;
                }
                if (f2265c != null) {
                    return;
                }
                i4 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                    z5 = false;
                }
                i5 = Build.VERSION.SDK_INT;
                if (i5 >= 28 && i5 != 30) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    if (file.exists() || length3 <= 0) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists() || length <= 0) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    try {
                        long jA2 = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                hVarA = h.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            hVarA = null;
                        }
                        if (hVarA == null && hVarA.f2261c == jA2 && (i6 = hVarA.f2260b) != 2) {
                            i4 = i6;
                        } else if (!z5) {
                            i4 = 327680;
                        } else if (z6) {
                            i4 = 1;
                        } else if (z7) {
                            i4 = 2;
                        }
                        if (z4 && z7 && i4 != 1) {
                            i4 = 2;
                        }
                        if (hVarA != null && hVarA.f2260b == 2 && i4 == 1 && length3 < hVarA.f2262d) {
                            i4 = 3;
                        }
                        hVar = new h(1, i4, jA2, length);
                        if (hVarA != null || !hVarA.equals(hVar)) {
                            try {
                                hVar.b(file3);
                            } catch (IOException unused3) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        b();
                        return;
                    }
                }
                b();
                return;
                throw th;
            }
        }
    }
}
