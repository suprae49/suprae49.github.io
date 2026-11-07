package p0;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static f b(View view, f fVar) {
        ContentInfo contentInfoO = fVar.f3186a.o();
        Objects.requireNonNull(contentInfoO);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoO);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoO ? fVar : new f(new a3.h0(contentInfoPerformReceiveContent));
    }
}
