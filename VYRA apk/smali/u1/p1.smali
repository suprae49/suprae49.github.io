.class public final Lu1/p1;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ly0/b;


# instance fields
.field public final a:Le/s;

.field public final b:Lco/median/android/widget/GoNativeDrawerLayout;

.field public final c:Lg/b;

.field public final d:I

.field public final e:I

.field public f:Z

.field public final synthetic g:Lu1/q1;

.field public final synthetic h:Lx1/a;


# direct methods
.method public constructor <init>(Lu1/q1;Lx1/a;Lco/median/android/MainActivity;Lco/median/android/widget/GoNativeDrawerLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/p1;->g:Lu1/q1;

    .line 5
    .line 6
    iput-object p2, p0, Lu1/p1;->h:Lx1/a;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lu1/p1;->f:Z

    .line 10
    .line 11
    invoke-virtual {p3}, Le/j;->u()Le/q;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Le/d0;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance p2, Le/s;

    .line 21
    .line 22
    const/4 p3, 0x2

    .line 23
    invoke-direct {p2, p1, p3}, Le/s;-><init>(Le/d0;I)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Lu1/p1;->a:Le/s;

    .line 27
    .line 28
    iput-object p4, p0, Lu1/p1;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 29
    .line 30
    const p1, 0x7f11005e

    .line 31
    .line 32
    .line 33
    iput p1, p0, Lu1/p1;->d:I

    .line 34
    .line 35
    const p1, 0x7f11005d

    .line 36
    .line 37
    .line 38
    iput p1, p0, Lu1/p1;->e:I

    .line 39
    .line 40
    new-instance p1, Lg/b;

    .line 41
    .line 42
    iget-object p3, p2, Le/s;->g:Le/d0;

    .line 43
    .line 44
    invoke-virtual {p3}, Le/d0;->z()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-direct {p1, p3}, Lg/b;-><init>(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lu1/p1;->c:Lg/b;

    .line 52
    .line 53
    invoke-virtual {p2}, Le/s;->b()Landroid/graphics/drawable/Drawable;

    .line 54
    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;F)V
    .locals 1

    .line 1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {v0, p2}, Ljava/lang/Math;->max(FF)F

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p0, p1}, Lu1/p1;->d(F)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lu1/p1;->g:Lu1/q1;

    .line 5
    .line 6
    iget-object p1, p1, Lu1/q1;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p1, v0}, Lco/median/android/widget/GoNativeDrawerLayout;->setDisableTouch(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lu1/p1;->g:Lu1/q1;

    .line 5
    .line 6
    iget-object v0, p1, Lu1/q1;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 7
    .line 8
    iget-object v1, p0, Lu1/p1;->h:Lx1/a;

    .line 9
    .line 10
    iget-boolean v1, v1, Lx1/a;->C:Z

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object p1, p1, Lu1/q1;->a:Lco/median/android/MainActivity;

    .line 16
    .line 17
    iget-object p1, p1, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    move p1, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-interface {p1}, Lx1/i;->canGoBack()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    :goto_0
    if-eqz p1, :cond_1

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    :cond_1
    invoke-virtual {v0, v2}, Lco/median/android/widget/GoNativeDrawerLayout;->setDisableTouch(Z)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final d(F)V
    .locals 3

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    iget-object v1, p0, Lu1/p1;->c:Lg/b;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-boolean v0, v1, Lg/b;->i:Z

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v0, v2, :cond_1

    .line 13
    .line 14
    iput-boolean v2, v1, Lg/b;->i:Z

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    cmpl-float v0, p1, v0

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-boolean v0, v1, Lg/b;->i:Z

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, v1, Lg/b;->i:Z

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    iget v0, v1, Lg/b;->j:F

    .line 36
    .line 37
    cmpl-float v0, v0, p1

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iput p1, v1, Lg/b;->j:F

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 44
    .line 45
    .line 46
    :cond_2
    return-void
.end method

.method public final e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lu1/p1;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 2
    .line 3
    const v1, 0x800003

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ly0/f;->e(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-static {v2}, Ly0/f;->l(Landroid/view/View;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v2, v3

    .line 19
    :goto_0
    if-eqz v2, :cond_1

    .line 20
    .line 21
    const/high16 v2, 0x3f800000    # 1.0f

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Lu1/p1;->d(F)V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v2, 0x0

    .line 28
    invoke-virtual {p0, v2}, Lu1/p1;->d(F)V

    .line 29
    .line 30
    .line 31
    :goto_1
    invoke-virtual {v0, v1}, Ly0/f;->e(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-static {v0}, Ly0/f;->l(Landroid/view/View;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    :cond_2
    if-eqz v3, :cond_3

    .line 42
    .line 43
    iget v0, p0, Lu1/p1;->e:I

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_3
    iget v0, p0, Lu1/p1;->d:I

    .line 47
    .line 48
    :goto_2
    iget-boolean v1, p0, Lu1/p1;->f:Z

    .line 49
    .line 50
    iget-object v2, p0, Lu1/p1;->a:Le/s;

    .line 51
    .line 52
    if-nez v1, :cond_5

    .line 53
    .line 54
    iget-object v1, v2, Le/s;->g:Le/d0;

    .line 55
    .line 56
    invoke-virtual {v1}, Le/d0;->C()V

    .line 57
    .line 58
    .line 59
    iget-object v1, v1, Le/d0;->t:Lu1/h0;

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    invoke-virtual {v1}, Lu1/h0;->v()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    and-int/lit8 v1, v1, 0x4

    .line 68
    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    goto :goto_3

    .line 73
    :cond_4
    const/4 v1, 0x0

    .line 74
    :goto_3
    if-nez v1, :cond_5

    .line 75
    .line 76
    const-string v1, "ActionBarDrawerToggle"

    .line 77
    .line 78
    const-string v3, "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);"

    .line 79
    .line 80
    invoke-static {v1, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    iput-boolean v1, p0, Lu1/p1;->f:Z

    .line 85
    .line 86
    :cond_5
    iget-object v1, v2, Le/s;->g:Le/d0;

    .line 87
    .line 88
    invoke-virtual {v1}, Le/d0;->C()V

    .line 89
    .line 90
    .line 91
    iget-object v1, v1, Le/d0;->t:Lu1/h0;

    .line 92
    .line 93
    if-eqz v1, :cond_6

    .line 94
    .line 95
    iget-object v2, p0, Lu1/p1;->c:Lg/b;

    .line 96
    .line 97
    invoke-virtual {v1, v2}, Lu1/h0;->f0(Landroid/graphics/drawable/Drawable;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v0}, Lu1/h0;->e0(I)V

    .line 101
    .line 102
    .line 103
    :cond_6
    return-void
.end method
