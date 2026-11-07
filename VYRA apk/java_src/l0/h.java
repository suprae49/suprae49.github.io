package l0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p.j f2996a = new p.j(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f2997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f2998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p.k f2999d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new k());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2997b = threadPoolExecutor;
        f2998c = new Object();
        f2999d = new p.k(0);
    }

    public static String a(List list, int i4) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < list.size(); i5++) {
            sb.append(((d) list.get(i5)).f2986g);
            sb.append("-");
            sb.append(i4);
            if (i5 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static g b(String str, Context context, List list, int i4) {
        int i5;
        Typeface typefaceP;
        p.j jVar = f2996a;
        e4.a.c("getFontSync");
        try {
            Typeface typeface = (Typeface) jVar.get(str);
            if (typeface != null) {
                g gVar = new g(typeface);
                Trace.endSection();
                return gVar;
            }
            try {
                e.f fVarA = c.a(context, list);
                List list2 = (List) fVarA.f1920g;
                int i6 = fVarA.f;
                if (i6 == 0) {
                    i[] iVarArr = (i[]) list2.get(0);
                    if (iVarArr == null || iVarArr.length == 0) {
                        i5 = 1;
                    } else {
                        int length = iVarArr.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                i5 = 0;
                                break;
                            }
                            int i8 = iVarArr[i7].f;
                            if (i8 != 0) {
                                if (i8 >= 0) {
                                    i5 = i8;
                                    break;
                                }
                                i5 = -3;
                                break;
                            }
                            i7++;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        i5 = -3;
                        break;
                    }
                    i5 = -2;
                }
                if (i5 != 0) {
                    g gVar2 = new g(i5);
                    Trace.endSection();
                    return gVar2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    i[] iVarArr2 = (i[]) list2.get(0);
                    e4.a aVar = f0.e.f2073a;
                    e4.a.c("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceP = f0.e.f2073a.p(context, iVarArr2, i4);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    e4.a aVar2 = f0.e.f2073a;
                    e4.a.c("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceP = f0.e.f2073a.q(context, list2, i4);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceP == null) {
                    g gVar3 = new g(-3);
                    Trace.endSection();
                    return gVar3;
                }
                jVar.put(str, typefaceP);
                g gVar4 = new g(typefaceP);
                Trace.endSection();
                return gVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                g gVar5 = new g(-1);
                Trace.endSection();
                return gVar5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
