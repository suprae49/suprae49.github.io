package i1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.fragment.app.q;
import androidx.fragment.app.u;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a3.f f2248a = new a3.f(13);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f2249b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f2250c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f2251d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f2252e = {48, 49, 48, 0};
    public static final byte[] f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f2253g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f2254h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f2255i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f2256j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static byte[] b(b[] bVarArr, byte[] bArr) throws IOException {
        int i4 = 0;
        int length = 0;
        for (b bVar : bVarArr) {
            length += ((((bVar.f2245g * 2) + 7) & (-8)) / 8) + (bVar.f2244e * 2) + d(bArr, bVar.f2240a, bVar.f2241b).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f)) {
            int length2 = bVarArr.length;
            while (i4 < length2) {
                b bVar2 = bVarArr[i4];
                q(byteArrayOutputStream, bVar2, d(bArr, bVar2.f2240a, bVar2.f2241b));
                p(byteArrayOutputStream, bVar2);
                i4++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                q(byteArrayOutputStream, bVar3, d(bArr, bVar3.f2240a, bVar3.f2241b));
            }
            int length3 = bVarArr.length;
            while (i4 < length3) {
                p(byteArrayOutputStream, bVarArr[i4]);
                i4++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static boolean c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z4 = true;
        for (File file2 : fileArrListFiles) {
            z4 = c(file2) && z4;
        }
        return z4;
    }

    public static String d(byte[] bArr, String str, String str2) {
        byte[] bArr2 = f2254h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f2253g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i4) throws IOException {
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (i5 < i4) {
            int i6 = inputStream.read(bArr, i5, i4 - i5);
            if (i6 < 0) {
                q.j(u.k(i4, "Not enough bytes to read: "));
                return null;
            }
            i5 += i6;
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i4) {
        int[] iArr = new int[i4];
        int iM = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            iM += (int) m(byteArrayInputStream, 2);
            iArr[i5] = iM;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i4, int i5) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i5];
            byte[] bArr2 = new byte[2048];
            int i6 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i6 < i4) {
                int i7 = fileInputStream.read(bArr2);
                if (i7 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i4 + " bytes");
                }
                inflater.setInput(bArr2, 0, i7);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i5 - iInflate);
                    i6 += i7;
                } catch (DataFormatException e5) {
                    throw new IllegalStateException(e5.getMessage());
                }
            }
            if (i6 == i4) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i4 + " actual=" + i6);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) throws IOException {
        byte[] bArr3 = f2255i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f2256j)) {
                q.j("Unsupported meta version");
                return null;
            }
            int iM = (int) m(fileInputStream, 2);
            byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                q.j("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
            try {
                b[] bVarArrK = k(byteArrayInputStream, bArr2, iM, bVarArr);
                byteArrayInputStream.close();
                return bVarArrK;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f2251d, bArr2)) {
            q.j("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            q.j("Unsupported meta version");
            return null;
        }
        int iM2 = (int) m(fileInputStream, 1);
        byte[] bArrH2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            q.j("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrH2);
        try {
            b[] bVarArrJ = j(byteArrayInputStream2, iM2, bVarArr);
            byteArrayInputStream2.close();
            return bVarArrJ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static b[] j(ByteArrayInputStream byteArrayInputStream, int i4, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i4 != bVarArr.length) {
            q.j("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i4];
        int[] iArr = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int iM = (int) m(byteArrayInputStream, 2);
            iArr[i5] = (int) m(byteArrayInputStream, 2);
            strArr[i5] = new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8);
        }
        for (int i6 = 0; i6 < i4; i6++) {
            b bVar = bVarArr[i6];
            if (!bVar.f2241b.equals(strArr[i6])) {
                q.j("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i7 = iArr[i6];
            bVar.f2244e = i7;
            bVar.f2246h = g(byteArrayInputStream, i7);
        }
        return bVarArr;
    }

    public static b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i4, b[] bVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i4 != bVarArr.length) {
            q.j("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            m(byteArrayInputStream, 2);
            String str = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM = m(byteArrayInputStream, 4);
            int iM = (int) m(byteArrayInputStream, 2);
            b bVar = null;
            if (bVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i6 = 0; i6 < bVarArr.length; i6++) {
                    if (bVarArr[i6].f2241b.equals(strSubstring)) {
                        bVar = bVarArr[i6];
                        break;
                    }
                }
            }
            if (bVar == null) {
                q.j("Missing profile key: ".concat(str));
                return null;
            }
            bVar.f2243d = jM;
            int[] iArrG = g(byteArrayInputStream, iM);
            if (Arrays.equals(bArr, f2254h)) {
                bVar.f2244e = iM;
                bVar.f2246h = iArrG;
            }
        }
        return bVarArr;
    }

    public static b[] l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f2252e)) {
            q.j("Unsupported version");
            return null;
        }
        int iM = (int) m(fileInputStream, 1);
        byte[] bArrH = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            q.j("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrH);
        try {
            b[] bVarArrN = n(byteArrayInputStream, str, iM);
            byteArrayInputStream.close();
            return bVarArrN;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(InputStream inputStream, int i4) throws IOException {
        byte[] bArrF = f(inputStream, i4);
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j4 += ((long) (bArrF[i5] & 255)) << (i5 * 8);
        }
        return j4;
    }

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int i4) throws IOException {
        int i5 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            int iM = (int) m(byteArrayInputStream, 2);
            int iM2 = (int) m(byteArrayInputStream, 2);
            bVarArr[i6] = new b(str, new String(f(byteArrayInputStream, iM), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), iM2, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[iM2], new TreeMap());
        }
        int i7 = 0;
        while (i7 < i4) {
            b bVar = bVarArr[i7];
            int iAvailable = byteArrayInputStream.available();
            int i8 = bVar.f;
            int i9 = bVar.f2245g;
            TreeMap treeMap = bVar.f2247i;
            int i10 = iAvailable - i8;
            int iM3 = i5;
            while (byteArrayInputStream.available() > i10) {
                iM3 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3), 1);
                int iM4 = (int) m(byteArrayInputStream, 2);
                while (iM4 > 0) {
                    m(byteArrayInputStream, 2);
                    int iM5 = (int) m(byteArrayInputStream, 1);
                    if (iM5 != 6 && iM5 != 7) {
                        while (iM5 > 0) {
                            m(byteArrayInputStream, 1);
                            int i11 = i5;
                            int i12 = i7;
                            for (int iM6 = (int) m(byteArrayInputStream, 1); iM6 > 0; iM6--) {
                                m(byteArrayInputStream, 2);
                            }
                            iM5--;
                            i5 = i11;
                            i7 = i12;
                        }
                    }
                    iM4--;
                    i5 = i5;
                    i7 = i7;
                }
            }
            int i13 = i5;
            int i14 = i7;
            if (byteArrayInputStream.available() != i10) {
                q.j("Read too much data during profile line parse");
                return null;
            }
            bVar.f2246h = g(byteArrayInputStream, bVar.f2244e);
            BitSet bitSetValueOf = BitSet.valueOf(f(byteArrayInputStream, (((i9 * 2) + 7) & (-8)) / 8));
            for (int i15 = i13; i15 < i9; i15++) {
                int i16 = bitSetValueOf.get(i15) ? 2 : i13;
                if (bitSetValueOf.get(i15 + i9)) {
                    i16 |= 4;
                }
                if (i16 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i15));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i13);
                    }
                    treeMap.put(Integer.valueOf(i15), Integer.valueOf(i16 | numValueOf.intValue()));
                }
            }
            i7 = i14 + 1;
            i5 = i13;
        }
        return bVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) throws IOException {
        long j4;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f2251d;
        int i4 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f2252e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrB = b(bVarArr, bArr3);
                u(byteArrayOutputStream, bVarArr.length, 1);
                u(byteArrayOutputStream, bArrB.length, 4);
                byte[] bArrA = a(bArrB);
                u(byteArrayOutputStream, bArrA.length, 4);
                byteArrayOutputStream.write(bArrA);
                return true;
            }
            byte[] bArr4 = f2253g;
            if (Arrays.equals(bArr, bArr4)) {
                u(byteArrayOutputStream, bVarArr.length, 1);
                for (b bVar : bVarArr) {
                    int size = bVar.f2247i.size() * 4;
                    String strD = d(bArr4, bVar.f2240a, bVar.f2241b);
                    Charset charset = StandardCharsets.UTF_8;
                    v(byteArrayOutputStream, strD.getBytes(charset).length);
                    v(byteArrayOutputStream, bVar.f2246h.length);
                    u(byteArrayOutputStream, size, 4);
                    u(byteArrayOutputStream, bVar.f2242c, 4);
                    byteArrayOutputStream.write(strD.getBytes(charset));
                    Iterator it = bVar.f2247i.keySet().iterator();
                    while (it.hasNext()) {
                        v(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        v(byteArrayOutputStream, 0);
                    }
                    for (int i5 : bVar.f2246h) {
                        v(byteArrayOutputStream, i5);
                    }
                }
                return true;
            }
            byte[] bArr5 = f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrB2 = b(bVarArr, bArr5);
                u(byteArrayOutputStream, bVarArr.length, 1);
                u(byteArrayOutputStream, bArrB2.length, 4);
                byte[] bArrA2 = a(bArrB2);
                u(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr6 = f2254h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            v(byteArrayOutputStream, bVarArr.length);
            for (b bVar2 : bVarArr) {
                String str = bVar2.f2240a;
                TreeMap treeMap = bVar2.f2247i;
                String strD2 = d(bArr6, str, bVar2.f2241b);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, strD2.getBytes(charset2).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, bVar2.f2246h.length);
                u(byteArrayOutputStream, bVar2.f2242c, 4);
                byteArrayOutputStream.write(strD2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i6 : bVar2.f2246h) {
                    v(byteArrayOutputStream, i6);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            v(byteArrayOutputStream2, bVarArr.length);
            int i7 = 2;
            int i8 = 2;
            for (b bVar3 : bVarArr) {
                u(byteArrayOutputStream2, bVar3.f2242c, 4);
                u(byteArrayOutputStream2, bVar3.f2243d, 4);
                u(byteArrayOutputStream2, bVar3.f2245g, 4);
                String strD3 = d(bArr2, bVar3.f2240a, bVar3.f2241b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strD3.getBytes(charset3).length;
                v(byteArrayOutputStream2, length2);
                i8 = i8 + 14 + length2;
                byteArrayOutputStream2.write(strD3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i8 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray.length);
            }
            j jVar = new j(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(jVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i9 = 0;
            int i10 = 0;
            while (i9 < bVarArr.length) {
                try {
                    b bVar4 = bVarArr[i9];
                    v(byteArrayOutputStream3, i9);
                    v(byteArrayOutputStream3, bVar4.f2244e);
                    i10 = i10 + 4 + (bVar4.f2244e * i7);
                    int[] iArr = bVar4.f2246h;
                    int length3 = iArr.length;
                    int i11 = i4;
                    int i12 = i7;
                    int i13 = i11;
                    while (i13 < length3) {
                        int i14 = iArr[i13];
                        v(byteArrayOutputStream3, i14 - i11);
                        i13++;
                        i11 = i14;
                    }
                    i9++;
                    i7 = i12;
                    i4 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i10 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray2.length);
            }
            j jVar2 = new j(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(jVar2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i15 = 0;
            int i16 = 0;
            while (i15 < bVarArr.length) {
                try {
                    b bVar5 = bVarArr[i15];
                    Iterator it3 = bVar5.f2247i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        r(byteArrayOutputStream5, iIntValue, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            s(byteArrayOutputStream6, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            v(byteArrayOutputStream4, i15);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i17 = i16 + 6;
                            ArrayList arrayList4 = arrayList3;
                            u(byteArrayOutputStream4, length4, 4);
                            v(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i16 = i17 + length4;
                            i15++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i16 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray5.length);
            }
            j jVar3 = new j(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(jVar3);
            long j5 = 4;
            long size2 = j5 + j5 + 4 + ((long) (arrayList2.size() * 16));
            u(byteArrayOutputStream, arrayList2.size(), 4);
            int i18 = 0;
            while (i18 < arrayList2.size()) {
                j jVar4 = (j) arrayList2.get(i18);
                int i19 = jVar4.f2266a;
                byte[] bArr7 = jVar4.f2267b;
                if (i19 == 1) {
                    j4 = 0;
                } else if (i19 == 2) {
                    j4 = 1;
                } else if (i19 == 3) {
                    j4 = 2;
                } else if (i19 == 4) {
                    j4 = 3;
                } else {
                    if (i19 != 5) {
                        throw null;
                    }
                    j4 = 4;
                }
                u(byteArrayOutputStream, j4, 4);
                u(byteArrayOutputStream, size2, 4);
                if (jVar4.f2268c) {
                    long length5 = bArr7.length;
                    byte[] bArrA3 = a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA3);
                    u(byteArrayOutputStream, bArrA3.length, 4);
                    u(byteArrayOutputStream, length5, 4);
                    length = bArrA3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    u(byteArrayOutputStream, bArr7.length, 4);
                    u(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i18++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i20));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b bVar) throws IOException {
        s(byteArrayOutputStream, bVar);
        int i4 = bVar.f2245g;
        int[] iArr = bVar.f2246h;
        int length = iArr.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = iArr[i5];
            v(byteArrayOutputStream, i7 - i6);
            i5++;
            i6 = i7;
        }
        byte[] bArr = new byte[(((i4 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f2247i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i8 = iIntValue / 8;
                bArr[i8] = (byte) (bArr[i8] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i9 = iIntValue + i4;
                int i10 = i9 / 8;
                bArr[i10] = (byte) ((1 << (i9 % 8)) | bArr[i10]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, bVar.f2244e);
        u(byteArrayOutputStream, bVar.f, 4);
        u(byteArrayOutputStream, bVar.f2242c, 4);
        u(byteArrayOutputStream, bVar.f2245g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i4, b bVar) throws IOException {
        int i5 = bVar.f2245g;
        byte[] bArr = new byte[(((Integer.bitCount(i4 & (-2)) * i5) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f2247i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i6 = 0;
            for (int i7 = 1; i7 <= 4; i7 <<= 1) {
                if (i7 != 1 && (i7 & i4) != 0) {
                    if ((i7 & iIntValue2) == i7) {
                        int i8 = (i6 * i5) + iIntValue;
                        int i9 = i8 / 8;
                        bArr[i9] = (byte) ((1 << (i8 % 8)) | bArr[i9]);
                    }
                    i6++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, b bVar) throws IOException {
        int i4 = 0;
        for (Map.Entry entry : bVar.f2247i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, iIntValue - i4);
                v(byteArrayOutputStream, 0);
                i4 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0188 A[Catch: all -> 0x0185, TRY_ENTER, TryCatch #23 {all -> 0x0185, blocks: (B:88:0x0164, B:90:0x0170, B:101:0x0188, B:102:0x018d), top: B:271:0x0164, outer: #34 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0199 A[Catch: IllegalStateException -> 0x017f, IOException -> 0x0181, FileNotFoundException -> 0x0183, TRY_LEAVE, TryCatch #34 {FileNotFoundException -> 0x0183, IOException -> 0x0181, IllegalStateException -> 0x017f, blocks: (B:86:0x015c, B:91:0x017a, B:109:0x0199, B:107:0x0196, B:106:0x0193, B:88:0x0164, B:90:0x0170, B:101:0x0188, B:102:0x018d, B:103:0x018e), top: B:293:0x015c, inners: #23, #31 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01af  */
    /* JADX WARN: Code duplicated, block: B:126:0x01d9 A[Catch: all -> 0x01e7, TRY_LEAVE, TryCatch #8 {all -> 0x01e7, blocks: (B:124:0x01cd, B:126:0x01d9, B:135:0x01ea), top: B:256:0x01cd, outer: #36 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x01ea A[Catch: all -> 0x01e7, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x01e7, blocks: (B:124:0x01cd, B:126:0x01d9, B:135:0x01ea), top: B:256:0x01cd, outer: #36 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0207  */
    /* JADX WARN: Code duplicated, block: B:150:0x0211  */
    /* JADX WARN: Code duplicated, block: B:151:0x0215  */
    /* JADX WARN: Code duplicated, block: B:160:0x0237 A[Catch: all -> 0x0275, TryCatch #17 {all -> 0x0275, blocks: (B:158:0x0231, B:160:0x0237, B:161:0x023b, B:163:0x0241), top: B:266:0x0231 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0241 A[Catch: all -> 0x0275, TRY_LEAVE, TryCatch #17 {all -> 0x0275, blocks: (B:158:0x0231, B:160:0x0237, B:161:0x023b, B:163:0x0241), top: B:266:0x0231 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:233:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:240:0x02de  */
    /* JADX WARN: Code duplicated, block: B:265:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x0219 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x0246 A[EDGE_INSN: B:294:0x0246->B:165:0x0246 BREAK  A[LOOP:0: B:161:0x023b->B:295:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111 A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_LEAVE, TryCatch #15 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:265:0x0107, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x012d A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_ENTER, TryCatch #15 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:265:0x0107, outer: #5 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0170 A[Catch: all -> 0x0185, TRY_LEAVE, TryCatch #23 {all -> 0x0185, blocks: (B:88:0x0164, B:90:0x0170, B:101:0x0188, B:102:0x018d), top: B:271:0x0164, outer: #34 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    public static void t(Context context, Executor executor, d dVar, boolean z4) {
        boolean z5;
        ?? B;
        byte[] bArr;
        b[] bVarArrL;
        b[] bVarArr;
        d dVar2;
        b[] bVarArr2;
        byte[] bArr2;
        ?? r7;
        byte[] bArr3;
        ?? r8;
        boolean z6;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr4;
        int i4;
        ?? r9;
        boolean z7;
        ?? byteArrayOutputStream;
        ?? r10;
        a aVar;
        ?? r11;
        FileInputStream fileInputStreamB;
        ?? r12;
        ?? r13;
        boolean z8;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z4) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j4 = dataInputStream.readLong();
                            dataInputStream.close();
                            z8 = j4 == packageInfo.lastUpdateTime;
                            if (z8) {
                                dVar.p(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z8 = false;
                    }
                } else {
                    z8 = false;
                }
                if (z8) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    i.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            a aVar2 = new a(assets, executor, dVar, name, file2);
            byte[] bArr5 = (byte[]) aVar2.f2236d;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            aVar2.f2233a = true;
                            B = aVar2.b(assets, "dexopt/baseline.prof");
                            bArr = f2249b;
                            if (B != 0) {
                                if (Arrays.equals(bArr, f(B, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                bVarArrL = l(B, f(B, 4), (String) aVar2.f2238g);
                                B.close();
                                aVar2.f2239h = bVarArrL;
                            }
                            bVarArr = (b[]) aVar2.f2239h;
                            if (bVarArr != null) {
                                B = "dexopt/baseline.profm";
                                fileInputStreamB = aVar2.b(assets, "dexopt/baseline.profm");
                                r11 = B;
                                if (fileInputStreamB == null) {
                                    if (fileInputStreamB != null) {
                                        fileInputStreamB.close();
                                        r11 = B;
                                    }
                                    aVar = null;
                                    B = r11;
                                } else {
                                    if (Arrays.equals(f2250c, f(fileInputStreamB, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrF = f(fileInputStreamB, 4);
                                    aVar2.f2239h = i(fileInputStreamB, bArrF, bArr5, bVarArr);
                                    fileInputStreamB.close();
                                    aVar = aVar2;
                                    B = bArrF;
                                }
                                if (aVar != null) {
                                    aVar2 = aVar;
                                }
                            }
                            dVar2 = (d) aVar2.f2235c;
                            bVarArr2 = (b[]) aVar2.f2239h;
                            bArr2 = (byte[]) aVar2.f2236d;
                            r7 = B;
                            r7 = B;
                            if (bVarArr2 != null) {
                                byteArrayOutputStream = aVar2.f2233a;
                                if (byteArrayOutputStream != 0) {
                                    q.j("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr2);
                                if (o(byteArrayOutputStream, bArr2, bVarArr2)) {
                                    aVar2.f2237e = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r10 = byteArrayOutputStream;
                                    aVar2.f2239h = null;
                                    r7 = r10;
                                } else {
                                    dVar2.p(5, null);
                                    aVar2.f2239h = null;
                                    byteArrayOutputStream.close();
                                    r7 = byteArrayOutputStream;
                                }
                            }
                            bArr3 = (byte[]) aVar2.f2237e;
                            if (bArr3 != null) {
                                if (aVar2.f2233a) {
                                    q.j("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                fileOutputStream = new FileOutputStream((File) aVar2.f);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr4 = new byte[512];
                                        while (true) {
                                            i4 = byteArrayInputStream.read(bArr4);
                                            if (i4 > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr4, 0, i4);
                                        }
                                        r9 = 1;
                                        aVar2.c(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        aVar2.f2237e = null;
                                        aVar2.f2239h = null;
                                        z6 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z6 = false;
                            r9 = 1;
                            if (z6) {
                                e(packageInfo, filesDir);
                            }
                            z7 = z6;
                            r12 = r9;
                        } else {
                            aVar2.c(4, null);
                        }
                    } catch (IOException unused2) {
                        z5 = true;
                        aVar2.c(4, null);
                    }
                } else if (file2.canWrite()) {
                    aVar2.f2233a = true;
                    try {
                        B = aVar2.b(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e5) {
                        dVar.p(6, e5);
                        B = 0;
                    } catch (IOException e6) {
                        dVar.p(7, e6);
                        B = 0;
                    }
                    bArr = f2249b;
                    try {
                        if (B != 0) {
                            try {
                                try {
                                    if (Arrays.equals(bArr, f(B, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    bVarArrL = l(B, f(B, 4), (String) aVar2.f2238g);
                                    try {
                                        B.close();
                                    } catch (IOException e7) {
                                        dVar.p(7, e7);
                                    }
                                    aVar2.f2239h = bVarArrL;
                                } catch (IOException e8) {
                                    dVar.p(7, e8);
                                    try {
                                        B.close();
                                    } catch (IOException e9) {
                                        dVar.p(7, e9);
                                    }
                                    bVarArrL = null;
                                }
                            } catch (IllegalStateException e10) {
                                dVar.p(8, e10);
                                B.close();
                                bVarArrL = null;
                            }
                        }
                        bVarArr = (b[]) aVar2.f2239h;
                        if (bVarArr != null && (B = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                B = "dexopt/baseline.profm";
                                fileInputStreamB = aVar2.b(assets, "dexopt/baseline.profm");
                                r11 = B;
                                if (fileInputStreamB == null) {
                                    try {
                                        if (Arrays.equals(f2250c, f(fileInputStreamB, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        byte[] bArrF2 = f(fileInputStreamB, 4);
                                        aVar2.f2239h = i(fileInputStreamB, bArrF2, bArr5, bVarArr);
                                        fileInputStreamB.close();
                                        aVar = aVar2;
                                        B = bArrF2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamB.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamB != null) {
                                        fileInputStreamB.close();
                                        r11 = B;
                                    }
                                    aVar = null;
                                    B = r11;
                                }
                            } catch (FileNotFoundException e11) {
                                dVar.p(9, e11);
                                r11 = B;
                                aVar = null;
                                B = r11;
                            } catch (IOException e12) {
                                dVar.p(7, e12);
                                r11 = B;
                                aVar = null;
                                B = r11;
                            } catch (IllegalStateException e13) {
                                aVar2.f2239h = null;
                                dVar.p(8, e13);
                                r11 = B;
                                aVar = null;
                                B = r11;
                            }
                            if (aVar != null) {
                                aVar2 = aVar;
                            }
                        }
                        dVar2 = (d) aVar2.f2235c;
                        bVarArr2 = (b[]) aVar2.f2239h;
                        bArr2 = (byte[]) aVar2.f2236d;
                        r7 = B;
                        r7 = B;
                        if (bVarArr2 != null && bArr2 != null) {
                            byteArrayOutputStream = aVar2.f2233a;
                            if (byteArrayOutputStream != 0) {
                                q.j("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr2);
                                    if (o(byteArrayOutputStream, bArr2, bVarArr2)) {
                                        dVar2.p(5, null);
                                        aVar2.f2239h = null;
                                        byteArrayOutputStream.close();
                                        r7 = byteArrayOutputStream;
                                    } else {
                                        aVar2.f2237e = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        r10 = byteArrayOutputStream;
                                        aVar2.f2239h = null;
                                        r7 = r10;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e14) {
                                dVar2.p(7, e14);
                                r10 = byteArrayOutputStream;
                            } catch (IllegalStateException e15) {
                                dVar2.p(8, e15);
                                r10 = byteArrayOutputStream;
                            }
                        }
                        bArr3 = (byte[]) aVar2.f2237e;
                        if (bArr3 != null) {
                            z6 = false;
                            r9 = 1;
                        } else {
                            try {
                                if (aVar2.f2233a) {
                                    q.j("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream((File) aVar2.f);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr4 = new byte[512];
                                                                                while (true) {
                                                                                    i4 = byteArrayInputStream.read(bArr4);
                                                                                    if (i4 > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr4, 0, i4);
                                                                                    }
                                                                                }
                                                                                r9 = 1;
                                                                                aVar2.c(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                aVar2.f2237e = null;
                                                                                aVar2.f2239h = null;
                                                                                z6 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    Throwable th13 = th;
                                                                    if (channel == null) {
                                                                        throw th13;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th13;
                                                                    } catch (Throwable th14) {
                                                                        th13.addSuppressed(th14);
                                                                        throw th13;
                                                                    }
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e16) {
                                        e = e16;
                                        aVar2.c(6, e);
                                        r8 = r7;
                                        aVar2.f2237e = null;
                                        aVar2.f2239h = null;
                                        z6 = false;
                                        r9 = r8;
                                    } catch (IOException e17) {
                                        e = e17;
                                        aVar2.c(7, e);
                                        r8 = r7;
                                        aVar2.f2237e = null;
                                        aVar2.f2239h = null;
                                        z6 = false;
                                        r9 = r8;
                                    }
                                } catch (FileNotFoundException e18) {
                                    e = e18;
                                    r7 = 1;
                                    aVar2.c(6, e);
                                    r8 = r7;
                                    aVar2.f2237e = null;
                                    aVar2.f2239h = null;
                                    z6 = false;
                                    r9 = r8;
                                } catch (IOException e19) {
                                    e = e19;
                                    r7 = 1;
                                    aVar2.c(7, e);
                                    r8 = r7;
                                    aVar2.f2237e = null;
                                    aVar2.f2239h = null;
                                    z6 = false;
                                    r9 = r8;
                                }
                            } catch (Throwable th23) {
                                aVar2.f2237e = null;
                                aVar2.f2239h = null;
                                throw th23;
                            }
                        }
                        if (z6) {
                            e(packageInfo, filesDir);
                        }
                        z7 = z6;
                        r12 = r9;
                    } catch (Throwable th24) {
                        try {
                            B.close();
                            throw th24;
                        } catch (IOException e20) {
                            dVar.p(7, e20);
                            throw th24;
                        }
                    }
                } else {
                    aVar2.c(4, null);
                }
                if (z7 || !z4) {
                    r13 = 0;
                } else {
                    r13 = r12;
                }
                i.c(context, r13);
            }
            aVar2.c(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z5 = true;
            z7 = false;
            r12 = z5;
            if (z7) {
                r13 = 0;
            } else {
                r13 = 0;
            }
            i.c(context, r13);
        } catch (PackageManager.NameNotFoundException e21) {
            dVar.p(7, e21);
            i.c(context, false);
        }
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j4, int i4) throws IOException {
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = (byte) ((j4 >> (i5 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i4) throws IOException {
        u(byteArrayOutputStream, i4, 2);
    }
}
