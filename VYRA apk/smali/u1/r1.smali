.class public final Lu1/r1;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:Lco/median/android/MainActivity;

.field public final b:Z

.field public final c:Lg3/d;

.field public final d:Z

.field public e:La3/h0;

.field public f:Landroidx/activity/m0;

.field public g:Landroidx/activity/m0;

.field public h:Landroid/view/View;

.field public i:Landroid/view/View;

.field public j:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field public k:Landroid/view/View;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/r1;->a:Lco/median/android/MainActivity;

    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x23

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    iput-boolean v0, p0, Lu1/r1;->b:Z

    .line 16
    .line 17
    new-instance v0, Lm0/h;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, v1, p0}, Lm0/h;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lg3/d;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lg3/d;-><init>(Lq3/a;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lu1/r1;->c:Lg3/d;

    .line 29
    .line 30
    invoke-static {p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-boolean v0, v0, Lx1/a;->l1:Z

    .line 35
    .line 36
    iput-boolean v0, p0, Lu1/r1;->d:Z

    .line 37
    .line 38
    invoke-static {p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v0, v0, Lx1/a;->v0:Ljava/lang/String;

    .line 43
    .line 44
    iput-object v0, p0, Lu1/r1;->l:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object p1, p1, Lx1/a;->w0:Ljava/lang/String;

    .line 51
    .line 52
    iput-object p1, p0, Lu1/r1;->m:Ljava/lang/String;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;)Landroidx/activity/m0;
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, Lu1/r1;->b(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    new-instance p2, Landroidx/activity/m0;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    sget-object v1, Landroidx/activity/l0;->i:Landroidx/activity/l0;

    .line 11
    .line 12
    invoke-direct {p2, p1, p1, v0, v1}, Landroidx/activity/m0;-><init>(IIILq3/l;)V

    .line 13
    .line 14
    .line 15
    return-object p2

    .line 16
    :cond_0
    new-instance p2, Landroidx/activity/m0;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    sget-object v1, Landroidx/activity/l0;->h:Landroidx/activity/l0;

    .line 20
    .line 21
    invoke-direct {p2, p1, p1, v0, v1}, Landroidx/activity/m0;-><init>(IIILq3/l;)V

    .line 22
    .line 23
    .line 24
    return-object p2
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_5

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v2, 0x2dddaf

    .line 13
    .line 14
    .line 15
    if-eq v0, v2, :cond_2

    .line 16
    .line 17
    const v2, 0x2eef76

    .line 18
    .line 19
    .line 20
    if-eq v0, v2, :cond_1

    .line 21
    .line 22
    const v2, 0x6233516

    .line 23
    .line 24
    .line 25
    if-eq v0, v2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string v0, "light"

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    return v1

    .line 34
    :cond_1
    const-string v0, "dark"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const-string v0, "auto"

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    iget-object p1, p0, Lu1/r1;->a:Lco/median/android/MainActivity;

    .line 53
    .line 54
    invoke-virtual {p1}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 63
    .line 64
    and-int/lit8 p1, p1, 0x30

    .line 65
    .line 66
    const/16 v0, 0x10

    .line 67
    .line 68
    if-eq p1, v0, :cond_5

    .line 69
    .line 70
    const/16 v0, 0x20

    .line 71
    .line 72
    if-eq p1, v0, :cond_4

    .line 73
    .line 74
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string v0, "isLightMode: Current mode is undefined"

    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    const-string v3, "SystemBarManager"

    .line 82
    .line 83
    invoke-virtual {p1, v3, v0, v2}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 84
    .line 85
    .line 86
    return v1

    .line 87
    :cond_4
    const/4 p1, 0x0

    .line 88
    return p1

    .line 89
    :cond_5
    :goto_0
    return v1
.end method

.method public final c(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lu1/r1;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lu1/r1;->h:Landroid/view/View;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p1, "statusBarBackgroundView"

    .line 15
    .line 16
    invoke-static {p1}, Lr3/g;->c(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v1

    .line 20
    :cond_1
    iget-object v0, p0, Lu1/r1;->l:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, v0}, Lu1/r1;->a(ILjava/lang/String;)Landroidx/activity/m0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lu1/r1;->f:Landroidx/activity/m0;

    .line 30
    .line 31
    iget-object v0, p0, Lu1/r1;->g:Landroidx/activity/m0;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v1, p0, Lu1/r1;->a:Lco/median/android/MainActivity;

    .line 36
    .line 37
    invoke-static {v1, p1, v0}, Landroidx/activity/t;->a(Landroidx/activity/q;Landroidx/activity/m0;Landroidx/activity/m0;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    const-string p1, "systemNavBarStyle"

    .line 42
    .line 43
    invoke-static {p1}, Lr3/g;->c(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v1
.end method

.method public final d(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lu1/r1;->b:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lu1/r1;->i:Landroid/view/View;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p1, "systemNavBarBackgroundView"

    .line 15
    .line 16
    invoke-static {p1}, Lr3/g;->c(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v1

    .line 20
    :cond_1
    iget-object v0, p0, Lu1/r1;->m:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, v0}, Lu1/r1;->a(ILjava/lang/String;)Landroidx/activity/m0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lu1/r1;->g:Landroidx/activity/m0;

    .line 30
    .line 31
    iget-object v0, p0, Lu1/r1;->f:Landroidx/activity/m0;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v1, p0, Lu1/r1;->a:Lco/median/android/MainActivity;

    .line 36
    .line 37
    invoke-static {v1, v0, p1}, Landroidx/activity/t;->a(Landroidx/activity/q;Landroidx/activity/m0;Landroidx/activity/m0;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    const-string p1, "statusBarStyle"

    .line 42
    .line 43
    invoke-static {p1}, Lr3/g;->c(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v1
.end method
