.class public final Lu1/x1;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:Lco/median/android/MainActivity;

.field public final b:Z

.field public final c:Lx1/i;

.field public d:Lu1/e2;

.field public e:Z


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/x1;->a:Lco/median/android/MainActivity;

    .line 5
    .line 6
    iput-boolean p2, p0, Lu1/x1;->b:Z

    .line 7
    .line 8
    iget-object p1, p1, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lu1/x1;->c:Lx1/i;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;ZZ)V
    .locals 2

    .line 1
    if-eqz p1, :cond_8

    .line 2
    .line 3
    invoke-static {p1}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    iget-boolean v0, p0, Lu1/x1;->b:Z

    .line 12
    .line 13
    if-eqz v0, :cond_7

    .line 14
    .line 15
    if-eqz p2, :cond_7

    .line 16
    .line 17
    iget-object p2, p0, Lu1/x1;->a:Lco/median/android/MainActivity;

    .line 18
    .line 19
    iget-object p2, p2, Lco/median/android/MainActivity;->z0:Landroidx/emoji2/text/t;

    .line 20
    .line 21
    const-string v0, "_median_url_changed"

    .line 22
    .line 23
    iget-object p2, p2, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p2, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_7

    .line 32
    .line 33
    const-string p2, "javascript:"

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    iget-object p2, p0, Lu1/x1;->c:Lx1/i;

    .line 42
    .line 43
    check-cast p2, Lu1/o0;

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Lu1/o0;->a(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    if-nez p3, :cond_3

    .line 50
    .line 51
    iget-object p2, p0, Lu1/x1;->d:Lu1/e2;

    .line 52
    .line 53
    if-eqz p2, :cond_2

    .line 54
    .line 55
    iget-object p3, p0, Lu1/x1;->c:Lx1/i;

    .line 56
    .line 57
    invoke-virtual {p2, p3, p1}, Lu1/e2;->g(Lx1/i;Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-eqz p2, :cond_3

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    const-string p1, "urlNavigation"

    .line 65
    .line 66
    invoke-static {p1}, Lr3/g;->c(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 p1, 0x0

    .line 70
    throw p1

    .line 71
    :cond_3
    invoke-static {p1}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-eqz p2, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    iget-object p2, p0, Lu1/x1;->a:Lco/median/android/MainActivity;

    .line 79
    .line 80
    const-string p3, "_median_url_changed"

    .line 81
    .line 82
    new-instance v0, Lorg/json/JSONObject;

    .line 83
    .line 84
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string v1, "url"

    .line 88
    .line 89
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget-object p2, p2, Lco/median/android/MainActivity;->z0:Landroidx/emoji2/text/t;

    .line 94
    .line 95
    if-eqz p2, :cond_8

    .line 96
    .line 97
    monitor-enter p2

    .line 98
    :try_start_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    monitor-exit p2

    .line 105
    return-void

    .line 106
    :cond_5
    :try_start_1
    iget-object v0, p2, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_6

    .line 115
    .line 116
    invoke-virtual {p2, p3, p1}, Landroidx/emoji2/text/t;->q(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :catchall_0
    move-exception p1

    .line 121
    goto :goto_1

    .line 122
    :cond_6
    iget-object v0, p2, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Ljava/util/HashMap;

    .line 125
    .line 126
    invoke-virtual {v0, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    .line 128
    .line 129
    :goto_0
    monitor-exit p2

    .line 130
    return-void

    .line 131
    :goto_1
    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 132
    throw p1

    .line 133
    :cond_7
    iget-object p2, p0, Lu1/x1;->c:Lx1/i;

    .line 134
    .line 135
    check-cast p2, Lu1/o0;

    .line 136
    .line 137
    invoke-virtual {p2, p1}, Lu1/o0;->loadUrl(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :cond_8
    :goto_2
    return-void
.end method

.method public final b(Ljava/lang/String;ZZ)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    iget-object v0, p0, Lu1/x1;->a:Lco/median/android/MainActivity;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 8
    .line 9
    iput-object v1, v0, Lco/median/android/MainActivity;->i0:Ljava/lang/String;

    .line 10
    .line 11
    const-string v2, "median_logout"

    .line 12
    .line 13
    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_2

    .line 18
    .line 19
    const-string v2, "gonative_logout"

    .line 20
    .line 21
    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lu1/x1;->a(Ljava/lang/String;ZZ)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    :goto_0
    iget-object p2, v0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 33
    .line 34
    invoke-interface {p2}, Lx1/i;->stopLoading()V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    new-instance v2, Lu1/u0;

    .line 42
    .line 43
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, v2}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    .line 47
    .line 48
    .line 49
    sget-object v2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 50
    .line 51
    new-instance v3, Landroidx/activity/k;

    .line 52
    .line 53
    const/16 v4, 0xc

    .line 54
    .line 55
    invoke-direct {v3, v4, p2}, Landroidx/activity/k;-><init>(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 59
    .line 60
    .line 61
    const/4 p2, 0x0

    .line 62
    invoke-virtual {v0, p2}, Lco/median/android/MainActivity;->v0(Z)V

    .line 63
    .line 64
    .line 65
    iget-object p2, v0, Lco/median/android/MainActivity;->b0:Lu1/s0;

    .line 66
    .line 67
    invoke-virtual {p2}, Lu1/s0;->c()V

    .line 68
    .line 69
    .line 70
    iget-object p2, v0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 71
    .line 72
    invoke-static {v0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2}, Lx1/a;->t()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast p2, Lu1/o0;

    .line 81
    .line 82
    invoke-virtual {p2, v2}, Lu1/o0;->loadUrl(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :goto_1
    if-nez p3, :cond_3

    .line 86
    .line 87
    iget-object p2, v0, Lco/median/android/MainActivity;->Q:Lu1/w1;

    .line 88
    .line 89
    if-eqz p2, :cond_3

    .line 90
    .line 91
    invoke-virtual {p2, p1, v1}, Lu1/w1;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    :goto_2
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lu1/x1;->c:Lx1/i;

    .line 5
    .line 6
    invoke-interface {v0}, Lx1/i;->getUrl()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lu1/x1;->a:Lco/median/android/MainActivity;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    :cond_0
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-static {v0}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    :cond_1
    invoke-static {p1, v0}, Lr3/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-virtual {v1, p2, v0}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 36
    .line 37
    .line 38
    iput-object p2, v1, Lco/median/android/MainActivity;->i0:Ljava/lang/String;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    iput-object p2, v1, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 42
    .line 43
    iput-object p2, v1, Lco/median/android/MainActivity;->i0:Ljava/lang/String;

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    invoke-virtual {p0, p1, v0, p3}, Lu1/x1;->a(Ljava/lang/String;ZZ)V

    .line 47
    .line 48
    .line 49
    :goto_0
    if-nez p3, :cond_3

    .line 50
    .line 51
    iget-object p3, v1, Lco/median/android/MainActivity;->Q:Lu1/w1;

    .line 52
    .line 53
    if-eqz p3, :cond_3

    .line 54
    .line 55
    invoke-virtual {p3, p1, p2}, Lu1/w1;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    return-void
.end method
