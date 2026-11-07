package u2;

import android.content.Context;
import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j.m {
    public final int A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Class f4191z;

    public g(Context context, Class cls, int i4) {
        super(context);
        this.f4191z = cls;
        this.A = i4;
    }

    @Override // j.m
    public final j.o a(int i4, int i5, int i6, CharSequence charSequence) {
        int size = this.f.size() + 1;
        int i7 = this.A;
        if (size <= i7) {
            y();
            j.o oVarA = super.a(i4, i5, i6, charSequence);
            x();
            return oVarA;
        }
        String simpleName = this.f4191z.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + i7 + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // j.m, android.view.Menu
    public final SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.f4191z.getSimpleName().concat(" does not support submenus"));
    }
}
