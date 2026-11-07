.class public final Landroidx/activity/b0;
.super Lr3/h;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lq3/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroidx/activity/j0;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/j0;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/b0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/activity/b0;->h:Landroidx/activity/j0;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lr3/h;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/activity/b0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroidx/activity/b;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/activity/b0;->h:Landroidx/activity/j0;

    .line 12
    .line 13
    iget-object v0, p1, Landroidx/activity/j0;->c:Landroidx/fragment/app/m0;

    .line 14
    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iget-object p1, p1, Landroidx/activity/j0;->b:Lh3/c;

    .line 18
    .line 19
    iget v0, p1, Lh3/c;->h:I

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :cond_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v1, v0

    .line 36
    check-cast v1, Landroidx/fragment/app/m0;

    .line 37
    .line 38
    iget-boolean v1, v1, Landroidx/fragment/app/m0;->a:Z

    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v0, 0x0

    .line 44
    :goto_0
    check-cast v0, Landroidx/fragment/app/m0;

    .line 45
    .line 46
    :cond_2
    sget-object p1, Lg3/g;->a:Lg3/g;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_0
    check-cast p1, Landroidx/activity/b;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Landroidx/activity/b0;->h:Landroidx/activity/j0;

    .line 55
    .line 56
    iget-object v0, p1, Landroidx/activity/j0;->b:Lh3/c;

    .line 57
    .line 58
    iget v1, v0, Lh3/c;->h:I

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :cond_3
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    move-object v2, v1

    .line 75
    check-cast v2, Landroidx/fragment/app/m0;

    .line 76
    .line 77
    iget-boolean v2, v2, Landroidx/fragment/app/m0;->a:Z

    .line 78
    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    const/4 v1, 0x0

    .line 83
    :goto_1
    check-cast v1, Landroidx/fragment/app/m0;

    .line 84
    .line 85
    iget-object v0, p1, Landroidx/activity/j0;->c:Landroidx/fragment/app/m0;

    .line 86
    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    invoke-virtual {p1}, Landroidx/activity/j0;->c()V

    .line 90
    .line 91
    .line 92
    :cond_5
    iput-object v1, p1, Landroidx/activity/j0;->c:Landroidx/fragment/app/m0;

    .line 93
    .line 94
    sget-object p1, Lg3/g;->a:Lg3/g;

    .line 95
    .line 96
    return-object p1

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
