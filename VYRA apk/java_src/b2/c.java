package b2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.q;
import java.util.ArrayList;
import p.k;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f1052a = new k(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f1053b = new k(0);

    public static c a(Context context, int i4) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i4);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return b(arrayList);
        } catch (Exception e5) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i4), e5);
            return null;
        }
    }

    public static c b(ArrayList arrayList) {
        c cVar = new c();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Animator animator = (Animator) arrayList.get(i4);
            if (!(animator instanceof ObjectAnimator)) {
                q.p(animator, "Animator must be an ObjectAnimator: ");
                return null;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            cVar.f1053b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            d dVar = new d();
            dVar.f1057d = 0;
            dVar.f1058e = 1;
            dVar.f1054a = startDelay;
            dVar.f1055b = duration;
            dVar.f1056c = interpolator;
            dVar.f1057d = objectAnimator.getRepeatCount();
            dVar.f1058e = objectAnimator.getRepeatMode();
            cVar.f1052a.put(propertyName, dVar);
        }
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f1052a.equals(((c) obj).f1052a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1052a.hashCode();
    }

    public final String toString() {
        return "\n" + c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f1052a + "}\n";
    }
}
