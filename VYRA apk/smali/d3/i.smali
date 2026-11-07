.class public final synthetic Ld3/i;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Ld3/i;->a:I

    iput-object p2, p0, Ld3/i;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La3/h0;Landroid/view/View;)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    iput p2, p0, Ld3/i;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ld3/i;->b:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 1
    iget v0, p0, Ld3/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ld3/i;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lv2/m;

    .line 9
    .line 10
    iget-object v0, p1, Lv2/m;->u:Lv2/p;

    .line 11
    .line 12
    iget-object v1, p1, Lv2/m;->z:Landroid/animation/TimeInterpolator;

    .line 13
    .line 14
    iget-object p1, p1, Lv2/m;->y:Landroid/animation/ValueAnimator;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-interface {v1, p1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, v0, Lv2/p;->d:F

    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    iget-object v0, p0, Ld3/i;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ly0/f;

    .line 30
    .line 31
    sget v1, Lu2/b;->a:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-static {v1, v2, p1}, Lb2/a;->c(IIF)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    const/high16 v1, -0x67000000

    .line 43
    .line 44
    invoke-static {v1, p1}, Lf0/b;->d(II)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {v0, p1}, Ly0/f;->setScrimColor(I)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_1
    iget-object p1, p0, Ld3/i;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, La3/h0;

    .line 55
    .line 56
    iget-object p1, p1, La3/h0;->g:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Le/q0;

    .line 59
    .line 60
    iget-object p1, p1, Le/q0;->h:Landroidx/appcompat/widget/ActionBarContainer;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Landroid/view/View;

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_2
    iget-object v0, p0, Ld3/i;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Ld3/m;

    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Ljava/lang/Float;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    iget-object v0, v0, Ld3/t;->d:Lcom/google/android/material/internal/CheckableImageButton;

    .line 87
    .line 88
    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
