package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import u1.h0;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends ReplacementSpan {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f537g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextPaint f540j;
    public final Paint.FontMetricsInt f = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public short f538h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f539i = 1.0f;

    public b0(a0 a0Var) {
        h0.g(a0Var, "rasterizer cannot be null");
        this.f537g = a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f, int i6, int i7, int i8, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i4, i5, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f540j;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f540j = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i6, f + this.f538h, i8, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        k.a().getClass();
        float f4 = i7;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        a0 a0Var = this.f537g;
        x xVar = a0Var.f535b;
        Typeface typeface = (Typeface) xVar.f595d;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) xVar.f593b, a0Var.f534a * 2, 2, f, f4, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        a0 a0Var = this.f537g;
        a1.a aVarB = a0Var.b();
        int iA = aVarB.a(14);
        this.f539i = fAbs / (iA != 0 ? ((ByteBuffer) aVarB.f10d).getShort(iA + aVarB.f7a) : (short) 0);
        a1.a aVarB2 = a0Var.b();
        int iA2 = aVarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) aVarB2.f10d).getShort(iA2 + aVarB2.f7a);
        }
        a1.a aVarB3 = a0Var.b();
        int iA3 = aVarB3.a(12);
        short s2 = (short) ((iA3 != 0 ? ((ByteBuffer) aVarB3.f10d).getShort(iA3 + aVarB3.f7a) : (short) 0) * this.f539i);
        this.f538h = s2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}
