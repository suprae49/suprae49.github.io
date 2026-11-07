package n0;

import android.text.SpannableStringBuilder;
import com.google.android.gms.common.ConnectionResult;
import e.k0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f3076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f3077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f3078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f3079e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3080a;

    static {
        k0 k0Var = f.f3088c;
        f3076b = Character.toString((char) 8206);
        f3077c = Character.toString((char) 8207);
        f3078d = new b(false);
        f3079e = new b(true);
    }

    public b(boolean z4) {
        k0 k0Var = f.f3086a;
        this.f3080a = z4;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f3074c = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = aVar.f3074c;
            if (i7 < aVar.f3073b && i4 == 0) {
                CharSequence charSequence2 = aVar.f3072a;
                char cCharAt = charSequence2.charAt(i7);
                aVar.f3075d = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i8 = aVar.f3074c;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence2, i8);
                    aVar.f3074c = Character.charCount(iCodePointAt) + aVar.f3074c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    aVar.f3074c = i8 + 1;
                    char c4 = aVar.f3075d;
                    directionality = c4 < 1792 ? a.f3071e[c4] : Character.getDirectionality(c4);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i6 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i6++;
                                i5 = -1;
                                continue;
                            case 16:
                            case 17:
                                i6++;
                                i5 = 1;
                                continue;
                            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                                i6--;
                                i5 = 0;
                                continue;
                        }
                    }
                } else if (i6 == 0) {
                    return -1;
                }
                i4 = i6;
            }
        }
        if (i4 != 0) {
            if (i5 == 0) {
                while (aVar.f3074c > 0) {
                    switch (aVar.a()) {
                        case 14:
                        case 15:
                            if (i4 == i6) {
                                return -1;
                            }
                            i6--;
                            break;
                        case 16:
                        case 17:
                            if (i4 == i6) {
                                return 1;
                            }
                            i6--;
                            break;
                        case ConnectionResult.SERVICE_UPDATING /* 18 */:
                            i6++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i5;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f3074c = aVar.f3073b;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            while (aVar.f3074c > 0) {
                byte bA = aVar.a();
                if (bA == 0) {
                    if (i4 == 0) {
                        return -1;
                    }
                    if (i5 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i4 == 0) {
                        return 1;
                    }
                    if (i5 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i5 == i4) {
                                return -1;
                            }
                            i4--;
                            break;
                        case 16:
                        case 17:
                            if (i5 == i4) {
                                return 1;
                            }
                            i4--;
                            break;
                        case ConnectionResult.SERVICE_UPDATING /* 18 */:
                            i4++;
                            break;
                        default:
                            if (i5 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        String str;
        k0 k0Var = f.f3088c;
        if (charSequence == null) {
            return null;
        }
        boolean zC = k0Var.c(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zC2 = (zC ? f.f3087b : f.f3086a).c(charSequence, charSequence.length());
        String str2 = "";
        String str3 = f3077c;
        String str4 = f3076b;
        boolean z4 = this.f3080a;
        if (z4 || !(zC2 || a(charSequence) == 1)) {
            str = (!z4 || (zC2 && a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zC != z4) {
            spannableStringBuilder.append(zC ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zC3 = (zC ? f.f3087b : f.f3086a).c(charSequence, charSequence.length());
        if (!z4 && (zC3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z4 && (!zC3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
