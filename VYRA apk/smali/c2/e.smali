.class public abstract Lc2/e;
.super Lc2/g;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public h:Lc2/d;

.field public i:Landroid/widget/OverScroller;

.field public j:Z

.field public k:I

.field public l:I

.field public m:I

.field public n:Landroid/view/VelocityTracker;


# virtual methods
.method public final A(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V
    .locals 6

    .line 1
    const/high16 v4, -0x80000000

    .line 2
    .line 3
    const v5, 0x7fffffff

    .line 4
    .line 5
    .line 6
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move v3, p3

    .line 10
    invoke-virtual/range {v0 .. v5}, Lc2/e;->z(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final k(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1
    iget v0, p0, Lc2/e;->m:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, Lc2/e;->m:I

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x2

    .line 24
    const/4 v2, 0x1

    .line 25
    const/4 v3, -0x1

    .line 26
    const/4 v4, 0x0

    .line 27
    if-ne v0, v1, :cond_3

    .line 28
    .line 29
    iget-boolean v0, p0, Lc2/e;->j:Z

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    iget v0, p0, Lc2/e;->k:I

    .line 34
    .line 35
    if-ne v0, v3, :cond_1

    .line 36
    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :cond_1
    invoke-virtual {p3, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-ne v0, v3, :cond_2

    .line 44
    .line 45
    goto/16 :goto_1

    .line 46
    .line 47
    :cond_2
    invoke-virtual {p3, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    float-to-int v0, v0

    .line 52
    iget v1, p0, Lc2/e;->l:I

    .line 53
    .line 54
    sub-int v1, v0, v1

    .line 55
    .line 56
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    iget v5, p0, Lc2/e;->m:I

    .line 61
    .line 62
    if-le v1, v5, :cond_3

    .line 63
    .line 64
    iput v0, p0, Lc2/e;->l:I

    .line 65
    .line 66
    return v2

    .line 67
    :cond_3
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_7

    .line 72
    .line 73
    iput v3, p0, Lc2/e;->k:I

    .line 74
    .line 75
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    float-to-int v0, v0

    .line 80
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    float-to-int v1, v1

    .line 85
    move-object v5, p0

    .line 86
    check-cast v5, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;

    .line 87
    .line 88
    move-object v6, p2

    .line 89
    check-cast v6, Lcom/google/android/material/appbar/AppBarLayout;

    .line 90
    .line 91
    iget-object v5, v5, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->s:Ljava/lang/ref/WeakReference;

    .line 92
    .line 93
    if-eqz v5, :cond_4

    .line 94
    .line 95
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    check-cast v5, Landroid/view/View;

    .line 100
    .line 101
    if-eqz v5, :cond_5

    .line 102
    .line 103
    invoke-virtual {v5}, Landroid/view/View;->isShown()Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-eqz v6, :cond_5

    .line 108
    .line 109
    invoke-virtual {v5, v3}, Landroid/view/View;->canScrollVertically(I)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-nez v3, :cond_5

    .line 114
    .line 115
    :cond_4
    invoke-virtual {p1, p2, v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->o(Landroid/view/View;II)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_5

    .line 120
    .line 121
    move p1, v2

    .line 122
    goto :goto_0

    .line 123
    :cond_5
    move p1, v4

    .line 124
    :goto_0
    iput-boolean p1, p0, Lc2/e;->j:Z

    .line 125
    .line 126
    if-eqz p1, :cond_7

    .line 127
    .line 128
    iput v1, p0, Lc2/e;->l:I

    .line 129
    .line 130
    invoke-virtual {p3, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    iput p1, p0, Lc2/e;->k:I

    .line 135
    .line 136
    iget-object p1, p0, Lc2/e;->n:Landroid/view/VelocityTracker;

    .line 137
    .line 138
    if-nez p1, :cond_6

    .line 139
    .line 140
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iput-object p1, p0, Lc2/e;->n:Landroid/view/VelocityTracker;

    .line 145
    .line 146
    :cond_6
    iget-object p1, p0, Lc2/e;->i:Landroid/widget/OverScroller;

    .line 147
    .line 148
    if-eqz p1, :cond_7

    .line 149
    .line 150
    invoke-virtual {p1}, Landroid/widget/OverScroller;->isFinished()Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-nez p1, :cond_7

    .line 155
    .line 156
    iget-object p1, p0, Lc2/e;->i:Landroid/widget/OverScroller;

    .line 157
    .line 158
    invoke-virtual {p1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 159
    .line 160
    .line 161
    return v2

    .line 162
    :cond_7
    iget-object p1, p0, Lc2/e;->n:Landroid/view/VelocityTracker;

    .line 163
    .line 164
    if-eqz p1, :cond_8

    .line 165
    .line 166
    invoke-virtual {p1, p3}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 167
    .line 168
    .line 169
    :cond_8
    :goto_1
    return v4
.end method

.method public final v(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p3

    .line 4
    .line 5
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, -0x1

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x1

    .line 13
    if-eq v1, v8, :cond_4

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    if-eq v1, v4, :cond_2

    .line 17
    .line 18
    const/4 v4, 0x3

    .line 19
    if-eq v1, v4, :cond_9

    .line 20
    .line 21
    const/4 v2, 0x6

    .line 22
    if-eq v1, v2, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    move v1, v8

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move v1, v7

    .line 34
    :goto_0
    invoke-virtual {v6, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iput v2, v0, Lc2/e;->k:I

    .line 39
    .line 40
    invoke-virtual {v6, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/high16 v2, 0x3f000000    # 0.5f

    .line 45
    .line 46
    add-float/2addr v1, v2

    .line 47
    float-to-int v1, v1

    .line 48
    iput v1, v0, Lc2/e;->l:I

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    iget v1, v0, Lc2/e;->k:I

    .line 52
    .line 53
    invoke-virtual {v6, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-ne v1, v3, :cond_3

    .line 58
    .line 59
    goto/16 :goto_5

    .line 60
    .line 61
    :cond_3
    invoke-virtual {v6, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    float-to-int v1, v1

    .line 66
    iget v2, v0, Lc2/e;->l:I

    .line 67
    .line 68
    sub-int/2addr v2, v1

    .line 69
    iput v1, v0, Lc2/e;->l:I

    .line 70
    .line 71
    move-object/from16 v1, p2

    .line 72
    .line 73
    check-cast v1, Lcom/google/android/material/appbar/AppBarLayout;

    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/google/android/material/appbar/AppBarLayout;->getDownNestedScrollRange()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    neg-int v3, v3

    .line 80
    invoke-virtual {v1}, Lcom/google/android/material/appbar/AppBarLayout;->getTopInset()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    add-int v4, v1, v3

    .line 85
    .line 86
    invoke-virtual {v0}, Lc2/e;->y()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    sub-int v3, v1, v2

    .line 91
    .line 92
    const/4 v5, 0x0

    .line 93
    move-object/from16 v1, p1

    .line 94
    .line 95
    move-object/from16 v2, p2

    .line 96
    .line 97
    invoke-virtual/range {v0 .. v5}, Lc2/e;->z(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I

    .line 98
    .line 99
    .line 100
    :goto_1
    move v1, v7

    .line 101
    goto/16 :goto_4

    .line 102
    .line 103
    :cond_4
    move-object/from16 v1, p1

    .line 104
    .line 105
    move-object/from16 v4, p2

    .line 106
    .line 107
    iget-object v5, v0, Lc2/e;->n:Landroid/view/VelocityTracker;

    .line 108
    .line 109
    if-eqz v5, :cond_9

    .line 110
    .line 111
    invoke-virtual {v5, v6}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 112
    .line 113
    .line 114
    iget-object v5, v0, Lc2/e;->n:Landroid/view/VelocityTracker;

    .line 115
    .line 116
    const/16 v9, 0x3e8

    .line 117
    .line 118
    invoke-virtual {v5, v9}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 119
    .line 120
    .line 121
    iget-object v5, v0, Lc2/e;->n:Landroid/view/VelocityTracker;

    .line 122
    .line 123
    iget v9, v0, Lc2/e;->k:I

    .line 124
    .line 125
    invoke-virtual {v5, v9}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    move-object v9, v4

    .line 130
    check-cast v9, Lcom/google/android/material/appbar/AppBarLayout;

    .line 131
    .line 132
    invoke-virtual {v9}, Lcom/google/android/material/appbar/AppBarLayout;->getTotalScrollRange()I

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    neg-int v10, v10

    .line 137
    iget-object v11, v0, Lc2/e;->h:Lc2/d;

    .line 138
    .line 139
    if-eqz v11, :cond_5

    .line 140
    .line 141
    invoke-virtual {v4, v11}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 142
    .line 143
    .line 144
    iput-object v2, v0, Lc2/e;->h:Lc2/d;

    .line 145
    .line 146
    :cond_5
    iget-object v11, v0, Lc2/e;->i:Landroid/widget/OverScroller;

    .line 147
    .line 148
    if-nez v11, :cond_6

    .line 149
    .line 150
    new-instance v11, Landroid/widget/OverScroller;

    .line 151
    .line 152
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 153
    .line 154
    .line 155
    move-result-object v12

    .line 156
    invoke-direct {v11, v12}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    .line 157
    .line 158
    .line 159
    iput-object v11, v0, Lc2/e;->i:Landroid/widget/OverScroller;

    .line 160
    .line 161
    :cond_6
    iget-object v11, v0, Lc2/e;->i:Landroid/widget/OverScroller;

    .line 162
    .line 163
    invoke-virtual {v0}, Lc2/g;->w()I

    .line 164
    .line 165
    .line 166
    move-result v13

    .line 167
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 168
    .line 169
    .line 170
    move-result v15

    .line 171
    const/16 v16, 0x0

    .line 172
    .line 173
    const/16 v17, 0x0

    .line 174
    .line 175
    const/4 v12, 0x0

    .line 176
    const/4 v14, 0x0

    .line 177
    const/16 v19, 0x0

    .line 178
    .line 179
    move/from16 v18, v10

    .line 180
    .line 181
    invoke-virtual/range {v11 .. v19}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 182
    .line 183
    .line 184
    iget-object v5, v0, Lc2/e;->i:Landroid/widget/OverScroller;

    .line 185
    .line 186
    invoke-virtual {v5}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    if-eqz v5, :cond_7

    .line 191
    .line 192
    new-instance v5, Lc2/d;

    .line 193
    .line 194
    const/4 v9, 0x0

    .line 195
    invoke-direct {v5, v0, v1, v4, v9}, Lc2/d;-><init>(Ljava/lang/Object;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;I)V

    .line 196
    .line 197
    .line 198
    iput-object v5, v0, Lc2/e;->h:Lc2/d;

    .line 199
    .line 200
    invoke-virtual {v4, v5}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 201
    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_7
    move-object v4, v0

    .line 205
    check-cast v4, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;

    .line 206
    .line 207
    invoke-virtual {v4, v1, v9}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->G(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;)V

    .line 208
    .line 209
    .line 210
    iget-boolean v4, v9, Lcom/google/android/material/appbar/AppBarLayout;->q:Z

    .line 211
    .line 212
    if-eqz v4, :cond_8

    .line 213
    .line 214
    invoke-static {v1}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->D(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Landroid/view/View;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {v9, v1}, Lcom/google/android/material/appbar/AppBarLayout;->g(Landroid/view/View;)Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    invoke-virtual {v9, v1}, Lcom/google/android/material/appbar/AppBarLayout;->f(Z)Z

    .line 223
    .line 224
    .line 225
    :cond_8
    :goto_2
    move v1, v8

    .line 226
    goto :goto_3

    .line 227
    :cond_9
    move v1, v7

    .line 228
    :goto_3
    iput-boolean v7, v0, Lc2/e;->j:Z

    .line 229
    .line 230
    iput v3, v0, Lc2/e;->k:I

    .line 231
    .line 232
    iget-object v3, v0, Lc2/e;->n:Landroid/view/VelocityTracker;

    .line 233
    .line 234
    if-eqz v3, :cond_a

    .line 235
    .line 236
    invoke-virtual {v3}, Landroid/view/VelocityTracker;->recycle()V

    .line 237
    .line 238
    .line 239
    iput-object v2, v0, Lc2/e;->n:Landroid/view/VelocityTracker;

    .line 240
    .line 241
    :cond_a
    :goto_4
    iget-object v2, v0, Lc2/e;->n:Landroid/view/VelocityTracker;

    .line 242
    .line 243
    if-eqz v2, :cond_b

    .line 244
    .line 245
    invoke-virtual {v2, v6}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 246
    .line 247
    .line 248
    :cond_b
    iget-boolean v2, v0, Lc2/e;->j:Z

    .line 249
    .line 250
    if-nez v2, :cond_d

    .line 251
    .line 252
    if-eqz v1, :cond_c

    .line 253
    .line 254
    goto :goto_6

    .line 255
    :cond_c
    :goto_5
    return v7

    .line 256
    :cond_d
    :goto_6
    return v8
.end method

.method public abstract y()I
.end method

.method public abstract z(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;III)I
.end method
