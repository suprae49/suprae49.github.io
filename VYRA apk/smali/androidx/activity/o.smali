.class public final Landroidx/activity/o;
.super Lr3/h;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lq3/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroidx/lifecycle/u0;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/u0;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/o;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/activity/o;->h:Landroidx/lifecycle/u0;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lr3/h;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Landroidx/activity/o;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/o;->h:Landroidx/lifecycle/u0;

    .line 7
    .line 8
    invoke-static {v0}, Landroidx/lifecycle/k0;->e(Landroidx/lifecycle/u0;)Landroidx/lifecycle/m0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0

    .line 13
    :pswitch_0
    new-instance v0, Landroidx/activity/j0;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/activity/o;->h:Landroidx/lifecycle/u0;

    .line 16
    .line 17
    check-cast v1, Landroidx/fragment/app/e0;

    .line 18
    .line 19
    new-instance v2, Landroidx/activity/d;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-direct {v2, v1, v3}, Landroidx/activity/d;-><init>(Landroidx/fragment/app/e0;I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v2}, Landroidx/activity/j0;-><init>(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v3, 0x21

    .line 31
    .line 32
    if-lt v2, v3, :cond_1

    .line 33
    .line 34
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v2, v3}, Lr3/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_0

    .line 47
    .line 48
    new-instance v2, Landroid/os/Handler;

    .line 49
    .line 50
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 55
    .line 56
    .line 57
    new-instance v3, Landroidx/activity/p;

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-direct {v3, v1, v4, v0}, Landroidx/activity/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    iget-object v2, v1, Landroidx/activity/q;->f:Landroidx/lifecycle/v;

    .line 68
    .line 69
    new-instance v3, Landroidx/activity/h;

    .line 70
    .line 71
    invoke-direct {v3, v0, v1}, Landroidx/activity/h;-><init>(Landroidx/activity/j0;Landroidx/fragment/app/e0;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v3}, Landroidx/lifecycle/v;->a(Landroidx/lifecycle/s;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    :goto_0
    return-object v0

    .line 78
    :pswitch_1
    new-instance v0, Landroidx/activity/a0;

    .line 79
    .line 80
    iget-object v1, p0, Landroidx/activity/o;->h:Landroidx/lifecycle/u0;

    .line 81
    .line 82
    check-cast v1, Landroidx/fragment/app/e0;

    .line 83
    .line 84
    iget-object v2, v1, Landroidx/activity/q;->k:Landroidx/activity/l;

    .line 85
    .line 86
    new-instance v3, Landroidx/activity/o;

    .line 87
    .line 88
    const/4 v4, 0x0

    .line 89
    invoke-direct {v3, v1, v4}, Landroidx/activity/o;-><init>(Landroidx/lifecycle/u0;I)V

    .line 90
    .line 91
    .line 92
    invoke-direct {v0, v2, v3}, Landroidx/activity/a0;-><init>(Ljava/util/concurrent/Executor;Landroidx/activity/o;)V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_2
    iget-object v0, p0, Landroidx/activity/o;->h:Landroidx/lifecycle/u0;

    .line 97
    .line 98
    check-cast v0, Landroidx/fragment/app/e0;

    .line 99
    .line 100
    invoke-virtual {v0}, Landroidx/activity/q;->reportFullyDrawn()V

    .line 101
    .line 102
    .line 103
    sget-object v0, Lg3/g;->a:Lg3/g;

    .line 104
    .line 105
    return-object v0

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
