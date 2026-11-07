package e0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import androidx.activity.p;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2031a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f2032b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f2033c = new Object();

    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    public static Typeface a(Context context, int i4, TypedValue typedValue, int i5, b bVar, boolean z4, boolean z5) throws Exception {
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i4) + "\" (" + Integer.toHexString(i4) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i6 = typedValue.assetCookie;
            p.j jVar = f0.e.f2074b;
            Typeface typeface = (Typeface) jVar.get(f0.e.b(resources, i4, string, i6, i5));
            if (typeface != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new p(bVar, 2, typeface));
                }
                typefaceA = typeface;
            } else if (!z5) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        e eVarJ = b.j(resources.getXml(i4), resources);
                        if (eVarJ == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (bVar != null) {
                                bVar.a(-3);
                            }
                        } else {
                            typefaceA = f0.e.a(context, eVarJ, resources, i4, string, typedValue.assetCookie, i5, bVar, z4);
                        }
                    } else {
                        int i7 = typedValue.assetCookie;
                        Typeface typefaceR = f0.e.f2073a.r(context, resources, i4, string);
                        if (typefaceR != null) {
                            jVar.put(f0.e.b(resources, i4, string, i7, i5), typefaceR);
                        }
                        if (bVar != null) {
                            if (typefaceR != null) {
                                new Handler(Looper.getMainLooper()).post(new p(bVar, 2, typefaceR));
                            } else {
                                bVar.a(-3);
                            }
                        }
                        typefaceA = typefaceR;
                    }
                } catch (IOException e5) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e5);
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                } catch (XmlPullParserException e6) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e6);
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                }
            }
        } else if (bVar != null) {
            bVar.a(-3);
        }
        if (typefaceA != null || bVar != null || z5) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i4) + " could not be retrieved.");
    }
}
