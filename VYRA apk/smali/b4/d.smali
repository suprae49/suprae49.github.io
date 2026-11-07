.class public abstract Lb4/d;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final a:Landroidx/emoji2/text/r;

.field public static final b:Landroidx/emoji2/text/r;

.field public static final c:Landroidx/emoji2/text/r;

.field public static final d:Lb4/q;

.field public static final e:Lb4/q;

.field public static final f:Lb4/q;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroidx/emoji2/text/r;

    .line 2
    .line 3
    const-string v1, "UNDEFINED"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lb4/d;->a:Landroidx/emoji2/text/r;

    .line 10
    .line 11
    new-instance v0, Landroidx/emoji2/text/r;

    .line 12
    .line 13
    const-string v1, "REUSABLE_CLAIMED"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lb4/d;->b:Landroidx/emoji2/text/r;

    .line 19
    .line 20
    new-instance v0, Landroidx/emoji2/text/r;

    .line 21
    .line 22
    const-string v1, "NO_THREAD_ELEMENTS"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lb4/d;->c:Landroidx/emoji2/text/r;

    .line 28
    .line 29
    new-instance v0, Lb4/q;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {v0, v1}, Lb4/q;-><init>(I)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lb4/d;->d:Lb4/q;

    .line 36
    .line 37
    new-instance v0, Lb4/q;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-direct {v0, v1}, Lb4/q;-><init>(I)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lb4/d;->e:Lb4/q;

    .line 44
    .line 45
    new-instance v0, Lb4/q;

    .line 46
    .line 47
    const/4 v1, 0x2

    .line 48
    invoke-direct {v0, v1}, Lb4/q;-><init>(I)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lb4/d;->f:Lb4/q;

    .line 52
    .line 53
    return-void
.end method

