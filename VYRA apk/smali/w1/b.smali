.class public final Lw1/b;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lw1/h;


# direct methods
.method public synthetic constructor <init>(Lw1/h;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw1/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lw1/b;->b:Lw1/h;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final a(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final c(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final d(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 4

    .line 1
    iget p1, p0, Lw1/b;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lw1/c;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iget-object v1, p0, Lw1/b;->b:Lw1/h;

    .line 10
    .line 11
    invoke-direct {p1, v1, v0}, Lw1/c;-><init>(Lw1/h;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v1, Lw1/h;->G:Lw1/c;

    .line 15
    .line 16
    const-wide/16 v2, 0x96

    .line 17
    .line 18
    invoke-virtual {p1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 19
    .line 20
    .line 21
    iget-object p1, v1, Lw1/h;->y:Lw1/a;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p1, Lw1/a;->i:Landroid/view/animation/Animation$AnimationListener;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 27
    .line 28
    .line 29
    iget-object p1, v1, Lw1/h;->y:Lw1/a;

    .line 30
    .line 31
    iget-object v0, v1, Lw1/h;->G:Lw1/c;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    iget-object p1, p0, Lw1/b;->b:Lw1/h;

    .line 38
    .line 39
    check-cast p1, Lco/median/android/MySwipeRefreshLayout;

    .line 40
    .line 41
    iget-boolean v0, p1, Lw1/h;->h:Z

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object v0, p1, Lw1/h;->E:Ln1/d;

    .line 46
    .line 47
    const/16 v1, 0xff

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ln1/d;->setAlpha(I)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p1, Lw1/h;->E:Ln1/d;

    .line 53
    .line 54
    invoke-virtual {v0}, Ln1/d;->start()V

    .line 55
    .line 56
    .line 57
    iget-boolean v0, p1, Lw1/h;->J:Z

    .line 58
    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    iget-object v0, p1, Lw1/h;->g:Lw1/g;

    .line 62
    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    check-cast v0, Lco/median/android/MainActivity;

    .line 66
    .line 67
    invoke-virtual {v0}, Lco/median/android/MainActivity;->N()V

    .line 68
    .line 69
    .line 70
    :cond_0
    iget-object v0, p1, Lw1/h;->y:Lw1/a;

    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iput v0, p1, Lw1/h;->r:I

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-virtual {p1}, Lw1/h;->f()V

    .line 80
    .line 81
    .line 82
    :goto_0
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    iget p1, p0, Lw1/b;->a:I

    .line 2
    .line 3
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    iget p1, p0, Lw1/b;->a:I

    .line 2
    .line 3
    return-void
.end method
