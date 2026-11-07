.class public final Lj/g;
.super Lj/u;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Lj/x;

.field public D:Landroid/view/ViewTreeObserver;

.field public E:Landroid/widget/PopupWindow$OnDismissListener;

.field public F:Z

.field public final g:Landroid/content/Context;

.field public final h:I

.field public final i:I

.field public final j:I

.field public final k:Z

.field public final l:Landroid/os/Handler;

.field public final m:Ljava/util/ArrayList;

.field public final n:Ljava/util/ArrayList;

.field public final o:Lj/d;

.field public final p:Ld3/q;

.field public final q:La3/h0;

.field public r:I

.field public s:I

.field public t:Landroid/view/View;

.field public u:Landroid/view/View;

.field public v:I

.field public w:Z

.field public x:Z

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;IIZ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lj/g;->m:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lj/g;->n:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Lj/d;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1, p0}, Lj/d;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lj/g;->o:Lj/d;

    .line 25
    .line 26
    new-instance v0, Ld3/q;

    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    invoke-direct {v0, v1, p0}, Ld3/q;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lj/g;->p:Ld3/q;

    .line 33
    .line 34
    new-instance v0, La3/h0;

    .line 35
    .line 36
    const/16 v1, 0xf

    .line 37
    .line 38
    invoke-direct {v0, v1, p0}, La3/h0;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lj/g;->q:La3/h0;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    iput v0, p0, Lj/g;->r:I

    .line 45
    .line 46
    iput v0, p0, Lj/g;->s:I

    .line 47
    .line 48
    iput-object p1, p0, Lj/g;->g:Landroid/content/Context;

    .line 49
    .line 50
    iput-object p2, p0, Lj/g;->t:Landroid/view/View;

    .line 51
    .line 52
    iput p3, p0, Lj/g;->i:I

    .line 53
    .line 54
    iput p4, p0, Lj/g;->j:I

    .line 55
    .line 56
    iput-boolean p5, p0, Lj/g;->k:Z

    .line 57
    .line 58
    iput-boolean v0, p0, Lj/g;->A:Z

    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/view/View;->getLayoutDirection()I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    const/4 p3, 0x1

    .line 65
    if-ne p2, p3, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    move v0, p3

    .line 69
    :goto_0
    iput v0, p0, Lj/g;->v:I

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 80
    .line 81
    div-int/lit8 p2, p2, 0x2

    .line 82
    .line 83
    const p3, 0x7f070017

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    iput p1, p0, Lj/g;->h:I

    .line 95
    .line 96
    new-instance p1, Landroid/os/Handler;

    .line 97
    .line 98
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-object p1, p0, Lj/g;->l:Landroid/os/Handler;

    .line 102
    .line 103
    return-void
.end method


