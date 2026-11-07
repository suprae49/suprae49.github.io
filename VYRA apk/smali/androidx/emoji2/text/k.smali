.class public final Landroidx/emoji2/text/k;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final j:Ljava/lang/Object;

.field public static volatile k:Landroidx/emoji2/text/k;


# instance fields
.field public final a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public final b:Lp/g;

.field public volatile c:I

.field public final d:Landroid/os/Handler;

.field public final e:Landroidx/emoji2/text/f;

.field public final f:Landroidx/emoji2/text/j;

.field public final g:La3/f;

.field public final h:I

.field public final i:Landroidx/emoji2/text/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/emoji2/text/k;->j:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroidx/emoji2/text/v;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    iput v1, p0, Landroidx/emoji2/text/k;->c:I

    .line 13
    .line 14
    iget-object v1, p1, Landroidx/emoji2/text/g;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Landroidx/emoji2/text/j;

    .line 17
    .line 18
    iput-object v1, p0, Landroidx/emoji2/text/k;->f:Landroidx/emoji2/text/j;

    .line 19
    .line 20
    iget v2, p1, Landroidx/emoji2/text/g;->a:I

    .line 21
    .line 22
    iput v2, p0, Landroidx/emoji2/text/k;->h:I

    .line 23
    .line 24
    iget-object p1, p1, Landroidx/emoji2/text/g;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Landroidx/emoji2/text/d;

    .line 27
    .line 28
    iput-object p1, p0, Landroidx/emoji2/text/k;->i:Landroidx/emoji2/text/d;

    .line 29
    .line 30
    new-instance p1, Landroid/os/Handler;

    .line 31
    .line 32
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-direct {p1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Landroidx/emoji2/text/k;->d:Landroid/os/Handler;

    .line 40
    .line 41
    new-instance p1, Lp/g;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-direct {p1, v3}, Lp/g;-><init>(I)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Landroidx/emoji2/text/k;->b:Lp/g;

    .line 48
    .line 49
    new-instance p1, La3/f;

    .line 50
    .line 51
    const/4 v4, 0x3

    .line 52
    invoke-direct {p1, v4}, La3/f;-><init>(I)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Landroidx/emoji2/text/k;->g:La3/f;

    .line 56
    .line 57
    new-instance p1, Landroidx/emoji2/text/f;

    .line 58
    .line 59
    invoke-direct {p1, p0}, Landroidx/emoji2/text/f;-><init>(Landroidx/emoji2/text/k;)V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Landroidx/emoji2/text/k;->e:Landroidx/emoji2/text/f;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 69
    .line 70
    .line 71
    if-nez v2, :cond_0

    .line 72
    .line 73
    :try_start_0
    iput v3, p0, Landroidx/emoji2/text/k;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :catchall_0
    move-exception p1

    .line 77
    iget-object v0, p0, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Landroidx/emoji2/text/k;->b()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_1

    .line 99
    .line 100
    :try_start_1
    new-instance v0, Landroidx/emoji2/text/e;

    .line 101
    .line 102
    invoke-direct {v0, p1}, Landroidx/emoji2/text/e;-><init>(Landroidx/emoji2/text/f;)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v1, v0}, Landroidx/emoji2/text/j;->u(Lu1/h0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :catchall_1
    move-exception p1

    .line 110
    invoke-virtual {p0, p1}, Landroidx/emoji2/text/k;->d(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    :cond_1
    return-void
.end method

.method public static a()Landroidx/emoji2/text/k;
    .locals 4

    .line 1
    sget-object v0, Landroidx/emoji2/text/k;->j:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Landroidx/emoji2/text/k;->k:Landroidx/emoji2/text/k;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v2, 0x0

    .line 11
    :goto_0
    const-string v3, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK\'s manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message."

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-object v1

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v1

    .line 25
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw v1
.end method


# virtual methods
.method public final b()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget v0, p0, Landroidx/emoji2/text/k;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    iget-object v1, p0, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 19
    .line 20
    .line 21
    return v0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    iget-object v1, p0, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/Lock;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public final c()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/emoji2/text/k;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v0, v2, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    if-eqz v0, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/emoji2/text/k;->b()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne v0, v2, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    iget-object v0, p0, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 26
    .line 27
    .line 28
    :try_start_0
    iget v0, p0, Landroidx/emoji2/text/k;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    :try_start_1
    iput v1, p0, Landroidx/emoji2/text/k;->c:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    .line 44
    iget-object v0, p0, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Landroidx/emoji2/text/k;->e:Landroidx/emoji2/text/f;

    .line 54
    .line 55
    iget-object v1, v0, Landroidx/emoji2/text/f;->a:Landroidx/emoji2/text/k;

    .line 56
    .line 57
    :try_start_2
    new-instance v2, Landroidx/emoji2/text/e;

    .line 58
    .line 59
    invoke-direct {v2, v0}, Landroidx/emoji2/text/e;-><init>(Landroidx/emoji2/text/f;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, v1, Landroidx/emoji2/text/k;->f:Landroidx/emoji2/text/j;

    .line 63
    .line 64
    invoke-interface {v0, v2}, Landroidx/emoji2/text/j;->u(Lu1/h0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    invoke-virtual {v1, v0}, Landroidx/emoji2/text/k;->d(Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :catchall_1
    move-exception v0

    .line 74
    iget-object v1, p0, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :cond_3
    const-string v0, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading"

    .line 85
    .line 86
    invoke-static {v0}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final d(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    :try_start_0
    iput v1, p0, Landroidx/emoji2/text/k;->c:I

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/emoji2/text/k;->b:Lp/g;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Landroidx/emoji2/text/k;->b:Lp/g;

    .line 24
    .line 25
    invoke-virtual {v1}, Lp/g;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Landroidx/emoji2/text/k;->d:Landroid/os/Handler;

    .line 38
    .line 39
    new-instance v2, Landroidx/emoji2/text/i;

    .line 40
    .line 41
    iget v3, p0, Landroidx/emoji2/text/k;->c:I

    .line 42
    .line 43
    invoke-direct {v2, v0, v3, p1}, Landroidx/emoji2/text/i;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    iget-object v0, p0, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 58
    .line 59
    .line 60
    throw p1
.end method

.method public final e(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/emoji2/text/k;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-eqz v0, :cond_15

    .line 13
    .line 14
    if-ltz p2, :cond_14

    .line 15
    .line 16
    if-ltz p3, :cond_13

    .line 17
    .line 18
    if-gt p2, p3, :cond_1

    .line 19
    .line 20
    move v0, v2

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, v1

    .line 23
    :goto_1
    const-string v3, "start should be <= than end"

    .line 24
    .line 25
    invoke-static {v3, v0}, Lu1/h0;->e(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-gt p2, v3, :cond_3

    .line 37
    .line 38
    move v3, v2

    .line 39
    goto :goto_2

    .line 40
    :cond_3
    move v3, v1

    .line 41
    :goto_2
    const-string v4, "start should be < than charSequence length"

    .line 42
    .line 43
    invoke-static {v4, v3}, Lu1/h0;->e(Ljava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-gt p3, v3, :cond_4

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    move v2, v1

    .line 54
    :goto_3
    const-string v3, "end should be < than charSequence length"

    .line 55
    .line 56
    invoke-static {v3, v2}, Lu1/h0;->e(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_5

    .line 64
    .line 65
    if-ne p2, p3, :cond_6

    .line 66
    .line 67
    :cond_5
    move-object v4, p1

    .line 68
    goto/16 :goto_c

    .line 69
    .line 70
    :cond_6
    iget-object v2, p0, Landroidx/emoji2/text/k;->e:Landroidx/emoji2/text/f;

    .line 71
    .line 72
    iget-object v3, v2, Landroidx/emoji2/text/f;->b:Landroidx/emoji2/text/t;

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    instance-of v2, p1, Landroidx/emoji2/text/z;

    .line 78
    .line 79
    if-eqz v2, :cond_7

    .line 80
    .line 81
    move-object v4, p1

    .line 82
    check-cast v4, Landroidx/emoji2/text/z;

    .line 83
    .line 84
    invoke-virtual {v4}, Landroidx/emoji2/text/z;->a()V

    .line 85
    .line 86
    .line 87
    :cond_7
    const-class v4, Landroidx/emoji2/text/b0;

    .line 88
    .line 89
    if-nez v2, :cond_9

    .line 90
    .line 91
    :try_start_0
    instance-of v5, p1, Landroid/text/Spannable;

    .line 92
    .line 93
    if-eqz v5, :cond_8

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_8
    instance-of v5, p1, Landroid/text/Spanned;

    .line 97
    .line 98
    if-eqz v5, :cond_a

    .line 99
    .line 100
    move-object v5, p1

    .line 101
    check-cast v5, Landroid/text/Spanned;

    .line 102
    .line 103
    add-int/lit8 v6, p2, -0x1

    .line 104
    .line 105
    add-int/lit8 v7, p3, 0x1

    .line 106
    .line 107
    invoke-interface {v5, v6, v7, v4}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-gt v5, p3, :cond_a

    .line 112
    .line 113
    new-instance v0, Landroidx/emoji2/text/d0;

    .line 114
    .line 115
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    iput-boolean v1, v0, Landroidx/emoji2/text/d0;->f:Z

    .line 119
    .line 120
    new-instance v5, Landroid/text/SpannableString;

    .line 121
    .line 122
    invoke-direct {v5, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 123
    .line 124
    .line 125
    iput-object v5, v0, Landroidx/emoji2/text/d0;->g:Landroid/text/Spannable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :goto_4
    move-object v4, p1

    .line 129
    goto/16 :goto_b

    .line 130
    .line 131
    :catchall_0
    move-exception v0

    .line 132
    move-object p2, v0

    .line 133
    goto :goto_4

    .line 134
    :cond_9
    :goto_5
    :try_start_1
    new-instance v0, Landroidx/emoji2/text/d0;

    .line 135
    .line 136
    move-object v5, p1

    .line 137
    check-cast v5, Landroid/text/Spannable;

    .line 138
    .line 139
    invoke-direct {v0, v5}, Landroidx/emoji2/text/d0;-><init>(Landroid/text/Spannable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 140
    .line 141
    .line 142
    :cond_a
    :goto_6
    if-eqz v0, :cond_c

    .line 143
    .line 144
    :try_start_2
    iget-object v5, v0, Landroidx/emoji2/text/d0;->g:Landroid/text/Spannable;

    .line 145
    .line 146
    invoke-interface {v5, p2, p3, v4}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    check-cast v4, [Landroidx/emoji2/text/b0;

    .line 151
    .line 152
    if-eqz v4, :cond_c

    .line 153
    .line 154
    array-length v5, v4

    .line 155
    if-lez v5, :cond_c

    .line 156
    .line 157
    array-length v5, v4

    .line 158
    :goto_7
    if-ge v1, v5, :cond_c

    .line 159
    .line 160
    aget-object v6, v4, v1

    .line 161
    .line 162
    iget-object v7, v0, Landroidx/emoji2/text/d0;->g:Landroid/text/Spannable;

    .line 163
    .line 164
    invoke-interface {v7, v6}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    iget-object v8, v0, Landroidx/emoji2/text/d0;->g:Landroid/text/Spannable;

    .line 169
    .line 170
    invoke-interface {v8, v6}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    if-eq v7, p3, :cond_b

    .line 175
    .line 176
    invoke-virtual {v0, v6}, Landroidx/emoji2/text/d0;->removeSpan(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_b
    invoke-static {v7, p2}, Ljava/lang/Math;->min(II)I

    .line 180
    .line 181
    .line 182
    move-result p2

    .line 183
    invoke-static {v8, p3}, Ljava/lang/Math;->max(II)I

    .line 184
    .line 185
    .line 186
    move-result p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 187
    add-int/lit8 v1, v1, 0x1

    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_c
    move v5, p2

    .line 191
    move v6, p3

    .line 192
    if-eq v5, v6, :cond_d

    .line 193
    .line 194
    :try_start_3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    if-lt v5, p2, :cond_e

    .line 199
    .line 200
    :cond_d
    move-object v4, p1

    .line 201
    goto :goto_a

    .line 202
    :cond_e
    new-instance v9, Landroidx/emoji2/text/p;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 203
    .line 204
    :try_start_4
    iget-object p2, v3, Landroidx/emoji2/text/t;->b:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast p2, La3/f;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 207
    .line 208
    const/4 p3, 0x0

    .line 209
    :try_start_5
    invoke-direct {v9, v0, p3, p2}, Landroidx/emoji2/text/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 210
    .line 211
    .line 212
    const/4 v8, 0x0

    .line 213
    const v7, 0x7fffffff

    .line 214
    .line 215
    .line 216
    move-object v4, p1

    .line 217
    :try_start_6
    invoke-virtual/range {v3 .. v9}, Landroidx/emoji2/text/t;->u(Ljava/lang/CharSequence;IIIZLandroidx/emoji2/text/q;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    check-cast p1, Landroidx/emoji2/text/d0;

    .line 222
    .line 223
    if-eqz p1, :cond_10

    .line 224
    .line 225
    iget-object p1, p1, Landroidx/emoji2/text/d0;->g:Landroid/text/Spannable;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 226
    .line 227
    if-eqz v2, :cond_f

    .line 228
    .line 229
    move-object p2, v4

    .line 230
    check-cast p2, Landroidx/emoji2/text/z;

    .line 231
    .line 232
    invoke-virtual {p2}, Landroidx/emoji2/text/z;->b()V

    .line 233
    .line 234
    .line 235
    :cond_f
    return-object p1

    .line 236
    :catchall_1
    move-exception v0

    .line 237
    :goto_8
    move-object p2, v0

    .line 238
    goto :goto_b

    .line 239
    :cond_10
    if-eqz v2, :cond_12

    .line 240
    .line 241
    :goto_9
    move-object p1, v4

    .line 242
    check-cast p1, Landroidx/emoji2/text/z;

    .line 243
    .line 244
    invoke-virtual {p1}, Landroidx/emoji2/text/z;->b()V

    .line 245
    .line 246
    .line 247
    return-object v4

    .line 248
    :catchall_2
    move-exception v0

    .line 249
    move-object v4, p1

    .line 250
    goto :goto_8

    .line 251
    :catchall_3
    move-exception v0

    .line 252
    move-object v4, p1

    .line 253
    move-object p1, v0

    .line 254
    move-object p2, p1

    .line 255
    goto :goto_b

    .line 256
    :goto_a
    if-eqz v2, :cond_12

    .line 257
    .line 258
    goto :goto_9

    .line 259
    :goto_b
    if-eqz v2, :cond_11

    .line 260
    .line 261
    move-object p1, v4

    .line 262
    check-cast p1, Landroidx/emoji2/text/z;

    .line 263
    .line 264
    invoke-virtual {p1}, Landroidx/emoji2/text/z;->b()V

    .line 265
    .line 266
    .line 267
    :cond_11
    throw p2

    .line 268
    :cond_12
    :goto_c
    return-object v4

    .line 269
    :cond_13
    const-string p1, "end cannot be negative"

    .line 270
    .line 271
    invoke-static {p1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    const/4 p1, 0x0

    .line 275
    return-object p1

    .line 276
    :cond_14
    const-string p1, "start cannot be negative"

    .line 277
    .line 278
    invoke-static {p1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    const/4 p1, 0x0

    .line 282
    return-object p1

    .line 283
    :cond_15
    const-string p1, "Not initialized yet"

    .line 284
    .line 285
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    const/4 p1, 0x0

    .line 289
    return-object p1
.end method

.method public final f(Landroidx/emoji2/text/h;)V
    .locals 4

    .line 1
    const-string v0, "initCallback cannot be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lu1/h0;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 13
    .line 14
    .line 15
    :try_start_0
    iget v0, p0, Landroidx/emoji2/text/k;->c:I

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    iget v0, p0, Landroidx/emoji2/text/k;->c:I

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Landroidx/emoji2/text/k;->b:Lp/g;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lp/g;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/emoji2/text/k;->d:Landroid/os/Handler;

    .line 35
    .line 36
    new-instance v1, Landroidx/emoji2/text/i;

    .line 37
    .line 38
    iget v2, p0, Landroidx/emoji2/text/k;->c:I

    .line 39
    .line 40
    filled-new-array {p1}, [Landroidx/emoji2/text/h;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-direct {v1, p1, v2, v3}, Landroidx/emoji2/text/i;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    :goto_1
    iget-object p1, p0, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :goto_2
    iget-object v0, p0, Landroidx/emoji2/text/k;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 72
    .line 73
    .line 74
    throw p1
.end method
