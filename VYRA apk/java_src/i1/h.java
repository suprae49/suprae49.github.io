package i1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2262d;

    public h(int i4, int i5, long j4, long j5) {
        this.f2259a = i4;
        this.f2260b = i5;
        this.f2261c = j4;
        this.f2262d = j5;
    }

    public static h a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            h hVar = new h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return hVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f2259a);
            dataOutputStream.writeInt(this.f2260b);
            dataOutputStream.writeLong(this.f2261c);
            dataOutputStream.writeLong(this.f2262d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            if (this.f2260b == hVar.f2260b && this.f2261c == hVar.f2261c && this.f2259a == hVar.f2259a && this.f2262d == hVar.f2262d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2260b), Long.valueOf(this.f2261c), Integer.valueOf(this.f2259a), Long.valueOf(this.f2262d));
    }
}
