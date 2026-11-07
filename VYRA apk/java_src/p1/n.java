package p1;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static <T, V> ObjectAnimator a(T t4, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t4, property, (TypeConverter) null, path);
    }
}
