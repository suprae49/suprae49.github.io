package t1;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.widget.PopupWindow;
import androidx.fragment.app.q;
import co.median.android.MainActivity;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p0.y1;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AudioFocusRequest f3716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static AudioFocusRequest f3717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static u1.f f3718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static u1.g f3719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f3720e = 0;
    public static final /* synthetic */ int f = 0;

    public static final void a(Activity activity) {
        try {
            final z1.g gVar = x1.a.u(activity).f4672j1;
            if (gVar == null) {
                return;
            }
            long j4 = gVar.f4877c;
            if (gVar.f4880g) {
                return;
            }
            View viewFindViewById = activity.findViewById(R.id.content);
            viewFindViewById.getClass();
            final ViewGroup viewGroup = (ViewGroup) viewFindViewById;
            int height = 0;
            View viewInflate = activity.getLayoutInflater().inflate(co.median.android.eeqadjy.R.layout.median_widget_layout, viewGroup, false);
            final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
            popupWindow.setAnimationStyle(co.median.android.eeqadjy.R.style.WidgetAnimation_no_bottom_bar);
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: x1.j
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    gVar.f4880g = false;
                }
            });
            viewInflate.setOnClickListener(new d3.a(3, popupWindow));
            final r3.j jVar = new r3.j();
            jVar.f = 20;
            WindowInsets rootWindowInsets = viewGroup.getRootWindowInsets();
            y1 y1VarH = rootWindowInsets != null ? y1.h(null, rootWindowInsets) : null;
            if (y1VarH != null) {
                f0.c cVarH = y1VarH.f3268a.h(519);
                cVarH.getClass();
                int i4 = cVarH.f2070d;
                View viewFindViewWithTag = viewGroup.findViewWithTag("bottom_navigation");
                if (viewFindViewWithTag != null) {
                    View view = viewFindViewWithTag.getVisibility() == 0 ? viewFindViewWithTag : null;
                    if (view != null) {
                        height = view.getHeight();
                    }
                }
                jVar.f = i4 + height + jVar.f;
                if (height > 0) {
                    popupWindow.setAnimationStyle(co.median.android.eeqadjy.R.style.WidgetAnimation_with_bottom_bar);
                }
            }
            activity.runOnUiThread(new Runnable() { // from class: x1.k
                @Override // java.lang.Runnable
                public final void run() {
                    popupWindow.showAtLocation(viewGroup, 81, 0, jVar.f);
                    gVar.f4880g = true;
                }
            });
            if (j4 > -1) {
                new Handler(Looper.getMainLooper()).postDelayed(new androidx.activity.k(18, popupWindow), j4);
            }
        } catch (Exception e5) {
            Log.e("MedianWidgetHelper", "showWidget: ", e5);
        }
    }

    public static void b(MainActivity mainActivity) {
        AudioManager audioManager = (AudioManager) mainActivity.getSystemService("audio");
        if (audioManager == null) {
            Log.w("t1.l", "AudioManager is null. Aborting abandonFocusRequest()");
        }
        AudioFocusRequest audioFocusRequest = f3716a;
        if (audioFocusRequest != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
            f3716a = null;
        }
        AudioFocusRequest audioFocusRequest2 = f3717b;
        if (audioFocusRequest2 != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest2);
            f3717b = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0052  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public static boolean c(int i4, Rect rect, Rect rect2, Rect rect3) {
        int iJ;
        int i5;
        int i6;
        boolean zD = d(i4, rect, rect2);
        if (d(i4, rect, rect3) || !zD) {
            return false;
        }
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        q.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i4 != 17 && i4 != 66) {
                            iJ = j(i4, rect, rect2);
                            if (i4 != 17) {
                                i5 = rect.left;
                                i6 = rect3.left;
                            } else if (i4 != 33) {
                                i5 = rect.top;
                                i6 = rect3.top;
                            } else if (i4 != 66) {
                                i5 = rect3.right;
                                i6 = rect.right;
                            } else {
                                if (i4 == 130) {
                                    q.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    return false;
                                }
                                i5 = rect3.bottom;
                                i6 = rect.bottom;
                            }
                            if (iJ < Math.max(1, i5 - i6)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i4 != 17) {
                        iJ = j(i4, rect, rect2);
                        if (i4 != 17) {
                            i5 = rect.left;
                            i6 = rect3.left;
                        } else if (i4 != 33) {
                            i5 = rect.top;
                            i6 = rect3.top;
                        } else if (i4 != 66) {
                            i5 = rect3.right;
                            i6 = rect.right;
                        } else {
                            if (i4 == 130) {
                                q.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                return false;
                            }
                            i5 = rect3.bottom;
                            i6 = rect.bottom;
                        }
                        if (iJ < Math.max(1, i5 - i6)) {
                            return false;
                        }
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i4 != 17) {
                    iJ = j(i4, rect, rect2);
                    if (i4 != 17) {
                        i5 = rect.left;
                        i6 = rect3.left;
                    } else if (i4 != 33) {
                        i5 = rect.top;
                        i6 = rect3.top;
                    } else if (i4 != 66) {
                        i5 = rect3.right;
                        i6 = rect.right;
                    } else {
                        if (i4 == 130) {
                            q.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        i5 = rect3.bottom;
                        i6 = rect.bottom;
                    }
                    if (iJ < Math.max(1, i5 - i6)) {
                        return false;
                    }
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i4 != 17) {
                iJ = j(i4, rect, rect2);
                if (i4 != 17) {
                    i5 = rect.left;
                    i6 = rect3.left;
                } else if (i4 != 33) {
                    i5 = rect.top;
                    i6 = rect3.top;
                } else if (i4 != 66) {
                    i5 = rect3.right;
                    i6 = rect.right;
                } else {
                    if (i4 == 130) {
                        q.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    i5 = rect3.bottom;
                    i6 = rect.bottom;
                }
                if (iJ < Math.max(1, i5 - i6)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean d(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        q.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void e(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e5) {
            x1.f.a().d("t1.l", e5.toString(), e5);
        }
    }

    public static void f(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e5) {
            x1.f.a().d("co.median.median_core.IOUtils", e5.toString(), e5);
        }
    }

    public static void g(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i4 = inputStream.read(bArr);
            if (i4 <= 0) {
                return;
            } else {
                byteArrayOutputStream.write(bArr, 0, i4);
            }
        }
    }

    public static InvocationHandler h() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
                throw new RuntimeException(e5);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static boolean i(int i4, Rect rect, Rect rect2) {
        if (i4 == 17) {
            int i5 = rect.right;
            int i6 = rect2.right;
            return (i5 > i6 || rect.left >= i6) && rect.left > rect2.left;
        }
        if (i4 == 33) {
            int i7 = rect.bottom;
            int i8 = rect2.bottom;
            return (i7 > i8 || rect.top >= i8) && rect.top > rect2.top;
        }
        if (i4 == 66) {
            int i9 = rect.left;
            int i10 = rect2.left;
            return (i9 < i10 || rect.right <= i10) && rect.right < rect2.right;
        }
        if (i4 != 130) {
            q.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            return false;
        }
        int i11 = rect.top;
        int i12 = rect2.top;
        return (i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom;
    }

    public static int j(int i4, Rect rect, Rect rect2) {
        int i5;
        int i6;
        if (i4 == 17) {
            i5 = rect.left;
            i6 = rect2.right;
        } else if (i4 == 33) {
            i5 = rect.top;
            i6 = rect2.bottom;
        } else if (i4 == 66) {
            i5 = rect2.left;
            i6 = rect.right;
        } else {
            if (i4 != 130) {
                q.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i5 = rect2.top;
            i6 = rect.bottom;
        }
        return Math.max(0, i5 - i6);
    }

    public static int k(int i4, Rect rect, Rect rect2) {
        if (i4 != 17) {
            if (i4 != 33) {
                if (i4 != 66) {
                    if (i4 != 130) {
                        q.q("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static void n(MainActivity mainActivity, AudioManager audioManager) {
        if (!audioManager.isBluetoothScoAvailableOffCall() || audioManager.isBluetoothScoOn()) {
            return;
        }
        Log.d("t1.l", "Resetting audio to bluetooth device");
        AudioManager audioManager2 = (AudioManager) mainActivity.getSystemService("audio");
        audioManager2.setMode(3);
        audioManager2.startBluetoothSco();
        audioManager2.setBluetoothScoOn(true);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [u1.g] */
    public static void o(final MainActivity mainActivity) {
        final Object obj = new Object();
        final AudioManager audioManager = (AudioManager) mainActivity.getSystemService("audio");
        if (audioManager == null) {
            Log.w("t1.l", "AudioManager is null. Aborting requestAudioFocus()");
        }
        f3719d = new AudioManager.OnAudioFocusChangeListener() { // from class: u1.g
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i4) {
                Object obj2 = obj;
                MainActivity mainActivity2 = mainActivity;
                AudioManager audioManager2 = audioManager;
                if (i4 == -3 || i4 == -2 || i4 == -1) {
                    synchronized (obj2) {
                        Log.d("t1.l", "AudioFocus LOST. Try to reconnect bluetooth device");
                        t1.l.n(mainActivity2, audioManager2);
                    }
                } else {
                    if (i4 != 1) {
                        return;
                    }
                    synchronized (obj2) {
                        Log.d("t1.l", "AudioFocus GAINED. Try to connect bluetooth device");
                        t1.l.n(mainActivity2, audioManager2);
                    }
                }
            }
        };
        b(mainActivity);
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(f3719d).build();
        f3717b = audioFocusRequestBuild;
        int iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequestBuild);
        synchronized (obj) {
            if (iRequestAudioFocus == 1) {
                try {
                    Log.d("t1.l", "AudioFocus REQUEST GRANTED");
                    n(mainActivity, audioManager);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static TypedValue p(Resources.Theme theme, int i4) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i4, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean q(Resources.Theme theme, int i4, boolean z4) {
        TypedValue typedValueP = p(theme, i4);
        if (typedValueP == null || typedValueP.type != 18) {
            return z4;
        }
        return typedValueP.data != 0;
    }

    public static TypedValue r(Context context, int i4, String str) {
        TypedValue typedValueP = p(context.getTheme(), i4);
        if (typedValueP != null) {
            return typedValueP;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i4)));
    }

    public static TypedValue s(View view, int i4) {
        return r(view.getContext(), i4, view.getClass().getCanonicalName());
    }

    public abstract void l(int i4);

    public abstract void m(Typeface typeface, boolean z4);
}
