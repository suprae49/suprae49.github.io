.class public final Lu1/l0;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic a:Lu1/o0;


# direct methods
.method public constructor <init>(Lu1/o0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu1/l0;->a:Lu1/o0;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .line 1
    iget-object p1, p0, Lu1/l0;->a:Lu1/o0;

    .line 2
    .line 3
    iget-object p2, p1, Lu1/o0;->q:Lu1/m0;

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    cmpl-float p4, p4, v0

    .line 10
    .line 11
    if-lez p4, :cond_0

    .line 12
    .line 13
    iget-boolean p4, p1, Lu1/o0;->s:Z

    .line 14
    .line 15
    if-eqz p4, :cond_0

    .line 16
    .line 17
    check-cast p2, Lu1/v0;

    .line 18
    .line 19
    iget-object p2, p2, Lu1/v0;->g:Lco/median/android/MainActivity;

    .line 20
    .line 21
    invoke-virtual {p2}, Lco/median/android/MainActivity;->o0()V

    .line 22
    .line 23
    .line 24
    const/4 p2, 0x1

    .line 25
    iput-boolean p2, p1, Lu1/o0;->t:Z

    .line 26
    .line 27
    return p3

    .line 28
    :cond_0
    iput-boolean p3, p1, Lu1/o0;->t:Z

    .line 29
    .line 30
    return p3
.end method
