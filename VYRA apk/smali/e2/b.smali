.class public final Le2/b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p2, p0, Le2/b;->a:I

    iput-object p1, p0, Le2/b;->c:Ljava/lang/Object;

    iput-object p3, p0, Le2/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public constructor <init>(Ly0/f;Lcom/google/android/material/navigation/NavigationView;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Le2/b;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Le2/b;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Le2/b;->c:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget v0, p0, Le2/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Le2/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ly0/f;

    .line 9
    .line 10
    iget-object v0, p0, Le2/b;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcom/google/android/material/navigation/NavigationView;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p1, v0, v1}, Ly0/f;->c(Landroid/view/View;Z)V

    .line 16
    .line 17
    .line 18
    const/high16 v0, -0x67000000

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ly0/f;->setScrimColor(I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    iget-object v0, p0, Le2/b;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lp/f;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lp/k;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Le2/b;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lp1/r;

    .line 34
    .line 35
    iget-object v0, v0, Lp1/r;->t:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_1
    iget-object p1, p0, Le2/b;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lp0/a1;

    .line 44
    .line 45
    const/high16 v0, 0x3f800000    # 1.0f

    .line 46
    .line 47
    iget-object v1, p1, Lp0/a1;->a:Lp0/z0;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Lp0/z0;->e(F)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Le2/b;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Landroid/view/View;

    .line 55
    .line 56
    invoke-static {v0, p1}, Lp0/w0;->f(Landroid/view/View;Lp0/a1;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_2
    iget-object p1, p0, Le2/b;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Landroid/view/View;

    .line 63
    .line 64
    iget-object v0, p0, Le2/b;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;

    .line 67
    .line 68
    const/4 v1, 0x0

    .line 69
    iput-object v1, v0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->p:Landroid/view/ViewPropertyAnimator;

    .line 70
    .line 71
    iget v0, v0, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->o:I

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    if-ne v0, v1, :cond_0

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_0

    .line 81
    .line 82
    const/4 v0, 0x4

    .line 83
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 84
    .line 85
    .line 86
    :cond_0
    return-void

    .line 87
    :pswitch_3
    iget-object p1, p0, Le2/b;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Landroid/view/View;

    .line 90
    .line 91
    iget-object v0, p0, Le2/b;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;

    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    iput-object v1, v0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->p:Landroid/view/ViewPropertyAnimator;

    .line 97
    .line 98
    iget v0, v0, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->o:I

    .line 99
    .line 100
    const/4 v1, 0x1

    .line 101
    if-ne v0, v1, :cond_1

    .line 102
    .line 103
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_1

    .line 108
    .line 109
    const/4 v0, 0x4

    .line 110
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 111
    .line 112
    .line 113
    :cond_1
    return-void

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, Le2/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, Le2/b;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lp1/r;

    .line 13
    .line 14
    iget-object v0, v0, Lp1/r;->t:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
