package androidx.activity;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.util.Log;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.PopupWindow;
import co.median.android.MainActivity;
import co.median.android.widget.MedianProgressView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import u1.h1;
import u1.o0;
import u1.x0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f213g;

    public /* synthetic */ k(int i4, Object obj) {
        this.f = i4;
        this.f213g = obj;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:334:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x01b6 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x0144  */
    /* JADX WARN: Code duplicated, block: B:46:0x015a  */
    /* JADX WARN: Code duplicated, block: B:50:0x016f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0175  */
    /* JADX WARN: Code duplicated, block: B:54:0x0183  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        Object obj;
        ?? r4;
        View viewE;
        int width;
        long j4;
        long j5;
        float f;
        long j6;
        long j7;
        boolean z5;
        float f4;
        z0.e eVar;
        float f5;
        float f6;
        float f7;
        z0.e eVar2;
        boolean z6;
        ArrayList arrayList;
        z0.b bVarB;
        ArrayList arrayList2;
        int iIndexOf;
        int i4;
        int size;
        v2.e eVar3;
        boolean z7 = false;
        switch (this.f) {
            case 0:
                l lVar = (l) this.f213g;
                Runnable runnable = lVar.f214g;
                if (runnable != null) {
                    runnable.run();
                    lVar.f214g = null;
                    return;
                }
                return;
            case 1:
                s.b((s) this.f213g);
                return;
            case 2:
                androidx.emoji2.text.u uVar = (androidx.emoji2.text.u) this.f213g;
                synchronized (uVar.f583i) {
                    try {
                        if (uVar.f587m == null) {
                            return;
                        }
                        try {
                            l0.i iVarB = uVar.b();
                            int i5 = iVarB.f;
                            if (i5 == 2) {
                                synchronized (uVar.f583i) {
                                }
                            }
                            if (i5 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i5 + ")");
                            }
                            try {
                                int i6 = k0.i.f2724a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                a3.f fVar = uVar.f582h;
                                Context context = uVar.f;
                                fVar.getClass();
                                l0.i[] iVarArr = {iVarB};
                                e4.a aVar = f0.e.f2073a;
                                e4.a.c("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceP = f0.e.f2073a.p(context, iVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferL = u1.h0.L(uVar.f, iVarB.f3000a);
                                    if (mappedByteBufferL == null || typefaceP == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        androidx.emoji2.text.x xVar = new androidx.emoji2.text.x(typefaceP, u1.h0.V(mappedByteBufferL));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (uVar.f583i) {
                                            try {
                                                u1.h0 h0Var = uVar.f587m;
                                                if (h0Var != null) {
                                                    h0Var.R(xVar);
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                            break;
                                        }
                                        uVar.a();
                                        return;
                                    } catch (Throwable th2) {
                                        int i7 = k0.i.f2724a;
                                        Trace.endSection();
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                int i8 = k0.i.f2724a;
                                Trace.endSection();
                                throw th4;
                            }
                            break;
                        } catch (Throwable th5) {
                            synchronized (uVar.f583i) {
                                try {
                                    u1.h0 h0Var2 = uVar.f587m;
                                    if (h0Var2 != null) {
                                        h0Var2.P(th5);
                                    }
                                    uVar.a();
                                    return;
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
            case 3:
                androidx.lifecycle.f0 f0Var = (androidx.lifecycle.f0) this.f213g;
                androidx.lifecycle.v vVar = f0Var.f824k;
                if (f0Var.f820g == 0) {
                    z4 = true;
                    f0Var.f821h = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                } else {
                    z4 = true;
                }
                if (f0Var.f == 0 && f0Var.f821h) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    f0Var.f822i = z4;
                    return;
                }
                return;
            case 4:
                Activity activity = (Activity) this.f213g;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = b0.d.f1005g;
                Method method = b0.d.f;
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i9 != 26 && i9 != 27) || method != null) && (b0.d.f1004e != null || b0.d.f1003d != null)) {
                    try {
                        Object obj2 = b0.d.f1002c.get(activity);
                        if (obj2 != null && (obj = b0.d.f1001b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            b0.c cVar = new b0.c(activity);
                            application.registerActivityLifecycleCallbacks(cVar);
                            handler.post(new b0.b(cVar, 0, obj2));
                            cVar = (i9 == 26 || i9 == 27) ? 1 : 0;
                            try {
                                if (cVar != 0) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th8) {
                                        th = th8;
                                        r4 = cVar;
                                        handler.post(new b0.b(application, r4, 1, false));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new b0.b(application, cVar, 1, false));
                                return;
                            } catch (Throwable th9) {
                                th = th9;
                                r4 = cVar;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 5:
                b3.g gVar = (b3.g) this.f213g;
                gVar.f1074c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) gVar.f1076e;
                w0.e eVar4 = sideSheetBehavior.n;
                if (eVar4 != null && eVar4.g()) {
                    gVar.a(gVar.f1073b);
                    return;
                } else {
                    if (sideSheetBehavior.f1541m == 2) {
                        sideSheetBehavior.x(gVar.f1073b);
                        return;
                    }
                    return;
                }
            case 6:
                ((d3.e) this.f213g).s(true);
                return;
            case 7:
                d3.m mVar = (d3.m) this.f213g;
                boolean zIsPopupShowing = mVar.f1717h.isPopupShowing();
                mVar.s(zIsPopupShowing);
                mVar.f1722m = zIsPopupShowing;
                return;
            case 8:
                ((TextInputLayout) this.f213g).f1571j.requestLayout();
                return;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                MaterialButton.a((MaterialButton) this.f213g);
                return;
            case 10:
                ((CarouselLayoutManager) this.f213g).m0();
                return;
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                s0.b bVar = ((s0.e) this.f213g).f3665a;
                ViewParent parent = bVar.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(bVar);
                    return;
                }
                return;
            case 12:
                ((CookieManager) this.f213g).flush();
                return;
            case 13:
                x1.i iVar = ((x0) this.f213g).f4137g.G;
                if (iVar != null) {
                    ((o0) iVar).evaluateJavascript("if (median_status_checker && typeof median_status_checker.onReadyState === 'function') median_status_checker.onReadyState(document.readyState);", null);
                    return;
                }
                return;
            case 14:
                u1.x xVar2 = (u1.x) this.f213g;
                MainActivity mainActivity = (MainActivity) xVar2.f4135b;
                Object obj3 = mainActivity.G;
                WebView webView = obj3 instanceof WebView ? (WebView) obj3 : null;
                if (webView == null) {
                    Log.e("x", "printCurrentPage: current webview does not support printing");
                    return;
                }
                if (xVar2.f4134a) {
                    Log.d("x", "printCurrentPage: a print job is already pending");
                    return;
                }
                String title = webView.getTitle();
                if (title == null || title.length() == 0) {
                    title = null;
                }
                if (title == null) {
                    title = "Document";
                }
                Object systemService = mainActivity.getSystemService("print");
                PrintManager printManager = systemService instanceof PrintManager ? (PrintManager) systemService : null;
                if (printManager == null) {
                    Log.e("x", "printCurrentPage: print service unavailable");
                    return;
                }
                xVar2.f4134a = true;
                PrintDocumentAdapter printDocumentAdapterCreatePrintDocumentAdapter = webView.createPrintDocumentAdapter(title);
                printDocumentAdapterCreatePrintDocumentAdapter.getClass();
                printManager.print(title, new h1(xVar2, printDocumentAdapterCreatePrintDocumentAdapter), null);
                return;
            case 15:
                x1.i iVar2 = (x1.i) this.f213g;
                iVar2.stopLoading();
                ((o0) iVar2).a("file:///android_asset/offline.html");
                return;
            case 16:
                androidx.emoji2.text.t tVar = (androidx.emoji2.text.t) this.f213g;
                t2.c cVar2 = (t2.c) tVar.f578b;
                if (cVar2 != null) {
                    cVar2.b((NavigationView) tVar.f579c, (NavigationView) tVar.f580d, true);
                    return;
                }
                return;
            case 17:
                MedianProgressView medianProgressView = (MedianProgressView) this.f213g;
                int i10 = MedianProgressView.f1196g;
                medianProgressView.setVisibility(4);
                return;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                ((PopupWindow) this.f213g).dismiss();
                return;
            case 19:
                ((y0.f) this.f213g).d(false);
                return;
            case 20:
                y0.e eVar5 = (y0.e) this.f213g;
                y0.f fVar2 = eVar5.f4773d;
                int i11 = eVar5.f4771b.f4440o;
                int i12 = eVar5.f4770a;
                boolean z8 = i12 == 3;
                if (z8) {
                    viewE = fVar2.e(3);
                    width = (viewE != null ? -viewE.getWidth() : 0) + i11;
                } else {
                    viewE = fVar2.e(5);
                    width = fVar2.getWidth() - i11;
                }
                if (viewE != null) {
                    if (((!z8 || viewE.getLeft() >= width) && (z8 || viewE.getLeft() <= width)) || fVar2.h(viewE) != 0) {
                        return;
                    }
                    y0.c cVar3 = (y0.c) viewE.getLayoutParams();
                    eVar5.f4771b.r(viewE, width, viewE.getTop());
                    cVar3.f4768c = true;
                    fVar2.invalidate();
                    View viewE2 = fVar2.e(i12 == 3 ? 5 : 3);
                    if (viewE2 != null) {
                        fVar2.c(viewE2, true);
                    }
                    if (fVar2.f4790x) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = fVar2.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        fVar2.getChildAt(i13).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    fVar2.f4790x = true;
                    return;
                }
                return;
            default:
                z0.b bVar2 = (z0.b) ((z0.b) this.f213g).f4823c.f;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                ArrayList arrayList3 = bVar2.f4822b;
                long jUptimeMillis3 = SystemClock.uptimeMillis();
                int i14 = 0;
                while (i14 < arrayList3.size()) {
                    z0.d dVar = (z0.d) arrayList3.get(i14);
                    if (dVar == null) {
                        jUptimeMillis2 = jUptimeMillis2;
                        jUptimeMillis3 = jUptimeMillis3;
                    } else {
                        p.k kVar = bVar2.f4821a;
                        Long l4 = (Long) kVar.get(dVar);
                        if (l4 == null) {
                            j4 = dVar.f4839g;
                            if (j4 == 0) {
                                dVar.f4839g = jUptimeMillis2;
                                dVar.c(dVar.f4835b);
                                jUptimeMillis2 = jUptimeMillis2;
                                jUptimeMillis3 = jUptimeMillis3;
                            } else {
                                j5 = jUptimeMillis2 - j4;
                                dVar.f4839g = jUptimeMillis2;
                                f = z0.d.b().f4826g;
                                if (f == 0.0f) {
                                    j6 = 2147483647L;
                                } else {
                                    j6 = (long) (j5 / f);
                                }
                                j7 = j6;
                                z5 = dVar.f4845m;
                                f4 = dVar.f4844l;
                                if (z5) {
                                    if (f4 != Float.MAX_VALUE) {
                                        dVar.f4843k.f4853i = f4;
                                        dVar.f4844l = Float.MAX_VALUE;
                                    }
                                    dVar.f4835b = (float) dVar.f4843k.f4853i;
                                    dVar.f4834a = 0.0f;
                                    dVar.f4845m = z7;
                                    jUptimeMillis3 = jUptimeMillis3;
                                } else {
                                    jUptimeMillis2 = jUptimeMillis2;
                                    eVar = dVar.f4843k;
                                    f5 = dVar.f4835b;
                                    f6 = dVar.f4834a;
                                    if (f4 != Float.MAX_VALUE) {
                                        long j8 = j7 / 2;
                                        j2.e eVarC = eVar.c(f5, f6, j8);
                                        z0.e eVar6 = dVar.f4843k;
                                        eVar6.f4853i = dVar.f4844l;
                                        dVar.f4844l = Float.MAX_VALUE;
                                        j2.e eVarC2 = eVar6.c(eVarC.f2460a, eVarC.f2461b, j8);
                                        dVar.f4835b = eVarC2.f2460a;
                                        dVar.f4834a = eVarC2.f2461b;
                                    } else {
                                        j2.e eVarC3 = eVar.c(f5, f6, j7);
                                        dVar.f4835b = eVarC3.f2460a;
                                        dVar.f4834a = eVarC3.f2461b;
                                    }
                                    float fMax = Math.max(dVar.f4835b, -3.4028235E38f);
                                    dVar.f4835b = fMax;
                                    float fMin = Math.min(fMax, Float.MAX_VALUE);
                                    dVar.f4835b = fMin;
                                    f7 = dVar.f4834a;
                                    eVar2 = dVar.f4843k;
                                    eVar2.getClass();
                                    if (Math.abs(f7) < eVar2.f4850e) {
                                    }
                                    z6 = false;
                                    float fMin2 = Math.min(dVar.f4835b, Float.MAX_VALUE);
                                    dVar.f4835b = fMin2;
                                    float fMax2 = Math.max(fMin2, -3.4028235E38f);
                                    dVar.f4835b = fMax2;
                                    dVar.c(fMax2);
                                    if (z6) {
                                        arrayList = dVar.f4841i;
                                        dVar.f = false;
                                        bVarB = z0.d.b();
                                        bVarB.f4821a.remove(dVar);
                                        arrayList2 = bVarB.f4822b;
                                        iIndexOf = arrayList2.indexOf(dVar);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            bVarB.f = true;
                                        }
                                        dVar.f4839g = 0L;
                                        dVar.f4836c = false;
                                        for (i4 = 0; i4 < arrayList.size(); i4++) {
                                            if (arrayList.get(i4) != null) {
                                                eVar3 = ((v2.b) arrayList.get(i4)).f4293a;
                                                if (eVar3.getProgressDrawable() == null) {
                                                }
                                            }
                                        }
                                        for (size = arrayList.size() - 1; size >= 0; size--) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    }
                                }
                                z6 = true;
                                float fMin3 = Math.min(dVar.f4835b, Float.MAX_VALUE);
                                dVar.f4835b = fMin3;
                                float fMax3 = Math.max(fMin3, -3.4028235E38f);
                                dVar.f4835b = fMax3;
                                dVar.c(fMax3);
                                if (z6) {
                                    arrayList = dVar.f4841i;
                                    dVar.f = false;
                                    bVarB = z0.d.b();
                                    bVarB.f4821a.remove(dVar);
                                    arrayList2 = bVarB.f4822b;
                                    iIndexOf = arrayList2.indexOf(dVar);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        bVarB.f = true;
                                    }
                                    dVar.f4839g = 0L;
                                    dVar.f4836c = false;
                                    while (i4 < arrayList.size()) {
                                        if (arrayList.get(i4) != null) {
                                            eVar3 = ((v2.b) arrayList.get(i4)).f4293a;
                                            if (eVar3.getProgressDrawable() == null) {
                                            }
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                }
                            }
                        } else if (l4.longValue() < jUptimeMillis3) {
                            kVar.remove(dVar);
                            j4 = dVar.f4839g;
                            if (j4 == 0) {
                                dVar.f4839g = jUptimeMillis2;
                                dVar.c(dVar.f4835b);
                                jUptimeMillis2 = jUptimeMillis2;
                                jUptimeMillis3 = jUptimeMillis3;
                            } else {
                                j5 = jUptimeMillis2 - j4;
                                dVar.f4839g = jUptimeMillis2;
                                f = z0.d.b().f4826g;
                                if (f == 0.0f) {
                                    j6 = 2147483647L;
                                } else {
                                    j6 = (long) (j5 / f);
                                }
                                j7 = j6;
                                z5 = dVar.f4845m;
                                f4 = dVar.f4844l;
                                if (z5) {
                                    if (f4 != Float.MAX_VALUE) {
                                        dVar.f4843k.f4853i = f4;
                                        dVar.f4844l = Float.MAX_VALUE;
                                    }
                                    dVar.f4835b = (float) dVar.f4843k.f4853i;
                                    dVar.f4834a = 0.0f;
                                    dVar.f4845m = z7;
                                    jUptimeMillis3 = jUptimeMillis3;
                                } else {
                                    jUptimeMillis2 = jUptimeMillis2;
                                    eVar = dVar.f4843k;
                                    f5 = dVar.f4835b;
                                    f6 = dVar.f4834a;
                                    if (f4 != Float.MAX_VALUE) {
                                        long j9 = j7 / 2;
                                        j2.e eVarC4 = eVar.c(f5, f6, j9);
                                        z0.e eVar7 = dVar.f4843k;
                                        eVar7.f4853i = dVar.f4844l;
                                        dVar.f4844l = Float.MAX_VALUE;
                                        j2.e eVarC5 = eVar7.c(eVarC4.f2460a, eVarC4.f2461b, j9);
                                        dVar.f4835b = eVarC5.f2460a;
                                        dVar.f4834a = eVarC5.f2461b;
                                    } else {
                                        j2.e eVarC6 = eVar.c(f5, f6, j7);
                                        dVar.f4835b = eVarC6.f2460a;
                                        dVar.f4834a = eVarC6.f2461b;
                                    }
                                    float fMax4 = Math.max(dVar.f4835b, -3.4028235E38f);
                                    dVar.f4835b = fMax4;
                                    float fMin4 = Math.min(fMax4, Float.MAX_VALUE);
                                    dVar.f4835b = fMin4;
                                    f7 = dVar.f4834a;
                                    eVar2 = dVar.f4843k;
                                    eVar2.getClass();
                                    if (Math.abs(f7) < eVar2.f4850e || Math.abs(fMin4 - ((float) eVar2.f4853i)) >= eVar2.f4849d) {
                                        z6 = false;
                                    } else {
                                        dVar.f4835b = (float) dVar.f4843k.f4853i;
                                        dVar.f4834a = 0.0f;
                                    }
                                    float fMin5 = Math.min(dVar.f4835b, Float.MAX_VALUE);
                                    dVar.f4835b = fMin5;
                                    float fMax5 = Math.max(fMin5, -3.4028235E38f);
                                    dVar.f4835b = fMax5;
                                    dVar.c(fMax5);
                                    if (z6) {
                                        arrayList = dVar.f4841i;
                                        dVar.f = false;
                                        bVarB = z0.d.b();
                                        bVarB.f4821a.remove(dVar);
                                        arrayList2 = bVarB.f4822b;
                                        iIndexOf = arrayList2.indexOf(dVar);
                                        if (iIndexOf >= 0) {
                                            arrayList2.set(iIndexOf, null);
                                            bVarB.f = true;
                                        }
                                        dVar.f4839g = 0L;
                                        dVar.f4836c = false;
                                        while (i4 < arrayList.size()) {
                                            if (arrayList.get(i4) != null) {
                                                eVar3 = ((v2.b) arrayList.get(i4)).f4293a;
                                                if (eVar3.getProgressDrawable() == null && eVar3.getProgressDrawable().getLevel() == 10000) {
                                                    v2.c cVar4 = eVar3.f4307q;
                                                    if (eVar3.getVisibility() != 0) {
                                                        eVar3.removeCallbacks(eVar3.f4306p);
                                                    } else {
                                                        eVar3.removeCallbacks(cVar4);
                                                        long jUptimeMillis4 = SystemClock.uptimeMillis() - eVar3.f4301j;
                                                        long j10 = eVar3.f4300i;
                                                        if (jUptimeMillis4 >= j10) {
                                                            cVar4.run();
                                                        } else {
                                                            eVar3.postDelayed(cVar4, j10 - jUptimeMillis4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        while (size >= 0) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    }
                                }
                                z6 = true;
                                float fMin6 = Math.min(dVar.f4835b, Float.MAX_VALUE);
                                dVar.f4835b = fMin6;
                                float fMax6 = Math.max(fMin6, -3.4028235E38f);
                                dVar.f4835b = fMax6;
                                dVar.c(fMax6);
                                if (z6) {
                                    arrayList = dVar.f4841i;
                                    dVar.f = false;
                                    bVarB = z0.d.b();
                                    bVarB.f4821a.remove(dVar);
                                    arrayList2 = bVarB.f4822b;
                                    iIndexOf = arrayList2.indexOf(dVar);
                                    if (iIndexOf >= 0) {
                                        arrayList2.set(iIndexOf, null);
                                        bVarB.f = true;
                                    }
                                    dVar.f4839g = 0L;
                                    dVar.f4836c = false;
                                    while (i4 < arrayList.size()) {
                                        if (arrayList.get(i4) != null) {
                                            eVar3 = ((v2.b) arrayList.get(i4)).f4293a;
                                            if (eVar3.getProgressDrawable() == null) {
                                            }
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                }
                            }
                        } else {
                            jUptimeMillis2 = jUptimeMillis2;
                            jUptimeMillis3 = jUptimeMillis3;
                        }
                    }
                    i14++;
                    jUptimeMillis2 = jUptimeMillis2;
                    jUptimeMillis3 = jUptimeMillis3;
                    z7 = false;
                }
                if (bVar2.f) {
                    for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                        if (arrayList3.get(size2) == null) {
                            arrayList3.remove(size2);
                        }
                    }
                    if (arrayList3.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        androidx.emoji2.text.p pVar = bVar2.f4827h;
                        ValueAnimator.unregisterDurationScaleChangeListener((z0.a) pVar.f568g);
                        pVar.f568g = null;
                    }
                    bVar2.f = false;
                }
                if (arrayList3.size() > 0) {
                    ((Choreographer) bVar2.f4825e.f568g).postFrameCallback(new i1.f(bVar2.f4824d));
                    return;
                }
                return;
        }
    }
}
