package h3;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends e4.a {
    public static void o0(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i5, iArr2, i4, i6 - i5);
    }

    public static void p0(Object[] objArr, Object[] objArr2, int i4, int i5, int i6) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i5, objArr2, i4, i6 - i5);
    }

    public static /* synthetic */ void q0(Object[] objArr, Object[] objArr2, int i4, int i5, int i6) {
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        p0(objArr, objArr2, 0, i4, i5);
    }
}
