package e;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1996c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f1997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(d0 d0Var, Context context) {
        super(d0Var);
        this.f1997d = d0Var;
        this.f1998e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // e.a0
    public final IntentFilter e() {
        switch (this.f1996c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // e.a0
    public final int f() {
        Location location;
        boolean z4;
        long j4;
        Location lastKnownLocation;
        switch (this.f1996c) {
            case 0:
                return u.a((PowerManager) this.f1998e) ? 2 : 1;
            default:
                androidx.emoji2.text.t tVar = (androidx.emoji2.text.t) this.f1998e;
                n0 n0Var = (n0) tVar.f580d;
                LocationManager locationManager = (LocationManager) tVar.f579c;
                if (n0Var.f1951b <= System.currentTimeMillis()) {
                    Context context = (Context) tVar.f578b;
                    Location lastKnownLocation2 = null;
                    if (u1.h0.h(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e5) {
                            Log.d("TwilightManager", "Failed to get last known location", e5);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (u1.h0.h(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e6) {
                            Log.d("TwilightManager", "Failed to get last known location", e6);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z4 = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (m0.f1946d == null) {
                            m0.f1946d = new m0();
                        }
                        m0 m0Var = m0.f1946d;
                        m0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        m0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z4 = m0Var.f1949c == 1;
                        long j5 = m0Var.f1948b;
                        long j6 = m0Var.f1947a;
                        m0Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j7 = m0Var.f1948b;
                        if (j5 == -1 || j6 == -1) {
                            j4 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j6) {
                                j5 = j7;
                            } else if (jCurrentTimeMillis > j5) {
                                j5 = j6;
                            }
                            j4 = j5 + 60000;
                        }
                        n0Var.f1950a = z4;
                        n0Var.f1951b = j4;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i4 = Calendar.getInstance().get(11);
                        if (i4 < 6 || i4 >= 22) {
                            z4 = true;
                        }
                    }
                    break;
                } else {
                    z4 = n0Var.f1950a;
                }
                return z4 ? 2 : 1;
        }
    }

    @Override // e.a0
    public final void j() {
        switch (this.f1996c) {
            case 0:
                this.f1997d.o(true, true);
                break;
            default:
                this.f1997d.o(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(d0 d0Var, androidx.emoji2.text.t tVar) {
        super(d0Var);
        this.f1997d = d0Var;
        this.f1998e = tVar;
    }
}
