package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f2502l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f2503m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2504a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2505b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f2506c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f2507d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f2508e = -1.0f;
    public int[] f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2509g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f2510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f2511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f2512j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a1 f2513k;

    public d1(TextView textView) {
        this.f2511i = textView;
        this.f2512j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2513k = new b1();
        } else {
            this.f2513k = new a1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i4 : iArr) {
                if (i4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i4)) < 0) {
                    arrayList.add(Integer.valueOf(i4));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i5 = 0; i5 < size; i5++) {
                    iArr2[i5] = ((Integer) arrayList.get(i5)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f2503m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e5) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e5);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e5) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e5);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f2505b) {
                if (this.f2511i.getMeasuredHeight() <= 0 || this.f2511i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f2513k.b(this.f2511i) ? 1048576 : (this.f2511i.getMeasuredWidth() - this.f2511i.getTotalPaddingLeft()) - this.f2511i.getTotalPaddingRight();
                int height = (this.f2511i.getHeight() - this.f2511i.getCompoundPaddingBottom()) - this.f2511i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f2502l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f2511i.getTextSize()) {
                            g(0, fC);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f2505b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f.length;
        if (length == 0) {
            androidx.fragment.app.q.j("No available text sizes to choose from.");
            return 0;
        }
        int i4 = length - 1;
        int i5 = 0;
        int i6 = 1;
        while (true) {
            int[] iArr = this.f;
            if (i6 > i4) {
                return iArr[i5];
            }
            int i7 = (i6 + i4) / 2;
            int i8 = iArr[i7];
            TextView textView = this.f2511i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f2510h;
            if (textPaint == null) {
                this.f2510h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f2510h.set(textView.getPaint());
            this.f2510h.setTextSize(i8);
            StaticLayout staticLayoutA = z0.a(charSequence, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.f2511i, this.f2510h, this.f2513k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == charSequence.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i9 = i7 + 1;
                i5 = i6;
                i6 = i9;
            } else {
                i5 = i7 - 1;
                i4 = i5;
            }
        }
    }

    public final boolean f() {
        return j() && this.f2504a != 0;
    }

    public final void g(int i4, float f) {
        Context context = this.f2512j;
        float fApplyDimension = TypedValue.applyDimension(i4, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f2511i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f2505b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception e5) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e5);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f2504a == 1) {
            if (!this.f2509g || this.f.length == 0) {
                int iFloor = ((int) Math.floor((this.f2508e - this.f2507d) / this.f2506c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i4 = 0; i4 < iFloor; i4++) {
                    iArr[i4] = Math.round((i4 * this.f2506c) + this.f2507d);
                }
                this.f = b(iArr);
            }
            this.f2505b = true;
        } else {
            this.f2505b = false;
        }
        return this.f2505b;
    }

    public final boolean i() {
        int[] iArr = this.f;
        int length = iArr.length;
        boolean z4 = length > 0;
        this.f2509g = z4;
        if (z4) {
            this.f2504a = 1;
            this.f2507d = iArr[0];
            this.f2508e = iArr[length - 1];
            this.f2506c = -1.0f;
        }
        return z4;
    }

    public final boolean j() {
        return !(this.f2511i instanceof w);
    }

    public final void k(float f, float f4, float f5) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f4 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f4 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f5 + "px) is less or equal to (0px)");
        }
        this.f2504a = 1;
        this.f2507d = f;
        this.f2508e = f4;
        this.f2506c = f5;
        this.f2509g = false;
    }
}
