package b4;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1101e = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(k.class, "_state$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final androidx.emoji2.text.r f1102g = new androidx.emoji2.text.r("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f1106d;

    public k(int i4, boolean z4) {
        this.f1103a = i4;
        this.f1104b = z4;
        int i5 = i4 - 1;
        this.f1105c = i5;
        this.f1106d = new AtomicReferenceArray(i4);
        if (i5 > 1073741823) {
            androidx.fragment.app.q.j("Check failed.");
            throw null;
        }
        if ((i4 & i5) == 0) {
            return;
        }
        androidx.fragment.app.q.j("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j4 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j4) != 0) {
                return (2305843009213693952L & j4) != 0 ? 2 : 1;
            }
            int i4 = (int) (1073741823 & j4);
            int i5 = (int) ((1152921503533105152L & j4) >> 30);
            int i6 = this.f1105c;
            if (((i5 + 2) & i6) == (i4 & i6)) {
                return 1;
            }
            boolean z4 = this.f1104b;
            AtomicReferenceArray atomicReferenceArray = this.f1106d;
            if (z4 || atomicReferenceArray.get(i5 & i6) == null) {
                if (f.compareAndSet(this, j4, ((-1152921503533105153L) & j4) | (((long) ((i5 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i5 & i6, obj);
                    k kVarC = this;
                    while ((atomicLongFieldUpdater.get(kVarC) & 1152921504606846976L) != 0) {
                        kVarC = kVarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = kVarC.f1106d;
                        int i7 = kVarC.f1105c & i5;
                        Object obj2 = atomicReferenceArray2.get(i7);
                        if ((obj2 instanceof j) && ((j) obj2).f1100a == i5) {
                            atomicReferenceArray2.set(i7, obj);
                        } else {
                            kVarC = null;
                        }
                        if (kVarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i8 = this.f1103a;
                if (i8 < 1024 || ((i5 - i4) & 1073741823) > (i8 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        do {
            atomicLongFieldUpdater = f;
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j4) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, 2305843009213693952L | j4));
        return true;
    }

    public final k c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        k kVar;
        while (true) {
            atomicLongFieldUpdater = f;
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 1152921504606846976L) != 0) {
                kVar = this;
                break;
            }
            long j5 = 1152921504606846976L | j4;
            kVar = this;
            if (atomicLongFieldUpdater.compareAndSet(kVar, j4, j5)) {
                j4 = j5;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1101e;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(this);
            if (kVar2 != null) {
                return kVar2;
            }
            k kVar3 = new k(kVar.f1103a * 2, kVar.f1104b);
            int i4 = (int) (1073741823 & j4);
            int i5 = (int) ((1152921503533105152L & j4) >> 30);
            while (true) {
                int i6 = kVar.f1105c;
                int i7 = i4 & i6;
                if (i7 == (i6 & i5)) {
                    break;
                }
                Object jVar = kVar.f1106d.get(i7);
                if (jVar == null) {
                    jVar = new j(i4);
                }
                kVar3.f1106d.set(kVar3.f1105c & i4, jVar);
                i4++;
            }
            atomicLongFieldUpdater.set(kVar3, (-1152921504606846977L) & j4);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, kVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        k kVarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j4 = atomicLongFieldUpdater.get(kVarC);
            if ((j4 & 1152921504606846976L) != 0) {
                return f1102g;
            }
            int i4 = (int) (j4 & 1073741823);
            int i5 = kVarC.f1105c;
            int i6 = i4 & i5;
            if ((((int) ((1152921503533105152L & j4) >> 30)) & i5) != i6) {
                AtomicReferenceArray atomicReferenceArray = kVarC.f1106d;
                Object obj = atomicReferenceArray.get(i6);
                boolean z4 = kVarC.f1104b;
                if (obj == null) {
                    if (z4) {
                    }
                } else if (!(obj instanceof j)) {
                    long j5 = (i4 + 1) & 1073741823;
                    if (f.compareAndSet(kVarC, j4, (j4 & (-1073741824)) | j5)) {
                        atomicReferenceArray.set(i6, null);
                        return obj;
                    }
                    kVarC = this;
                    if (z4) {
                        while (true) {
                            long j6 = atomicLongFieldUpdater.get(kVarC);
                            int i7 = (int) (j6 & 1073741823);
                            if ((j6 & 1152921504606846976L) != 0) {
                                kVarC = kVarC.c();
                            } else {
                                k kVar = kVarC;
                                if (f.compareAndSet(kVar, j6, (j6 & (-1073741824)) | j5)) {
                                    kVar.f1106d.set(i7 & kVar.f1105c, null);
                                    kVarC = null;
                                } else {
                                    kVarC = kVar;
                                }
                            }
                            if (kVarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
