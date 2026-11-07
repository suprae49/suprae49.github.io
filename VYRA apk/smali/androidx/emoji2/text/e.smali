.class public final Landroidx/emoji2/text/e;
.super Lu1/h0;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic e:Landroidx/emoji2/text/f;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/emoji2/text/e;->e:Landroidx/emoji2/text/f;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final P(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/e;->e:Landroidx/emoji2/text/f;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/emoji2/text/f;->a:Landroidx/emoji2/text/k;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroidx/emoji2/text/k;->d(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final R(Landroidx/emoji2/text/x;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/e;->e:Landroidx/emoji2/text/f;

    .line 2
    .line 3
    iput-object p1, v0, Landroidx/emoji2/text/f;->c:Landroidx/emoji2/text/x;

    .line 4
    .line 5
    new-instance p1, Landroidx/emoji2/text/t;

    .line 6
    .line 7
    iget-object v1, v0, Landroidx/emoji2/text/f;->c:Landroidx/emoji2/text/x;

    .line 8
    .line 9
    iget-object v2, v0, Landroidx/emoji2/text/f;->a:Landroidx/emoji2/text/k;

    .line 10
    .line 11
    iget-object v3, v2, Landroidx/emoji2/text/k;->g:La3/f;

    .line 12
    .line 13
    iget-object v2, v2, Landroidx/emoji2/text/k;->i:Landroidx/emoji2/text/d;

    .line 14
    .line 15
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v5, 0x22

    .line 18
    .line 19
    if-lt v4, v5, :cond_0

    .line 20
    .line 21
    invoke-static {}, Landroidx/emoji2/text/o;->a()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {}, Le4/a;->z()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    :goto_0
    invoke-direct {p1, v1, v3, v2, v4}, Landroidx/emoji2/text/t;-><init>(Landroidx/emoji2/text/x;La3/f;Landroidx/emoji2/text/d;Ljava/util/Set;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, v0, Landroidx/emoji2/text/f;->b:Landroidx/emoji2/text/t;

    .line 34
    .line 35
    iget-object p1, v0, Landroidx/emoji2/text/f;->a:Landroidx/emoji2/text/k;

    .line 36
    .line 37
    new-instance v0, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v1, p1, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    :try_start_0
    iput v1, p1, Landroidx/emoji2/text/k;->c:I

    .line 53
    .line 54
    iget-object v1, p1, Landroidx/emoji2/text/k;->b:Lp/g;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 57
    .line 58
    .line 59
    iget-object v1, p1, Landroidx/emoji2/text/k;->b:Lp/g;

    .line 60
    .line 61
    invoke-virtual {v1}, Lp/g;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    iget-object v1, p1, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 71
    .line 72
    .line 73
    iget-object v1, p1, Landroidx/emoji2/text/k;->d:Landroid/os/Handler;

    .line 74
    .line 75
    new-instance v2, Landroidx/emoji2/text/i;

    .line 76
    .line 77
    iget p1, p1, Landroidx/emoji2/text/k;->c:I

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    invoke-direct {v2, v0, p1, v3}, Landroidx/emoji2/text/i;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    iget-object p1, p1, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 95
    .line 96
    .line 97
    throw v0
.end method
