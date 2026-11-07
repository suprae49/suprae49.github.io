.class public final Lj/e;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La3/h0;Lj/f;Lj/o;Lj/m;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lj/e;->f:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lj/e;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lj/e;->g:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lj/e;->h:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lj/e;->i:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lp0/a1;Landroidx/emoji2/text/p;Landroid/animation/ValueAnimator;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lj/e;->f:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/e;->g:Ljava/lang/Object;

    iput-object p2, p0, Lj/e;->h:Ljava/lang/Object;

    iput-object p3, p0, Lj/e;->i:Ljava/lang/Object;

    iput-object p4, p0, Lj/e;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lj/e;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj/e;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/view/View;

    .line 9
    .line 10
    iget-object v1, p0, Lj/e;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lp0/a1;

    .line 13
    .line 14
    iget-object v2, p0, Lj/e;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Landroidx/emoji2/text/p;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lp0/w0;->i(Landroid/view/View;Lp0/a1;Landroidx/emoji2/text/p;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lj/e;->j:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    iget-object v0, p0, Lj/e;->j:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, La3/h0;

    .line 32
    .line 33
    iget-object v0, v0, La3/h0;->g:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lj/g;

    .line 36
    .line 37
    iget-object v1, p0, Lj/e;->h:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lj/o;

    .line 40
    .line 41
    iget-object v2, p0, Lj/e;->g:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, Lj/f;

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    iput-boolean v3, v0, Lj/g;->F:Z

    .line 49
    .line 50
    iget-object v2, v2, Lj/f;->b:Lj/m;

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-virtual {v2, v3}, Lj/m;->c(Z)V

    .line 54
    .line 55
    .line 56
    iput-boolean v3, v0, Lj/g;->F:Z

    .line 57
    .line 58
    :cond_0
    invoke-virtual {v1}, Lj/o;->isEnabled()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    invoke-virtual {v1}, Lj/o;->hasSubMenu()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    iget-object v0, p0, Lj/e;->i:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Lj/m;

    .line 73
    .line 74
    const/4 v2, 0x4

    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-virtual {v0, v1, v3, v2}, Lj/m;->q(Landroid/view/MenuItem;Lj/y;I)Z

    .line 77
    .line 78
    .line 79
    :cond_1
    return-void

    .line 80
    nop

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
