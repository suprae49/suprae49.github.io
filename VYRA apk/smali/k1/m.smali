.class public final Lk1/m;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk1/m;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 1
    iget v0, p0, Lk1/m;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, -0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Landroid/view/View;

    .line 10
    .line 11
    check-cast p2, Landroid/view/View;

    .line 12
    .line 13
    sget-object v0, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getZ()F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p2}, Landroid/view/View;->getZ()F

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    cmpl-float v0, p1, p2

    .line 24
    .line 25
    if-lez v0, :cond_0

    .line 26
    .line 27
    move v1, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    cmpg-float p1, p1, p2

    .line 30
    .line 31
    if-gez p1, :cond_1

    .line 32
    .line 33
    move v1, v2

    .line 34
    :cond_1
    :goto_0
    return v1

    .line 35
    :pswitch_0
    check-cast p1, Ls/f;

    .line 36
    .line 37
    check-cast p2, Ls/f;

    .line 38
    .line 39
    iget p1, p1, Ls/f;->g:I

    .line 40
    .line 41
    iget p2, p2, Ls/f;->g:I

    .line 42
    .line 43
    :goto_1
    sub-int/2addr p1, p2

    .line 44
    return p1

    .line 45
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 46
    .line 47
    check-cast p2, Landroid/view/View;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    goto :goto_1

    .line 58
    :pswitch_2
    check-cast p1, Lk1/n;

    .line 59
    .line 60
    check-cast p2, Lk1/n;

    .line 61
    .line 62
    iget-object v0, p1, Lk1/n;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 63
    .line 64
    if-nez v0, :cond_2

    .line 65
    .line 66
    move v4, v2

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    move v4, v1

    .line 69
    :goto_2
    iget-object v5, p2, Lk1/n;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 70
    .line 71
    if-nez v5, :cond_3

    .line 72
    .line 73
    move v5, v2

    .line 74
    goto :goto_3

    .line 75
    :cond_3
    move v5, v1

    .line 76
    :goto_3
    if-eq v4, v5, :cond_4

    .line 77
    .line 78
    if-nez v0, :cond_5

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_4
    iget-boolean v0, p1, Lk1/n;->a:Z

    .line 82
    .line 83
    iget-boolean v4, p2, Lk1/n;->a:Z

    .line 84
    .line 85
    if-eq v0, v4, :cond_7

    .line 86
    .line 87
    if-eqz v0, :cond_6

    .line 88
    .line 89
    :cond_5
    move v1, v3

    .line 90
    goto :goto_5

    .line 91
    :cond_6
    :goto_4
    move v1, v2

    .line 92
    goto :goto_5

    .line 93
    :cond_7
    iget v0, p2, Lk1/n;->b:I

    .line 94
    .line 95
    iget v2, p1, Lk1/n;->b:I

    .line 96
    .line 97
    sub-int/2addr v0, v2

    .line 98
    if-eqz v0, :cond_8

    .line 99
    .line 100
    move v1, v0

    .line 101
    goto :goto_5

    .line 102
    :cond_8
    iget p1, p1, Lk1/n;->c:I

    .line 103
    .line 104
    iget p2, p2, Lk1/n;->c:I

    .line 105
    .line 106
    sub-int/2addr p1, p2

    .line 107
    if-eqz p1, :cond_9

    .line 108
    .line 109
    move v1, p1

    .line 110
    :cond_9
    :goto_5
    return v1

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
