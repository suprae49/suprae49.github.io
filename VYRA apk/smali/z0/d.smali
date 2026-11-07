.class public final Lz0/d;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final n:Lz0/c;

.field public static final o:Lz0/c;

.field public static final p:Lz0/c;

.field public static final q:Lz0/c;

.field public static final r:Lz0/c;

.field public static final s:Lz0/c;


# instance fields
.field public a:F

.field public b:F

.field public c:Z

.field public final d:Ljava/lang/Object;

.field public final e:Lt2/i;

.field public f:Z

.field public g:J

.field public h:F

.field public final i:Ljava/util/ArrayList;

.field public final j:Ljava/util/ArrayList;

.field public k:Lz0/e;

.field public l:F

.field public m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lz0/c;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lz0/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lz0/d;->n:Lz0/c;

    .line 8
    .line 9
    new-instance v0, Lz0/c;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1}, Lz0/c;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lz0/d;->o:Lz0/c;

    .line 16
    .line 17
    new-instance v0, Lz0/c;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, v1}, Lz0/c;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lz0/d;->p:Lz0/c;

    .line 24
    .line 25
    new-instance v0, Lz0/c;

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    invoke-direct {v0, v1}, Lz0/c;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lz0/d;->q:Lz0/c;

    .line 32
    .line 33
    new-instance v0, Lz0/c;

    .line 34
    .line 35
    const/4 v1, 0x5

    .line 36
    invoke-direct {v0, v1}, Lz0/c;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lz0/d;->r:Lz0/c;

    .line 40
    .line 41
    new-instance v0, Lz0/c;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-direct {v0, v1}, Lz0/c;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lz0/d;->s:Lz0/c;

    .line 48
    .line 49
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lt2/i;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lz0/d;->a:F

    .line 6
    .line 7
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 8
    .line 9
    .line 10
    iput v0, p0, Lz0/d;->b:F

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-boolean v1, p0, Lz0/d;->c:Z

    .line 14
    .line 15
    iput-boolean v1, p0, Lz0/d;->f:Z

    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    iput-wide v2, p0, Lz0/d;->g:J

    .line 20
    .line 21
    new-instance v2, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Lz0/d;->i:Ljava/util/ArrayList;

    .line 27
    .line 28
    new-instance v2, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v2, p0, Lz0/d;->j:Ljava/util/ArrayList;

    .line 34
    .line 35
    iput-object p1, p0, Lz0/d;->d:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object p2, p0, Lz0/d;->e:Lt2/i;

    .line 38
    .line 39
    sget-object p1, Lz0/d;->p:Lz0/c;

    .line 40
    .line 41
    if-eq p2, p1, :cond_4

    .line 42
    .line 43
    sget-object p1, Lz0/d;->q:Lz0/c;

    .line 44
    .line 45
    if-eq p2, p1, :cond_4

    .line 46
    .line 47
    sget-object p1, Lz0/d;->r:Lz0/c;

    .line 48
    .line 49
    if-ne p2, p1, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    sget-object p1, Lz0/d;->s:Lz0/c;

    .line 53
    .line 54
    if-ne p2, p1, :cond_1

    .line 55
    .line 56
    const/high16 p1, 0x3b800000    # 0.00390625f

    .line 57
    .line 58
    iput p1, p0, Lz0/d;->h:F

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_1
    sget-object p1, Lz0/d;->n:Lz0/c;

    .line 62
    .line 63
    if-eq p2, p1, :cond_3

    .line 64
    .line 65
    sget-object p1, Lz0/d;->o:Lz0/c;

    .line 66
    .line 67
    if-ne p2, p1, :cond_2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 71
    .line 72
    iput p1, p0, Lz0/d;->h:F

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    :goto_0
    const p1, 0x3b03126f    # 0.002f

    .line 76
    .line 77
    .line 78
    iput p1, p0, Lz0/d;->h:F

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    :goto_1
    const p1, 0x3dcccccd    # 0.1f

    .line 82
    .line 83
    .line 84
    iput p1, p0, Lz0/d;->h:F

    .line 85
    .line 86
    :goto_2
    const/4 p1, 0x0

    .line 87
    iput-object p1, p0, Lz0/d;->k:Lz0/e;

    .line 88
    .line 89
    iput v0, p0, Lz0/d;->l:F

    .line 90
    .line 91
    iput-boolean v1, p0, Lz0/d;->m:Z

    .line 92
    .line 93
    return-void
.end method

