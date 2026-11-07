.class public abstract Lp0/z0;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:I

.field public b:F

.field public final c:Landroid/view/animation/Interpolator;

.field public final d:J


# direct methods
.method public constructor <init>(ILandroid/view/animation/Interpolator;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lp0/z0;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lp0/z0;->c:Landroid/view/animation/Interpolator;

    .line 7
    .line 8
    iput-wide p3, p0, Lp0/z0;->d:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    return v0
.end method

.method public b()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lp0/z0;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public c()F
    .locals 2

    .line 1
    iget v0, p0, Lp0/z0;->b:F

    .line 2
    .line 3
    iget-object v1, p0, Lp0/z0;->c:Landroid/view/animation/Interpolator;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-interface {v1, v0}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    :cond_0
    return v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Lp0/z0;->a:I

    .line 2
    .line 3
    return v0
.end method

.method public e(F)V
    .locals 0

    .line 1
    iput p1, p0, Lp0/z0;->b:F

    .line 2
    .line 3
    return-void
.end method
