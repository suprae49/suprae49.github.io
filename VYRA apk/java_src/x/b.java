package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4487a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f4490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4491e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4492g;

    public b(b bVar, Object obj) {
        bVar.getClass();
        this.f4488b = bVar.f4488b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f4638d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i4 = 0;
        boolean z4 = false;
        Object objValueOf = null;
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i5);
            int i6 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z4 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i4 = 6;
            } else {
                int i7 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i7 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i7 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i4 = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i6 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i4 = i6;
                            }
                        }
                        i4 = 7;
                    }
                }
                i4 = i7;
            }
        }
        if (string != null && objValueOf != null) {
            b bVar = new b();
            bVar.f4488b = i4;
            bVar.f4487a = z4;
            bVar.b(objValueOf);
            map.put(string, bVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (s.e.b(this.f4488b)) {
            case 0:
            case 7:
                this.f4489c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f4490d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f4492g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f4491e = (String) obj;
                break;
            case 5:
                this.f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f4490d = ((Float) obj).floatValue();
                break;
        }
    }
}
