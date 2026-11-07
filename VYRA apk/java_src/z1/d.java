package z1;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4867e;
    public final boolean f;

    public d(JSONObject jSONObject) {
        this(jSONObject.optBoolean("usesGeolocation", false), jSONObject.optBoolean("androidDownloadToPublicStorage", false), jSONObject.optBoolean("androidExtDirLegacyEnabled", false), jSONObject.optBoolean("enableWebRTCBluetoothAudio", false), jSONObject.optBoolean("enableWebRTCCamera", false), jSONObject.optBoolean("enableWebRTCMicrophone", false));
    }

    public final boolean a() {
        return this.f4866d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f4863a == dVar.f4863a && this.f4864b == dVar.f4864b && this.f4865c == dVar.f4865c && this.f4866d == dVar.f4866d && this.f4867e == dVar.f4867e && this.f == dVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((Boolean.hashCode(this.f4867e) + ((Boolean.hashCode(this.f4866d) + ((Boolean.hashCode(this.f4865c) + ((Boolean.hashCode(this.f4864b) + (Boolean.hashCode(this.f4863a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PermissionsConfig(usesGeolocation=" + this.f4863a + ", downloadToPublicStorage=" + this.f4864b + ", extDirLegacyEnabled=" + this.f4865c + ", enableWebRTCBluetoothAudio=" + this.f4866d + ", enableWebRTCCamera=" + this.f4867e + ", enableWebRTCMicrophone=" + this.f + ")";
    }

    public d() {
        this(false, false, false, false, false, false);
    }

    public d(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.f4863a = z4;
        this.f4864b = z5;
        this.f4865c = z6;
        this.f4866d = z7;
        this.f4867e = z8;
        this.f = z9;
    }
}
