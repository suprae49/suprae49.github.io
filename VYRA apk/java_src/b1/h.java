package b1;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.emoji2.text.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1043a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f1044b;

    public h(EditText editText) {
        this.f1044b = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.h
    public void a() {
        switch (this.f1043a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f1044b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    @Override // androidx.emoji2.text.h
    public final void b() {
        switch (this.f1043a) {
            case 0:
                i.a((EditText) this.f1044b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f1044b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    public h(SwitchCompat switchCompat) {
        this.f1044b = new WeakReference(switchCompat);
    }
}
