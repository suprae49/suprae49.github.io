package u1;

import android.app.Activity;
import android.widget.Toast;
import co.median.android.MainActivity;
import co.median.android.eeqadjy.R;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f4071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f4072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b.g f4073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b.g f4074d;

    public r0(MainActivity mainActivity) {
        this.f4071a = mainActivity;
        this.f4073c = (b.g) mainActivity.s(new androidx.fragment.app.r0(1), new p0(this, 0));
        this.f4074d = (b.g) mainActivity.s(new androidx.fragment.app.r0(4), new p0(this, 1));
    }

    public final void a() {
        MainActivity mainActivity = this.f4071a;
        int iCheckSelfPermission = c0.c.checkSelfPermission(mainActivity, "android.permission.ACCESS_FINE_LOCATION");
        int iCheckSelfPermission2 = c0.c.checkSelfPermission(mainActivity, "android.permission.ACCESS_COARSE_LOCATION");
        if (iCheckSelfPermission != 0 || iCheckSelfPermission2 != 0) {
            if (b0.a.b(mainActivity, "android.permission.ACCESS_FINE_LOCATION") || b0.a.b(mainActivity, "android.permission.ACCESS_COARSE_LOCATION")) {
                Toast.makeText(mainActivity, R.string.request_permission_explanation_geolocation, 0).show();
            }
            this.f4073c.a(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
            return;
        }
        LocationRequest locationRequestBuild = new LocationRequest.Builder(100, 1000L).build();
        locationRequestBuild.getClass();
        LocationSettingsRequest.Builder builderAddLocationRequest = new LocationSettingsRequest.Builder().addLocationRequest(locationRequestBuild);
        builderAddLocationRequest.getClass();
        SettingsClient settingsClient = LocationServices.getSettingsClient((Activity) mainActivity);
        settingsClient.getClass();
        Task<LocationSettingsResponse> taskCheckLocationSettings = settingsClient.checkLocationSettings(builderAddLocationRequest.build());
        taskCheckLocationSettings.getClass();
        taskCheckLocationSettings.addOnSuccessListener(new d3.a0(6, new q0(this)));
        taskCheckLocationSettings.addOnFailureListener(new p0(this, 2));
    }
}
