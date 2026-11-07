.class public final Landroidx/emoji2/text/i;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final g:I

.field public final h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 22
    iput p2, p0, Landroidx/emoji2/text/i;->f:I

    iput-object p3, p0, Landroidx/emoji2/text/i;->h:Ljava/lang/Object;

    iput p1, p0, Landroidx/emoji2/text/i;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;ILjava/lang/Throwable;)V
    .locals 0

    .line 1
    const/4 p3, 0x0

    .line 2
    iput p3, p0, Landroidx/emoji2/text/i;->f:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const-string p3, "initCallbacks cannot be null"

    .line 8
    .line 9
    invoke-static {p1, p3}, Lu1/h0;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance p3, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    iput-object p3, p0, Landroidx/emoji2/text/i;->h:Ljava/lang/Object;

    .line 18
    .line 19
    iput p2, p0, Landroidx/emoji2/text/i;->g:I

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Landroidx/emoji2/text/i;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/emoji2/text/i;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lu2/f;

    .line 9
    .line 10
    iget v1, p0, Landroidx/emoji2/text/i;->g:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lu2/f;->k(I)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Landroidx/emoji2/text/i;->h:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La3/h0;

    .line 19
    .line 20
    iget-object v0, v0, La3/h0;->g:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Le0/b;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget v1, p0, Landroidx/emoji2/text/i;->g:I

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Le0/b;->h(I)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    :pswitch_1
    iget-object v0, p0, Landroidx/emoji2/text/i;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lcom/google/android/material/datepicker/l;

    .line 35
    .line 36
    iget-object v0, v0, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Z

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->r:Lk1/l0;

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    const-string v0, "RecyclerView"

    .line 48
    .line 49
    const-string v1, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 50
    .line 51
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iget v2, p0, Landroidx/emoji2/text/i;->g:I

    .line 56
    .line 57
    invoke-virtual {v1, v0, v2}, Lk1/l0;->y0(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 58
    .line 59
    .line 60
    :goto_0
    return-void

    .line 61
    :pswitch_2
    iget-object v0, p0, Landroidx/emoji2/text/i;->h:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iget v2, p0, Landroidx/emoji2/text/i;->g:I

    .line 70
    .line 71
    const/4 v3, 0x1

    .line 72
    const/4 v4, 0x0

    .line 73
    if-eq v2, v3, :cond_3

    .line 74
    .line 75
    :goto_1
    if-ge v4, v1, :cond_4

    .line 76
    .line 77
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Landroidx/emoji2/text/h;

    .line 82
    .line 83
    invoke-virtual {v2}, Landroidx/emoji2/text/h;->a()V

    .line 84
    .line 85
    .line 86
    add-int/lit8 v4, v4, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    :goto_2
    if-ge v4, v1, :cond_4

    .line 90
    .line 91
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Landroidx/emoji2/text/h;

    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/emoji2/text/h;->b()V

    .line 98
    .line 99
    .line 100
    add-int/lit8 v4, v4, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    return-void

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
