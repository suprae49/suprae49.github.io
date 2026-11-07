.class public final synthetic Lm0/d;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/window/SplashScreen$OnExitAnimationListener;


# instance fields
.field public final synthetic a:Lm0/f;

.field public final synthetic b:Lp1/h;


# direct methods
.method public synthetic constructor <init>(Lm0/f;Lp1/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm0/d;->a:Lm0/f;

    .line 5
    .line 6
    iput-object p2, p0, Lm0/d;->b:Lp1/h;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onSplashScreenExit(Landroid/window/SplashScreenView;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lm0/d;->a:Lm0/f;

    .line 2
    .line 3
    iget-object v1, v0, Li1/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lco/median/android/MainActivity;

    .line 6
    .line 7
    iget-object v2, p0, Lm0/d;->b:Lp1/h;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v4, 0x21

    .line 15
    .line 16
    if-ge v3, v4, :cond_4

    .line 17
    .line 18
    new-instance v3, Landroid/util/TypedValue;

    .line 19
    .line 20
    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    const v6, 0x1010451

    .line 32
    .line 33
    .line 34
    const/4 v7, 0x1

    .line 35
    invoke-virtual {v4, v6, v3, v7}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    iget v6, v3, Landroid/util/TypedValue;->data:I

    .line 42
    .line 43
    invoke-virtual {v5, v6}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 44
    .line 45
    .line 46
    :cond_0
    const v6, 0x1010452

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4, v6, v3, v7}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    iget v6, v3, Landroid/util/TypedValue;->data:I

    .line 56
    .line 57
    invoke-virtual {v5, v6}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 58
    .line 59
    .line 60
    :cond_1
    const v6, 0x1010450

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v6, v3, v7}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_3

    .line 68
    .line 69
    iget v6, v3, Landroid/util/TypedValue;->data:I

    .line 70
    .line 71
    const/high16 v7, -0x80000000

    .line 72
    .line 73
    if-eqz v6, :cond_2

    .line 74
    .line 75
    invoke-virtual {v5, v7}, Landroid/view/Window;->addFlags(I)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    invoke-virtual {v5, v7}, Landroid/view/Window;->clearFlags(I)V

    .line 80
    .line 81
    .line 82
    :cond_3
    :goto_0
    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    check-cast v6, Landroid/view/ViewGroup;

    .line 90
    .line 91
    invoke-static {v4, v6, v3}, Lu1/h0;->d(Landroid/content/res/Resources$Theme;Landroid/view/View;Landroid/util/TypedValue;)V

    .line 92
    .line 93
    .line 94
    const/4 v3, 0x0

    .line 95
    invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    .line 96
    .line 97
    .line 98
    iget-boolean v0, v0, Lm0/f;->j:Z

    .line 99
    .line 100
    invoke-static {v5, v0}, Lcom/google/android/gms/common/api/a;->p(Landroid/view/Window;Z)V

    .line 101
    .line 102
    .line 103
    :cond_4
    new-instance v0, La3/h0;

    .line 104
    .line 105
    invoke-direct {v0, v1}, La3/h0;-><init>(Lco/median/android/MainActivity;)V

    .line 106
    .line 107
    .line 108
    iget-object v1, v0, La3/h0;->g:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Landroidx/emoji2/text/p;

    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    check-cast v1, Lm0/i;

    .line 116
    .line 117
    iput-object p1, v1, Lm0/i;->j:Landroid/window/SplashScreenView;

    .line 118
    .line 119
    invoke-virtual {v2, v0}, Lp1/h;->b(La3/h0;)V

    .line 120
    .line 121
    .line 122
    return-void
.end method
