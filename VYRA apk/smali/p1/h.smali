.class public final synthetic Lp1/h;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lk0/d;
.implements Lb/b;
.implements Lu1/a1;


# instance fields
.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp1/h;->f:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, Lp1/h;->g:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lp1/h;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu1/o;

    .line 4
    .line 5
    iget-object v1, p0, Lp1/h;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lco/median/android/MainActivity;

    .line 8
    .line 9
    check-cast p1, Ljava/util/Map;

    .line 10
    .line 11
    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 12
    .line 13
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v3, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    const-string p1, "Unable to save download, storage permission denied"

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-static {v1, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 40
    .line 41
    .line 42
    iget-object p1, v0, Lu1/o;->h:Lu1/n;

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object p1, p1, Lu1/n;->g:Ljava/lang/String;

    .line 47
    .line 48
    const-string v2, "Unable to save download, storage permission denied."

    .line 49
    .line 50
    invoke-static {v1, p1, v2}, Lu1/o;->g(Lx1/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iput-object v4, v0, Lu1/o;->h:Lu1/n;

    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    iget-object p1, v0, Lu1/o;->h:Lu1/n;

    .line 57
    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    iget-object v2, p1, Lu1/n;->g:Ljava/lang/String;

    .line 61
    .line 62
    iget-boolean v3, v0, Lu1/o;->g:Z

    .line 63
    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    iget-boolean v3, p1, Lu1/n;->f:Z

    .line 67
    .line 68
    if-eqz v3, :cond_1

    .line 69
    .line 70
    iget-object v1, v1, Lco/median/android/MainActivity;->a0:Lu1/w;

    .line 71
    .line 72
    iget-object v3, p1, Lu1/n;->a:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v5, p1, Lu1/n;->b:Ljava/lang/String;

    .line 75
    .line 76
    iget-boolean p1, p1, Lu1/n;->e:Z

    .line 77
    .line 78
    invoke-virtual {v1, v3, v5, p1, v2}, Lu1/w;->d(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-virtual {v0, p1, v2}, Lu1/o;->i(Lu1/n;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    iput-object v4, v0, Lu1/o;->h:Lu1/n;

    .line 86
    .line 87
    :cond_2
    return-void
.end method

.method public b(La3/h0;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lp1/h;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lco/median/android/MainActivity;

    .line 4
    .line 5
    iget-object v1, p0, Lp1/h;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lco/median/android/GoNativeApplication;

    .line 8
    .line 9
    iput-object p1, v0, Lco/median/android/MainActivity;->x0:La3/h0;

    .line 10
    .line 11
    iget-object p1, v1, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 12
    .line 13
    invoke-virtual {p1}, Lu1/x;->a()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    new-instance p1, Landroid/os/Handler;

    .line 30
    .line 31
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {p1, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Lu1/t0;

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-direct {v1, v0, v2}, Lu1/t0;-><init>(Lco/median/android/MainActivity;I)V

    .line 42
    .line 43
    .line 44
    const-wide/16 v2, 0x1b58

    .line 45
    .line 46
    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    invoke-static {p1}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    throw p1
.end method

.method public c([Ljava/lang/String;[I)V
    .locals 4

    .line 1
    iget-object p1, p0, Lp1/h;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lu1/w;

    .line 4
    .line 5
    iget-object v0, p0, Lp1/h;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lu1/u;

    .line 8
    .line 9
    iget-object v1, p1, Lu1/w;->d:Lco/median/android/MainActivity;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :try_start_0
    aget p2, p2, v2

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    move v2, v3

    .line 18
    :cond_0
    invoke-virtual {p1, v0, v2}, Lu1/w;->e(Lu1/u;Z)V

    .line 19
    .line 20
    .line 21
    new-instance p2, Lu1/t;

    .line 22
    .line 23
    invoke-direct {p2, p1, v3}, Lu1/t;-><init>(Lu1/w;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :catch_0
    move-exception p1

    .line 31
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    const-string v2, "w"

    .line 36
    .line 37
    const-string v3, "IO Error"

    .line 38
    .line 39
    invoke-virtual {p2, v2, v3, p1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 40
    .line 41
    .line 42
    iget-object p2, v0, Lu1/u;->j:Ljava/lang/String;

    .line 43
    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v2, "IO Error - "

    .line 47
    .line 48
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {v1, p2, p1}, Lu1/o;->g(Lx1/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public onCancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp1/h;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp1/r;

    .line 4
    .line 5
    iget-object v1, p0, Lp1/h;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/fragment/app/c;

    .line 8
    .line 9
    invoke-virtual {v0}, Lp1/r;->d()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Landroidx/fragment/app/c;->run()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
