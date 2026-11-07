package f0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class h extends e4.a {
    public static Font o0(FontFamily fontFamily, int i4) {
        FontStyle fontStyle = new FontStyle((i4 & 1) != 0 ? 700 : 400, (i4 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iR0 = r0(fontStyle, font.getStyle());
        for (int i5 = 1; i5 < fontFamily.getSize(); i5++) {
            Font font2 = fontFamily.getFont(i5);
            int iR1 = r0(fontStyle, font2.getStyle());
            if (iR1 < iR0) {
                font = font2;
                iR0 = iR1;
            }
        }
        return font;
    }

    public static int r0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // e4.a
    public final Typeface o(Context context, e0.f fVar, Resources resources, int i4) {
        try {
            FontFamily.Builder builder = null;
            for (e0.g gVar : fVar.f2016a) {
                try {
                    Font fontBuild = new Font.Builder(resources, gVar.f).setWeight(gVar.f2018b).setSlant(gVar.f2019c ? 1 : 0).setTtcIndex(gVar.f2021e).setFontVariationSettings(gVar.f2020d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(o0(fontFamilyBuild, i4).getStyle()).build();
        } catch (Exception e5) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e5);
            return null;
        }
    }

    @Override // e4.a
    public final Typeface p(Context context, l0.i[] iVarArr, int i4) {
        try {
            FontFamily fontFamilyP0 = p0(iVarArr, context.getContentResolver());
            if (fontFamilyP0 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyP0).setStyle(o0(fontFamilyP0, i4).getStyle()).build();
        } catch (Exception e5) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e5);
            return null;
        }
    }

    public final FontFamily p0(l0.i[] iVarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (l0.i iVar : iVarArr) {
            if (Objects.equals(iVar.f3000a.getScheme(), "systemfont")) {
                fontBuild = q0(iVar);
            } else {
                try {
                    Uri uri = iVar.f3000a;
                    String str = iVar.f3004e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(iVar.f3002c).setSlant(iVar.f3003d ? 1 : 0).setTtcIndex(iVar.f3001b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e5) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e5);
                    fontBuild = null;
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    @Override // e4.a
    public final Typeface q(Context context, List list, int i4) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyP0 = p0((l0.i[]) list.get(0), contentResolver);
            if (fontFamilyP0 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyP0);
            for (int i5 = 1; i5 < list.size(); i5++) {
                FontFamily fontFamilyP1 = p0((l0.i[]) list.get(i5), contentResolver);
                if (fontFamilyP1 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyP1);
                }
            }
            return customFallbackBuilder.setStyle(o0(fontFamilyP0, i4).getStyle()).build();
        } catch (Exception e5) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e5);
            return null;
        }
    }

    public Font q0(l0.i iVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // e4.a
    public final Typeface r(Context context, Resources resources, int i4, String str) {
        try {
            Font fontBuild = new Font.Builder(resources, i4).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e5) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e5);
            return null;
        }
    }
}
