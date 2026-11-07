.class public final Lb3/f;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Lb3/f;->a:I

    iput-object p2, p0, Lb3/f;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public constructor <init>(Lp0/s0;Landroid/view/View;)V
    .locals 0

    .line 1
    const/4 p2, 0x4

    .line 2
    iput p2, p0, Lb3/f;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Lb3/f;->b:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, Lb3/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lb3/f;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lcom/google/android/material/focus/FocusRingDrawable;

    .line 16
    .line 17
    const/high16 v0, 0x3f800000    # 1.0f

    .line 18
    .line 19
    iput v0, p1, Lcom/google/android/material/focus/FocusRingDrawable;->p:F

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_2
    iget-object p1, p0, Lb3/f;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lp0/s0;

    .line 28
    .line 29
    invoke-interface {p1}, Lp0/s0;->b()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_3
    iget-object p1, p0, Lb3/f;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    iput-object v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->B:Landroid/view/ViewPropertyAnimator;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    iput-boolean v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->o:Z

    .line 42
    .line 43
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 5

    .line 1
    iget v0, p0, Lb3/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_1
    iget-object p1, p0, Lb3/f;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lco/median/android/MainActivity;

    .line 13
    .line 14
    iget-object v0, p1, Lco/median/android/MainActivity;->x0:La3/h0;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, v0, La3/h0;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Landroidx/emoji2/text/p;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/emoji2/text/p;->w()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p1, Lco/median/android/MainActivity;->x0:La3/h0;

    .line 27
    .line 28
    :cond_0
    invoke-static {p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v0, v0, Lx1/a;->v0:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v2, p1, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 35
    .line 36
    const-string v3, "insetsController"

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    invoke-static {v0}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iput-object v0, v2, Lu1/r1;->l:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v4, v2, Lu1/r1;->e:La3/h0;

    .line 52
    .line 53
    if-eqz v4, :cond_2

    .line 54
    .line 55
    invoke-virtual {v2, v0}, Lu1/r1;->b(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget-object v2, v4, La3/h0;->g:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Le4/a;

    .line 62
    .line 63
    invoke-virtual {v2, v0}, Le4/a;->c0(Z)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-static {v3}, Lr3/g;->c(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v1

    .line 71
    :cond_3
    :goto_0
    invoke-static {p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v0, v0, Lx1/a;->w0:Ljava/lang/String;

    .line 76
    .line 77
    iget-object p1, p1, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 78
    .line 79
    if-eqz p1, :cond_6

    .line 80
    .line 81
    if-eqz v0, :cond_6

    .line 82
    .line 83
    invoke-static {v0}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    iput-object v0, p1, Lu1/r1;->m:Ljava/lang/String;

    .line 91
    .line 92
    iget-object v2, p1, Lu1/r1;->e:La3/h0;

    .line 93
    .line 94
    if-eqz v2, :cond_5

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Lu1/r1;->b(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    iget-object v0, v2, La3/h0;->g:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Le4/a;

    .line 103
    .line 104
    invoke-virtual {v0, p1}, Le4/a;->b0(Z)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_5
    invoke-static {v3}, Lr3/g;->c(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v1

    .line 112
    :cond_6
    :goto_1
    return-void

    .line 113
    :pswitch_2
    iget-object p1, p0, Lb3/f;->b:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p1, Lt2/f;

    .line 116
    .line 117
    iget-object v0, p1, Lt2/a;->b:Landroid/view/View;

    .line 118
    .line 119
    const/4 v1, 0x0

    .line 120
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v1}, Lt2/f;->b(F)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_3
    new-instance p1, Ljava/util/ArrayList;

    .line 128
    .line 129
    iget-object v0, p0, Lb3/f;->b:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Lq1/e;

    .line 132
    .line 133
    iget-object v1, v0, Lq1/e;->j:Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    const/4 v2, 0x0

    .line 143
    :goto_2
    if-ge v2, v1, :cond_7

    .line 144
    .line 145
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    check-cast v3, Lv2/d;

    .line 150
    .line 151
    invoke-virtual {v3, v0}, Lv2/d;->a(Landroid/graphics/drawable/Drawable;)V

    .line 152
    .line 153
    .line 154
    add-int/lit8 v2, v2, 0x1

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_7
    return-void

    .line 158
    :pswitch_4
    iget-object v0, p0, Lb3/f;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Lp1/r;

    .line 161
    .line 162
    invoke-virtual {v0}, Lp1/r;->n()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :pswitch_5
    iget-object p1, p0, Lb3/f;->b:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast p1, Lp0/s0;

    .line 172
    .line 173
    invoke-interface {p1}, Lp0/s0;->a()V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :pswitch_6
    iget-object p1, p0, Lb3/f;->b:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 180
    .line 181
    const/4 v0, 0x0

    .line 182
    iput-object v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->B:Landroid/view/ViewPropertyAnimator;

    .line 183
    .line 184
    const/4 v0, 0x0

    .line 185
    iput-boolean v0, p1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->o:Z

    .line 186
    .line 187
    return-void

    .line 188
    :pswitch_7
    iget-object p1, p0, Lb3/f;->b:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 191
    .line 192
    const/4 v0, 0x5

    .line 193
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K(I)V

    .line 194
    .line 195
    .line 196
    iget-object v0, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d0:Ljava/lang/ref/WeakReference;

    .line 197
    .line 198
    if-eqz v0, :cond_8

    .line 199
    .line 200
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    if-eqz v0, :cond_8

    .line 205
    .line 206
    iget-object p1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d0:Ljava/lang/ref/WeakReference;

    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    check-cast p1, Landroid/view/View;

    .line 213
    .line 214
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 215
    .line 216
    .line 217
    :cond_8
    return-void

    .line 218
    :pswitch_8
    iget-object p1, p0, Lb3/f;->b:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast p1, Ld3/m;

    .line 221
    .line 222
    invoke-virtual {p1}, Ld3/t;->p()V

    .line 223
    .line 224
    .line 225
    iget-object p1, p1, Ld3/m;->r:Landroid/animation/ValueAnimator;

    .line 226
    .line 227
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :pswitch_9
    iget-object p1, p0, Lb3/f;->b:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 234
    .line 235
    const/4 v0, 0x5

    .line 236
    invoke-virtual {p1, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->x(I)V

    .line 237
    .line 238
    .line 239
    iget-object v0, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->u:Ljava/lang/ref/WeakReference;

    .line 240
    .line 241
    if-eqz v0, :cond_9

    .line 242
    .line 243
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    if-eqz v0, :cond_9

    .line 248
    .line 249
    iget-object p1, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->u:Ljava/lang/ref/WeakReference;

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    check-cast p1, Landroid/view/View;

    .line 256
    .line 257
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 258
    .line 259
    .line 260
    :cond_9
    return-void

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    iget v0, p0, Lb3/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_1
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v0, p0, Lb3/f;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lq1/e;

    .line 15
    .line 16
    iget-object v1, v0, Lq1/e;->j:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-ge v2, v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lv2/d;

    .line 33
    .line 34
    invoke-virtual {v3, v0}, Lv2/d;->b(Landroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void

    .line 41
    :pswitch_2
    iget-object p1, p0, Lb3/f;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lp0/s0;

    .line 44
    .line 45
    invoke-interface {p1}, Lp0/s0;->c()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
