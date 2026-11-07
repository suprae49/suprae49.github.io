package f0;

import a3.h0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.p;
import androidx.activity.x;
import androidx.fragment.app.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p.j;
import p.k;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e4.a f2073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f2074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Paint f2075c;

    static {
        e4.a.c("TypefaceCompat static init");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            f2073a = new i();
        } else if (i4 >= 29) {
            f2073a = new h();
        } else if (i4 >= 28) {
            f2073a = new g();
        } else {
            f2073a = new f();
        }
        f2074b = new j(16);
        f2075c = null;
        Trace.endSection();
    }

    public static Typeface a(Context context, e0.e eVar, Resources resources, int i4, String str, int i5, int i6, e0.b bVar, boolean z4) {
        Typeface typefaceO;
        Typeface typefaceBuild;
        FontFamily fontFamilyBuild;
        int i7 = 2;
        int i8 = -3;
        if (eVar instanceof e0.h) {
            e0.h hVar = (e0.h) eVar;
            String str2 = hVar.f2025d;
            typefaceO = null;
            int i9 = 1;
            int i10 = 0;
            if (TextUtils.isEmpty(str2) || (typefaceBuild = c(str2)) == null) {
                ArrayList arrayList = hVar.f2022a;
                if (arrayList.size() != 1) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilderC = null;
                                int i12 = 0;
                                while (true) {
                                    if (i12 < arrayList.size()) {
                                        l0.d dVar = (l0.d) arrayList.get(i12);
                                        if (i12 == arrayList.size() - 1 && TextUtils.isEmpty(dVar.f)) {
                                            customFallbackBuilderC.setSystemFallback(dVar.f2985e);
                                        } else {
                                            String str3 = dVar.f2985e;
                                            String str4 = dVar.f;
                                            Font fontD = d(c(str3));
                                            if (fontD == null) {
                                                Log.w("TypefaceCompat", "Unable identify the primary font for " + dVar.f2985e + ". Falling back to provider font.");
                                            } else {
                                                if (TextUtils.isEmpty(str4)) {
                                                    fontFamilyBuild = x.i(fontD).build();
                                                } else {
                                                    try {
                                                        x.o();
                                                        x.z();
                                                        fontFamilyBuild = x.i(com.google.android.gms.common.internal.a.g(fontD).setFontVariationSettings(str4).build()).build();
                                                    } catch (IOException unused) {
                                                        Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                                    }
                                                }
                                                if (customFallbackBuilderC == null) {
                                                    customFallbackBuilderC = x.c(fontFamilyBuild);
                                                } else {
                                                    customFallbackBuilderC.addCustomFallback(fontFamilyBuild);
                                                }
                                                i12++;
                                            }
                                        }
                                    }
                                    typefaceBuild = customFallbackBuilderC.build();
                                    break;
                                }
                            }
                            if (c(((l0.d) arrayList.get(i11)).f2985e) != null) {
                                i11++;
                            }
                            typefaceBuild = null;
                            break;
                        }
                    }
                    typefaceBuild = null;
                    break;
                }
                typefaceBuild = c(((l0.d) arrayList.get(0)).f2985e);
            }
            if (typefaceBuild != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new p(bVar, i7, typefaceBuild));
                }
                f2074b.put(b(resources, i4, str, i5, i6), typefaceBuild);
                return typefaceBuild;
            }
            boolean z5 = !z4 ? bVar != null : hVar.f2024c != 0;
            int i13 = z4 ? hVar.f2023b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            h0 h0Var = new h0(11);
            h0Var.f84g = bVar;
            ArrayList arrayList2 = hVar.f2022a;
            k0.f fVar = new k0.f(handler, 1);
            androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(h0Var, 9, fVar);
            int i14 = 5;
            if (!z5) {
                String strA = l0.h.a(arrayList2, i6);
                Typeface typeface = (Typeface) l0.h.f2996a.get(strA);
                if (typeface != null) {
                    fVar.execute(new b0.b(h0Var, i14, typeface));
                    typefaceO = typeface;
                } else {
                    l0.f fVar2 = new l0.f(i10, pVar);
                    synchronized (l0.h.f2998c) {
                        try {
                            k kVar = l0.h.f2999d;
                            ArrayList arrayList3 = (ArrayList) kVar.get(strA);
                            if (arrayList3 != null) {
                                arrayList3.add(fVar2);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(fVar2);
                                kVar.put(strA, arrayList4);
                                l0.e eVar2 = new l0.e(strA, context, arrayList2, i6, 1);
                                ThreadPoolExecutor threadPoolExecutor = l0.h.f2997b;
                                l0.f fVar3 = new l0.f(i9, strA);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                c2.d dVar2 = new c2.d();
                                dVar2.f1128g = eVar2;
                                dVar2.f1129h = fVar3;
                                dVar2.f1130i = handler2;
                                threadPoolExecutor.execute(dVar2);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } else {
                if (arrayList2.size() > 1) {
                    q.q("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                l0.d dVar3 = (l0.d) arrayList2.get(0);
                j jVar = l0.h.f2996a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj = new Object[]{dVar3}[0];
                Objects.requireNonNull(obj);
                arrayList5.add(obj);
                String strA2 = l0.h.a(Collections.unmodifiableList(arrayList5), i6);
                Typeface typeface2 = (Typeface) l0.h.f2996a.get(strA2);
                if (typeface2 != null) {
                    fVar.execute(new b0.b(h0Var, i14, typeface2));
                    typefaceO = typeface2;
                } else if (i13 == -1) {
                    Object[] objArr = {dVar3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList6.add(obj2);
                    l0.g gVarB = l0.h.b(strA2, context, Collections.unmodifiableList(arrayList6), i6);
                    pVar.t(gVarB);
                    typefaceO = gVarB.f2994a;
                } else {
                    try {
                        try {
                            try {
                                l0.g gVar = (l0.g) l0.h.f2997b.submit(new l0.e(strA2, context, dVar3, i6, 0)).get(i13, TimeUnit.MILLISECONDS);
                                pVar.t(gVar);
                                typefaceO = gVar.f2994a;
                            } catch (InterruptedException e5) {
                                throw e5;
                            }
                        } catch (ExecutionException e6) {
                            throw new RuntimeException(e6);
                        } catch (TimeoutException unused2) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused3) {
                        ((k0.f) pVar.f569h).execute(new androidx.emoji2.text.i(i8, i7, (h0) pVar.f568g));
                    }
                }
            }
        } else {
            typefaceO = f2073a.o(context, (e0.f) eVar, resources, i6);
            if (bVar != null) {
                if (typefaceO != null) {
                    new Handler(Looper.getMainLooper()).post(new p(bVar, i7, typefaceO));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (typefaceO != null) {
            f2074b.put(b(resources, i4, str, i5, i6), typefaceO);
        }
        return typefaceO;
    }

    public static String b(Resources resources, int i4, String str, int i5, int i6) {
        return resources.getResourcePackageName(i4) + '-' + str + '-' + i5 + '-' + i4 + '-' + i6;
    }

    public static Typeface c(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    public static Font d(Typeface typeface) {
        if (f2075c == null) {
            f2075c = new Paint();
        }
        f2075c.setTextSize(10.0f);
        f2075c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f2075c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
