package x;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends View {
    public int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f4494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u.i f4495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f4497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HashMap f4498l;

    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    public final void a(String str) {
        int identifier;
        HashMap map;
        Context context = this.f4494h;
        if (str.length() == 0 || context == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            identifier = 0;
        } else {
            Object obj = (strTrim == null || (map = constraintLayout.f462r) == null || !map.containsKey(strTrim)) ? null : constraintLayout.f462r.get(strTrim);
            if (obj instanceof Integer) {
                identifier = ((Integer) obj).intValue();
            } else {
                identifier = 0;
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = f(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.f4498l.put(Integer.valueOf(identifier), strTrim);
            b(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public final void b(int i4) {
        if (i4 == getId()) {
            return;
        }
        int i5 = this.f4493g + 1;
        int[] iArr = this.f;
        if (i5 > iArr.length) {
            this.f = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f;
        int i6 = this.f4493g;
        iArr2[i6] = i4;
        this.f4493g = i6 + 1;
    }

    public final void c(String str) {
        if (str.length() == 0 || this.f4494h == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof e) && strTrim.equals(((e) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i4 = 0; i4 < this.f4493g; i4++) {
            View view = (View) constraintLayout.f.get(this.f[i4]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f4494h.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = constraintLayout.getChildAt(i4);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f4636b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f4496j = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f4497k = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f, this.f4493g);
    }

    public abstract void h(u.d dVar, boolean z4);

    public final void i() {
        if (this.f4495i == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof e) {
            ((e) layoutParams).f4526p0 = this.f4495i;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f4496j;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f4497k;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f4496j = str;
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.f4493g = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i4);
            if (iIndexOf == -1) {
                a(str.substring(i4));
                return;
            } else {
                a(str.substring(i4, iIndexOf));
                i4 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f4497k = str;
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.f4493g = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i4);
            if (iIndexOf == -1) {
                c(str.substring(i4));
                return;
            } else {
                c(str.substring(i4, iIndexOf));
                i4 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f4496j = null;
        this.f4493g = 0;
        for (int i4 : iArr) {
            b(i4);
        }
    }

    @Override // android.view.View
    public final void setTag(int i4, Object obj) {
        super.setTag(i4, obj);
        if (obj == null && this.f4496j == null) {
            b(i4);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
