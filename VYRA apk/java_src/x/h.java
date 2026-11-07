package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f4547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4551e;

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f4547a = Float.NaN;
        this.f4548b = Float.NaN;
        this.f4549c = Float.NaN;
        this.f4550d = Float.NaN;
        this.f4551e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f4643j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i4);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4551e);
                this.f4551e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f4550d = typedArrayObtainStyledAttributes.getDimension(index, this.f4550d);
            } else if (index == 2) {
                this.f4548b = typedArrayObtainStyledAttributes.getDimension(index, this.f4548b);
            } else if (index == 3) {
                this.f4549c = typedArrayObtainStyledAttributes.getDimension(index, this.f4549c);
            } else if (index == 4) {
                this.f4547a = typedArrayObtainStyledAttributes.getDimension(index, this.f4547a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
