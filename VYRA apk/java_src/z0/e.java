package z0;

import androidx.fragment.app.q;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f4846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f4847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f4849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f4850e;
    public double f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f4851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f4852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f4853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j2.e f4854j;

    public e() {
        this.f4846a = Math.sqrt(1500.0d);
        this.f4847b = 0.5d;
        this.f4848c = false;
        this.f4853i = Double.MAX_VALUE;
        this.f4854j = new j2.e();
    }

    public final void a(float f) {
        if (f < 0.0f) {
            q.q("Damping ratio must be non-negative");
        } else {
            this.f4847b = f;
            this.f4848c = false;
        }
    }

    public final void b(float f) {
        if (f <= 0.0f) {
            q.q("Spring stiffness constant must be positive.");
        } else {
            this.f4846a = Math.sqrt(f);
            this.f4848c = false;
        }
    }

    public final j2.e c(double d5, double d6, long j4) {
        double dSin;
        double dCos;
        if (!this.f4848c) {
            if (this.f4853i == Double.MAX_VALUE) {
                q.j("Error: Final position of the spring must be set before the animation starts");
                return null;
            }
            double d7 = this.f4847b;
            if (d7 > 1.0d) {
                double d8 = this.f4846a;
                this.f = (Math.sqrt((d7 * d7) - 1.0d) * d8) + ((-d7) * d8);
                double d9 = this.f4847b;
                double d10 = this.f4846a;
                this.f4851g = ((-d9) * d10) - (Math.sqrt((d9 * d9) - 1.0d) * d10);
            } else if (d7 >= 0.0d && d7 < 1.0d) {
                this.f4852h = Math.sqrt(1.0d - (d7 * d7)) * this.f4846a;
            }
            this.f4848c = true;
        }
        double d11 = j4 / 1000.0d;
        double d12 = d5 - this.f4853i;
        double d13 = this.f4847b;
        if (d13 > 1.0d) {
            double d14 = this.f4851g;
            double d15 = ((d14 * d12) - d6) / (d14 - this.f);
            double d16 = d12 - d15;
            dSin = (Math.pow(2.718281828459045d, this.f * d11) * d15) + (Math.pow(2.718281828459045d, d14 * d11) * d16);
            double d17 = this.f4851g;
            double dPow = Math.pow(2.718281828459045d, d17 * d11) * d16 * d17;
            double d18 = this.f;
            dCos = (Math.pow(2.718281828459045d, d18 * d11) * d15 * d18) + dPow;
        } else if (d13 == 1.0d) {
            double d19 = this.f4846a;
            double d20 = (d19 * d12) + d6;
            double d21 = (d20 * d11) + d12;
            double dPow2 = Math.pow(2.718281828459045d, (-d19) * d11) * d21;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f4846a) * d11) * d21;
            double d22 = -this.f4846a;
            dCos = (Math.pow(2.718281828459045d, d22 * d11) * d20) + (dPow3 * d22);
            dSin = dPow2;
        } else {
            double d23 = 1.0d / this.f4852h;
            double d24 = this.f4846a;
            double d25 = ((d13 * d24 * d12) + d6) * d23;
            dSin = ((Math.sin(this.f4852h * d11) * d25) + (Math.cos(this.f4852h * d11) * d12)) * Math.pow(2.718281828459045d, (-d13) * d24 * d11);
            double d26 = this.f4846a;
            double d27 = this.f4847b;
            double d28 = (-d26) * dSin * d27;
            double dPow4 = Math.pow(2.718281828459045d, (-d27) * d26 * d11);
            double d29 = this.f4852h;
            double dSin2 = Math.sin(d29 * d11) * (-d29) * d12;
            double d30 = this.f4852h;
            dCos = (((Math.cos(d30 * d11) * d25 * d30) + dSin2) * dPow4) + d28;
        }
        float f = (float) (dSin + this.f4853i);
        j2.e eVar = this.f4854j;
        eVar.f2460a = f;
        eVar.f2461b = (float) dCos;
        return eVar;
    }

    public e(float f) {
        this.f4846a = Math.sqrt(1500.0d);
        this.f4847b = 0.5d;
        this.f4848c = false;
        this.f4854j = new j2.e();
        this.f4853i = f;
    }
}
