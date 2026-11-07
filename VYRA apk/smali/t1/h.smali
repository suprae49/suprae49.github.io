.class public final Lt1/h;
.super Lt1/b;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    iput p2, p0, Lt1/h;->e:I

    .line 2
    .line 3
    const/4 p2, 0x2

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lt1/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 6

    .line 1
    iget v0, p0, Lt1/h;->e:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    const-string v0, "MULTI_PROFILE"

    .line 8
    .line 9
    invoke-static {v0}, Le4/a;->R(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-super {p0}, Lt1/c;->b()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    :goto_0
    return v1

    .line 21
    :pswitch_0
    invoke-super {p0}, Lt1/c;->b()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const-string v0, "MULTI_PROCESS"

    .line 29
    .line 30
    invoke-static {v0}, Le4/a;->R(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    sget-object v0, Ls1/b;->a:Ljava/util/WeakHashMap;

    .line 37
    .line 38
    sget-object v0, Lt1/i;->a:Lt1/b;

    .line 39
    .line 40
    invoke-virtual {v0}, Lt1/c;->b()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    sget-object v0, Lt1/k;->a:Lt1/n;

    .line 47
    .line 48
    invoke-interface {v0}, Lt1/n;->getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;->isMultiProcessEnabled()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    const-string v0, "This method is not supported by the current version of the framework and the current WebView APK"

    .line 58
    .line 59
    invoke-static {v0}, Landroidx/fragment/app/q;->t(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_1
    return v1

    .line 63
    :pswitch_1
    invoke-super {p0}, Lt1/c;->b()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    sget-object v0, Ls1/b;->a:Ljava/util/WeakHashMap;

    .line 71
    .line 72
    invoke-static {}, Landroid/webkit/WebView;->getCurrentWebViewPackage()Landroid/content/pm/PackageInfo;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-nez v0, :cond_5

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 80
    .line 81
    const/16 v3, 0x1c

    .line 82
    .line 83
    if-lt v2, v3, :cond_6

    .line 84
    .line 85
    invoke-static {v0}, Lc0/a;->b(Landroid/content/pm/PackageInfo;)J

    .line 86
    .line 87
    .line 88
    move-result-wide v2

    .line 89
    goto :goto_2

    .line 90
    :cond_6
    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 91
    .line 92
    int-to-long v2, v0

    .line 93
    :goto_2
    const-wide/32 v4, 0x25f34560

    .line 94
    .line 95
    .line 96
    cmp-long v0, v2, v4

    .line 97
    .line 98
    if-ltz v0, :cond_7

    .line 99
    .line 100
    const/4 v1, 0x1

    .line 101
    :cond_7
    :goto_3
    return v1

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
