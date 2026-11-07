.class public abstract Lv2/r;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:Lv2/l;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/Path;

.field public final d:Landroid/graphics/PathMeasure;

.field public final e:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>(Lv2/l;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lv2/r;->b:Landroid/graphics/Path;

    .line 10
    .line 11
    new-instance v1, Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Lv2/r;->c:Landroid/graphics/Path;

    .line 17
    .line 18
    new-instance v1, Landroid/graphics/PathMeasure;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, v0, v2}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lv2/r;->d:Landroid/graphics/PathMeasure;

    .line 25
    .line 26
    iput-object p1, p0, Lv2/r;->a:Lv2/l;

    .line 27
    .line 28
    new-instance p1, Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lv2/r;->e:Landroid/graphics/Matrix;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public final b(Landroid/graphics/Canvas;Landroid/graphics/Rect;FZZ)V
    .locals 9

    .line 1
    iget-object v0, p0, Lv2/r;->a:Lv2/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv2/l;->b()V

    .line 4
    .line 5
    .line 6
    move-object v0, p0

    .line 7
    check-cast v0, Lv2/f;

    .line 8
    .line 9
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    int-to-float v1, v1

    .line 14
    invoke-virtual {v0}, Lv2/f;->g()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    int-to-float v2, v2

    .line 19
    div-float/2addr v1, v2

    .line 20
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    int-to-float v2, v2

    .line 25
    invoke-virtual {v0}, Lv2/f;->g()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    int-to-float v3, v3

    .line 30
    div-float/2addr v2, v3

    .line 31
    iget-object v3, v0, Lv2/r;->a:Lv2/l;

    .line 32
    .line 33
    iget v4, v3, Lv2/l;->r:I

    .line 34
    .line 35
    int-to-float v4, v4

    .line 36
    const/high16 v5, 0x40000000    # 2.0f

    .line 37
    .line 38
    div-float/2addr v4, v5

    .line 39
    iget v6, v3, Lv2/l;->s:I

    .line 40
    .line 41
    int-to-float v6, v6

    .line 42
    add-float/2addr v4, v6

    .line 43
    mul-float v6, v4, v1

    .line 44
    .line 45
    mul-float v7, v4, v2

    .line 46
    .line 47
    iget v8, p2, Landroid/graphics/Rect;->left:I

    .line 48
    .line 49
    int-to-float v8, v8

    .line 50
    add-float/2addr v6, v8

    .line 51
    iget p2, p2, Landroid/graphics/Rect;->top:I

    .line 52
    .line 53
    int-to-float p2, p2

    .line 54
    add-float/2addr v7, p2

    .line 55
    invoke-virtual {p1, v6, v7}, Landroid/graphics/Canvas;->translate(FF)V

    .line 56
    .line 57
    .line 58
    const/high16 p2, -0x3d4c0000    # -90.0f

    .line 59
    .line 60
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->rotate(F)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 64
    .line 65
    .line 66
    iget p2, v3, Lv2/l;->t:I

    .line 67
    .line 68
    const/high16 v1, 0x3f800000    # 1.0f

    .line 69
    .line 70
    if-eqz p2, :cond_0

    .line 71
    .line 72
    const/high16 p2, -0x40800000    # -1.0f

    .line 73
    .line 74
    invoke-virtual {p1, v1, p2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 75
    .line 76
    .line 77
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 78
    .line 79
    const/16 v2, 0x1d

    .line 80
    .line 81
    if-ne p2, v2, :cond_0

    .line 82
    .line 83
    const p2, 0x3dcccccd    # 0.1f

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->rotate(F)V

    .line 87
    .line 88
    .line 89
    :cond_0
    neg-float p2, v4

    .line 90
    invoke-virtual {p1, p2, p2, v4, v4}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 91
    .line 92
    .line 93
    iget p1, v3, Lv2/l;->a:I

    .line 94
    .line 95
    int-to-float p2, p1

    .line 96
    mul-float v2, p2, p3

    .line 97
    .line 98
    iput v2, v0, Lv2/f;->f:F

    .line 99
    .line 100
    const/4 v2, 0x2

    .line 101
    div-int/2addr p1, v2

    .line 102
    iget-boolean v4, v3, Lv2/l;->d:Z

    .line 103
    .line 104
    if-eqz v4, :cond_1

    .line 105
    .line 106
    iget v4, v3, Lv2/l;->c:F

    .line 107
    .line 108
    mul-float/2addr p2, v4

    .line 109
    float-to-int p2, p2

    .line 110
    goto :goto_0

    .line 111
    :cond_1
    iget p2, v3, Lv2/l;->b:I

    .line 112
    .line 113
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    int-to-float p1, p1

    .line 118
    mul-float/2addr p1, p3

    .line 119
    iput p1, v0, Lv2/f;->g:F

    .line 120
    .line 121
    iget p1, v3, Lv2/l;->l:I

    .line 122
    .line 123
    int-to-float p1, p1

    .line 124
    mul-float/2addr p1, p3

    .line 125
    iput p1, v0, Lv2/f;->h:F

    .line 126
    .line 127
    iget p1, v3, Lv2/l;->r:I

    .line 128
    .line 129
    iget p2, v3, Lv2/l;->a:I

    .line 130
    .line 131
    sub-int/2addr p1, p2

    .line 132
    int-to-float p1, p1

    .line 133
    div-float/2addr p1, v5

    .line 134
    iput p1, v0, Lv2/f;->i:F

    .line 135
    .line 136
    if-nez p4, :cond_2

    .line 137
    .line 138
    if-eqz p5, :cond_8

    .line 139
    .line 140
    :cond_2
    sub-float v4, v1, p3

    .line 141
    .line 142
    int-to-float p2, p2

    .line 143
    mul-float/2addr v4, p2

    .line 144
    div-float/2addr v4, v5

    .line 145
    if-eqz p4, :cond_3

    .line 146
    .line 147
    iget p2, v3, Lv2/l;->g:I

    .line 148
    .line 149
    if-eq p2, v2, :cond_4

    .line 150
    .line 151
    :cond_3
    const/4 p2, 0x1

    .line 152
    if-eqz p5, :cond_5

    .line 153
    .line 154
    iget v5, v3, Lv2/l;->h:I

    .line 155
    .line 156
    if-ne v5, p2, :cond_5

    .line 157
    .line 158
    :cond_4
    add-float/2addr p1, v4

    .line 159
    iput p1, v0, Lv2/f;->i:F

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_5
    if-eqz p4, :cond_6

    .line 163
    .line 164
    iget p4, v3, Lv2/l;->g:I

    .line 165
    .line 166
    if-eq p4, p2, :cond_7

    .line 167
    .line 168
    :cond_6
    if-eqz p5, :cond_8

    .line 169
    .line 170
    iget p2, v3, Lv2/l;->h:I

    .line 171
    .line 172
    if-ne p2, v2, :cond_8

    .line 173
    .line 174
    :cond_7
    sub-float/2addr p1, v4

    .line 175
    iput p1, v0, Lv2/f;->i:F

    .line 176
    .line 177
    :cond_8
    :goto_1
    if-eqz p5, :cond_9

    .line 178
    .line 179
    iget p1, v3, Lv2/l;->h:I

    .line 180
    .line 181
    const/4 p2, 0x3

    .line 182
    if-ne p1, p2, :cond_9

    .line 183
    .line 184
    iput p3, v0, Lv2/f;->o:F

    .line 185
    .line 186
    return-void

    .line 187
    :cond_9
    iput v1, v0, Lv2/f;->o:F

    .line 188
    .line 189
    return-void
.end method