.method public static final a(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p0, v0, :cond_0

    .line 3
    .line 4
    return-void

    .line 5
    :cond_0
    const-string v0, "Expected positive parallelism level, but got "

    .line 6
    .line 7
    invoke-static {p0, v0}, Landroidx/fragment/app/u;->k(ILjava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public static final b(Li3/g;Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    sget-object v0, Lb4/a;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, La4/b;

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {v1, p1}, La4/b;->c(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    if-ne p1, v1, :cond_0

    .line 25
    .line 26
    move-object v2, p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance v2, Ljava/lang/RuntimeException;

    .line 29
    .line 30
    const-string v3, "Exception while trying to handle coroutine exception"

    .line 31
    .line 32
    invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v2, p1}, Le4/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v3, v1, v2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :try_start_1
    new-instance v0, Lb4/b;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lb4/b;-><init>(Li3/g;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v0}, Le4/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    .line 57
    .line 58
    :catchall_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {v0, p0, p1}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public static final c(Li3/g;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget-object v0, Lb4/d;->c:Landroidx/emoji2/text/r;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    instance-of v0, p1, Lb4/s;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    check-cast p1, Lb4/s;

    .line 12
    .line 13
    iget-object p0, p1, Lb4/s;->b:[Lz3/f;

    .line 14
    .line 15
    array-length p1, p0

    .line 16
    add-int/lit8 p1, p1, -0x1

    .line 17
    .line 18
    if-gez p1, :cond_1

    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :cond_1
    aget-object p0, p0, p1

    .line 22
    .line 23
    throw v1

    .line 24
    :cond_2
    sget-object p1, Lb4/d;->e:Lb4/q;

    .line 25
    .line 26
    invoke-interface {p0, v1, p1}, Li3/g;->g(Ljava/lang/Object;Lq3/p;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Landroidx/fragment/app/q;->c()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static final d(Li3/c;Ljava/lang/Object;)V
    .locals 11

    .line 1
    instance-of v0, p0, Lb4/c;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    check-cast p0, Lb4/c;

    .line 6
    .line 7
    iget-object v0, p0, Lb4/c;->i:Lz3/h;

    .line 8
    .line 9
    iget-object v1, p0, Lb4/c;->j:Lk3/e;

    .line 10
    .line 11
    iget-object v2, v1, Lk3/e;->g:Li3/g;

    .line 12
    .line 13
    instance-of v3, p1, Lg3/c;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    move-object v3, p1

    .line 19
    check-cast v3, Lg3/c;

    .line 20
    .line 21
    iget-object v3, v3, Lg3/c;->f:Ljava/lang/Throwable;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v3, v4

    .line 25
    :goto_0
    if-nez v3, :cond_1

    .line 26
    .line 27
    move-object v5, p1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    new-instance v5, Lz3/e;

    .line 30
    .line 31
    invoke-direct {v5, v3}, Lz3/e;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v2}, Lz3/h;->d(Li3/g;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const/4 v6, 0x1

    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    iput-object v5, p0, Lb4/c;->k:Ljava/lang/Object;

    .line 45
    .line 46
    iput v6, p0, Lb4/c;->h:I

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2, p0}, Lz3/h;->c(Li3/g;Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    sget-object v0, Lz3/i0;->a:Ljava/lang/ThreadLocal;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Lz3/u;

    .line 62
    .line 63
    if-nez v3, :cond_3

    .line 64
    .line 65
    new-instance v3, Lz3/b;

    .line 66
    .line 67
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-direct {v3, v7}, Lz3/b;-><init>(Ljava/lang/Thread;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    iget-wide v7, v3, Lz3/u;->h:J

    .line 78
    .line 79
    const-wide v9, 0x100000000L

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    cmp-long v0, v7, v9

    .line 85
    .line 86
    if-ltz v0, :cond_5

    .line 87
    .line 88
    iput-object v5, p0, Lb4/c;->k:Ljava/lang/Object;

    .line 89
    .line 90
    iput v6, p0, Lb4/c;->h:I

    .line 91
    .line 92
    iget-object p1, v3, Lz3/u;->j:Lh3/c;

    .line 93
    .line 94
    if-nez p1, :cond_4

    .line 95
    .line 96
    new-instance p1, Lh3/c;

    .line 97
    .line 98
    invoke-direct {p1}, Lh3/c;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-object p1, v3, Lz3/u;->j:Lh3/c;

    .line 102
    .line 103
    :cond_4
    invoke-virtual {p1, p0}, Lh3/c;->addLast(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_5
    add-long/2addr v9, v7

    .line 108
    iput-wide v9, v3, Lz3/u;->h:J

    .line 109
    .line 110
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    sget-object v0, Lz3/i;->g:Lz3/i;

    .line 114
    .line 115
    invoke-interface {v2, v0}, Li3/g;->a(Li3/f;)Li3/e;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Lz3/e0;

    .line 120
    .line 121
    if-eqz v0, :cond_6

    .line 122
    .line 123
    invoke-virtual {v0}, Lz3/e0;->v()Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-nez v5, :cond_6

    .line 128
    .line 129
    invoke-virtual {v0}, Lz3/e0;->p()Ljava/util/concurrent/CancellationException;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    new-instance v0, Lg3/c;

    .line 134
    .line 135
    invoke-direct {v0, p1}, Lg3/c;-><init>(Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, v0}, Lb4/c;->e(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :catchall_0
    move-exception p1

    .line 143
    goto :goto_4

    .line 144
    :cond_6
    iget-object v0, p0, Lb4/c;->l:Ljava/lang/Object;

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-static {v2, v0}, Lb4/d;->g(Li3/g;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    sget-object v5, Lb4/d;->c:Landroidx/emoji2/text/r;

    .line 154
    .line 155
    if-eq v0, v5, :cond_7

    .line 156
    .line 157
    invoke-static {v1, v2, v0}, Lz3/l;->f(Lk3/e;Li3/g;Ljava/lang/Object;)Lz3/k0;

    .line 158
    .line 159
    .line 160
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    :cond_7
    :try_start_1
    invoke-virtual {v1, p1}, Lk3/e;->e(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 162
    .line 163
    .line 164
    if-eqz v4, :cond_8

    .line 165
    .line 166
    :try_start_2
    invoke-virtual {v4}, Lz3/k0;->H()Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-eqz p1, :cond_9

    .line 171
    .line 172
    :cond_8
    invoke-static {v2, v0}, Lb4/d;->c(Li3/g;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :cond_9
    :goto_2
    invoke-virtual {v3}, Lz3/u;->m()Z

    .line 176
    .line 177
    .line 178
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 179
    if-nez p1, :cond_9

    .line 180
    .line 181
    :goto_3
    invoke-virtual {v3}, Lz3/u;->h()V

    .line 182
    .line 183
    .line 184
    goto :goto_5

    .line 185
    :catchall_1
    move-exception p1

    .line 186
    if-eqz v4, :cond_a

    .line 187
    .line 188
    :try_start_3
    invoke-virtual {v4}, Lz3/k0;->H()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_b

    .line 193
    .line 194
    :cond_a
    invoke-static {v2, v0}, Lb4/d;->c(Li3/g;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :cond_b
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 198
    :goto_4
    :try_start_4
    invoke-virtual {p0, p1}, Lb4/c;->a(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 199
    .line 200
    .line 201
    goto :goto_3

    .line 202
    :goto_5
    return-void

    .line 203
    :catchall_2
    move-exception p0

    .line 204
    invoke-virtual {v3}, Lz3/u;->h()V

    .line 205
    .line 206
    .line 207
    throw p0

    .line 208
    :cond_c
    invoke-interface {p0, p1}, Li3/c;->e(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    return-void
.end method

.method public static final e(JJJLjava/lang/String;)J
    .locals 23

    .line 1
    move-wide/from16 v0, p2

    .line 2
    .line 3
    move-wide/from16 v2, p4

    .line 4
    .line 5
    move-object/from16 v4, p6

    .line 6
    .line 7
    sget v5, Lb4/p;->a:I

    .line 8
    .line 9
    :try_start_0
    invoke-static {v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    goto :goto_0

    .line 14
    :catch_0
    const/4 v6, 0x0

    .line 15
    :goto_0
    if-nez v6, :cond_0

    .line 16
    .line 17
    return-wide p0

    .line 18
    :cond_0
    const/16 v7, 0xa

    .line 19
    .line 20
    invoke-static {v7}, Lt2/i;->b(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    if-nez v8, :cond_2

    .line 28
    .line 29
    :cond_1
    :goto_1
    move-object/from16 v19, v6

    .line 30
    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_2
    const/4 v9, 0x0

    .line 34
    invoke-virtual {v6, v9}, Ljava/lang/String;->charAt(I)C

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    const/16 v11, 0x30

    .line 39
    .line 40
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    if-ge v10, v11, :cond_6

    .line 46
    .line 47
    const/4 v11, 0x1

    .line 48
    if-ne v8, v11, :cond_3

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    const/16 v14, 0x2b

    .line 52
    .line 53
    if-eq v10, v14, :cond_5

    .line 54
    .line 55
    const/16 v9, 0x2d

    .line 56
    .line 57
    if-eq v10, v9, :cond_4

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    const-wide/high16 v12, -0x8000000000000000L

    .line 61
    .line 62
    move v9, v11

    .line 63
    goto :goto_2

    .line 64
    :cond_5
    move/from16 v22, v11

    .line 65
    .line 66
    move v11, v9

    .line 67
    move/from16 v9, v22

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_6
    move v11, v9

    .line 71
    :goto_2
    const-wide/16 v16, 0x0

    .line 72
    .line 73
    move-wide/from16 v14, v16

    .line 74
    .line 75
    const-wide p0, -0x38e38e38e38e38eL    # -2.772000429909333E291

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    const-wide v16, -0x38e38e38e38e38eL    # -2.772000429909333E291

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    :goto_3
    if-ge v9, v8, :cond_b

    .line 86
    .line 87
    invoke-virtual {v6, v9}, Ljava/lang/String;->charAt(I)C

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    invoke-static {v10, v7}, Ljava/lang/Character;->digit(II)I

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    if-gez v10, :cond_7

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_7
    cmp-long v18, v14, v16

    .line 99
    .line 100
    if-gez v18, :cond_8

    .line 101
    .line 102
    cmp-long v16, v16, p0

    .line 103
    .line 104
    if-nez v16, :cond_1

    .line 105
    .line 106
    move-object/from16 v19, v6

    .line 107
    .line 108
    int-to-long v5, v7

    .line 109
    div-long v16, v12, v5

    .line 110
    .line 111
    cmp-long v5, v14, v16

    .line 112
    .line 113
    if-gez v5, :cond_9

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_8
    move-object/from16 v19, v6

    .line 117
    .line 118
    :cond_9
    int-to-long v5, v7

    .line 119
    mul-long/2addr v14, v5

    .line 120
    int-to-long v5, v10

    .line 121
    add-long v20, v12, v5

    .line 122
    .line 123
    cmp-long v10, v14, v20

    .line 124
    .line 125
    if-gez v10, :cond_a

    .line 126
    .line 127
    :goto_4
    const/4 v5, 0x0

    .line 128
    goto :goto_5

    .line 129
    :cond_a
    sub-long/2addr v14, v5

    .line 130
    add-int/lit8 v9, v9, 0x1

    .line 131
    .line 132
    move-object/from16 v6, v19

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_b
    move-object/from16 v19, v6

    .line 136
    .line 137
    if-eqz v11, :cond_c

    .line 138
    .line 139
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    goto :goto_5

    .line 144
    :cond_c
    neg-long v5, v14

    .line 145
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    :goto_5
    const/16 v6, 0x27

    .line 150
    .line 151
    const-string v7, "System property \'"

    .line 152
    .line 153
    if-eqz v5, :cond_e

    .line 154
    .line 155
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 156
    .line 157
    .line 158
    move-result-wide v8

    .line 159
    cmp-long v5, v0, v8

    .line 160
    .line 161
    if-gtz v5, :cond_d

    .line 162
    .line 163
    cmp-long v5, v8, v2

    .line 164
    .line 165
    if-gtz v5, :cond_d

    .line 166
    .line 167
    return-wide v8

    .line 168
    :cond_d
    new-instance v5, Ljava/lang/IllegalStateException;

    .line 169
    .line 170
    new-instance v10, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v10, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v4, "\' should be in range "

    .line 179
    .line 180
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v10, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string v0, ".."

    .line 187
    .line 188
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v10, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v0, ", but is \'"

    .line 195
    .line 196
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-direct {v5, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw v5

    .line 217
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 218
    .line 219
    new-instance v1, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    const-string v2, "\' has unrecognized value \'"

    .line 228
    .line 229
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    move-object/from16 v5, v19

    .line 233
    .line 234
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw v0
.end method

.method public static f(Ljava/lang/String;II)I
    .locals 7

    .line 1
    and-int/lit8 p2, p2, 0x8

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const p2, 0x7fffffff

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const p2, 0x1ffffe

    .line 10
    .line 11
    .line 12
    :goto_0
    int-to-long v0, p1

    .line 13
    const/4 p1, 0x1

    .line 14
    int-to-long v2, p1

    .line 15
    int-to-long v4, p2

    .line 16
    move-object v6, p0

    .line 17
    invoke-static/range {v0 .. v6}, Lb4/d;->e(JJJLjava/lang/String;)J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    long-to-int p0, p0

    .line 22
    return p0
.end method

.method public static final g(Li3/g;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    sget-object p1, Lb4/d;->d:Lb4/q;

    .line 9
    .line 10
    invoke-interface {p0, v0, p1}, Li3/g;->g(Ljava/lang/Object;Lq3/p;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    :cond_0
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    sget-object p0, Lb4/d;->c:Landroidx/emoji2/text/r;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    new-instance v0, Lb4/s;

    .line 27
    .line 28
    check-cast p1, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-direct {v0, p0, p1}, Lb4/s;-><init>(Li3/g;I)V

    .line 35
    .line 36
    .line 37
    sget-object p1, Lb4/d;->f:Lb4/q;

    .line 38
    .line 39
    invoke-interface {p0, v0, p1}, Li3/g;->g(Ljava/lang/Object;Lq3/p;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_2
    invoke-static {}, Landroidx/fragment/app/q;->c()V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0
.end method
