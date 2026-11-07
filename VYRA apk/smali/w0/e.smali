.class public final Lw0/e;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final y:Lk1/z;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:[F

.field public e:[F

.field public f:[F

.field public g:[F

.field public h:[I

.field public i:[I

.field public j:[I

.field public k:I

.field public l:Landroid/view/VelocityTracker;

.field public final m:F

.field public n:F

.field public o:I

.field public final p:I

.field public q:I

.field public final r:Landroid/widget/OverScroller;

.field public final s:Lt2/i;

.field public t:Landroid/view/View;

.field public u:Z

.field public final v:Landroid/view/ViewGroup;

.field public w:Lk1/z;

.field public final x:Ld3/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk1/z;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lk1/z;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lw0/e;->y:Lk1/z;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Lt2/i;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lw0/e;->c:I

    .line 6
    .line 7
    new-instance v0, Ld3/d0;

    .line 8
    .line 9
    const/16 v1, 0xf

    .line 10
    .line 11
    invoke-direct {v0, v1, p0}, Ld3/d0;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lw0/e;->x:Ld3/d0;

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    iput-object p2, p0, Lw0/e;->v:Landroid/view/ViewGroup;

    .line 19
    .line 20
    iput-object p3, p0, Lw0/e;->s:Lt2/i;

    .line 21
    .line 22
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    .line 35
    .line 36
    const/high16 v0, 0x41a00000    # 20.0f

    .line 37
    .line 38
    mul-float/2addr p3, v0

    .line 39
    const/high16 v0, 0x3f000000    # 0.5f

    .line 40
    .line 41
    add-float/2addr p3, v0

    .line 42
    float-to-int p3, p3

    .line 43
    iput p3, p0, Lw0/e;->p:I

    .line 44
    .line 45
    iput p3, p0, Lw0/e;->o:I

    .line 46
    .line 47
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    iput p3, p0, Lw0/e;->b:I

    .line 52
    .line 53
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    int-to-float p3, p3

    .line 58
    iput p3, p0, Lw0/e;->m:F

    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    int-to-float p2, p2

    .line 65
    iput p2, p0, Lw0/e;->n:F

    .line 66
    .line 67
    sget-object p2, Lw0/e;->y:Lk1/z;

    .line 68
    .line 69
    iput-object p2, p0, Lw0/e;->w:Lk1/z;

    .line 70
    .line 71
    new-instance p2, Lw0/d;

    .line 72
    .line 73
    invoke-direct {p2, p0}, Lw0/d;-><init>(Lw0/e;)V

    .line 74
    .line 75
    .line 76
    new-instance p3, Landroid/widget/OverScroller;

    .line 77
    .line 78
    invoke-direct {p3, p1, p2}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 79
    .line 80
    .line 81
    iput-object p3, p0, Lw0/e;->r:Landroid/widget/OverScroller;

    .line 82
    .line 83
    return-void

    .line 84
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 85
    .line 86
    const-string p2, "Callback may not be null"

    .line 87
    .line 88
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lw0/e;->c:I

    .line 3
    .line 4
    iget-object v0, p0, Lw0/e;->d:[F

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lw0/e;->e:[F

    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lw0/e;->f:[F

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lw0/e;->g:[F

    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lw0/e;->h:[I

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lw0/e;->i:[I

    .line 35
    .line 36
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lw0/e;->j:[I

    .line 40
    .line 41
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 42
    .line 43
    .line 44
    iput v1, p0, Lw0/e;->k:I

    .line 45
    .line 46
    :goto_0
    iget-object v0, p0, Lw0/e;->l:Landroid/view/VelocityTracker;

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    iput-object v0, p0, Lw0/e;->l:Landroid/view/VelocityTracker;

    .line 55
    .line 56
    :cond_1
    return-void
.end method

.method public final b(Landroid/view/View;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lw0/e;->v:Landroid/view/ViewGroup;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lw0/e;->t:Landroid/view/View;

    .line 10
    .line 11
    iput p2, p0, Lw0/e;->c:I

    .line 12
    .line 13
    iget-object v0, p0, Lw0/e;->s:Lt2/i;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lt2/i;->B(Landroid/view/View;I)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-virtual {p0, p1}, Lw0/e;->o(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p1, "captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view ("

    .line 24
    .line 25
    const-string p2, ")"

    .line 26
    .line 27
    invoke-static {v1, p2, p1}, Landroidx/fragment/app/q;->h(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final c(FFII)Z
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iget-object v0, p0, Lw0/e;->h:[I

    .line 10
    .line 11
    aget v0, v0, p3

    .line 12
    .line 13
    and-int/2addr v0, p4

    .line 14
    if-ne v0, p4, :cond_2

    .line 15
    .line 16
    iget v0, p0, Lw0/e;->q:I

    .line 17
    .line 18
    and-int/2addr v0, p4

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lw0/e;->j:[I

    .line 22
    .line 23
    aget v0, v0, p3

    .line 24
    .line 25
    and-int/2addr v0, p4

    .line 26
    if-eq v0, p4, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lw0/e;->i:[I

    .line 29
    .line 30
    aget v0, v0, p3

    .line 31
    .line 32
    and-int/2addr v0, p4

    .line 33
    if-eq v0, p4, :cond_2

    .line 34
    .line 35
    iget v0, p0, Lw0/e;->b:I

    .line 36
    .line 37
    int-to-float v0, v0

    .line 38
    cmpg-float v1, p1, v0

    .line 39
    .line 40
    if-gtz v1, :cond_0

    .line 41
    .line 42
    cmpg-float v0, p2, v0

    .line 43
    .line 44
    if-gtz v0, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/high16 v0, 0x3f000000    # 0.5f

    .line 48
    .line 49
    mul-float/2addr p2, v0

    .line 50
    cmpg-float p2, p1, p2

    .line 51
    .line 52
    if-gez p2, :cond_1

    .line 53
    .line 54
    iget-object p2, p0, Lw0/e;->s:Lt2/i;

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    :cond_1
    iget-object p2, p0, Lw0/e;->i:[I

    .line 60
    .line 61
    aget p2, p2, p3

    .line 62
    .line 63
    and-int/2addr p2, p4

    .line 64
    if-nez p2, :cond_2

    .line 65
    .line 66
    iget p2, p0, Lw0/e;->b:I

    .line 67
    .line 68
    int-to-float p2, p2

    .line 69
    cmpl-float p1, p1, p2

    .line 70
    .line 71
    if-lez p1, :cond_2

    .line 72
    .line 73
    const/4 p1, 0x1

    .line 74
    return p1

    .line 75
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 76
    return p1
.end method

.method public final d(Landroid/view/View;FF)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_3

    .line 5
    :cond_0
    iget-object v1, p0, Lw0/e;->s:Lt2/i;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Lt2/i;->q(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-lez p1, :cond_1

    .line 13
    .line 14
    move p1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move p1, v0

    .line 17
    :goto_0
    invoke-virtual {v1}, Lt2/i;->r()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-lez v1, :cond_2

    .line 22
    .line 23
    move v1, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_2
    move v1, v0

    .line 26
    :goto_1
    if-eqz p1, :cond_3

    .line 27
    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    mul-float/2addr p2, p2

    .line 31
    mul-float/2addr p3, p3

    .line 32
    add-float/2addr p3, p2

    .line 33
    iget p1, p0, Lw0/e;->b:I

    .line 34
    .line 35
    mul-int/2addr p1, p1

    .line 36
    int-to-float p1, p1

    .line 37
    cmpl-float p1, p3, p1

    .line 38
    .line 39
    if-lez p1, :cond_5

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_3
    if-eqz p1, :cond_4

    .line 43
    .line 44
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iget p2, p0, Lw0/e;->b:I

    .line 49
    .line 50
    int-to-float p2, p2

    .line 51
    cmpl-float p1, p1, p2

    .line 52
    .line 53
    if-lez p1, :cond_5

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_4
    if-eqz v1, :cond_5

    .line 57
    .line 58
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    iget p2, p0, Lw0/e;->b:I

    .line 63
    .line 64
    int-to-float p2, p2

    .line 65
    cmpl-float p1, p1, p2

    .line 66
    .line 67
    if-lez p1, :cond_5

    .line 68
    .line 69
    :goto_2
    return v2

    .line 70
    :cond_5
    :goto_3
    return v0
.end method

.method public final e(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lw0/e;->d:[F

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lw0/e;->k:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    shl-int/2addr v2, p1

    .line 9
    and-int v3, v1, v2

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    aput v3, v0, p1

    .line 15
    .line 16
    iget-object v0, p0, Lw0/e;->e:[F

    .line 17
    .line 18
    aput v3, v0, p1

    .line 19
    .line 20
    iget-object v0, p0, Lw0/e;->f:[F

    .line 21
    .line 22
    aput v3, v0, p1

    .line 23
    .line 24
    iget-object v0, p0, Lw0/e;->g:[F

    .line 25
    .line 26
    aput v3, v0, p1

    .line 27
    .line 28
    iget-object v0, p0, Lw0/e;->h:[I

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    aput v3, v0, p1

    .line 32
    .line 33
    iget-object v0, p0, Lw0/e;->i:[I

    .line 34
    .line 35
    aput v3, v0, p1

    .line 36
    .line 37
    iget-object v0, p0, Lw0/e;->j:[I

    .line 38
    .line 39
    aput v3, v0, p1

    .line 40
    .line 41
    not-int p1, v2

    .line 42
    and-int/2addr p1, v1

    .line 43
    iput p1, p0, Lw0/e;->k:I

    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public final f(III)I
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    iget-object v0, p0, Lw0/e;->v:Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    div-int/lit8 v1, v0, 0x2

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    int-to-float v2, v2

    .line 18
    int-to-float v0, v0

    .line 19
    div-float/2addr v2, v0

    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    .line 21
    .line 22
    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    int-to-float v1, v1

    .line 27
    const/high16 v3, 0x3f000000    # 0.5f

    .line 28
    .line 29
    sub-float/2addr v2, v3

    .line 30
    const v3, 0x3ef1463b

    .line 31
    .line 32
    .line 33
    mul-float/2addr v2, v3

    .line 34
    float-to-double v2, v2

    .line 35
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    double-to-float v2, v2

    .line 40
    mul-float/2addr v2, v1

    .line 41
    add-float/2addr v2, v1

    .line 42
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-lez p2, :cond_1

    .line 47
    .line 48
    int-to-float p1, p2

    .line 49
    div-float/2addr v2, p1

    .line 50
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    const/high16 p2, 0x447a0000    # 1000.0f

    .line 55
    .line 56
    mul-float/2addr p1, p2

    .line 57
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    mul-int/lit8 p1, p1, 0x4

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    int-to-float p1, p1

    .line 69
    int-to-float p2, p3

    .line 70
    div-float/2addr p1, p2

    .line 71
    add-float/2addr p1, v0

    .line 72
    const/high16 p2, 0x43800000    # 256.0f

    .line 73
    .line 74
    mul-float/2addr p1, p2

    .line 75
    float-to-int p1, p1

    .line 76
    :goto_0
    const/16 p2, 0x258

    .line 77
    .line 78
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    return p1
.end method

.method public final g()Z
    .locals 10

    .line 1
    iget v0, p0, Lw0/e;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    if-ne v0, v2, :cond_5

    .line 6
    .line 7
    iget-object v0, p0, Lw0/e;->r:Landroid/widget/OverScroller;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    iget-object v6, p0, Lw0/e;->t:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    sub-int v6, v4, v6

    .line 28
    .line 29
    iget-object v7, p0, Lw0/e;->t:Landroid/view/View;

    .line 30
    .line 31
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    sub-int v7, v5, v7

    .line 36
    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    iget-object v8, p0, Lw0/e;->t:Landroid/view/View;

    .line 40
    .line 41
    sget-object v9, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 42
    .line 43
    invoke-virtual {v8, v6}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 44
    .line 45
    .line 46
    :cond_0
    if-eqz v7, :cond_1

    .line 47
    .line 48
    iget-object v8, p0, Lw0/e;->t:Landroid/view/View;

    .line 49
    .line 50
    sget-object v9, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 51
    .line 52
    invoke-virtual {v8, v7}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 53
    .line 54
    .line 55
    :cond_1
    if-nez v6, :cond_2

    .line 56
    .line 57
    if-eqz v7, :cond_3

    .line 58
    .line 59
    :cond_2
    iget-object v6, p0, Lw0/e;->s:Lt2/i;

    .line 60
    .line 61
    iget-object v7, p0, Lw0/e;->t:Landroid/view/View;

    .line 62
    .line 63
    invoke-virtual {v6, v7, v4, v5}, Lt2/i;->D(Landroid/view/View;II)V

    .line 64
    .line 65
    .line 66
    :cond_3
    if-eqz v3, :cond_4

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getFinalX()I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-ne v4, v6, :cond_4

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getFinalY()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-ne v5, v4, :cond_4

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 81
    .line 82
    .line 83
    move v3, v1

    .line 84
    :cond_4
    if-nez v3, :cond_5

    .line 85
    .line 86
    iget-object v0, p0, Lw0/e;->v:Landroid/view/ViewGroup;

    .line 87
    .line 88
    iget-object v3, p0, Lw0/e;->x:Ld3/d0;

    .line 89
    .line 90
    invoke-virtual {v0, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 91
    .line 92
    .line 93
    :cond_5
    iget v0, p0, Lw0/e;->a:I

    .line 94
    .line 95
    if-ne v0, v2, :cond_6

    .line 96
    .line 97
    const/4 v0, 0x1

    .line 98
    return v0

    .line 99
    :cond_6
    return v1
.end method

.method public final h(II)Landroid/view/View;
    .locals 4

    .line 1
    iget-object v0, p0, Lw0/e;->v:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v1, :cond_1

    .line 10
    .line 11
    iget-object v2, p0, Lw0/e;->s:Lt2/i;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-lt p1, v3, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ge p1, v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-lt p2, v3, :cond_0

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-ge p2, v3, :cond_0

    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 p1, 0x0

    .line 49
    return-object p1
.end method

.method public final i(IIII)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lw0/e;->t:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    iget-object v0, p0, Lw0/e;->t:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    sub-int v4, p1, v2

    .line 14
    .line 15
    sub-int v5, p2, v3

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iget-object v1, p0, Lw0/e;->r:Landroid/widget/OverScroller;

    .line 19
    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lw0/e;->o(I)V

    .line 28
    .line 29
    .line 30
    return p1

    .line 31
    :cond_0
    iget-object p2, p0, Lw0/e;->t:Landroid/view/View;

    .line 32
    .line 33
    iget v0, p0, Lw0/e;->n:F

    .line 34
    .line 35
    float-to-int v0, v0

    .line 36
    iget v6, p0, Lw0/e;->m:F

    .line 37
    .line 38
    float-to-int v6, v6

    .line 39
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-ge v7, v0, :cond_1

    .line 44
    .line 45
    move p3, p1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    if-le v7, v6, :cond_3

    .line 48
    .line 49
    if-lez p3, :cond_2

    .line 50
    .line 51
    move p3, v6

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    neg-int p3, v6

    .line 54
    :cond_3
    :goto_0
    iget v0, p0, Lw0/e;->n:F

    .line 55
    .line 56
    float-to-int v0, v0

    .line 57
    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-ge v7, v0, :cond_4

    .line 62
    .line 63
    move p4, p1

    .line 64
    goto :goto_1

    .line 65
    :cond_4
    if-le v7, v6, :cond_6

    .line 66
    .line 67
    if-lez p4, :cond_5

    .line 68
    .line 69
    move p4, v6

    .line 70
    goto :goto_1

    .line 71
    :cond_5
    neg-int p4, v6

    .line 72
    :cond_6
    :goto_1
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    add-int v8, v6, v7

    .line 89
    .line 90
    add-int v9, p1, v0

    .line 91
    .line 92
    if-eqz p3, :cond_7

    .line 93
    .line 94
    int-to-float p1, v6

    .line 95
    int-to-float v6, v8

    .line 96
    :goto_2
    div-float/2addr p1, v6

    .line 97
    goto :goto_3

    .line 98
    :cond_7
    int-to-float p1, p1

    .line 99
    int-to-float v6, v9

    .line 100
    goto :goto_2

    .line 101
    :goto_3
    if-eqz p4, :cond_8

    .line 102
    .line 103
    int-to-float v0, v7

    .line 104
    int-to-float v6, v8

    .line 105
    :goto_4
    div-float/2addr v0, v6

    .line 106
    goto :goto_5

    .line 107
    :cond_8
    int-to-float v0, v0

    .line 108
    int-to-float v6, v9

    .line 109
    goto :goto_4

    .line 110
    :goto_5
    iget-object v6, p0, Lw0/e;->s:Lt2/i;

    .line 111
    .line 112
    invoke-virtual {v6, p2}, Lt2/i;->q(Landroid/view/View;)I

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    invoke-virtual {p0, v4, p3, p2}, Lw0/e;->f(III)I

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    invoke-virtual {v6}, Lt2/i;->r()I

    .line 121
    .line 122
    .line 123
    move-result p3

    .line 124
    invoke-virtual {p0, v5, p4, p3}, Lw0/e;->f(III)I

    .line 125
    .line 126
    .line 127
    move-result p3

    .line 128
    int-to-float p2, p2

    .line 129
    mul-float/2addr p2, p1

    .line 130
    int-to-float p1, p3

    .line 131
    mul-float/2addr p1, v0

    .line 132
    add-float/2addr p1, p2

    .line 133
    float-to-int v6, p1

    .line 134
    sget-object p1, Lw0/e;->y:Lk1/z;

    .line 135
    .line 136
    iput-object p1, p0, Lw0/e;->w:Lk1/z;

    .line 137
    .line 138
    invoke-virtual/range {v1 .. v6}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 139
    .line 140
    .line 141
    const/4 p1, 0x2

    .line 142
    invoke-virtual {p0, p1}, Lw0/e;->o(I)V

    .line 143
    .line 144
    .line 145
    const/4 p1, 0x1

    .line 146
    return p1
.end method

.method public final j(Landroid/view/MotionEvent;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lw0/e;->a()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v2, p0, Lw0/e;->l:Landroid/view/VelocityTracker;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iput-object v2, p0, Lw0/e;->l:Landroid/view/VelocityTracker;

    .line 23
    .line 24
    :cond_1
    iget-object v2, p0, Lw0/e;->l:Landroid/view/VelocityTracker;

    .line 25
    .line 26
    invoke-virtual {v2, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lw0/e;->s:Lt2/i;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    if-eqz v0, :cond_1c

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    if-eq v0, v4, :cond_1a

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, -0x1

    .line 39
    if-eq v0, v5, :cond_d

    .line 40
    .line 41
    const/4 v5, 0x3

    .line 42
    if-eq v0, v5, :cond_b

    .line 43
    .line 44
    const/4 v5, 0x5

    .line 45
    if-eq v0, v5, :cond_7

    .line 46
    .line 47
    const/4 v2, 0x6

    .line 48
    if-eq v0, v2, :cond_2

    .line 49
    .line 50
    goto/16 :goto_8

    .line 51
    .line 52
    :cond_2
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget v1, p0, Lw0/e;->a:I

    .line 57
    .line 58
    if-ne v1, v4, :cond_6

    .line 59
    .line 60
    iget v1, p0, Lw0/e;->c:I

    .line 61
    .line 62
    if-ne v0, v1, :cond_6

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    :goto_0
    if-ge v3, v1, :cond_5

    .line 69
    .line 70
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    iget v4, p0, Lw0/e;->c:I

    .line 75
    .line 76
    if-ne v2, v4, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getX(I)F

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getY(I)F

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    float-to-int v4, v4

    .line 88
    float-to-int v5, v5

    .line 89
    invoke-virtual {p0, v4, v5}, Lw0/e;->h(II)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    iget-object v5, p0, Lw0/e;->t:Landroid/view/View;

    .line 94
    .line 95
    if-ne v4, v5, :cond_4

    .line 96
    .line 97
    invoke-virtual {p0, v5, v2}, Lw0/e;->s(Landroid/view/View;I)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_4

    .line 102
    .line 103
    iget p1, p0, Lw0/e;->c:I

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    move p1, v6

    .line 110
    :goto_2
    if-ne p1, v6, :cond_6

    .line 111
    .line 112
    invoke-virtual {p0}, Lw0/e;->k()V

    .line 113
    .line 114
    .line 115
    :cond_6
    invoke-virtual {p0, v0}, Lw0/e;->e(I)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_7
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    invoke-virtual {p0, v5, p1, v0}, Lw0/e;->m(FFI)V

    .line 132
    .line 133
    .line 134
    iget v1, p0, Lw0/e;->a:I

    .line 135
    .line 136
    if-nez v1, :cond_8

    .line 137
    .line 138
    float-to-int v1, v5

    .line 139
    float-to-int p1, p1

    .line 140
    invoke-virtual {p0, v1, p1}, Lw0/e;->h(II)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p0, p1, v0}, Lw0/e;->s(Landroid/view/View;I)Z

    .line 145
    .line 146
    .line 147
    iget-object p1, p0, Lw0/e;->h:[I

    .line 148
    .line 149
    aget p1, p1, v0

    .line 150
    .line 151
    iget v0, p0, Lw0/e;->q:I

    .line 152
    .line 153
    and-int/2addr p1, v0

    .line 154
    if-eqz p1, :cond_1d

    .line 155
    .line 156
    invoke-virtual {v2}, Lt2/i;->A()V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_8
    float-to-int v1, v5

    .line 161
    float-to-int p1, p1

    .line 162
    iget-object v2, p0, Lw0/e;->t:Landroid/view/View;

    .line 163
    .line 164
    if-nez v2, :cond_9

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_9
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-lt v1, v5, :cond_a

    .line 172
    .line 173
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-ge v1, v5, :cond_a

    .line 178
    .line 179
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-lt p1, v1, :cond_a

    .line 184
    .line 185
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-ge p1, v1, :cond_a

    .line 190
    .line 191
    move v3, v4

    .line 192
    :cond_a
    :goto_3
    if-eqz v3, :cond_1d

    .line 193
    .line 194
    iget-object p1, p0, Lw0/e;->t:Landroid/view/View;

    .line 195
    .line 196
    invoke-virtual {p0, p1, v0}, Lw0/e;->s(Landroid/view/View;I)Z

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :cond_b
    iget p1, p0, Lw0/e;->a:I

    .line 201
    .line 202
    if-ne p1, v4, :cond_c

    .line 203
    .line 204
    iput-boolean v4, p0, Lw0/e;->u:Z

    .line 205
    .line 206
    iget-object p1, p0, Lw0/e;->t:Landroid/view/View;

    .line 207
    .line 208
    const/4 v0, 0x0

    .line 209
    invoke-virtual {v2, p1, v0, v0}, Lt2/i;->E(Landroid/view/View;FF)V

    .line 210
    .line 211
    .line 212
    iput-boolean v3, p0, Lw0/e;->u:Z

    .line 213
    .line 214
    iget p1, p0, Lw0/e;->a:I

    .line 215
    .line 216
    if-ne p1, v4, :cond_c

    .line 217
    .line 218
    invoke-virtual {p0, v3}, Lw0/e;->o(I)V

    .line 219
    .line 220
    .line 221
    :cond_c
    invoke-virtual {p0}, Lw0/e;->a()V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_d
    iget v0, p0, Lw0/e;->a:I

    .line 226
    .line 227
    if-ne v0, v4, :cond_14

    .line 228
    .line 229
    iget v0, p0, Lw0/e;->c:I

    .line 230
    .line 231
    iget v1, p0, Lw0/e;->k:I

    .line 232
    .line 233
    shl-int v5, v4, v0

    .line 234
    .line 235
    and-int/2addr v1, v5

    .line 236
    if-eqz v1, :cond_e

    .line 237
    .line 238
    move v3, v4

    .line 239
    :cond_e
    if-nez v3, :cond_f

    .line 240
    .line 241
    goto/16 :goto_8

    .line 242
    .line 243
    :cond_f
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-ne v0, v6, :cond_10

    .line 248
    .line 249
    goto/16 :goto_8

    .line 250
    .line 251
    :cond_10
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    iget-object v3, p0, Lw0/e;->f:[F

    .line 260
    .line 261
    iget v4, p0, Lw0/e;->c:I

    .line 262
    .line 263
    aget v3, v3, v4

    .line 264
    .line 265
    sub-float/2addr v1, v3

    .line 266
    float-to-int v1, v1

    .line 267
    iget-object v3, p0, Lw0/e;->g:[F

    .line 268
    .line 269
    aget v3, v3, v4

    .line 270
    .line 271
    sub-float/2addr v0, v3

    .line 272
    float-to-int v0, v0

    .line 273
    iget-object v3, p0, Lw0/e;->t:Landroid/view/View;

    .line 274
    .line 275
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    add-int/2addr v3, v1

    .line 280
    iget-object v4, p0, Lw0/e;->t:Landroid/view/View;

    .line 281
    .line 282
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    add-int/2addr v4, v0

    .line 287
    iget-object v5, p0, Lw0/e;->t:Landroid/view/View;

    .line 288
    .line 289
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    iget-object v6, p0, Lw0/e;->t:Landroid/view/View;

    .line 294
    .line 295
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    .line 296
    .line 297
    .line 298
    move-result v6

    .line 299
    if-eqz v1, :cond_11

    .line 300
    .line 301
    iget-object v7, p0, Lw0/e;->t:Landroid/view/View;

    .line 302
    .line 303
    invoke-virtual {v2, v7, v3}, Lt2/i;->c(Landroid/view/View;I)I

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    iget-object v7, p0, Lw0/e;->t:Landroid/view/View;

    .line 308
    .line 309
    sub-int v5, v3, v5

    .line 310
    .line 311
    sget-object v8, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 312
    .line 313
    invoke-virtual {v7, v5}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 314
    .line 315
    .line 316
    :cond_11
    if-eqz v0, :cond_12

    .line 317
    .line 318
    iget-object v5, p0, Lw0/e;->t:Landroid/view/View;

    .line 319
    .line 320
    invoke-virtual {v2, v5, v4}, Lt2/i;->d(Landroid/view/View;I)I

    .line 321
    .line 322
    .line 323
    move-result v4

    .line 324
    iget-object v5, p0, Lw0/e;->t:Landroid/view/View;

    .line 325
    .line 326
    sub-int v6, v4, v6

    .line 327
    .line 328
    sget-object v7, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 329
    .line 330
    invoke-virtual {v5, v6}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 331
    .line 332
    .line 333
    :cond_12
    if-nez v1, :cond_13

    .line 334
    .line 335
    if-eqz v0, :cond_19

    .line 336
    .line 337
    :cond_13
    iget-object v0, p0, Lw0/e;->t:Landroid/view/View;

    .line 338
    .line 339
    invoke-virtual {v2, v0, v3, v4}, Lt2/i;->D(Landroid/view/View;II)V

    .line 340
    .line 341
    .line 342
    goto :goto_7

    .line 343
    :cond_14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    move v1, v3

    .line 348
    :goto_4
    if-ge v1, v0, :cond_19

    .line 349
    .line 350
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 351
    .line 352
    .line 353
    move-result v2

    .line 354
    iget v5, p0, Lw0/e;->k:I

    .line 355
    .line 356
    shl-int v6, v4, v2

    .line 357
    .line 358
    and-int/2addr v5, v6

    .line 359
    if-eqz v5, :cond_15

    .line 360
    .line 361
    move v5, v4

    .line 362
    goto :goto_5

    .line 363
    :cond_15
    move v5, v3

    .line 364
    :goto_5
    if-nez v5, :cond_16

    .line 365
    .line 366
    goto :goto_6

    .line 367
    :cond_16
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 372
    .line 373
    .line 374
    move-result v6

    .line 375
    iget-object v7, p0, Lw0/e;->d:[F

    .line 376
    .line 377
    aget v7, v7, v2

    .line 378
    .line 379
    sub-float v7, v5, v7

    .line 380
    .line 381
    iget-object v8, p0, Lw0/e;->e:[F

    .line 382
    .line 383
    aget v8, v8, v2

    .line 384
    .line 385
    sub-float v8, v6, v8

    .line 386
    .line 387
    invoke-virtual {p0, v7, v8, v2}, Lw0/e;->l(FFI)V

    .line 388
    .line 389
    .line 390
    iget v9, p0, Lw0/e;->a:I

    .line 391
    .line 392
    if-ne v9, v4, :cond_17

    .line 393
    .line 394
    goto :goto_7

    .line 395
    :cond_17
    float-to-int v5, v5

    .line 396
    float-to-int v6, v6

    .line 397
    invoke-virtual {p0, v5, v6}, Lw0/e;->h(II)Landroid/view/View;

    .line 398
    .line 399
    .line 400
    move-result-object v5

    .line 401
    invoke-virtual {p0, v5, v7, v8}, Lw0/e;->d(Landroid/view/View;FF)Z

    .line 402
    .line 403
    .line 404
    move-result v6

    .line 405
    if-eqz v6, :cond_18

    .line 406
    .line 407
    invoke-virtual {p0, v5, v2}, Lw0/e;->s(Landroid/view/View;I)Z

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    if-eqz v2, :cond_18

    .line 412
    .line 413
    goto :goto_7

    .line 414
    :cond_18
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 415
    .line 416
    goto :goto_4

    .line 417
    :cond_19
    :goto_7
    invoke-virtual {p0, p1}, Lw0/e;->n(Landroid/view/MotionEvent;)V

    .line 418
    .line 419
    .line 420
    return-void

    .line 421
    :cond_1a
    iget p1, p0, Lw0/e;->a:I

    .line 422
    .line 423
    if-ne p1, v4, :cond_1b

    .line 424
    .line 425
    invoke-virtual {p0}, Lw0/e;->k()V

    .line 426
    .line 427
    .line 428
    :cond_1b
    invoke-virtual {p0}, Lw0/e;->a()V

    .line 429
    .line 430
    .line 431
    return-void

    .line 432
    :cond_1c
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 437
    .line 438
    .line 439
    move-result v1

    .line 440
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 441
    .line 442
    .line 443
    move-result p1

    .line 444
    float-to-int v3, v0

    .line 445
    float-to-int v4, v1

    .line 446
    invoke-virtual {p0, v3, v4}, Lw0/e;->h(II)Landroid/view/View;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    invoke-virtual {p0, v0, v1, p1}, Lw0/e;->m(FFI)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {p0, v3, p1}, Lw0/e;->s(Landroid/view/View;I)Z

    .line 454
    .line 455
    .line 456
    iget-object v0, p0, Lw0/e;->h:[I

    .line 457
    .line 458
    aget p1, v0, p1

    .line 459
    .line 460
    iget v0, p0, Lw0/e;->q:I

    .line 461
    .line 462
    and-int/2addr p1, v0

    .line 463
    if-eqz p1, :cond_1d

    .line 464
    .line 465
    invoke-virtual {v2}, Lt2/i;->A()V

    .line 466
    .line 467
    .line 468
    :cond_1d
    :goto_8
    return-void
.end method

.method public final k()V
    .locals 6

    .line 1
    iget-object v0, p0, Lw0/e;->l:Landroid/view/VelocityTracker;

    .line 2
    .line 3
    const/16 v1, 0x3e8

    .line 4
    .line 5
    iget v2, p0, Lw0/e;->m:F

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lw0/e;->l:Landroid/view/VelocityTracker;

    .line 11
    .line 12
    iget v1, p0, Lw0/e;->c:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget v1, p0, Lw0/e;->n:F

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    cmpg-float v1, v3, v1

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    if-gez v1, :cond_0

    .line 28
    .line 29
    move v0, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    cmpl-float v1, v3, v2

    .line 32
    .line 33
    if-lez v1, :cond_2

    .line 34
    .line 35
    cmpl-float v0, v0, v4

    .line 36
    .line 37
    if-lez v0, :cond_1

    .line 38
    .line 39
    move v0, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    neg-float v0, v2

    .line 42
    :cond_2
    :goto_0
    iget-object v1, p0, Lw0/e;->l:Landroid/view/VelocityTracker;

    .line 43
    .line 44
    iget v3, p0, Lw0/e;->c:I

    .line 45
    .line 46
    invoke-virtual {v1, v3}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    iget v3, p0, Lw0/e;->n:F

    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    cmpg-float v3, v5, v3

    .line 57
    .line 58
    if-gez v3, :cond_3

    .line 59
    .line 60
    move v2, v4

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    cmpl-float v3, v5, v2

    .line 63
    .line 64
    if-lez v3, :cond_5

    .line 65
    .line 66
    cmpl-float v1, v1, v4

    .line 67
    .line 68
    if-lez v1, :cond_4

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    neg-float v2, v2

    .line 72
    goto :goto_1

    .line 73
    :cond_5
    move v2, v1

    .line 74
    :goto_1
    const/4 v1, 0x1

    .line 75
    iput-boolean v1, p0, Lw0/e;->u:Z

    .line 76
    .line 77
    iget-object v3, p0, Lw0/e;->s:Lt2/i;

    .line 78
    .line 79
    iget-object v4, p0, Lw0/e;->t:Landroid/view/View;

    .line 80
    .line 81
    invoke-virtual {v3, v4, v0, v2}, Lt2/i;->E(Landroid/view/View;FF)V

    .line 82
    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    iput-boolean v0, p0, Lw0/e;->u:Z

    .line 86
    .line 87
    iget v2, p0, Lw0/e;->a:I

    .line 88
    .line 89
    if-ne v2, v1, :cond_6

    .line 90
    .line 91
    invoke-virtual {p0, v0}, Lw0/e;->o(I)V

    .line 92
    .line 93
    .line 94
    :cond_6
    return-void
.end method

.method public final l(FFI)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, p3, v0}, Lw0/e;->c(FFII)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-virtual {p0, p2, p1, p3, v1}, Lw0/e;->c(FFII)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    or-int/lit8 v0, v0, 0x4

    .line 14
    .line 15
    :cond_0
    const/4 v1, 0x2

    .line 16
    invoke-virtual {p0, p1, p2, p3, v1}, Lw0/e;->c(FFII)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    or-int/lit8 v0, v0, 0x2

    .line 23
    .line 24
    :cond_1
    const/16 v1, 0x8

    .line 25
    .line 26
    invoke-virtual {p0, p2, p1, p3, v1}, Lw0/e;->c(FFII)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    or-int/lit8 v0, v0, 0x8

    .line 33
    .line 34
    :cond_2
    if-eqz v0, :cond_3

    .line 35
    .line 36
    iget-object p1, p0, Lw0/e;->i:[I

    .line 37
    .line 38
    aget p2, p1, p3

    .line 39
    .line 40
    or-int/2addr p2, v0

    .line 41
    aput p2, p1, p3

    .line 42
    .line 43
    iget-object p1, p0, Lw0/e;->s:Lt2/i;

    .line 44
    .line 45
    invoke-virtual {p1, v0, p3}, Lt2/i;->z(II)V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-void
.end method

.method public final m(FFI)V
    .locals 10

    .line 1
    iget-object v0, p0, Lw0/e;->d:[F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    array-length v2, v0

    .line 7
    if-gt v2, p3, :cond_2

    .line 8
    .line 9
    :cond_0
    add-int/lit8 v2, p3, 0x1

    .line 10
    .line 11
    new-array v3, v2, [F

    .line 12
    .line 13
    new-array v4, v2, [F

    .line 14
    .line 15
    new-array v5, v2, [F

    .line 16
    .line 17
    new-array v6, v2, [F

    .line 18
    .line 19
    new-array v7, v2, [I

    .line 20
    .line 21
    new-array v8, v2, [I

    .line 22
    .line 23
    new-array v2, v2, [I

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    array-length v9, v0

    .line 28
    invoke-static {v0, v1, v3, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lw0/e;->e:[F

    .line 32
    .line 33
    array-length v9, v0

    .line 34
    invoke-static {v0, v1, v4, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lw0/e;->f:[F

    .line 38
    .line 39
    array-length v9, v0

    .line 40
    invoke-static {v0, v1, v5, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lw0/e;->g:[F

    .line 44
    .line 45
    array-length v9, v0

    .line 46
    invoke-static {v0, v1, v6, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lw0/e;->h:[I

    .line 50
    .line 51
    array-length v9, v0

    .line 52
    invoke-static {v0, v1, v7, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lw0/e;->i:[I

    .line 56
    .line 57
    array-length v9, v0

    .line 58
    invoke-static {v0, v1, v8, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lw0/e;->j:[I

    .line 62
    .line 63
    array-length v9, v0

    .line 64
    invoke-static {v0, v1, v2, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 65
    .line 66
    .line 67
    :cond_1
    iput-object v3, p0, Lw0/e;->d:[F

    .line 68
    .line 69
    iput-object v4, p0, Lw0/e;->e:[F

    .line 70
    .line 71
    iput-object v5, p0, Lw0/e;->f:[F

    .line 72
    .line 73
    iput-object v6, p0, Lw0/e;->g:[F

    .line 74
    .line 75
    iput-object v7, p0, Lw0/e;->h:[I

    .line 76
    .line 77
    iput-object v8, p0, Lw0/e;->i:[I

    .line 78
    .line 79
    iput-object v2, p0, Lw0/e;->j:[I

    .line 80
    .line 81
    :cond_2
    iget-object v0, p0, Lw0/e;->d:[F

    .line 82
    .line 83
    iget-object v2, p0, Lw0/e;->f:[F

    .line 84
    .line 85
    aput p1, v2, p3

    .line 86
    .line 87
    aput p1, v0, p3

    .line 88
    .line 89
    iget-object v0, p0, Lw0/e;->e:[F

    .line 90
    .line 91
    iget-object v2, p0, Lw0/e;->g:[F

    .line 92
    .line 93
    aput p2, v2, p3

    .line 94
    .line 95
    aput p2, v0, p3

    .line 96
    .line 97
    iget-object v0, p0, Lw0/e;->h:[I

    .line 98
    .line 99
    float-to-int p1, p1

    .line 100
    float-to-int p2, p2

    .line 101
    iget-object v2, p0, Lw0/e;->v:Landroid/view/ViewGroup;

    .line 102
    .line 103
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    iget v4, p0, Lw0/e;->o:I

    .line 108
    .line 109
    add-int/2addr v3, v4

    .line 110
    const/4 v4, 0x1

    .line 111
    if-ge p1, v3, :cond_3

    .line 112
    .line 113
    move v1, v4

    .line 114
    :cond_3
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    iget v5, p0, Lw0/e;->o:I

    .line 119
    .line 120
    add-int/2addr v3, v5

    .line 121
    if-ge p2, v3, :cond_4

    .line 122
    .line 123
    or-int/lit8 v1, v1, 0x4

    .line 124
    .line 125
    :cond_4
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    iget v5, p0, Lw0/e;->o:I

    .line 130
    .line 131
    sub-int/2addr v3, v5

    .line 132
    if-le p1, v3, :cond_5

    .line 133
    .line 134
    or-int/lit8 v1, v1, 0x2

    .line 135
    .line 136
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    iget v2, p0, Lw0/e;->o:I

    .line 141
    .line 142
    sub-int/2addr p1, v2

    .line 143
    if-le p2, p1, :cond_6

    .line 144
    .line 145
    or-int/lit8 v1, v1, 0x8

    .line 146
    .line 147
    :cond_6
    aput v1, v0, p3

    .line 148
    .line 149
    iget p1, p0, Lw0/e;->k:I

    .line 150
    .line 151
    shl-int p2, v4, p3

    .line 152
    .line 153
    or-int/2addr p1, p2

    .line 154
    iput p1, p0, Lw0/e;->k:I

    .line 155
    .line 156
    return-void
.end method

.method public final n(Landroid/view/MotionEvent;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    iget v3, p0, Lw0/e;->k:I

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    shl-int/2addr v4, v2

    .line 16
    and-int/2addr v3, v4

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    iget-object v5, p0, Lw0/e;->f:[F

    .line 28
    .line 29
    aput v3, v5, v2

    .line 30
    .line 31
    iget-object v3, p0, Lw0/e;->g:[F

    .line 32
    .line 33
    aput v4, v3, v2

    .line 34
    .line 35
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return-void
.end method

.method public final o(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw0/e;->v:Landroid/view/ViewGroup;

    .line 2
    .line 3
    iget-object v1, p0, Lw0/e;->x:Ld3/d0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lw0/e;->a:I

    .line 9
    .line 10
    if-eq v0, p1, :cond_0

    .line 11
    .line 12
    iput p1, p0, Lw0/e;->a:I

    .line 13
    .line 14
    iget-object v0, p0, Lw0/e;->s:Lt2/i;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lt2/i;->C(I)V

    .line 17
    .line 18
    .line 19
    iget p1, p0, Lw0/e;->a:I

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    iput-object p1, p0, Lw0/e;->t:Landroid/view/View;

    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final p(II)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lw0/e;->u:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lw0/e;->l:Landroid/view/VelocityTracker;

    .line 6
    .line 7
    iget v1, p0, Lw0/e;->c:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    float-to-int v0, v0

    .line 14
    iget-object v1, p0, Lw0/e;->l:Landroid/view/VelocityTracker;

    .line 15
    .line 16
    iget v2, p0, Lw0/e;->c:I

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    float-to-int v1, v1

    .line 23
    invoke-virtual {p0, p1, p2, v0, v1}, Lw0/e;->i(IIII)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_0
    const-string p1, "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"

    .line 29
    .line 30
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    return p1
.end method

.method public final q(Landroid/view/MotionEvent;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lw0/e;->a()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v4, v0, Lw0/e;->l:Landroid/view/VelocityTracker;

    .line 19
    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iput-object v4, v0, Lw0/e;->l:Landroid/view/VelocityTracker;

    .line 27
    .line 28
    :cond_1
    iget-object v4, v0, Lw0/e;->l:Landroid/view/VelocityTracker;

    .line 29
    .line 30
    invoke-virtual {v4, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 31
    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    iget-object v7, v0, Lw0/e;->s:Lt2/i;

    .line 37
    .line 38
    if-eqz v2, :cond_d

    .line 39
    .line 40
    if-eq v2, v6, :cond_c

    .line 41
    .line 42
    if-eq v2, v5, :cond_5

    .line 43
    .line 44
    const/4 v8, 0x3

    .line 45
    if-eq v2, v8, :cond_c

    .line 46
    .line 47
    const/4 v8, 0x5

    .line 48
    if-eq v2, v8, :cond_3

    .line 49
    .line 50
    const/4 v5, 0x6

    .line 51
    if-eq v2, v5, :cond_2

    .line 52
    .line 53
    goto/16 :goto_2

    .line 54
    .line 55
    :cond_2
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-virtual {v0, v1}, Lw0/e;->e(I)V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_2

    .line 63
    .line 64
    :cond_3
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-virtual {v0, v8, v1, v2}, Lw0/e;->m(FFI)V

    .line 77
    .line 78
    .line 79
    iget v3, v0, Lw0/e;->a:I

    .line 80
    .line 81
    if-nez v3, :cond_4

    .line 82
    .line 83
    iget-object v1, v0, Lw0/e;->h:[I

    .line 84
    .line 85
    aget v1, v1, v2

    .line 86
    .line 87
    iget v2, v0, Lw0/e;->q:I

    .line 88
    .line 89
    and-int/2addr v1, v2

    .line 90
    if-eqz v1, :cond_f

    .line 91
    .line 92
    invoke-virtual {v7}, Lt2/i;->A()V

    .line 93
    .line 94
    .line 95
    goto/16 :goto_2

    .line 96
    .line 97
    :cond_4
    if-ne v3, v5, :cond_f

    .line 98
    .line 99
    float-to-int v3, v8

    .line 100
    float-to-int v1, v1

    .line 101
    invoke-virtual {v0, v3, v1}, Lw0/e;->h(II)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iget-object v3, v0, Lw0/e;->t:Landroid/view/View;

    .line 106
    .line 107
    if-ne v1, v3, :cond_f

    .line 108
    .line 109
    invoke-virtual {v0, v1, v2}, Lw0/e;->s(Landroid/view/View;I)Z

    .line 110
    .line 111
    .line 112
    goto/16 :goto_2

    .line 113
    .line 114
    :cond_5
    iget-object v2, v0, Lw0/e;->d:[F

    .line 115
    .line 116
    if-eqz v2, :cond_f

    .line 117
    .line 118
    iget-object v2, v0, Lw0/e;->e:[F

    .line 119
    .line 120
    if-nez v2, :cond_6

    .line 121
    .line 122
    goto/16 :goto_2

    .line 123
    .line 124
    :cond_6
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    move v3, v4

    .line 129
    :goto_0
    if-ge v3, v2, :cond_b

    .line 130
    .line 131
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    iget v8, v0, Lw0/e;->k:I

    .line 136
    .line 137
    shl-int v9, v6, v5

    .line 138
    .line 139
    and-int/2addr v8, v9

    .line 140
    if-eqz v8, :cond_a

    .line 141
    .line 142
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    iget-object v10, v0, Lw0/e;->d:[F

    .line 151
    .line 152
    aget v10, v10, v5

    .line 153
    .line 154
    sub-float v10, v8, v10

    .line 155
    .line 156
    iget-object v11, v0, Lw0/e;->e:[F

    .line 157
    .line 158
    aget v11, v11, v5

    .line 159
    .line 160
    sub-float v11, v9, v11

    .line 161
    .line 162
    float-to-int v8, v8

    .line 163
    float-to-int v9, v9

    .line 164
    invoke-virtual {v0, v8, v9}, Lw0/e;->h(II)Landroid/view/View;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    invoke-virtual {v0, v8, v10, v11}, Lw0/e;->d(Landroid/view/View;FF)Z

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    if-eqz v9, :cond_8

    .line 173
    .line 174
    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    .line 175
    .line 176
    .line 177
    move-result v12

    .line 178
    float-to-int v13, v10

    .line 179
    add-int/2addr v13, v12

    .line 180
    invoke-virtual {v7, v8, v13}, Lt2/i;->c(Landroid/view/View;I)I

    .line 181
    .line 182
    .line 183
    move-result v13

    .line 184
    invoke-virtual {v8}, Landroid/view/View;->getTop()I

    .line 185
    .line 186
    .line 187
    move-result v14

    .line 188
    float-to-int v15, v11

    .line 189
    add-int/2addr v15, v14

    .line 190
    invoke-virtual {v7, v8, v15}, Lt2/i;->d(Landroid/view/View;I)I

    .line 191
    .line 192
    .line 193
    move-result v15

    .line 194
    invoke-virtual {v7, v8}, Lt2/i;->q(Landroid/view/View;)I

    .line 195
    .line 196
    .line 197
    move-result v16

    .line 198
    invoke-virtual {v7}, Lt2/i;->r()I

    .line 199
    .line 200
    .line 201
    move-result v17

    .line 202
    if-eqz v16, :cond_7

    .line 203
    .line 204
    if-lez v16, :cond_8

    .line 205
    .line 206
    if-ne v13, v12, :cond_8

    .line 207
    .line 208
    :cond_7
    if-eqz v17, :cond_b

    .line 209
    .line 210
    if-lez v17, :cond_8

    .line 211
    .line 212
    if-ne v15, v14, :cond_8

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_8
    invoke-virtual {v0, v10, v11, v5}, Lw0/e;->l(FFI)V

    .line 216
    .line 217
    .line 218
    iget v10, v0, Lw0/e;->a:I

    .line 219
    .line 220
    if-ne v10, v6, :cond_9

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_9
    if-eqz v9, :cond_a

    .line 224
    .line 225
    invoke-virtual {v0, v8, v5}, Lw0/e;->s(Landroid/view/View;I)Z

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    if-eqz v5, :cond_a

    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 233
    .line 234
    goto :goto_0

    .line 235
    :cond_b
    :goto_1
    invoke-virtual/range {p0 .. p1}, Lw0/e;->n(Landroid/view/MotionEvent;)V

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_c
    invoke-virtual {v0}, Lw0/e;->a()V

    .line 240
    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_d
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    invoke-virtual {v0, v2, v3, v1}, Lw0/e;->m(FFI)V

    .line 256
    .line 257
    .line 258
    float-to-int v2, v2

    .line 259
    float-to-int v3, v3

    .line 260
    invoke-virtual {v0, v2, v3}, Lw0/e;->h(II)Landroid/view/View;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    iget-object v3, v0, Lw0/e;->t:Landroid/view/View;

    .line 265
    .line 266
    if-ne v2, v3, :cond_e

    .line 267
    .line 268
    iget v3, v0, Lw0/e;->a:I

    .line 269
    .line 270
    if-ne v3, v5, :cond_e

    .line 271
    .line 272
    invoke-virtual {v0, v2, v1}, Lw0/e;->s(Landroid/view/View;I)Z

    .line 273
    .line 274
    .line 275
    :cond_e
    iget-object v2, v0, Lw0/e;->h:[I

    .line 276
    .line 277
    aget v1, v2, v1

    .line 278
    .line 279
    iget v2, v0, Lw0/e;->q:I

    .line 280
    .line 281
    and-int/2addr v1, v2

    .line 282
    if-eqz v1, :cond_f

    .line 283
    .line 284
    invoke-virtual {v7}, Lt2/i;->A()V

    .line 285
    .line 286
    .line 287
    :cond_f
    :goto_2
    iget v1, v0, Lw0/e;->a:I

    .line 288
    .line 289
    if-ne v1, v6, :cond_10

    .line 290
    .line 291
    return v6

    .line 292
    :cond_10
    return v4
.end method

.method public final r(Landroid/view/View;II)Z
    .locals 0

    .line 1
    iput-object p1, p0, Lw0/e;->t:Landroid/view/View;

    .line 2
    .line 3
    const/4 p1, -0x1

    .line 4
    iput p1, p0, Lw0/e;->c:I

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p2, p3, p1, p1}, Lw0/e;->i(IIII)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget p2, p0, Lw0/e;->a:I

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    iget-object p2, p0, Lw0/e;->t:Landroid/view/View;

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    iput-object p2, p0, Lw0/e;->t:Landroid/view/View;

    .line 23
    .line 24
    :cond_0
    return p1
.end method

.method public final s(Landroid/view/View;I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lw0/e;->t:Landroid/view/View;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lw0/e;->c:I

    .line 7
    .line 8
    if-ne v0, p2, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lw0/e;->s:Lt2/i;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lt2/i;->Q(Landroid/view/View;I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iput p2, p0, Lw0/e;->c:I

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Lw0/e;->b(Landroid/view/View;I)V

    .line 24
    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    return p1
.end method
