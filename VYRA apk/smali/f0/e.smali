.class public abstract Lf0/e;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final a:Le4/a;

.field public static final b:Lp/j;

.field public static c:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "TypefaceCompat static init"

    .line 2
    .line 3
    invoke-static {v0}, Le4/a;->c(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lf0/i;

    .line 13
    .line 14
    invoke-direct {v0}, Le4/a;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lf0/e;->a:Le4/a;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/16 v1, 0x1d

    .line 21
    .line 22
    if-lt v0, v1, :cond_1

    .line 23
    .line 24
    new-instance v0, Lf0/h;

    .line 25
    .line 26
    invoke-direct {v0}, Le4/a;-><init>()V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lf0/e;->a:Le4/a;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/16 v1, 0x1c

    .line 33
    .line 34
    if-lt v0, v1, :cond_2

    .line 35
    .line 36
    new-instance v0, Lf0/g;

    .line 37
    .line 38
    invoke-direct {v0}, Lf0/f;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lf0/e;->a:Le4/a;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    new-instance v0, Lf0/f;

    .line 45
    .line 46
    invoke-direct {v0}, Lf0/f;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lf0/e;->a:Le4/a;

    .line 50
    .line 51
    :goto_0
    new-instance v0, Lp/j;

    .line 52
    .line 53
    const/16 v1, 0x10

    .line 54
    .line 55
    invoke-direct {v0, v1}, Lp/j;-><init>(I)V

    .line 56
    .line 57
    .line 58
    sput-object v0, Lf0/e;->b:Lp/j;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    sput-object v0, Lf0/e;->c:Landroid/graphics/Paint;

    .line 62
    .line 63
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public static a(Landroid/content/Context;Le0/e;Landroid/content/res/Resources;ILjava/lang/String;IILe0/b;Z)Landroid/graphics/Typeface;
    .locals 16

    move-object/from16 v2, p0

    move-object/from16 v0, p1

    move/from16 v4, p6

    move-object/from16 v1, p7

    .line 1
    instance-of v3, v0, Le0/h;

    const/4 v6, 0x2

    const/4 v7, -0x3

    if-eqz v3, :cond_16

    .line 2
    check-cast v0, Le0/h;

    .line 3
    const-string v3, "TypefaceCompat"

    .line 4
    iget-object v5, v0, Le0/h;->d:Ljava/lang/String;

    .line 5
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-nez v8, :cond_0

    .line 6
    invoke-static {v5}, Lf0/e;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v5

    if-eqz v5, :cond_0

    goto/16 :goto_6

    .line 7
    :cond_0
    iget-object v5, v0, Le0/h;->a:Ljava/util/ArrayList;

    .line 8
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ne v8, v10, :cond_1

    .line 9
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll0/d;

    .line 10
    iget-object v3, v3, Ll0/d;->e:Ljava/lang/String;

    .line 11
    invoke-static {v3}, Lf0/e;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v5

    goto/16 :goto_6

    .line 12
    :cond_1
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x1f

    if-ge v8, v12, :cond_2

    :goto_0
    move-object v5, v9

    goto/16 :goto_6

    :cond_2
    move v8, v11

    .line 13
    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v8, v12, :cond_4

    .line 14
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll0/d;

    .line 15
    iget-object v12, v12, Ll0/d;->e:Ljava/lang/String;

    .line 16
    invoke-static {v12}, Lf0/e;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v12

    if-nez v12, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_4
    move-object v12, v9

    move v8, v11

    .line 17
    :goto_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v13

    if-ge v8, v13, :cond_9

    .line 18
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll0/d;

    .line 19
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v14

    sub-int/2addr v14, v10

    if-ne v8, v14, :cond_5

    .line 20
    iget-object v14, v13, Ll0/d;->f:Ljava/lang/String;

    .line 21
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_5

    .line 22
    iget-object v3, v13, Ll0/d;->e:Ljava/lang/String;

    .line 23
    invoke-static {v12, v3}, Landroidx/activity/x;->r(Landroid/graphics/Typeface$CustomFallbackBuilder;Ljava/lang/String;)V

    goto :goto_5

    .line 24
    :cond_5
    iget-object v14, v13, Ll0/d;->e:Ljava/lang/String;

    iget-object v15, v13, Ll0/d;->f:Ljava/lang/String;

    .line 25
    invoke-static {v14}, Lf0/e;->c(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v14

    invoke-static {v14}, Lf0/e;->d(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;

    move-result-object v14

    if-nez v14, :cond_6

    .line 26
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, "Unable identify the primary font for "

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    iget-object v8, v13, Ll0/d;->e:Ljava/lang/String;

    .line 28
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ". Falling back to provider font."

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 29
    :cond_6
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_7

    .line 30
    :try_start_0
    invoke-static {}, Landroidx/activity/x;->o()V

    invoke-static {}, Landroidx/activity/x;->z()V

    invoke-static {v14}, Lcom/google/android/gms/common/internal/a;->g(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/Font$Builder;

    move-result-object v13

    .line 31
    invoke-static {v13, v15}, Landroidx/activity/x;->g(Landroid/graphics/fonts/Font$Builder;Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;

    move-result-object v13

    .line 32
    invoke-static {v13}, Landroidx/activity/x;->h(Landroid/graphics/fonts/Font$Builder;)Landroid/graphics/fonts/Font;

    move-result-object v13

    invoke-static {v13}, Landroidx/activity/x;->i(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;

    move-result-object v13

    invoke-static {v13}, Landroidx/activity/x;->j(Landroid/graphics/fonts/FontFamily$Builder;)Landroid/graphics/fonts/FontFamily;

    move-result-object v13
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 33
    :catch_0
    const-string v5, "Failed to clone Font instance. Fall back to provider font."

    invoke-static {v3, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0

    .line 34
    :cond_7
    invoke-static {v14}, Landroidx/activity/x;->i(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;

    move-result-object v13

    invoke-static {v13}, Landroidx/activity/x;->j(Landroid/graphics/fonts/FontFamily$Builder;)Landroid/graphics/fonts/FontFamily;

    move-result-object v13

    :goto_3
    if-nez v12, :cond_8

    .line 35
    invoke-static {v13}, Landroidx/activity/x;->c(Landroid/graphics/fonts/FontFamily;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    move-result-object v12

    goto :goto_4

    .line 36
    :cond_8
    invoke-static {v12, v13}, Landroidx/activity/x;->q(Landroid/graphics/Typeface$CustomFallbackBuilder;Landroid/graphics/fonts/FontFamily;)V

    :goto_4
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_2

    .line 37
    :cond_9
    :goto_5
    invoke-static {v12}, Landroidx/activity/x;->d(Landroid/graphics/Typeface$CustomFallbackBuilder;)Landroid/graphics/Typeface;

    move-result-object v5

    :goto_6
    if-eqz v5, :cond_b

    if-eqz v1, :cond_a

    .line 38
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 39
    new-instance v2, Landroidx/activity/p;

    invoke-direct {v2, v1, v6, v5}, Landroidx/activity/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 40
    :cond_a
    sget-object v0, Lf0/e;->b:Lp/j;

    invoke-static/range {p2 .. p6}, Lf0/e;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lp/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v5

    :cond_b
    if-eqz p8, :cond_d

    .line 41
    iget v3, v0, Le0/h;->c:I

    if-nez v3, :cond_c

    :goto_7
    move v3, v10

    goto :goto_8

    :cond_c
    move v3, v11

    goto :goto_8

    :cond_d
    if-nez v1, :cond_c

    goto :goto_7

    :goto_8
    const/4 v5, -0x1

    if-eqz p8, :cond_e

    .line 42
    iget v8, v0, Le0/h;->b:I

    goto :goto_9

    :cond_e
    move v8, v5

    .line 43
    :goto_9
    new-instance v12, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v13

    invoke-direct {v12, v13}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 44
    new-instance v13, La3/h0;

    const/16 v14, 0xb

    .line 45
    invoke-direct {v13, v14}, La3/h0;-><init>(I)V

    .line 46
    iput-object v1, v13, La3/h0;->g:Ljava/lang/Object;

    .line 47
    iget-object v0, v0, Le0/h;->a:Ljava/util/ArrayList;

    .line 48
    new-instance v14, Landroidx/emoji2/text/p;

    .line 49
    new-instance v1, Lk0/f;

    invoke-direct {v1, v12, v10}, Lk0/f;-><init>(Landroid/os/Handler;I)V

    const/16 v12, 0x9

    .line 50
    invoke-direct {v14, v13, v12, v1}, Landroidx/emoji2/text/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 v12, 0x5

    if-eqz v3, :cond_12

    .line 51
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-gt v3, v10, :cond_11

    .line 52
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ll0/d;

    sget-object v0, Ll0/h;->a:Lp/j;

    .line 53
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v0

    .line 54
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15, v10}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v0, v0, v11

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v15}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 55
    invoke-static {v0, v4}, Ll0/h;->a(Ljava/util/List;I)Ljava/lang/String;

    move-result-object v0

    .line 56
    sget-object v15, Ll0/h;->a:Lp/j;

    invoke-virtual {v15, v0}, Lp/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/graphics/Typeface;

    if-eqz v15, :cond_f

    .line 57
    new-instance v0, Lb0/b;

    invoke-direct {v0, v13, v12, v15}, Lb0/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v1, v0}, Lk0/f;->execute(Ljava/lang/Runnable;)V

    move-object v9, v15

    goto/16 :goto_d

    :cond_f
    if-ne v8, v5, :cond_10

    .line 58
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v1

    .line 59
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v10}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v1, v1, v11

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 60
    invoke-static {v0, v2, v1, v4}, Ll0/h;->b(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Ll0/g;

    move-result-object v0

    .line 61
    invoke-virtual {v14, v0}, Landroidx/emoji2/text/p;->t(Ll0/g;)V

    .line 62
    iget-object v9, v0, Ll0/g;->a:Landroid/graphics/Typeface;

    goto/16 :goto_d

    :cond_10
    move-object v1, v0

    .line 63
    new-instance v0, Ll0/e;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Ll0/e;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 64
    :try_start_1
    sget-object v1, Ll0/h;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 65
    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_4

    int-to-long v1, v8

    .line 66
    :try_start_2
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_3

    .line 67
    :try_start_3
    check-cast v0, Ll0/g;

    .line 68
    invoke-virtual {v14, v0}, Landroidx/emoji2/text/p;->t(Ll0/g;)V

    .line 69
    iget-object v9, v0, Ll0/g;->a:Landroid/graphics/Typeface;

    goto/16 :goto_d

    :catch_1
    move-exception v0

    goto :goto_a

    :catch_2
    move-exception v0

    goto :goto_b

    .line 70
    :catch_3
    new-instance v0, Ljava/lang/InterruptedException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 71
    :goto_a
    throw v0

    .line 72
    :goto_b
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_4

    .line 73
    :catch_4
    iget-object v0, v14, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    check-cast v0, Lk0/f;

    .line 74
    iget-object v1, v14, Landroidx/emoji2/text/p;->g:Ljava/lang/Object;

    check-cast v1, La3/h0;

    .line 75
    new-instance v2, Landroidx/emoji2/text/i;

    invoke-direct {v2, v7, v6, v1}, Landroidx/emoji2/text/i;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Lk0/f;->execute(Ljava/lang/Runnable;)V

    goto/16 :goto_d

    .line 76
    :cond_11
    const-string v0, "Fallbacks with blocking fetches are not supported for performance reasons"

    invoke-static {v0}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    return-object v9

    .line 77
    :cond_12
    invoke-static {v0, v4}, Ll0/h;->a(Ljava/util/List;I)Ljava/lang/String;

    move-result-object v2

    .line 78
    sget-object v3, Ll0/h;->a:Lp/j;

    invoke-virtual {v3, v2}, Lp/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Typeface;

    if-eqz v3, :cond_13

    .line 79
    new-instance v0, Lb0/b;

    invoke-direct {v0, v13, v12, v3}, Lb0/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v1, v0}, Lk0/f;->execute(Ljava/lang/Runnable;)V

    move-object v9, v3

    goto :goto_d

    .line 80
    :cond_13
    new-instance v1, Ll0/f;

    invoke-direct {v1, v11, v14}, Ll0/f;-><init>(ILjava/lang/Object;)V

    .line 81
    sget-object v3, Ll0/h;->c:Ljava/lang/Object;

    monitor-enter v3

    .line 82
    :try_start_4
    sget-object v5, Ll0/h;->d:Lp/k;

    invoke-virtual {v5, v2}, Lp/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/ArrayList;

    if-eqz v6, :cond_14

    .line 83
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    monitor-exit v3

    goto :goto_d

    :catchall_0
    move-exception v0

    goto :goto_e

    .line 85
    :cond_14
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 86
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    invoke-virtual {v5, v2, v6}, Lp/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v3, v0

    .line 89
    new-instance v0, Ll0/e;

    const/4 v5, 0x1

    move-object v1, v2

    move-object/from16 v2, p0

    invoke-direct/range {v0 .. v5}, Ll0/e;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 90
    sget-object v2, Ll0/h;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 91
    new-instance v3, Ll0/f;

    invoke-direct {v3, v10, v1}, Ll0/f;-><init>(ILjava/lang/Object;)V

    .line 92
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-nez v1, :cond_15

    .line 93
    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v5

    invoke-direct {v1, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_c

    .line 94
    :cond_15
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 95
    :goto_c
    new-instance v5, Lc2/d;

    .line 96
    invoke-direct {v5}, Lc2/d;-><init>()V

    .line 97
    iput-object v0, v5, Lc2/d;->g:Ljava/lang/Object;

    .line 98
    iput-object v3, v5, Lc2/d;->h:Ljava/lang/Object;

    .line 99
    iput-object v1, v5, Lc2/d;->i:Ljava/lang/Object;

    .line 100
    invoke-virtual {v2, v5}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    :goto_d
    move-object/from16 v5, p2

    goto :goto_f

    .line 101
    :goto_e
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0

    .line 102
    :cond_16
    sget-object v3, Lf0/e;->a:Le4/a;

    check-cast v0, Le0/f;

    move-object/from16 v5, p2

    invoke-virtual {v3, v2, v0, v5, v4}, Le4/a;->o(Landroid/content/Context;Le0/f;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    move-result-object v9

    if-eqz v1, :cond_18

    if-eqz v9, :cond_17

    .line 103
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 104
    new-instance v2, Landroidx/activity/p;

    invoke-direct {v2, v1, v6, v9}, Landroidx/activity/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_f

    .line 105
    :cond_17
    invoke-virtual {v1, v7}, Le0/b;->a(I)V

    :cond_18
    :goto_f
    if-eqz v9, :cond_19

    .line 106
    sget-object v0, Lf0/e;->b:Lp/j;

    invoke-static/range {p2 .. p6}, Lf0/e;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v9}, Lp/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_19
    return-object v9
.end method

.method public static b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x2d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static c(Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 17
    .line 18
    invoke-static {v2, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static d(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;
    .locals 2

    .line 1
    sget-object v0, Lf0/e;->c:Landroid/graphics/Paint;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lf0/e;->c:Landroid/graphics/Paint;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lf0/e;->c:Landroid/graphics/Paint;

    .line 13
    .line 14
    const/high16 v1, 0x41200000    # 10.0f

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lf0/e;->c:Landroid/graphics/Paint;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 22
    .line 23
    .line 24
    sget-object p0, Lf0/e;->c:Landroid/graphics/Paint;

    .line 25
    .line 26
    invoke-static {p0}, Lcom/google/android/gms/common/internal/a;->i(Landroid/graphics/Paint;)Landroid/graphics/text/PositionedGlyphs;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lcom/google/android/gms/common/internal/a;->b(Landroid/graphics/text/PositionedGlyphs;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0

    .line 38
    :cond_1
    invoke-static {p0}, Lcom/google/android/gms/common/internal/a;->h(Landroid/graphics/text/PositionedGlyphs;)Landroid/graphics/fonts/Font;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
