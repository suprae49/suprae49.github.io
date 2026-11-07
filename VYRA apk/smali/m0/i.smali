.class public final Lm0/i;
.super Landroidx/emoji2/text/p;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public j:Landroid/window/SplashScreenView;


# virtual methods
.method public final j()V
    .locals 0

    .line 1
    return-void
.end method

.method public final n()Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p0, Lm0/i;->j:Landroid/window/SplashScreenView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-string v0, "platformView"

    .line 9
    .line 10
    invoke-static {v0}, Lr3/g;->c(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    throw v0
.end method

.method public final w()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/p;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lco/median/android/MainActivity;

    .line 4
    .line 5
    iget-object v1, p0, Lm0/i;->j:Landroid/window/SplashScreenView;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-static {v1}, Lcom/google/android/gms/common/internal/a;->x(Landroid/window/SplashScreenView;)V

    .line 10
    .line 11
    .line 12
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v2, 0x21

    .line 15
    .line 16
    if-ge v1, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v2, Landroid/util/TypedValue;

    .line 37
    .line 38
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v0, v2}, Lu1/h0;->d(Landroid/content/res/Resources$Theme;Landroid/view/View;Landroid/util/TypedValue;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void

    .line 45
    :cond_1
    const-string v0, "platformView"

    .line 46
    .line 47
    invoke-static {v0}, Lr3/g;->c(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    throw v0
.end method
