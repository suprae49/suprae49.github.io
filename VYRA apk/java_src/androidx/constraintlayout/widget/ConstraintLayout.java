package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.p;
import androidx.emoji2.text.t;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import u.a;
import u.d;
import u.e;
import u.j;
import v.i;
import v.k;
import v.m;
import x.c;
import x.f;
import x.g;
import x.h;
import x.o;
import x.r;
import x.s;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static s f451u;
    public final SparseArray f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f456k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f457l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f458m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o f459o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p f460p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f461q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public HashMap f462r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SparseArray f463s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f464t;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new SparseArray();
        this.f452g = new ArrayList(4);
        this.f453h = new e();
        this.f454i = 0;
        this.f455j = 0;
        this.f456k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f457l = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f458m = true;
        this.n = 257;
        this.f459o = null;
        this.f460p = null;
        this.f461q = -1;
        this.f462r = new HashMap();
        this.f463s = new SparseArray();
        this.f464t = new f(this, this);
        i(attributeSet, 0);
    }

    public static x.e g() {
        x.e eVar = new x.e(-2, -2);
        eVar.f4500a = -1;
        eVar.f4502b = -1;
        eVar.f4504c = -1.0f;
        eVar.f4506d = true;
        eVar.f4507e = -1;
        eVar.f = -1;
        eVar.f4510g = -1;
        eVar.f4511h = -1;
        eVar.f4513i = -1;
        eVar.f4515j = -1;
        eVar.f4516k = -1;
        eVar.f4518l = -1;
        eVar.f4520m = -1;
        eVar.n = -1;
        eVar.f4523o = -1;
        eVar.f4525p = -1;
        eVar.f4527q = 0;
        eVar.f4528r = 0.0f;
        eVar.f4529s = -1;
        eVar.f4530t = -1;
        eVar.f4531u = -1;
        eVar.f4532v = -1;
        eVar.f4533w = Integer.MIN_VALUE;
        eVar.f4534x = Integer.MIN_VALUE;
        eVar.f4535y = Integer.MIN_VALUE;
        eVar.f4536z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = Integer.MIN_VALUE;
        eVar.D = 0;
        eVar.E = 0.5f;
        eVar.F = 0.5f;
        eVar.G = null;
        eVar.H = -1.0f;
        eVar.I = -1.0f;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 0;
        eVar.R = 1.0f;
        eVar.S = 1.0f;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = -1;
        eVar.W = false;
        eVar.X = false;
        eVar.Y = null;
        eVar.Z = 0;
        eVar.f4501a0 = true;
        eVar.f4503b0 = true;
        eVar.f4505c0 = false;
        eVar.d0 = false;
        eVar.f4508e0 = false;
        eVar.f4509f0 = -1;
        eVar.g0 = -1;
        eVar.f4512h0 = -1;
        eVar.f4514i0 = -1;
        eVar.j0 = Integer.MIN_VALUE;
        eVar.f4517k0 = Integer.MIN_VALUE;
        eVar.f4519l0 = 0.5f;
        eVar.f4526p0 = new d();
        return eVar;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static s getSharedValues() {
        if (f451u == null) {
            s sVar = new s();
            new SparseIntArray();
            new HashMap();
            f451u = sVar;
        }
        return f451u;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof x.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f452g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((c) arrayList.get(i4)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i6 = Integer.parseInt(strArrSplit[0]);
                        int i7 = Integer.parseInt(strArrSplit[1]);
                        int i8 = Integer.parseInt(strArrSplit[2]);
                        int i9 = (int) ((i6 / 1080.0f) * width);
                        int i10 = (int) ((i7 / 1920.0f) * height);
                        int i11 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i9;
                        float f4 = i10;
                        float f5 = i9 + ((int) ((i8 / 1080.0f) * width));
                        canvas.drawLine(f, f4, f5, f4, paint);
                        float f6 = i10 + i11;
                        canvas.drawLine(f5, f4, f5, f6, paint);
                        canvas.drawLine(f5, f6, f, f6, paint);
                        canvas.drawLine(f, f6, f, f4, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f4, f5, f6, paint);
                        canvas.drawLine(f, f6, f5, f4, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f458m = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        x.e eVar = new x.e(context, attributeSet);
        eVar.f4500a = -1;
        eVar.f4502b = -1;
        eVar.f4504c = -1.0f;
        eVar.f4506d = true;
        eVar.f4507e = -1;
        eVar.f = -1;
        eVar.f4510g = -1;
        eVar.f4511h = -1;
        eVar.f4513i = -1;
        eVar.f4515j = -1;
        eVar.f4516k = -1;
        eVar.f4518l = -1;
        eVar.f4520m = -1;
        eVar.n = -1;
        eVar.f4523o = -1;
        eVar.f4525p = -1;
        eVar.f4527q = 0;
        eVar.f4528r = 0.0f;
        eVar.f4529s = -1;
        eVar.f4530t = -1;
        eVar.f4531u = -1;
        eVar.f4532v = -1;
        eVar.f4533w = Integer.MIN_VALUE;
        eVar.f4534x = Integer.MIN_VALUE;
        eVar.f4535y = Integer.MIN_VALUE;
        eVar.f4536z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = Integer.MIN_VALUE;
        eVar.D = 0;
        eVar.E = 0.5f;
        eVar.F = 0.5f;
        eVar.G = null;
        eVar.H = -1.0f;
        eVar.I = -1.0f;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 0;
        eVar.R = 1.0f;
        eVar.S = 1.0f;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = -1;
        eVar.W = false;
        eVar.X = false;
        eVar.Y = null;
        eVar.Z = 0;
        eVar.f4501a0 = true;
        eVar.f4503b0 = true;
        eVar.f4505c0 = false;
        eVar.d0 = false;
        eVar.f4508e0 = false;
        eVar.f4509f0 = -1;
        eVar.g0 = -1;
        eVar.f4512h0 = -1;
        eVar.f4514i0 = -1;
        eVar.j0 = Integer.MIN_VALUE;
        eVar.f4517k0 = Integer.MIN_VALUE;
        eVar.f4519l0 = 0.5f;
        eVar.f4526p0 = new d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f4636b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            int i5 = x.d.f4499a.get(index);
            switch (i5) {
                case 1:
                    eVar.V = typedArrayObtainStyledAttributes.getInt(index, eVar.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4525p);
                    eVar.f4525p = resourceId;
                    if (resourceId == -1) {
                        eVar.f4525p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    eVar.f4527q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f4527q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, eVar.f4528r) % 360.0f;
                    eVar.f4528r = f;
                    if (f < 0.0f) {
                        eVar.f4528r = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    eVar.f4500a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f4500a);
                    break;
                case 6:
                    eVar.f4502b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.f4502b);
                    break;
                case 7:
                    eVar.f4504c = typedArrayObtainStyledAttributes.getFloat(index, eVar.f4504c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4507e);
                    eVar.f4507e = resourceId2;
                    if (resourceId2 == -1) {
                        eVar.f4507e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f);
                    eVar.f = resourceId3;
                    if (resourceId3 == -1) {
                        eVar.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4510g);
                    eVar.f4510g = resourceId4;
                    if (resourceId4 == -1) {
                        eVar.f4510g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4511h);
                    eVar.f4511h = resourceId5;
                    if (resourceId5 == -1) {
                        eVar.f4511h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4513i);
                    eVar.f4513i = resourceId6;
                    if (resourceId6 == -1) {
                        eVar.f4513i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4515j);
                    eVar.f4515j = resourceId7;
                    if (resourceId7 == -1) {
                        eVar.f4515j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4516k);
                    eVar.f4516k = resourceId8;
                    if (resourceId8 == -1) {
                        eVar.f4516k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4518l);
                    eVar.f4518l = resourceId9;
                    if (resourceId9 == -1) {
                        eVar.f4518l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4520m);
                    eVar.f4520m = resourceId10;
                    if (resourceId10 == -1) {
                        eVar.f4520m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4529s);
                    eVar.f4529s = resourceId11;
                    if (resourceId11 == -1) {
                        eVar.f4529s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4530t);
                    eVar.f4530t = resourceId12;
                    if (resourceId12 == -1) {
                        eVar.f4530t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4531u);
                    eVar.f4531u = resourceId13;
                    if (resourceId13 == -1) {
                        eVar.f4531u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4532v);
                    eVar.f4532v = resourceId14;
                    if (resourceId14 == -1) {
                        eVar.f4532v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    eVar.f4533w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f4533w);
                    break;
                case 22:
                    eVar.f4534x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f4534x);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    eVar.f4535y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f4535y);
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    eVar.f4536z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.f4536z);
                    break;
                case 25:
                    eVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.A);
                    break;
                case 26:
                    eVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.B);
                    break;
                case 27:
                    eVar.W = typedArrayObtainStyledAttributes.getBoolean(index, eVar.W);
                    break;
                case 28:
                    eVar.X = typedArrayObtainStyledAttributes.getBoolean(index, eVar.X);
                    break;
                case 29:
                    eVar.E = typedArrayObtainStyledAttributes.getFloat(index, eVar.E);
                    break;
                case 30:
                    eVar.F = typedArrayObtainStyledAttributes.getFloat(index, eVar.F);
                    break;
                case 31:
                    int i6 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.L = i6;
                    if (i6 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i7 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    eVar.M = i7;
                    if (i7 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        eVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.N) == -2) {
                            eVar.N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        eVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.P) == -2) {
                            eVar.P = -2;
                        }
                    }
                    break;
                case 35:
                    eVar.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.R));
                    eVar.L = 2;
                    break;
                case 36:
                    try {
                        eVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.O) == -2) {
                            eVar.O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        eVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, eVar.Q) == -2) {
                            eVar.Q = -2;
                        }
                    }
                    break;
                case 38:
                    eVar.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, eVar.S));
                    eVar.M = 2;
                    break;
                default:
                    switch (i5) {
                        case 44:
                            o.h(eVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            eVar.H = typedArrayObtainStyledAttributes.getFloat(index, eVar.H);
                            break;
                        case 46:
                            eVar.I = typedArrayObtainStyledAttributes.getFloat(index, eVar.I);
                            break;
                        case 47:
                            eVar.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            eVar.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            eVar.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.T);
                            break;
                        case 50:
                            eVar.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, eVar.U);
                            break;
                        case 51:
                            eVar.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.n);
                            eVar.n = resourceId15;
                            if (resourceId15 == -1) {
                                eVar.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, eVar.f4523o);
                            eVar.f4523o = resourceId16;
                            if (resourceId16 == -1) {
                                eVar.f4523o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            eVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.D);
                            break;
                        case 55:
                            eVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, eVar.C);
                            break;
                        default:
                            switch (i5) {
                                case 64:
                                    o.g(eVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    o.g(eVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    eVar.Z = typedArrayObtainStyledAttributes.getInt(index, eVar.Z);
                                    break;
                                case 67:
                                    eVar.f4506d = typedArrayObtainStyledAttributes.getBoolean(index, eVar.f4506d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        eVar.a();
        return eVar;
    }

    public int getMaxHeight() {
        return this.f457l;
    }

    public int getMaxWidth() {
        return this.f456k;
    }

    public int getMinHeight() {
        return this.f455j;
    }

    public int getMinWidth() {
        return this.f454i;
    }

    public int getOptimizationLevel() {
        return this.f453h.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        e eVar = this.f453h;
        if (eVar.f3780j == null) {
            int id2 = getId();
            if (id2 != -1) {
                eVar.f3780j = getContext().getResources().getResourceEntryName(id2);
            } else {
                eVar.f3780j = "parent";
            }
        }
        if (eVar.f3777h0 == null) {
            eVar.f3777h0 = eVar.f3780j;
            Log.v("ConstraintLayout", " setDebugName " + eVar.f3777h0);
        }
        ArrayList arrayList = eVar.f3802q0;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            d dVar = (d) obj;
            View view = dVar.f3774f0;
            if (view != null) {
                if (dVar.f3780j == null && (id = view.getId()) != -1) {
                    dVar.f3780j = getContext().getResources().getResourceEntryName(id);
                }
                if (dVar.f3777h0 == null) {
                    dVar.f3777h0 = dVar.f3780j;
                    Log.v("ConstraintLayout", " setDebugName " + dVar.f3777h0);
                }
            }
        }
        eVar.n(sb);
        return sb.toString();
    }

    public final d h(View view) {
        if (view == this) {
            return this.f453h;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof x.e) {
            return ((x.e) view.getLayoutParams()).f4526p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof x.e) {
            return ((x.e) view.getLayoutParams()).f4526p0;
        }
        return null;
    }

    public final void i(AttributeSet attributeSet, int i4) {
        e eVar = this.f453h;
        eVar.f3774f0 = this;
        f fVar = this.f464t;
        eVar.f3806u0 = fVar;
        eVar.f3804s0.f = fVar;
        this.f.put(getId(), this);
        this.f459o = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4636b, i4, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index == 16) {
                    this.f454i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f454i);
                } else if (index == 17) {
                    this.f455j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f455j);
                } else if (index == 14) {
                    this.f456k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f456k);
                } else if (index == 15) {
                    this.f457l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f457l);
                } else if (index == 113) {
                    this.n = typedArrayObtainStyledAttributes.getInt(index, this.n);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f460p = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        o oVar = new o();
                        this.f459o = oVar;
                        oVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f459o = null;
                    }
                    this.f461q = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        eVar.D0 = this.n;
        s.c.f3629q = eVar.W(512);
    }

    public final void j(int i4) {
        String str;
        Context context = getContext();
        p pVar = new p(18, false);
        pVar.f568g = new SparseArray();
        pVar.f569h = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i4);
        try {
            g gVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                pVar.u(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                g gVar2 = new g(context, xml);
                                ((SparseArray) pVar.f568g).put(gVar2.f4544a, gVar2);
                                gVar = gVar2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                h hVar = new h(context, xml);
                                if (gVar != null) {
                                    gVar.f4545b.add(hVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e5) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i4, e5);
        } catch (XmlPullParserException e6) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i4, e6);
        }
        this.f460p = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:160:0x030c  */
    /* JADX WARN: Code duplicated, block: B:162:0x032a  */
    /* JADX WARN: Code duplicated, block: B:164:0x032d  */
    /* JADX WARN: Code duplicated, block: B:168:0x034c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0368  */
    /* JADX WARN: Code duplicated, block: B:403:0x0399 A[SYNTHETIC] */
    public final void k(e eVar, int i4, int i5, int i6) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i7;
        char c4;
        boolean z4;
        int i8;
        int i9;
        ArrayList arrayList;
        f fVar;
        int i10;
        boolean zT;
        int i11;
        int i12;
        f fVar2;
        int i13;
        boolean z5;
        f fVar3;
        k kVar;
        m mVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z6;
        int size;
        int i21;
        int size2;
        int i22;
        v.o oVar;
        v.o oVar2;
        int mode = View.MeasureSpec.getMode(i5);
        int size3 = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size4 = View.MeasureSpec.getSize(i6);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i23 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        f fVar4 = this.f464t;
        fVar4.f4538b = iMax3;
        fVar4.f4539c = iMax4;
        fVar4.f4540d = paddingWidth;
        fVar4.f4541e = i23;
        fVar4.f = i5;
        fVar4.f4542g = i6;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i24 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i25 = size3 - paddingWidth;
        int i26 = size4 - i23;
        int i27 = fVar4.f4541e;
        int i28 = fVar4.f4540d;
        int childCount = getChildCount();
        if (mode == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax = Math.max(0, this.f454i);
                iMin = iMax;
            } else {
                iMin = i25;
            }
            i24 = 2;
        } else if (mode == 0) {
            if (childCount == 0) {
                iMax = Math.max(0, this.f454i);
                iMin = iMax;
            } else {
                iMin = 0;
            }
            i24 = 2;
        } else if (mode != 1073741824) {
            iMin = 0;
        } else {
            iMin = Math.min(this.f456k - i28, i25);
            i24 = 1;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f455j);
                iMin2 = iMax2;
            } else {
                iMin2 = i26;
            }
            i7 = 2;
        } else if (mode2 != 0) {
            iMin2 = mode2 != 1073741824 ? 0 : Math.min(this.f457l - i27, i26);
            i7 = 1;
        } else {
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f455j);
                iMin2 = iMax2;
            } else {
                iMin2 = 0;
            }
            i7 = 2;
        }
        int iQ = eVar.q();
        v.e eVar2 = eVar.f3804s0;
        int[] iArr = eVar.C;
        int i29 = iMin;
        if (i29 == iQ && iMin2 == eVar.k()) {
            c4 = 1;
        } else {
            eVar2.f4241c = true;
            c4 = 1;
        }
        eVar.Y = 0;
        eVar.Z = 0;
        iArr[0] = this.f456k - i28;
        iArr[c4] = this.f457l - i27;
        eVar.f3768b0 = 0;
        eVar.f3770c0 = 0;
        eVar.M(i24);
        eVar.O(i29);
        eVar.N(i7);
        eVar.L(iMin2);
        int i30 = this.f454i - i28;
        if (i30 < 0) {
            eVar.f3768b0 = 0;
        } else {
            eVar.f3768b0 = i30;
        }
        int i31 = this.f455j - i27;
        if (i31 < 0) {
            eVar.f3770c0 = 0;
        } else {
            eVar.f3770c0 = i31;
        }
        eVar.f3808x0 = iMax5;
        eVar.f3809y0 = iMax3;
        t tVar = eVar.f3803r0;
        e eVar3 = (e) tVar.f580d;
        ArrayList arrayList2 = (ArrayList) tVar.f578b;
        f fVar5 = eVar.f3806u0;
        int size5 = eVar.f3802q0.size();
        int iQ2 = eVar.q();
        int iK = eVar.k();
        boolean zC = j.c(i4, 128);
        boolean z7 = zC || j.c(i4, 64);
        if (z7) {
            int i32 = 0;
            while (true) {
                if (i32 < size5) {
                    boolean z8 = z7;
                    d dVar = (d) eVar.f3802q0.get(i32);
                    int i33 = i32;
                    int[] iArr2 = dVar.f3791p0;
                    i8 = size5;
                    boolean z9 = (iArr2[0] == 3) && (iArr2[1] == 3) && dVar.W > 0.0f;
                    if ((dVar.x() && z9) || ((dVar.y() && z9) || (dVar instanceof u.g) || dVar.x() || dVar.y())) {
                        i9 = 1073741824;
                        z4 = false;
                    } else {
                        i32 = i33 + 1;
                        z7 = z8;
                        size5 = i8;
                    }
                } else {
                    z4 = z7;
                    i8 = size5;
                    i9 = 1073741824;
                }
            }
        } else {
            z4 = z7;
            i8 = size5;
            i9 = 1073741824;
        }
        boolean z10 = z4 & ((mode == i9 && mode2 == i9) || zC);
        if (z10) {
            int iMin3 = Math.min(iArr[0], i25);
            int iMin4 = Math.min(iArr[1], i26);
            int i34 = 1073741824;
            if (mode == 1073741824) {
                if (eVar.q() != iMin3) {
                    eVar.O(iMin3);
                    eVar2.f4240b = true;
                }
                i34 = 1073741824;
            }
            if (mode2 == i34 && eVar.k() != iMin4) {
                eVar.L(iMin4);
                eVar2.f4240b = true;
            }
            if (mode == i34 && mode2 == i34) {
                ArrayList arrayList3 = eVar2.f4243e;
                e eVar4 = eVar2.f4239a;
                if (eVar2.f4240b || eVar2.f4241c) {
                    ArrayList arrayList4 = eVar4.f3802q0;
                    int size6 = arrayList4.size();
                    int i35 = 0;
                    while (i35 < size6) {
                        Object obj = arrayList4.get(i35);
                        int i36 = i35 + 1;
                        d dVar2 = (d) obj;
                        dVar2.h();
                        dVar2.f3765a = false;
                        dVar2.f3771d.n();
                        dVar2.f3772e.m();
                        arrayList4 = arrayList4;
                        i35 = i36;
                    }
                    eVar4.h();
                    i16 = 0;
                    eVar4.f3765a = false;
                    eVar4.f3771d.n();
                    eVar4.f3772e.m();
                    eVar2.f4241c = false;
                } else {
                    i16 = 0;
                }
                eVar2.b(eVar2.f4242d);
                eVar4.Y = i16;
                int[] iArr3 = eVar4.f3791p0;
                eVar4.Z = i16;
                int iJ = eVar4.j(i16);
                int iJ2 = eVar4.j(1);
                if (eVar2.f4240b) {
                    eVar2.c();
                }
                int iR = eVar4.r();
                fVar = fVar5;
                int iS = eVar4.s();
                arrayList = arrayList2;
                eVar4.f3771d.f4275h.d(iR);
                eVar4.f3772e.f4275h.d(iS);
                eVar2.g();
                if (iJ == 2 || iJ2 == 2) {
                    if (zC) {
                        int size7 = arrayList3.size();
                        i17 = iR;
                        int i37 = 0;
                        while (i37 < size7) {
                            Object obj2 = arrayList3.get(i37);
                            i37++;
                            if (!((v.o) obj2).k()) {
                                zC = false;
                                break;
                            }
                        }
                    } else {
                        i17 = iR;
                    }
                    if (zC && iJ == 2) {
                        eVar4.M(1);
                        eVar4.O(eVar2.d(eVar4, 0));
                        eVar4.f3771d.f4273e.d(eVar4.q());
                    }
                    if (zC && iJ2 == 2) {
                        i18 = 1;
                        eVar4.N(1);
                        eVar4.L(eVar2.d(eVar4, 1));
                        eVar4.f3772e.f4273e.d(eVar4.k());
                    }
                    i19 = iArr3[0];
                    if (i19 != i18 || i19 == 4) {
                        int iQ3 = eVar4.q() + i17;
                        eVar4.f3771d.f4276i.d(iQ3);
                        eVar4.f3771d.f4273e.d(iQ3 - i17);
                        eVar2.g();
                        i20 = iArr3[1];
                        if (i20 != 1 || i20 == 4) {
                            int iK2 = eVar4.k() + iS;
                            eVar4.f3772e.f4276i.d(iK2);
                            eVar4.f3772e.f4273e.d(iK2 - iS);
                        }
                        eVar2.g();
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    size = arrayList3.size();
                    i21 = 0;
                    while (i21 < size) {
                        Object obj3 = arrayList3.get(i21);
                        i21++;
                        oVar2 = (v.o) obj3;
                        if (oVar2.f4270b == eVar4 || oVar2.f4274g) {
                            oVar2.e();
                        }
                    }
                    size2 = arrayList3.size();
                    i22 = 0;
                    while (true) {
                        if (i22 < size2) {
                            zT = true;
                            break;
                        }
                        Object obj4 = arrayList3.get(i22);
                        i22++;
                        oVar = (v.o) obj4;
                        if (!z6 || oVar.f4270b != eVar4) {
                            if (oVar.f4275h.f4254j || ((!oVar.f4276i.f4254j && !(oVar instanceof i)) || (!oVar.f4273e.f4254j && !(oVar instanceof v.c) && !(oVar instanceof i)))) {
                                zT = false;
                                break;
                            }
                        }
                    }
                    eVar4.M(iJ);
                    eVar4.N(iJ2);
                    i10 = 2;
                    i15 = 1073741824;
                } else {
                    i17 = iR;
                }
                i18 = 1;
                i19 = iArr3[0];
                if (i19 != i18) {
                    int iQ4 = eVar4.q() + i17;
                    eVar4.f3771d.f4276i.d(iQ4);
                    eVar4.f3771d.f4273e.d(iQ4 - i17);
                    eVar2.g();
                    i20 = iArr3[1];
                    if (i20 != 1) {
                        int iK3 = eVar4.k() + iS;
                        eVar4.f3772e.f4276i.d(iK3);
                        eVar4.f3772e.f4273e.d(iK3 - iS);
                    } else {
                        int iK4 = eVar4.k() + iS;
                        eVar4.f3772e.f4276i.d(iK4);
                        eVar4.f3772e.f4273e.d(iK4 - iS);
                    }
                    eVar2.g();
                    z6 = true;
                } else {
                    int iQ5 = eVar4.q() + i17;
                    eVar4.f3771d.f4276i.d(iQ5);
                    eVar4.f3771d.f4273e.d(iQ5 - i17);
                    eVar2.g();
                    i20 = iArr3[1];
                    if (i20 != 1) {
                        int iK5 = eVar4.k() + iS;
                        eVar4.f3772e.f4276i.d(iK5);
                        eVar4.f3772e.f4273e.d(iK5 - iS);
                    } else {
                        int iK6 = eVar4.k() + iS;
                        eVar4.f3772e.f4276i.d(iK6);
                        eVar4.f3772e.f4273e.d(iK6 - iS);
                    }
                    eVar2.g();
                    z6 = true;
                }
                size = arrayList3.size();
                i21 = 0;
                while (i21 < size) {
                    Object obj5 = arrayList3.get(i21);
                    i21++;
                    oVar2 = (v.o) obj5;
                    if (oVar2.f4270b == eVar4) {
                    }
                    oVar2.e();
                }
                size2 = arrayList3.size();
                i22 = 0;
                while (true) {
                    if (i22 < size2) {
                        zT = true;
                        break;
                    }
                    Object obj6 = arrayList3.get(i22);
                    i22++;
                    oVar = (v.o) obj6;
                    if (!z6) {
                    }
                    if (oVar.f4275h.f4254j) {
                    }
                    zT = false;
                    break;
                }
                eVar4.M(iJ);
                eVar4.N(iJ2);
                i10 = 2;
                i15 = 1073741824;
            } else {
                z10 = z10;
                arrayList = arrayList2;
                fVar = fVar5;
                e eVar5 = eVar2.f4239a;
                if (eVar2.f4240b) {
                    ArrayList arrayList5 = eVar5.f3802q0;
                    int size8 = arrayList5.size();
                    int i38 = 0;
                    while (i38 < size8) {
                        Object obj7 = arrayList5.get(i38);
                        i38++;
                        d dVar3 = (d) obj7;
                        dVar3.h();
                        dVar3.f3765a = false;
                        k kVar2 = dVar3.f3771d;
                        ArrayList arrayList6 = arrayList5;
                        kVar2.f4273e.f4254j = false;
                        kVar2.f4274g = false;
                        kVar2.n();
                        m mVar2 = dVar3.f3772e;
                        mVar2.f4273e.f4254j = false;
                        mVar2.f4274g = false;
                        mVar2.m();
                        arrayList5 = arrayList6;
                    }
                    i14 = 0;
                    eVar5.h();
                    eVar5.f3765a = false;
                    k kVar3 = eVar5.f3771d;
                    kVar3.f4273e.f4254j = false;
                    kVar3.f4274g = false;
                    kVar3.n();
                    m mVar3 = eVar5.f3772e;
                    mVar3.f4273e.f4254j = false;
                    mVar3.f4274g = false;
                    mVar3.m();
                    eVar2.c();
                } else {
                    i14 = 0;
                }
                eVar2.b(eVar2.f4242d);
                eVar5.Y = i14;
                eVar5.Z = i14;
                eVar5.f3771d.f4275h.d(i14);
                eVar5.f3772e.f4275h.d(i14);
                i15 = 1073741824;
                if (mode == 1073741824) {
                    zT = eVar.T(i14, zC);
                    i10 = 1;
                } else {
                    i10 = 0;
                    zT = true;
                }
                if (mode2 == 1073741824) {
                    zT &= eVar.T(1, zC);
                    i10++;
                }
            }
            if (zT) {
                eVar.P(mode == i15, mode2 == i15);
            }
        } else {
            z10 = z10;
            arrayList = arrayList2;
            fVar = fVar5;
            i10 = 0;
            zT = false;
        }
        if (zT && i10 == 2) {
            return;
        }
        int i39 = eVar.D0;
        if (i8 > 0) {
            int size9 = eVar.f3802q0.size();
            boolean zW = eVar.W(64);
            f fVar6 = eVar.f3806u0;
            for (int i40 = 0; i40 < size9; i40++) {
                d dVar4 = (d) eVar.f3802q0.get(i40);
                if (!(dVar4 instanceof u.h) && !(dVar4 instanceof a) && !dVar4.F && (!zW || (kVar = dVar4.f3771d) == null || (mVar = dVar4.f3772e) == null || !kVar.f4273e.f4254j || !mVar.f4273e.f4254j)) {
                    int iJ3 = dVar4.j(0);
                    int iJ4 = dVar4.j(1);
                    boolean z11 = iJ3 == 3 && dVar4.f3793r != 1 && iJ4 == 3 && dVar4.f3794s != 1;
                    if (!z11 && eVar.W(1) && !(dVar4 instanceof u.g)) {
                        if (iJ3 == 3 && dVar4.f3793r == 0 && iJ4 != 3 && !dVar4.x()) {
                            z11 = true;
                        }
                        if (iJ4 == 3 && dVar4.f3794s == 0 && iJ3 != 3 && !dVar4.x()) {
                            z11 = true;
                        }
                        if ((iJ3 == 3 || iJ4 == 3) && dVar4.W > 0.0f) {
                            z11 = true;
                        }
                    }
                    if (!z11) {
                        tVar.r(0, dVar4, fVar6);
                    }
                }
            }
            ConstraintLayout constraintLayout = fVar6.f4537a;
            int childCount2 = constraintLayout.getChildCount();
            ArrayList arrayList7 = constraintLayout.f452g;
            for (int i41 = 0; i41 < childCount2; i41++) {
                constraintLayout.getChildAt(i41);
            }
            int size10 = arrayList7.size();
            if (size10 > 0) {
                for (int i42 = 0; i42 < size10; i42++) {
                    ((c) arrayList7.get(i42)).getClass();
                }
            }
        }
        tVar.y(eVar);
        int size11 = arrayList.size();
        if (i8 > 0) {
            tVar.w(eVar, 0, iQ2, iK);
        }
        if (size11 > 0) {
            int[] iArr4 = eVar.f3791p0;
            boolean z12 = iArr4[0] == 2;
            boolean z13 = iArr4[1] == 2;
            int iMax7 = Math.max(eVar.q(), eVar3.f3768b0);
            int iMax8 = Math.max(eVar.k(), eVar3.f3770c0);
            int i43 = 0;
            boolean zR = false;
            while (i43 < size11) {
                ArrayList arrayList8 = arrayList;
                d dVar5 = (d) arrayList8.get(i43);
                if (dVar5 instanceof u.g) {
                    int iQ6 = dVar5.q();
                    int iK7 = dVar5.k();
                    z5 = z13;
                    fVar3 = fVar;
                    boolean zR2 = zR | tVar.r(1, dVar5, fVar3);
                    int iQ7 = dVar5.q();
                    boolean z14 = zR2;
                    int iK8 = dVar5.k();
                    if (iQ7 != iQ6) {
                        dVar5.O(iQ7);
                        if (z12 && dVar5.r() + dVar5.U > iMax7) {
                            iMax7 = Math.max(iMax7, dVar5.i(4).e() + dVar5.r() + dVar5.U);
                        }
                        z14 = true;
                    }
                    if (iK8 != iK7) {
                        dVar5.L(iK8);
                        if (z5 && dVar5.s() + dVar5.V > iMax8) {
                            iMax8 = Math.max(iMax8, dVar5.i(5).e() + dVar5.s() + dVar5.V);
                        }
                        z14 = true;
                    }
                    zR = z14 | ((u.g) dVar5).f3834y0;
                } else {
                    z5 = z13;
                    fVar3 = fVar;
                }
                i43++;
                fVar = fVar3;
                arrayList = arrayList8;
                z13 = z5;
            }
            boolean z15 = z13;
            ArrayList arrayList9 = arrayList;
            int i44 = 0;
            while (true) {
                f fVar7 = fVar;
                if (i44 >= 2) {
                    break;
                }
                int i45 = 0;
                while (i45 < size11) {
                    d dVar6 = (d) arrayList9.get(i45);
                    if ((!(dVar6 instanceof u.i) || (dVar6 instanceof u.g)) && !(dVar6 instanceof u.h)) {
                        i11 = size11;
                        if (dVar6.g0 != 8 && ((!z10 || !dVar6.f3771d.f4273e.f4254j || !dVar6.f3772e.f4273e.f4254j) && !(dVar6 instanceof u.g))) {
                            int iQ8 = dVar6.q();
                            int iK9 = dVar6.k();
                            i12 = i45;
                            int i46 = dVar6.f3766a0;
                            zR |= tVar.r(i44 == 1 ? 2 : 1, dVar6, fVar7);
                            fVar2 = fVar7;
                            int iQ9 = dVar6.q();
                            i13 = i44;
                            int iK10 = dVar6.k();
                            if (iQ9 != iQ8) {
                                dVar6.O(iQ9);
                                if (z12 && dVar6.r() + dVar6.U > iMax7) {
                                    iMax7 = Math.max(iMax7, dVar6.i(4).e() + dVar6.r() + dVar6.U);
                                }
                                zR = true;
                            }
                            if (iK10 != iK9) {
                                dVar6.L(iK10);
                                if (z15 && dVar6.s() + dVar6.V > iMax8) {
                                    iMax8 = Math.max(iMax8, dVar6.i(5).e() + dVar6.s() + dVar6.V);
                                }
                                zR = true;
                            }
                            if (dVar6.E && i46 != dVar6.f3766a0) {
                                zR = true;
                            }
                        }
                        i45 = i12 + 1;
                        size11 = i11;
                        fVar7 = fVar2;
                        i44 = i13;
                    } else {
                        i11 = size11;
                    }
                    fVar2 = fVar7;
                    i13 = i44;
                    i12 = i45;
                    i45 = i12 + 1;
                    size11 = i11;
                    fVar7 = fVar2;
                    i44 = i13;
                }
                int i47 = size11;
                fVar = fVar7;
                int i48 = i44;
                if (!zR) {
                    break;
                }
                int i49 = i48 + 1;
                tVar.w(eVar, i49, iQ2, iK);
                i44 = i49;
                size11 = i47;
                zR = false;
            }
        }
        eVar.D0 = i39;
        s.c.f3629q = eVar.W(512);
    }

    public final void l(d dVar, x.e eVar, SparseArray sparseArray, int i4, int i5) {
        View view = (View) this.f.get(i4);
        d dVar2 = (d) sparseArray.get(i4);
        if (dVar2 == null || view == null || !(view.getLayoutParams() instanceof x.e)) {
            return;
        }
        eVar.f4505c0 = true;
        if (i5 == 6) {
            x.e eVar2 = (x.e) view.getLayoutParams();
            eVar2.f4505c0 = true;
            eVar2.f4526p0.E = true;
        }
        dVar.i(6).b(dVar2.i(i5), eVar.D, eVar.C, true);
        dVar.E = true;
        dVar.i(3).j();
        dVar.i(5).j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            x.e eVar = (x.e) childAt.getLayoutParams();
            d dVar = eVar.f4526p0;
            if (childAt.getVisibility() != 8 || eVar.d0 || eVar.f4508e0 || zIsInEditMode) {
                int iR = dVar.r();
                int iS = dVar.s();
                childAt.layout(iR, iS, dVar.q() + iR, dVar.k() + iS);
            }
        }
        ArrayList arrayList = this.f452g;
        int size = arrayList.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                ((c) arrayList.get(i9)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:125:0x0229  */
    /* JADX WARN: Code duplicated, block: B:164:0x0334  */
    /* JADX WARN: Code duplicated, block: B:166:0x033e  */
    /* JADX WARN: Code duplicated, block: B:169:0x034c  */
    /* JADX WARN: Code duplicated, block: B:176:0x036a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0374  */
    /* JADX WARN: Code duplicated, block: B:179:0x0384  */
    /* JADX WARN: Code duplicated, block: B:181:0x038c  */
    /* JADX WARN: Code duplicated, block: B:186:0x03af  */
    /* JADX WARN: Code duplicated, block: B:189:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:191:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:192:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:194:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:201:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:203:0x0401  */
    /* JADX WARN: Code duplicated, block: B:205:0x0405  */
    /* JADX WARN: Code duplicated, block: B:206:0x040e  */
    /* JADX WARN: Code duplicated, block: B:208:0x0418  */
    /* JADX WARN: Code duplicated, block: B:211:0x041f  */
    /* JADX WARN: Code duplicated, block: B:214:0x0427  */
    /* JADX WARN: Code duplicated, block: B:287:0x054c  */
    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        boolean z4;
        int i6;
        boolean z5;
        d dVar;
        int i7;
        d dVar2;
        int i8;
        int i9;
        int i10;
        d dVar3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        d dVar4;
        int i17;
        int i18;
        int i19;
        d dVar5;
        x.e eVar;
        int i20;
        int i21;
        int i22;
        d dVar6;
        int i23;
        float f;
        d dVar7;
        d dVar8;
        int i24;
        d dVar9;
        int i25;
        int i26;
        int i27;
        int i28;
        float fAbs;
        int i29;
        byte b5;
        SparseArray sparseArray;
        ArrayList arrayList;
        String str;
        int iF;
        int i30;
        d dVar10;
        ConstraintLayout constraintLayout = this;
        boolean z6 = constraintLayout.f458m;
        constraintLayout.f458m = z6;
        int i31 = 1;
        int i32 = 0;
        if (!z6) {
            int childCount = constraintLayout.getChildCount();
            for (int i33 = 0; i33 < childCount; i33++) {
                if (constraintLayout.getChildAt(i33).isLayoutRequested()) {
                    constraintLayout.f458m = true;
                    break;
                }
            }
        }
        boolean z7 = (constraintLayout.getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == constraintLayout.getLayoutDirection();
        e eVar2 = constraintLayout.f453h;
        eVar2.v0 = z7;
        if (constraintLayout.f458m) {
            constraintLayout.f458m = false;
            int childCount2 = constraintLayout.getChildCount();
            int i34 = 0;
            while (true) {
                if (i34 >= childCount2) {
                    z4 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i34).isLayoutRequested()) {
                        z4 = true;
                        break;
                    }
                    i34++;
                }
            }
            if (z4) {
                boolean zIsInEditMode = constraintLayout.isInEditMode();
                int childCount3 = constraintLayout.getChildCount();
                for (int i35 = 0; i35 < childCount3; i35++) {
                    d dVarH = constraintLayout.h(constraintLayout.getChildAt(i35));
                    if (dVarH != null) {
                        dVarH.C();
                    }
                }
                SparseArray sparseArray2 = constraintLayout.f;
                if (zIsInEditMode) {
                    int i36 = 0;
                    while (i36 < childCount3) {
                        View childAt = constraintLayout.getChildAt(i36);
                        try {
                            String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                i30 = i31;
                                try {
                                    if (constraintLayout.f462r == null) {
                                        constraintLayout.f462r = new HashMap();
                                    }
                                    int iIndexOf = resourceName.indexOf("/");
                                    constraintLayout.f462r.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                                } catch (Resources.NotFoundException unused) {
                                }
                            } else {
                                i30 = i31;
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) sparseArray2.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                dVar10 = viewFindViewById == constraintLayout ? eVar2 : viewFindViewById == null ? null : ((x.e) viewFindViewById.getLayoutParams()).f4526p0;
                            }
                            dVar10.f3777h0 = resourceName;
                        } catch (Resources.NotFoundException unused2) {
                            i30 = i31;
                        }
                        i36++;
                        i31 = i30;
                    }
                }
                int i37 = i31;
                if (constraintLayout.f461q != -1) {
                    for (int i38 = 0; i38 < childCount3; i38++) {
                        constraintLayout.getChildAt(i38).getId();
                    }
                }
                o oVar = constraintLayout.f459o;
                if (oVar != null) {
                    oVar.a(constraintLayout);
                }
                eVar2.f3802q0.clear();
                ArrayList arrayList2 = constraintLayout.f452g;
                int size = arrayList2.size();
                if (size > 0) {
                    int i39 = 0;
                    while (i39 < size) {
                        c cVar = (c) arrayList2.get(i39);
                        HashMap map = cVar.f4498l;
                        if (cVar.isInEditMode()) {
                            cVar.setIds(cVar.f4496j);
                        }
                        u.i iVar = cVar.f4495i;
                        if (iVar == null) {
                            sparseArray = sparseArray2;
                            arrayList = arrayList2;
                        } else {
                            iVar.f3842r0 = i32;
                            Arrays.fill(iVar.f3841q0, (Object) null);
                            int i40 = i32;
                            while (i40 < cVar.f4493g) {
                                int i41 = cVar.f[i40];
                                View view = (View) sparseArray2.get(i41);
                                if (view == null && (iF = cVar.f(constraintLayout, (str = (String) map.get(Integer.valueOf(i41))))) != 0) {
                                    cVar.f[i40] = iF;
                                    map.put(Integer.valueOf(iF), str);
                                    view = (View) sparseArray2.get(iF);
                                }
                                View view2 = view;
                                if (view2 != null) {
                                    u.i iVar2 = cVar.f4495i;
                                    d dVarH2 = constraintLayout.h(view2);
                                    iVar2.getClass();
                                    if (dVarH2 != iVar2 && dVarH2 != null) {
                                        int i42 = iVar2.f3842r0 + 1;
                                        d[] dVarArr = iVar2.f3841q0;
                                        if (i42 > dVarArr.length) {
                                            iVar2.f3841q0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                                        }
                                        d[] dVarArr2 = iVar2.f3841q0;
                                        int i43 = iVar2.f3842r0;
                                        dVarArr2[i43] = dVarH2;
                                        iVar2.f3842r0 = i43 + 1;
                                    }
                                }
                                i40++;
                                sparseArray2 = sparseArray2;
                                arrayList2 = arrayList2;
                            }
                            sparseArray = sparseArray2;
                            arrayList = arrayList2;
                            cVar.f4495i.S();
                        }
                        i39++;
                        sparseArray2 = sparseArray;
                        arrayList2 = arrayList;
                        i32 = 0;
                    }
                }
                int i44 = 2;
                for (int i45 = 0; i45 < childCount3; i45++) {
                    constraintLayout.getChildAt(i45);
                }
                SparseArray sparseArray3 = constraintLayout.f463s;
                sparseArray3.clear();
                sparseArray3.put(0, eVar2);
                sparseArray3.put(constraintLayout.getId(), eVar2);
                for (int i46 = 0; i46 < childCount3; i46++) {
                    View childAt2 = constraintLayout.getChildAt(i46);
                    sparseArray3.put(childAt2.getId(), constraintLayout.h(childAt2));
                }
                int i47 = 0;
                while (i47 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i47);
                    d dVarH3 = constraintLayout.h(childAt3);
                    if (dVarH3 == null) {
                        i6 = i47;
                        z5 = z4;
                        i26 = i44;
                    } else {
                        x.e eVar3 = (x.e) childAt3.getLayoutParams();
                        eVar2.f3802q0.add(dVarH3);
                        d dVar11 = dVarH3.T;
                        if (dVar11 != null) {
                            ((e) dVar11).f3802q0.remove(dVarH3);
                            dVarH3.C();
                        }
                        dVarH3.T = eVar2;
                        eVar3.a();
                        dVarH3.g0 = childAt3.getVisibility();
                        dVarH3.f3774f0 = childAt3;
                        if (childAt3 instanceof c) {
                            ((c) childAt3).h(dVarH3, eVar2.v0);
                        }
                        if (eVar3.d0) {
                            u.h hVar = (u.h) dVarH3;
                            int i48 = eVar3.f4521m0;
                            int i49 = eVar3.f4522n0;
                            float f4 = eVar3.f4524o0;
                            if (f4 == -1.0f) {
                                b5 = -1;
                                if (i48 != -1) {
                                    if (i48 > -1) {
                                        hVar.f3836q0 = -1.0f;
                                        hVar.f3837r0 = i48;
                                        hVar.f3838s0 = -1;
                                    }
                                } else if (i49 != -1 && i49 > -1) {
                                    hVar.f3836q0 = -1.0f;
                                    hVar.f3837r0 = -1;
                                    hVar.f3838s0 = i49;
                                    i6 = i47;
                                    z5 = z4;
                                    i26 = i44;
                                }
                                i6 = i47;
                                z5 = z4;
                                i26 = i44;
                            } else if (f4 > -1.0f) {
                                hVar.f3836q0 = f4;
                                b5 = -1;
                                hVar.f3837r0 = -1;
                                hVar.f3838s0 = -1;
                                i6 = i47;
                                z5 = z4;
                                i26 = i44;
                            } else {
                                i6 = i47;
                                z5 = z4;
                                i26 = i44;
                            }
                        } else {
                            int i50 = eVar3.f4509f0;
                            int i51 = eVar3.g0;
                            int i52 = eVar3.f4512h0;
                            int i53 = eVar3.f4514i0;
                            int i54 = eVar3.j0;
                            int i55 = eVar3.f4517k0;
                            i6 = i47;
                            float f5 = eVar3.f4519l0;
                            int i56 = eVar3.f4525p;
                            z5 = z4;
                            if (i56 != -1) {
                                d dVar12 = (d) sparseArray3.get(i56);
                                if (dVar12 != null) {
                                    float f6 = eVar3.f4528r;
                                    dVarH3.v(7, 7, eVar3.f4527q, 0, dVar12);
                                    dVarH3.D = f6;
                                }
                                constraintLayout = this;
                                dVar6 = dVarH3;
                                eVar = eVar3;
                                i11 = 4;
                                i10 = 2;
                            } else {
                                if (i50 != -1) {
                                    d dVar13 = (d) sparseArray3.get(i50);
                                    if (dVar13 != null) {
                                        dVar = dVarH3;
                                        i7 = 2;
                                        dVar.v(2, 2, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i54, dVar13);
                                    } else {
                                        dVar = dVarH3;
                                        i7 = 2;
                                    }
                                } else {
                                    dVar = dVarH3;
                                    i7 = 2;
                                    if (i51 != -1 && (dVar2 = (d) sparseArray3.get(i51)) != null) {
                                        dVar.v(2, 4, ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, i54, dVar2);
                                        i8 = 2;
                                        i9 = 4;
                                    }
                                    if (i52 != -1) {
                                        dVar9 = (d) sparseArray3.get(i52);
                                        if (dVar9 != null) {
                                            dVar.v(i9, i8, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i55, dVar9);
                                        }
                                        i10 = i8;
                                    } else {
                                        i10 = i8;
                                        if (i53 != -1 && (dVar3 = (d) sparseArray3.get(i53)) != null) {
                                            dVar.v(i9, i9, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i55, dVar3);
                                        }
                                    }
                                    i11 = i9;
                                    i12 = eVar3.f4513i;
                                    if (i12 != -1) {
                                        dVar8 = (d) sparseArray3.get(i12);
                                        if (dVar8 != null) {
                                            i24 = 3;
                                            dVar.v(3, 3, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f4534x, dVar8);
                                        } else {
                                            i24 = 3;
                                        }
                                        i15 = i24;
                                        i16 = 5;
                                        i14 = -1;
                                    } else {
                                        i13 = eVar3.f4515j;
                                        i14 = -1;
                                        if (i13 != -1 || (dVar4 = (d) sparseArray3.get(i13)) == null) {
                                            i15 = 3;
                                            i16 = 5;
                                        } else {
                                            dVar.v(3, 5, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f4534x, dVar4);
                                            i15 = 3;
                                            i16 = 5;
                                        }
                                    }
                                    i17 = eVar3.f4516k;
                                    if (i17 != i14) {
                                        dVar7 = (d) sparseArray3.get(i17);
                                        if (dVar7 != null) {
                                            int i57 = i15;
                                            dVar.v(i16, i57, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f4536z, dVar7);
                                            i18 = i57;
                                        } else {
                                            i18 = i15;
                                        }
                                    } else {
                                        i18 = i15;
                                        i19 = eVar3.f4518l;
                                        if (i19 != i14 && (dVar5 = (d) sparseArray3.get(i19)) != null) {
                                            dVar.v(i16, i16, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f4536z, dVar5);
                                        }
                                    }
                                    eVar = eVar3;
                                    i20 = eVar.f4520m;
                                    if (i20 != -1) {
                                        constraintLayout = this;
                                        dVar6 = dVar;
                                        constraintLayout.l(dVar6, eVar, sparseArray3, i20, 6);
                                    } else {
                                        i21 = eVar.n;
                                        if (i21 != -1) {
                                            constraintLayout = this;
                                            dVar6 = dVar;
                                            constraintLayout.l(dVar6, eVar, sparseArray3, i21, i18);
                                        } else {
                                            i22 = eVar.f4523o;
                                            constraintLayout = this;
                                            dVar6 = dVar;
                                            i23 = i16;
                                            if (i22 != -1) {
                                                constraintLayout.l(dVar6, eVar, sparseArray3, i22, i23);
                                            }
                                        }
                                        if (f5 >= 0.0f) {
                                            dVar6.d0 = f5;
                                        }
                                        f = eVar.F;
                                        if (f >= 0.0f) {
                                            dVar6.f3773e0 = f;
                                        }
                                    }
                                    if (f5 >= 0.0f) {
                                        dVar6.d0 = f5;
                                    }
                                    f = eVar.F;
                                    if (f >= 0.0f) {
                                        dVar6.f3773e0 = f;
                                    }
                                }
                                i8 = i7;
                                i9 = 4;
                                if (i52 != -1) {
                                    dVar9 = (d) sparseArray3.get(i52);
                                    if (dVar9 != null) {
                                        dVar.v(i9, i8, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i55, dVar9);
                                    }
                                    i10 = i8;
                                } else {
                                    i10 = i8;
                                    if (i53 != -1) {
                                        dVar.v(i9, i9, ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, i55, dVar3);
                                    }
                                }
                                i11 = i9;
                                i12 = eVar3.f4513i;
                                if (i12 != -1) {
                                    dVar8 = (d) sparseArray3.get(i12);
                                    if (dVar8 != null) {
                                        i24 = 3;
                                        dVar.v(3, 3, ((ViewGroup.MarginLayoutParams) eVar3).topMargin, eVar3.f4534x, dVar8);
                                    } else {
                                        i24 = 3;
                                    }
                                    i15 = i24;
                                    i16 = 5;
                                    i14 = -1;
                                } else {
                                    i13 = eVar3.f4515j;
                                    i14 = -1;
                                    if (i13 != -1) {
                                        i15 = 3;
                                        i16 = 5;
                                    } else {
                                        i15 = 3;
                                        i16 = 5;
                                    }
                                }
                                i17 = eVar3.f4516k;
                                if (i17 != i14) {
                                    dVar7 = (d) sparseArray3.get(i17);
                                    if (dVar7 != null) {
                                        int i58 = i15;
                                        dVar.v(i16, i58, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f4536z, dVar7);
                                        i18 = i58;
                                    } else {
                                        i18 = i15;
                                    }
                                } else {
                                    i18 = i15;
                                    i19 = eVar3.f4518l;
                                    if (i19 != i14) {
                                        dVar.v(i16, i16, ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin, eVar3.f4536z, dVar5);
                                    }
                                }
                                eVar = eVar3;
                                i20 = eVar.f4520m;
                                if (i20 != -1) {
                                    constraintLayout = this;
                                    dVar6 = dVar;
                                    constraintLayout.l(dVar6, eVar, sparseArray3, i20, 6);
                                } else {
                                    i21 = eVar.n;
                                    if (i21 != -1) {
                                        constraintLayout = this;
                                        dVar6 = dVar;
                                        constraintLayout.l(dVar6, eVar, sparseArray3, i21, i18);
                                    } else {
                                        i22 = eVar.f4523o;
                                        constraintLayout = this;
                                        dVar6 = dVar;
                                        i23 = i16;
                                        if (i22 != -1) {
                                            constraintLayout.l(dVar6, eVar, sparseArray3, i22, i23);
                                        }
                                    }
                                    if (f5 >= 0.0f) {
                                        dVar6.d0 = f5;
                                    }
                                    f = eVar.F;
                                    if (f >= 0.0f) {
                                        dVar6.f3773e0 = f;
                                    }
                                }
                                if (f5 >= 0.0f) {
                                    dVar6.d0 = f5;
                                }
                                f = eVar.F;
                                if (f >= 0.0f) {
                                    dVar6.f3773e0 = f;
                                }
                            }
                            if (zIsInEditMode && ((i29 = eVar.T) != -1 || eVar.U != -1)) {
                                int i59 = eVar.U;
                                dVar6.Y = i29;
                                dVar6.Z = i59;
                            }
                            if (eVar.f4501a0) {
                                dVar6.M(i37);
                                dVar6.O(((ViewGroup.MarginLayoutParams) eVar).width);
                                if (((ViewGroup.MarginLayoutParams) eVar).width == -2) {
                                    dVar6.M(i44);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) eVar).width == -1) {
                                if (eVar.W) {
                                    dVar6.M(3);
                                } else {
                                    dVar6.M(4);
                                }
                                dVar6.i(i10).f3762g = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                                dVar6.i(i11).f3762g = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                            } else {
                                dVar6.M(3);
                                dVar6.O(0);
                            }
                            if (eVar.f4503b0) {
                                i25 = -1;
                                dVar6.N(1);
                                dVar6.L(((ViewGroup.MarginLayoutParams) eVar).height);
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -2) {
                                    dVar6.N(2);
                                }
                            } else {
                                i25 = -1;
                                if (((ViewGroup.MarginLayoutParams) eVar).height == -1) {
                                    if (eVar.X) {
                                        dVar6.N(3);
                                    } else {
                                        dVar6.N(4);
                                    }
                                    dVar6.i(3).f3762g = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                                    dVar6.i(5).f3762g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                                } else {
                                    dVar6.N(3);
                                    dVar6.L(0);
                                }
                            }
                            String str2 = eVar.G;
                            if (str2 == null || str2.length() == 0) {
                                dVar6.W = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i27 = i25;
                                    i28 = 0;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i27 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i25;
                                    i28 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i28);
                                    if (strSubstring2.length() > 0) {
                                        fAbs = Float.parseFloat(strSubstring2);
                                    } else {
                                        fAbs = 0.0f;
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i28, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        fAbs = 0.0f;
                                    } else {
                                        try {
                                            float f7 = Float.parseFloat(strSubstring3);
                                            float f8 = Float.parseFloat(strSubstring4);
                                            if (f7 <= 0.0f || f8 <= 0.0f) {
                                                fAbs = 0.0f;
                                            } else {
                                                fAbs = i27 == 1 ? Math.abs(f8 / f7) : Math.abs(f7 / f8);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                    }
                                }
                                if (fAbs > 0.0f) {
                                    dVar6.W = fAbs;
                                    dVar6.X = i27;
                                }
                            }
                            float f9 = eVar.H;
                            float[] fArr = dVar6.f3782k0;
                            fArr[0] = f9;
                            i37 = 1;
                            fArr[1] = eVar.I;
                            dVar6.f3779i0 = eVar.J;
                            dVar6.j0 = eVar.K;
                            int i60 = eVar.Z;
                            if (i60 >= 0 && i60 <= 3) {
                                dVar6.f3792q = i60;
                            }
                            int i61 = eVar.L;
                            int i62 = eVar.N;
                            int i63 = eVar.P;
                            float f10 = eVar.R;
                            dVar6.f3793r = i61;
                            dVar6.f3796u = i62;
                            if (i63 == Integer.MAX_VALUE) {
                                i63 = 0;
                            }
                            dVar6.f3797v = i63;
                            dVar6.f3798w = f10;
                            if (f10 > 0.0f && f10 < 1.0f && i61 == 0) {
                                dVar6.f3793r = 2;
                            }
                            int i64 = eVar.M;
                            int i65 = eVar.O;
                            int i66 = eVar.Q;
                            float f11 = eVar.S;
                            dVar6.f3794s = i64;
                            dVar6.f3799x = i65;
                            if (i66 == Integer.MAX_VALUE) {
                                i66 = 0;
                            }
                            dVar6.f3800y = i66;
                            dVar6.f3801z = f11;
                            if (f11 <= 0.0f || f11 >= 1.0f || i64 != 0) {
                                i26 = 2;
                            } else {
                                i26 = 2;
                                dVar6.f3794s = 2;
                            }
                        }
                    }
                    i47 = i6 + 1;
                    i44 = i26;
                    z4 = z5;
                }
            }
            if (z4) {
                eVar2.f3803r0.y(eVar2);
            }
        }
        eVar2.f3807w0.getClass();
        constraintLayout.k(eVar2, constraintLayout.n, i4, i5);
        int iQ = eVar2.q();
        int iK = eVar2.k();
        boolean z8 = eVar2.E0;
        boolean z9 = eVar2.F0;
        f fVar = constraintLayout.f464t;
        int i67 = fVar.f4541e;
        int iResolveSizeAndState = View.resolveSizeAndState(iQ + fVar.f4540d, i4, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iK + i67, i5, 0) & 16777215;
        int iMin = Math.min(constraintLayout.f456k, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(constraintLayout.f457l, iResolveSizeAndState2);
        if (z8) {
            iMin |= 16777216;
        }
        if (z9) {
            iMin2 |= 16777216;
        }
        constraintLayout.setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d dVarH = h(view);
        if ((view instanceof Guideline) && !(dVarH instanceof u.h)) {
            x.e eVar = (x.e) view.getLayoutParams();
            u.h hVar = new u.h();
            eVar.f4526p0 = hVar;
            eVar.d0 = true;
            hVar.S(eVar.V);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.i();
            ((x.e) view.getLayoutParams()).f4508e0 = true;
            ArrayList arrayList = this.f452g;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f.put(view.getId(), view);
        this.f458m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f.remove(view.getId());
        d dVarH = h(view);
        this.f453h.f3802q0.remove(dVarH);
        dVarH.C();
        this.f452g.remove(view);
        this.f458m = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f458m = true;
        super.requestLayout();
    }

    public void setConstraintSet(o oVar) {
        this.f459o = oVar;
    }

    @Override // android.view.View
    public void setId(int i4) {
        int id = getId();
        SparseArray sparseArray = this.f;
        sparseArray.remove(id);
        super.setId(i4);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i4) {
        if (i4 == this.f457l) {
            return;
        }
        this.f457l = i4;
        requestLayout();
    }

    public void setMaxWidth(int i4) {
        if (i4 == this.f456k) {
            return;
        }
        this.f456k = i4;
        requestLayout();
    }

    public void setMinHeight(int i4) {
        if (i4 == this.f455j) {
            return;
        }
        this.f455j = i4;
        requestLayout();
    }

    public void setMinWidth(int i4) {
        if (i4 == this.f454i) {
            return;
        }
        this.f454i = i4;
        requestLayout();
    }

    public void setOnConstraintsChanged(x.p pVar) {
        p pVar2 = this.f460p;
        if (pVar2 != null) {
            pVar2.getClass();
        }
    }

    public void setOptimizationLevel(int i4) {
        this.n = i4;
        e eVar = this.f453h;
        eVar.D0 = i4;
        s.c.f3629q = eVar.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f = new SparseArray();
        this.f452g = new ArrayList(4);
        this.f453h = new e();
        this.f454i = 0;
        this.f455j = 0;
        this.f456k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f457l = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f458m = true;
        this.n = 257;
        this.f459o = null;
        this.f460p = null;
        this.f461q = -1;
        this.f462r = new HashMap();
        this.f463s = new SparseArray();
        this.f464t = new f(this, this);
        i(attributeSet, i4);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        x.e eVar = new x.e(layoutParams);
        eVar.f4500a = -1;
        eVar.f4502b = -1;
        eVar.f4504c = -1.0f;
        eVar.f4506d = true;
        eVar.f4507e = -1;
        eVar.f = -1;
        eVar.f4510g = -1;
        eVar.f4511h = -1;
        eVar.f4513i = -1;
        eVar.f4515j = -1;
        eVar.f4516k = -1;
        eVar.f4518l = -1;
        eVar.f4520m = -1;
        eVar.n = -1;
        eVar.f4523o = -1;
        eVar.f4525p = -1;
        eVar.f4527q = 0;
        eVar.f4528r = 0.0f;
        eVar.f4529s = -1;
        eVar.f4530t = -1;
        eVar.f4531u = -1;
        eVar.f4532v = -1;
        eVar.f4533w = Integer.MIN_VALUE;
        eVar.f4534x = Integer.MIN_VALUE;
        eVar.f4535y = Integer.MIN_VALUE;
        eVar.f4536z = Integer.MIN_VALUE;
        eVar.A = Integer.MIN_VALUE;
        eVar.B = Integer.MIN_VALUE;
        eVar.C = Integer.MIN_VALUE;
        eVar.D = 0;
        eVar.E = 0.5f;
        eVar.F = 0.5f;
        eVar.G = null;
        eVar.H = -1.0f;
        eVar.I = -1.0f;
        eVar.J = 0;
        eVar.K = 0;
        eVar.L = 0;
        eVar.M = 0;
        eVar.N = 0;
        eVar.O = 0;
        eVar.P = 0;
        eVar.Q = 0;
        eVar.R = 1.0f;
        eVar.S = 1.0f;
        eVar.T = -1;
        eVar.U = -1;
        eVar.V = -1;
        eVar.W = false;
        eVar.X = false;
        eVar.Y = null;
        eVar.Z = 0;
        eVar.f4501a0 = true;
        eVar.f4503b0 = true;
        eVar.f4505c0 = false;
        eVar.d0 = false;
        eVar.f4508e0 = false;
        eVar.f4509f0 = -1;
        eVar.g0 = -1;
        eVar.f4512h0 = -1;
        eVar.f4514i0 = -1;
        eVar.j0 = Integer.MIN_VALUE;
        eVar.f4517k0 = Integer.MIN_VALUE;
        eVar.f4519l0 = 0.5f;
        eVar.f4526p0 = new d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = marginLayoutParams.bottomMargin;
            eVar.setMarginStart(marginLayoutParams.getMarginStart());
            eVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof x.e)) {
            return eVar;
        }
        x.e eVar2 = (x.e) layoutParams;
        eVar.f4500a = eVar2.f4500a;
        eVar.f4502b = eVar2.f4502b;
        eVar.f4504c = eVar2.f4504c;
        eVar.f4506d = eVar2.f4506d;
        eVar.f4507e = eVar2.f4507e;
        eVar.f = eVar2.f;
        eVar.f4510g = eVar2.f4510g;
        eVar.f4511h = eVar2.f4511h;
        eVar.f4513i = eVar2.f4513i;
        eVar.f4515j = eVar2.f4515j;
        eVar.f4516k = eVar2.f4516k;
        eVar.f4518l = eVar2.f4518l;
        eVar.f4520m = eVar2.f4520m;
        eVar.n = eVar2.n;
        eVar.f4523o = eVar2.f4523o;
        eVar.f4525p = eVar2.f4525p;
        eVar.f4527q = eVar2.f4527q;
        eVar.f4528r = eVar2.f4528r;
        eVar.f4529s = eVar2.f4529s;
        eVar.f4530t = eVar2.f4530t;
        eVar.f4531u = eVar2.f4531u;
        eVar.f4532v = eVar2.f4532v;
        eVar.f4533w = eVar2.f4533w;
        eVar.f4534x = eVar2.f4534x;
        eVar.f4535y = eVar2.f4535y;
        eVar.f4536z = eVar2.f4536z;
        eVar.A = eVar2.A;
        eVar.B = eVar2.B;
        eVar.C = eVar2.C;
        eVar.D = eVar2.D;
        eVar.E = eVar2.E;
        eVar.F = eVar2.F;
        eVar.G = eVar2.G;
        eVar.H = eVar2.H;
        eVar.I = eVar2.I;
        eVar.J = eVar2.J;
        eVar.K = eVar2.K;
        eVar.W = eVar2.W;
        eVar.X = eVar2.X;
        eVar.L = eVar2.L;
        eVar.M = eVar2.M;
        eVar.N = eVar2.N;
        eVar.P = eVar2.P;
        eVar.O = eVar2.O;
        eVar.Q = eVar2.Q;
        eVar.R = eVar2.R;
        eVar.S = eVar2.S;
        eVar.T = eVar2.T;
        eVar.U = eVar2.U;
        eVar.V = eVar2.V;
        eVar.f4501a0 = eVar2.f4501a0;
        eVar.f4503b0 = eVar2.f4503b0;
        eVar.f4505c0 = eVar2.f4505c0;
        eVar.d0 = eVar2.d0;
        eVar.f4509f0 = eVar2.f4509f0;
        eVar.g0 = eVar2.g0;
        eVar.f4512h0 = eVar2.f4512h0;
        eVar.f4514i0 = eVar2.f4514i0;
        eVar.j0 = eVar2.j0;
        eVar.f4517k0 = eVar2.f4517k0;
        eVar.f4519l0 = eVar2.f4519l0;
        eVar.Y = eVar2.Y;
        eVar.Z = eVar2.Z;
        eVar.f4526p0 = eVar2.f4526p0;
        return eVar;
    }
}
