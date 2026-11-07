package b1;

import android.text.Editable;
import androidx.emoji2.text.z;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f1030a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f1031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f1032c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f1032c;
        return cls != null ? new z(cls, charSequence) : super.newEditable(charSequence);
    }
}
