package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import i1.f;
import java.util.Collections;
import java.util.List;
import m1.b;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // m1.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // m1.b
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new f(this, context.getApplicationContext()));
        return new a3.f(15);
    }
}
