package u1;

import android.R;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Display;
import android.view.KeyEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsetsController;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 implements p0.s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f3940a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f3941b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Field f3942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f3943d;

    public static File A(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i4 = 0; i4 < 100; i4++) {
            File file = new File(cacheDir, str + i4);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static n0.c B(k.y0 y0Var) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return new n0.c(c0.a.j(y0Var));
        }
        TextPaint textPaint = new TextPaint(y0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = y0Var.getBreakStrategy();
        int hyphenationFrequency = y0Var.getHyphenationFrequency();
        if (y0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i4 < 28 || (y0Var.getInputType() & 15) != 3) {
            boolean z4 = y0Var.getLayoutDirection() == 1;
            switch (y0Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z4) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(c0.a.a(DecimalFormatSymbols.getInstance(y0Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new n0.c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static int F(int i4) {
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 1;
        }
        if (i4 == 4) {
            return 2;
        }
        if (i4 == 8) {
            return 3;
        }
        if (i4 == 16) {
            return 4;
        }
        if (i4 == 32) {
            return 5;
        }
        if (i4 == 64) {
            return 6;
        }
        if (i4 == 128) {
            return 7;
        }
        if (i4 == 256) {
            return 8;
        }
        if (i4 == 512) {
            return 9;
        }
        androidx.fragment.app.q.q(androidx.fragment.app.u.k(i4, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static boolean H(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static float K(float f, float f4, float f5) {
        return (f5 * f4) + ((1.0f - f5) * f);
    }

    public static MappedByteBuffer L(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static void N(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static i3.g U(i3.g gVar, i3.g gVar2) {
        gVar2.getClass();
        return gVar2 == i3.h.f ? gVar : (i3.g) gVar2.g(gVar, new b4.q(4));
    }

    public static a1.b V(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j4;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i4 = byteBufferDuplicate.getShort() & 65535;
        if (i4 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                j4 = -1;
                break;
            }
            int i6 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i6) {
                break;
            }
            i5++;
        }
        if (j4 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j4 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j5 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i7 = 0; i7 < j5; i7++) {
                int i8 = byteBufferDuplicate.getInt();
                long j6 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i8 || 1701669481 == i8) {
                    byteBufferDuplicate.position((int) (j6 + j4));
                    a1.b bVar = new a1.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f10d = byteBufferDuplicate;
                    bVar.f7a = iPosition;
                    int i9 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f8b = i9;
                    bVar.f9c = ((ByteBuffer) bVar.f10d).getShort(i9);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static String W(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        byte[] bArr = new byte[(int) randomAccessFile.length()];
        randomAccessFile.readFully(bArr);
        randomAccessFile.close();
        return new String(bArr);
    }

    public static void b0(ViewGroup viewGroup, float f) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof a3.j) {
            ((a3.j) background).q(f);
        }
    }

    public static final void d(Resources.Theme theme, View view, TypedValue typedValue) {
        int i4 = (!theme.resolveAttribute(R.attr.windowLightStatusBar, typedValue, true) || typedValue.data == 0) ? 0 : 8;
        if (theme.resolveAttribute(R.attr.windowLightNavigationBar, typedValue, true) && typedValue.data != 0) {
            i4 |= 16;
        }
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        windowInsetsController.getClass();
        windowInsetsController.setSystemBarsAppearance(i4, 24);
    }

    public static void d0(TextView textView, int i4) {
        f(i4);
        if (Build.VERSION.SDK_INT >= 28) {
            c0.a.m(textView, i4);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), i4 + i5, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void e(String str, boolean z4) {
        if (z4) {
            return;
        }
        androidx.fragment.app.q.q(str);
    }

    public static void f(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void g0(TextView textView, int i4) {
        f(i4);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i5 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i4 > Math.abs(i5)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i4 - i5);
        }
    }

    public static int h(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, b0.f.a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static void h0(TextView textView, int i4) {
        f(i4);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i4 != fontMetricsInt) {
            textView.setLineSpacing(i4 - fontMetricsInt, 1.0f);
        }
    }

    public static float i(float f, float f4, float f5) {
        if (f < f4) {
            return f4;
        }
        return f > f5 ? f5 : f;
    }

    public static void i0(View view, a3.j jVar) {
        p2.a aVar = jVar.f88g.f71b;
        if (aVar == null || !aVar.f3356a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        a3.h hVar = jVar.f88g;
        if (hVar.f80l != elevation) {
            hVar.f80l = elevation;
            jVar.w();
        }
    }

    public static int j(int i4, int i5, int i6) {
        if (i4 < i5) {
            return i5;
        }
        return i4 > i6 ? i6 : i4;
    }

    public static void j0(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof a3.j) {
            i0(viewGroup, (a3.j) background);
        }
    }

    public static void l0(EditorInfo editorInfo, CharSequence charSequence, int i4, int i5) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i4);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i5);
    }

    public static int m(k1.u0 u0Var, androidx.emoji2.text.g gVar, View view, View view2, k1.l0 l0Var, boolean z4) {
        if (l0Var.v() == 0 || u0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return Math.abs(k1.l0.H(view) - k1.l0.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int n(k1.u0 u0Var, androidx.emoji2.text.g gVar, View view, View view2, k1.l0 l0Var, boolean z4, boolean z5) {
        if (l0Var.v() == 0 || u0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z5 ? Math.max(0, (u0Var.b() - Math.max(k1.l0.H(view), k1.l0.H(view2))) - 1) : Math.max(0, Math.min(k1.l0.H(view), k1.l0.H(view2)));
        if (z4) {
            return Math.round((iMax * (Math.abs(gVar.b(view2) - gVar.e(view)) / (Math.abs(k1.l0.H(view) - k1.l0.H(view2)) + 1))) + (gVar.k() - gVar.e(view)));
        }
        return iMax;
    }

    public static int o(k1.u0 u0Var, androidx.emoji2.text.g gVar, View view, View view2, k1.l0 l0Var, boolean z4) {
        if (l0Var.v() == 0 || u0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return u0Var.b();
        }
        return (int) (((gVar.b(view2) - gVar.e(view)) / (Math.abs(k1.l0.H(view) - k1.l0.H(view2)) + 1)) * u0Var.b());
    }

    public static float[] p(float[] fArr, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i4, length);
        float[] fArr2 = new float[i4];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static boolean q(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i4 = inputStream.read(bArr);
                        if (i4 != -1) {
                            fileOutputStream2.write(bArr, 0, i4);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e5) {
                    e = e5;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final void q0(Object obj) throws Throwable {
        if (obj instanceof g3.c) {
            throw ((g3.c) obj).f;
        }
    }

    public static e4.a r(int i4) {
        if (i4 != 0) {
            return i4 != 1 ? new a3.l() : new a3.e();
        }
        return new a3.l();
    }

    public static ActionMode.Callback r0(ActionMode.Callback callback) {
        return callback instanceof t0.f ? ((t0.f) callback).f3696a : callback;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7 A[SYNTHETIC] */
    public static f0.d[] s(String str) {
        int i4;
        String strTrim;
        float[] fArrP;
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (i7 < str.length()) {
            while (i7 < str.length()) {
                char cCharAt = str.charAt(i7);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i6, i7).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i5) != 'z' || strTrim.charAt(i5) == 'Z') {
                                fArrP = new float[i5];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i8 = i5;
                                    int i9 = 1;
                                    while (i9 < length) {
                                        int i10 = i5;
                                        int i11 = i10;
                                        int i12 = i11;
                                        int i13 = i12;
                                        for (int i14 = i9; i14 < strTrim.length(); i14++) {
                                            char cCharAt2 = strTrim.charAt(i14);
                                            if (cCharAt2 == ' ') {
                                                i10 = 0;
                                                i12 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i10 = 0;
                                                        i12 = 1;
                                                        break;
                                                    case '-':
                                                        if (i14 == i9 || i10 != 0) {
                                                            i10 = 0;
                                                        } else {
                                                            i10 = 0;
                                                            i12 = 1;
                                                            i13 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i11 == 0) {
                                                            i10 = 0;
                                                            i11 = 1;
                                                        } else {
                                                            i10 = 0;
                                                            i12 = 1;
                                                            i13 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i10 = 0;
                                                        break;
                                                }
                                            } else {
                                                i10 = 1;
                                            }
                                            if (i12 != 0) {
                                                if (i9 < i14) {
                                                    fArr[i8] = Float.parseFloat(strTrim.substring(i9, i14));
                                                    i8++;
                                                }
                                                if (i13 != 0) {
                                                    i9 = i14;
                                                } else {
                                                    i9 = i14 + 1;
                                                }
                                                i5 = 0;
                                            }
                                        }
                                        if (i9 < i14) {
                                            fArr[i8] = Float.parseFloat(strTrim.substring(i9, i14));
                                            i8++;
                                        }
                                        if (i13 != 0) {
                                            i9 = i14;
                                        } else {
                                            i9 = i14 + 1;
                                        }
                                        i5 = 0;
                                    }
                                    fArrP = p(fArr, i8);
                                    i5 = 0;
                                } catch (NumberFormatException e5) {
                                    throw new RuntimeException(androidx.fragment.app.u.m("error in parsing \"", strTrim, "\""), e5);
                                }
                            }
                            arrayList.add(new f0.d(strTrim.charAt(i5), fArrP));
                        }
                        i6 = i7;
                        i7++;
                        i5 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i7++;
            }
            strTrim = str.substring(i6, i7).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i5) != 'z') {
                    fArrP = new float[i5];
                } else {
                    fArrP = new float[i5];
                }
                arrayList.add(new f0.d(strTrim.charAt(i5), fArrP));
            }
            i6 = i7;
            i7++;
            i5 = 0;
        }
        if (i7 - i6 != 1 || i6 >= str.length()) {
            i4 = 0;
        } else {
            i4 = 0;
            arrayList.add(new f0.d(str.charAt(i6), new float[0]));
        }
        return (f0.d[]) arrayList.toArray(new f0.d[i4]);
    }

    public static ActionMode.Callback s0(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof t0.f) || callback == null) ? callback : new t0.f(callback, textView);
    }

    public static ColorStateList u(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !androidx.activity.x.w(drawable)) {
            return null;
        }
        return androidx.activity.x.e(drawable).getColorStateList();
    }

    public static Drawable w(Context context, int i4) {
        return k.h2.b().c(context, i4);
    }

    public static HashMap y(Context context) {
        String installerPackageName;
        String str;
        HashMap map = new HashMap();
        map.put("platform", "android");
        String str2 = x1.a.u(context).f4665h;
        if (str2 == null) {
            str2 = "";
        }
        map.put("publicKey", str2);
        String packageName = context.getPackageName();
        map.put("appId", packageName);
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            map.put("appVersion", packageInfo.versionName);
            map.put("appVersionCode", Integer.valueOf(packageInfo.versionCode));
        } catch (PackageManager.NameNotFoundException e5) {
            x1.f.a().d("u1.h0", e5.getMessage(), e5);
        }
        if ((context.getApplicationInfo().flags & 2) != 0) {
            installerPackageName = "debug";
        } else {
            installerPackageName = packageManager.getInstallerPackageName(packageName);
            if (installerPackageName == null) {
                installerPackageName = "adhoc";
            } else if (installerPackageName.equals("com.android.vending") || installerPackageName.equals("com.google.market")) {
                installerPackageName = "playstore";
            } else if (installerPackageName.equals("com.amazon.venezia")) {
                installerPackageName = "amazon";
            }
        }
        map.put("distribution", installerPackageName);
        map.put("language", Locale.getDefault().getLanguage());
        map.put("os", "Android");
        map.put("osVersion", Build.VERSION.RELEASE);
        StringBuilder sb = new StringBuilder();
        String str3 = Build.MANUFACTURER;
        sb.append(str3);
        sb.append(" ");
        String str4 = Build.MODEL;
        sb.append(str4);
        map.put("model", sb.toString());
        map.put("hardware", Build.FINGERPRINT);
        map.put("timeZone", TimeZone.getDefault().getID());
        if (!str4.startsWith(str3)) {
            str4 = str3 + " " + str4;
        }
        map.put("deviceName", str4);
        SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(context);
        if (c0.c.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<SubscriptionInfo> it = subscriptionManagerFrom.getActiveSubscriptionInfoList().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getCarrierName().toString());
            }
            map.put("carrierNames", arrayList);
            try {
                map.put("carrierName", arrayList.get(0));
            } catch (IndexOutOfBoundsException unused) {
                Log.w("u1.h0", "getInfo: No carriers registered with subscription manager");
            }
        } else {
            Log.w("u1.h0", "getInfo: Cannot get carrierNames, READ_PHONE_STATE not granted");
        }
        synchronized (h0.class) {
            if (f3940a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    if (!file.exists()) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        fileOutputStream.write(UUID.randomUUID().toString().getBytes());
                        fileOutputStream.close();
                    }
                    f3940a = W(file);
                } catch (Exception e6) {
                    throw new RuntimeException(e6);
                }
            }
            str = f3940a;
        }
        map.put("installationId", str);
        if (Build.VERSION.SDK_INT >= 28) {
            String string = "";
            try {
                PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728);
                if (packageInfo2.signingInfo != null) {
                    Signature[] apkContentsSigners = packageInfo2.signingInfo.getApkContentsSigners();
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(apkContentsSigners[0].toByteArray());
                    byte[] bArrDigest = messageDigest.digest();
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b5 : bArrDigest) {
                        sb2.append(String.format("%02X:", Byte.valueOf(b5)));
                    }
                    if (sb2.length() > 0) {
                        sb2.deleteCharAt(sb2.length() - 1);
                    }
                    string = sb2.toString();
                }
            } catch (Exception e7) {
                Log.e("u1.h0", "getSHA1: ", e7);
            }
            map.put("androidSha1", string);
        }
        return map;
    }

    public static p0.t z(Display display, int i4) {
        RoundedCorner roundedCorner;
        int i5;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i4)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i5 = 1;
            if (position != 1) {
                i5 = 2;
                if (position != 2) {
                    i5 = 3;
                    if (position != 3) {
                        androidx.fragment.app.q.q(androidx.fragment.app.u.k(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i5 = 0;
        }
        return new p0.t(i5, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public abstract Context C();

    public float D(View view) {
        if (f3941b) {
            try {
                return p1.d0.a(view);
            } catch (NoSuchMethodError unused) {
                f3941b = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void E();

    public boolean G() {
        return false;
    }

    public abstract boolean I();

    public abstract boolean J();

    public abstract void M();

    public abstract void P(Throwable th);

    public abstract boolean Q(int i4, KeyEvent keyEvent);

    public abstract void R(androidx.emoji2.text.x xVar);

    public boolean S(KeyEvent keyEvent) {
        return false;
    }

    public boolean T() {
        return false;
    }

    public abstract void X(boolean z4);

    public abstract void Y(boolean z4);

    public abstract void Z(boolean z4);

    public abstract void a0();

    public abstract void c0(boolean z4);

    public abstract void e0(int i4);

    public abstract void f0(Drawable drawable);

    public boolean k() {
        return false;
    }

    public abstract void k0(boolean z4);

    public abstract boolean l();

    public void m0(View view, float f) {
        if (f3941b) {
            try {
                p1.d0.b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                f3941b = false;
            }
        }
        view.setAlpha(f);
    }

    public abstract void n0(CharSequence charSequence);

    public abstract void o0();

    public i.a p0(androidx.emoji2.text.p pVar) {
        return null;
    }

    public abstract void t(boolean z4);

    public abstract TransformationMethod t0(TransformationMethod transformationMethod);

    public abstract int v();

    public abstract InputFilter[] x(InputFilter[] inputFilterArr);

    public void O() {
    }

    @Override // p0.s0
    public void b() {
    }

    @Override // p0.s0
    public void c() {
    }
}
