package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public final b0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f874h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f875i;

    public y(z zVar, b0 b0Var) {
        this.f875i = zVar;
        this.f = b0Var;
    }

    public final void b(boolean z4) {
        if (z4 == this.f873g) {
            return;
        }
        this.f873g = z4;
        int i4 = z4 ? 1 : -1;
        z zVar = this.f875i;
        int i5 = zVar.f879c;
        zVar.f879c = i4 + i5;
        if (!zVar.f880d) {
            zVar.f880d = true;
            while (true) {
                try {
                    int i6 = zVar.f879c;
                    if (i5 == i6) {
                        break;
                    } else {
                        i5 = i6;
                    }
                } catch (Throwable th) {
                    zVar.f880d = false;
                    throw th;
                }
            }
            zVar.f880d = false;
        }
        if (this.f873g) {
            zVar.c(this);
        }
    }

    public abstract boolean d();

    public void c() {
    }
}
