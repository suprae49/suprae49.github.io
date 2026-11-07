.class public Lco/median/android/MySwipeRefreshLayout;
.super Lw1/h;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public Q:Lu1/i1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lw1/h;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/MySwipeRefreshLayout;->Q:Lu1/i1;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast v0, Lu1/v0;

    .line 6
    .line 7
    iget-object v0, v0, Lu1/v0;->g:Lco/median/android/MainActivity;

    .line 8
    .line 9
    iget-object v0, v0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 10
    .line 11
    check-cast v0, Lu1/o0;

    .line 12
    .line 13
    invoke-virtual {v0}, Lu1/o0;->getWebViewScrollY()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0xa

    .line 18
    .line 19
    if-le v0, v1, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return v0

    .line 25
    :cond_1
    iget-object v0, p0, Lw1/h;->f:Landroid/view/View;

    .line 26
    .line 27
    instance-of v1, v0, Landroid/widget/ListView;

    .line 28
    .line 29
    const/4 v2, -0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    check-cast v0, Landroid/widget/ListView;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->canScrollList(I)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    return v0

    .line 39
    :cond_2
    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    return v0
.end method

.method public setCanChildScrollUpCallback(Lu1/i1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/median/android/MySwipeRefreshLayout;->Q:Lu1/i1;

    .line 2
    .line 3
    return-void
.end method
