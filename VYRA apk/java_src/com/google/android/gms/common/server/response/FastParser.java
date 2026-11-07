package com.google.android.gms.common.server.response;

import android.util.Log;
import androidx.fragment.app.q;
import androidx.fragment.app.u;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
public class FastParser<T extends FastJsonResponse> {
    private static final char[] zaa = {'u', 'l', 'l'};
    private static final char[] zab = {'r', 'u', 'e'};
    private static final char[] zac = {'r', 'u', 'e', '\"'};
    private static final char[] zad = {'a', 'l', 's', 'e'};
    private static final char[] zae = {'a', 'l', 's', 'e', '\"'};
    private static final char[] zaf = {'\n'};
    private static final zai zag = new zaa();
    private static final zai zah = new zab();
    private static final zai zai = new zac();
    private static final zai zaj = new zad();
    private static final zai zak = new zae();
    private static final zai zal = new zaf();
    private static final zai zam = new zag();
    private static final zai zan = new zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[1024];
    private final StringBuilder zar = new StringBuilder(32);
    private final StringBuilder zas = new StringBuilder(1024);
    private final Stack zat = new Stack();

    private static final String zaA(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) throws ParseException, IOException {
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            int i4 = bufferedReader.read(cArr);
            if (i4 == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            int i5 = 0;
            while (i5 < i4) {
                char c4 = cArr[i5];
                if (Character.isISOControl(c4) && (cArr2 == null || cArr2[0] != c4)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                int i6 = i5 + 1;
                if (c4 != '\"') {
                    if (c4 == '\\') {
                        z4 = !z4;
                        z5 = true;
                    }
                    i5 = i6;
                } else if (!z4) {
                    sb.append(cArr, 0, i5);
                    bufferedReader.reset();
                    bufferedReader.skip(i6);
                    return z5 ? JsonUtils.unescapeString(sb.toString()) : sb.toString();
                }
                z4 = false;
                i5 = i6;
            }
            sb.append(cArr, 0, i4);
            bufferedReader.mark(cArr.length);
        }
    }

    private final char zai(BufferedReader bufferedReader) {
        char[] cArr;
        if (bufferedReader.read(this.zao) != -1) {
            do {
                boolean zIsWhitespace = Character.isWhitespace(this.zao[0]);
                cArr = this.zao;
                if (!zIsWhitespace) {
                    return cArr[0];
                }
            } while (bufferedReader.read(cArr) != -1);
        }
        return (char) 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zak(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zal(BufferedReader bufferedReader) throws ParseException, IOException {
        int i4;
        int i5;
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (iZam <= 0) {
            throw new ParseException("No number to parse");
        }
        char c4 = cArr[0];
        int i6 = c4 == '-' ? Integer.MIN_VALUE : -2147483647;
        int i7 = c4 == '-' ? 1 : 0;
        if (i7 < iZam) {
            i5 = i7 + 1;
            int iDigit = Character.digit(cArr[i7], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            i4 = -iDigit;
        } else {
            i4 = 0;
            i5 = i7;
        }
        while (i5 < iZam) {
            int i8 = i5 + 1;
            int iDigit2 = Character.digit(cArr[i5], 10);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (i4 < -214748364) {
                throw new ParseException("Number too large");
            }
            int i9 = i4 * 10;
            if (i9 < i6 + iDigit2) {
                throw new ParseException("Number too large");
            }
            i4 = i9 - iDigit2;
            i5 = i8;
        }
        if (i7 == 0) {
            return -i4;
        }
        if (i5 > 1) {
            return i4;
        }
        throw new ParseException("No digits to parse");
    }

    @ResultIgnorabilityUnspecified
    private final int zam(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i4;
        char cZai = zai(bufferedReader);
        if (cZai == 0) {
            throw new ParseException("Unexpected EOF");
        }
        if (cZai == ',') {
            throw new ParseException("Missing value");
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return 0;
        }
        bufferedReader.mark(1024);
        if (cZai == '\"') {
            i4 = 0;
            boolean z4 = false;
            while (i4 < 1024 && bufferedReader.read(cArr, i4, 1) != -1) {
                char c4 = cArr[i4];
                if (Character.isISOControl(c4)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
                int i5 = i4 + 1;
                if (c4 != '\"') {
                    if (c4 == '\\') {
                        z4 = !z4;
                    }
                    i4 = i5;
                } else if (!z4) {
                    bufferedReader.reset();
                    bufferedReader.skip(i5);
                    return i4;
                }
                z4 = false;
                i4 = i5;
            }
        } else {
            cArr[0] = cZai;
            i4 = 1;
            while (i4 < 1024 && bufferedReader.read(cArr, i4, 1) != -1) {
                char c5 = cArr[i4];
                if (c5 == '}' || c5 == ',' || Character.isWhitespace(c5) || cArr[i4] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i4 - 1);
                    cArr[i4] = 0;
                    return i4;
                }
                i4++;
            }
        }
        if (i4 == 1024) {
            throw new ParseException("Absurdly long value");
        }
        throw new ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(BufferedReader bufferedReader) throws ParseException, IOException {
        long j4;
        int i4;
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (iZam <= 0) {
            throw new ParseException("No number to parse");
        }
        char c4 = cArr[0];
        long j5 = c4 == '-' ? Long.MIN_VALUE : -9223372036854775807L;
        int i5 = c4 == '-' ? 1 : 0;
        int i6 = 10;
        if (i5 < iZam) {
            i4 = i5 + 1;
            int iDigit = Character.digit(cArr[i5], 10);
            if (iDigit < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            j4 = -iDigit;
        } else {
            j4 = 0;
            i4 = i5;
        }
        while (i4 < iZam) {
            int i7 = i4 + 1;
            int iDigit2 = Character.digit(cArr[i4], i6);
            if (iDigit2 < 0) {
                throw new ParseException("Unexpected non-digit character");
            }
            if (j4 < -922337203685477580L) {
                throw new ParseException("Number too large");
            }
            long j6 = j4 * 10;
            long j7 = j5;
            long j8 = iDigit2;
            if (j6 < j7 + j8) {
                throw new ParseException("Number too large");
            }
            j4 = j6 - j8;
            i4 = i7;
            j5 = j7;
            i6 = 10;
        }
        if (i5 == 0) {
            return -j4;
        }
        if (i4 > 1) {
            return j4;
        }
        throw new ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zao(BufferedReader bufferedReader) {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    private final String zap(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, char[] cArr2) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            return zaA(bufferedReader, cArr, sb, cArr2);
        }
        if (cZai != 'n') {
            throw new ParseException("Expected string");
        }
        zax(bufferedReader, zaa);
        return null;
    }

    @ResultIgnorabilityUnspecified
    private final String zaq(BufferedReader bufferedReader) throws ParseException, IOException {
        this.zat.push(2);
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            this.zat.push(3);
            String strZaA = zaA(bufferedReader, this.zap, this.zar, null);
            zaw(3);
            if (zai(bufferedReader) == ':') {
                return strZaA;
            }
            throw new ParseException("Expected key/value separator");
        }
        if (cZai == ']') {
            zaw(2);
            zaw(1);
            zaw(5);
            return null;
        }
        if (cZai == '}') {
            zaw(2);
            return null;
        }
        q.f(cZai, "Unexpected token: ");
        return null;
    }

    private final String zar(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(1024);
        char cZai = zai(bufferedReader);
        int i4 = 1;
        if (cZai != '\"') {
            if (cZai == ',') {
                throw new ParseException("Missing value");
            }
            if (cZai == '[') {
                this.zat.push(5);
                bufferedReader.mark(32);
                if (zai(bufferedReader) == ']') {
                    zaw(5);
                } else {
                    bufferedReader.reset();
                    boolean z4 = false;
                    boolean z5 = false;
                    while (i4 > 0) {
                        char cZai2 = zai(bufferedReader);
                        if (cZai2 == 0) {
                            throw new ParseException("Unexpected EOF while parsing array");
                        }
                        if (Character.isISOControl(cZai2)) {
                            throw new ParseException("Unexpected control character while reading array");
                        }
                        if (cZai2 == '\"') {
                            if (!z5) {
                                z4 = !z4;
                            }
                            cZai2 = '\"';
                        }
                        if (cZai2 == '[') {
                            if (!z4) {
                                i4++;
                            }
                            cZai2 = '[';
                        }
                        if (cZai2 == ']' && !z4) {
                            i4--;
                        }
                        z5 = (cZai2 == '\\' && z4) ? !z5 : false;
                    }
                    zaw(5);
                }
            } else if (cZai != '{') {
                bufferedReader.reset();
                zam(bufferedReader, this.zaq);
            } else {
                this.zat.push(1);
                bufferedReader.mark(32);
                char cZai3 = zai(bufferedReader);
                if (cZai3 == '}') {
                    zaw(1);
                } else {
                    if (cZai3 != '\"') {
                        q.f(cZai3, "Unexpected token ");
                        return null;
                    }
                    bufferedReader.reset();
                    zaq(bufferedReader);
                    while (zar(bufferedReader) != null) {
                    }
                    zaw(1);
                }
            }
        } else {
            if (bufferedReader.read(this.zao) == -1) {
                throw new ParseException("Unexpected EOF while parsing string");
            }
            char c4 = this.zao[0];
            boolean z6 = false;
            while (true) {
                if (c4 == '\"') {
                    if (!z6) {
                        break;
                    }
                    z6 = true;
                    c4 = '\"';
                }
                z6 = c4 == '\\' ? !z6 : false;
                if (bufferedReader.read(this.zao) == -1) {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
                c4 = this.zao[0];
                if (Character.isISOControl(c4)) {
                    throw new ParseException("Unexpected control character while reading string");
                }
            }
        }
        char cZai4 = zai(bufferedReader);
        if (cZai4 == ',') {
            zaw(2);
            return zaq(bufferedReader);
        }
        if (cZai4 == '}') {
            zaw(2);
            return null;
        }
        q.f(cZai4, "Unexpected token ");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigDecimal zas(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return null;
        }
        return new BigDecimal(new String(this.zaq, 0, iZam));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BigInteger zat(BufferedReader bufferedReader) throws ParseException, IOException {
        int iZam = zam(bufferedReader, this.zaq);
        if (iZam == 0) {
            return null;
        }
        return new BigInteger(new String(this.zaq, 0, iZam));
    }

    private final ArrayList zau(BufferedReader bufferedReader, zai zaiVar) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return null;
        }
        if (cZai != '[') {
            throw new ParseException("Expected start of array");
        }
        this.zat.push(5);
        ArrayList arrayList = new ArrayList();
        while (true) {
            bufferedReader.mark(1024);
            char cZai2 = zai(bufferedReader);
            if (cZai2 == 0) {
                throw new ParseException("Unexpected EOF");
            }
            if (cZai2 != ',') {
                if (cZai2 == ']') {
                    zaw(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(zaiVar.zaa(this, bufferedReader));
            }
        }
    }

    private final ArrayList zav(BufferedReader bufferedReader, FastJsonResponse.Field field) throws ParseException, IOException {
        ArrayList arrayList = new ArrayList();
        char cZai = zai(bufferedReader);
        if (cZai == ']') {
            zaw(5);
            return arrayList;
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            zaw(5);
            return null;
        }
        if (cZai != '{') {
            q.f(cZai, "Unexpected token: ");
            return null;
        }
        this.zat.push(1);
        while (true) {
            try {
                FastJsonResponse fastJsonResponseZad = field.zad();
                if (!zaz(bufferedReader, fastJsonResponseZad)) {
                    return arrayList;
                }
                arrayList.add(fastJsonResponseZad);
                char cZai2 = zai(bufferedReader);
                if (cZai2 != ',') {
                    if (cZai2 == ']') {
                        zaw(5);
                        return arrayList;
                    }
                    q.f(cZai2, "Unexpected token: ");
                    return null;
                }
                if (zai(bufferedReader) != '{') {
                    throw new ParseException("Expected start of next object in array");
                }
                this.zat.push(1);
            } catch (IllegalAccessException e5) {
                throw new ParseException("Error instantiating inner object", e5);
            } catch (InstantiationException e6) {
                throw new ParseException("Error instantiating inner object", e6);
            }
        }
    }

    private final void zaw(int i4) throws ParseException {
        if (this.zat.isEmpty()) {
            throw new ParseException("Expected state " + i4 + " but had empty stack");
        }
        int iIntValue = ((Integer) this.zat.pop()).intValue();
        if (iIntValue == i4) {
            return;
        }
        throw new ParseException("Expected state " + i4 + " but had " + iIntValue);
    }

    private final void zax(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i4 = 0;
        while (true) {
            int length = cArr.length;
            if (i4 >= length) {
                return;
            }
            int i5 = bufferedReader.read(this.zap, 0, length - i4);
            if (i5 == -1) {
                throw new ParseException("Unexpected EOF");
            }
            for (int i6 = 0; i6 < i5; i6++) {
                if (cArr[i6 + i4] != this.zap[i6]) {
                    throw new ParseException("Unexpected character");
                }
            }
            i4 += i5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(BufferedReader bufferedReader, boolean z4) throws ParseException, IOException {
        char cZai = zai(bufferedReader);
        if (cZai == '\"') {
            if (z4) {
                throw new ParseException("No boolean value found in string");
            }
            return zay(bufferedReader, true);
        }
        if (cZai == 'f') {
            zax(bufferedReader, z4 ? zae : zad);
            return false;
        }
        if (cZai == 'n') {
            zax(bufferedReader, zaa);
            return false;
        }
        if (cZai == 't') {
            zax(bufferedReader, z4 ? zac : zab);
            return true;
        }
        q.f(cZai, "Unexpected token: ");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0245  */
    /* JADX WARN: Code duplicated, block: B:131:0x024f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @ResultIgnorabilityUnspecified
    private final boolean zaz(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) throws ParseException, IOException {
        int i4;
        HashMap map;
        char cZai;
        Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        String strZaq = zaq(bufferedReader);
        if (strZaq == null) {
            zaw(1);
            return false;
        }
        while (strZaq != null) {
            FastJsonResponse.Field<?, ?> field = fieldMappings.get(strZaq);
            if (field == null) {
                strZaq = zar(bufferedReader);
            } else {
                this.zat.push(4);
                int i5 = field.zaa;
                switch (i5) {
                    case 0:
                        if (field.zab) {
                            fastJsonResponse.zav(field, zau(bufferedReader, zag));
                        } else {
                            fastJsonResponse.zau(field, zal(bufferedReader));
                        }
                        i4 = 4;
                        zaw(i4);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                q.f(cZai, "Expected end of object or field separator, but found: ");
                                return false;
                            }
                            strZaq = null;
                        }
                        break;
                    case 1:
                        if (field.zab) {
                            fastJsonResponse.zag(field, zau(bufferedReader, zam));
                        } else {
                            fastJsonResponse.zae(field, zat(bufferedReader));
                        }
                        i4 = 4;
                        zaw(i4);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                q.f(cZai, "Expected end of object or field separator, but found: ");
                                return false;
                            }
                            strZaq = null;
                        }
                        break;
                    case 2:
                        if (field.zab) {
                            fastJsonResponse.zay(field, zau(bufferedReader, zah));
                        } else {
                            fastJsonResponse.zax(field, zan(bufferedReader));
                        }
                        i4 = 4;
                        zaw(i4);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                q.f(cZai, "Expected end of object or field separator, but found: ");
                                return false;
                            }
                            strZaq = null;
                        }
                        break;
                    case 3:
                        if (field.zab) {
                            fastJsonResponse.zas(field, zau(bufferedReader, zai));
                        } else {
                            fastJsonResponse.zaq(field, zak(bufferedReader));
                        }
                        i4 = 4;
                        zaw(i4);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                q.f(cZai, "Expected end of object or field separator, but found: ");
                                return false;
                            }
                            strZaq = null;
                        }
                        break;
                    case 4:
                        if (field.zab) {
                            fastJsonResponse.zao(field, zau(bufferedReader, zaj));
                        } else {
                            fastJsonResponse.zam(field, zaj(bufferedReader));
                        }
                        i4 = 4;
                        zaw(i4);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                q.f(cZai, "Expected end of object or field separator, but found: ");
                                return false;
                            }
                            strZaq = null;
                        }
                        break;
                    case 5:
                        if (field.zab) {
                            fastJsonResponse.zac(field, zau(bufferedReader, zan));
                        } else {
                            fastJsonResponse.zaa(field, zas(bufferedReader));
                        }
                        i4 = 4;
                        zaw(i4);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                q.f(cZai, "Expected end of object or field separator, but found: ");
                                return false;
                            }
                            strZaq = null;
                        }
                        break;
                    case 6:
                        if (field.zab) {
                            fastJsonResponse.zaj(field, zau(bufferedReader, zak));
                        } else {
                            fastJsonResponse.zai(field, zay(bufferedReader, false));
                        }
                        i4 = 4;
                        zaw(i4);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                q.f(cZai, "Expected end of object or field separator, but found: ");
                                return false;
                            }
                            strZaq = null;
                        }
                        break;
                    case 7:
                        if (field.zab) {
                            fastJsonResponse.zaC(field, zau(bufferedReader, zal));
                        } else {
                            fastJsonResponse.zaA(field, zao(bufferedReader));
                        }
                        i4 = 4;
                        zaw(i4);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                q.f(cZai, "Expected end of object or field separator, but found: ");
                                return false;
                            }
                            strZaq = null;
                        }
                        break;
                    case 8:
                        fastJsonResponse.zal(field, Base64Utils.decode(zap(bufferedReader, this.zaq, this.zas, zaf)));
                        i4 = 4;
                        zaw(i4);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                q.f(cZai, "Expected end of object or field separator, but found: ");
                                return false;
                            }
                            strZaq = null;
                        }
                        break;
                    case ConnectionResult.SERVICE_INVALID /* 9 */:
                        fastJsonResponse.zal(field, Base64Utils.decodeUrlSafe(zap(bufferedReader, this.zaq, this.zas, zaf)));
                        i4 = 4;
                        zaw(i4);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                q.f(cZai, "Expected end of object or field separator, but found: ");
                                return false;
                            }
                            strZaq = null;
                        }
                        break;
                    case 10:
                        char cZai2 = zai(bufferedReader);
                        if (cZai2 == 'n') {
                            zax(bufferedReader, zaa);
                            map = null;
                        } else {
                            if (cZai2 != '{') {
                                throw new ParseException("Expected start of a map object");
                            }
                            this.zat.push(1);
                            map = new HashMap();
                            while (true) {
                                char cZai3 = zai(bufferedReader);
                                if (cZai3 == 0) {
                                    throw new ParseException("Unexpected EOF");
                                }
                                if (cZai3 == '\"') {
                                    String strZaA = zaA(bufferedReader, this.zap, this.zar, null);
                                    if (zai(bufferedReader) != ':') {
                                        throw new ParseException("No map value found for key ".concat(String.valueOf(strZaA)));
                                    }
                                    if (zai(bufferedReader) != '\"') {
                                        throw new ParseException("Expected String value for key ".concat(String.valueOf(strZaA)));
                                    }
                                    map.put(strZaA, zaA(bufferedReader, this.zap, this.zar, null));
                                    char cZai4 = zai(bufferedReader);
                                    if (cZai4 != ',') {
                                        if (cZai4 != '}') {
                                            q.f(cZai4, "Unexpected character while parsing string map: ");
                                            return false;
                                        }
                                        zaw(1);
                                    }
                                } else if (cZai3 == '}') {
                                    zaw(1);
                                }
                                i4 = 4;
                                zaw(i4);
                                zaw(2);
                                cZai = zai(bufferedReader);
                                if (cZai == ',') {
                                    strZaq = zaq(bufferedReader);
                                } else {
                                    if (cZai != '}') {
                                        q.f(cZai, "Expected end of object or field separator, but found: ");
                                        return false;
                                    }
                                    strZaq = null;
                                }
                            }
                        }
                        fastJsonResponse.zaB(field, map);
                        i4 = 4;
                        zaw(i4);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                q.f(cZai, "Expected end of object or field separator, but found: ");
                                return false;
                            }
                            strZaq = null;
                        }
                        break;
                    case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                        if (!field.zab) {
                            char cZai5 = zai(bufferedReader);
                            if (cZai5 == 'n') {
                                zax(bufferedReader, zaa);
                                fastJsonResponse.addConcreteTypeInternal(field, field.zae, null);
                            } else {
                                this.zat.push(1);
                                if (cZai5 != '{') {
                                    throw new ParseException("Expected start of object");
                                }
                                try {
                                    FastJsonResponse fastJsonResponseZad = field.zad();
                                    zaz(bufferedReader, fastJsonResponseZad);
                                    fastJsonResponse.addConcreteTypeInternal(field, field.zae, fastJsonResponseZad);
                                } catch (IllegalAccessException e5) {
                                    throw new ParseException("Error instantiating inner object", e5);
                                } catch (InstantiationException e6) {
                                    throw new ParseException("Error instantiating inner object", e6);
                                }
                            }
                            break;
                        } else {
                            char cZai6 = zai(bufferedReader);
                            if (cZai6 == 'n') {
                                zax(bufferedReader, zaa);
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, null);
                            } else {
                                this.zat.push(5);
                                if (cZai6 != '[') {
                                    throw new ParseException("Expected array start");
                                }
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, zav(bufferedReader, field));
                            }
                        }
                        i4 = 4;
                        zaw(i4);
                        zaw(2);
                        cZai = zai(bufferedReader);
                        if (cZai == ',') {
                            strZaq = zaq(bufferedReader);
                        } else {
                            if (cZai != '}') {
                                q.f(cZai, "Expected end of object or field separator, but found: ");
                                return false;
                            }
                            strZaq = null;
                        }
                        break;
                    default:
                        throw new ParseException(u.k(i5, "Invalid field type "));
                }
            }
        }
        zaw(1);
        return true;
    }

    @KeepForSdk
    public void parse(InputStream inputStream, T t4) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zat.push(0);
                char cZai = zai(bufferedReader);
                if (cZai == 0) {
                    throw new ParseException("No data to parse");
                }
                if (cZai == '[') {
                    this.zat.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> fieldMappings = t4.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                    FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t4.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                } else {
                    if (cZai != '{') {
                        throw new ParseException("Unexpected token: " + cZai);
                    }
                    this.zat.push(1);
                    zaz(bufferedReader, t4);
                }
                zaw(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                }
            } catch (IOException e5) {
                throw new ParseException(e5);
            }
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
                Log.w("FastParser", "Failed to close reader while parsing.");
            }
            throw th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    @ShowFirstParty
    @KeepForSdk
    public static class ParseException extends Exception {
        public ParseException(String str, Throwable th) {
            super("Error instantiating inner object", th);
        }

        public ParseException(String str) {
            super(str);
        }

        public ParseException(Throwable th) {
            super(th);
        }
    }
}
