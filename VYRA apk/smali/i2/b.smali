.class public final Li2/b;
.super Lt2/i;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Li2/b;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;F)V
    .locals 5

    .line 1
    iget v0, p0, Li2/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lv2/m;

    .line 7
    .line 8
    const v0, 0x461c4000    # 10000.0f

    .line 9
    .line 10
    .line 11
    div-float v1, p2, v0

    .line 12
    .line 13
    iget-object v2, p1, Lv2/m;->u:Lv2/p;

    .line 14
    .line 15
    iput v1, v2, Lv2/p;->b:F

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 18
    .line 19
    .line 20
    float-to-int p2, p2

    .line 21
    iget-object v1, p1, Lv2/o;->g:Lv2/l;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-virtual {v1, v2}, Lv2/l;->a(Z)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :cond_0
    iget-object v2, p1, Lv2/o;->f:Landroid/content/Context;

    .line 33
    .line 34
    iget-object v3, p1, Lv2/m;->y:Landroid/animation/ValueAnimator;

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    sget-object v3, Lb2/a;->a:Landroid/view/animation/LinearInterpolator;

    .line 40
    .line 41
    const v4, 0x7f0403e3

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v4, v3}, Lt2/i;->L(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    iput-object v4, p1, Lv2/m;->A:Landroid/animation/TimeInterpolator;

    .line 49
    .line 50
    const v4, 0x7f0403db

    .line 51
    .line 52
    .line 53
    invoke-static {v2, v4, v3}, Lt2/i;->L(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iput-object v2, p1, Lv2/m;->B:Landroid/animation/TimeInterpolator;

    .line 58
    .line 59
    new-instance v2, Landroid/animation/ValueAnimator;

    .line 60
    .line 61
    invoke-direct {v2}, Landroid/animation/ValueAnimator;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v2, p1, Lv2/m;->y:Landroid/animation/ValueAnimator;

    .line 65
    .line 66
    const-wide/16 v3, 0x1f4

    .line 67
    .line 68
    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 69
    .line 70
    .line 71
    iget-object v2, p1, Lv2/m;->y:Landroid/animation/ValueAnimator;

    .line 72
    .line 73
    const/4 v3, 0x2

    .line 74
    new-array v3, v3, [F

    .line 75
    .line 76
    fill-array-data v3, :array_0

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 80
    .line 81
    .line 82
    iget-object v2, p1, Lv2/m;->y:Landroid/animation/ValueAnimator;

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 86
    .line 87
    .line 88
    iget-object v2, p1, Lv2/m;->y:Landroid/animation/ValueAnimator;

    .line 89
    .line 90
    new-instance v3, Ld3/i;

    .line 91
    .line 92
    const/4 v4, 0x3

    .line 93
    invoke-direct {v3, v4, p1}, Ld3/i;-><init>(ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 97
    .line 98
    .line 99
    :goto_0
    int-to-float p2, p2

    .line 100
    iget v2, v1, Lv2/l;->o:F

    .line 101
    .line 102
    mul-float/2addr v2, v0

    .line 103
    cmpl-float v2, p2, v2

    .line 104
    .line 105
    const/high16 v3, 0x3f800000    # 1.0f

    .line 106
    .line 107
    if-ltz v2, :cond_2

    .line 108
    .line 109
    iget v1, v1, Lv2/l;->p:F

    .line 110
    .line 111
    mul-float/2addr v1, v0

    .line 112
    cmpg-float p2, p2, v1

    .line 113
    .line 114
    if-gtz p2, :cond_2

    .line 115
    .line 116
    move p2, v3

    .line 117
    goto :goto_1

    .line 118
    :cond_2
    const/4 p2, 0x0

    .line 119
    :goto_1
    iget v0, p1, Lv2/m;->v:F

    .line 120
    .line 121
    cmpl-float v0, p2, v0

    .line 122
    .line 123
    iget-object v1, p1, Lv2/m;->y:Landroid/animation/ValueAnimator;

    .line 124
    .line 125
    if-eqz v0, :cond_5

    .line 126
    .line 127
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_3

    .line 132
    .line 133
    iget-object v0, p1, Lv2/m;->y:Landroid/animation/ValueAnimator;

    .line 134
    .line 135
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 136
    .line 137
    .line 138
    :cond_3
    iput p2, p1, Lv2/m;->v:F

    .line 139
    .line 140
    cmpl-float p2, p2, v3

    .line 141
    .line 142
    if-nez p2, :cond_4

    .line 143
    .line 144
    iget-object p2, p1, Lv2/m;->A:Landroid/animation/TimeInterpolator;

    .line 145
    .line 146
    iput-object p2, p1, Lv2/m;->z:Landroid/animation/TimeInterpolator;

    .line 147
    .line 148
    iget-object p1, p1, Lv2/m;->y:Landroid/animation/ValueAnimator;

    .line 149
    .line 150
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_4
    iget-object p2, p1, Lv2/m;->B:Landroid/animation/TimeInterpolator;

    .line 155
    .line 156
    iput-object p2, p1, Lv2/m;->z:Landroid/animation/TimeInterpolator;

    .line 157
    .line 158
    iget-object p1, p1, Lv2/m;->y:Landroid/animation/ValueAnimator;

    .line 159
    .line 160
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->reverse()V

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_5
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-nez v0, :cond_6

    .line 169
    .line 170
    iget-object v0, p1, Lv2/m;->u:Lv2/p;

    .line 171
    .line 172
    iput p2, v0, Lv2/p;->d:F

    .line 173
    .line 174
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 175
    .line 176
    .line 177
    :cond_6
    :goto_2
    return-void

    .line 178
    :pswitch_0
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 179
    .line 180
    invoke-static {p1, p2}, Lcom/google/android/material/button/MaterialButton;->c(Lcom/google/android/material/button/MaterialButton;F)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final p(Ljava/lang/Object;)F
    .locals 1

    .line 1
    iget v0, p0, Li2/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lv2/m;

    .line 7
    .line 8
    iget-object p1, p1, Lv2/m;->u:Lv2/p;

    .line 9
    .line 10
    iget p1, p1, Lv2/p;->b:F

    .line 11
    .line 12
    const v0, 0x461c4000    # 10000.0f

    .line 13
    .line 14
    .line 15
    mul-float/2addr p1, v0

    .line 16
    return p1

    .line 17
    :pswitch_0
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 18
    .line 19
    invoke-static {p1}, Lcom/google/android/material/button/MaterialButton;->b(Lcom/google/android/material/button/MaterialButton;)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
