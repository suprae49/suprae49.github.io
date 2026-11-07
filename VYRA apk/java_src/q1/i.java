package q1;

import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.fragment.app.q;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f3406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f3407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3410e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f3411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3413i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f3414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f3415k;

    public i(i iVar, p.f fVar) {
        k gVar;
        this.f3406a = new Matrix();
        this.f3407b = new ArrayList();
        this.f3408c = 0.0f;
        this.f3409d = 0.0f;
        this.f3410e = 0.0f;
        this.f = 1.0f;
        this.f3411g = 1.0f;
        this.f3412h = 0.0f;
        this.f3413i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3414j = matrix;
        this.f3415k = null;
        this.f3408c = iVar.f3408c;
        this.f3409d = iVar.f3409d;
        this.f3410e = iVar.f3410e;
        this.f = iVar.f;
        this.f3411g = iVar.f3411g;
        this.f3412h = iVar.f3412h;
        this.f3413i = iVar.f3413i;
        String str = iVar.f3415k;
        this.f3415k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f3414j);
        ArrayList arrayList = iVar.f3407b;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            Object obj = arrayList.get(i4);
            if (obj instanceof i) {
                this.f3407b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    h hVar2 = new h(hVar);
                    hVar2.f3398e = 0.0f;
                    hVar2.f3399g = 1.0f;
                    hVar2.f3400h = 1.0f;
                    hVar2.f3401i = 0.0f;
                    hVar2.f3402j = 1.0f;
                    hVar2.f3403k = 0.0f;
                    hVar2.f3404l = Paint.Cap.BUTT;
                    hVar2.f3405m = Paint.Join.MITER;
                    hVar2.n = 4.0f;
                    hVar2.f3397d = hVar.f3397d;
                    hVar2.f3398e = hVar.f3398e;
                    hVar2.f3399g = hVar.f3399g;
                    hVar2.f = hVar.f;
                    hVar2.f3418c = hVar.f3418c;
                    hVar2.f3400h = hVar.f3400h;
                    hVar2.f3401i = hVar.f3401i;
                    hVar2.f3402j = hVar.f3402j;
                    hVar2.f3403k = hVar.f3403k;
                    hVar2.f3404l = hVar.f3404l;
                    hVar2.f3405m = hVar.f3405m;
                    hVar2.n = hVar.n;
                    gVar = hVar2;
                } else {
                    if (!(obj instanceof g)) {
                        q.j("Unknown object in the tree!");
                        throw null;
                    }
                    gVar = new g((g) obj);
                }
                this.f3407b.add(gVar);
                Object obj2 = gVar.f3417b;
                if (obj2 != null) {
                    fVar.put(obj2, gVar);
                }
            }
        }
    }

    @Override // q1.j
    public final boolean a() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f3407b;
            if (i4 >= arrayList.size()) {
                return false;
            }
            if (((j) arrayList.get(i4)).a()) {
                return true;
            }
            i4++;
        }
    }

    @Override // q1.j
    public final boolean b(int[] iArr) {
        int i4 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f3407b;
            if (i4 >= arrayList.size()) {
                return zB;
            }
            zB |= ((j) arrayList.get(i4)).b(iArr);
            i4++;
        }
    }

    public final void c() {
        Matrix matrix = this.f3414j;
        matrix.reset();
        matrix.postTranslate(-this.f3409d, -this.f3410e);
        matrix.postScale(this.f, this.f3411g);
        matrix.postRotate(this.f3408c, 0.0f, 0.0f);
        matrix.postTranslate(this.f3412h + this.f3409d, this.f3413i + this.f3410e);
    }

    public String getGroupName() {
        return this.f3415k;
    }

    public Matrix getLocalMatrix() {
        return this.f3414j;
    }

    public float getPivotX() {
        return this.f3409d;
    }

    public float getPivotY() {
        return this.f3410e;
    }

    public float getRotation() {
        return this.f3408c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.f3411g;
    }

    public float getTranslateX() {
        return this.f3412h;
    }

    public float getTranslateY() {
        return this.f3413i;
    }

    public void setPivotX(float f) {
        if (f != this.f3409d) {
            this.f3409d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f3410e) {
            this.f3410e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.f3408c) {
            this.f3408c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f3411g) {
            this.f3411g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f3412h) {
            this.f3412h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f3413i) {
            this.f3413i = f;
            c();
        }
    }

    public i() {
        this.f3406a = new Matrix();
        this.f3407b = new ArrayList();
        this.f3408c = 0.0f;
        this.f3409d = 0.0f;
        this.f3410e = 0.0f;
        this.f = 1.0f;
        this.f3411g = 1.0f;
        this.f3412h = 0.0f;
        this.f3413i = 0.0f;
        this.f3414j = new Matrix();
        this.f3415k = null;
    }
}
