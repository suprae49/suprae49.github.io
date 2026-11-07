package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    @KeepForSdk
    public static final int REMOTE = 1;
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static zzq zzk;
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();

    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();

    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();

    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();

    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    public static final VersionPolicy zza = new zzl();

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    public interface VersionPolicy {

        /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
        @KeepForSdk
        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z4);
        }

        /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
        @KeepForSdk
        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @KeepForSdk
        SelectionResult selectModule(Context context, String str, IVersions iVersions);
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e5) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e5.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0242  */
    /* JADX WARN: Code duplicated, block: B:118:0x0248  */
    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:126:0x0263 A[Catch: all -> 0x0088, TryCatch #5 {all -> 0x0088, blocks: (B:7:0x0050, B:11:0x0082, B:18:0x008e, B:21:0x0094, B:25:0x009d, B:103:0x01f7, B:104:0x0202, B:107:0x0205, B:108:0x0206, B:109:0x020e, B:110:0x020f, B:112:0x022d, B:114:0x023a, B:124:0x025a, B:125:0x0262, B:126:0x0263, B:127:0x0275, B:128:0x0276, B:129:0x02a3), top: B:149:0x0050, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0094 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #5 {all -> 0x0088, blocks: (B:7:0x0050, B:11:0x0082, B:18:0x008e, B:21:0x0094, B:25:0x009d, B:103:0x01f7, B:104:0x0202, B:107:0x0205, B:108:0x0206, B:109:0x020e, B:110:0x020f, B:112:0x022d, B:114:0x023a, B:124:0x025a, B:125:0x0262, B:126:0x0263, B:127:0x0275, B:128:0x0276, B:129:0x02a3), top: B:149:0x0050, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x009c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8 A[Catch: all -> 0x01ea, TryCatch #6 {, blocks: (B:28:0x00a2, B:30:0x00a8, B:31:0x00aa, B:99:0x01ec, B:100:0x01f4), top: B:150:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ad A[Catch: all -> 0x010b, LoadingException -> 0x010e, RemoteException -> 0x0111, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0111, LoadingException -> 0x010e, all -> 0x010b, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00cf, B:40:0x00d5, B:42:0x00dd, B:44:0x00e1, B:45:0x00ec, B:52:0x00f7, B:60:0x0127, B:62:0x012f, B:64:0x0137, B:65:0x0140, B:59:0x0114, B:68:0x0143, B:69:0x0144, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:75:0x0158, B:76:0x0159, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4 A[Catch: all -> 0x010b, LoadingException -> 0x010e, RemoteException -> 0x0111, TryCatch #8 {RemoteException -> 0x0111, LoadingException -> 0x010e, all -> 0x010b, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00cf, B:40:0x00d5, B:42:0x00dd, B:44:0x00e1, B:45:0x00ec, B:52:0x00f7, B:60:0x0127, B:62:0x012f, B:64:0x0137, B:65:0x0140, B:59:0x0114, B:68:0x0143, B:69:0x0144, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:75:0x0158, B:76:0x0159, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5 A[Catch: all -> 0x010b, LoadingException -> 0x010e, RemoteException -> 0x0111, TRY_ENTER, TryCatch #8 {RemoteException -> 0x0111, LoadingException -> 0x010e, all -> 0x010b, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00cf, B:40:0x00d5, B:42:0x00dd, B:44:0x00e1, B:45:0x00ec, B:52:0x00f7, B:60:0x0127, B:62:0x012f, B:64:0x0137, B:65:0x0140, B:59:0x0114, B:68:0x0143, B:69:0x0144, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:75:0x0158, B:76:0x0159, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x014d A[Catch: all -> 0x010b, LoadingException -> 0x010e, RemoteException -> 0x0111, TryCatch #8 {RemoteException -> 0x0111, LoadingException -> 0x010e, all -> 0x010b, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00cf, B:40:0x00d5, B:42:0x00dd, B:44:0x00e1, B:45:0x00ec, B:52:0x00f7, B:60:0x0127, B:62:0x012f, B:64:0x0137, B:65:0x0140, B:59:0x0114, B:68:0x0143, B:69:0x0144, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:75:0x0158, B:76:0x0159, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0159 A[Catch: all -> 0x010b, LoadingException -> 0x010e, RemoteException -> 0x0111, TryCatch #8 {RemoteException -> 0x0111, LoadingException -> 0x010e, all -> 0x010b, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00cf, B:40:0x00d5, B:42:0x00dd, B:44:0x00e1, B:45:0x00ec, B:52:0x00f7, B:60:0x0127, B:62:0x012f, B:64:0x0137, B:65:0x0140, B:59:0x0114, B:68:0x0143, B:69:0x0144, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:75:0x0158, B:76:0x0159, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0178 A[Catch: all -> 0x010b, LoadingException -> 0x010e, RemoteException -> 0x0111, TryCatch #8 {RemoteException -> 0x0111, LoadingException -> 0x010e, all -> 0x010b, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00cf, B:40:0x00d5, B:42:0x00dd, B:44:0x00e1, B:45:0x00ec, B:52:0x00f7, B:60:0x0127, B:62:0x012f, B:64:0x0137, B:65:0x0140, B:59:0x0114, B:68:0x0143, B:69:0x0144, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:75:0x0158, B:76:0x0159, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x017f A[Catch: all -> 0x010b, LoadingException -> 0x010e, RemoteException -> 0x0111, TryCatch #8 {RemoteException -> 0x0111, LoadingException -> 0x010e, all -> 0x010b, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00cf, B:40:0x00d5, B:42:0x00dd, B:44:0x00e1, B:45:0x00ec, B:52:0x00f7, B:60:0x0127, B:62:0x012f, B:64:0x0137, B:65:0x0140, B:59:0x0114, B:68:0x0143, B:69:0x0144, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:75:0x0158, B:76:0x0159, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0187 A[Catch: all -> 0x010b, LoadingException -> 0x010e, RemoteException -> 0x0111, TryCatch #8 {RemoteException -> 0x0111, LoadingException -> 0x010e, all -> 0x010b, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00cf, B:40:0x00d5, B:42:0x00dd, B:44:0x00e1, B:45:0x00ec, B:52:0x00f7, B:60:0x0127, B:62:0x012f, B:64:0x0137, B:65:0x0140, B:59:0x0114, B:68:0x0143, B:69:0x0144, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:75:0x0158, B:76:0x0159, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0196 A[Catch: all -> 0x010b, LoadingException -> 0x010e, RemoteException -> 0x0111, TryCatch #8 {RemoteException -> 0x0111, LoadingException -> 0x010e, all -> 0x010b, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00cf, B:40:0x00d5, B:42:0x00dd, B:44:0x00e1, B:45:0x00ec, B:52:0x00f7, B:60:0x0127, B:62:0x012f, B:64:0x0137, B:65:0x0140, B:59:0x0114, B:68:0x0143, B:69:0x0144, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:75:0x0158, B:76:0x0159, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a1 A[Catch: all -> 0x010b, LoadingException -> 0x010e, RemoteException -> 0x0111, TryCatch #8 {RemoteException -> 0x0111, LoadingException -> 0x010e, all -> 0x010b, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00cf, B:40:0x00d5, B:42:0x00dd, B:44:0x00e1, B:45:0x00ec, B:52:0x00f7, B:60:0x0127, B:62:0x012f, B:64:0x0137, B:65:0x0140, B:59:0x0114, B:68:0x0143, B:69:0x0144, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:75:0x0158, B:76:0x0159, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01b1 A[Catch: all -> 0x010b, LoadingException -> 0x010e, RemoteException -> 0x0111, TryCatch #8 {RemoteException -> 0x0111, LoadingException -> 0x010e, all -> 0x010b, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00cf, B:40:0x00d5, B:42:0x00dd, B:44:0x00e1, B:45:0x00ec, B:52:0x00f7, B:60:0x0127, B:62:0x012f, B:64:0x0137, B:65:0x0140, B:59:0x0114, B:68:0x0143, B:69:0x0144, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:75:0x0158, B:76:0x0159, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01c6 A[Catch: all -> 0x010b, LoadingException -> 0x010e, RemoteException -> 0x0111, TryCatch #8 {RemoteException -> 0x0111, LoadingException -> 0x010e, all -> 0x010b, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00cf, B:40:0x00d5, B:42:0x00dd, B:44:0x00e1, B:45:0x00ec, B:52:0x00f7, B:60:0x0127, B:62:0x012f, B:64:0x0137, B:65:0x0140, B:59:0x0114, B:68:0x0143, B:69:0x0144, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:75:0x0158, B:76:0x0159, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01cf A[Catch: all -> 0x010b, LoadingException -> 0x010e, RemoteException -> 0x0111, TryCatch #8 {RemoteException -> 0x0111, LoadingException -> 0x010e, all -> 0x010b, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00cf, B:40:0x00d5, B:42:0x00dd, B:44:0x00e1, B:45:0x00ec, B:52:0x00f7, B:60:0x0127, B:62:0x012f, B:64:0x0137, B:65:0x0140, B:59:0x0114, B:68:0x0143, B:69:0x0144, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:75:0x0158, B:76:0x0159, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d8 A[Catch: all -> 0x010b, LoadingException -> 0x010e, RemoteException -> 0x0111, TryCatch #8 {RemoteException -> 0x0111, LoadingException -> 0x010e, all -> 0x010b, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00cf, B:40:0x00d5, B:42:0x00dd, B:44:0x00e1, B:45:0x00ec, B:52:0x00f7, B:60:0x0127, B:62:0x012f, B:64:0x0137, B:65:0x0140, B:59:0x0114, B:68:0x0143, B:69:0x0144, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:75:0x0158, B:76:0x0159, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01e1 A[Catch: all -> 0x010b, LoadingException -> 0x010e, RemoteException -> 0x0111, TryCatch #8 {RemoteException -> 0x0111, LoadingException -> 0x010e, all -> 0x010b, blocks: (B:27:0x00a1, B:33:0x00ad, B:35:0x00b4, B:36:0x00cf, B:40:0x00d5, B:42:0x00dd, B:44:0x00e1, B:45:0x00ec, B:52:0x00f7, B:60:0x0127, B:62:0x012f, B:64:0x0137, B:65:0x0140, B:59:0x0114, B:68:0x0143, B:69:0x0144, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:75:0x0158, B:76:0x0159, B:78:0x0178, B:80:0x017f, B:82:0x0187, B:88:0x01c0, B:90:0x01c6, B:91:0x01cf, B:92:0x01d7, B:83:0x0196, B:84:0x019e, B:86:0x01a1, B:87:0x01b1, B:93:0x01d8, B:94:0x01e0, B:95:0x01e1, B:96:0x01e9, B:102:0x01f6), top: B:152:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ec A[Catch: all -> 0x01ea, TRY_ENTER, TryCatch #6 {, blocks: (B:28:0x00a2, B:30:0x00a8, B:31:0x00aa, B:99:0x01ec, B:100:0x01f4), top: B:150:0x00a2 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:126:0x0263, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x00b4, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0159, please report this as an issue */
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static DynamiteModule load(Context context, VersionPolicy versionPolicy, String str) throws Throwable {
        long j4;
        DynamiteModule dynamiteModuleZzc;
        int i4;
        Boolean bool;
        zzq zzqVarZzg;
        int iZze;
        IObjectWrapper iObjectWrapperZzh;
        Object objUnwrap;
        DynamiteModule dynamiteModule;
        zzn zznVar;
        zzr zzrVar;
        zzn zznVar2;
        boolean z4;
        IObjectWrapper iObjectWrapperZze;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        zzp zzpVar = null;
        if (applicationContext == null) {
            throw new LoadingException("null application Context", null);
        }
        ThreadLocal threadLocal = zzg;
        zzn zznVar3 = (zzn) threadLocal.get();
        zzn zznVar4 = new zzn(null);
        threadLocal.set(zznVar4);
        ThreadLocal threadLocal2 = zzh;
        Long l4 = (Long) threadLocal2.get();
        long jLongValue = l4.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, zzi);
            int i5 = selectionResultSelectModule.localVersion;
            j4 = jLongValue;
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + i5 + " and remote module " + str + ":" + selectionResultSelectModule.remoteVersion);
                int i6 = selectionResultSelectModule.selection;
                if (i6 != 0) {
                    if (i6 != -1) {
                        if (i6 == 1 || selectionResultSelectModule.remoteVersion != 0) {
                            if (i6 == -1) {
                                dynamiteModuleZzc = zzc(applicationContext, str);
                            } else {
                                if (i6 == 1) {
                                    throw new LoadingException("VersionPolicy returned invalid code:" + i6, null);
                                }
                                try {
                                    i4 = selectionResultSelectModule.remoteVersion;
                                    try {
                                        synchronized (DynamiteModule.class) {
                                            if (zzf(context)) {
                                                throw new LoadingException("Remote loading disabled", null);
                                            }
                                            bool = zzb;
                                        }
                                        if (bool != null) {
                                            throw new LoadingException("Failed to determine which loading route to use.", null);
                                        }
                                        if (bool.booleanValue()) {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                            synchronized (DynamiteModule.class) {
                                                zzrVar = zzl;
                                            }
                                            if (zzrVar != null) {
                                                throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                            }
                                            zznVar2 = (zzn) threadLocal.get();
                                            if (zznVar2 != null || zznVar2.zza == null) {
                                                throw new LoadingException("No result cursor", null);
                                            }
                                            Context applicationContext2 = context.getApplicationContext();
                                            Cursor cursor2 = zznVar2.zza;
                                            ObjectWrapper.wrap(null);
                                            synchronized (DynamiteModule.class) {
                                                z4 = zze >= 2;
                                            }
                                            if (z4) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                iObjectWrapperZze = zzrVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i4, ObjectWrapper.wrap(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                iObjectWrapperZze = zzrVar.zze(ObjectWrapper.wrap(applicationContext2), str, i4, ObjectWrapper.wrap(cursor2));
                                            }
                                            Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapperZze);
                                            if (context2 == null) {
                                                throw new LoadingException("Failed to get module context", zzpVar);
                                            }
                                            dynamiteModule = new DynamiteModule(context2);
                                        } else {
                                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                            zzqVarZzg = zzg(context);
                                            if (zzqVarZzg != null) {
                                                throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                            }
                                            iZze = zzqVarZzg.zze();
                                            if (iZze >= 3) {
                                                zznVar = (zzn) threadLocal.get();
                                                if (zznVar != null) {
                                                    throw new LoadingException("No cached result cursor holder", null);
                                                }
                                                iObjectWrapperZzh = zzqVarZzg.zzi(ObjectWrapper.wrap(context), str, i4, ObjectWrapper.wrap(zznVar.zza));
                                            } else if (iZze == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                iObjectWrapperZzh = zzqVarZzg.zzj(ObjectWrapper.wrap(context), str, i4);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                iObjectWrapperZzh = zzqVarZzg.zzh(ObjectWrapper.wrap(context), str, i4);
                                            }
                                            objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                            if (objUnwrap != null) {
                                                throw new LoadingException("Failed to load remote module.", null);
                                            }
                                            dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                        }
                                        dynamiteModuleZzc = dynamiteModule;
                                    } catch (RemoteException e5) {
                                        throw new LoadingException("Failed to load remote module.", e5, null);
                                    } catch (LoadingException e6) {
                                        throw e6;
                                    } catch (Throwable th) {
                                        CrashUtils.addDynamiteErrorToDropBox(context, th);
                                        throw new LoadingException("Failed to load remote module.", th, null);
                                    }
                                } catch (LoadingException e7) {
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e7.getMessage());
                                    int i7 = selectionResultSelectModule.localVersion;
                                    if (i7 == 0 || versionPolicy.selectModule(context, str, new zzo(i7, 0)).selection != -1) {
                                        throw new LoadingException("Remote load failed. No local fallback found.", e7, null);
                                    }
                                    dynamiteModuleZzc = zzc(applicationContext, str);
                                }
                            }
                            if (j4 == 0) {
                                zzh.remove();
                            } else {
                                zzh.set(l4);
                            }
                            cursor = zznVar4.zza;
                            if (cursor != null) {
                                cursor.close();
                            }
                            zzg.set(zznVar3);
                            return dynamiteModuleZzc;
                        }
                    } else if (selectionResultSelectModule.localVersion != 0) {
                        i6 = -1;
                        if (i6 == 1) {
                        }
                        if (i6 == -1) {
                            dynamiteModuleZzc = zzc(applicationContext, str);
                        } else {
                            if (i6 == 1) {
                                throw new LoadingException("VersionPolicy returned invalid code:" + i6, null);
                            }
                            i4 = selectionResultSelectModule.remoteVersion;
                            synchronized (DynamiteModule.class) {
                                if (zzf(context)) {
                                    throw new LoadingException("Remote loading disabled", null);
                                }
                                bool = zzb;
                                if (bool != null) {
                                    throw new LoadingException("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                    synchronized (DynamiteModule.class) {
                                        zzrVar = zzl;
                                        if (zzrVar != null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        zznVar2 = (zzn) threadLocal.get();
                                        if (zznVar2 != null) {
                                        }
                                        throw new LoadingException("No result cursor", null);
                                    }
                                }
                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i4);
                                zzqVarZzg = zzg(context);
                                if (zzqVarZzg != null) {
                                    throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                }
                                iZze = zzqVarZzg.zze();
                                if (iZze >= 3) {
                                    zznVar = (zzn) threadLocal.get();
                                    if (zznVar != null) {
                                        throw new LoadingException("No cached result cursor holder", null);
                                    }
                                    iObjectWrapperZzh = zzqVarZzg.zzi(ObjectWrapper.wrap(context), str, i4, ObjectWrapper.wrap(zznVar.zza));
                                } else if (iZze == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    iObjectWrapperZzh = zzqVarZzg.zzj(ObjectWrapper.wrap(context), str, i4);
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    iObjectWrapperZzh = zzqVarZzg.zzh(ObjectWrapper.wrap(context), str, i4);
                                }
                                objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                if (objUnwrap != null) {
                                    throw new LoadingException("Failed to load remote module.", null);
                                }
                                dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                dynamiteModuleZzc = dynamiteModule;
                            }
                        }
                        if (j4 == 0) {
                            zzh.remove();
                        } else {
                            zzh.set(l4);
                        }
                        cursor = zznVar4.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        zzg.set(zznVar3);
                        return dynamiteModuleZzc;
                    }
                }
                throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectionResultSelectModule.localVersion + " and remote version is " + selectionResultSelectModule.remoteVersion + ".", null);
            } catch (Throwable th2) {
                th = th2;
                if (j4 == 0) {
                    zzh.remove();
                } else {
                    zzh.set(l4);
                }
                Cursor cursor3 = zznVar4.zza;
                if (cursor3 != null) {
                    cursor3.close();
                }
                zzg.set(zznVar3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j4 = jLongValue;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:138:0x01cc */
    /* JADX WARN: Code duplicated, block: B:106:0x017d A[Catch: all -> 0x00ec, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00ec, blocks: (B:3:0x0002, B:64:0x00e1, B:66:0x00e7, B:74:0x010d, B:102:0x016f, B:106:0x017d, B:124:0x01d2, B:125:0x01d5, B:119:0x01c9, B:72:0x00f2, B:127:0x01d7, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00de, B:21:0x0049, B:45:0x00a1, B:48:0x00a4, B:55:0x00bc, B:63:0x00e0, B:61:0x00c2), top: B:134:0x0002, inners: #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b0 A[Catch: all -> 0x0036, TryCatch #10 {all -> 0x0036, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b9, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004f, B:27:0x0053, B:31:0x005d, B:33:0x0065, B:36:0x006c, B:43:0x0098, B:44:0x00a0, B:39:0x0073, B:41:0x0079, B:42:0x008a, B:47:0x00a3, B:50:0x00a6, B:51:0x00b0, B:17:0x003e), top: B:141:0x0026, inners: #12 }] */
    public static int zza(Context context, String str, boolean z4) {
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                Cursor cursor2 = null;
                int iZzf = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        zzd(classLoader);
                                    } catch (LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!zzf(context)) {
                                        return 0;
                                    }
                                    if (zzd) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iZzb = zzb(context, str, z4, true);
                                                String str2 = zzc;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderZza = zzb.zza();
                                                    if (classLoaderZza == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            a.b();
                                                            String str3 = zzc;
                                                            Preconditions.checkNotNull(str3);
                                                            classLoaderZza = a.a(str3, ClassLoader.getSystemClassLoader());
                                                        } else {
                                                            String str4 = zzc;
                                                            Preconditions.checkNotNull(str4);
                                                            classLoaderZza = new zzc(str4, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    zzd(classLoaderZza);
                                                    declaredField.set(null, classLoaderZza);
                                                    zzb = bool2;
                                                    return iZzb;
                                                }
                                                return iZzb;
                                            } catch (LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                zzb = bool;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e5) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e5.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzb(context, str, z4, false);
                    } catch (LoadingException e6) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e6.getMessage());
                        return 0;
                    }
                }
                zzq zzqVarZzg = zzg(context);
                try {
                    if (zzqVarZzg != null) {
                        try {
                            int iZze = zzqVarZzg.zze();
                            if (iZze >= 3) {
                                zzn zznVar = (zzn) zzg.get();
                                if (zznVar == null || (cursor = zznVar.zza) == null) {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzqVarZzg.zzk(ObjectWrapper.wrap(context), str, z4, ((Long) zzh.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i4 = cursor3.getInt(0);
                                                cursor2 = (i4 <= 0 || !zze(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iZzf = i4;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e7) {
                                            remoteException = e7;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            cursor2 = cursor3;
                                            if (cursor2 == null) {
                                                throw th;
                                            }
                                            cursor2.close();
                                            throw th;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iZzf = cursor.getInt(0);
                                }
                            } else if (iZze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iZzf = zzqVarZzg.zzg(ObjectWrapper.wrap(context), str, z4);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iZzf = zzqVarZzg.zzf(ObjectWrapper.wrap(context), str, z4);
                            }
                        } catch (RemoteException e8) {
                            remoteException = e8;
                        }
                    }
                    return iZzf;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            CrashUtils.addDynamiteErrorToDropBox(context, th5);
            throw th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    private static int zzb(Context context, String str, boolean z4, boolean z5) throws Throwable {
        Throwable th;
        Exception exc;
        ?? r4 = 0;
        ?? r5 = 0;
        ?? r6 = 0;
        ?? r7 = 0;
        try {
            try {
                boolean z6 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z4 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) zzh.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z7 = false;
                            int i4 = cursorQuery.getInt(0);
                            if (i4 > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        zzc = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            zze = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (cursorQuery.getInt(columnIndex2) == 0) {
                                                z6 = false;
                                            }
                                            zzd = z6;
                                            z7 = z6;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (zze(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z5 && z7) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", r6 == true ? 1 : 0);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i4;
                        }
                    } catch (Exception e5) {
                        exc = e5;
                        if (exc instanceof LoadingException) {
                            throw exc;
                        }
                        throw new LoadingException("V2 version check failed: " + exc.getMessage(), exc, r5 == true ? 1 : 0);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", r7 == true ? 1 : 0);
            } catch (Throwable th3) {
                th = th3;
                r4 = context;
                if (r4 != 0) {
                    throw th;
                }
                r4.close();
                throw th;
            }
        } catch (Exception e6) {
            exc = e6;
        } catch (Throwable th4) {
            th = th4;
            if (r4 != 0) {
                throw th;
            }
            r4.close();
            throw th;
        }
    }

    private static DynamiteModule zzc(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        zzp zzpVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzr(iBinder);
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException e5) {
            e = e5;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (IllegalAccessException e6) {
            e = e6;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (InstantiationException e7) {
            e = e7;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (NoSuchMethodException e8) {
            e = e8;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (InvocationTargetException e9) {
            e = e9;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean z4 = false;
        if (zzf == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z4 = true;
            }
            zzf = Boolean.valueOf(z4);
            if (z4 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zzd = true;
            }
        }
        if (!z4) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z4;
    }

    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e5) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e5.getMessage());
            }
            return null;
        }
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @KeepForSdk
    public IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e5) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e5, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }
}
