package m0;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.emoji2.text.p;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import u1.r1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements q3.a {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3063g;

    public /* synthetic */ h(int i4, Object obj) {
        this.f = i4;
        this.f3063g = obj;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00a0 A[SYNTHETIC] */
    @Override // q3.a
    public final Object a() {
        int iIntValue;
        int i4;
        int i5;
        int i6;
        int iDigit;
        int i7;
        int i8 = this.f;
        Integer numValueOf = null;
        Object obj = this.f3063g;
        switch (i8) {
            case 0:
                View viewInflate = View.inflate((MainActivity) ((p) obj).f568g, R.layout.splash_screen_view, null);
                viewInflate.getClass();
                return (ViewGroup) viewInflate;
            default:
                MainActivity mainActivity = ((r1) obj).f4075a;
                WeakHashMap weakHashMap = s1.b.f3670a;
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                if (currentWebViewPackage == null) {
                    try {
                        String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
                        currentWebViewPackage = str == null ? null : mainActivity.getPackageManager().getPackageInfo(str, 0);
                    } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                }
                String strSubstring = currentWebViewPackage != null ? currentWebViewPackage.versionName : null;
                if (strSubstring == null) {
                    iIntValue = 0;
                } else {
                    int iIndexOf = strSubstring.indexOf(46, 0);
                    if (iIndexOf != -1) {
                        strSubstring = strSubstring.substring(0, iIndexOf);
                    }
                    t2.i.b(10);
                    int length = strSubstring.length();
                    if (length != 0) {
                        char cCharAt = strSubstring.charAt(0);
                        int i9 = -2147483647;
                        if (cCharAt >= '0') {
                            i4 = 0;
                        } else if (length != 1) {
                            if (cCharAt == '+') {
                                i4 = 1;
                                i5 = 0;
                                i6 = 0;
                                int i10 = -59652323;
                                while (true) {
                                    if (i4 < length) {
                                        iDigit = Character.digit((int) strSubstring.charAt(i4), 10);
                                        if (iDigit >= 0 && ((i6 >= i10 || (i10 == -59652323 && i6 >= (i10 = i9 / 10))) && (i7 = i6 * 10) >= i9 + iDigit)) {
                                            i6 = i7 - iDigit;
                                            i4++;
                                        }
                                    } else if (i5 != 0) {
                                        numValueOf = Integer.valueOf(i6);
                                    } else {
                                        numValueOf = Integer.valueOf(-i6);
                                    }
                                }
                            } else if (cCharAt == '-') {
                                i9 = Integer.MIN_VALUE;
                                i4 = 1;
                            }
                        }
                        i5 = i4;
                        i6 = 0;
                        int i11 = -59652323;
                        while (true) {
                            if (i4 < length) {
                                iDigit = Character.digit((int) strSubstring.charAt(i4), 10);
                                if (iDigit >= 0) {
                                    i6 = i7 - iDigit;
                                    i4++;
                                }
                            } else if (i5 != 0) {
                                numValueOf = Integer.valueOf(i6);
                            } else {
                                numValueOf = Integer.valueOf(-i6);
                            }
                        }
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                }
                return Boolean.valueOf(iIntValue >= 139);
        }
    }
}
