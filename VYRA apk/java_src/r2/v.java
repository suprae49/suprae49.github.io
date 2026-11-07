package r2;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f3587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f3588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3590d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3596k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d3.a0 f3598m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Layout.Alignment f3591e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f3592g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3593h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3594i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3595j = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f3597l = null;

    public v(CharSequence charSequence, TextPaint textPaint, int i4) {
        this.f3587a = charSequence;
        this.f3588b = textPaint;
        this.f3589c = i4;
        this.f3590d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f3587a == null) {
            this.f3587a = "";
        }
        int iMax = Math.max(0, this.f3589c);
        CharSequence charSequenceEllipsize = this.f3587a;
        int i4 = this.f;
        TextPaint textPaint = this.f3588b;
        if (i4 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f3597l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f3590d);
        this.f3590d = iMin;
        if (this.f3596k && this.f == 1) {
            this.f3591e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f3591e);
        builderObtain.setIncludePad(this.f3595j);
        builderObtain.setTextDirection(this.f3596k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f3597l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f);
        float f = this.f3592g;
        if (f != 0.0f || this.f3593h != 1.0f) {
            builderObtain.setLineSpacing(f, this.f3593h);
        }
        if (this.f > 1) {
            builderObtain.setHyphenationFrequency(this.f3594i);
        }
        d3.a0 a0Var = this.f3598m;
        if (a0Var != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) a0Var.f1680g).f1600z.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
