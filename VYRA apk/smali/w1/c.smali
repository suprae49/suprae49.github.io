.class public final Lw1/c;
.super Landroid/view/animation/Animation;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lw1/h;


# direct methods
.method public synthetic constructor <init>(Lw1/h;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw1/c;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lw1/c;->g:Lw1/h;

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
    .locals 0

    .line 1
    iget p2, p0, Lw1/c;->f:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/high16 p2, 0x3f800000    # 1.0f

    .line 7
    .line 8
    sub-float/2addr p2, p1

    .line 9
    iget-object p1, p0, Lw1/c;->g:Lw1/h;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Lw1/h;->setAnimationProgress(F)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iget-object p2, p0, Lw1/c;->g:Lw1/h;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Lw1/h;->setAnimationProgress(F)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
