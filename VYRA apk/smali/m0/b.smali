.class public final Lm0/b;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Landroid/view/View;

.field public final synthetic h:Li1/a;


# direct methods
.method public synthetic constructor <init>(Li1/a;Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p3, p0, Lm0/b;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lm0/b;->h:Li1/a;

    .line 4
    .line 5
    iput-object p2, p0, Lm0/b;->g:Landroid/view/View;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 5

    .line 1
    iget v0, p0, Lm0/b;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm0/b;->h:Li1/a;

    .line 7
    .line 8
    check-cast v0, Lm0/f;

    .line 9
    .line 10
    iget-object v0, v0, Li1/a;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lm0/g;

    .line 13
    .line 14
    invoke-interface {v0}, Lm0/g;->b()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lm0/b;->g:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    :goto_0
    return v0

    .line 33
    :pswitch_0
    iget-object v0, p0, Lm0/b;->h:Li1/a;

    .line 34
    .line 35
    iget-object v1, v0, Li1/a;->f:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lm0/g;

    .line 38
    .line 39
    invoke-interface {v1}, Lm0/g;->b()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    iget-object v1, p0, Lm0/b;->g:Landroid/view/View;

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v0, Li1/a;->h:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, La3/h0;

    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    iget-object v2, v0, Li1/a;->g:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Lp1/h;

    .line 65
    .line 66
    if-nez v2, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    const/4 v3, 0x0

    .line 70
    iput-object v3, v0, Li1/a;->g:Ljava/lang/Object;

    .line 71
    .line 72
    iget-object v0, v1, La3/h0;->g:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Landroidx/emoji2/text/p;

    .line 75
    .line 76
    invoke-virtual {v0}, Landroidx/emoji2/text/p;->n()Landroid/view/ViewGroup;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    new-instance v3, Landroidx/activity/p;

    .line 81
    .line 82
    const/4 v4, 0x4

    .line 83
    invoke-direct {v3, v1, v4, v2}, Landroidx/activity/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v3}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    :goto_1
    const/4 v0, 0x1

    .line 90
    :goto_2
    return v0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