.method public static b()Lz0/b;
    .locals 4

    .line 1
    sget-object v0, Lz0/b;->i:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    new-instance v1, Lz0/b;

    .line 10
    .line 11
    new-instance v2, Landroidx/emoji2/text/p;

    .line 12
    .line 13
    const/16 v3, 0x14

    .line 14
    .line 15
    invoke-direct {v2, v3}, Landroidx/emoji2/text/p;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2}, Lz0/b;-><init>(Landroidx/emoji2/text/p;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lz0/b;

    .line 29
    .line 30
    return-object v0
.end method


# virtual methods
.method public final a(F)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lz0/d;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lz0/d;->l:F

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lz0/d;->k:Lz0/e;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v0, Lz0/e;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lz0/e;-><init>(F)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lz0/d;->k:Lz0/e;

    .line 18
    .line 19
    :cond_1
    iget-object v0, p0, Lz0/d;->k:Lz0/e;

    .line 20
    .line 21
    float-to-double v1, p1

    .line 22
    iput-wide v1, v0, Lz0/e;->i:D

    .line 23
    .line 24
    double-to-float p1, v1

    .line 25
    float-to-double v1, p1

    .line 26
    const p1, 0x7f7fffff    # Float.MAX_VALUE

    .line 27
    .line 28
    .line 29
    float-to-double v3, p1

    .line 30
    cmpl-double v3, v1, v3

    .line 31
    .line 32
    if-gtz v3, :cond_9

    .line 33
    .line 34
    const v3, -0x800001

    .line 35
    .line 36
    .line 37
    float-to-double v4, v3

    .line 38
    cmpg-double v1, v1, v4

    .line 39
    .line 40
    if-ltz v1, :cond_8

    .line 41
    .line 42
    iget v1, p0, Lz0/d;->h:F

    .line 43
    .line 44
    const/high16 v2, 0x3f400000    # 0.75f

    .line 45
    .line 46
    mul-float/2addr v1, v2

    .line 47
    float-to-double v1, v1

    .line 48
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    .line 49
    .line 50
    .line 51
    move-result-wide v1

    .line 52
    iput-wide v1, v0, Lz0/e;->d:D

    .line 53
    .line 54
    const-wide v4, 0x404f400000000000L    # 62.5

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    mul-double/2addr v1, v4

    .line 60
    iput-wide v1, v0, Lz0/e;->e:D

    .line 61
    .line 62
    invoke-static {}, Lz0/d;->b()Lz0/b;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v0, v0, Lz0/b;->e:Landroidx/emoji2/text/p;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-object v0, v0, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Landroid/os/Looper;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-ne v1, v0, :cond_7

    .line 84
    .line 85
    iget-boolean v0, p0, Lz0/d;->f:Z

    .line 86
    .line 87
    if-nez v0, :cond_6

    .line 88
    .line 89
    if-nez v0, :cond_6

    .line 90
    .line 91
    const/4 v0, 0x1

    .line 92
    iput-boolean v0, p0, Lz0/d;->f:Z

    .line 93
    .line 94
    iget-boolean v0, p0, Lz0/d;->c:Z

    .line 95
    .line 96
    if-nez v0, :cond_2

    .line 97
    .line 98
    iget-object v0, p0, Lz0/d;->e:Lt2/i;

    .line 99
    .line 100
    iget-object v1, p0, Lz0/d;->d:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Lt2/i;->p(Ljava/lang/Object;)F

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iput v0, p0, Lz0/d;->b:F

    .line 107
    .line 108
    :cond_2
    iget v0, p0, Lz0/d;->b:F

    .line 109
    .line 110
    cmpl-float p1, v0, p1

    .line 111
    .line 112
    if-gtz p1, :cond_5

    .line 113
    .line 114
    cmpg-float p1, v0, v3

    .line 115
    .line 116
    if-ltz p1, :cond_5

    .line 117
    .line 118
    invoke-static {}, Lz0/d;->b()Lz0/b;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iget-object v0, p1, Lz0/b;->b:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-nez v1, :cond_4

    .line 129
    .line 130
    iget-object v1, p1, Lz0/b;->e:Landroidx/emoji2/text/p;

    .line 131
    .line 132
    iget-object v2, p1, Lz0/b;->d:Landroidx/activity/k;

    .line 133
    .line 134
    iget-object v1, v1, Landroidx/emoji2/text/p;->g:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v1, Landroid/view/Choreographer;

    .line 137
    .line 138
    new-instance v3, Li1/f;

    .line 139
    .line 140
    invoke-direct {v3, v2}, Li1/f;-><init>(Ljava/lang/Runnable;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v3}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 144
    .line 145
    .line 146
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 147
    .line 148
    const/16 v2, 0x21

    .line 149
    .line 150
    if-lt v1, v2, :cond_4

    .line 151
    .line 152
    invoke-static {}, Landroidx/activity/r;->a()F

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    iput v1, p1, Lz0/b;->g:F

    .line 157
    .line 158
    iget-object v1, p1, Lz0/b;->h:Landroidx/emoji2/text/p;

    .line 159
    .line 160
    if-nez v1, :cond_3

    .line 161
    .line 162
    new-instance v1, Landroidx/emoji2/text/p;

    .line 163
    .line 164
    const/16 v2, 0x13

    .line 165
    .line 166
    invoke-direct {v1, v2, p1}, Landroidx/emoji2/text/p;-><init>(ILjava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    iput-object v1, p1, Lz0/b;->h:Landroidx/emoji2/text/p;

    .line 170
    .line 171
    :cond_3
    iget-object p1, p1, Lz0/b;->h:Landroidx/emoji2/text/p;

    .line 172
    .line 173
    iget-object v1, p1, Landroidx/emoji2/text/p;->g:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v1, Lz0/a;

    .line 176
    .line 177
    if-nez v1, :cond_4

    .line 178
    .line 179
    new-instance v1, Lz0/a;

    .line 180
    .line 181
    invoke-direct {v1, p1}, Lz0/a;-><init>(Landroidx/emoji2/text/p;)V

    .line 182
    .line 183
    .line 184
    iput-object v1, p1, Landroidx/emoji2/text/p;->g:Ljava/lang/Object;

    .line 185
    .line 186
    invoke-static {v1}, Landroidx/activity/r;->o(Lz0/a;)Z

    .line 187
    .line 188
    .line 189
    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    if-nez p1, :cond_6

    .line 194
    .line 195
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_5
    const-string p1, "Starting value need to be in between min value and max value"

    .line 200
    .line 201
    invoke-static {p1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    :cond_6
    return-void

    .line 205
    :cond_7
    new-instance p1, Landroid/util/AndroidRuntimeException;

    .line 206
    .line 207
    const-string v0, "Animations may only be started on the same thread as the animation handler"

    .line 208
    .line 209
    invoke-direct {p1, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw p1

    .line 213
    :cond_8
    const-string p1, "Final position of the spring cannot be less than the min value."

    .line 214
    .line 215
    invoke-static {p1}, Landroidx/fragment/app/q;->t(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_9
    const-string p1, "Final position of the spring cannot be greater than the max value."

    .line 220
    .line 221
    invoke-static {p1}, Landroidx/fragment/app/q;->t(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    return-void
.end method

.method public final c(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lz0/d;->e:Lt2/i;

    .line 2
    .line 3
    iget-object v1, p0, Lz0/d;->d:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lt2/i;->O(Ljava/lang/Object;F)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    :goto_0
    iget-object v0, p0, Lz0/d;->j:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ge p1, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    add-int/lit8 p1, p1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {p1, v0}, Landroidx/fragment/app/u;->i(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    add-int/lit8 p1, p1, -0x1

    .line 36
    .line 37
    :goto_1
    if-ltz p1, :cond_3

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    :cond_2
    add-int/lit8 p1, p1, -0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lz0/d;->k:Lz0/e;

    .line 2
    .line 3
    iget-wide v0, v0, Lz0/e;->b:D

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmpl-double v0, v0, v2

    .line 8
    .line 9
    if-lez v0, :cond_2

    .line 10
    .line 11
    invoke-static {}, Lz0/d;->b()Lz0/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, Lz0/b;->e:Landroidx/emoji2/text/p;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v0, v0, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Landroid/os/Looper;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-ne v1, v0, :cond_1

    .line 33
    .line 34
    iget-boolean v0, p0, Lz0/d;->f:Z

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    iput-boolean v0, p0, Lz0/d;->m:Z

    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :cond_1
    new-instance v0, Landroid/util/AndroidRuntimeException;

    .line 43
    .line 44
    const-string v1, "Animations may only be started on the same thread as the animation handler"

    .line 45
    .line 46
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_2
    const-string v0, "Spring animations can only come to an end when there is damping"

    .line 51
    .line 52
    invoke-static {v0}, Landroidx/fragment/app/q;->t(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method
