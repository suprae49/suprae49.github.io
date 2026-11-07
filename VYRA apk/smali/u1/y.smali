.class public final synthetic Lu1/y;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lu1/a1;


# instance fields
.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/MainActivity;Ljava/lang/String;Landroidx/emoji2/text/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/y;->g:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lu1/y;->f:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lu1/y;->h:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 11
    iput-object p1, p0, Lu1/y;->g:Ljava/lang/Object;

    iput-object p2, p0, Lu1/y;->h:Ljava/lang/Object;

    iput-object p3, p0, Lu1/y;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lu1/y;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu1/e0;

    .line 4
    .line 5
    iget-object v1, p0, Lu1/y;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/webkit/GeolocationPermissions$Callback;

    .line 8
    .line 9
    iget-object v2, p0, Lu1/y;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/lang/String;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    invoke-interface {v1, v2, p1, v3}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-interface {v1, v2, v3, v3}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    iput-wide v1, v0, Lu1/e0;->f:J

    .line 29
    .line 30
    return-void
.end method

.method public c([Ljava/lang/String;[I)V
    .locals 10

    .line 1
    iget-object v0, p0, Lu1/y;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu1/e2;

    .line 4
    .line 5
    iget-object v1, p0, Lu1/y;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 8
    .line 9
    iget-object v2, p0, Lu1/y;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lu1/r;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    move v4, v3

    .line 18
    :goto_0
    array-length v5, p1

    .line 19
    if-ge v4, v5, :cond_5

    .line 20
    .line 21
    aget-object v5, p1, v4

    .line 22
    .line 23
    aget v6, p2, v4

    .line 24
    .line 25
    const-string v7, "android.permission.CAMERA"

    .line 26
    .line 27
    invoke-static {v5, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    const/4 v8, -0x1

    .line 32
    const/4 v9, 0x1

    .line 33
    if-eqz v7, :cond_2

    .line 34
    .line 35
    if-ne v6, v8, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/webkit/WebChromeClient$FileChooserParams;->isCaptureEnabled()Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_0

    .line 42
    .line 43
    iget-object p1, v0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 44
    .line 45
    const p2, 0x7f110107

    .line 46
    .line 47
    .line 48
    invoke-static {p1, p2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 53
    .line 54
    .line 55
    iget-object p1, v0, Lu1/e2;->r:Landroid/webkit/ValueCallback;

    .line 56
    .line 57
    if-eqz p1, :cond_5

    .line 58
    .line 59
    const/4 p2, 0x0

    .line 60
    invoke-interface {p1, p2}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iput-object p2, v0, Lu1/e2;->r:Landroid/webkit/ValueCallback;

    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    iput-boolean v3, v2, Lu1/r;->c:Z

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    if-nez v6, :cond_2

    .line 70
    .line 71
    iput-boolean v9, v2, Lu1/r;->c:Z

    .line 72
    .line 73
    :cond_2
    :goto_1
    const-string v7, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 74
    .line 75
    invoke-static {v5, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_4

    .line 80
    .line 81
    if-ne v6, v8, :cond_3

    .line 82
    .line 83
    iput-boolean v3, v2, Lu1/r;->d:Z

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    if-nez v6, :cond_4

    .line 87
    .line 88
    iput-boolean v9, v2, Lu1/r;->d:Z

    .line 89
    .line 90
    :cond_4
    :goto_2
    iget-object v5, v0, Lu1/e2;->q:Lb/g;

    .line 91
    .line 92
    invoke-virtual {v5, v2}, Lb/g;->a(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    add-int/lit8 v4, v4, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_5
    return-void
.end method
