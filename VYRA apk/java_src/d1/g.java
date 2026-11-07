package d1;

import androidx.fragment.app.Fragment;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends RuntimeException {
    public final Fragment f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Fragment fragment, String str) {
        super(str);
        fragment.getClass();
        this.f = fragment;
    }
}
