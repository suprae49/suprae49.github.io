.class public final Landroidx/activity/j0;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Lh3/c;

.field public c:Landroidx/fragment/app/m0;

.field public final d:Landroid/window/OnBackInvokedCallback;

.field public e:Landroid/window/OnBackInvokedDispatcher;

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/activity/j0;->a:Ljava/lang/Runnable;

    .line 5
    .line 6
    new-instance p1, Lh3/c;

    .line 7
    .line 8
    invoke-direct {p1}, Lh3/c;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/activity/j0;->b:Lh3/c;

    .line 12
    .line 13
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v0, 0x21

    .line 16
    .line 17
    if-lt p1, v0, :cond_1

    .line 18
    .line 19
    const/16 v0, 0x22

    .line 20
    .line 21
    if-lt p1, v0, :cond_0

    .line 22
    .line 23
    new-instance p1, Landroidx/activity/b0;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, v0}, Landroidx/activity/b0;-><init>(Landroidx/activity/j0;I)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Landroidx/activity/b0;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    invoke-direct {v0, p0, v1}, Landroidx/activity/b0;-><init>(Landroidx/activity/j0;I)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Landroidx/activity/c0;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-direct {v1, p0, v2}, Landroidx/activity/c0;-><init>(Landroidx/activity/j0;I)V

    .line 39
    .line 40
    .line 41
    new-instance v2, Landroidx/activity/c0;

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    invoke-direct {v2, p0, v3}, Landroidx/activity/c0;-><init>(Landroidx/activity/j0;I)V

    .line 45
    .line 46
    .line 47
    sget-object v3, Landroidx/activity/g0;->a:Landroidx/activity/g0;

    .line 48
    .line 49
    invoke-virtual {v3, p1, v0, v1, v2}, Landroidx/activity/g0;->a(Lq3/l;Lq3/l;Lq3/a;Lq3/a;)Landroid/window/OnBackInvokedCallback;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    new-instance p1, Landroidx/activity/c0;

    .line 55
    .line 56
    const/4 v0, 0x2

    .line 57
    invoke-direct {p1, p0, v0}, Landroidx/activity/c0;-><init>(Landroidx/activity/j0;I)V

    .line 58
    .line 59
    .line 60
    sget-object v0, Landroidx/activity/e0;->a:Landroidx/activity/e0;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Landroidx/activity/e0;->a(Lq3/a;)Landroid/window/OnBackInvokedCallback;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :goto_0
    iput-object p1, p0, Landroidx/activity/j0;->d:Landroid/window/OnBackInvokedCallback;

    .line 67
    .line 68
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/t;Landroidx/fragment/app/m0;)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Landroidx/lifecycle/t;->getLifecycle()Landroidx/lifecycle/o;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Landroidx/lifecycle/v;

    .line 10
    .line 11
    iget-object v0, v0, Landroidx/lifecycle/v;->c:Landroidx/lifecycle/n;

    .line 12
    .line 13
    sget-object v1, Landroidx/lifecycle/n;->f:Landroidx/lifecycle/n;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance v0, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;

    .line 19
    .line 20
    invoke-direct {v0, p0, p1, p2}, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;-><init>(Landroidx/activity/j0;Landroidx/lifecycle/o;Landroidx/fragment/app/m0;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p2, Landroidx/fragment/app/m0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/activity/j0;->f()V

    .line 29
    .line 30
    .line 31
    new-instance v1, Landroidx/activity/i0;

    .line 32
    .line 33
    const-string v6, "updateEnabledCallbacks()V"

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v2, 0x0

    .line 37
    const-class v4, Landroidx/activity/j0;

    .line 38
    .line 39
    const-string v5, "updateEnabledCallbacks"

    .line 40
    .line 41
    move-object v3, p0

    .line 42
    invoke-direct/range {v1 .. v7}, Landroidx/activity/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    iput-object v1, p2, Landroidx/fragment/app/m0;->c:Landroidx/activity/i0;

    .line 46
    .line 47
    return-void
.end method

.method public final b(Landroidx/fragment/app/m0;)Landroidx/activity/h0;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/activity/j0;->b:Lh3/c;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lh3/c;->addLast(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Landroidx/activity/h0;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1}, Landroidx/activity/h0;-><init>(Landroidx/activity/j0;Landroidx/fragment/app/m0;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, p1, Landroidx/fragment/app/m0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/activity/j0;->f()V

    .line 20
    .line 21
    .line 22
    new-instance v2, Landroidx/activity/i0;

    .line 23
    .line 24
    const-string v7, "updateEnabledCallbacks()V"

    .line 25
    .line 26
    const/4 v8, 0x1

    .line 27
    const/4 v3, 0x0

    .line 28
    const-class v5, Landroidx/activity/j0;

    .line 29
    .line 30
    const-string v6, "updateEnabledCallbacks"

    .line 31
    .line 32
    move-object v4, p0

    .line 33
    invoke-direct/range {v2 .. v8}, Landroidx/activity/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p1, Landroidx/fragment/app/m0;->c:Landroidx/activity/i0;

    .line 37
    .line 38
    return-object v0
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/activity/j0;->c:Landroidx/fragment/app/m0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/j0;->b:Lh3/c;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    move-object v3, v2

    .line 27
    check-cast v3, Landroidx/fragment/app/m0;

    .line 28
    .line 29
    iget-boolean v3, v3, Landroidx/fragment/app/m0;->a:Z

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v2, v1

    .line 35
    :goto_0
    check-cast v2, Landroidx/fragment/app/m0;

    .line 36
    .line 37
    :cond_2
    iput-object v1, p0, Landroidx/activity/j0;->c:Landroidx/fragment/app/m0;

    .line 38
    .line 39
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/activity/j0;->c:Landroidx/fragment/app/m0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/j0;->b:Lh3/c;

    .line 7
    .line 8
    iget v2, v0, Lh3/c;->h:I

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    move-object v3, v2

    .line 25
    check-cast v3, Landroidx/fragment/app/m0;

    .line 26
    .line 27
    iget-boolean v3, v3, Landroidx/fragment/app/m0;->a:Z

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move-object v2, v1

    .line 33
    :goto_0
    move-object v0, v2

    .line 34
    check-cast v0, Landroidx/fragment/app/m0;

    .line 35
    .line 36
    :cond_2
    iput-object v1, p0, Landroidx/activity/j0;->c:Landroidx/fragment/app/m0;

    .line 37
    .line 38
    if-eqz v0, :cond_5

    .line 39
    .line 40
    iget v1, v0, Landroidx/fragment/app/m0;->d:I

    .line 41
    .line 42
    packed-switch v1, :pswitch_data_0

    .line 43
    .line 44
    .line 45
    iget-object v0, v0, Landroidx/fragment/app/m0;->e:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lco/median/android/MainActivity;

    .line 48
    .line 49
    sget v1, Lco/median/android/MainActivity;->G0:I

    .line 50
    .line 51
    invoke-virtual {v0}, Lco/median/android/MainActivity;->L()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_4

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :pswitch_0
    iget-object v0, v0, Landroidx/fragment/app/m0;->e:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Landroidx/fragment/app/u0;

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    invoke-virtual {v0, v1}, Landroidx/fragment/app/u0;->x(Z)Z

    .line 67
    .line 68
    .line 69
    iget-object v1, v0, Landroidx/fragment/app/u0;->h:Landroidx/fragment/app/m0;

    .line 70
    .line 71
    iget-boolean v1, v1, Landroidx/fragment/app/m0;->a:Z

    .line 72
    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    invoke-virtual {v0}, Landroidx/fragment/app/u0;->M()Z

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    iget-object v0, v0, Landroidx/fragment/app/u0;->g:Landroidx/activity/j0;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroidx/activity/j0;->d()V

    .line 82
    .line 83
    .line 84
    :cond_4
    :goto_1
    return-void

    .line 85
    :cond_5
    iget-object v0, p0, Landroidx/activity/j0;->a:Ljava/lang/Runnable;

    .line 86
    .line 87
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/activity/j0;->e:Landroid/window/OnBackInvokedDispatcher;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/activity/j0;->d:Landroid/window/OnBackInvokedCallback;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    sget-object v3, Landroidx/activity/e0;->a:Landroidx/activity/e0;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-boolean v4, p0, Landroidx/activity/j0;->f:Z

    .line 15
    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    invoke-virtual {v3, v0, v2, v1}, Landroidx/activity/e0;->b(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Landroidx/activity/j0;->f:Z

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget-boolean p1, p0, Landroidx/activity/j0;->f:Z

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v3, v0, v1}, Landroidx/activity/e0;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-boolean v2, p0, Landroidx/activity/j0;->f:Z

    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/activity/j0;->g:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Landroidx/activity/j0;->b:Lh3/c;

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Landroidx/fragment/app/m0;

    .line 30
    .line 31
    iget-boolean v3, v3, Landroidx/fragment/app/m0;->a:Z

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    :cond_2
    :goto_0
    iput-boolean v1, p0, Landroidx/activity/j0;->g:Z

    .line 37
    .line 38
    if-eq v1, v0, :cond_3

    .line 39
    .line 40
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 41
    .line 42
    const/16 v2, 0x21

    .line 43
    .line 44
    if-lt v0, v2, :cond_3

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Landroidx/activity/j0;->e(Z)V

    .line 47
    .line 48
    .line 49
    :cond_3
    return-void
.end method
