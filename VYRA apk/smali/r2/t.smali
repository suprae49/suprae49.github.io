.class public final Lr2/t;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lp0/q;
.implements Lj/k;


# instance fields
.field public final synthetic f:Lcom/google/android/material/navigation/NavigationView;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/navigation/NavigationView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr2/t;->f:Lcom/google/android/material/navigation/NavigationView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;Lp0/y1;)Lp0/y1;
    .locals 6

    .line 1
    iget-object p1, p0, Lr2/t;->f:Lcom/google/android/material/navigation/NavigationView;

    .line 2
    .line 3
    iget-object v0, p1, Lr2/u;->g:Landroid/graphics/Rect;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p1, Lr2/u;->g:Landroid/graphics/Rect;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p1, Lr2/u;->g:Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-virtual {p2}, Lp0/y1;->b()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v2, p2, Lp0/y1;->a:Lp0/t1;

    .line 21
    .line 22
    invoke-virtual {p2}, Lp0/y1;->d()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {p2}, Lp0/y1;->c()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-virtual {p2}, Lp0/y1;->a()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/graphics/Rect;->set(IIII)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p1, Lcom/google/android/material/navigation/NavigationView;->n:Lr2/q;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Lp0/y1;->d()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iget v3, v0, Lr2/q;->E:I

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    if-eq v3, v1, :cond_3

    .line 50
    .line 51
    iput v1, v0, Lr2/q;->E:I

    .line 52
    .line 53
    iget-object v1, v0, Lr2/q;->g:Landroid/widget/LinearLayout;

    .line 54
    .line 55
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-lez v1, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-boolean v1, v0, Lr2/q;->C:Z

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    iget v1, v0, Lr2/q;->E:I

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    :goto_0
    move v1, v4

    .line 70
    :goto_1
    iget-object v3, v0, Lr2/q;->f:Lcom/google/android/material/internal/NavigationMenuView;

    .line 71
    .line 72
    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    invoke-virtual {v3, v4, v1, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 77
    .line 78
    .line 79
    :cond_3
    iget-object v1, v0, Lr2/q;->f:Lcom/google/android/material/internal/NavigationMenuView;

    .line 80
    .line 81
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-virtual {p2}, Lp0/y1;->a()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    invoke-virtual {v1, v4, v3, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 90
    .line 91
    .line 92
    iget-object v0, v0, Lr2/q;->g:Landroid/widget/LinearLayout;

    .line 93
    .line 94
    invoke-static {v0, p2}, Lp0/p0;->b(Landroid/view/View;Lp0/y1;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Lp0/t1;->m()Lf0/c;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    sget-object v0, Lf0/c;->e:Lf0/c;

    .line 102
    .line 103
    invoke-virtual {p2, v0}, Lf0/c;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    if-nez p2, :cond_4

    .line 108
    .line 109
    iget-object p2, p1, Lr2/u;->f:Landroid/graphics/drawable/Drawable;

    .line 110
    .line 111
    if-nez p2, :cond_5

    .line 112
    .line 113
    :cond_4
    const/4 v4, 0x1

    .line 114
    :cond_5
    invoke-virtual {p1, v4}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Lp0/t1;->c()Lp0/y1;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    return-object p1
.end method

.method public i(Lj/m;)V
    .locals 0

    .line 1
    return-void
.end method

.method public j(Lj/m;Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    iget-object p1, p0, Lr2/t;->f:Lcom/google/android/material/navigation/NavigationView;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/google/android/material/navigation/NavigationView;->o:Lu2/p;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    check-cast p1, Ld3/a0;

    .line 9
    .line 10
    iget-object p1, p1, Ld3/a0;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lu1/q1;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v1, p1, Lu1/q1;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ly0/f;->d(Z)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p1, Lu1/q1;->g:Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-virtual {v1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    check-cast p2, Ljava/lang/String;

    .line 29
    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    iget-object p1, p1, Lu1/q1;->a:Lco/median/android/MainActivity;

    .line 33
    .line 34
    iget-object p1, p1, Lco/median/android/MainActivity;->C0:Lu1/x1;

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-virtual {p1, p2, v1, v0}, Lu1/x1;->b(Ljava/lang/String;ZZ)V

    .line 38
    .line 39
    .line 40
    return v1

    .line 41
    :cond_0
    return v0
.end method
