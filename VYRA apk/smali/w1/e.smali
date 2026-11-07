.class public final Lw1/e;
.super Landroid/view/animation/Animation;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lco/median/android/MySwipeRefreshLayout;


# direct methods
.method public synthetic constructor <init>(Lco/median/android/MySwipeRefreshLayout;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw1/e;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lw1/e;->g:Lco/median/android/MySwipeRefreshLayout;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 2

    .line 1
    iget p2, p0, Lw1/e;->f:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lw1/e;->g:Lco/median/android/MySwipeRefreshLayout;

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Lw1/h;->e(F)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object p2, p0, Lw1/e;->g:Lco/median/android/MySwipeRefreshLayout;

    .line 13
    .line 14
    iget v0, p2, Lw1/h;->C:I

    .line 15
    .line 16
    iget v1, p2, Lw1/h;->B:I

    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    sub-int/2addr v0, v1

    .line 23
    iget v1, p2, Lw1/h;->A:I

    .line 24
    .line 25
    sub-int/2addr v0, v1

    .line 26
    int-to-float v0, v0

    .line 27
    mul-float/2addr v0, p1

    .line 28
    float-to-int v0, v0

    .line 29
    add-int/2addr v1, v0

    .line 30
    iget-object v0, p2, Lw1/h;->y:Lw1/a;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    sub-int/2addr v1, v0

    .line 37
    invoke-virtual {p2, v1}, Lw1/h;->setTargetOffsetTopAndBottom(I)V

    .line 38
    .line 39
    .line 40
    iget-object p2, p2, Lw1/h;->E:Ln1/d;

    .line 41
    .line 42
    const/high16 v0, 0x3f800000    # 1.0f

    .line 43
    .line 44
    sub-float/2addr v0, p1

    .line 45
    iget-object p1, p2, Ln1/d;->f:Ln1/c;

    .line 46
    .line 47
    iget v1, p1, Ln1/c;->p:F

    .line 48
    .line 49
    cmpl-float v1, v0, v1

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    iput v0, p1, Ln1/c;->p:F

    .line 54
    .line 55
    :cond_0
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
