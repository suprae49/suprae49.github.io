package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f533d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f536c = 0;

    public a0(x xVar, int i4) {
        this.f535b = xVar;
        this.f534a = i4;
    }

    public final int a(int i4) {
        a1.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f10d;
        int i5 = iA + aVarB.f7a;
        return byteBuffer.getInt((i4 * 4) + byteBuffer.getInt(i5) + i5 + 4);
    }

    public final a1.a b() {
        ThreadLocal threadLocal = f533d;
        a1.a aVar = (a1.a) threadLocal.get();
        if (aVar == null) {
            aVar = new a1.a();
            threadLocal.set(aVar);
        }
        a1.b bVar = (a1.b) this.f535b.f592a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i4 = iA + bVar.f7a;
            int i5 = (this.f534a * 4) + ((ByteBuffer) bVar.f10d).getInt(i4) + i4 + 4;
            int i6 = ((ByteBuffer) bVar.f10d).getInt(i5) + i5;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f10d;
            aVar.f10d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f7a = i6;
                int i7 = i6 - byteBuffer.getInt(i6);
                aVar.f8b = i7;
                aVar.f9c = ((ByteBuffer) aVar.f10d).getShort(i7);
                return aVar;
            }
            aVar.f7a = 0;
            aVar.f8b = 0;
            aVar.f9c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i4;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        a1.a aVarB = b();
        int iA = aVarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f10d).getInt(iA + aVarB.f7a) : 0));
        sb.append(", codepoints:");
        a1.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i5 = iA2 + aVarB2.f7a;
            i4 = ((ByteBuffer) aVarB2.f10d).getInt(((ByteBuffer) aVarB2.f10d).getInt(i5) + i5);
        } else {
            i4 = 0;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            sb.append(Integer.toHexString(a(i6)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
