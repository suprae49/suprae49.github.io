package v;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f4249d;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4251g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f4246a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4247b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4248c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4250e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4252h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f4253i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4254j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f4255k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f4256l = new ArrayList();

    public f(o oVar) {
        this.f4249d = oVar;
    }

    @Override // v.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f4256l;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            if (!((f) obj).f4254j) {
                return;
            }
        }
        this.f4248c = true;
        o oVar = this.f4246a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f4247b) {
            this.f4249d.a(this);
            return;
        }
        int size2 = arrayList.size();
        f fVar = null;
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList.get(i6);
            i6++;
            f fVar2 = (f) obj2;
            if (!(fVar2 instanceof g)) {
                i4++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i4 == 1 && fVar.f4254j) {
            g gVar = this.f4253i;
            if (gVar != null) {
                if (!gVar.f4254j) {
                    return;
                } else {
                    this.f = this.f4252h * gVar.f4251g;
                }
            }
            d(fVar.f4251g + this.f);
        }
        o oVar2 = this.f4246a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f4255k.add(oVar);
        if (this.f4254j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f4256l.clear();
        this.f4255k.clear();
        this.f4254j = false;
        this.f4251g = 0;
        this.f4248c = false;
        this.f4247b = false;
    }

    public void d(int i4) {
        if (this.f4254j) {
            return;
        }
        this.f4254j = true;
        this.f4251g = i4;
        ArrayList arrayList = this.f4255k;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4249d.f4270b.f3777h0);
        sb.append(":");
        switch (this.f4250e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f4254j ? Integer.valueOf(this.f4251g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f4256l.size());
        sb.append(":d=");
        sb.append(this.f4255k.size());
        sb.append(">");
        return sb.toString();
    }
}
