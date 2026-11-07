.class public final Lc2/d;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 13
    const/4 v0, 0x1

    iput v0, p0, Lc2/d;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lc2/d;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lc2/d;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lc2/d;->g:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lc2/d;->h:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lc2/d;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lu1/o0;

    .line 7
    .line 8
    iget-object v1, p0, Lc2/d;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroid/app/Activity;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lu1/o0;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, Lc2/d;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lu1/h2;

    .line 18
    .line 19
    iput-object v0, v2, Lu1/h2;->h:Lu1/o0;

    .line 20
    .line 21
    iget-object v3, v2, Lu1/h2;->g:Ljava/util/HashSet;

    .line 22
    .line 23
    iget-object v4, p0, Lc2/d;->h:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lco/median/android/a;->a(Lu1/o0;Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    const-string v3, "window"

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Landroid/view/WindowManager;

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    new-instance v5, Landroid/graphics/Point;

    .line 48
    .line 49
    invoke-direct {v5}, Landroid/graphics/Point;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v5}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 53
    .line 54
    .line 55
    iget v3, v5, Landroid/graphics/Point;->x:I

    .line 56
    .line 57
    iget v5, v5, Landroid/graphics/Point;->y:I

    .line 58
    .line 59
    const/4 v6, 0x0

    .line 60
    invoke-virtual {v0, v6, v6, v3, v5}, Landroid/view/View;->layout(IIII)V

    .line 61
    .line 62
    .line 63
    :cond_0
    new-instance v3, Lu1/l1;

    .line 64
    .line 65
    iget-object v5, v2, Lu1/h2;->e:Lr0/b;

    .line 66
    .line 67
    invoke-direct {v3, v1, v5, v0}, Lu1/l1;-><init>(Landroid/app/Activity;Lr0/b;Lu1/o0;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, v2, Lu1/h2;->h:Lu1/o0;

    .line 71
    .line 72
    iget-object v0, v2, Lu1/h2;->g:Ljava/util/HashSet;

    .line 73
    .line 74
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    iget-object v0, v2, Lu1/h2;->h:Lu1/o0;

    .line 78
    .line 79
    invoke-virtual {v0, v4}, Lu1/o0;->loadUrl(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lc2/d;->g:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Ll0/e;

    .line 86
    .line 87
    invoke-virtual {v0}, Ll0/e;->call()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    goto :goto_0

    .line 92
    :catch_0
    const/4 v0, 0x0

    .line 93
    :goto_0
    iget-object v1, p0, Lc2/d;->h:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, Ll0/f;

    .line 96
    .line 97
    iget-object v2, p0, Lc2/d;->i:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v2, Landroid/os/Handler;

    .line 100
    .line 101
    new-instance v3, Lb0/b;

    .line 102
    .line 103
    const/4 v4, 0x6

    .line 104
    invoke-direct {v3, v1, v4, v0}, Lb0/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_1
    iget-object v0, p0, Lc2/d;->g:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 114
    .line 115
    iget-object v1, p0, Lc2/d;->i:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v1, Lc2/e;

    .line 118
    .line 119
    iget-object v2, p0, Lc2/d;->h:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v2, Landroid/view/View;

    .line 122
    .line 123
    if-eqz v2, :cond_2

    .line 124
    .line 125
    iget-object v3, v1, Lc2/e;->i:Landroid/widget/OverScroller;

    .line 126
    .line 127
    if-eqz v3, :cond_2

    .line 128
    .line 129
    invoke-virtual {v3}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-eqz v3, :cond_1

    .line 134
    .line 135
    iget-object v3, v1, Lc2/e;->i:Landroid/widget/OverScroller;

    .line 136
    .line 137
    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrY()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    invoke-virtual {v1, v0, v2, v3}, Lc2/e;->A(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_1
    check-cast v1, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;

    .line 149
    .line 150
    check-cast v2, Lcom/google/android/material/appbar/AppBarLayout;

    .line 151
    .line 152
    invoke-virtual {v1, v0, v2}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->G(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;)V

    .line 153
    .line 154
    .line 155
    iget-boolean v1, v2, Lcom/google/android/material/appbar/AppBarLayout;->q:Z

    .line 156
    .line 157
    if-eqz v1, :cond_2

    .line 158
    .line 159
    invoke-static {v0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->D(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Landroid/view/View;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v2, v0}, Lcom/google/android/material/appbar/AppBarLayout;->g(Landroid/view/View;)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    invoke-virtual {v2, v0}, Lcom/google/android/material/appbar/AppBarLayout;->f(Z)Z

    .line 168
    .line 169
    .line 170
    :cond_2
    :goto_1
    return-void

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
