.class public final Lb4/c;
.super Ld4/h;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lk3/b;
.implements Li3/c;


# static fields
.field public static final synthetic m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _reusableCancellableContinuation$volatile:Ljava/lang/Object;

.field public h:I

.field public final i:Lz3/h;

.field public final j:Lk3/e;

.field public k:Ljava/lang/Object;

.field public final l:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "_reusableCancellableContinuation$volatile"

    .line 4
    .line 5
    const-class v2, Lb4/c;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lb4/c;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lz3/h;Lk3/e;)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-direct {p0, v0, v1, v2}, Ld4/h;-><init>(JZ)V

    .line 5
    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lb4/c;->h:I

    .line 9
    .line 10
    iput-object p1, p0, Lb4/c;->i:Lz3/h;

    .line 11
    .line 12
    iput-object p2, p0, Lb4/c;->j:Lk3/e;

    .line 13
    .line 14
    sget-object p1, Lb4/d;->a:Landroidx/emoji2/text/r;

    .line 15
    .line 16
    iput-object p1, p0, Lb4/c;->k:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p1, p2, Lk3/e;->g:Li3/g;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    sget-object v0, Lb4/d;->d:Lb4/q;

    .line 28
    .line 29
    invoke-interface {p1, p2, v0}, Li3/g;->g(Ljava/lang/Object;Lq3/p;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lb4/c;->l:Ljava/lang/Object;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    new-instance v0, Lz3/k;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Fatal exception in coroutines machinery for "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v2, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lb4/c;->j:Lk3/e;

    .line 26
    .line 27
    iget-object p1, p1, Lk3/e;->g:Li3/g;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v0}, Lz3/l;->c(Li3/g;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final c()Lk3/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lb4/c;->j:Lk3/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Li3/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lb4/c;->j:Lk3/e;

    .line 2
    .line 3
    iget-object v0, v0, Lk3/e;->g:Li3/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 10

    .line 1
    instance-of v0, p1, Lg3/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lg3/c;

    .line 7
    .line 8
    iget-object v0, v0, Lg3/c;->f:Ljava/lang/Throwable;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    if-nez v0, :cond_1

    .line 13
    .line 14
    move-object v1, p1

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    new-instance v1, Lz3/e;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Lz3/e;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    :goto_1
    iget-object v0, p0, Lb4/c;->j:Lk3/e;

    .line 22
    .line 23
    iget-object v2, v0, Lk3/e;->g:Li3/g;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, Lb4/c;->i:Lz3/h;

    .line 29
    .line 30
    invoke-virtual {v3, v2}, Lz3/h;->d(Li3/g;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const/4 v5, 0x0

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    iput-object v1, p0, Lb4/c;->k:Ljava/lang/Object;

    .line 38
    .line 39
    iput v5, p0, Lb4/c;->h:I

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v2, p0}, Lz3/h;->c(Li3/g;Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    sget-object v3, Lz3/i0;->a:Ljava/lang/ThreadLocal;

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Lz3/u;

    .line 55
    .line 56
    if-nez v4, :cond_3

    .line 57
    .line 58
    new-instance v4, Lz3/b;

    .line 59
    .line 60
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-direct {v4, v6}, Lz3/b;-><init>(Ljava/lang/Thread;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    iget-wide v6, v4, Lz3/u;->h:J

    .line 71
    .line 72
    const-wide v8, 0x100000000L

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    cmp-long v3, v6, v8

    .line 78
    .line 79
    if-ltz v3, :cond_5

    .line 80
    .line 81
    iput-object v1, p0, Lb4/c;->k:Ljava/lang/Object;

    .line 82
    .line 83
    iput v5, p0, Lb4/c;->h:I

    .line 84
    .line 85
    iget-object p1, v4, Lz3/u;->j:Lh3/c;

    .line 86
    .line 87
    if-nez p1, :cond_4

    .line 88
    .line 89
    new-instance p1, Lh3/c;

    .line 90
    .line 91
    invoke-direct {p1}, Lh3/c;-><init>()V

    .line 92
    .line 93
    .line 94
    iput-object p1, v4, Lz3/u;->j:Lh3/c;

    .line 95
    .line 96
    :cond_4
    invoke-virtual {p1, p0}, Lh3/c;->addLast(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_5
    add-long/2addr v8, v6

    .line 101
    iput-wide v8, v4, Lz3/u;->h:J

    .line 102
    .line 103
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v1, p0, Lb4/c;->l:Ljava/lang/Object;

    .line 107
    .line 108
    invoke-static {v2, v1}, Lb4/d;->g(Li3/g;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    :try_start_1
    invoke-virtual {v0, p1}, Lk3/e;->e(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 113
    .line 114
    .line 115
    :try_start_2
    invoke-static {v2, v1}, Lb4/d;->c(Li3/g;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_6
    invoke-virtual {v4}, Lz3/u;->m()Z

    .line 119
    .line 120
    .line 121
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 122
    if-nez p1, :cond_6

    .line 123
    .line 124
    :goto_2
    invoke-virtual {v4}, Lz3/u;->h()V

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :catchall_0
    move-exception p1

    .line 129
    goto :goto_3

    .line 130
    :catchall_1
    move-exception p1

    .line 131
    :try_start_3
    invoke-static {v2, v1}, Lb4/d;->c(Li3/g;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 135
    :goto_3
    :try_start_4
    invoke-virtual {p0, p1}, Lb4/c;->a(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :goto_4
    return-void

    .line 140
    :catchall_2
    move-exception p1

    .line 141
    invoke-virtual {v4}, Lz3/u;->h()V

    .line 142
    .line 143
    .line 144
    throw p1
.end method

.method public final run()V
    .locals 9

    .line 1
    :try_start_0
    iget-object v0, p0, Lb4/c;->j:Lk3/e;

    .line 2
    .line 3
    iget-object v1, v0, Lk3/e;->g:Li3/g;

    .line 4
    .line 5
    iget-object v2, p0, Lb4/c;->l:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Lb4/d;->g(Li3/g;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    sget-object v3, Lb4/d;->c:Landroidx/emoji2/text/r;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    if-eq v2, v3, :cond_0

    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Lz3/l;->f(Lk3/e;Li3/g;Ljava/lang/Object;)Lz3/k0;

    .line 20
    .line 21
    .line 22
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto/16 :goto_7

    .line 26
    .line 27
    :cond_0
    move-object v3, v4

    .line 28
    :goto_0
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v5, p0, Lb4/c;->k:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v6, Lb4/d;->a:Landroidx/emoji2/text/r;

    .line 34
    .line 35
    iput-object v6, p0, Lb4/c;->k:Ljava/lang/Object;

    .line 36
    .line 37
    instance-of v6, v5, Lz3/e;

    .line 38
    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    move-object v6, v5

    .line 42
    check-cast v6, Lz3/e;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move-object v6, v4

    .line 46
    :goto_1
    if-eqz v6, :cond_2

    .line 47
    .line 48
    iget-object v6, v6, Lz3/e;->a:Ljava/lang/Throwable;

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    move-object v6, v4

    .line 52
    :goto_2
    if-nez v6, :cond_4

    .line 53
    .line 54
    iget v7, p0, Lb4/c;->h:I

    .line 55
    .line 56
    const/4 v8, 0x1

    .line 57
    if-eq v7, v8, :cond_3

    .line 58
    .line 59
    const/4 v8, 0x2

    .line 60
    if-ne v7, v8, :cond_4

    .line 61
    .line 62
    :cond_3
    sget-object v4, Lz3/i;->g:Lz3/i;

    .line 63
    .line 64
    invoke-interface {v1, v4}, Li3/g;->a(Li3/f;)Li3/e;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, Lz3/e0;

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :catchall_1
    move-exception v0

    .line 72
    goto :goto_6

    .line 73
    :cond_4
    :goto_3
    if-eqz v4, :cond_5

    .line 74
    .line 75
    invoke-virtual {v4}, Lz3/e0;->v()Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-nez v7, :cond_5

    .line 80
    .line 81
    invoke-virtual {v4}, Lz3/e0;->p()Ljava/util/concurrent/CancellationException;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    new-instance v5, Lg3/c;

    .line 86
    .line 87
    invoke-direct {v5, v4}, Lg3/c;-><init>(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v5}, Lk3/e;->e(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_5
    if-eqz v6, :cond_6

    .line 95
    .line 96
    new-instance v4, Lg3/c;

    .line 97
    .line 98
    invoke-direct {v4, v6}, Lg3/c;-><init>(Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v4}, Lk3/e;->e(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_6
    invoke-virtual {v0, v5}, Lk3/e;->e(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    .line 107
    .line 108
    :goto_4
    if-eqz v3, :cond_8

    .line 109
    .line 110
    :try_start_2
    invoke-virtual {v3}, Lz3/k0;->H()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_7

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_7
    return-void

    .line 118
    :cond_8
    :goto_5
    invoke-static {v1, v2}, Lb4/d;->c(Li3/g;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :goto_6
    if-eqz v3, :cond_9

    .line 123
    .line 124
    invoke-virtual {v3}, Lz3/k0;->H()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_a

    .line 129
    .line 130
    :cond_9
    invoke-static {v1, v2}, Lb4/d;->c(Li3/g;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_a
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 134
    :goto_7
    invoke-virtual {p0, v0}, Lb4/c;->a(Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "DispatchedContinuation["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lb4/c;->i:Lz3/h;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lb4/c;->j:Lk3/e;

    .line 19
    .line 20
    invoke-static {v1}, Lz3/l;->e(Lk3/e;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/16 v1, 0x5d

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method
