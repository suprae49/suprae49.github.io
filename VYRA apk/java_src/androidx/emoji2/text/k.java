package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f553j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile k f554k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p.g f556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f559e;
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a3.f f560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f562i;

    public k(v vVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f555a = reentrantReadWriteLock;
        this.f557c = 3;
        j jVar = (j) vVar.f549b;
        this.f = jVar;
        int i4 = vVar.f548a;
        this.f561h = i4;
        this.f562i = (d) vVar.f550c;
        this.f558d = new Handler(Looper.getMainLooper());
        this.f556b = new p.g(0);
        this.f560g = new a3.f(3);
        f fVar = new f(this);
        this.f559e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i4 == 0) {
            try {
                this.f557c = 0;
            } catch (Throwable th) {
                this.f555a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                jVar.u(new e(fVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static k a() {
        k kVar;
        synchronized (f553j) {
            try {
                kVar = f554k;
                if (!(kVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    public final int b() {
        this.f555a.readLock().lock();
        try {
            return this.f557c;
        } finally {
            this.f555a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f561h == 1)) {
            androidx.fragment.app.q.j("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (b() == 1) {
            return;
        }
        this.f555a.writeLock().lock();
        try {
            if (this.f557c == 0) {
                this.f555a.writeLock().unlock();
                return;
            }
            this.f557c = 0;
            this.f555a.writeLock().unlock();
            f fVar = this.f559e;
            k kVar = fVar.f545a;
            try {
                kVar.f.u(new e(fVar));
            } catch (Throwable th) {
                kVar.d(th);
            }
        } catch (Throwable th2) {
            this.f555a.writeLock().unlock();
            throw th2;
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f555a.writeLock().lock();
        try {
            this.f557c = 2;
            arrayList.addAll(this.f556b);
            this.f556b.clear();
            this.f555a.writeLock().unlock();
            this.f558d.post(new i(arrayList, this.f557c, th));
        } catch (Throwable th2) {
            this.f555a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:46:0x008f, B:48:0x0099, B:50:0x009c, B:52:0x009f, B:54:0x00af, B:55:0x00b2), top: B:94:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00af A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:46:0x008f, B:48:0x0099, B:50:0x009c, B:52:0x009f, B:54:0x00af, B:55:0x00b2), top: B:94:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:85:0x0104  */
    public final CharSequence e(CharSequence charSequence, int i4, int i5) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i6;
        int i7;
        b0[] b0VarArr;
        int spanStart;
        if (!(b() == 1)) {
            androidx.fragment.app.q.j("Not initialized yet");
            return null;
        }
        if (i4 < 0) {
            androidx.fragment.app.q.q("start cannot be negative");
            return null;
        }
        if (i5 < 0) {
            androidx.fragment.app.q.q("end cannot be negative");
            return null;
        }
        h0.e("start should be <= than end", i4 <= i5);
        d0 d0Var = null;
        if (charSequence == null) {
            return null;
        }
        h0.e("start should be < than charSequence length", i4 <= charSequence.length());
        h0.e("end should be < than charSequence length", i5 <= charSequence.length());
        if (charSequence.length() == 0 || i4 == i5) {
            return charSequence;
        }
        t tVar = this.f559e.f546b;
        tVar.getClass();
        boolean z4 = charSequence instanceof z;
        if (z4) {
            ((z) charSequence).a();
        }
        if (z4) {
            d0Var = new d0((Spannable) charSequence);
            if (d0Var != null) {
                for (b0 b0Var : b0VarArr) {
                    spanStart = d0Var.f543g.getSpanStart(b0Var);
                    int spanEnd = d0Var.f543g.getSpanEnd(b0Var);
                    if (spanStart != i5) {
                        d0Var.removeSpan(b0Var);
                    }
                    i4 = Math.min(spanStart, i4);
                    i5 = Math.max(spanEnd, i5);
                }
            }
            i6 = i4;
            i7 = i5;
            if (i6 != i7) {
                charSequence2 = charSequence;
                if (!z4) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z4) {
                    return charSequence2;
                }
            }
            ((z) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    d0Var = new d0((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z4) {
                        throw th;
                    }
                    ((z) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i4 - 1, i5 + 1, b0.class) <= i5) {
                d0Var = new d0();
                d0Var.f = false;
                d0Var.f543g = new SpannableString(charSequence);
            }
            if (d0Var != null && (b0VarArr = (b0[]) d0Var.f543g.getSpans(i4, i5, b0.class)) != null && b0VarArr.length > 0) {
                while (i < r5) {
                    spanStart = d0Var.f543g.getSpanStart(b0Var);
                    int spanEnd2 = d0Var.f543g.getSpanEnd(b0Var);
                    if (spanStart != i5) {
                        d0Var.removeSpan(b0Var);
                    }
                    i4 = Math.min(spanStart, i4);
                    i5 = Math.max(spanEnd2, i5);
                }
            }
            i6 = i4;
            i7 = i5;
            if (i6 != i7 || i6 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z4) {
                    return charSequence2;
                }
            } else {
                try {
                    charSequence2 = charSequence;
                    try {
                        d0 d0Var2 = (d0) tVar.u(charSequence2, i6, i7, Api.BaseClientBuilder.API_PRIORITY_OTHER, false, new p(d0Var, 0, (a3.f) tVar.f578b));
                        if (d0Var2 != null) {
                            Spannable spannable = d0Var2.f543g;
                            if (z4) {
                                ((z) charSequence2).b();
                            }
                            return spannable;
                        }
                        if (!z4) {
                            return charSequence2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        if (!z4) {
                            throw th;
                        }
                        ((z) charSequence2).b();
                        throw th;
                    }
                } catch (Throwable th4) {
                    charSequence2 = charSequence;
                    th = th4;
                }
            }
            ((z) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
        }
        if (!z4) {
            throw th;
        }
        ((z) charSequence2).b();
        throw th;
    }

    public final void f(h hVar) {
        h0.g(hVar, "initCallback cannot be null");
        this.f555a.writeLock().lock();
        try {
            if (this.f557c == 1 || this.f557c == 2) {
                this.f558d.post(new i(Arrays.asList(hVar), this.f557c, (Throwable) null));
            } else {
                this.f556b.add(hVar);
            }
        } finally {
            this.f555a.writeLock().unlock();
        }
    }
}
