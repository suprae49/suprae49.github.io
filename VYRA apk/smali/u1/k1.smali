.class public abstract Lu1/k1;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final a:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lg3/b;

    .line 2
    .line 3
    const-string v1, "Notifications"

    .line 4
    .line 5
    const-string v2, "android.permission.POST_NOTIFICATIONS"

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lg3/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lg3/b;

    .line 11
    .line 12
    const-string v2, "Camera"

    .line 13
    .line 14
    const-string v3, "android.permission.CAMERA"

    .line 15
    .line 16
    invoke-direct {v1, v2, v3}, Lg3/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Lg3/b;

    .line 20
    .line 21
    const-string v3, "Contacts"

    .line 22
    .line 23
    const-string v4, "android.permission.READ_CONTACTS"

    .line 24
    .line 25
    invoke-direct {v2, v3, v4}, Lg3/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance v3, Lg3/b;

    .line 29
    .line 30
    const-string v4, "Microphone"

    .line 31
    .line 32
    const-string v5, "android.permission.RECORD_AUDIO"

    .line 33
    .line 34
    invoke-direct {v3, v4, v5}, Lg3/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lg3/b;

    .line 38
    .line 39
    const-string v5, "LocationWhenInUse"

    .line 40
    .line 41
    const-string v6, "android.permission.ACCESS_FINE_LOCATION"

    .line 42
    .line 43
    invoke-direct {v4, v5, v6}, Lg3/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance v5, Lg3/b;

    .line 47
    .line 48
    const-string v6, "LocationAlways"

    .line 49
    .line 50
    const-string v7, "android.permission.ACCESS_BACKGROUND_LOCATION"

    .line 51
    .line 52
    invoke-direct {v5, v6, v7}, Lg3/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    filled-new-array/range {v0 .. v5}, [Lg3/b;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 60
    .line 61
    const/4 v2, 0x6

    .line 62
    invoke-static {v2}, Lh3/p;->o0(I)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    invoke-direct {v1, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 67
    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    :goto_0
    if-ge v3, v2, :cond_0

    .line 71
    .line 72
    aget-object v4, v0, v3

    .line 73
    .line 74
    iget-object v5, v4, Lg3/b;->f:Ljava/lang/Object;

    .line 75
    .line 76
    iget-object v4, v4, Lg3/b;->g:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    add-int/lit8 v3, v3, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    sput-object v1, Lu1/k1;->a:Ljava/util/LinkedHashMap;

    .line 85
    .line 86
    return-void
.end method

.method public static final a(Lco/median/android/MainActivity;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "android.permission.POST_NOTIFICATIONS"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lr3/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v1, 0x21

    .line 12
    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string v0, "android.permission.ACCESS_BACKGROUND_LOCATION"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lr3/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 25
    .line 26
    const/16 v1, 0x1d

    .line 27
    .line 28
    if-ge v0, v1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-static {p0, p1}, Lc0/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_2

    .line 36
    .line 37
    :goto_0
    const-string p0, "granted"

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_2
    const-string p0, "denied"

    .line 41
    .line 42
    return-object p0
.end method
