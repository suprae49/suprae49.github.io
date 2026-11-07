package a3;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Path;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import co.median.android.eeqadjy.R;
import com.google.android.gms.common.ConnectionResult;
import p0.y1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class f implements s0, r2.c0, i1.d, j.x, p0.v, w1.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static f f51g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static f f52h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static f f53i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f54j = 0;
    public final /* synthetic */ int f;

    public /* synthetic */ f(int i4) {
        this.f = i4;
    }

    public static Path k(float f, float f4, float f5, float f6) {
        Path path = new Path();
        path.moveTo(f, f4);
        path.lineTo(f5, f6);
        return path;
    }

    public static boolean o(b1.b bVar, Editable editable, int i4, int i5, boolean z4) {
        int iMin;
        if (editable != null && i4 >= 0 && i5 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z4) {
                    int iMax = Math.max(i4, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z5 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z5) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z5) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z5 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i5, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z6 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z6) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z6) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z6 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i4, 0);
                    iMin = Math.min(selectionEnd + i5, editable.length());
                }
                androidx.emoji2.text.b0[] b0VarArr = (androidx.emoji2.text.b0[]) editable.getSpans(selectionStart, iMin, androidx.emoji2.text.b0.class);
                if (b0VarArr != null && b0VarArr.length > 0) {
                    for (androidx.emoji2.text.b0 b0Var : b0VarArr) {
                        int spanStart = editable.getSpanStart(b0Var);
                        int spanEnd = editable.getSpanEnd(b0Var);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // w1.k
    public boolean b() {
        return true;
    }

    @Override // androidx.lifecycle.s0
    public p0 c(Class cls) {
        return new g1.b();
    }

    @Override // r2.c0
    public y1 d(View view, y1 y1Var, r2.d0 d0Var) {
        d0Var.f3551d = y1Var.a() + d0Var.f3551d;
        boolean z4 = view.getLayoutDirection() == 1;
        int iB = y1Var.b();
        int iC = y1Var.c();
        int i4 = d0Var.f3548a + (z4 ? iC : iB);
        d0Var.f3548a = i4;
        int i5 = d0Var.f3550c;
        if (!z4) {
            iB = iC;
        }
        int i6 = i5 + iB;
        d0Var.f3550c = i6;
        view.setPaddingRelative(i4, d0Var.f3549b, i6, d0Var.f3551d);
        return y1Var;
    }

    @Override // w1.k
    public boolean e() {
        return true;
    }

    @Override // w1.k
    public boolean f() {
        return true;
    }

    @Override // w1.k
    public boolean g() {
        return true;
    }

    @Override // j.x
    public boolean h(j.m mVar) {
        return false;
    }

    @Override // w1.k
    public boolean i() {
        return true;
    }

    public float j(float f) {
        return 1.0f;
    }

    public Signature[] m(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // i1.d
    public void n() {
        switch (this.f) {
            case 13:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // i1.d
    public void p(int i4, Object obj) {
        String str;
        switch (this.f) {
            case 13:
                break;
            default:
                switch (i4) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case ConnectionResult.SERVICE_INVALID /* 9 */:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i4 == 6 || i4 == 7 || i4 == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    public boolean q(CharSequence charSequence) {
        return false;
    }

    public CharSequence t(Preference preference) {
        switch (this.f) {
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                if (TextUtils.isEmpty(null)) {
                    return editTextPreference.f.getString(R.string.not_set);
                }
                return null;
            default:
                ListPreference listPreference = (ListPreference) preference;
                if (TextUtils.isEmpty(null)) {
                    return listPreference.f.getString(R.string.not_set);
                }
                return null;
        }
    }

    private final void r() {
    }

    private final void s(int i4, Object obj) {
    }

    @Override // j.x
    public void a(j.m mVar, boolean z4) {
    }

    @Override // p0.v
    public void onScrollLimit(int i4, int i5, int i6, boolean z4) {
    }

    @Override // p0.v
    public void onScrollProgress(int i4, int i5, int i6, int i7) {
    }
}
