package k;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public class c0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f2495d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2496a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f2497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2498c;

    public c0(EditText editText) {
        this.f2497b = editText;
        this.f2498c = new a3.h0(editText);
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((androidx.emoji2.text.p) ((a3.h0) this.f2498c).f84g).getClass();
        if (keyListener instanceof b1.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new b1.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i4) {
        switch (this.f2496a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f2497b;
                androidx.emoji2.text.t tVarS = androidx.emoji2.text.t.s(i4, 0, absSeekBar.getContext(), attributeSet, f2495d);
                Drawable drawableJ = tVarS.j(0);
                if (drawableJ != null) {
                    if (drawableJ instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableJ;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i5 = 0; i5 < numberOfFrames; i5++) {
                            Drawable drawableE = e(animationDrawable.getFrame(i5), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i5));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableJ = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableJ);
                }
                Drawable drawableJ2 = tVarS.j(1);
                if (drawableJ2 != null) {
                    absSeekBar.setProgressDrawable(e(drawableJ2, false));
                }
                tVarS.v();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f2497b).getContext().obtainStyledAttributes(attributeSet, d.a.f1638i, i4, 0);
                try {
                    boolean z4 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z4 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    d(z4);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public b1.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        a3.h0 h0Var = (a3.h0) this.f2498c;
        if (inputConnection == null) {
            h0Var.getClass();
            inputConnection = null;
        } else {
            androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) h0Var.f84g;
            pVar.getClass();
            if (!(inputConnection instanceof b1.b)) {
                inputConnection = new b1.b(editorInfo, inputConnection, (EditText) pVar.f568g);
            }
        }
        return (b1.b) inputConnection;
    }

    public void d(boolean z4) {
        b1.i iVar = (b1.i) ((androidx.emoji2.text.p) ((a3.h0) this.f2498c).f84g).f569h;
        if (iVar.f1046h != z4) {
            if (iVar.f1045g != null) {
                androidx.emoji2.text.k kVarA = androidx.emoji2.text.k.a();
                b1.h hVar = iVar.f1045g;
                kVarA.getClass();
                u1.h0.g(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = kVarA.f555a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    kVarA.f556b.remove(hVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            iVar.f1046h = z4;
            if (z4) {
                b1.i.a(iVar.f, androidx.emoji2.text.k.a().b());
            }
        }
    }

    public Drawable e(Drawable drawable, boolean z4) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f2498c) == null) {
                this.f2498c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z4 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i4 = 0; i4 < numberOfLayers; i4++) {
            int id = layerDrawable.getId(i4);
            drawableArr[i4] = e(layerDrawable.getDrawable(i4), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i5 = 0; i5 < numberOfLayers; i5++) {
            layerDrawable2.setId(i5, layerDrawable.getId(i5));
            layerDrawable2.setLayerGravity(i5, layerDrawable.getLayerGravity(i5));
            layerDrawable2.setLayerWidth(i5, layerDrawable.getLayerWidth(i5));
            layerDrawable2.setLayerHeight(i5, layerDrawable.getLayerHeight(i5));
            layerDrawable2.setLayerInsetLeft(i5, layerDrawable.getLayerInsetLeft(i5));
            layerDrawable2.setLayerInsetRight(i5, layerDrawable.getLayerInsetRight(i5));
            layerDrawable2.setLayerInsetTop(i5, layerDrawable.getLayerInsetTop(i5));
            layerDrawable2.setLayerInsetBottom(i5, layerDrawable.getLayerInsetBottom(i5));
            layerDrawable2.setLayerInsetStart(i5, layerDrawable.getLayerInsetStart(i5));
            layerDrawable2.setLayerInsetEnd(i5, layerDrawable.getLayerInsetEnd(i5));
        }
        return layerDrawable2;
    }

    public c0(AbsSeekBar absSeekBar) {
        this.f2497b = absSeekBar;
    }

    public /* synthetic */ c0() {
    }
}
