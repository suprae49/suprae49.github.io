package f0;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class f extends e4.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Class f2076o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Constructor f2077p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Method f2078q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Method f2079r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f2080s = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class f2081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Constructor f2082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Method f2083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Method f2084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f2085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Method f2086m;
    public final Method n;

    public f() throws NoSuchMethodException {
        Method methodU0;
        Constructor<?> constructor;
        Method methodT0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodT0 = t0(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodU0 = u0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e5.getClass().getName()), e5);
            methodU0 = null;
            constructor = null;
            methodT0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f2081h = cls;
        this.f2082i = constructor;
        this.f2083j = methodT0;
        this.f2084k = method;
        this.f2085l = method2;
        this.f2086m = method3;
        this.n = methodU0;
    }

    public static boolean p0(Object obj, String str, int i4, boolean z4) throws NoSuchMethodException {
        s0();
        try {
            return ((Boolean) f2078q.invoke(obj, str, Integer.valueOf(i4), Boolean.valueOf(z4))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static void s0() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2080s) {
            return;
        }
        f2080s = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            Log.e("TypefaceCompatApi21Impl", e5.getClass().getName(), e5);
            method = null;
            cls = null;
            method2 = null;
        }
        f2077p = constructor;
        f2076o = cls;
        f2078q = method2;
        f2079r = method;
    }

    public static Method t0(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // e4.a
    public final Typeface o(Context context, e0.f fVar, Resources resources, int i4) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        e0.g[] gVarArr = fVar.f2016a;
        Method method = this.f2083j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i5 = 0;
        if (method == null) {
            s0();
            try {
                Object objNewInstance2 = f2077p.newInstance(null);
                for (e0.g gVar : gVarArr) {
                    File fileA = h0.A(context);
                    if (fileA != null) {
                        try {
                            try {
                                inputStreamOpenRawResource = resources.openRawResource(gVar.f);
                                try {
                                    boolean zQ = h0.q(fileA, inputStreamOpenRawResource);
                                    if (inputStreamOpenRawResource != null) {
                                        try {
                                            inputStreamOpenRawResource.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!zQ) {
                                        fileA.delete();
                                        return null;
                                    }
                                    if (!p0(objNewInstance2, fileA.getPath(), gVar.f2018b, gVar.f2019c)) {
                                        fileA.delete();
                                        return null;
                                    }
                                    fileA.delete();
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (inputStreamOpenRawResource == null) {
                                        throw th2;
                                    }
                                    try {
                                        inputStreamOpenRawResource.close();
                                        throw th2;
                                    } catch (IOException unused2) {
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStreamOpenRawResource = null;
                            }
                        } catch (RuntimeException unused3) {
                            fileA.delete();
                            return null;
                        } catch (Throwable th4) {
                            fileA.delete();
                            throw th4;
                        }
                    }
                }
                s0();
                try {
                    Object objNewInstance3 = Array.newInstance((Class<?>) f2076o, 1);
                    Array.set(objNewInstance3, 0, objNewInstance2);
                    return (Typeface) f2079r.invoke(null, objNewInstance3);
                } catch (IllegalAccessException | InvocationTargetException e5) {
                    throw new RuntimeException(e5);
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        }
        try {
            objNewInstance = this.f2082i.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int length = gVarArr.length;
            while (i5 < length) {
                e0.g gVar2 = gVarArr[i5];
                Context context2 = context;
                if (o0(context2, objNewInstance, gVar2.f2017a, gVar2.f2021e, gVar2.f2018b, gVar2.f2019c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar2.f2020d))) {
                    i5++;
                    context = context2;
                } else {
                    try {
                        this.f2086m.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused5) {
                    }
                }
            }
            if (r0(objNewInstance)) {
                return q0(objNewInstance);
            }
        }
        return null;
    }

    public final boolean o0(Context context, Object obj, String str, int i4, int i5, int i6, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2083j.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // e4.a
    public final Typeface p(Context context, l0.i[] iVarArr, int i4) throws IOException {
        Object objNewInstance;
        Typeface typefaceQ0;
        boolean zBooleanValue;
        if (iVarArr.length >= 1) {
            Method method = this.f2083j;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (l0.i iVar : iVarArr) {
                        if (iVar.f == 0) {
                            Uri uri = iVar.f3000a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, h0.L(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.f2082i.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = iVarArr.length;
                        int i5 = 0;
                        boolean z4 = false;
                        while (true) {
                            Method method2 = this.f2086m;
                            if (i5 >= length) {
                                if (!z4) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                if (!r0(objNewInstance) || (typefaceQ0 = q0(objNewInstance)) == null) {
                                    break;
                                    break;
                                }
                                return Typeface.create(typefaceQ0, i4);
                            }
                            l0.i iVar2 = iVarArr[i5];
                            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(iVar2.f3000a);
                            if (byteBuffer != null) {
                                try {
                                    zBooleanValue = ((Boolean) this.f2084k.invoke(objNewInstance, byteBuffer, Integer.valueOf(iVar2.f3001b), null, Integer.valueOf(iVar2.f3002c), Integer.valueOf(iVar2.f3003d ? 1 : 0))).booleanValue();
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                    zBooleanValue = false;
                                }
                                if (!zBooleanValue) {
                                    method2.invoke(objNewInstance, null);
                                    break;
                                }
                                z4 = true;
                            }
                            i5++;
                            z4 = z4;
                        }
                    }
                } else {
                    int i6 = (i4 & 1) == 0 ? 400 : 700;
                    boolean z5 = (i4 & 2) != 0;
                    int i7 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    l0.i iVar3 = null;
                    for (l0.i iVar4 : iVarArr) {
                        int iAbs = (Math.abs(iVar4.f3002c - i6) * 2) + (iVar4.f3003d == z5 ? 0 : 1);
                        if (iVar3 == null || i7 > iAbs) {
                            iVar3 = iVar4;
                            i7 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(iVar3.f3000a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(iVar3.f3002c).setItalic(iVar3.f3003d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    public Typeface q0(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f2081h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.n.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // e4.a
    public final Typeface r(Context context, Resources resources, int i4, String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        Method method = this.f2083j;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.f2082i.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!o0(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.f2086m.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (r0(objNewInstance)) {
                    return q0(objNewInstance);
                }
            }
        } else {
            File fileA = h0.A(context);
            try {
                if (fileA != null) {
                    try {
                        inputStreamOpenRawResource = resources.openRawResource(i4);
                        try {
                            boolean zQ = h0.q(fileA, inputStreamOpenRawResource);
                            if (inputStreamOpenRawResource != null) {
                                try {
                                    inputStreamOpenRawResource.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!zQ) {
                                fileA.delete();
                                return null;
                            }
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(fileA.getPath());
                            fileA.delete();
                            return typefaceCreateFromFile;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (inputStreamOpenRawResource == null) {
                                throw th2;
                            }
                            try {
                                inputStreamOpenRawResource.close();
                                throw th2;
                            } catch (IOException unused4) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamOpenRawResource = null;
                    }
                }
            } catch (RuntimeException unused5) {
                return null;
            } finally {
                fileA.delete();
            }
        }
        return null;
    }

    public final boolean r0(Object obj) {
        try {
            return ((Boolean) this.f2085l.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method u0(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
