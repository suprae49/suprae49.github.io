.class public final Lv2/m;
.super Lv2/o;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final C:Li2/b;


# instance fields
.field public A:Landroid/animation/TimeInterpolator;

.field public B:Landroid/animation/TimeInterpolator;

.field public final s:Lv2/f;

.field public final t:Lz0/d;

.field public final u:Lv2/p;

.field public v:F

.field public w:Z

.field public final x:Landroid/animation/ValueAnimator;

.field public y:Landroid/animation/ValueAnimator;

.field public z:Landroid/animation/TimeInterpolator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li2/b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Li2/b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lv2/m;->C:Li2/b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lv2/l;Lv2/f;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1, p2}, Lv2/o;-><init>(Landroid/content/Context;Lv2/l;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lv2/m;->w:Z

    .line 6
    .line 7
    iput-object p3, p0, Lv2/m;->s:Lv2/f;

    .line 8
    .line 9
    new-instance p1, Lv2/p;

    .line 10
    .line 11
    invoke-direct {p1}, Lv2/p;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lv2/m;->u:Lv2/p;

    .line 15
    .line 16
    const/4 p3, 0x1

    .line 17
    iput-boolean p3, p1, Lv2/p;->g:Z

    .line 18
    .line 19
    new-instance p1, Lz0/d;

    .line 20
    .line 21
    sget-object v0, Lv2/m;->C:Li2/b;

    .line 22
    .line 23
    invoke-direct {p1, p0, v0}, Lz0/d;-><init>(Ljava/lang/Object;Lt2/i;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lv2/m;->t:Lz0/d;

    .line 27
    .line 28
    new-instance v0, Lz0/e;

    .line 29
    .line 30
    invoke-direct {v0}, Lz0/e;-><init>()V

    .line 31
    .line 32
    .line 33
    const/high16 v1, 0x3f800000    # 1.0f

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lz0/e;->a(F)V

    .line 36
    .line 37
    .line 38
    const/high16 v2, 0x42480000    # 50.0f

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Lz0/e;->b(F)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p1, Lz0/d;->k:Lz0/e;

    .line 44
    .line 45
    new-instance p1, Landroid/animation/ValueAnimator;

    .line 46
    .line 47
    invoke-direct {p1}, Landroid/animation/ValueAnimator;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lv2/m;->x:Landroid/animation/ValueAnimator;

    .line 51
    .line 52
    const-wide/16 v2, 0x3e8

    .line 53
    .line 54
    invoke-virtual {p1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    new-array v2, v0, [F

    .line 59
    .line 60
    fill-array-data v2, :array_0

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 64
    .line 65
    .line 66
    const/4 v2, -0x1

    .line 67
    invoke-virtual {p1, v2}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 68
    .line 69
    .line 70
    new-instance v2, Lc2/b;

    .line 71
    .line 72
    invoke-direct {v2, p0, v0, p2}, Lc2/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, p3}, Lv2/l;->a(Z)Z

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    if-eqz p3, :cond_0

    .line 83
    .line 84
    iget p2, p2, Lv2/l;->m:I

    .line 85
    .line 86
    if-eqz p2, :cond_0

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 89
    .line 90
    .line 91
    :cond_0
    iget p1, p0, Lv2/o;->n:F

    .line 92
    .line 93
    cmpl-float p1, p1, v1

    .line 94
    .line 95
    if-eqz p1, :cond_1

    .line 96
    .line 97
    iput v1, p0, Lv2/o;->n:F

    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 100
    .line 101
    .line 102
    :cond_1
    return-void

    .line 103
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_6

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_6

    .line 16
    .line 17
    iget-object v0, p0, Lv2/o;->q:Landroid/graphics/Rect;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto/16 :goto_5

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {p0}, Lv2/o;->b()F

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    iget-object v0, p0, Lv2/o;->i:Landroid/animation/ObjectAnimator;

    .line 39
    .line 40
    const/4 v6, 0x1

    .line 41
    const/4 v8, 0x0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v4, v6

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    :goto_0
    move v4, v8

    .line 54
    :goto_1
    iget-object v0, p0, Lv2/o;->j:Landroid/animation/ObjectAnimator;

    .line 55
    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    move v5, v6

    .line 66
    goto :goto_3

    .line 67
    :cond_4
    :goto_2
    move v5, v8

    .line 68
    :goto_3
    iget-object v0, p0, Lv2/m;->s:Lv2/f;

    .line 69
    .line 70
    move-object v1, p1

    .line 71
    invoke-virtual/range {v0 .. v5}, Lv2/r;->b(Landroid/graphics/Canvas;Landroid/graphics/Rect;FZZ)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lv2/o;->c()F

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-object v9, p0, Lv2/m;->u:Lv2/p;

    .line 79
    .line 80
    iput v0, v9, Lv2/p;->e:F

    .line 81
    .line 82
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 83
    .line 84
    iget-object v2, p0, Lv2/o;->o:Landroid/graphics/Paint;

    .line 85
    .line 86
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 90
    .line 91
    .line 92
    iget-object v10, p0, Lv2/o;->g:Lv2/l;

    .line 93
    .line 94
    iget-object v0, v10, Lv2/l;->e:[I

    .line 95
    .line 96
    aget v0, v0, v8

    .line 97
    .line 98
    iput v0, v9, Lv2/p;->c:I

    .line 99
    .line 100
    iget v0, v10, Lv2/l;->i:I

    .line 101
    .line 102
    if-lez v0, :cond_5

    .line 103
    .line 104
    int-to-float v0, v0

    .line 105
    iget v1, v9, Lv2/p;->b:F

    .line 106
    .line 107
    const/4 v3, 0x0

    .line 108
    const v4, 0x3c23d70a    # 0.01f

    .line 109
    .line 110
    .line 111
    invoke-static {v1, v3, v4}, Lu1/h0;->i(FFF)F

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    mul-float/2addr v1, v0

    .line 116
    div-float/2addr v1, v4

    .line 117
    float-to-int v7, v1

    .line 118
    iget v3, v9, Lv2/p;->b:F

    .line 119
    .line 120
    iget v5, v10, Lv2/l;->f:I

    .line 121
    .line 122
    iget v6, p0, Lv2/o;->p:I

    .line 123
    .line 124
    iget-object v0, p0, Lv2/m;->s:Lv2/f;

    .line 125
    .line 126
    const/high16 v4, 0x3f800000    # 1.0f

    .line 127
    .line 128
    move-object v1, p1

    .line 129
    invoke-virtual/range {v0 .. v7}, Lv2/f;->f(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 130
    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_5
    iget v5, v10, Lv2/l;->f:I

    .line 134
    .line 135
    iget v6, p0, Lv2/o;->p:I

    .line 136
    .line 137
    const/4 v7, 0x0

    .line 138
    iget-object v0, p0, Lv2/m;->s:Lv2/f;

    .line 139
    .line 140
    const/4 v3, 0x0

    .line 141
    const/high16 v4, 0x3f800000    # 1.0f

    .line 142
    .line 143
    move-object v1, p1

    .line 144
    invoke-virtual/range {v0 .. v7}, Lv2/f;->f(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFIII)V

    .line 145
    .line 146
    .line 147
    :goto_4
    iget-object v0, p0, Lv2/m;->s:Lv2/f;

    .line 148
    .line 149
    iget v3, p0, Lv2/o;->p:I

    .line 150
    .line 151
    invoke-virtual {v0, p1, v2, v9, v3}, Lv2/f;->e(Landroid/graphics/Canvas;Landroid/graphics/Paint;Lv2/p;I)V

    .line 152
    .line 153
    .line 154
    iget-object v0, v10, Lv2/l;->e:[I

    .line 155
    .line 156
    aget v0, v0, v8

    .line 157
    .line 158
    iget-object v0, p0, Lv2/m;->s:Lv2/f;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 164
    .line 165
    .line 166
    :cond_6
    :goto_5
    return-void
.end method

.method public final e(ZZZ)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lv2/o;->e(ZZZ)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object p2, p0, Lv2/o;->h:Lv2/a;

    .line 6
    .line 7
    iget-object p3, p0, Lv2/o;->f:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {p3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string p2, "animator_duration_scale"

    .line 17
    .line 18
    const/high16 v0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    invoke-static {p3, p2, v0}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    const/4 p3, 0x0

    .line 25
    cmpl-float p3, p2, p3

    .line 26
    .line 27
    if-nez p3, :cond_0

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    iput-boolean p2, p0, Lv2/m;->w:Z

    .line 31
    .line 32
    return p1

    .line 33
    :cond_0
    const/4 p3, 0x0

    .line 34
    iput-boolean p3, p0, Lv2/m;->w:Z

    .line 35
    .line 36
    iget-object p3, p0, Lv2/m;->t:Lz0/d;

    .line 37
    .line 38
    iget-object p3, p3, Lz0/d;->k:Lz0/e;

    .line 39
    .line 40
    const/high16 v0, 0x42480000    # 50.0f

    .line 41
    .line 42
    div-float/2addr v0, p2

    .line 43
    invoke-virtual {p3, v0}, Lz0/e;->b(F)V

    .line 44
    .line 45
    .line 46
    return p1
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/m;->s:Lv2/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv2/f;->g()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/m;->s:Lv2/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv2/f;->g()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final jumpToCurrentState()V
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/m;->t:Lz0/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz0/d;->d()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    int-to-float v0, v0

    .line 11
    const v1, 0x461c4000    # 10000.0f

    .line 12
    .line 13
    .line 14
    div-float/2addr v0, v1

    .line 15
    iget-object v1, p0, Lv2/m;->u:Lv2/p;

    .line 16
    .line 17
    iput v0, v1, Lv2/p;->b:F

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final onLevelChange(I)Z
    .locals 9

    .line 1
    int-to-float p1, p1

    .line 2
    iget-object v0, p0, Lv2/o;->g:Lv2/l;

    .line 3
    .line 4
    iget v1, v0, Lv2/l;->o:F

    .line 5
    .line 6
    const v2, 0x461c4000    # 10000.0f

    .line 7
    .line 8
    .line 9
    mul-float/2addr v1, v2

    .line 10
    cmpl-float v1, p1, v1

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-ltz v1, :cond_0

    .line 14
    .line 15
    iget v0, v0, Lv2/l;->p:F

    .line 16
    .line 17
    mul-float/2addr v0, v2

    .line 18
    cmpg-float v0, p1, v0

    .line 19
    .line 20
    if-gtz v0, :cond_0

    .line 21
    .line 22
    const/high16 v0, 0x3f800000    # 1.0f

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v3

    .line 26
    :goto_0
    iget-boolean v1, p0, Lv2/m;->w:Z

    .line 27
    .line 28
    iget-object v4, p0, Lv2/m;->u:Lv2/p;

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    iget-object v6, p0, Lv2/m;->t:Lz0/d;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v6}, Lz0/d;->d()V

    .line 36
    .line 37
    .line 38
    div-float/2addr p1, v2

    .line 39
    iput p1, v4, Lv2/p;->b:F

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 42
    .line 43
    .line 44
    iput v0, v4, Lv2/p;->d:F

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 47
    .line 48
    .line 49
    return v5

    .line 50
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-lez v0, :cond_4

    .line 67
    .line 68
    if-gtz v1, :cond_2

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    int-to-double v0, v0

    .line 76
    const-wide v7, 0x400921fb54442d18L    # Math.PI

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    mul-double/2addr v0, v7

    .line 82
    const-wide v7, 0x40c3880000000000L    # 10000.0

    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    div-double/2addr v7, v0

    .line 88
    double-to-float v0, v7

    .line 89
    cmpg-float v1, v0, v3

    .line 90
    .line 91
    if-lez v1, :cond_3

    .line 92
    .line 93
    iput v0, v6, Lz0/d;->h:F

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    const-string p1, "Minimum visible change must be positive."

    .line 100
    .line 101
    invoke-static {p1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const/4 p1, 0x0

    .line 105
    return p1

    .line 106
    :cond_4
    :goto_1
    iget v0, v4, Lv2/p;->b:F

    .line 107
    .line 108
    mul-float/2addr v0, v2

    .line 109
    iput v0, v6, Lz0/d;->b:F

    .line 110
    .line 111
    iput-boolean v5, v6, Lz0/d;->c:Z

    .line 112
    .line 113
    invoke-virtual {v6, p1}, Lz0/d;->a(F)V

    .line 114
    .line 115
    .line 116
    return v5
.end method
