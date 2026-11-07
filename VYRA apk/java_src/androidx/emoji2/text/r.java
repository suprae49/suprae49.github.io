package androidx.emoji2.text;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements q {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f570g;

    public /* synthetic */ r(String str, int i4) {
        this.f = i4;
        this.f570g = str;
    }

    @Override // androidx.emoji2.text.q
    public boolean c(CharSequence charSequence, int i4, int i5, a0 a0Var) {
        if (!TextUtils.equals(charSequence.subSequence(i4, i5), this.f570g)) {
            return true;
        }
        a0Var.f536c = (a0Var.f536c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f) {
            case 1:
                return "<" + this.f570g + '>';
            default:
                return super.toString();
        }
    }

    @Override // androidx.emoji2.text.q
    public Object a() {
        return this;
    }
}
