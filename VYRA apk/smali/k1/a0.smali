.class public final Lk1/a0;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic a:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lk1/a;)V
    .locals 3

    .line 1
    iget v0, p1, Lk1/a;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    if-eq v0, v1, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView;->r:Lk1/l0;

    .line 20
    .line 21
    iget v1, p1, Lk1/a;->b:I

    .line 22
    .line 23
    iget p1, p1, Lk1/a;->d:I

    .line 24
    .line 25
    invoke-virtual {v0, v1, p1}, Lk1/l0;->Z(II)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView;->r:Lk1/l0;

    .line 30
    .line 31
    iget v1, p1, Lk1/a;->b:I

    .line 32
    .line 33
    iget p1, p1, Lk1/a;->d:I

    .line 34
    .line 35
    invoke-virtual {v0, v1, p1}, Lk1/l0;->b0(II)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView;->r:Lk1/l0;

    .line 40
    .line 41
    iget v1, p1, Lk1/a;->b:I

    .line 42
    .line 43
    iget p1, p1, Lk1/a;->d:I

    .line 44
    .line 45
    invoke-virtual {v0, v1, p1}, Lk1/l0;->a0(II)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView;->r:Lk1/l0;

    .line 50
    .line 51
    iget v1, p1, Lk1/a;->b:I

    .line 52
    .line 53
    iget p1, p1, Lk1/a;->d:I

    .line 54
    .line 55
    invoke-virtual {v0, v1, p1}, Lk1/l0;->X(II)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public b(I)Lk1/x0;
    .locals 7

    .line 1
    iget-object v0, p0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroidx/emoji2/text/t;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/emoji2/text/t;->n()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    move-object v4, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_3

    .line 13
    .line 14
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroidx/emoji2/text/t;

    .line 15
    .line 16
    invoke-virtual {v5, v3}, Landroidx/emoji2/text/t;->m(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lk1/x0;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    if-eqz v5, :cond_2

    .line 25
    .line 26
    invoke-virtual {v5}, Lk1/x0;->h()Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-nez v6, :cond_2

    .line 31
    .line 32
    iget v6, v5, Lk1/x0;->c:I

    .line 33
    .line 34
    if-eq v6, p1, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroidx/emoji2/text/t;

    .line 38
    .line 39
    iget-object v6, v5, Lk1/x0;->a:Landroid/view/View;

    .line 40
    .line 41
    iget-object v4, v4, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v4, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    move-object v4, v5

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object v4, v5

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    :goto_2
    if-nez v4, :cond_4

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroidx/emoji2/text/t;

    .line 62
    .line 63
    iget-object v0, v4, Lk1/x0;->a:Landroid/view/View;

    .line 64
    .line 65
    iget-object p1, p1, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p1, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_5

    .line 74
    .line 75
    :goto_3
    return-object v2

    .line 76
    :cond_5
    return-object v4
.end method

.method public c(IILjava/lang/Object;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroidx/emoji2/text/t;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/emoji2/text/t;->n()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr p2, p1

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    const/4 v3, 0x2

    .line 12
    const/4 v4, 0x1

    .line 13
    if-ge v2, v1, :cond_5

    .line 14
    .line 15
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroidx/emoji2/text/t;

    .line 16
    .line 17
    invoke-virtual {v5, v2}, Landroidx/emoji2/text/t;->m(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lk1/x0;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    if-eqz v6, :cond_4

    .line 26
    .line 27
    invoke-virtual {v6}, Lk1/x0;->o()Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-eqz v7, :cond_0

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_0
    iget v7, v6, Lk1/x0;->c:I

    .line 35
    .line 36
    if-lt v7, p1, :cond_4

    .line 37
    .line 38
    if-ge v7, p2, :cond_4

    .line 39
    .line 40
    invoke-virtual {v6, v3}, Lk1/x0;->a(I)V

    .line 41
    .line 42
    .line 43
    const/16 v3, 0x400

    .line 44
    .line 45
    if-nez p3, :cond_1

    .line 46
    .line 47
    invoke-virtual {v6, v3}, Lk1/x0;->a(I)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    iget v7, v6, Lk1/x0;->j:I

    .line 52
    .line 53
    and-int/2addr v3, v7

    .line 54
    if-nez v3, :cond_3

    .line 55
    .line 56
    iget-object v3, v6, Lk1/x0;->k:Ljava/util/ArrayList;

    .line 57
    .line 58
    if-nez v3, :cond_2

    .line 59
    .line 60
    new-instance v3, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v3, v6, Lk1/x0;->k:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    iput-object v3, v6, Lk1/x0;->l:Ljava/util/List;

    .line 72
    .line 73
    :cond_2
    iget-object v3, v6, Lk1/x0;->k:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v3, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_3
    :goto_1
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, Lk1/m0;

    .line 83
    .line 84
    iput-boolean v4, v3, Lk1/m0;->c:Z

    .line 85
    .line 86
    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    iget-object p3, v0, Landroidx/recyclerview/widget/RecyclerView;->g:Lv1/b;

    .line 90
    .line 91
    iget-object v1, p3, Lv1/b;->e:Ljava/io/Serializable;

    .line 92
    .line 93
    check-cast v1, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    sub-int/2addr v2, v4

    .line 100
    :goto_3
    if-ltz v2, :cond_8

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    check-cast v5, Lk1/x0;

    .line 107
    .line 108
    if-nez v5, :cond_6

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_6
    iget v6, v5, Lk1/x0;->c:I

    .line 112
    .line 113
    if-lt v6, p1, :cond_7

    .line 114
    .line 115
    if-ge v6, p2, :cond_7

    .line 116
    .line 117
    invoke-virtual {v5, v3}, Lk1/x0;->a(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p3, v2}, Lv1/b;->h(I)V

    .line 121
    .line 122
    .line 123
    :cond_7
    :goto_4
    add-int/lit8 v2, v2, -0x1

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_8
    iput-boolean v4, v0, Landroidx/recyclerview/widget/RecyclerView;->o0:Z

    .line 127
    .line 128
    return-void
.end method

.method public d(II)V
    .locals 8

    .line 1
    iget-object v0, p0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroidx/emoji2/text/t;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/emoji2/text/t;->n()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    const/4 v4, 0x1

    .line 12
    if-ge v3, v1, :cond_1

    .line 13
    .line 14
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroidx/emoji2/text/t;

    .line 15
    .line 16
    invoke-virtual {v5, v3}, Landroidx/emoji2/text/t;->m(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lk1/x0;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    invoke-virtual {v5}, Lk1/x0;->o()Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-nez v6, :cond_0

    .line 31
    .line 32
    iget v6, v5, Lk1/x0;->c:I

    .line 33
    .line 34
    if-lt v6, p1, :cond_0

    .line 35
    .line 36
    invoke-virtual {v5, p2, v2}, Lk1/x0;->l(IZ)V

    .line 37
    .line 38
    .line 39
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->k0:Lk1/u0;

    .line 40
    .line 41
    iput-boolean v4, v5, Lk1/u0;->f:Z

    .line 42
    .line 43
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->g:Lv1/b;

    .line 47
    .line 48
    iget-object v1, v1, Lv1/b;->e:Ljava/io/Serializable;

    .line 49
    .line 50
    check-cast v1, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    move v5, v2

    .line 57
    :goto_1
    if-ge v5, v3, :cond_3

    .line 58
    .line 59
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    check-cast v6, Lk1/x0;

    .line 64
    .line 65
    if-eqz v6, :cond_2

    .line 66
    .line 67
    iget v7, v6, Lk1/x0;->c:I

    .line 68
    .line 69
    if-lt v7, p1, :cond_2

    .line 70
    .line 71
    invoke-virtual {v6, p2, v2}, Lk1/x0;->l(IZ)V

    .line 72
    .line 73
    .line 74
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 78
    .line 79
    .line 80
    iput-boolean v4, v0, Landroidx/recyclerview/widget/RecyclerView;->n0:Z

    .line 81
    .line 82
    return-void
.end method

.method public e(II)V
    .locals 11

    .line 1
    iget-object v0, p0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroidx/emoji2/text/t;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/emoji2/text/t;->n()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, -0x1

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ge p1, p2, :cond_0

    .line 12
    .line 13
    move v4, p1

    .line 14
    move v5, p2

    .line 15
    move v6, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v5, p1

    .line 18
    move v4, p2

    .line 19
    move v6, v3

    .line 20
    :goto_0
    const/4 v7, 0x0

    .line 21
    move v8, v7

    .line 22
    :goto_1
    if-ge v8, v1, :cond_4

    .line 23
    .line 24
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView;->j:Landroidx/emoji2/text/t;

    .line 25
    .line 26
    invoke-virtual {v9, v8}, Landroidx/emoji2/text/t;->m(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v9

    .line 30
    invoke-static {v9}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lk1/x0;

    .line 31
    .line 32
    .line 33
    move-result-object v9

    .line 34
    if-eqz v9, :cond_3

    .line 35
    .line 36
    iget v10, v9, Lk1/x0;->c:I

    .line 37
    .line 38
    if-lt v10, v4, :cond_3

    .line 39
    .line 40
    if-le v10, v5, :cond_1

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_1
    if-ne v10, p1, :cond_2

    .line 44
    .line 45
    sub-int v10, p2, p1

    .line 46
    .line 47
    invoke-virtual {v9, v10, v7}, Lk1/x0;->l(IZ)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-virtual {v9, v6, v7}, Lk1/x0;->l(IZ)V

    .line 52
    .line 53
    .line 54
    :goto_2
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView;->k0:Lk1/u0;

    .line 55
    .line 56
    iput-boolean v3, v9, Lk1/u0;->f:Z

    .line 57
    .line 58
    :cond_3
    :goto_3
    add-int/lit8 v8, v8, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->g:Lv1/b;

    .line 62
    .line 63
    iget-object v1, v1, Lv1/b;->e:Ljava/io/Serializable;

    .line 64
    .line 65
    check-cast v1, Ljava/util/ArrayList;

    .line 66
    .line 67
    if-ge p1, p2, :cond_5

    .line 68
    .line 69
    move v4, p1

    .line 70
    move v5, p2

    .line 71
    goto :goto_4

    .line 72
    :cond_5
    move v5, p1

    .line 73
    move v4, p2

    .line 74
    move v2, v3

    .line 75
    :goto_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    move v8, v7

    .line 80
    :goto_5
    if-ge v8, v6, :cond_9

    .line 81
    .line 82
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v9

    .line 86
    check-cast v9, Lk1/x0;

    .line 87
    .line 88
    if-eqz v9, :cond_8

    .line 89
    .line 90
    iget v10, v9, Lk1/x0;->c:I

    .line 91
    .line 92
    if-lt v10, v4, :cond_8

    .line 93
    .line 94
    if-le v10, v5, :cond_6

    .line 95
    .line 96
    goto :goto_6

    .line 97
    :cond_6
    if-ne v10, p1, :cond_7

    .line 98
    .line 99
    sub-int v10, p2, p1

    .line 100
    .line 101
    invoke-virtual {v9, v10, v7}, Lk1/x0;->l(IZ)V

    .line 102
    .line 103
    .line 104
    goto :goto_6

    .line 105
    :cond_7
    invoke-virtual {v9, v2, v7}, Lk1/x0;->l(IZ)V

    .line 106
    .line 107
    .line 108
    :cond_8
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_9
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 112
    .line 113
    .line 114
    iput-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView;->n0:Z

    .line 115
    .line 116
    return-void
.end method

.method public f(Lk1/x0;Lk1/g0;Lk1/g0;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Lk1/x0;->n(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->P:Lk1/h0;

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lk1/i;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget v4, p2, Lk1/g0;->a:I

    .line 18
    .line 19
    iget v6, p3, Lk1/g0;->a:I

    .line 20
    .line 21
    if-ne v4, v6, :cond_1

    .line 22
    .line 23
    iget v1, p2, Lk1/g0;->b:I

    .line 24
    .line 25
    iget v3, p3, Lk1/g0;->b:I

    .line 26
    .line 27
    if-eq v1, v3, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v3, p1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    iget v5, p2, Lk1/g0;->b:I

    .line 33
    .line 34
    iget v7, p3, Lk1/g0;->b:I

    .line 35
    .line 36
    move-object v3, p1

    .line 37
    invoke-virtual/range {v2 .. v7}, Lk1/i;->g(Lk1/x0;IIII)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    goto :goto_2

    .line 42
    :goto_1
    invoke-virtual {v2, v3}, Lk1/i;->l(Lk1/x0;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, v3, Lk1/x0;->a:Landroid/view/View;

    .line 46
    .line 47
    const/4 p2, 0x0

    .line 48
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 49
    .line 50
    .line 51
    iget-object p1, v2, Lk1/i;->i:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    :goto_2
    if-eqz p1, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->S()V

    .line 60
    .line 61
    .line 62
    :cond_2
    return-void
.end method

.method public g(Lk1/x0;Lk1/g0;Lk1/g0;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->g:Lv1/b;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lv1/b;->n(Lk1/x0;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->f(Lk1/x0;)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p1, v1}, Lk1/x0;->n(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->P:Lk1/h0;

    .line 16
    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, Lk1/i;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget v4, p2, Lk1/g0;->a:I

    .line 24
    .line 25
    iget v5, p2, Lk1/g0;->b:I

    .line 26
    .line 27
    iget-object p2, p1, Lk1/x0;->a:Landroid/view/View;

    .line 28
    .line 29
    if-nez p3, :cond_0

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    :goto_0
    move v6, v1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    iget v1, p3, Lk1/g0;->a:I

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :goto_1
    if-nez p3, :cond_1

    .line 41
    .line 42
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    :goto_2
    move v7, p3

    .line 47
    goto :goto_3

    .line 48
    :cond_1
    iget p3, p3, Lk1/g0;->b:I

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :goto_3
    invoke-virtual {p1}, Lk1/x0;->h()Z

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    if-nez p3, :cond_2

    .line 56
    .line 57
    if-ne v4, v6, :cond_3

    .line 58
    .line 59
    if-eq v5, v7, :cond_2

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_2
    move-object v3, p1

    .line 63
    goto :goto_5

    .line 64
    :cond_3
    :goto_4
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    add-int/2addr p3, v6

    .line 69
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    add-int/2addr v1, v7

    .line 74
    invoke-virtual {p2, v6, v7, p3, v1}, Landroid/view/View;->layout(IIII)V

    .line 75
    .line 76
    .line 77
    move-object v3, p1

    .line 78
    invoke-virtual/range {v2 .. v7}, Lk1/i;->g(Lk1/x0;IIII)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    goto :goto_6

    .line 83
    :goto_5
    invoke-virtual {v2, v3}, Lk1/i;->l(Lk1/x0;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, v2, Lk1/i;->h:Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    const/4 p1, 0x1

    .line 92
    :goto_6
    if-eqz p1, :cond_4

    .line 93
    .line 94
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->S()V

    .line 95
    .line 96
    .line 97
    :cond_4
    return-void
.end method

.method public h(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk1/a0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Lk1/x0;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/view/View;->clearAnimation()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
