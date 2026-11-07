package y3;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends h {
    public static boolean t(String str, String str2) {
        str.getClass();
        return v(str, str2, 0, 2) >= 0;
    }

    public static final int u(CharSequence charSequence, String str, int i4, boolean z4) {
        String str2;
        boolean z5;
        boolean zRegionMatches;
        charSequence.getClass();
        str.getClass();
        if (!z4 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i4);
        }
        int length = charSequence.length();
        if (i4 < 0) {
            i4 = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        v3.b bVar = new v3.b(i4, length, 1);
        boolean z6 = charSequence instanceof String;
        int i5 = bVar.f4407g;
        if (!z6) {
            if (i4 > i5) {
                return -1;
            }
            while (!x(str, charSequence, i4, str.length(), z4)) {
                if (i4 == i5) {
                    return -1;
                }
                i4++;
            }
            return i4;
        }
        if (i4 > i5) {
            return -1;
        }
        int i6 = i4;
        while (true) {
            String str3 = (String) charSequence;
            int length3 = str.length();
            if (z4) {
                str2 = str;
                z5 = z4;
                zRegionMatches = str2.regionMatches(z5, 0, str3, i6, length3);
            } else {
                zRegionMatches = str.regionMatches(0, str3, i6, length3);
                str2 = str;
                z5 = z4;
            }
            if (zRegionMatches) {
                return i6;
            }
            if (i6 == i5) {
                return -1;
            }
            i6++;
            str = str2;
            z4 = z5;
        }
    }

    public static /* synthetic */ int v(CharSequence charSequence, String str, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return u(charSequence, str, i4, false);
    }

    public static boolean w(CharSequence charSequence) {
        charSequence.getClass();
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean x(CharSequence charSequence, CharSequence charSequence2, int i4, int i5, boolean z4) {
        char upperCase;
        char upperCase2;
        charSequence.getClass();
        charSequence2.getClass();
        if (i4 >= 0 && charSequence.length() - i5 >= 0 && i4 <= charSequence2.length() - i5) {
            for (int i6 = 0; i6 < i5; i6++) {
                char cCharAt = charSequence.charAt(i6);
                char cCharAt2 = charSequence2.charAt(i4 + i6);
                if (cCharAt == cCharAt2 || (z4 && ((upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(cCharAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static String y(String str, String str2) {
        int iV = v(str, str2, 0, 6);
        return iV == -1 ? str : str.substring(str2.length() + iV, str.length());
    }
}
