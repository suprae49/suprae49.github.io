.class public final Lcom/google/android/material/datepicker/l;
.super Lcom/google/android/material/datepicker/y;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/material/datepicker/y;"
    }
.end annotation


# instance fields
.field public g:I

.field public h:Lcom/google/android/material/datepicker/CalendarConstraints;

.field public i:Lcom/google/android/material/datepicker/Month;

.field public j:I

.field public k:Landroidx/emoji2/text/t;

.field public l:Landroidx/recyclerview/widget/RecyclerView;

.field public m:Landroidx/recyclerview/widget/RecyclerView;

.field public n:Landroid/view/View;

.field public o:Landroid/view/View;

.field public p:Landroid/view/View;

.field public q:Landroid/view/View;

.field public r:Lcom/google/android/material/button/MaterialButton;

.field public s:Landroid/view/accessibility/AccessibilityManager;

.field public t:Lk1/x;

.field public u:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/datepicker/y;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static h(Lcom/google/android/material/datepicker/l;Z)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/datepicker/l;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lk1/b0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/google/android/material/datepicker/x;

    .line 23
    .line 24
    if-eqz v0, :cond_5

    .line 25
    .line 26
    iget-object v2, p0, Lcom/google/android/material/datepicker/l;->i:Lcom/google/android/material/datepicker/Month;

    .line 27
    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/x;->h(Lcom/google/android/material/datepicker/Month;)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    move v3, v1

    .line 38
    goto :goto_0

    .line 39
    :cond_3
    const/4 v3, -0x1

    .line 40
    :goto_0
    add-int/2addr v2, v3

    .line 41
    if-ltz v2, :cond_5

    .line 42
    .line 43
    iget-object v3, v0, Lcom/google/android/material/datepicker/x;->d:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 44
    .line 45
    iget v3, v3, Lcom/google/android/material/datepicker/CalendarConstraints;->l:I

    .line 46
    .line 47
    if-ge v2, v3, :cond_5

    .line 48
    .line 49
    if-eqz p1, :cond_4

    .line 50
    .line 51
    const/4 p1, 0x2

    .line 52
    goto :goto_1

    .line 53
    :cond_4
    move p1, v1

    .line 54
    :goto_1
    iput p1, v0, Lcom/google/android/material/datepicker/x;->i:I

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/x;->g(I)Lcom/google/android/material/datepicker/Month;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/l;->i(Lcom/google/android/material/datepicker/Month;)V

    .line 61
    .line 62
    .line 63
    return v1

    .line 64
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 65
    return p0
.end method


