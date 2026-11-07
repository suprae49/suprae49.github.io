package r3;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements f, Serializable {
    public final int f;

    public h(int i4) {
        this.f = i4;
    }

    @Override // r3.f
    public final int b() {
        return this.f;
    }

    public final String toString() {
        l.f3614a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
