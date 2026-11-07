package d3;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1708e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(s sVar, int i4) {
        super(sVar);
        this.f1708e = i4;
    }

    @Override // d3.t
    public void q() {
        switch (this.f1708e) {
            case 0:
                s sVar = this.f1754b;
                sVar.f1746t = null;
                CheckableImageButton checkableImageButton = sVar.f1739l;
                checkableImageButton.setOnLongClickListener(null);
                e4.a.e0(checkableImageButton, null);
                break;
        }
    }
}