# virtual methods
.method public final g(Lcom/google/android/material/datepicker/p;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/y;->f:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i(Lcom/google/android/material/datepicker/Month;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lk1/b0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/material/datepicker/x;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/x;->h(Lcom/google/android/material/datepicker/Month;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lcom/google/android/material/datepicker/l;->s:Landroid/view/accessibility/AccessibilityManager;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iput-object p1, p0, Lcom/google/android/material/datepicker/l;->i:Lcom/google/android/material/datepicker/Month;

    .line 24
    .line 25
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->a0(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-object v2, p0, Lcom/google/android/material/datepicker/l;->i:Lcom/google/android/material/datepicker/Month;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/x;->h(Lcom/google/android/material/datepicker/Month;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    sub-int v0, v1, v0

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x1

    .line 45
    const/4 v5, 0x3

    .line 46
    if-le v2, v5, :cond_1

    .line 47
    .line 48
    move v2, v4

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move v2, v3

    .line 51
    :goto_0
    if-lez v0, :cond_2

    .line 52
    .line 53
    move v3, v4

    .line 54
    :cond_2
    iput-object p1, p0, Lcom/google/android/material/datepicker/l;->i:Lcom/google/android/material/datepicker/Month;

    .line 55
    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 61
    .line 62
    add-int/lit8 v0, v1, -0x3

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->a0(I)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 68
    .line 69
    new-instance v0, Landroidx/emoji2/text/i;

    .line 70
    .line 71
    const/4 v2, 0x1

    .line 72
    invoke-direct {v0, v1, v2, p0}, Landroidx/emoji2/text/i;-><init>(IILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 80
    .line 81
    if-eqz v2, :cond_4

    .line 82
    .line 83
    add-int/lit8 v0, v1, 0x3

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->a0(I)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 89
    .line 90
    new-instance v0, Landroidx/emoji2/text/i;

    .line 91
    .line 92
    const/4 v2, 0x1

    .line 93
    invoke-direct {v0, v1, v2, p0}, Landroidx/emoji2/text/i;-><init>(IILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    new-instance v0, Landroidx/emoji2/text/i;

    .line 101
    .line 102
    const/4 v2, 0x1

    .line 103
    invoke-direct {v0, v1, v2, p0}, Landroidx/emoji2/text/i;-><init>(IILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 107
    .line 108
    .line 109
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/l;->l()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v1}, Lcom/google/android/material/datepicker/l;->m(I)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final j(I)V
    .locals 4

    .line 1
    iput p1, p0, Lcom/google/android/material/datepicker/l;->j:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lk1/l0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lk1/b0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/google/android/material/datepicker/d0;

    .line 22
    .line 23
    iget-object v3, p0, Lcom/google/android/material/datepicker/l;->i:Lcom/google/android/material/datepicker/Month;

    .line 24
    .line 25
    iget v3, v3, Lcom/google/android/material/datepicker/Month;->h:I

    .line 26
    .line 27
    iget-object v0, v0, Lcom/google/android/material/datepicker/d0;->d:Lcom/google/android/material/datepicker/l;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/google/android/material/datepicker/l;->h:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/google/android/material/datepicker/CalendarConstraints;->f:Lcom/google/android/material/datepicker/Month;

    .line 32
    .line 33
    iget v0, v0, Lcom/google/android/material/datepicker/Month;->h:I

    .line 34
    .line 35
    sub-int/2addr v3, v0

    .line 36
    invoke-virtual {p1, v3}, Lk1/l0;->o0(I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->p:Landroid/view/View;

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->q:Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->n:Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->o:Landroid/view/View;

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    const/4 v0, 0x1

    .line 61
    if-ne p1, v0, :cond_1

    .line 62
    .line 63
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->p:Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->q:Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->n:Landroid/view/View;

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->o:Landroid/view/View;

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->i:Lcom/google/android/material/datepicker/Month;

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/l;->i(Lcom/google/android/material/datepicker/Month;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    return-void
.end method

.method public final k(Landroid/view/View;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget v0, p0, Lcom/google/android/material/datepicker/l;->j:I

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    const v0, 0x7f1100cb

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {p1, v0}, Lp0/p0;->n(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    const/4 v1, 0x1

    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    const v0, 0x7f1100ca

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {p1, v0}, Lp0/p0;->n(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    :goto_0
    return-void
.end method

.method public final l()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lk1/b0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/material/datepicker/x;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, v0, Lk1/b0;->a:Lk1/c0;

    .line 12
    .line 13
    iget-boolean v2, p0, Lcom/google/android/material/datepicker/l;->u:Z

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lcom/google/android/material/datepicker/l;->i:Lcom/google/android/material/datepicker/Month;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iget-object v3, v0, Lcom/google/android/material/datepicker/x;->h:Lcom/google/android/material/datepicker/Month;

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Lcom/google/android/material/datepicker/Month;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    iget-object v3, v0, Lcom/google/android/material/datepicker/x;->h:Lcom/google/android/material/datepicker/Month;

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Lcom/google/android/material/datepicker/x;->h(Lcom/google/android/material/datepicker/Month;)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    iput-object v2, v0, Lcom/google/android/material/datepicker/x;->h:Lcom/google/android/material/datepicker/Month;

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/x;->h(Lcom/google/android/material/datepicker/Month;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v2, 0x1

    .line 42
    invoke-virtual {v1, v3, v2}, Lk1/c0;->c(II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lk1/c0;->c(II)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

.method public final m(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->o:Landroid/view/View;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    add-int/lit8 v3, p1, 0x1

    .line 8
    .line 9
    iget-object v4, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Lk1/b0;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v4}, Lk1/b0;->a()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-ge v3, v4, :cond_0

    .line 20
    .line 21
    move v3, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v3, v1

    .line 24
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->n:Landroid/view/View;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    sub-int/2addr p1, v2

    .line 32
    if-ltz p1, :cond_2

    .line 33
    .line 34
    move v1, v2

    .line 35
    :cond_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 36
    .line 37
    .line 38
    :cond_3
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_0
    const-string v0, "THEME_RES_ID_KEY"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lcom/google/android/material/datepicker/l;->g:I

    .line 17
    .line 18
    const-string v0, "GRID_SELECTOR_KEY"

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 33
    .line 34
    iput-object v0, p0, Lcom/google/android/material/datepicker/l;->h:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 35
    .line 36
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    const-string v0, "CURRENT_MONTH_KEY"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lcom/google/android/material/datepicker/Month;

    .line 51
    .line 52
    iput-object p1, p0, Lcom/google/android/material/datepicker/l;->i:Lcom/google/android/material/datepicker/Month;

    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    invoke-static {}, Landroidx/fragment/app/q;->c()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    invoke-static {}, Landroidx/fragment/app/q;->c()V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    .line 1
    new-instance p3, Landroid/view/ContextThemeWrapper;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lcom/google/android/material/datepicker/l;->g:I

    .line 8
    .line 9
    invoke-direct {p3, v0, v1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Landroidx/emoji2/text/t;

    .line 13
    .line 14
    invoke-direct {v0, p3}, Landroidx/emoji2/text/t;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/google/android/material/datepicker/l;->k:Landroidx/emoji2/text/t;

    .line 18
    .line 19
    invoke-virtual {p1, p3}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "accessibility"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/google/android/material/datepicker/l;->s:Landroid/view/accessibility/AccessibilityManager;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->h:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 38
    .line 39
    iget-object v0, v0, Lcom/google/android/material/datepicker/CalendarConstraints;->f:Lcom/google/android/material/datepicker/Month;

    .line 40
    .line 41
    const v1, 0x101020d

    .line 42
    .line 43
    .line 44
    invoke-static {p3, v1}, Lcom/google/android/material/datepicker/q;->j(Landroid/content/Context;I)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    iput-boolean v1, p0, Lcom/google/android/material/datepicker/l;->u:Z

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    const/4 v3, 0x1

    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    const v1, 0x7f0c0062

    .line 55
    .line 56
    .line 57
    move v4, v3

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const v1, 0x7f0c005d

    .line 60
    .line 61
    .line 62
    move v4, v2

    .line 63
    :goto_0
    invoke-virtual {p1, v1, p2, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    const v1, 0x7f0703de

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    const v5, 0x7f0703df

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    add-int/2addr v5, v1

    .line 90
    const v1, 0x7f0703dd

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    add-int/2addr v1, v5

    .line 98
    const v5, 0x7f0703ce

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    sget v6, Lcom/google/android/material/datepicker/t;->i:I

    .line 106
    .line 107
    const v7, 0x7f0703c9

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    mul-int/2addr v7, v6

    .line 115
    sub-int/2addr v6, v3

    .line 116
    const v8, 0x7f0703dc

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2, v8}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    mul-int/2addr v8, v6

    .line 124
    add-int/2addr v8, v7

    .line 125
    const v6, 0x7f0703c6

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    add-int/2addr v1, v5

    .line 133
    add-int/2addr v1, v8

    .line 134
    add-int/2addr v1, p2

    .line 135
    invoke-virtual {p1, v1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 136
    .line 137
    .line 138
    const p2, 0x7f090145

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    check-cast p2, Landroid/widget/GridView;

    .line 146
    .line 147
    new-instance v1, Lcom/google/android/material/datepicker/e;

    .line 148
    .line 149
    const/4 v5, 0x0

    .line 150
    invoke-direct {v1, v5}, Lcom/google/android/material/datepicker/e;-><init>(I)V

    .line 151
    .line 152
    .line 153
    invoke-static {p2, v1}, Lp0/p0;->m(Landroid/view/View;Lp0/b;)V

    .line 154
    .line 155
    .line 156
    iget-object v1, p0, Lcom/google/android/material/datepicker/l;->h:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 157
    .line 158
    iget v1, v1, Lcom/google/android/material/datepicker/CalendarConstraints;->j:I

    .line 159
    .line 160
    new-instance v5, Lcom/google/android/material/datepicker/c;

    .line 161
    .line 162
    if-lez v1, :cond_1

    .line 163
    .line 164
    invoke-direct {v5, v1}, Lcom/google/android/material/datepicker/c;-><init>(I)V

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_1
    invoke-direct {v5}, Lcom/google/android/material/datepicker/c;-><init>()V

    .line 169
    .line 170
    .line 171
    :goto_1
    invoke-virtual {p2, v5}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 172
    .line 173
    .line 174
    iget v0, v0, Lcom/google/android/material/datepicker/Month;->i:I

    .line 175
    .line 176
    invoke-virtual {p2, v0}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 180
    .line 181
    .line 182
    const p2, 0x7f090148

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 190
    .line 191
    iput-object p2, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 192
    .line 193
    new-instance p2, Lcom/google/android/material/datepicker/f;

    .line 194
    .line 195
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 196
    .line 197
    .line 198
    invoke-direct {p2, p0, v4, v4}, Lcom/google/android/material/datepicker/f;-><init>(Lcom/google/android/material/datepicker/l;II)V

    .line 199
    .line 200
    .line 201
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 202
    .line 203
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lk1/l0;)V

    .line 204
    .line 205
    .line 206
    iget-object p2, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 207
    .line 208
    const-string v0, "MONTHS_VIEW_GROUP_TAG"

    .line 209
    .line 210
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    new-instance p2, Lcom/google/android/material/datepicker/x;

    .line 214
    .line 215
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->h:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 216
    .line 217
    new-instance v1, Lcom/google/android/material/datepicker/g;

    .line 218
    .line 219
    invoke-direct {v1, p0}, Lcom/google/android/material/datepicker/g;-><init>(Lcom/google/android/material/datepicker/l;)V

    .line 220
    .line 221
    .line 222
    new-instance v2, La3/h0;

    .line 223
    .line 224
    const/16 v4, 0x8

    .line 225
    .line 226
    invoke-direct {v2, v4, p0}, La3/h0;-><init>(ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    invoke-direct {p2, p3, v0, v1, v2}, Lcom/google/android/material/datepicker/x;-><init>(Landroid/view/ContextThemeWrapper;Lcom/google/android/material/datepicker/CalendarConstraints;Lcom/google/android/material/datepicker/g;La3/h0;)V

    .line 230
    .line 231
    .line 232
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 233
    .line 234
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lk1/b0;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p3}, Landroid/view/ContextThemeWrapper;->getResources()Landroid/content/res/Resources;

    .line 238
    .line 239
    .line 240
    move-result-object p3

    .line 241
    const v0, 0x7f0a003a

    .line 242
    .line 243
    .line 244
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getInteger(I)I

    .line 245
    .line 246
    .line 247
    move-result p3

    .line 248
    const v0, 0x7f09014b

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 256
    .line 257
    iput-object v1, p0, Lcom/google/android/material/datepicker/l;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 258
    .line 259
    if-eqz v1, :cond_2

    .line 260
    .line 261
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 262
    .line 263
    .line 264
    iget-object v1, p0, Lcom/google/android/material/datepicker/l;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 265
    .line 266
    new-instance v2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 267
    .line 268
    invoke-direct {v2, p3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lk1/l0;)V

    .line 272
    .line 273
    .line 274
    iget-object p3, p0, Lcom/google/android/material/datepicker/l;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 275
    .line 276
    new-instance v1, Lcom/google/android/material/datepicker/d0;

    .line 277
    .line 278
    invoke-direct {v1, p0}, Lcom/google/android/material/datepicker/d0;-><init>(Lcom/google/android/material/datepicker/l;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p3, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Lk1/b0;)V

    .line 282
    .line 283
    .line 284
    iget-object p3, p0, Lcom/google/android/material/datepicker/l;->l:Landroidx/recyclerview/widget/RecyclerView;

    .line 285
    .line 286
    new-instance v1, Lcom/google/android/material/datepicker/h;

    .line 287
    .line 288
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 289
    .line 290
    .line 291
    const/4 v2, 0x0

    .line 292
    invoke-static {v2}, Lcom/google/android/material/datepicker/b0;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 293
    .line 294
    .line 295
    invoke-static {v2}, Lcom/google/android/material/datepicker/b0;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 296
    .line 297
    .line 298
    invoke-virtual {p3, v1}, Landroidx/recyclerview/widget/RecyclerView;->g(Lk1/i0;)V

    .line 299
    .line 300
    .line 301
    :cond_2
    iget-boolean p3, p0, Lcom/google/android/material/datepicker/l;->u:Z

    .line 302
    .line 303
    if-nez p3, :cond_7

    .line 304
    .line 305
    new-instance p3, Lk1/x;

    .line 306
    .line 307
    invoke-direct {p3}, Lk1/x;-><init>()V

    .line 308
    .line 309
    .line 310
    iput-object p3, p0, Lcom/google/android/material/datepicker/l;->t:Lk1/x;

    .line 311
    .line 312
    iget-object v1, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 313
    .line 314
    iget-object v2, p3, Lk1/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 315
    .line 316
    if-ne v2, v1, :cond_3

    .line 317
    .line 318
    goto :goto_2

    .line 319
    :cond_3
    iget-object v4, p3, Lk1/x;->b:Lk1/a1;

    .line 320
    .line 321
    if-eqz v2, :cond_5

    .line 322
    .line 323
    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView;->m0:Ljava/util/ArrayList;

    .line 324
    .line 325
    if-eqz v2, :cond_4

    .line 326
    .line 327
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    :cond_4
    iget-object v2, p3, Lk1/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 331
    .line 332
    const/4 v5, 0x0

    .line 333
    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(Lk1/n0;)V

    .line 334
    .line 335
    .line 336
    :cond_5
    iput-object v1, p3, Lk1/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 337
    .line 338
    if-eqz v1, :cond_7

    .line 339
    .line 340
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getOnFlingListener()Lk1/n0;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    if-nez v1, :cond_6

    .line 345
    .line 346
    iget-object v1, p3, Lk1/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 347
    .line 348
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->h(Lk1/o0;)V

    .line 349
    .line 350
    .line 351
    iget-object v1, p3, Lk1/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 352
    .line 353
    invoke-virtual {v1, p3}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(Lk1/n0;)V

    .line 354
    .line 355
    .line 356
    new-instance v1, Landroid/widget/Scroller;

    .line 357
    .line 358
    iget-object v2, p3, Lk1/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 359
    .line 360
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    new-instance v4, Landroid/view/animation/DecelerateInterpolator;

    .line 365
    .line 366
    invoke-direct {v4}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 367
    .line 368
    .line 369
    invoke-direct {v1, v2, v4}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {p3}, Lk1/x;->f()V

    .line 373
    .line 374
    .line 375
    goto :goto_2

    .line 376
    :cond_6
    const-string p1, "An instance of OnFlingListener already set."

    .line 377
    .line 378
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    const/4 p1, 0x0

    .line 382
    return-object p1

    .line 383
    :cond_7
    :goto_2
    const p3, 0x7f09013f

    .line 384
    .line 385
    .line 386
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    if-eqz v1, :cond_8

    .line 391
    .line 392
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 393
    .line 394
    .line 395
    move-result-object p3

    .line 396
    check-cast p3, Lcom/google/android/material/button/MaterialButton;

    .line 397
    .line 398
    iput-object p3, p0, Lcom/google/android/material/datepicker/l;->r:Lcom/google/android/material/button/MaterialButton;

    .line 399
    .line 400
    const-string v1, "SELECTOR_TOGGLE_TAG"

    .line 401
    .line 402
    invoke-virtual {p3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    iget-object p3, p0, Lcom/google/android/material/datepicker/l;->r:Lcom/google/android/material/button/MaterialButton;

    .line 406
    .line 407
    new-instance v1, Lcom/google/android/material/datepicker/i;

    .line 408
    .line 409
    const/4 v2, 0x0

    .line 410
    invoke-direct {v1, v2, p0}, Lcom/google/android/material/datepicker/i;-><init>(ILjava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    invoke-static {p3, v1}, Lp0/p0;->m(Landroid/view/View;Lp0/b;)V

    .line 414
    .line 415
    .line 416
    const p3, 0x7f090141

    .line 417
    .line 418
    .line 419
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 420
    .line 421
    .line 422
    move-result-object p3

    .line 423
    iput-object p3, p0, Lcom/google/android/material/datepicker/l;->n:Landroid/view/View;

    .line 424
    .line 425
    const-string v1, "NAVIGATION_PREV_TAG"

    .line 426
    .line 427
    invoke-virtual {p3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    iget-object p3, p0, Lcom/google/android/material/datepicker/l;->n:Landroid/view/View;

    .line 431
    .line 432
    const v1, 0x7f1100cc

    .line 433
    .line 434
    .line 435
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    invoke-static {p3, v1}, Lk/l3;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 440
    .line 441
    .line 442
    const p3, 0x7f090140

    .line 443
    .line 444
    .line 445
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 446
    .line 447
    .line 448
    move-result-object p3

    .line 449
    iput-object p3, p0, Lcom/google/android/material/datepicker/l;->o:Landroid/view/View;

    .line 450
    .line 451
    const-string v1, "NAVIGATION_NEXT_TAG"

    .line 452
    .line 453
    invoke-virtual {p3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    iget-object p3, p0, Lcom/google/android/material/datepicker/l;->o:Landroid/view/View;

    .line 457
    .line 458
    const v1, 0x7f1100c8

    .line 459
    .line 460
    .line 461
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    invoke-static {p3, v1}, Lk/l3;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 469
    .line 470
    .line 471
    move-result-object p3

    .line 472
    iput-object p3, p0, Lcom/google/android/material/datepicker/l;->p:Landroid/view/View;

    .line 473
    .line 474
    const p3, 0x7f090144

    .line 475
    .line 476
    .line 477
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 478
    .line 479
    .line 480
    move-result-object p3

    .line 481
    iput-object p3, p0, Lcom/google/android/material/datepicker/l;->q:Landroid/view/View;

    .line 482
    .line 483
    invoke-virtual {p0, v3}, Lcom/google/android/material/datepicker/l;->j(I)V

    .line 484
    .line 485
    .line 486
    iget-object p3, p0, Lcom/google/android/material/datepicker/l;->r:Lcom/google/android/material/button/MaterialButton;

    .line 487
    .line 488
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->i:Lcom/google/android/material/datepicker/Month;

    .line 489
    .line 490
    invoke-virtual {v0}, Lcom/google/android/material/datepicker/Month;->c()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 495
    .line 496
    .line 497
    iget-object p3, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 498
    .line 499
    new-instance v0, Lcom/google/android/material/datepicker/j;

    .line 500
    .line 501
    invoke-direct {v0, p0, p2}, Lcom/google/android/material/datepicker/j;-><init>(Lcom/google/android/material/datepicker/l;Lcom/google/android/material/datepicker/x;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/RecyclerView;->h(Lk1/o0;)V

    .line 505
    .line 506
    .line 507
    iget-object p3, p0, Lcom/google/android/material/datepicker/l;->r:Lcom/google/android/material/button/MaterialButton;

    .line 508
    .line 509
    new-instance v0, Lcom/google/android/material/datepicker/k;

    .line 510
    .line 511
    const/4 v1, 0x0

    .line 512
    invoke-direct {v0, v1, p0}, Lcom/google/android/material/datepicker/k;-><init>(ILjava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {p3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 516
    .line 517
    .line 518
    iget-object p3, p0, Lcom/google/android/material/datepicker/l;->o:Landroid/view/View;

    .line 519
    .line 520
    new-instance v0, Lcom/google/android/material/datepicker/d;

    .line 521
    .line 522
    invoke-direct {v0, p0, p2, v1}, Lcom/google/android/material/datepicker/d;-><init>(Lcom/google/android/material/datepicker/l;Lcom/google/android/material/datepicker/x;I)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {p3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 526
    .line 527
    .line 528
    iget-object p3, p0, Lcom/google/android/material/datepicker/l;->n:Landroid/view/View;

    .line 529
    .line 530
    new-instance v0, Lcom/google/android/material/datepicker/d;

    .line 531
    .line 532
    const/4 v1, 0x1

    .line 533
    invoke-direct {v0, p0, p2, v1}, Lcom/google/android/material/datepicker/d;-><init>(Lcom/google/android/material/datepicker/l;Lcom/google/android/material/datepicker/x;I)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {p3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 537
    .line 538
    .line 539
    iget-object p3, p0, Lcom/google/android/material/datepicker/l;->i:Lcom/google/android/material/datepicker/Month;

    .line 540
    .line 541
    invoke-virtual {p2, p3}, Lcom/google/android/material/datepicker/x;->h(Lcom/google/android/material/datepicker/Month;)I

    .line 542
    .line 543
    .line 544
    move-result p3

    .line 545
    invoke-virtual {p0, p3}, Lcom/google/android/material/datepicker/l;->m(I)V

    .line 546
    .line 547
    .line 548
    :cond_8
    iget-object p3, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 549
    .line 550
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->i:Lcom/google/android/material/datepicker/Month;

    .line 551
    .line 552
    invoke-virtual {p2, v0}, Lcom/google/android/material/datepicker/x;->h(Lcom/google/android/material/datepicker/Month;)I

    .line 553
    .line 554
    .line 555
    move-result p2

    .line 556
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->a0(I)V

    .line 557
    .line 558
    .line 559
    iget-object p2, p0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 560
    .line 561
    new-instance p3, Lcom/google/android/material/datepicker/e;

    .line 562
    .line 563
    const/4 v0, 0x1

    .line 564
    invoke-direct {p3, v0}, Lcom/google/android/material/datepicker/e;-><init>(I)V

    .line 565
    .line 566
    .line 567
    invoke-static {p2, p3}, Lp0/p0;->m(Landroid/view/View;Lp0/b;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/l;->k(Landroid/view/View;)V

    .line 571
    .line 572
    .line 573
    return-object p1
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    const-string v0, "THEME_RES_ID_KEY"

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/material/datepicker/l;->g:I

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    const-string v0, "GRID_SELECTOR_KEY"

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 15
    .line 16
    iget-object v2, p0, Lcom/google/android/material/datepicker/l;->h:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 17
    .line 18
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "CURRENT_MONTH_KEY"

    .line 27
    .line 28
    iget-object v1, p0, Lcom/google/android/material/datepicker/l;->i:Lcom/google/android/material/datepicker/Month;

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
