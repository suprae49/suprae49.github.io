.class public Landroidx/activity/y;
.super Landroidx/activity/w;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# virtual methods
.method public b(Landroidx/activity/m0;Landroidx/activity/m0;Landroid/view/Window;Landroid/view/View;ZZ)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget v0, p2, Landroidx/activity/m0;->c:I

    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {p3, v1}, Le4/a;->d0(Landroid/view/Window;Z)V

    .line 17
    .line 18
    .line 19
    iget v2, p1, Landroidx/activity/m0;->c:I

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    move p1, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-eqz p5, :cond_1

    .line 26
    .line 27
    iget p1, p1, Landroidx/activity/m0;->b:I

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget p1, p1, Landroidx/activity/m0;->a:I

    .line 31
    .line 32
    :goto_0
    invoke-virtual {p3, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 33
    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    move p1, v1

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    if-eqz p6, :cond_3

    .line 40
    .line 41
    iget p1, p2, Landroidx/activity/m0;->b:I

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    iget p1, p2, Landroidx/activity/m0;->a:I

    .line 45
    .line 46
    :goto_1
    invoke-virtual {p3, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 47
    .line 48
    .line 49
    invoke-static {p3}, Landroidx/activity/x;->s(Landroid/view/Window;)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    if-nez v0, :cond_4

    .line 54
    .line 55
    move v1, p1

    .line 56
    :cond_4
    invoke-static {p3, v1}, Landroidx/activity/x;->t(Landroid/view/Window;Z)V

    .line 57
    .line 58
    .line 59
    new-instance p2, La3/h0;

    .line 60
    .line 61
    invoke-direct {p2, p4}, La3/h0;-><init>(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    sget p4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 65
    .line 66
    const/16 v0, 0x23

    .line 67
    .line 68
    if-lt p4, v0, :cond_5

    .line 69
    .line 70
    new-instance p4, Lp0/b2;

    .line 71
    .line 72
    invoke-direct {p4, p3, p2}, Lp0/a2;-><init>(Landroid/view/Window;La3/h0;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_5
    const/16 v0, 0x1e

    .line 77
    .line 78
    if-lt p4, v0, :cond_6

    .line 79
    .line 80
    new-instance p4, Lp0/a2;

    .line 81
    .line 82
    invoke-direct {p4, p3, p2}, Lp0/a2;-><init>(Landroid/view/Window;La3/h0;)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_6
    new-instance p4, Lp0/z1;

    .line 87
    .line 88
    invoke-direct {p4, p3, p2}, Lp0/z1;-><init>(Landroid/view/Window;La3/h0;)V

    .line 89
    .line 90
    .line 91
    :goto_2
    xor-int/lit8 p2, p5, 0x1

    .line 92
    .line 93
    invoke-virtual {p4, p2}, Le4/a;->c0(Z)V

    .line 94
    .line 95
    .line 96
    xor-int/2addr p1, p6

    .line 97
    invoke-virtual {p4, p1}, Le4/a;->b0(Z)V

    .line 98
    .line 99
    .line 100
    return-void
.end method
