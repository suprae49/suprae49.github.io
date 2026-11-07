.class public final Landroidx/fragment/app/x;
.super Landroidx/fragment/app/a0;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic a:Landroidx/fragment/app/w;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Lc/a;

.field public final synthetic d:Lb/b;

.field public final synthetic e:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/w;Ljava/util/concurrent/atomic/AtomicReference;Lc/a;Lb/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/x;->e:Landroidx/fragment/app/Fragment;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/fragment/app/x;->a:Landroidx/fragment/app/w;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/fragment/app/x;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/fragment/app/x;->c:Lc/a;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/fragment/app/x;->d:Lb/b;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/x;->e:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->generateActivityResultKey()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Landroidx/fragment/app/x;->a:Landroidx/fragment/app/w;

    .line 8
    .line 9
    iget v3, v2, Landroidx/fragment/app/w;->f:I

    .line 10
    .line 11
    packed-switch v3, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v2, v2, Landroidx/fragment/app/w;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lb/h;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_0
    iget-object v2, v2, Landroidx/fragment/app/w;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 22
    .line 23
    iget-object v3, v2, Landroidx/fragment/app/Fragment;->mHost:Landroidx/fragment/app/h0;

    .line 24
    .line 25
    instance-of v4, v3, Lb/i;

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    check-cast v3, Lb/i;

    .line 30
    .line 31
    invoke-interface {v3}, Lb/i;->j()Lb/h;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/e0;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v2, v2, Landroidx/activity/q;->n:Landroidx/activity/n;

    .line 41
    .line 42
    :goto_0
    iget-object v3, p0, Landroidx/fragment/app/x;->c:Lc/a;

    .line 43
    .line 44
    iget-object v4, p0, Landroidx/fragment/app/x;->d:Lb/b;

    .line 45
    .line 46
    invoke-virtual {v2, v1, v0, v3, v4}, Lb/h;->c(Ljava/lang/String;Landroidx/lifecycle/t;Lc/a;Lb/b;)Lb/g;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-object v1, p0, Landroidx/fragment/app/x;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
