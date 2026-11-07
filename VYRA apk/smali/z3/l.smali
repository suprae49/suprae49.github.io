.class public abstract Lz3/l;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final a:Landroidx/emoji2/text/r;

.field public static final b:Landroidx/emoji2/text/r;

.field public static final c:Landroidx/emoji2/text/r;

.field public static final d:Landroidx/emoji2/text/r;

.field public static final e:Landroidx/emoji2/text/r;

.field public static final f:Landroidx/emoji2/text/r;

.field public static final g:Lz3/s;

.field public static final h:Lz3/s;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroidx/emoji2/text/r;

    .line 2
    .line 3
    const-string v1, "CLOSED_EMPTY"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lz3/l;->a:Landroidx/emoji2/text/r;

    .line 10
    .line 11
    new-instance v0, Landroidx/emoji2/text/r;

    .line 12
    .line 13
    const-string v1, "COMPLETING_ALREADY"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lz3/l;->b:Landroidx/emoji2/text/r;

    .line 19
    .line 20
    new-instance v0, Landroidx/emoji2/text/r;

    .line 21
    .line 22
    const-string v1, "COMPLETING_WAITING_CHILDREN"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lz3/l;->c:Landroidx/emoji2/text/r;

    .line 28
    .line 29
    new-instance v0, Landroidx/emoji2/text/r;

    .line 30
    .line 31
    const-string v1, "COMPLETING_RETRY"

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lz3/l;->d:Landroidx/emoji2/text/r;

    .line 37
    .line 38
    new-instance v0, Landroidx/emoji2/text/r;

    .line 39
    .line 40
    const-string v1, "TOO_LATE_TO_CANCEL"

    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lz3/l;->e:Landroidx/emoji2/text/r;

    .line 46
    .line 47
    new-instance v0, Landroidx/emoji2/text/r;

    .line 48
    .line 49
    const-string v1, "SEALED"

    .line 50
    .line 51
    invoke-direct {v0, v1, v2}, Landroidx/emoji2/text/r;-><init>(Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lz3/l;->f:Landroidx/emoji2/text/r;

    .line 55
    .line 56
    new-instance v0, Lz3/s;

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-direct {v0, v1}, Lz3/s;-><init>(Z)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lz3/l;->g:Lz3/s;

    .line 63
    .line 64
    new-instance v0, Lz3/s;

    .line 65
    .line 66
    const/4 v1, 0x1

    .line 67
    invoke-direct {v0, v1}, Lz3/s;-><init>(Z)V

    .line 68
    .line 69
    .line 70
    sput-object v0, Lz3/l;->h:Lz3/s;

    .line 71
    .line 72
    return-void
.end method

.method public static final a(Li3/g;Li3/g;Z)Li3/g;
    .locals 3

    .line 1
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    new-instance v0, Lb4/q;

    .line 4
    .line 5
    const/4 v1, 0x7

    .line 6
    invoke-direct {v0, v1}, Lb4/q;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, p2, v0}, Li3/g;->g(Ljava/lang/Object;Lq3/p;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    new-instance v1, Lb4/q;

    .line 20
    .line 21
    const/4 v2, 0x7

    .line 22
    invoke-direct {v1, v2}, Lb4/q;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, p2, v1}, Li3/g;->g(Ljava/lang/Object;Lq3/p;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    if-nez p2, :cond_0

    .line 38
    .line 39
    invoke-interface {p0, p1}, Li3/g;->b(Li3/g;)Li3/g;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_0
    new-instance v0, Lb4/q;

    .line 45
    .line 46
    const/4 v1, 0x5

    .line 47
    invoke-direct {v0, v1}, Lb4/q;-><init>(I)V

    .line 48
    .line 49
    .line 50
    sget-object v1, Li3/h;->f:Li3/h;

    .line 51
    .line 52
    invoke-interface {p0, v1, v0}, Li3/g;->g(Ljava/lang/Object;Lq3/p;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Li3/g;

    .line 57
    .line 58
    if-eqz p2, :cond_1

    .line 59
    .line 60
    check-cast p1, Li3/g;

    .line 61
    .line 62
    new-instance p2, Lb4/q;

    .line 63
    .line 64
    const/4 v0, 0x6

    .line 65
    invoke-direct {p2, v0}, Lb4/q;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p1, v1, p2}, Li3/g;->g(Ljava/lang/Object;Lq3/p;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :cond_1
    check-cast p1, Li3/g;

    .line 73
    .line 74
    invoke-interface {p0, p1}, Li3/g;->b(Li3/g;)Li3/g;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public static final b(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final c(Li3/g;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lz3/i;->f:Lz3/i;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Li3/g;->a(Li3/f;)Li3/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La4/b;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, La4/b;->c(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {p0, p1}, Lb4/d;->b(Li3/g;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :goto_0
    if-ne p1, v0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 25
    .line 26
    const-string v2, "Exception while trying to handle coroutine exception"

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, p1}, Le4/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object p1, v1

    .line 35
    :goto_1
    invoke-static {p0, p1}, Lb4/d;->b(Li3/g;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static final d(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Lz3/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lz3/e;

    .line 6
    .line 7
    iget-object p0, p0, Lz3/e;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    new-instance v0, Lg3/c;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lg3/c;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    return-object p0
.end method

.method public static final e(Lk3/e;)Ljava/lang/String;
    .locals 3

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lz3/l;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    new-instance v2, Lg3/c;

    .line 28
    .line 29
    invoke-direct {v2, v1}, Lg3/c;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object v1, v2

    .line 33
    :goto_0
    nop

    .line 34
    instance-of v2, v1, Lg3/c;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    move-object v2, v1

    .line 39
    check-cast v2, Lg3/c;

    .line 40
    .line 41
    iget-object v2, v2, Lg3/c;->f:Ljava/lang/Throwable;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    const/4 v2, 0x0

    .line 45
    :goto_1
    if-nez v2, :cond_1

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-static {p0}, Lz3/l;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    :goto_2
    check-cast v1, Ljava/lang/String;

    .line 79
    .line 80
    return-object v1
.end method

.method public static final f(Lk3/e;Li3/g;Ljava/lang/Object;)Lz3/k0;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    sget-object v1, Lz3/l0;->f:Lz3/l0;

    .line 6
    .line 7
    invoke-interface {p1, v1}, Li3/g;->a(Li3/f;)Li3/e;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_4

    .line 12
    .line 13
    :cond_1
    instance-of v1, p0, Lz3/p;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    invoke-interface {p0}, Lk3/b;->c()Lk3/b;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-nez p0, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    instance-of v1, p0, Lz3/k0;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    move-object v0, p0

    .line 30
    check-cast v0, Lz3/k0;

    .line 31
    .line 32
    :goto_0
    if-eqz v0, :cond_4

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2}, Lz3/k0;->I(Li3/g;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_4
    :goto_1
    return-object v0
.end method

.method public static final g(La4/c;Lq3/p;Lu1/f1;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p2, Lk3/e;->g:Li3/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 7
    .line 8
    new-instance v2, Lb4/q;

    .line 9
    .line 10
    const/4 v3, 0x7

    .line 11
    invoke-direct {v2, v3}, Lb4/q;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1, v2}, Li3/a;->g(Ljava/lang/Object;Lq3/p;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v0, p0}, Li3/g;->b(Li3/g;)Li3/g;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v0, p0, v2}, Lz3/l;->a(Li3/g;Li3/g;Z)Li3/g;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    :goto_0
    sget-object v1, Lz3/i;->g:Lz3/i;

    .line 37
    .line 38
    invoke-interface {p0, v1}, Li3/g;->a(Li3/f;)Li3/e;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Lz3/e0;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1}, Lz3/e0;->v()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-virtual {v1}, Lz3/e0;->p()Ljava/util/concurrent/CancellationException;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    throw p0

    .line 58
    :cond_2
    :goto_1
    if-ne p0, v0, :cond_3

    .line 59
    .line 60
    new-instance v0, Lb4/o;

    .line 61
    .line 62
    invoke-direct {v0, p0, p2}, Lb4/o;-><init>(Li3/g;Lk3/e;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v0, p1}, Le4/a;->i0(Lb4/o;Lb4/o;Lq3/p;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    goto/16 :goto_3

    .line 70
    .line 71
    :cond_3
    sget-object v1, Li3/d;->f:Li3/d;

    .line 72
    .line 73
    invoke-interface {p0, v1}, Li3/g;->a(Li3/f;)Li3/e;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-interface {v0, v1}, Li3/g;->a(Li3/f;)Li3/e;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v3, v0}, Lr3/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    const/4 v1, 0x0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    new-instance v0, Lz3/k0;

    .line 89
    .line 90
    invoke-direct {v0, p0, p2}, Lz3/k0;-><init>(Li3/g;Lu1/f1;)V

    .line 91
    .line 92
    .line 93
    iget-object p0, v0, Lz3/a;->h:Li3/g;

    .line 94
    .line 95
    invoke-static {p0, v1}, Lb4/d;->g(Li3/g;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    :try_start_0
    invoke-static {v0, v0, p1}, Le4/a;->i0(Lb4/o;Lb4/o;Lq3/p;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    invoke-static {p0, p2}, Lb4/d;->c(Li3/g;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move-object p0, p1

    .line 107
    goto :goto_3

    .line 108
    :catchall_0
    move-exception p1

    .line 109
    invoke-static {p0, p2}, Lb4/d;->c(Li3/g;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    throw p1

    .line 113
    :cond_4
    new-instance v0, Lz3/p;

    .line 114
    .line 115
    invoke-direct {v0, p0, p2}, Lb4/o;-><init>(Li3/g;Lk3/e;)V

    .line 116
    .line 117
    .line 118
    :try_start_1
    check-cast p1, Lk3/e;

    .line 119
    .line 120
    invoke-virtual {p1, v0, v0}, Lk3/e;->h(Li3/c;Ljava/lang/Object;)Li3/c;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {p0}, Le4/a;->N(Li3/c;)Li3/c;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    sget-object p1, Lg3/g;->a:Lg3/g;

    .line 129
    .line 130
    invoke-static {p0, p1}, Lb4/d;->d(Li3/c;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 131
    .line 132
    .line 133
    sget-object p0, Lz3/p;->j:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 134
    .line 135
    :cond_5
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_b

    .line 140
    .line 141
    const/4 p0, 0x2

    .line 142
    if-ne p1, p0, :cond_a

    .line 143
    .line 144
    sget-object p0, Lz3/e0;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 145
    .line 146
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    instance-of p1, p0, Lz3/y;

    .line 151
    .line 152
    if-eqz p1, :cond_6

    .line 153
    .line 154
    move-object v1, p0

    .line 155
    check-cast v1, Lz3/y;

    .line 156
    .line 157
    :cond_6
    if-eqz v1, :cond_8

    .line 158
    .line 159
    iget-object p1, v1, Lz3/y;->a:Lz3/x;

    .line 160
    .line 161
    if-nez p1, :cond_7

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_7
    move-object p0, p1

    .line 165
    :cond_8
    :goto_2
    nop

    .line 166
    instance-of p1, p0, Lz3/e;

    .line 167
    .line 168
    if-nez p1, :cond_9

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_9
    check-cast p0, Lz3/e;

    .line 172
    .line 173
    iget-object p0, p0, Lz3/e;->a:Ljava/lang/Throwable;

    .line 174
    .line 175
    throw p0

    .line 176
    :cond_a
    const-string p0, "Already suspended"

    .line 177
    .line 178
    invoke-static {p0}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    const/4 p0, 0x0

    .line 182
    return-object p0

    .line 183
    :cond_b
    const/4 p1, 0x1

    .line 184
    invoke-virtual {p0, v0, v2, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-eqz p1, :cond_5

    .line 189
    .line 190
    sget-object p0, Lj3/a;->f:Lj3/a;

    .line 191
    .line 192
    :goto_3
    return-object p0

    .line 193
    :catchall_1
    move-exception p0

    .line 194
    new-instance p1, Lg3/c;

    .line 195
    .line 196
    invoke-direct {p1, p0}, Lg3/c;-><init>(Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, p1}, Lz3/a;->e(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    throw p0
.end method
