.class public final Lw1/d;
.super Landroid/view/animation/Animation;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:Lw1/h;


# direct methods
.method public constructor <init>(Lw1/h;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw1/d;->h:Lw1/h;

    .line 2
    .line 3
    iput p2, p0, Lw1/d;->f:I

    .line 4
    .line 5
    iput p3, p0, Lw1/d;->g:I

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 3

    .line 1
    iget-object p2, p0, Lw1/d;->h:Lw1/h;

    .line 2
    .line 3
    iget-object p2, p2, Lw1/h;->E:Ln1/d;

    .line 4
    .line 5
    iget v0, p0, Lw1/d;->f:I

    .line 6
    .line 7
    int-to-float v1, v0

    .line 8
    iget v2, p0, Lw1/d;->g:I

    .line 9
    .line 10
    sub-int/2addr v2, v0

    .line 11
    int-to-float v0, v2

    .line 12
    mul-float/2addr v0, p1

    .line 13
    add-float/2addr v0, v1

    .line 14
    float-to-int p1, v0

    .line 15
    invoke-virtual {p2, p1}, Ln1/d;->setAlpha(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
