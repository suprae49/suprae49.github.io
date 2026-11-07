.class public final Lu1/r0;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:Lco/median/android/MainActivity;

.field public b:Lu1/y;

.field public final c:Lb/g;

.field public final d:Lb/g;


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/r0;->a:Lco/median/android/MainActivity;

    .line 5
    .line 6
    new-instance v0, Landroidx/fragment/app/r0;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, v1}, Landroidx/fragment/app/r0;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lu1/p0;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, v2}, Lu1/p0;-><init>(Lu1/r0;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Landroidx/activity/q;->s(Lc/a;Lb/b;)Lb/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lb/g;

    .line 23
    .line 24
    iput-object v0, p0, Lu1/r0;->c:Lb/g;

    .line 25
    .line 26
    new-instance v0, Landroidx/fragment/app/r0;

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    invoke-direct {v0, v1}, Landroidx/fragment/app/r0;-><init>(I)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Lu1/p0;

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    invoke-direct {v1, p0, v2}, Lu1/p0;-><init>(Lu1/r0;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0, v1}, Landroidx/activity/q;->s(Lc/a;Lb/b;)Lb/c;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lb/g;

    .line 43
    .line 44
    iput-object p1, p0, Lu1/r0;->d:Lb/g;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lu1/r0;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lc0/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const-string v3, "android.permission.ACCESS_COARSE_LOCATION"

    .line 10
    .line 11
    invoke-static {v0, v3}, Lc0/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    new-instance v1, Lcom/google/android/gms/location/LocationRequest$Builder;

    .line 20
    .line 21
    const/16 v2, 0x64

    .line 22
    .line 23
    const-wide/16 v3, 0x3e8

    .line 24
    .line 25
    invoke-direct {v1, v2, v3, v4}, Lcom/google/android/gms/location/LocationRequest$Builder;-><init>(IJ)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/google/android/gms/location/LocationRequest$Builder;->build()Lcom/google/android/gms/location/LocationRequest;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v2, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;

    .line 36
    .line 37
    invoke-direct {v2}, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v1}, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;->addLocationRequest(Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/location/LocationSettingsRequest$Builder;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lcom/google/android/gms/location/LocationServices;->getSettingsClient(Landroid/app/Activity;)Lcom/google/android/gms/location/SettingsClient;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/google/android/gms/location/LocationSettingsRequest$Builder;->build()Lcom/google/android/gms/location/LocationSettingsRequest;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-interface {v0, v1}, Lcom/google/android/gms/location/SettingsClient;->checkLocationSettings(Lcom/google/android/gms/location/LocationSettingsRequest;)Lcom/google/android/gms/tasks/Task;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v1, Lu1/q0;

    .line 66
    .line 67
    invoke-direct {v1, p0}, Lu1/q0;-><init>(Lu1/r0;)V

    .line 68
    .line 69
    .line 70
    new-instance v2, Ld3/a0;

    .line 71
    .line 72
    const/4 v3, 0x6

    .line 73
    invoke-direct {v2, v3, v1}, Ld3/a0;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 77
    .line 78
    .line 79
    new-instance v1, Lu1/p0;

    .line 80
    .line 81
    const/4 v2, 0x2

    .line 82
    invoke-direct {v1, p0, v2}, Lu1/p0;-><init>(Lu1/r0;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_0
    invoke-static {v0, v1}, Lb0/a;->b(Le/j;Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-nez v2, :cond_1

    .line 94
    .line 95
    invoke-static {v0, v3}, Lb0/a;->b(Le/j;Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_2

    .line 100
    .line 101
    :cond_1
    const v2, 0x7f1100f6

    .line 102
    .line 103
    .line 104
    const/4 v4, 0x0

    .line 105
    invoke-static {v0, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 110
    .line 111
    .line 112
    :cond_2
    iget-object v0, p0, Lu1/r0;->c:Lb/g;

    .line 113
    .line 114
    filled-new-array {v1, v3}, [Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v0, v1}, Lb/g;->a(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method
