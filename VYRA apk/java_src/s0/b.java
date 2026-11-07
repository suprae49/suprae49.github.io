package s0;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.u;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends View {
    public final /* synthetic */ ViewGroup f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f3661g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.f3661g = eVar;
        this.f = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        e eVar = this.f3661g;
        ArrayList arrayList = eVar.f3666b;
        Drawable background = this.f.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (eVar.f3669e != color) {
            eVar.f3669e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList arrayList2 = ((a) arrayList.get(size)).f3657a;
                int size2 = arrayList2.size() - 1;
                if (size2 >= 0) {
                    throw u.i(size2, arrayList2);
                }
            }
        }
    }
}