# virtual methods
.method public final a(Lj/m;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lj/g;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Lj/f;

    .line 16
    .line 17
    iget-object v4, v4, Lj/f;->b:Lj/m;

    .line 18
    .line 19
    if-ne p1, v4, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v3, -0x1

    .line 26
    :goto_1
    if-gez v3, :cond_2

    .line 27
    .line 28
    goto/16 :goto_4

    .line 29
    .line 30
    :cond_2
    add-int/lit8 v1, v3, 0x1

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-ge v1, v4, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lj/f;

    .line 43
    .line 44
    iget-object v1, v1, Lj/f;->b:Lj/m;

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Lj/m;->c(Z)V

    .line 47
    .line 48
    .line 49
    :cond_3
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Lj/f;

    .line 54
    .line 55
    iget-object v3, v1, Lj/f;->b:Lj/m;

    .line 56
    .line 57
    iget-object v1, v1, Lj/f;->a:Lk/f2;

    .line 58
    .line 59
    iget-object v4, v1, Lk/a2;->E:Lk/b0;

    .line 60
    .line 61
    invoke-virtual {v3, p0}, Lj/m;->r(Lj/y;)V

    .line 62
    .line 63
    .line 64
    iget-boolean v3, p0, Lj/g;->F:Z

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    invoke-static {v4, v5}, Lk/c2;->b(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 73
    .line 74
    .line 75
    :cond_4
    invoke-virtual {v1}, Lk/a2;->dismiss()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    const/4 v3, 0x1

    .line 83
    if-lez v1, :cond_5

    .line 84
    .line 85
    add-int/lit8 v4, v1, -0x1

    .line 86
    .line 87
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    check-cast v4, Lj/f;

    .line 92
    .line 93
    iget v4, v4, Lj/f;->c:I

    .line 94
    .line 95
    iput v4, p0, Lj/g;->v:I

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    iget-object v4, p0, Lj/g;->t:Landroid/view/View;

    .line 99
    .line 100
    invoke-virtual {v4}, Landroid/view/View;->getLayoutDirection()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-ne v4, v3, :cond_6

    .line 105
    .line 106
    move v4, v2

    .line 107
    goto :goto_2

    .line 108
    :cond_6
    move v4, v3

    .line 109
    :goto_2
    iput v4, p0, Lj/g;->v:I

    .line 110
    .line 111
    :goto_3
    if-nez v1, :cond_a

    .line 112
    .line 113
    invoke-virtual {p0}, Lj/g;->dismiss()V

    .line 114
    .line 115
    .line 116
    iget-object p2, p0, Lj/g;->C:Lj/x;

    .line 117
    .line 118
    if-eqz p2, :cond_7

    .line 119
    .line 120
    invoke-interface {p2, p1, v3}, Lj/x;->a(Lj/m;Z)V

    .line 121
    .line 122
    .line 123
    :cond_7
    iget-object p1, p0, Lj/g;->D:Landroid/view/ViewTreeObserver;

    .line 124
    .line 125
    if-eqz p1, :cond_9

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-eqz p1, :cond_8

    .line 132
    .line 133
    iget-object p1, p0, Lj/g;->D:Landroid/view/ViewTreeObserver;

    .line 134
    .line 135
    iget-object p2, p0, Lj/g;->o:Lj/d;

    .line 136
    .line 137
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 138
    .line 139
    .line 140
    :cond_8
    iput-object v5, p0, Lj/g;->D:Landroid/view/ViewTreeObserver;

    .line 141
    .line 142
    :cond_9
    iget-object p1, p0, Lj/g;->u:Landroid/view/View;

    .line 143
    .line 144
    iget-object p2, p0, Lj/g;->p:Ld3/q;

    .line 145
    .line 146
    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p0, Lj/g;->E:Landroid/widget/PopupWindow$OnDismissListener;

    .line 150
    .line 151
    invoke-interface {p1}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_a
    if-eqz p2, :cond_b

    .line 156
    .line 157
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    check-cast p1, Lj/f;

    .line 162
    .line 163
    iget-object p1, p1, Lj/f;->b:Lj/m;

    .line 164
    .line 165
    invoke-virtual {p1, v2}, Lj/m;->c(Z)V

    .line 166
    .line 167
    .line 168
    :cond_b
    :goto_4
    return-void
.end method

.method public final b()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lj/g;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lj/f;

    .line 15
    .line 16
    iget-object v0, v0, Lj/f;->a:Lk/f2;

    .line 17
    .line 18
    iget-object v0, v0, Lk/a2;->E:Lk/b0;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_0
    return v2
.end method

.method public final c()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lj/g;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Lj/g;->m:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    check-cast v4, Lj/m;

    .line 25
    .line 26
    invoke-virtual {p0, v4}, Lj/g;->w(Lj/m;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lj/g;->t:Landroid/view/View;

    .line 34
    .line 35
    iput-object v0, p0, Lj/g;->u:Landroid/view/View;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    iget-object v1, p0, Lj/g;->D:Landroid/view/ViewTreeObserver;

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lj/g;->D:Landroid/view/ViewTreeObserver;

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    iget-object v1, p0, Lj/g;->o:Lj/d;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-object v0, p0, Lj/g;->u:Landroid/view/View;

    .line 58
    .line 59
    iget-object v1, p0, Lj/g;->p:Ld3/q;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_1
    return-void
.end method

.method public final dismiss()V
    .locals 4

    .line 1
    iget-object v0, p0, Lj/g;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_1

    .line 8
    .line 9
    new-array v2, v1, [Lj/f;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, [Lj/f;

    .line 16
    .line 17
    add-int/lit8 v1, v1, -0x1

    .line 18
    .line 19
    :goto_0
    if-ltz v1, :cond_1

    .line 20
    .line 21
    aget-object v2, v0, v1

    .line 22
    .line 23
    iget-object v3, v2, Lj/f;->a:Lk/f2;

    .line 24
    .line 25
    iget-object v3, v3, Lk/a2;->E:Lk/b0;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iget-object v2, v2, Lj/f;->a:Lk/f2;

    .line 34
    .line 35
    invoke-virtual {v2}, Lk/a2;->dismiss()V

    .line 36
    .line 37
    .line 38
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public final e(Landroid/os/Parcelable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f(Z)V
    .locals 4

    .line 1
    iget-object p1, p0, Lj/g;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    check-cast v2, Lj/f;

    .line 17
    .line 18
    iget-object v2, v2, Lj/f;->a:Lk/f2;

    .line 19
    .line 20
    iget-object v2, v2, Lk/a2;->h:Lk/p1;

    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    instance-of v3, v2, Landroid/widget/HeaderViewListAdapter;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    check-cast v2, Landroid/widget/HeaderViewListAdapter;

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lj/j;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    check-cast v2, Lj/j;

    .line 40
    .line 41
    :goto_1
    invoke-virtual {v2}, Lj/j;->notifyDataSetChanged()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-void
.end method

.method public final g()Lk/p1;
    .locals 2

    .line 1
    iget-object v0, p0, Lj/g;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lj/f;

    .line 22
    .line 23
    iget-object v0, v0, Lj/f;->a:Lk/f2;

    .line 24
    .line 25
    iget-object v0, v0, Lk/a2;->h:Lk/p1;

    .line 26
    .line 27
    return-object v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final j()Landroid/os/Parcelable;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final l(Lj/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj/g;->C:Lj/x;

    .line 2
    .line 3
    return-void
.end method

.method public final m(Lj/e0;)Z
    .locals 7

    .line 1
    iget-object v0, p0, Lj/g;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :cond_0
    const/4 v4, 0x1

    .line 10
    if-ge v3, v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    check-cast v5, Lj/f;

    .line 19
    .line 20
    iget-object v6, v5, Lj/f;->b:Lj/m;

    .line 21
    .line 22
    if-ne p1, v6, :cond_0

    .line 23
    .line 24
    iget-object p1, v5, Lj/f;->a:Lk/f2;

    .line 25
    .line 26
    iget-object p1, p1, Lk/a2;->h:Lk/p1;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 29
    .line 30
    .line 31
    return v4

    .line 32
    :cond_1
    invoke-virtual {p1}, Lj/m;->hasVisibleItems()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lj/g;->n(Lj/m;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lj/g;->C:Lj/x;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-interface {v0, p1}, Lj/x;->h(Lj/m;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    return v4

    .line 49
    :cond_3
    return v2
.end method

.method public final n(Lj/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj/g;->g:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p1, p0, v0}, Lj/m;->b(Lj/y;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lj/g;->b()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lj/g;->w(Lj/m;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v0, p0, Lj/g;->m:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final onDismiss()V
    .locals 6

    .line 1
    iget-object v0, p0, Lj/g;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Lj/f;

    .line 16
    .line 17
    iget-object v5, v4, Lj/f;->a:Lk/f2;

    .line 18
    .line 19
    iget-object v5, v5, Lk/a2;->E:Lk/b0;

    .line 20
    .line 21
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v4, 0x0

    .line 32
    :goto_1
    if-eqz v4, :cond_2

    .line 33
    .line 34
    iget-object v0, v4, Lj/f;->b:Lj/m;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Lj/m;->c(Z)V

    .line 37
    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p3, 0x1

    .line 6
    if-ne p1, p3, :cond_0

    .line 7
    .line 8
    const/16 p1, 0x52

    .line 9
    .line 10
    if-ne p2, p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lj/g;->dismiss()V

    .line 13
    .line 14
    .line 15
    return p3

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public final p(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj/g;->t:Landroid/view/View;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lj/g;->t:Landroid/view/View;

    .line 6
    .line 7
    iget v0, p0, Lj/g;->r:I

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {v0, p1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Lj/g;->s:I

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final q(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lj/g;->A:Z

    .line 2
    .line 3
    return-void
.end method

.method public final r(I)V
    .locals 1

    .line 1
    iget v0, p0, Lj/g;->r:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lj/g;->r:I

    .line 6
    .line 7
    iget-object v0, p0, Lj/g;->t:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {p1, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Lj/g;->s:I

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final s(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lj/g;->w:Z

    .line 3
    .line 4
    iput p1, p0, Lj/g;->y:I

    .line 5
    .line 6
    return-void
.end method

.method public final t(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj/g;->E:Landroid/widget/PopupWindow$OnDismissListener;

    .line 2
    .line 3
    return-void
.end method

.method public final u(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lj/g;->B:Z

    .line 2
    .line 3
    return-void
.end method

.method public final v(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lj/g;->x:Z

    .line 3
    .line 4
    iput p1, p0, Lj/g;->z:I

    .line 5
    .line 6
    return-void
.end method

.method public final w(Lj/m;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lj/g;->g:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v4, Lj/j;

    .line 12
    .line 13
    iget-boolean v5, v0, Lj/g;->k:Z

    .line 14
    .line 15
    const v6, 0x7f0c000b

    .line 16
    .line 17
    .line 18
    invoke-direct {v4, v1, v3, v5, v6}, Lj/j;-><init>(Lj/m;Landroid/view/LayoutInflater;ZI)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lj/g;->b()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/4 v7, 0x1

    .line 26
    if-nez v5, :cond_0

    .line 27
    .line 28
    iget-boolean v5, v0, Lj/g;->A:Z

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    iput-boolean v7, v4, Lj/j;->h:Z

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    invoke-virtual {v0}, Lj/g;->b()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_3

    .line 40
    .line 41
    iget-object v5, v1, Lj/m;->f:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    const/4 v8, 0x0

    .line 48
    :goto_0
    if-ge v8, v5, :cond_2

    .line 49
    .line 50
    invoke-virtual {v1, v8}, Lj/m;->getItem(I)Landroid/view/MenuItem;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    invoke-interface {v9}, Landroid/view/MenuItem;->isVisible()Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    if-eqz v10, :cond_1

    .line 59
    .line 60
    invoke-interface {v9}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    if-eqz v9, :cond_1

    .line 65
    .line 66
    move v5, v7

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    const/4 v5, 0x0

    .line 72
    :goto_1
    iput-boolean v5, v4, Lj/j;->h:Z

    .line 73
    .line 74
    :cond_3
    :goto_2
    iget v5, v0, Lj/g;->h:I

    .line 75
    .line 76
    invoke-static {v4, v2, v5}, Lj/u;->o(Landroid/widget/ListAdapter;Landroid/content/Context;I)I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    new-instance v8, Lk/f2;

    .line 81
    .line 82
    iget v9, v0, Lj/g;->i:I

    .line 83
    .line 84
    iget v10, v0, Lj/g;->j:I

    .line 85
    .line 86
    const/4 v11, 0x0

    .line 87
    invoke-direct {v8, v2, v11, v9, v10}, Lk/a2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 88
    .line 89
    .line 90
    iget-object v2, v0, Lj/g;->q:La3/h0;

    .line 91
    .line 92
    iput-object v2, v8, Lk/f2;->H:La3/h0;

    .line 93
    .line 94
    iput-object v0, v8, Lk/a2;->u:Landroid/widget/AdapterView$OnItemClickListener;

    .line 95
    .line 96
    iget-object v2, v8, Lk/a2;->E:Lk/b0;

    .line 97
    .line 98
    invoke-virtual {v2, v0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 99
    .line 100
    .line 101
    iget-object v2, v0, Lj/g;->t:Landroid/view/View;

    .line 102
    .line 103
    iput-object v2, v8, Lk/a2;->t:Landroid/view/View;

    .line 104
    .line 105
    iget v2, v0, Lj/g;->s:I

    .line 106
    .line 107
    iput v2, v8, Lk/a2;->q:I

    .line 108
    .line 109
    iput-boolean v7, v8, Lk/a2;->D:Z

    .line 110
    .line 111
    iget-object v2, v8, Lk/a2;->E:Lk/b0;

    .line 112
    .line 113
    invoke-virtual {v2, v7}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 114
    .line 115
    .line 116
    iget-object v2, v8, Lk/a2;->E:Lk/b0;

    .line 117
    .line 118
    const/4 v9, 0x2

    .line 119
    invoke-virtual {v2, v9}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v8, v4}, Lk/a2;->p(Landroid/widget/ListAdapter;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8, v5}, Lk/a2;->r(I)V

    .line 126
    .line 127
    .line 128
    iget v2, v0, Lj/g;->s:I

    .line 129
    .line 130
    iput v2, v8, Lk/a2;->q:I

    .line 131
    .line 132
    iget-object v2, v0, Lj/g;->n:Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    if-lez v4, :cond_c

    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    sub-int/2addr v4, v7

    .line 145
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    check-cast v4, Lj/f;

    .line 150
    .line 151
    iget-object v10, v4, Lj/f;->b:Lj/m;

    .line 152
    .line 153
    iget-object v12, v10, Lj/m;->f:Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 156
    .line 157
    .line 158
    move-result v12

    .line 159
    const/4 v13, 0x0

    .line 160
    :goto_3
    if-ge v13, v12, :cond_5

    .line 161
    .line 162
    invoke-virtual {v10, v13}, Lj/m;->getItem(I)Landroid/view/MenuItem;

    .line 163
    .line 164
    .line 165
    move-result-object v14

    .line 166
    invoke-interface {v14}, Landroid/view/MenuItem;->hasSubMenu()Z

    .line 167
    .line 168
    .line 169
    move-result v15

    .line 170
    if-eqz v15, :cond_4

    .line 171
    .line 172
    invoke-interface {v14}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    .line 173
    .line 174
    .line 175
    move-result-object v15

    .line 176
    if-ne v1, v15, :cond_4

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_4
    add-int/lit8 v13, v13, 0x1

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_5
    move-object v14, v11

    .line 183
    :goto_4
    if-nez v14, :cond_6

    .line 184
    .line 185
    move-object v6, v11

    .line 186
    const/16 v16, 0x0

    .line 187
    .line 188
    goto :goto_9

    .line 189
    :cond_6
    iget-object v10, v4, Lj/f;->a:Lk/f2;

    .line 190
    .line 191
    iget-object v10, v10, Lk/a2;->h:Lk/p1;

    .line 192
    .line 193
    invoke-virtual {v10}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    instance-of v13, v12, Landroid/widget/HeaderViewListAdapter;

    .line 198
    .line 199
    if-eqz v13, :cond_7

    .line 200
    .line 201
    check-cast v12, Landroid/widget/HeaderViewListAdapter;

    .line 202
    .line 203
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    .line 204
    .line 205
    .line 206
    move-result v13

    .line 207
    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 208
    .line 209
    .line 210
    move-result-object v12

    .line 211
    check-cast v12, Lj/j;

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_7
    check-cast v12, Lj/j;

    .line 215
    .line 216
    const/4 v13, 0x0

    .line 217
    :goto_5
    invoke-virtual {v12}, Lj/j;->getCount()I

    .line 218
    .line 219
    .line 220
    move-result v15

    .line 221
    const/4 v9, 0x0

    .line 222
    :goto_6
    const/4 v11, -0x1

    .line 223
    const/16 v16, 0x0

    .line 224
    .line 225
    if-ge v9, v15, :cond_9

    .line 226
    .line 227
    invoke-virtual {v12, v9}, Lj/j;->b(I)Lj/o;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    if-ne v14, v6, :cond_8

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_8
    add-int/lit8 v9, v9, 0x1

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_9
    move v9, v11

    .line 238
    :goto_7
    if-ne v9, v11, :cond_a

    .line 239
    .line 240
    goto :goto_8

    .line 241
    :cond_a
    add-int/2addr v9, v13

    .line 242
    invoke-virtual {v10}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    sub-int/2addr v9, v6

    .line 247
    if-ltz v9, :cond_d

    .line 248
    .line 249
    invoke-virtual {v10}, Landroid/view/ViewGroup;->getChildCount()I

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    if-lt v9, v6, :cond_b

    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_b
    invoke-virtual {v10, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    goto :goto_9

    .line 261
    :cond_c
    const/16 v16, 0x0

    .line 262
    .line 263
    const/4 v4, 0x0

    .line 264
    :cond_d
    :goto_8
    const/4 v6, 0x0

    .line 265
    :goto_9
    if-eqz v6, :cond_17

    .line 266
    .line 267
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 268
    .line 269
    const/16 v10, 0x1c

    .line 270
    .line 271
    iget-object v11, v8, Lk/a2;->E:Lk/b0;

    .line 272
    .line 273
    if-gt v9, v10, :cond_e

    .line 274
    .line 275
    sget-object v9, Lk/f2;->I:Ljava/lang/reflect/Method;

    .line 276
    .line 277
    if-eqz v9, :cond_f

    .line 278
    .line 279
    :try_start_0
    new-array v10, v7, [Ljava/lang/Object;

    .line 280
    .line 281
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 282
    .line 283
    aput-object v12, v10, v16

    .line 284
    .line 285
    invoke-virtual {v9, v11, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 286
    .line 287
    .line 288
    goto :goto_a

    .line 289
    :catch_0
    const-string v9, "MenuPopupWindow"

    .line 290
    .line 291
    const-string v10, "Could not invoke setTouchModal() on PopupWindow. Oh well."

    .line 292
    .line 293
    invoke-static {v9, v10}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 294
    .line 295
    .line 296
    goto :goto_a

    .line 297
    :cond_e
    move/from16 v9, v16

    .line 298
    .line 299
    invoke-static {v11, v9}, Lk/d2;->a(Landroid/widget/PopupWindow;Z)V

    .line 300
    .line 301
    .line 302
    :cond_f
    :goto_a
    iget-object v9, v8, Lk/a2;->E:Lk/b0;

    .line 303
    .line 304
    const/4 v10, 0x0

    .line 305
    invoke-static {v9, v10}, Lk/c2;->a(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 309
    .line 310
    .line 311
    move-result v9

    .line 312
    sub-int/2addr v9, v7

    .line 313
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    check-cast v9, Lj/f;

    .line 318
    .line 319
    iget-object v9, v9, Lj/f;->a:Lk/f2;

    .line 320
    .line 321
    iget-object v9, v9, Lk/a2;->h:Lk/p1;

    .line 322
    .line 323
    const/4 v10, 0x2

    .line 324
    new-array v10, v10, [I

    .line 325
    .line 326
    invoke-virtual {v9, v10}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 327
    .line 328
    .line 329
    new-instance v11, Landroid/graphics/Rect;

    .line 330
    .line 331
    invoke-direct {v11}, Landroid/graphics/Rect;-><init>()V

    .line 332
    .line 333
    .line 334
    iget-object v12, v0, Lj/g;->u:Landroid/view/View;

    .line 335
    .line 336
    invoke-virtual {v12, v11}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 337
    .line 338
    .line 339
    iget v12, v0, Lj/g;->v:I

    .line 340
    .line 341
    if-ne v12, v7, :cond_11

    .line 342
    .line 343
    const/16 v16, 0x0

    .line 344
    .line 345
    aget v10, v10, v16

    .line 346
    .line 347
    invoke-virtual {v9}, Landroid/view/View;->getWidth()I

    .line 348
    .line 349
    .line 350
    move-result v9

    .line 351
    add-int/2addr v9, v10

    .line 352
    add-int/2addr v9, v5

    .line 353
    iget v10, v11, Landroid/graphics/Rect;->right:I

    .line 354
    .line 355
    if-le v9, v10, :cond_10

    .line 356
    .line 357
    move/from16 v9, v16

    .line 358
    .line 359
    goto :goto_c

    .line 360
    :cond_10
    :goto_b
    move v9, v7

    .line 361
    goto :goto_c

    .line 362
    :cond_11
    const/16 v16, 0x0

    .line 363
    .line 364
    aget v9, v10, v16

    .line 365
    .line 366
    sub-int/2addr v9, v5

    .line 367
    if-gez v9, :cond_12

    .line 368
    .line 369
    goto :goto_b

    .line 370
    :cond_12
    const/4 v9, 0x0

    .line 371
    :goto_c
    if-ne v9, v7, :cond_13

    .line 372
    .line 373
    move v10, v7

    .line 374
    goto :goto_d

    .line 375
    :cond_13
    const/4 v10, 0x0

    .line 376
    :goto_d
    iput v9, v0, Lj/g;->v:I

    .line 377
    .line 378
    iput-object v6, v8, Lk/a2;->t:Landroid/view/View;

    .line 379
    .line 380
    iget v9, v0, Lj/g;->s:I

    .line 381
    .line 382
    const/4 v11, 0x5

    .line 383
    and-int/2addr v9, v11

    .line 384
    if-ne v9, v11, :cond_15

    .line 385
    .line 386
    if-eqz v10, :cond_14

    .line 387
    .line 388
    const/4 v9, 0x0

    .line 389
    goto :goto_e

    .line 390
    :cond_14
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 391
    .line 392
    .line 393
    move-result v5

    .line 394
    const/4 v9, 0x0

    .line 395
    rsub-int/lit8 v5, v5, 0x0

    .line 396
    .line 397
    goto :goto_e

    .line 398
    :cond_15
    const/4 v9, 0x0

    .line 399
    if-eqz v10, :cond_16

    .line 400
    .line 401
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 402
    .line 403
    .line 404
    move-result v5

    .line 405
    goto :goto_e

    .line 406
    :cond_16
    rsub-int/lit8 v5, v5, 0x0

    .line 407
    .line 408
    :goto_e
    iput v5, v8, Lk/a2;->k:I

    .line 409
    .line 410
    iput-boolean v7, v8, Lk/a2;->p:Z

    .line 411
    .line 412
    iput-boolean v7, v8, Lk/a2;->o:Z

    .line 413
    .line 414
    invoke-virtual {v8, v9}, Lk/a2;->i(I)V

    .line 415
    .line 416
    .line 417
    goto :goto_10

    .line 418
    :cond_17
    iget-boolean v5, v0, Lj/g;->w:Z

    .line 419
    .line 420
    if-eqz v5, :cond_18

    .line 421
    .line 422
    iget v5, v0, Lj/g;->y:I

    .line 423
    .line 424
    iput v5, v8, Lk/a2;->k:I

    .line 425
    .line 426
    :cond_18
    iget-boolean v5, v0, Lj/g;->x:Z

    .line 427
    .line 428
    if-eqz v5, :cond_19

    .line 429
    .line 430
    iget v5, v0, Lj/g;->z:I

    .line 431
    .line 432
    invoke-virtual {v8, v5}, Lk/a2;->i(I)V

    .line 433
    .line 434
    .line 435
    :cond_19
    iget-object v5, v0, Lj/u;->f:Landroid/graphics/Rect;

    .line 436
    .line 437
    if-eqz v5, :cond_1a

    .line 438
    .line 439
    new-instance v10, Landroid/graphics/Rect;

    .line 440
    .line 441
    invoke-direct {v10, v5}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 442
    .line 443
    .line 444
    goto :goto_f

    .line 445
    :cond_1a
    const/4 v10, 0x0

    .line 446
    :goto_f
    iput-object v10, v8, Lk/a2;->C:Landroid/graphics/Rect;

    .line 447
    .line 448
    :goto_10
    new-instance v5, Lj/f;

    .line 449
    .line 450
    iget v6, v0, Lj/g;->v:I

    .line 451
    .line 452
    invoke-direct {v5, v8, v1, v6}, Lj/f;-><init>(Lk/f2;Lj/m;I)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    invoke-virtual {v8}, Lk/a2;->c()V

    .line 459
    .line 460
    .line 461
    iget-object v2, v8, Lk/a2;->h:Lk/p1;

    .line 462
    .line 463
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 464
    .line 465
    .line 466
    if-nez v4, :cond_1b

    .line 467
    .line 468
    iget-boolean v4, v0, Lj/g;->B:Z

    .line 469
    .line 470
    if-eqz v4, :cond_1b

    .line 471
    .line 472
    iget-object v4, v1, Lj/m;->m:Ljava/lang/CharSequence;

    .line 473
    .line 474
    if-eqz v4, :cond_1b

    .line 475
    .line 476
    const v4, 0x7f0c0012

    .line 477
    .line 478
    .line 479
    const/4 v9, 0x0

    .line 480
    invoke-virtual {v3, v4, v2, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 481
    .line 482
    .line 483
    move-result-object v3

    .line 484
    check-cast v3, Landroid/widget/FrameLayout;

    .line 485
    .line 486
    const v4, 0x1020016

    .line 487
    .line 488
    .line 489
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 490
    .line 491
    .line 492
    move-result-object v4

    .line 493
    check-cast v4, Landroid/widget/TextView;

    .line 494
    .line 495
    invoke-virtual {v3, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 496
    .line 497
    .line 498
    iget-object v1, v1, Lj/m;->m:Ljava/lang/CharSequence;

    .line 499
    .line 500
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 501
    .line 502
    .line 503
    const/4 v10, 0x0

    .line 504
    invoke-virtual {v2, v3, v10, v9}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v8}, Lk/a2;->c()V

    .line 508
    .line 509
    .line 510
    :cond_1b
    return-void
.end method
