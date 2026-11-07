.class public final Lco/median/android/widget/BottomNavigationShowOnScrollBehavior;
.super Lcom/google/android/material/behavior/HideViewOnScrollBehavior;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/material/behavior/HideViewOnScrollBehavior<",
        "Lcom/google/android/material/bottomnavigation/BottomNavigationView;",
        ">;"
    }
.end annotation


# instance fields
.field public final s:Z

.field public t:Lu1/w1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-boolean p1, p1, Lx1/a;->o0:Z

    .line 15
    .line 16
    iput-boolean p1, p0, Lco/median/android/widget/BottomNavigationShowOnScrollBehavior;->s:Z

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final p(IIILandroid/view/View;Landroid/view/View;Landroidx/coordinatorlayout/widget/CoordinatorLayout;[I)V
    .locals 0

    .line 1
    check-cast p4, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 2
    .line 3
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-boolean p2, p0, Lco/median/android/widget/BottomNavigationShowOnScrollBehavior;->s:Z

    .line 10
    .line 11
    if-eqz p2, :cond_7

    .line 12
    .line 13
    iget-object p2, p0, Lco/median/android/widget/BottomNavigationShowOnScrollBehavior;->t:Lu1/w1;

    .line 14
    .line 15
    if-eqz p2, :cond_6

    .line 16
    .line 17
    iget-object p2, p2, Lu1/w1;->a:Lco/median/android/MainActivity;

    .line 18
    .line 19
    iget-object p2, p2, Lco/median/android/MainActivity;->R:Lu1/e;

    .line 20
    .line 21
    iget-object p5, p2, Lu1/e;->c:Lu1/h0;

    .line 22
    .line 23
    const/4 p6, 0x0

    .line 24
    if-eqz p5, :cond_0

    .line 25
    .line 26
    invoke-virtual {p5}, Lu1/h0;->J()Z

    .line 27
    .line 28
    .line 29
    move-result p5

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move p5, p6

    .line 32
    :goto_0
    if-eqz p5, :cond_1

    .line 33
    .line 34
    iget-boolean p2, p2, Lu1/e;->r:Z

    .line 35
    .line 36
    if-eqz p2, :cond_1

    .line 37
    .line 38
    const/4 p6, 0x1

    .line 39
    :cond_1
    if-eqz p6, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    if-gtz p3, :cond_5

    .line 43
    .line 44
    const/16 p2, -0x32

    .line 45
    .line 46
    if-ge p1, p2, :cond_3

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_3
    if-ltz p3, :cond_4

    .line 50
    .line 51
    const/16 p2, 0x32

    .line 52
    .line 53
    if-le p1, p2, :cond_7

    .line 54
    .line 55
    :cond_4
    invoke-virtual {p0, p4}, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->x(Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_5
    :goto_1
    invoke-virtual {p0, p4}, Lcom/google/android/material/behavior/HideViewOnScrollBehavior;->y(Landroid/view/View;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_6
    const-string p1, "tabManager"

    .line 64
    .line 65
    invoke-static {p1}, Lr3/g;->c(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    throw p1

    .line 70
    :cond_7
    :goto_2
    return-void
.end method
