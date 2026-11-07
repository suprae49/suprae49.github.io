.class public final Lx1/a;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static s1:Lx1/a;


# instance fields
.field public A:F

.field public final A0:Lz1/e;

.field public final B:Z

.field public final B0:Z

.field public C:Z

.field public final C0:I

.field public D:Z

.field public final D0:Z

.field public E:I

.field public E0:Ljava/util/ArrayList;

.field public F:Z

.field public final F0:Ljava/lang/String;

.field public G:Ljava/util/HashMap;

.field public final G0:Z

.field public H:Z

.field public final H0:Ljava/lang/String;

.field public I:Ljava/util/ArrayList;

.field public I0:Lz1/b;

.field public J:Ljava/util/ArrayList;

.field public final J0:Lz1/d;

.field public K:Ljava/lang/String;

.field public K0:Z

.field public L:Ljava/lang/String;

.field public final L0:Ljava/lang/String;

.field public M:Ljava/lang/String;

.field public final M0:Ljava/lang/String;

.field public N:Ljava/util/ArrayList;

.field public final N0:Lorg/json/JSONArray;

.field public O:Ljava/util/ArrayList;

.field public O0:Lorg/json/JSONArray;

.field public P:Ljava/util/ArrayList;

.field public final P0:Z

.field public Q:Ljava/util/ArrayList;

.field public final Q0:Z

.field public R:Ljava/util/ArrayList;

.field public final R0:Ljava/util/ArrayList;

.field public final S:Ljava/lang/String;

.field public final S0:Ljava/util/ArrayList;

.field public final T:Lx1/f;

.field public final T0:Z

.field public final U:Lx1/f;

.field public final U0:Z

.field public V:Ljava/util/HashMap;

.field public final V0:Z

.field public final W:Z

.field public W0:Z

.field public final X:Z

.field public final X0:Ljava/lang/String;

.field public Y:Ljava/util/HashMap;

.field public final Y0:Ljava/lang/String;

.field public Z:Ljava/util/ArrayList;

.field public Z0:J

.field public final a:Landroid/content/Context;

.field public a0:Ljava/util/ArrayList;

.field public a1:Z

.field public final b:Lorg/json/JSONObject;

.field public b0:Ljava/util/HashMap;

.field public b1:Z

.field public final c:Ljava/lang/Exception;

.field public c0:Ljava/util/ArrayList;

.field public c1:Z

.field public d:Ljava/lang/String;

.field public d0:Ljava/util/ArrayList;

.field public d1:Z

.field public e:Ljava/lang/String;

.field public final e0:Ljava/util/ArrayList;

.field public final e1:Ljava/util/HashMap;

.field public final f:Ljava/lang/String;

.field public final f0:Ljava/util/ArrayList;

.field public f1:Ljava/util/ArrayList;

.field public final g:Ljava/lang/String;

.field public final g0:Z

.field public g1:Ljava/util/HashMap;

.field public final h:Ljava/lang/String;

.field public final h0:Z

.field public h1:Ljava/util/HashMap;

.field public final i:Ljava/lang/String;

.field public final i0:Z

.field public i1:Z

.field public final j:Ljava/lang/String;

.field public final j0:Z

.field public j1:Lz1/g;

.field public final k:Ljava/lang/String;

.field public final k0:D

.field public final k1:Z

.field public final l:I

.field public final l0:Ljava/lang/String;

.field public final l1:Z

.field public m:Ljava/util/ArrayList;

.field public final m0:Z

.field public final m1:Z

.field public n:Ljava/util/ArrayList;

.field public final n0:Z

.field public final n1:Z

.field public final o:Z

.field public final o0:Z

.field public final o1:Lz1/a;

.field public final p:Z

.field public final p0:D

.field public final p1:I

.field public final q:Z

.field public final q0:Z

.field public final q1:I

.field public final r:Z

.field public final r0:Z

.field public final r1:I

.field public final s:Z

.field public final s0:Z

.field public final t:Z

.field public t0:Z

.field public final u:Ljava/util/HashMap;

.field public u0:Z

.field public final v:Ljava/util/ArrayList;

.field public final v0:Ljava/lang/String;

.field public final w:D

.field public final w0:Ljava/lang/String;

.field public final x:Lx1/d;

.field public x0:Ljava/util/ArrayList;

.field public final y:Z

.field public final y0:F

.field public final z:Z

.field public final z0:Lz1/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 1
    const-string v3, "androidCustomJSUrl"

    const-string v4, "androidCustomJS"

    const-string v5, "customJSUrl"

    const-string v6, "customJS"

    const-string v7, "auto"

    const-string v8, "androidCustomCSSUrl"

    const-string v9, "androidCustomCSS"

    const-string v10, "customCSSUrl"

    const-string v11, "customCSS"

    const-string v12, "androidConnectionOfflineTime"

    const-string v13, "appConfig.json"

    const-string v14, "co.median.median_core.AppConfig"

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v15, 0x1

    .line 2
    iput-boolean v15, v1, Lx1/a;->p:Z

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    const-wide/high16 v3, 0x4024000000000000L    # 10.0

    .line 3
    iput-wide v3, v1, Lx1/a;->w:D

    .line 4
    sget-object v0, Lx1/d;->h:Lx1/d;

    iput-object v0, v1, Lx1/a;->x:Lx1/d;

    const/4 v3, 0x0

    .line 5
    iput-boolean v3, v1, Lx1/a;->y:Z

    .line 6
    iput-boolean v15, v1, Lx1/a;->z:Z

    const/high16 v0, -0x40800000    # -1.0f

    .line 7
    iput v0, v1, Lx1/a;->A:F

    .line 8
    iput-boolean v3, v1, Lx1/a;->g0:Z

    .line 9
    iput-boolean v3, v1, Lx1/a;->h0:Z

    .line 10
    iput-boolean v3, v1, Lx1/a;->i0:Z

    .line 11
    iput-boolean v3, v1, Lx1/a;->j0:Z

    .line 12
    iput-boolean v15, v1, Lx1/a;->m0:Z

    .line 13
    iput-boolean v3, v1, Lx1/a;->n0:Z

    .line 14
    iput-boolean v3, v1, Lx1/a;->o0:Z

    .line 15
    iput-boolean v3, v1, Lx1/a;->D0:Z

    .line 16
    iput-boolean v3, v1, Lx1/a;->K0:Z

    .line 17
    iput-boolean v3, v1, Lx1/a;->P0:Z

    .line 18
    iput-boolean v3, v1, Lx1/a;->Q0:Z

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v1, Lx1/a;->R0:Ljava/util/ArrayList;

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v1, Lx1/a;->S0:Ljava/util/ArrayList;

    .line 21
    iput-boolean v3, v1, Lx1/a;->T0:Z

    .line 22
    iput-boolean v15, v1, Lx1/a;->U0:Z

    .line 23
    iput-boolean v15, v1, Lx1/a;->V0:Z

    .line 24
    iput-boolean v3, v1, Lx1/a;->W0:Z

    .line 25
    const-string v4, ""

    iput-object v4, v1, Lx1/a;->Y0:Ljava/lang/String;

    move-object/from16 v18, v4

    const-wide/16 v3, 0x0

    .line 26
    iput-wide v3, v1, Lx1/a;->Z0:J

    .line 27
    iput-boolean v15, v1, Lx1/a;->a1:Z

    .line 28
    iput-boolean v15, v1, Lx1/a;->b1:Z

    .line 29
    iput-boolean v15, v1, Lx1/a;->c1:Z

    const/4 v3, 0x0

    .line 30
    iput-boolean v3, v1, Lx1/a;->d1:Z

    const/4 v4, 0x0

    .line 31
    iput-object v4, v1, Lx1/a;->j1:Lz1/g;

    .line 32
    iput-boolean v3, v1, Lx1/a;->k1:Z

    .line 33
    iput-boolean v3, v1, Lx1/a;->l1:Z

    .line 34
    iput-boolean v15, v1, Lx1/a;->m1:Z

    .line 35
    iput-boolean v15, v1, Lx1/a;->n1:Z

    .line 36
    iput-object v2, v1, Lx1/a;->a:Landroid/content/Context;

    .line 37
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    invoke-direct {v0, v3, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 38
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const-string v3, "UTF-8"

    if-eqz v0, :cond_0

    .line 39
    :try_start_1
    new-instance v4, Ljava/io/BufferedInputStream;

    new-instance v0, Ljava/io/FileInputStream;

    .line 40
    new-instance v15, Ljava/io/File;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v19, v5

    :try_start_2
    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v5

    invoke-direct {v15, v5, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 41
    invoke-direct {v0, v15}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v4, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    :try_start_3
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 43
    invoke-static {v4, v0}, Lt1/l;->g(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;)V

    .line 44
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 45
    new-instance v5, Lorg/json/JSONObject;

    invoke-virtual {v0, v3}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v5, v1, Lx1/a;->b:Lorg/json/JSONObject;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    const/4 v4, 0x0

    goto/16 :goto_32

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    move-object/from16 v19, v5

    :goto_0
    const/4 v4, 0x0

    .line 46
    :goto_1
    :try_start_4
    invoke-static {}, Lx1/f;->a()Lx1/f;

    move-result-object v5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v5, v14, v15, v0}, Lx1/f;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 47
    invoke-static {v4}, Lt1/l;->f(Ljava/io/Closeable;)V

    goto :goto_2

    :catch_3
    move-exception v0

    const/4 v4, 0x0

    goto/16 :goto_30

    :cond_0
    move-object/from16 v19, v5

    .line 48
    :goto_2
    iget-object v0, v1, Lx1/a;->b:Lorg/json/JSONObject;

    if-nez v0, :cond_1

    .line 49
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, v13}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 50
    :try_start_5
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 51
    invoke-static {v4, v0}, Lt1/l;->g(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;)V

    .line 52
    invoke-static {v0}, Lt1/l;->f(Ljava/io/Closeable;)V

    .line 53
    new-instance v5, Lorg/json/JSONObject;

    invoke-virtual {v0, v3}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v5, v1, Lx1/a;->b:Lorg/json/JSONObject;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    goto/16 :goto_32

    :catch_4
    move-exception v0

    goto/16 :goto_30

    :cond_1
    const/4 v4, 0x0

    .line 54
    :goto_3
    :try_start_6
    new-instance v0, Lx1/f;

    const/4 v3, 0x2

    invoke-direct {v0, v3}, Lx1/f;-><init>(I)V

    iput-object v0, v1, Lx1/a;->T:Lx1/f;

    .line 55
    new-instance v0, Lx1/f;

    const/4 v3, 0x1

    invoke-direct {v0, v3}, Lx1/f;-><init>(I)V

    iput-object v0, v1, Lx1/a;->U:Lx1/f;

    .line 56
    iget-object v0, v1, Lx1/a;->b:Lorg/json/JSONObject;

    const-string v3, "general"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_18

    .line 57
    const-string v3, "initurl.json"

    invoke-virtual {v1, v3}, Lx1/a;->n(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    const-string v5, "initialUrl"

    if-eqz v3, :cond_2

    .line 58
    :try_start_7
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_2

    .line 59
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lx1/a;->e:Ljava/lang/String;

    iput-object v3, v1, Lx1/a;->d:Ljava/lang/String;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_4

    .line 60
    :cond_2
    :try_start_8
    invoke-static {v5, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lx1/a;->e:Ljava/lang/String;

    iput-object v3, v1, Lx1/a;->d:Ljava/lang/String;

    .line 61
    :goto_4
    iget-object v3, v1, Lx1/a;->d:Ljava/lang/String;

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lx1/a;->f:Ljava/lang/String;

    .line 62
    const-string v5, "www."

    invoke-virtual {v3, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    if-eqz v5, :cond_3

    const/4 v5, 0x4

    .line 63
    :try_start_9
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lx1/a;->f:Ljava/lang/String;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 64
    :cond_3
    :try_start_a
    const-string v3, "appName"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lx1/a;->g:Ljava/lang/String;

    .line 65
    const-string v3, "androidForceUserAgent"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lx1/a;->i:Ljava/lang/String;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    if-eqz v3, :cond_4

    .line 66
    :try_start_b
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    if-eqz v3, :cond_5

    .line 67
    :cond_4
    :try_start_c
    const-string v3, "forceUserAgent"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lx1/a;->i:Ljava/lang/String;

    .line 68
    :cond_5
    iget-object v3, v1, Lx1/a;->i:Ljava/lang/String;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_6
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    if-eqz v3, :cond_6

    :try_start_d
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_6

    .line 69
    iget-object v3, v1, Lx1/a;->i:Ljava/lang/String;

    iput-object v3, v1, Lx1/a;->k:Ljava/lang/String;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_4
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    goto :goto_5

    .line 70
    :cond_6
    :try_start_e
    const-string v3, "androidUserAgentAdd"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lx1/a;->j:Ljava/lang/String;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_6
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    if-eqz v3, :cond_7

    .line 71
    :try_start_f
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_4
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    if-eqz v3, :cond_8

    .line 72
    :cond_7
    :try_start_10
    const-string v3, "userAgentAdd"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lx1/a;->j:Ljava/lang/String;

    .line 73
    :cond_8
    iget-object v3, v1, Lx1/a;->j:Ljava/lang/String;
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6
    .catchall {:try_start_10 .. :try_end_10} :catchall_3

    const-string v5, "gonative"

    if-nez v3, :cond_9

    :try_start_11
    iput-object v5, v1, Lx1/a;->j:Ljava/lang/String;
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_4
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 74
    :cond_9
    :try_start_12
    iget-object v3, v1, Lx1/a;->j:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_6
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    if-eqz v3, :cond_a

    .line 75
    :try_start_13
    const-string v3, "GoNativeAndroid/1.0 gonative"

    iput-object v3, v1, Lx1/a;->j:Ljava/lang/String;
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_4
    .catchall {:try_start_13 .. :try_end_13} :catchall_1

    .line 76
    :cond_a
    :goto_5
    :try_start_14
    const-string v3, "publicKey"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lx1/a;->h:Ljava/lang/String;

    .line 77
    const-string v3, "forceSessionCookieExpiry"

    const/4 v5, 0x0

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    iput v3, v1, Lx1/a;->l:I
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_6
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    if-lez v3, :cond_b

    const/4 v3, 0x1

    .line 78
    :try_start_15
    iput-boolean v3, v1, Lx1/a;->W0:Z
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_4
    .catchall {:try_start_15 .. :try_end_15} :catchall_1

    .line 79
    :cond_b
    :try_start_16
    const-string v3, "userAgentRegexes"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v1, v3}, Lx1/a;->o(Lorg/json/JSONArray;)V

    .line 80
    const-string v3, "disableConfigUpdater"

    const/4 v5, 0x0

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 81
    const-string v3, "disableEventRecorder"

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->o:Z

    .line 82
    const-string v3, "androidDirectCameraUploads"

    const/4 v5, 0x1

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->p:Z

    .line 83
    const-string v3, "androidClearCache"

    const/4 v5, 0x0

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->q:Z

    .line 84
    const-string v3, "enableWindowOpen"

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->r:Z

    .line 85
    const-string v3, "forceScreenOrientation"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_6
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    const-string v13, "landscape"

    const/4 v15, 0x2

    const-string v5, "portrait"

    if-eqz v3, :cond_d

    .line 86
    :try_start_17
    invoke-virtual {v3, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v20

    if-eqz v20, :cond_c

    .line 87
    iput v15, v1, Lx1/a;->p1:I

    goto :goto_6

    .line 88
    :cond_c
    invoke-virtual {v3, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_d

    const/4 v3, 0x3

    .line 89
    iput v3, v1, Lx1/a;->p1:I
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_4
    .catchall {:try_start_17 .. :try_end_17} :catchall_1

    .line 90
    :cond_d
    :goto_6
    :try_start_18
    const-string v3, "screenOrientation"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_11

    .line 91
    const-string v15, "androidPhone"
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_6
    .catchall {:try_start_18 .. :try_end_18} :catchall_3

    move-object/from16 v21, v4

    move-object/from16 v4, v18

    :try_start_19
    invoke-virtual {v3, v15, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 92
    invoke-virtual {v5, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v18

    if-eqz v18, :cond_e

    move-object/from16 v18, v6

    const/4 v6, 0x2

    .line 93
    iput v6, v1, Lx1/a;->q1:I

    goto :goto_7

    :catchall_2
    move-exception v0

    move-object/from16 v4, v21

    goto/16 :goto_32

    :catch_5
    move-exception v0

    move-object/from16 v4, v21

    goto/16 :goto_30

    :cond_e
    move-object/from16 v18, v6

    .line 94
    invoke-virtual {v13, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_f

    const/4 v6, 0x3

    .line 95
    iput v6, v1, Lx1/a;->q1:I

    .line 96
    :cond_f
    :goto_7
    const-string v6, "androidTablet"

    invoke-virtual {v3, v6, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 97
    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_10

    const/4 v6, 0x2

    .line 98
    iput v6, v1, Lx1/a;->r1:I

    goto :goto_8

    .line 99
    :cond_10
    invoke-virtual {v13, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_12

    const/4 v3, 0x3

    .line 100
    iput v3, v1, Lx1/a;->r1:I

    goto :goto_8

    :catchall_3
    move-exception v0

    move-object/from16 v21, v4

    goto/16 :goto_32

    :catch_6
    move-exception v0

    move-object/from16 v21, v4

    goto/16 :goto_30

    :cond_11
    move-object/from16 v21, v4

    move-object/from16 v4, v18

    move-object/from16 v18, v6

    .line 101
    :cond_12
    :goto_8
    const-string v3, "keepScreenOn"

    const/4 v5, 0x0

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->s:Z

    .line 102
    const-string v3, "androidFullScreen"

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->t:Z

    .line 103
    const-string v3, "androidCustomHeaders"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_13

    .line 104
    const-string v3, "customHeaders"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    :cond_13
    if-eqz v3, :cond_15

    .line 105
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    iput-object v5, v1, Lx1/a;->u:Ljava/util/HashMap;

    .line 106
    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v5

    .line 107
    :cond_14
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_15

    .line 108
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 109
    invoke-static {v6, v3}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v13

    if-eqz v6, :cond_14

    if-eqz v13, :cond_14

    .line 110
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v15

    if-nez v15, :cond_14

    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v15

    if-nez v15, :cond_14

    .line 111
    iget-object v15, v1, Lx1/a;->u:Ljava/util/HashMap;

    invoke-virtual {v15, v6, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    .line 112
    :cond_15
    const-string v3, "postLoadJavascript"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lx1/a;->X0:Ljava/lang/String;

    .line 113
    const-string v3, "nativeBridgeUrls"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lx1/a;->c(Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v3

    iput-object v3, v1, Lx1/a;->v:Ljava/util/ArrayList;

    .line 114
    const-string v3, "androidCacheMode"

    const-string v5, "default"

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lx1/d;->a(Ljava/lang/String;)Lx1/d;

    move-result-object v3

    iput-object v3, v1, Lx1/a;->x:Lx1/d;

    .line 115
    const-string v3, "sslToastErrorsEnabled"

    const/4 v5, 0x0

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->y:Z

    .line 116
    const-string v3, "injectMedianJS"

    iget-boolean v5, v1, Lx1/a;->z:Z

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->z:Z

    .line 117
    invoke-static {v2}, Lz1/a;->a(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_17

    .line 118
    const-string v3, "HIGH"

    .line 119
    const-string v5, "androidCameraCaptureQuality"

    invoke-virtual {v0, v5, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_16

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    :cond_16
    invoke-static {v3}, Landroidx/fragment/app/u;->d(Ljava/lang/String;)I

    move-result v3

    .line 121
    const-string v5, "androidSaveCameraCaptureToGallery"

    const/4 v6, 0x1

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    .line 122
    invoke-static {v3}, Ls/e;->a(I)V

    .line 123
    const-string v6, "camera_config_prefs"

    const/4 v13, 0x0

    invoke-virtual {v2, v6, v13}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    .line 125
    invoke-static {v3}, Landroidx/fragment/app/u;->p(I)Ljava/lang/String;

    move-result-object v3

    const-string v13, "captureQuality"

    invoke-interface {v6, v13, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 126
    const-string v3, "saveToGallery"

    invoke-interface {v6, v3, v5}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 127
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 128
    :cond_17
    const-string v3, "androidGooglePaySafeUrls"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v1, v0}, Lx1/a;->f(Lorg/json/JSONArray;)V

    goto :goto_a

    :cond_18
    move-object/from16 v21, v4

    move-object/from16 v4, v18

    move-object/from16 v18, v6

    .line 129
    :goto_a
    new-instance v0, Lz1/a;

    invoke-direct {v0}, Lz1/a;-><init>()V

    invoke-virtual {v0, v2}, Lz1/a;->b(Landroid/content/Context;)V

    iput-object v0, v1, Lx1/a;->o1:Lz1/a;

    .line 130
    iget-object v0, v1, Lx1/a;->b:Lorg/json/JSONObject;

    const-string v2, "forms"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_5
    .catchall {:try_start_19 .. :try_end_19} :catchall_2

    const-string v2, "active"

    if-eqz v0, :cond_1b

    .line 131
    :try_start_1a
    const-string v3, "search"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_19

    const/4 v5, 0x0

    .line 132
    invoke-virtual {v3, v2, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_19

    .line 133
    const-string v5, "searchTemplateURL"

    invoke-static {v5, v3}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 134
    :cond_19
    const-string v3, "loginConfig"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_5
    .catchall {:try_start_1a .. :try_end_1a} :catchall_2

    const-string v5, "interceptUrl"

    if-eqz v3, :cond_1a

    const/4 v13, 0x0

    .line 135
    :try_start_1b
    invoke-virtual {v3, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_1a

    .line 136
    invoke-static {v5, v3}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v1, Lx1/a;->F0:Ljava/lang/String;

    .line 137
    const-string v6, "loginIsFirstPage"

    invoke-virtual {v3, v6, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->G0:Z

    .line 138
    :cond_1a
    const-string v3, "signupConfig"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_1b

    const/4 v13, 0x0

    .line 139
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_1b

    .line 140
    invoke-static {v5, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lx1/a;->H0:Ljava/lang/String;

    .line 141
    :cond_1b
    iget-object v0, v1, Lx1/a;->b:Lorg/json/JSONObject;

    const-string v3, "navigation"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_5
    .catchall {:try_start_1b .. :try_end_1b} :catchall_2

    const-string v13, "enabled"

    if-eqz v3, :cond_2b

    .line 142
    :try_start_1c
    const-string v0, "androidPullToRefresh"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lx1/a;->B:Z

    .line 143
    const-string v0, "swipeGestures"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lx1/a;->C:Z

    .line 144
    const-string v0, "swipeGesturesEdge"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 145
    const-string v0, "maxwindows.json"

    invoke-virtual {v1, v0}, Lx1/a;->n(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_5
    .catchall {:try_start_1c .. :try_end_1c} :catchall_2

    const-string v15, "autoClose"

    const-string v6, "numWindows"

    if-eqz v0, :cond_1c

    move-object/from16 v22, v4

    const/4 v5, 0x0

    .line 146
    :try_start_1d
    invoke-virtual {v0, v13, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v4

    iput-boolean v4, v1, Lx1/a;->D:Z

    const/16 v4, 0x64

    .line 147
    invoke-virtual {v0, v6, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v1, Lx1/a;->E:I

    .line 148
    invoke-virtual {v0, v15, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, v1, Lx1/a;->F:Z

    goto :goto_b

    :cond_1c
    move-object/from16 v22, v4

    .line 149
    const-string v0, "maxWindows"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_1d

    .line 150
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1d

    const/4 v5, 0x1

    .line 151
    iput-boolean v5, v1, Lx1/a;->D:Z

    const/16 v4, 0x64

    .line 152
    invoke-virtual {v0, v6, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    iput v4, v1, Lx1/a;->E:I

    const/4 v5, 0x0

    .line 153
    invoke-virtual {v0, v15, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, v1, Lx1/a;->F:Z

    .line 154
    :cond_1d
    :goto_b
    const-string v0, "sidebarnav.json"

    invoke-virtual {v1, v0}, Lx1/a;->n(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_1e

    .line 155
    const-string v4, "menus"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1e

    .line 156
    invoke-virtual {v1, v0}, Lx1/a;->r(Lorg/json/JSONObject;)V

    goto :goto_c

    .line 157
    :cond_1e
    const-string v0, "sidebarNavigation"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 158
    invoke-virtual {v1, v0}, Lx1/a;->r(Lorg/json/JSONObject;)V

    .line 159
    :goto_c
    const-string v0, "navlevels.json"

    invoke-virtual {v1, v0}, Lx1/a;->n(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_1f

    .line 160
    const-string v0, "androidNavigationLevels"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    :cond_1f
    if-nez v0, :cond_20

    .line 161
    const-string v0, "navigationLevels"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 162
    :cond_20
    invoke-virtual {v1, v0}, Lx1/a;->m(Lorg/json/JSONObject;)V

    .line 163
    const-string v0, "navtitles.json"

    invoke-virtual {v1, v0}, Lx1/a;->n(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_21

    .line 164
    const-string v0, "navigationTitles"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 165
    :cond_21
    invoke-virtual {v1, v0}, Lx1/a;->p(Lorg/json/JSONObject;)V

    .line 166
    const-string v0, "profilePickerJS"

    invoke-static {v0, v3}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lx1/a;->S:Ljava/lang/String;

    .line 167
    const-string v0, "regexintext.json"

    invoke-virtual {v1, v0}, Lx1/a;->n(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_5
    .catchall {:try_start_1d .. :try_end_1d} :catchall_2

    const-string v4, "rules"

    if-eqz v0, :cond_22

    .line 168
    :try_start_1e
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_22

    .line 169
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    goto :goto_d

    .line 170
    :cond_22
    const-string v0, "regexInternalExternal"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_23

    .line 171
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_23

    .line 172
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    goto :goto_d

    :cond_23
    const/4 v0, 0x0

    .line 173
    :goto_d
    invoke-virtual {v1, v0}, Lx1/a;->l(Lorg/json/JSONArray;)V

    .line 174
    const-string v0, "tabNavigation"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 175
    invoke-virtual {v1, v0}, Lx1/a;->s(Lorg/json/JSONObject;)V

    .line 176
    const-string v0, "actionConfig"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 177
    invoke-virtual {v1, v0}, Lx1/a;->g(Lorg/json/JSONObject;)V

    .line 178
    const-string v0, "androidShowRefreshButton"

    const/4 v5, 0x1

    invoke-virtual {v3, v0, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 179
    const-string v0, "ignorePageFinishedRegexes"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 180
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v1, Lx1/a;->e0:Ljava/util/ArrayList;

    if-eqz v4, :cond_25

    const/4 v5, 0x0

    .line 181
    :goto_e
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_25

    .line 182
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->isNull(I)Z

    move-result v0

    if-nez v0, :cond_24

    .line 183
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v6
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_5
    .catchall {:try_start_1e .. :try_end_1e} :catchall_2

    if-eqz v6, :cond_24

    .line 184
    :try_start_1f
    invoke-static {v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 185
    iget-object v15, v1, Lx1/a;->e0:Ljava/util/ArrayList;

    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1f
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_1f .. :try_end_1f} :catch_7
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_5
    .catchall {:try_start_1f .. :try_end_1f} :catchall_2

    :cond_24
    move-object/from16 p1, v4

    move/from16 v23, v5

    goto :goto_f

    :catch_7
    move-exception v0

    .line 186
    :try_start_20
    invoke-static {}, Lx1/f;->a()Lx1/f;

    move-result-object v15

    move-object/from16 p1, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v23, v5

    const-string v5, "Error parsing regex "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v14, v4, v0}, Lx1/f;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_f
    add-int/lit8 v5, v23, 0x1

    move-object/from16 v4, p1

    goto :goto_e

    .line 187
    :cond_25
    const-string v0, "redirects"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_27

    .line 188
    new-instance v4, Ljava/util/HashMap;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/HashMap;-><init>(I)V

    iput-object v4, v1, Lx1/a;->V:Ljava/util/HashMap;

    const/4 v4, 0x0

    .line 189
    :goto_10
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-ge v4, v5, :cond_28

    .line 190
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "from"

    invoke-static {v6, v5}, Lt2/i;->G(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    .line 191
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    const-string v15, "to"

    invoke-static {v15, v6}, Lt2/i;->G(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v6

    if-eqz v5, :cond_26

    if-eqz v6, :cond_26

    .line 192
    iget-object v15, v1, Lx1/a;->V:Ljava/util/HashMap;

    invoke-virtual {v15, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_26
    add-int/lit8 v4, v4, 0x1

    goto :goto_10

    :cond_27
    const/4 v4, 0x0

    .line 193
    iput-object v4, v1, Lx1/a;->V:Ljava/util/HashMap;

    .line 194
    :cond_28
    iget-object v0, v1, Lx1/a;->V:Ljava/util/HashMap;

    iput-object v0, v1, Lx1/a;->e1:Ljava/util/HashMap;

    .line 195
    const-string v0, "androidShowOfflinePage"

    const/4 v5, 0x1

    invoke-virtual {v3, v0, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, v1, Lx1/a;->W:Z

    .line 196
    const-string v0, "androidDisableBackButton"

    const/4 v5, 0x0

    invoke-virtual {v3, v0, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, v1, Lx1/a;->X:Z

    .line 197
    invoke-virtual {v3, v12}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2a

    .line 198
    instance-of v4, v0, Ljava/lang/Boolean;

    if-eqz v4, :cond_29

    check-cast v0, Ljava/lang/Boolean;

    .line 199
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_29

    const-wide/high16 v4, 0x7ff8000000000000L    # Double.NaN

    .line 200
    iput-wide v4, v1, Lx1/a;->w:D

    goto :goto_11

    .line 201
    :cond_29
    iget-wide v4, v1, Lx1/a;->w:D

    invoke-virtual {v3, v12, v4, v5}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v4

    iput-wide v4, v1, Lx1/a;->w:D

    .line 202
    :cond_2a
    :goto_11
    const-string v0, "deepLinkDomains"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_2c

    .line 203
    const-string v3, "domains"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_2c

    .line 204
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v1, Lx1/a;->f0:Ljava/util/ArrayList;
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_5
    .catchall {:try_start_20 .. :try_end_20} :catchall_2

    const/4 v3, 0x0

    .line 205
    :goto_12
    :try_start_21
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v3, v4, :cond_2c

    .line 206
    iget-object v4, v1, Lx1/a;->f0:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_21
    .catch Lorg/json/JSONException; {:try_start_21 .. :try_end_21} :catch_8
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_5
    .catchall {:try_start_21 .. :try_end_21} :catchall_2

    add-int/lit8 v3, v3, 0x1

    goto :goto_12

    :cond_2b
    move-object/from16 v22, v4

    .line 207
    :catch_8
    :cond_2c
    :try_start_22
    iget-object v0, v1, Lx1/a;->b:Lorg/json/JSONObject;

    const-string v3, "styling"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_34

    .line 208
    invoke-static {v11, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2e

    invoke-static {v11, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2d

    goto :goto_14

    :cond_2d
    :goto_13
    const/4 v5, 0x1

    goto :goto_15

    .line 209
    :cond_2e
    :goto_14
    invoke-static {v10, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2f

    invoke-static {v10, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2f

    goto :goto_13

    .line 210
    :goto_15
    iput-boolean v5, v1, Lx1/a;->g0:Z

    .line 211
    :cond_2f
    invoke-static {v9, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_31

    invoke-static {v9, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_30

    goto :goto_17

    :cond_30
    :goto_16
    const/4 v5, 0x1

    goto :goto_18

    .line 212
    :cond_31
    :goto_17
    invoke-static {v8, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_32

    invoke-static {v8, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_32

    goto :goto_16

    .line 213
    :goto_18
    iput-boolean v5, v1, Lx1/a;->h0:Z

    .line 214
    :cond_32
    const-string v3, "forceViewportWidth"

    const-wide/high16 v4, 0x7ff8000000000000L    # Double.NaN

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v8

    iput-wide v8, v1, Lx1/a;->k0:D

    .line 215
    const-string v3, "showActionBar"

    const/4 v5, 0x1

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->m0:Z

    .line 216
    const-string v3, "androidHideTopNavBarOnScroll"

    const/4 v5, 0x0

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->n0:Z

    .line 217
    const-string v3, "androidHideBottomNavBarOnScroll"

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->o0:Z

    .line 218
    const-string v3, "androidHideNavBarOnScroll"

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_33

    const/4 v5, 0x1

    .line 219
    iput-boolean v5, v1, Lx1/a;->n0:Z

    .line 220
    iput-boolean v5, v1, Lx1/a;->o0:Z

    .line 221
    :cond_33
    const-string v3, "androidTheme"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lx1/a;->l0:Ljava/lang/String;

    .line 222
    :cond_34
    const-string v3, "androidActionBarBackgroundColor"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    .line 223
    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 224
    const-string v3, "androidActionBarBackgroundColorDark"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    .line 225
    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 226
    const-string v3, "androidSidebarBackgroundColor"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    .line 227
    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 228
    const-string v3, "androidSidebarBackgroundColorDark"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    .line 229
    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 230
    const-string v3, "androidSidebarForegroundColor"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    .line 231
    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 232
    const-string v3, "androidSidebarForegroundColorDark"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    .line 233
    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 234
    const-string v3, "androidSidebarHighlightColor"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    .line 235
    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 236
    const-string v3, "androidSidebarHighlightColorDark"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    .line 237
    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 238
    const-string v3, "androidTintColor"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    .line 239
    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 240
    const-string v3, "androidTabBarBackgroundColor"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 241
    const-string v3, "androidTabBarBackgroundColorDark"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 242
    const-string v3, "androidTabBarTextColor"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 243
    const-string v3, "androidTabBarTextColorDark"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 244
    const-string v3, "androidTabBarIndicatorColor"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 245
    const-string v3, "androidTabBarIndicatorColorDark"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 246
    const-string v3, "androidTabPressedBackgroundColor"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 247
    const-string v3, "androidTabPressedBackgroundColorDark"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 248
    const-string v3, "transitionInteractiveDelayMax"

    const-wide/high16 v4, 0x7ff8000000000000L    # Double.NaN

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v3

    iput-wide v3, v1, Lx1/a;->p0:D

    .line 249
    const-string v3, "androidHideTitleInActionBar"

    const/4 v5, 0x0

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 250
    const-string v4, "androidShowLogoInActionBar"

    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->q0:Z

    .line 251
    const-string v3, "androidShowLogoInSideBar"

    const/4 v5, 0x1

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->r0:Z

    .line 252
    const-string v3, "androidShowAppNameInSideBar"

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->s0:Z

    .line 253
    const-string v3, "androidEnableOverlayInStatusBar"

    const/4 v5, 0x0

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->t0:Z

    .line 254
    const-string v3, "androidEnableOverlayInSystemNavBar"

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->u0:Z

    .line 255
    const-string v3, "androidStatusBarStyle"

    invoke-static {v0, v3, v7}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lx1/a;->v0:Ljava/lang/String;

    .line 256
    const-string v3, "androidSystemNavBarStyle"

    invoke-static {v0, v3, v7}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lx1/a;->w0:Ljava/lang/String;

    .line 257
    const-string v3, "androidActionBarForegroundColor"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    .line 258
    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_36

    .line 259
    iget-object v3, v1, Lx1/a;->l0:Ljava/lang/String;

    if-nez v3, :cond_35

    goto :goto_19

    .line 260
    :cond_35
    const-string v4, "light"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 261
    :cond_36
    :goto_19
    const-string v3, "androidActionBarForegroundColorDark"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 262
    const-string v3, "navigationTitleImage"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Lx1/a;->k(Ljava/lang/Object;)V

    .line 263
    const-string v3, "hideWebviewAlpha"

    const-wide/16 v4, 0x0

    invoke-virtual {v0, v3, v4, v5}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v3

    double-to-float v3, v3

    iput v3, v1, Lx1/a;->y0:F

    .line 264
    const-string v3, "androidPullToRefreshColor"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 265
    const-string v3, "androidPullToRefreshColorDark"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 266
    const-string v3, "androidSwipeNavigationBackgroundColor"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 267
    const-string v3, "androidSwipeNavigationBackgroundColorDark"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 268
    const-string v3, "androidSwipeNavigationActiveColor"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 269
    const-string v3, "androidSwipeNavigationActiveColorDark"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 270
    const-string v3, "androidSwipeNavigationInactiveColor"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 271
    const-string v3, "androidSwipeNavigationInactiveColorDark"

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    .line 272
    const-string v3, "disableAnimations"

    const/4 v5, 0x0

    invoke-virtual {v0, v3, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->B0:Z

    .line 273
    const-string v3, "androidWebviewTextZoom"

    const/4 v4, -0x1

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    iput v3, v1, Lx1/a;->C0:I

    .line 274
    const-string v3, "androidDisableOverScrollAnimation"

    iget-boolean v4, v1, Lx1/a;->D0:Z

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, v1, Lx1/a;->D0:Z

    .line 275
    invoke-virtual {v1}, Lx1/a;->v()F

    move-result v3

    iput v3, v1, Lx1/a;->A:F

    const/4 v4, 0x0

    cmpg-float v4, v3, v4

    if-gtz v4, :cond_37

    .line 276
    const-string v4, "androidInitialZoom"

    const-string v5, "initialZoom"

    float-to-double v6, v3

    invoke-virtual {v0, v5, v6, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v5

    invoke-virtual {v0, v4, v5, v6}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v3

    double-to-float v3, v3

    iput v3, v1, Lx1/a;->A:F

    .line 277
    :cond_37
    const-string v3, "splashScreen"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_5
    .catchall {:try_start_22 .. :try_end_22} :catchall_2

    const-string v4, "android"

    if-eqz v3, :cond_38

    .line 278
    :try_start_23
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_38

    .line 279
    new-instance v5, Lz1/f;

    invoke-direct {v5, v3}, Lz1/f;-><init>(Lorg/json/JSONObject;)V

    iput-object v5, v1, Lx1/a;->z0:Lz1/f;

    .line 280
    :cond_38
    iget-object v3, v1, Lx1/a;->z0:Lz1/f;

    if-nez v3, :cond_39

    new-instance v3, Lz1/f;

    invoke-direct {v3}, Lz1/f;-><init>()V

    iput-object v3, v1, Lx1/a;->z0:Lz1/f;

    .line 281
    :cond_39
    iget-object v3, v1, Lx1/a;->z0:Lz1/f;

    invoke-virtual {v3}, Lz1/f;->a()Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_3a

    .line 282
    iget-object v3, v1, Lx1/a;->z0:Lz1/f;

    const-string v5, "androidSplashBackgroundColor"

    invoke-static {v5, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v5}, Lz1/f;->c(Ljava/lang/Integer;)V

    .line 283
    :cond_3a
    iget-object v3, v1, Lx1/a;->z0:Lz1/f;

    invoke-virtual {v3}, Lz1/f;->b()Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_3b

    .line 284
    iget-object v3, v1, Lx1/a;->z0:Lz1/f;

    const-string v5, "androidSplashBackgroundColorDark"

    invoke-static {v5, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v5}, Lz1/f;->d(Ljava/lang/Integer;)V

    .line 285
    :cond_3b
    const-string v3, "loadingSpinner"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_3c

    .line 286
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_3c

    .line 287
    new-instance v4, Lz1/e;

    invoke-direct {v4, v3}, Lz1/e;-><init>(Lorg/json/JSONObject;)V

    iput-object v4, v1, Lx1/a;->A0:Lz1/e;

    .line 288
    :cond_3c
    iget-object v3, v1, Lx1/a;->A0:Lz1/e;

    if-nez v3, :cond_3d

    new-instance v3, Lz1/e;

    invoke-direct {v3}, Lz1/e;-><init>()V

    iput-object v3, v1, Lx1/a;->A0:Lz1/e;

    .line 289
    :cond_3d
    iget-object v3, v1, Lx1/a;->A0:Lz1/e;

    invoke-virtual {v3}, Lz1/e;->a()Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_3e

    .line 290
    iget-object v3, v1, Lx1/a;->A0:Lz1/e;

    const-string v4, "activityIndicator"

    invoke-static {v4, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Lz1/e;->c(Ljava/lang/Integer;)V

    .line 291
    :cond_3e
    iget-object v3, v1, Lx1/a;->A0:Lz1/e;

    invoke-virtual {v3}, Lz1/e;->b()Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_3f

    .line 292
    iget-object v3, v1, Lx1/a;->A0:Lz1/e;

    const-string v4, "activityIndicatorDark"

    invoke-static {v4, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lt2/i;->I(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Lz1/e;->d(Ljava/lang/Integer;)V

    .line 293
    :cond_3f
    iget-object v0, v1, Lx1/a;->b:Lorg/json/JSONObject;

    const-string v3, "script"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_45

    move-object/from16 v3, v18

    .line 294
    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_40

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_41

    :cond_40
    move-object/from16 v3, v19

    goto :goto_1b

    :cond_41
    :goto_1a
    const/4 v5, 0x1

    goto :goto_1c

    .line 295
    :goto_1b
    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_42

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_42

    goto :goto_1a

    .line 296
    :goto_1c
    iput-boolean v5, v1, Lx1/a;->i0:Z

    :cond_42
    move-object/from16 v3, v17

    .line 297
    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_43

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_44

    :cond_43
    move-object/from16 v3, v16

    goto :goto_1e

    :cond_44
    :goto_1d
    const/4 v5, 0x1

    goto :goto_1f

    .line 298
    :goto_1e
    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_45

    invoke-static {v3, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_45

    goto :goto_1d

    .line 299
    :goto_1f
    iput-boolean v5, v1, Lx1/a;->j0:Z

    .line 300
    :cond_45
    iget-object v0, v1, Lx1/a;->b:Lorg/json/JSONObject;

    const-string v3, "permissions"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_46

    .line 301
    new-instance v3, Lz1/d;

    invoke-direct {v3, v0}, Lz1/d;-><init>(Lorg/json/JSONObject;)V

    goto :goto_20

    .line 302
    :cond_46
    new-instance v3, Lz1/d;

    invoke-direct {v3}, Lz1/d;-><init>()V

    :goto_20
    iput-object v3, v1, Lx1/a;->J0:Lz1/d;

    .line 303
    iget-object v0, v1, Lx1/a;->b:Lorg/json/JSONObject;

    const-string v3, "contextMenu"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_47

    .line 304
    new-instance v3, Lz1/b;

    invoke-direct {v3, v0}, Lz1/b;-><init>(Lorg/json/JSONObject;)V

    iput-object v3, v1, Lx1/a;->I0:Lz1/b;

    goto :goto_21

    .line 305
    :cond_47
    new-instance v0, Lz1/b;

    new-instance v3, Lz1/c;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v3, v4}, Lz1/c;-><init>(Ljava/util/List;)V

    const/4 v5, 0x0

    invoke-direct {v0, v5, v3}, Lz1/b;-><init>(ZLz1/c;)V

    iput-object v0, v1, Lx1/a;->I0:Lz1/b;

    .line 306
    :goto_21
    iget-object v0, v1, Lx1/a;->b:Lorg/json/JSONObject;

    const-string v3, "services"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_a2

    .line 307
    const-string v0, "backgroundLocation"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_48

    .line 308
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 309
    const-string v4, "foregroundOnly"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 310
    :cond_48
    const-string v0, "autorefresh"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_49

    const/4 v5, 0x0

    .line 311
    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 312
    invoke-virtual {v0, v13, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 313
    const-string v4, "interval"

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 314
    const-string v4, "url"

    invoke-static {v4, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 315
    :cond_49
    const-string v0, "cordial"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_5
    .catchall {:try_start_23 .. :try_end_23} :catchall_2

    const-string v4, "autoRegister"

    if-eqz v0, :cond_4a

    .line 316
    :try_start_24
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 317
    const-string v5, "accountKey"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 318
    const-string v5, "channelKey"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 319
    const-string v5, "pushNotifications"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_4a

    .line 320
    iget-boolean v5, v1, Lx1/a;->T0:Z

    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v5

    iput-boolean v5, v1, Lx1/a;->T0:Z

    .line 321
    iget-boolean v5, v1, Lx1/a;->U0:Z

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, v1, Lx1/a;->U0:Z

    .line 322
    :cond_4a
    const-string v0, "intercom"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_5
    .catchall {:try_start_24 .. :try_end_24} :catchall_2

    const-string v5, "androidApiKey"

    const-string v6, "appId"

    if-eqz v0, :cond_4b

    const/4 v13, 0x0

    .line 323
    :try_start_25
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 324
    invoke-static {v5, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 325
    invoke-static {v6, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 326
    :cond_4b
    const-string v0, "braze"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_4c

    const/4 v13, 0x0

    .line 327
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 328
    invoke-virtual {v0, v4, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 329
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 330
    const-string v7, "androidEndpointKey"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 331
    const-string v7, "firebaseSenderId"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 332
    const-string v7, "androidNotificationChannelName"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 333
    const-string v7, "androidNotificationDescription"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 334
    :cond_4c
    const-string v0, "analytics"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_4e

    const/4 v13, 0x0

    .line 335
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_4e

    .line 336
    const-string v7, "idsite_test"

    const/high16 v8, -0x80000000

    invoke-virtual {v0, v7, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v7

    .line 337
    const-string v9, "idsite_prod"

    invoke-virtual {v0, v9, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    if-eq v7, v8, :cond_4d

    if-ne v0, v8, :cond_4e

    .line 338
    :cond_4d
    const-string v0, "Analytics requires idsite_test and idsite_prod"

    invoke-static {v14, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 339
    :cond_4e
    const-string v0, "oneSignal"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_5
    .catchall {:try_start_25 .. :try_end_25} :catchall_2

    const-string v7, "tagsJsonUrl"

    const-string v8, "showForegroundNotifications"

    const-string v9, "requiresUserPrivacyConsent"

    const-string v10, "applicationId"

    if-eqz v0, :cond_50

    .line 340
    :try_start_26
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_50

    .line 341
    invoke-static {v10, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_4f

    const/4 v11, 0x1

    goto :goto_22

    :cond_4f
    const/4 v11, 0x0

    .line 342
    :goto_22
    iput-boolean v11, v1, Lx1/a;->K0:Z

    .line 343
    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 344
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    const/4 v11, 0x1

    .line 345
    invoke-virtual {v0, v4, v11}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 346
    invoke-virtual {v0, v8, v11}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 347
    :cond_50
    const-string v0, "oneSignalV5"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_51

    const/4 v13, 0x0

    .line 348
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-object/from16 v11, v22

    .line 349
    invoke-virtual {v0, v10, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    invoke-virtual {v0, v7, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    invoke-virtual {v0, v9, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    const/4 v7, 0x1

    .line 352
    invoke-virtual {v0, v4, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 353
    invoke-virtual {v0, v8, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 354
    const-string v7, "clearNotificationsOnLaunch"

    invoke-virtual {v0, v7, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    goto :goto_23

    :cond_51
    move-object/from16 v11, v22

    .line 355
    :goto_23
    const-string v0, "firebaseMessaging"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_52

    const/4 v13, 0x0

    .line 356
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    const/4 v7, 0x1

    .line 357
    invoke-virtual {v0, v4, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 358
    invoke-virtual {v0, v8, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 359
    :cond_52
    const-string v0, "xtremepushAndroid"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_53

    .line 360
    const-string v0, "xtremepush"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    :cond_53
    if-eqz v0, :cond_54

    .line 361
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_54

    .line 362
    const-string v7, "appKey"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 363
    const-string v7, "googleProjectId"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 364
    :cond_54
    const-string v0, "cleverpush"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_55

    .line 365
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_55

    .line 366
    const-string v7, "channelId"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    const/4 v7, 0x1

    .line 367
    invoke-virtual {v0, v4, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 368
    :cond_55
    const-string v0, "ibmpushAndroid"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_56

    .line 369
    const-string v0, "ibmpush"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    :cond_56
    if-eqz v0, :cond_57

    .line 370
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 371
    :cond_57
    const-string v0, "moxo"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_58

    .line 372
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_58

    .line 373
    const-string v7, "moxoDomain"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 374
    :cond_58
    const-string v0, "facebook"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_5
    .catchall {:try_start_26 .. :try_end_26} :catchall_2

    const-string v7, "displayName"

    if-eqz v0, :cond_59

    .line 375
    :try_start_27
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_59

    .line 376
    invoke-static {v6, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v1, Lx1/a;->L0:Ljava/lang/String;

    .line 377
    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v8

    iput-object v8, v1, Lx1/a;->M0:Ljava/lang/String;

    .line 378
    const-string v8, "autoLogging"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 379
    :cond_59
    const-string v0, "socialLogin"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_5e

    .line 380
    const-string v8, "facebookLogin"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    if-eqz v8, :cond_5d

    .line 381
    invoke-virtual {v8, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_5d

    .line 382
    iget-object v12, v1, Lx1/a;->L0:Ljava/lang/String;

    if-eqz v12, :cond_5a

    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_5b

    .line 383
    :cond_5a
    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    iput-object v12, v1, Lx1/a;->L0:Ljava/lang/String;

    .line 384
    :cond_5b
    iget-object v12, v1, Lx1/a;->M0:Ljava/lang/String;

    if-eqz v12, :cond_5c

    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_5d

    .line 385
    :cond_5c
    invoke-virtual {v8, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v1, Lx1/a;->M0:Ljava/lang/String;

    .line 386
    :cond_5d
    const-string v7, "googleSignIn"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_5e

    .line 387
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5e

    .line 388
    const-string v7, "androidClientID"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 389
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    :cond_5e
    const-string v0, "adjust"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_5f

    const/4 v13, 0x0

    .line 391
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 392
    const-string v7, "appToken"

    invoke-virtual {v0, v7, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    const-string v7, "environment"

    const-string v8, "development"

    invoke-virtual {v0, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7}, Landroidx/fragment/app/u;->g(Ljava/lang/String;)I

    move-result v7

    .line 394
    const-string v8, "autoInit"

    const/4 v12, 0x1

    invoke-virtual {v0, v8, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 395
    invoke-static {v7}, Ls/e;->a(I)V

    .line 396
    :cond_5f
    const-string v0, "appsflyer"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_60

    .line 397
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_60

    .line 398
    const-string v7, "androidDevKey"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_60

    .line 399
    const-string v7, "devKey"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 400
    :cond_60
    const-string v0, "identity"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_64

    .line 401
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_64

    .line 402
    new-instance v7, Ljava/util/LinkedList;

    invoke-direct {v7}, Ljava/util/LinkedList;-><init>()V

    .line 403
    const-string v8, "checkIdentityUrl"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_61

    .line 404
    instance-of v12, v8, Ljava/lang/String;

    if-eqz v12, :cond_61

    .line 405
    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v8

    .line 406
    invoke-virtual {v7, v8}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    goto :goto_25

    :cond_61
    if-eqz v8, :cond_63

    .line 407
    instance-of v12, v8, Lorg/json/JSONArray;

    if-eqz v12, :cond_63

    .line 408
    check-cast v8, Lorg/json/JSONArray;

    const/4 v12, 0x0

    .line 409
    :goto_24
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v13

    if-ge v12, v13, :cond_63

    .line 410
    invoke-virtual {v8, v12}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_62

    .line 411
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v15

    if-nez v15, :cond_62

    .line 412
    invoke-static {v13}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v13

    .line 413
    invoke-virtual {v7, v13}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_62
    add-int/lit8 v12, v12, 0x1

    goto :goto_24

    .line 414
    :cond_63
    :goto_25
    const-string v7, "identityEndpointUrl"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 415
    :cond_64
    const-string v0, "registration"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_65

    .line 416
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_65

    .line 417
    const-string v7, "endpoints"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    iput-object v0, v1, Lx1/a;->N0:Lorg/json/JSONArray;

    .line 418
    :cond_65
    const-string v0, "admob"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_66

    .line 419
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_66

    .line 420
    const-string v7, "admobAndroid"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_66

    .line 421
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_66

    .line 422
    invoke-static {v10, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_66

    .line 423
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_66

    .line 424
    const-string v7, "bannerAdUnitId"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 425
    const-string v7, "interstitialAdUnitId"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 426
    const-string v7, "showBanner"

    const/4 v12, 0x1

    invoke-virtual {v0, v7, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 427
    const-string v7, "autoConsentPrompt"

    iget-boolean v8, v1, Lx1/a;->P0:Z

    invoke-virtual {v0, v7, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, v1, Lx1/a;->P0:Z

    .line 428
    :cond_66
    const-string v0, "cardIO"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_67

    .line 429
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 430
    :cond_67
    const-string v0, "auth"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_6a

    .line 431
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_27} :catch_5
    .catchall {:try_start_27 .. :try_end_27} :catchall_2

    if-eqz v7, :cond_6a

    .line 432
    :try_start_28
    const-string v7, "allowedUrls"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 433
    instance-of v7, v0, Ljava/lang/String;

    if-eqz v7, :cond_68

    .line 434
    iget-object v7, v1, Lx1/a;->S0:Ljava/util/ArrayList;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_28

    :catch_9
    move-exception v0

    goto :goto_27

    .line 435
    :cond_68
    instance-of v7, v0, Lorg/json/JSONArray;

    if-eqz v7, :cond_6a

    .line 436
    check-cast v0, Lorg/json/JSONArray;

    const/4 v7, 0x0

    .line 437
    :goto_26
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v8

    if-ge v7, v8, :cond_6a

    .line 438
    invoke-virtual {v0, v7}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_69

    .line 439
    iget-object v10, v1, Lx1/a;->S0:Ljava/util/ArrayList;

    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v8

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_28
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_28 .. :try_end_28} :catch_9
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_28} :catch_5
    .catchall {:try_start_28 .. :try_end_28} :catchall_2

    :cond_69
    add-int/lit8 v7, v7, 0x1

    goto :goto_26

    .line 440
    :goto_27
    :try_start_29
    const-string v7, "AppConfig: Auth authAllowedUrls pattern error."

    invoke-static {v14, v7, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 441
    :cond_6a
    :goto_28
    const-string v0, "chromecast"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_6b

    .line 442
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_6b

    const/4 v7, 0x1

    .line 443
    iput-boolean v7, v1, Lx1/a;->Q0:Z

    .line 444
    const-string v7, "receiverAppId"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 445
    :cond_6b
    iget-boolean v7, v1, Lx1/a;->Q0:Z

    if-eqz v7, :cond_6f

    .line 446
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, v1, Lx1/a;->R0:Ljava/util/ArrayList;

    .line 447
    const-string v8, "showCastButtonRegex"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 448
    instance-of v8, v0, Ljava/lang/String;

    if-eqz v8, :cond_6c

    .line 449
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 450
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2b

    .line 451
    :cond_6c
    instance-of v8, v0, Lorg/json/JSONArray;

    if-eqz v8, :cond_6e

    .line 452
    check-cast v0, Lorg/json/JSONArray;

    const/4 v7, 0x0

    .line 453
    :goto_29
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v8

    if-ge v7, v8, :cond_6f

    .line 454
    invoke-virtual {v0, v7}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_6d

    goto :goto_2a

    .line 455
    :cond_6d
    iget-object v10, v1, Lx1/a;->R0:Ljava/util/ArrayList;

    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v8

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2a
    add-int/lit8 v7, v7, 0x1

    goto :goto_29

    .line 456
    :cond_6e
    const-string v0, ".*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 457
    :cond_6f
    :goto_2b
    const-string v0, "documentScanner"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_70

    .line 458
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_70

    .line 459
    const-string v7, "androidAnylineLicenseKey"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_70

    .line 460
    const-string v7, "anylineLicenseKey"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 461
    :cond_70
    const-string v0, "scandit"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_71

    .line 462
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_71

    .line 463
    const-string v7, "androidLicenseKey"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_71

    .line 464
    const-string v7, "licenseKey"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 465
    :cond_71
    const-string v0, "barcode"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_72

    .line 466
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_72

    .line 467
    const-string v7, "prompt"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 468
    :cond_72
    const-string v0, "iap"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_73

    .line 469
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_73

    .line 470
    const-string v7, "googleIAP"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_73

    .line 471
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 472
    const-string v7, "productsUrl"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 473
    :cond_73
    const-string v0, "couples"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_74

    .line 474
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_74

    .line 475
    const-string v7, "androidLicenseKey"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_74

    .line 476
    const-string v7, "licenseKey"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 477
    :cond_74
    const-string v0, "episerver"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_75

    .line 478
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_75

    .line 479
    const-string v7, "androidAuthToken"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_75

    .line 480
    const-string v7, "authToken"

    invoke-static {v7, v0}, Lx1/a;->x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 481
    :cond_75
    const-string v0, "rootDetect"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_76

    .line 482
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 483
    :cond_76
    const-string v0, "twilio"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_77

    .line 484
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 485
    :cond_77
    const-string v0, "beacon"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_78

    .line 486
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_78

    .line 487
    const-string v7, "beaconsJsonUrl"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 488
    const-string v7, "updateFrequency"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 489
    :cond_78
    const-string v0, "salesforceCloud"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_79

    const/4 v13, 0x0

    .line 490
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 491
    const-string v7, "appID"

    invoke-virtual {v0, v7, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    const-string v7, "accessToken"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    const-string v7, "appEndpoint"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    const-string v7, "mid"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v13, 0x0

    .line 495
    invoke-virtual {v0, v9, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 496
    const-string v7, "delayRegistrationUntilContactKeyIsSet"

    invoke-virtual {v0, v7, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 497
    :cond_79
    const-string v0, "kaltura"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_7a

    .line 498
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7a

    .line 499
    const-string v7, "partnerId"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 500
    const-string v7, "castReceiverAppId"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 501
    const-string v7, "serverUrl"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 502
    :cond_7a
    const-string v0, "localSettings"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_7b

    .line 503
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7b

    .line 504
    const-string v7, "androidBackup"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 505
    :cond_7b
    const-string v0, "firebaseAnalytics"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_7c

    .line 506
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 507
    :cond_7c
    const-string v0, "opentok"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_7d

    .line 508
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    :cond_7d
    if-eqz v0, :cond_7e

    .line 509
    const-string v7, "blockOtherCalls"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 510
    :cond_7e
    const-string v0, "enterprisePlugin"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_81

    .line 511
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_81

    .line 512
    const-string v7, "blockCopyPaste"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    if-eqz v7, :cond_7f

    const/4 v13, 0x0

    .line 513
    invoke-virtual {v7, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 514
    :cond_7f
    const-string v7, "blockScreenCapture"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    if-eqz v7, :cond_80

    const/4 v13, 0x0

    .line 515
    invoke-virtual {v7, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 516
    :cond_80
    const-string v7, "maskBackgroundedAppImage"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_81

    const/4 v13, 0x0

    .line 517
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 518
    :cond_81
    const-string v0, "nfc"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_82

    .line 519
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 520
    :cond_82
    const-string v0, "plaid"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_83

    .line 521
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 522
    :cond_83
    const-string v0, "geckoView"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_84

    .line 523
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_84

    const/4 v7, 0x1

    .line 524
    iput-boolean v7, v1, Lx1/a;->l1:Z

    .line 525
    :cond_84
    const-string v0, "moengage"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_85

    .line 526
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_85

    const/4 v7, 0x1

    .line 527
    invoke-virtual {v0, v4, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 528
    invoke-virtual {v0, v6, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 529
    const-string v7, "dataCenter"

    const/4 v13, 0x0

    invoke-virtual {v0, v7, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 530
    :cond_85
    const-string v0, "auth0"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_86

    .line 531
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_86

    .line 532
    const-string v7, "clientId"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 533
    const-string v7, "domain"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 534
    const-string v7, "scheme"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 535
    const-string v7, "audience"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 536
    :cond_86
    const-string v0, "sendbird"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_87

    .line 537
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_87

    .line 538
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 539
    iget-boolean v7, v1, Lx1/a;->m1:Z

    invoke-virtual {v0, v4, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, v1, Lx1/a;->m1:Z

    .line 540
    :cond_87
    const-string v0, "firebaseCrashlytics"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_88

    const/4 v7, 0x1

    .line 541
    invoke-virtual {v0, v2, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v8

    if-eqz v8, :cond_88

    .line 542
    const-string v7, "webviewErrorsEnabled"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 543
    const-string v7, "toastErrorsEnabled"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 544
    const-string v7, "requestOptIn"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 545
    :cond_88
    const-string v0, "msdynamics"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_89

    .line 546
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_89

    .line 547
    const-string v7, "organizationId"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 548
    const-string v7, "publicEndpoint"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 549
    const-string v7, "mobileAppId"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 550
    const-string v7, "apiAccessToken"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 551
    :cond_89
    const-string v0, "revenueCat"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_8a

    .line 552
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 553
    :cond_8a
    const-string v0, "iterable"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_29} :catch_5
    .catchall {:try_start_29 .. :try_end_29} :catchall_2

    const-string v7, "apiKey"

    if-eqz v0, :cond_8b

    .line 554
    :try_start_2a
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_8b

    .line 555
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 556
    iget-boolean v8, v1, Lx1/a;->n1:Z

    invoke-virtual {v0, v4, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v8

    iput-boolean v8, v1, Lx1/a;->n1:Z

    .line 557
    const-string v8, "dataRegion"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 558
    :cond_8b
    const-string v0, "branch"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_8c

    .line 559
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_8c

    .line 560
    const-string v8, "liveKey"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 561
    const-string v8, "testKey"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 562
    const-string v8, "enableTestMode"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 563
    :cond_8c
    const-string v0, "zoom"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_8d

    .line 564
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 565
    :cond_8d
    const-string v0, "webScreenshot"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_8e

    .line 566
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 567
    :cond_8e
    const-string v0, "socialShare"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_92

    const/4 v13, 0x0

    .line 568
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 569
    const-string v8, "snapchat"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    if-eqz v8, :cond_8f

    .line 570
    invoke-virtual {v8, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    :cond_8f
    if-eqz v8, :cond_90

    .line 571
    const-string v9, "clientId"

    invoke-virtual {v8, v9, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 572
    :cond_90
    const-string v8, "instagram"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_91

    const/4 v13, 0x0

    .line 573
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    :cond_91
    if-eqz v0, :cond_92

    .line 574
    invoke-virtual {v0, v6, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 575
    :cond_92
    const-string v0, "ortto"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_93

    const/4 v13, 0x0

    .line 576
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 577
    const-string v6, "androidAppKey"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    const-string v6, "androidApiEndpoint"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v12, 0x1

    .line 579
    invoke-virtual {v0, v4, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 580
    :cond_93
    const-string v0, "klaviyo"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_94

    const/4 v13, 0x0

    .line 581
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 582
    invoke-virtual {v0, v7, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v12, 0x1

    .line 583
    invoke-virtual {v0, v4, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 584
    :cond_94
    const-string v0, "bloomreach"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_95

    const/4 v13, 0x0

    .line 585
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 586
    invoke-virtual {v0, v7, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 587
    const-string v6, "projectToken"

    invoke-virtual {v0, v6, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    const-string v6, "baseURL"

    invoke-virtual {v0, v6, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v12, 0x1

    .line 589
    invoke-virtual {v0, v4, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 590
    :cond_95
    const-string v0, "healthBridge"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_96

    .line 591
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 592
    :cond_96
    const-string v0, "saferpay"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_97

    .line 593
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 594
    :cond_97
    const-string v0, "alarms"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_98

    .line 595
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 596
    :cond_98
    const-string v0, "masterlock"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_99

    .line 597
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 598
    :cond_99
    const-string v0, "intentedge"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_9a

    const/4 v13, 0x0

    .line 599
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 600
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v5, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    :cond_9a
    const-string v0, "grow"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_9b

    const/4 v13, 0x0

    .line 602
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 603
    invoke-virtual {v0, v7, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 604
    const-string v4, "analyticsEnabled"

    invoke-virtual {v0, v4, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 605
    const-string v4, "notificationChannelName"

    const-string v5, "Median Grow Plugin"

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    const-string v4, "environment"

    const-string v5, "development"

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Landroidx/fragment/app/u;->h(Ljava/lang/String;)I

    move-result v4

    .line 607
    const-string v5, "enableLogging"

    const/4 v13, 0x0

    invoke-virtual {v0, v5, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 608
    invoke-static {v4}, Ls/e;->a(I)V

    .line 609
    :cond_9b
    const-string v0, "passkey"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_9c

    const/4 v13, 0x0

    .line 610
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 611
    const-string v4, "allowedUrls"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_9c

    .line 612
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v6, 0x0

    :goto_2c
    if-ge v6, v4, :cond_9c

    invoke-virtual {v0, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_2c

    .line 613
    :cond_9c
    const-string v0, "ageSafety"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_9d

    .line 614
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 615
    :cond_9d
    const-string v0, "clerk"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_9e

    const/4 v13, 0x0

    .line 616
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 617
    const-string v4, "publishableKey"

    invoke-virtual {v0, v4, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    :cond_9e
    const-string v0, "backgroundAudio"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_9f

    .line 619
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 620
    :cond_9f
    const-string v0, "jwplayer"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_a0

    .line 621
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 622
    const-string v4, "licenseKeyAndroid"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    :cond_a0
    const-string v0, "customerio"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_a3

    .line 624
    const-string v3, "androidCdpApiKey"

    const-string v4, "cdpApiKey"

    const/4 v13, 0x0

    .line 625
    invoke-virtual {v0, v2, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_a1

    .line 626
    invoke-virtual {v0, v4, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 627
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 628
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    .line 629
    :cond_a1
    invoke-virtual {v0, v4, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 630
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    const-string v2, "region"

    const-string v3, "US"

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2a
    .catch Ljava/lang/Exception; {:try_start_2a .. :try_end_2a} :catch_5
    .catchall {:try_start_2a .. :try_end_2a} :catchall_2

    .line 632
    :try_start_2b
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Landroidx/fragment/app/u;->f(Ljava/lang/String;)I

    move-result v2
    :try_end_2b
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2b .. :try_end_2b} :catch_a
    .catch Ljava/lang/Exception; {:try_start_2b .. :try_end_2b} :catch_5
    .catchall {:try_start_2b .. :try_end_2b} :catchall_2

    goto :goto_2d

    :catch_a
    const/4 v2, 0x1

    .line 633
    :goto_2d
    :try_start_2c
    const-string v3, "logLevel"

    const-string v4, "none"

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2c
    .catch Ljava/lang/Exception; {:try_start_2c .. :try_end_2c} :catch_5
    .catchall {:try_start_2c .. :try_end_2c} :catchall_2

    .line 634
    :try_start_2d
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, Landroidx/fragment/app/u;->e(Ljava/lang/String;)I

    move-result v3
    :try_end_2d
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2d .. :try_end_2d} :catch_b
    .catch Ljava/lang/Exception; {:try_start_2d .. :try_end_2d} :catch_5
    .catchall {:try_start_2d .. :try_end_2d} :catchall_2

    goto :goto_2e

    :catch_b
    const/4 v3, 0x1

    .line 635
    :goto_2e
    :try_start_2e
    const-string v4, "migrationSiteId"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 636
    invoke-static {v2}, Ls/e;->a(I)V

    invoke-static {v3}, Ls/e;->a(I)V

    goto :goto_2f

    :cond_a2
    move-object/from16 v11, v22

    .line 637
    :cond_a3
    :goto_2f
    iget-object v0, v1, Lx1/a;->b:Lorg/json/JSONObject;

    const-string v2, "performance"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_a4

    .line 638
    const-string v2, "webviewPools"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v1, v0}, Lx1/a;->q(Lorg/json/JSONArray;)V

    .line 639
    :cond_a4
    iget-object v0, v1, Lx1/a;->b:Lorg/json/JSONObject;

    const-string v2, "allowZoom"

    const/4 v5, 0x1

    invoke-virtual {v0, v2, v5}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, v1, Lx1/a;->V0:Z

    .line 640
    const-string v0, "splashpage.json"

    invoke-virtual {v1, v0}, Lx1/a;->n(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_a5

    .line 641
    const-string v2, "splashPageUrl"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a5

    .line 642
    const-string v2, "splashPageUrl"

    invoke-virtual {v0, v2, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lx1/a;->Y0:Ljava/lang/String;

    .line 643
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v1, Lx1/a;->V:Ljava/util/HashMap;

    .line 644
    const-string v3, "*"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 645
    :cond_a5
    iget-object v0, v1, Lx1/a;->b:Lorg/json/JSONObject;

    const-string v2, "security"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_a6

    .line 646
    const-string v2, "network"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_a6

    .line 647
    const-string v2, "androidConfigXML"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 648
    :cond_a6
    iget-object v0, v1, Lx1/a;->b:Lorg/json/JSONObject;

    const-string v2, "developmentTools"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_a7

    .line 649
    const-string v2, "enableWebConsoleLogs"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a7

    const/4 v5, 0x1

    .line 650
    iput-boolean v5, v1, Lx1/a;->k1:Z
    :try_end_2e
    .catch Ljava/lang/Exception; {:try_start_2e .. :try_end_2e} :catch_5
    .catchall {:try_start_2e .. :try_end_2e} :catchall_2

    .line 651
    :cond_a7
    invoke-static/range {v21 .. v21}, Lt1/l;->f(Ljava/io/Closeable;)V

    goto :goto_31

    .line 652
    :goto_30
    :try_start_2f
    invoke-static {}, Lx1/f;->a()Lx1/f;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v14, v3, v0}, Lx1/f;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 653
    iput-object v0, v1, Lx1/a;->c:Ljava/lang/Exception;
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_1

    .line 654
    invoke-static {v4}, Lt1/l;->f(Ljava/io/Closeable;)V

    .line 655
    :goto_31
    invoke-virtual {v1}, Lx1/a;->d()V

    return-void

    .line 656
    :goto_32
    invoke-static {v4}, Lt1/l;->f(Ljava/io/Closeable;)V

    .line 657
    throw v0
.end method

.method public static a(Lx1/a;)Ljava/util/HashMap;
    .locals 10

    .line 1
    iget-object v0, p0, Lx1/a;->b:Lorg/json/JSONObject;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/a;->z0:Lz1/f;

    .line 4
    .line 5
    iget-object v2, p0, Lx1/a;->a:Landroid/content/Context;

    .line 6
    .line 7
    new-instance v3, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v4, "platform"

    .line 13
    .line 14
    const-string v5, "android"

    .line 15
    .line 16
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iget-object v4, p0, Lx1/a;->h:Ljava/lang/String;

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    const-string v5, "publicKey"

    .line 24
    .line 25
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const-string v5, "appId"

    .line 33
    .line 34
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    const/4 v6, 0x0

    .line 42
    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-virtual {v5, v7, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    const-string v8, "appVersion"

    .line 51
    .line 52
    iget-object v9, v7, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v3, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    const-string v8, "appVersionCode"

    .line 58
    .line 59
    iget v7, v7, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 60
    .line 61
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {v3, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    .line 67
    .line 68
    :catch_0
    const-string v7, "coreVersion"

    .line 69
    .line 70
    const-string v8, "2.7.41"

    .line 71
    .line 72
    invoke-virtual {v3, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    iget v2, v2, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 80
    .line 81
    and-int/lit8 v2, v2, 0x2

    .line 82
    .line 83
    if-eqz v2, :cond_1

    .line 84
    .line 85
    const/4 v2, 0x1

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    move v2, v6

    .line 88
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    const-string v7, "isDebuggable"

    .line 93
    .line 94
    invoke-virtual {v3, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v5, v4}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    if-nez v2, :cond_2

    .line 102
    .line 103
    const-string v2, "none"

    .line 104
    .line 105
    :cond_2
    const-string v4, "installer"

    .line 106
    .line 107
    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    const-string v4, "language"

    .line 119
    .line 120
    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    const-string v2, "os"

    .line 124
    .line 125
    const-string v4, "Android"

    .line 126
    .line 127
    invoke-virtual {v3, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 131
    .line 132
    const-string v4, "osVersion"

    .line 133
    .line 134
    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    new-instance v2, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 140
    .line 141
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    const-string v4, " "

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    const-string v4, "model"

    .line 159
    .line 160
    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    sget-object v2, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 164
    .line 165
    const-string v4, "hardware"

    .line 166
    .line 167
    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-virtual {v2}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    const-string v4, "timeZone"

    .line 179
    .line 180
    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    iget-object v2, p0, Lx1/a;->d:Ljava/lang/String;

    .line 184
    .line 185
    const-string v4, "initialUrl"

    .line 186
    .line 187
    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    if-eqz v1, :cond_3

    .line 191
    .line 192
    iget-object v2, v1, Lz1/f;->c:Ljava/lang/Integer;

    .line 193
    .line 194
    const-string v4, "splashBackgroundColor"

    .line 195
    .line 196
    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    iget-object v1, v1, Lz1/f;->d:Ljava/lang/Integer;

    .line 200
    .line 201
    const-string v2, "splashBackgroundColorDark"

    .line 202
    .line 203
    invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    :cond_3
    const-string v1, "styling"

    .line 207
    .line 208
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    const-string v2, "androidIcon"

    .line 213
    .line 214
    const/4 v4, 0x0

    .line 215
    invoke-static {v1, v2, v4}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    const-string v7, "appIcon"

    .line 220
    .line 221
    if-eqz v5, :cond_4

    .line 222
    .line 223
    invoke-static {v1, v2, v4}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-virtual {v3, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_4
    const-string v2, "icon"

    .line 232
    .line 233
    invoke-static {v1, v2, v4}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v3, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    :goto_1
    iget-boolean v1, p0, Lx1/a;->K0:Z

    .line 241
    .line 242
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    const-string v2, "oneSignalEnabled"

    .line 247
    .line 248
    invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    iget-boolean p0, p0, Lx1/a;->a1:Z

    .line 252
    .line 253
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    const-string v1, "isLicensed"

    .line 258
    .line 259
    invoke-virtual {v3, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    const-string p0, "services"

    .line 263
    .line 264
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    new-instance v0, Ljava/util/HashMap;

    .line 269
    .line 270
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 271
    .line 272
    .line 273
    if-eqz p0, :cond_6

    .line 274
    .line 275
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    if-eqz v2, :cond_6

    .line 284
    .line 285
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    check-cast v2, Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    if-eqz v4, :cond_5

    .line 296
    .line 297
    const-string v5, "active"

    .line 298
    .line 299
    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    if-eqz v4, :cond_5

    .line 304
    .line 305
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 306
    .line 307
    invoke-virtual {v0, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    goto :goto_2

    .line 311
    :cond_6
    const-string p0, "activeServices"

    .line 312
    .line 313
    invoke-virtual {v3, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    new-instance p0, Ljava/util/HashMap;

    .line 317
    .line 318
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 319
    .line 320
    .line 321
    const-string v0, "io.gonative.android.CardScanner"

    .line 322
    .line 323
    invoke-static {v0}, Lx1/a;->h(Ljava/lang/String;)Z

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    const-string v0, "io.gonative.android.CastManager"

    .line 335
    .line 336
    invoke-static {v0}, Lx1/a;->h(Ljava/lang/String;)Z

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    const-string v0, "io.gonative.android.Authentication"

    .line 348
    .line 349
    invoke-static {v0}, Lx1/a;->h(Ljava/lang/String;)Z

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    const-string v0, "io.gonative.android.ScanditBarcodeScannerActivity"

    .line 361
    .line 362
    invoke-static {v0}, Lx1/a;->h(Ljava/lang/String;)Z

    .line 363
    .line 364
    .line 365
    move-result v1

    .line 366
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    const-string v0, "io.gonative.android.downloadmanager.DownloadsActivity"

    .line 374
    .line 375
    invoke-static {v0}, Lx1/a;->h(Ljava/lang/String;)Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    const-string v0, "io.gonative.android.documentscanner.ScanDocumentActivity"

    .line 387
    .line 388
    invoke-static {v0}, Lx1/a;->h(Ljava/lang/String;)Z

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    const-string v0, "io.gonative.android.SharingUtils"

    .line 400
    .line 401
    invoke-static {v0}, Lx1/a;->h(Ljava/lang/String;)Z

    .line 402
    .line 403
    .line 404
    move-result v1

    .line 405
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    invoke-virtual {p0, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    const-string v0, "gonativeClasses"

    .line 413
    .line 414
    invoke-virtual {v3, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    :try_start_1
    const-string p0, "io.gonative.android.LeanWebView"

    .line 418
    .line 419
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    move-result-object p0

    .line 423
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    move-result-object p0

    .line 427
    if-eqz p0, :cond_7

    .line 428
    .line 429
    const-string v0, "webviewParentClass"

    .line 430
    .line 431
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object p0

    .line 435
    invoke-virtual {v3, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 436
    .line 437
    .line 438
    :catch_1
    :cond_7
    return-object v3
.end method

.method public static b(Lx1/a;Lorg/json/JSONObject;)V
    .locals 4

    .line 1
    const-string v0, "splashPageUrl"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p1, v0, v1}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    const-string v3, "splashPageRegex"

    .line 9
    .line 10
    invoke-static {p1, v3, v1}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 31
    .line 32
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    const-string p1, "splashpage.json"

    .line 42
    .line 43
    invoke-virtual {p0, p1, v1}, Lx1/a;->e(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catch_0
    move-exception p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
.end method

.method public static c(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    instance-of v1, p0, Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast p0, Ljava/lang/String;

    .line 11
    .line 12
    :try_start_0
    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    instance-of v1, p0, Lorg/json/JSONArray;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    check-cast p0, Lorg/json/JSONArray;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-ge v1, v2, :cond_2

    .line 32
    .line 33
    :try_start_1
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    instance-of v3, v2, Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    check-cast v2, Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 48
    .line 49
    .line 50
    :catch_0
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_1
    :cond_2
    return-object v0
.end method

.method public static h(Ljava/lang/String;)Z
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0

    .line 6
    :catch_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public static declared-synchronized u(Landroid/content/Context;)Lx1/a;
    .locals 2

    .line 1
    const-class v0, Lx1/a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lx1/a;->s1:Lx1/a;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lx1/a;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-direct {v1, p0}, Lx1/a;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lx1/a;->s1:Lx1/a;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    sget-object p0, Lx1/a;->s1:Lx1/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-object p0

    .line 26
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw p0
.end method

.method public static x(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, p0, v0}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    return-object p2
.end method


# virtual methods
.method public final A(ZIZZ)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lx1/a;->D:Z

    .line 2
    .line 3
    iput p2, p0, Lx1/a;->E:I

    .line 4
    .line 5
    iput-boolean p3, p0, Lx1/a;->F:Z

    .line 6
    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    :try_start_0
    new-instance p4, Lorg/json/JSONObject;

    .line 10
    .line 11
    invoke-direct {p4}, Lorg/json/JSONObject;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v0, "enabled"

    .line 15
    .line 16
    invoke-virtual {p4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    const-string p1, "numWindows"

    .line 20
    .line 21
    invoke-virtual {p4, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    const-string p1, "autoClose"

    .line 25
    .line 26
    invoke-virtual {p4, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    const-string p1, "maxwindows.json"

    .line 30
    .line 31
    invoke-virtual {p0, p1, p4}, Lx1/a;->e(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final B(Lorg/json/JSONObject;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lx1/a;->m(Lorg/json/JSONObject;)V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    const-string p2, "navlevels.json"

    .line 7
    .line 8
    invoke-virtual {p0, p2, p1}, Lx1/a;->e(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final C(Lorg/json/JSONObject;Z)V
    .locals 2

    .line 1
    const-string v0, "navtitles.json"

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lx1/a;->p(Lorg/json/JSONObject;)V

    .line 6
    .line 7
    .line 8
    if-eqz p2, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0, v0, p1}, Lx1/a;->e(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p1, p0, Lx1/a;->b:Lorg/json/JSONObject;

    .line 15
    .line 16
    const-string v1, "navigation"

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    const-string v1, "navigationTitles"

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0, p1}, Lx1/a;->p(Lorg/json/JSONObject;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p1, 0x0

    .line 35
    invoke-virtual {p0, p1}, Lx1/a;->p(Lorg/json/JSONObject;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    if-eqz p2, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lx1/a;->j(Ljava/lang/String;)Ljava/io/File;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 45
    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method public final D(Lorg/json/JSONArray;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx1/a;->a1:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {p0, p1}, Lx1/a;->l(Lorg/json/JSONArray;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_2
    :goto_0
    iget-object p1, p0, Lx1/a;->b:Lorg/json/JSONObject;

    .line 20
    .line 21
    const-string v0, "navigation"

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_3

    .line 28
    .line 29
    const-string v0, "regexInternalExternal"

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    const-string v0, "rules"

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p0, p1}, Lx1/a;->l(Lorg/json/JSONArray;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_1
    return-void
.end method

.method public final E(Ljava/lang/Object;)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput-boolean p1, p0, Lx1/a;->H:Z

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_1
    instance-of v0, p1, Lorg/json/JSONArray;

    .line 18
    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    const-string v1, "default"

    .line 24
    .line 25
    const-string v2, "loggedIn"

    .line 26
    .line 27
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lx1/a;->O:Ljava/util/ArrayList;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    move v1, v2

    .line 44
    :goto_0
    iget-object v3, p0, Lx1/a;->O:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-ge v1, v3, :cond_3

    .line 51
    .line 52
    iget-object v3, p0, Lx1/a;->O:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Lorg/json/JSONObject;

    .line 59
    .line 60
    const-string v4, "status"

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    invoke-static {v3, v4, v5}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    new-instance v1, Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 78
    .line 79
    .line 80
    iput-object v1, p0, Lx1/a;->G:Ljava/util/HashMap;

    .line 81
    .line 82
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-ge v2, v1, :cond_4

    .line 87
    .line 88
    iget-object v1, p0, Lx1/a;->G:Ljava/util/HashMap;

    .line 89
    .line 90
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    check-cast v3, Ljava/lang/String;

    .line 95
    .line 96
    move-object v4, p1

    .line 97
    check-cast v4, Lorg/json/JSONArray;

    .line 98
    .line 99
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    add-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    :goto_2
    iget-object p1, p0, Lx1/a;->U:Lx1/f;

    .line 106
    .line 107
    invoke-virtual {p1}, Lx1/f;->f()V

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final F(Ljava/lang/Object;ZZ)V
    .locals 3

    .line 1
    const-string v0, "default"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "items"

    .line 9
    .line 10
    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v2, "name"

    .line 14
    .line 15
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 16
    .line 17
    .line 18
    const-string v0, "active"

    .line 19
    .line 20
    invoke-virtual {v1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    new-instance p2, Lorg/json/JSONArray;

    .line 24
    .line 25
    invoke-direct {p2}, Lorg/json/JSONArray;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 29
    .line 30
    .line 31
    new-instance v0, Lorg/json/JSONObject;

    .line 32
    .line 33
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v1, "menus"

    .line 37
    .line 38
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    if-eqz p3, :cond_0

    .line 42
    .line 43
    const-string p2, "sidebarnav.json"

    .line 44
    .line 45
    invoke-virtual {p0, p2, v0}, Lx1/a;->e(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catch_0
    move-exception p2

    .line 50
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 51
    .line 52
    .line 53
    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, Lx1/a;->E(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final G(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, ""

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lx1/a;->m:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    iget-object v1, p0, Lx1/a;->m:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ge v0, v1, :cond_2

    .line 17
    .line 18
    iget-object v1, p0, Lx1/a;->m:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/regex/Pattern;

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, Lx1/a;->n:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Ljava/lang/String;

    .line 43
    .line 44
    return-object p1

    .line 45
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iget-object p1, p0, Lx1/a;->k:Ljava/lang/String;

    .line 49
    .line 50
    return-object p1
.end method

.method public final d()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lx1/a;->a1:Z

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v3, p0, Lx1/a;->Z0:J

    .line 8
    .line 9
    cmp-long v0, v3, v1

    .line 10
    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    iget-wide v5, p0, Lx1/a;->Z0:J

    .line 18
    .line 19
    sub-long/2addr v3, v5

    .line 20
    const-wide/32 v5, 0x1b7740

    .line 21
    .line 22
    .line 23
    cmp-long v0, v3, v5

    .line 24
    .line 25
    if-gez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-boolean v0, p0, Lx1/a;->a1:Z

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-wide v3, p0, Lx1/a;->Z0:J

    .line 33
    .line 34
    cmp-long v0, v3, v1

    .line 35
    .line 36
    if-lez v0, :cond_1

    .line 37
    .line 38
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    iget-wide v2, p0, Lx1/a;->Z0:J

    .line 43
    .line 44
    sub-long/2addr v0, v2

    .line 45
    const-wide/32 v2, 0xea60

    .line 46
    .line 47
    .line 48
    cmp-long v0, v0, v2

    .line 49
    .line 50
    if-gez v0, :cond_1

    .line 51
    .line 52
    :goto_0
    return-void

    .line 53
    :cond_1
    new-instance v0, Lu1/h;

    .line 54
    .line 55
    invoke-direct {v0, p0}, Lu1/h;-><init>(Lx1/a;)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    new-array v1, v1, [Ljava/lang/Void;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final e(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/BufferedWriter;

    .line 2
    .line 3
    new-instance v1, Ljava/io/FileWriter;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lx1/a;->j(Ljava/lang/String;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v1, v2}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {v0, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/Writer;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catch_0
    move-exception p2

    .line 28
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "Error writing to file "

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, "co.median.median_core.AppConfig"

    .line 39
    .line 40
    invoke-virtual {v0, v2, v1, p2}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lx1/a;->j(Ljava/lang/String;)Ljava/io/File;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final f(Lorg/json/JSONArray;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lx1/a;->E0:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ge v0, v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    :try_start_0
    iget-object v2, p0, Lx1/a;->E0:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :catch_0
    move-exception v2

    .line 40
    new-instance v3, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v4, "processGooglePaySafeUrlRegexes: Invalid regex skipped: "

    .line 43
    .line 44
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v3, "co.median.median_core.AppConfig"

    .line 55
    .line 56
    invoke-static {v3, v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 57
    .line 58
    .line 59
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    :goto_2
    return-void
.end method

.method public final g(Lorg/json/JSONObject;)V
    .locals 12

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_4

    .line 4
    .line 5
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lx1/a;->b0:Ljava/util/HashMap;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lx1/a;->d0:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lx1/a;->c0:Ljava/util/ArrayList;

    .line 25
    .line 26
    const-string v0, "active"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_1
    const-string v0, "actions"

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "co.median.median_core.AppConfig"

    .line 43
    .line 44
    const-string v2, "id"

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    move v5, v3

    .line 51
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-ge v5, v6, :cond_3

    .line 56
    .line 57
    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    if-eqz v6, :cond_2

    .line 62
    .line 63
    invoke-static {v6, v2, v4}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    const-string v8, "items"

    .line 68
    .line 69
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    const-string v10, "allowLeftMenu"

    .line 74
    .line 75
    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v7, :cond_2

    .line 80
    .line 81
    if-eqz v9, :cond_2

    .line 82
    .line 83
    new-instance v11, Lorg/json/JSONObject;

    .line 84
    .line 85
    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 86
    .line 87
    .line 88
    :try_start_0
    invoke-virtual {v11, v10, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v11, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 92
    .line 93
    .line 94
    iget-object v6, p0, Lx1/a;->b0:Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-virtual {v6, v7, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :catch_0
    move-exception v6

    .line 101
    const-string v7, "processActions: "

    .line 102
    .line 103
    invoke-static {v1, v7, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 104
    .line 105
    .line 106
    :cond_2
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_3
    const-string v0, "actionSelection"

    .line 110
    .line 111
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-eqz p1, :cond_5

    .line 116
    .line 117
    :goto_2
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-ge v3, v0, :cond_5

    .line 122
    .line 123
    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    const-string v5, "regex"

    .line 130
    .line 131
    invoke-static {v0, v5, v4}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-static {v0, v2, v4}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-eqz v5, :cond_4

    .line 140
    .line 141
    if-eqz v0, :cond_4

    .line 142
    .line 143
    :try_start_1
    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    iget-object v6, p0, Lx1/a;->c0:Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    iget-object v5, p0, Lx1/a;->d0:Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_1 .. :try_end_1} :catch_1

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :catch_1
    move-exception v0

    .line 159
    new-instance v5, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v6, "Problem with actionSelection pattern. "

    .line 162
    .line 163
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/util/regex/PatternSyntaxException;->getMessage()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 178
    .line 179
    .line 180
    :cond_4
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_5
    :goto_4
    return-void
.end method

.method public final i(Lx1/e;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/a;->U:Lx1/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, v0, Lx1/f;->a:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw p1

    .line 16
    :cond_0
    return-void
.end method

.method public final j(Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/a;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "gonative-config"

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 15
    .line 16
    .line 17
    new-instance v1, Ljava/io/File;

    .line 18
    .line 19
    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method public final k(Ljava/lang/Object;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    return-void

    .line 9
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lx1/a;->x0:Ljava/util/ArrayList;

    .line 15
    .line 16
    instance-of v0, p1, Lorg/json/JSONArray;

    .line 17
    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    check-cast p1, Lorg/json/JSONArray;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-ge v0, v1, :cond_3

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    :try_start_0
    iget-object v2, p0, Lx1/a;->x0:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catch_0
    move-exception v1

    .line 46
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    new-instance v3, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    const-string v4, "Problem with navigation title image regex: "

    .line 53
    .line 54
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/util/regex/PatternSyntaxException;->getMessage()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const-string v4, "co.median.median_core.AppConfig"

    .line 69
    .line 70
    invoke-virtual {v2, v4, v3, v1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    :goto_2
    return-void
.end method

.method public final l(Lorg/json/JSONArray;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lx1/a;->T:Lx1/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "internal"

    .line 5
    .line 6
    if-eqz p1, :cond_6

    .line 7
    .line 8
    new-instance v3, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    move v4, v1

    .line 14
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-ge v4, v5, :cond_5

    .line 19
    .line 20
    invoke-virtual {p1, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    if-eqz v5, :cond_4

    .line 25
    .line 26
    const-string v6, "regex"

    .line 27
    .line 28
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_4

    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    invoke-static {v5, v6, v7}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    if-nez v6, :cond_0

    .line 40
    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :cond_0
    const-string v8, "mode"

    .line 44
    .line 45
    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    if-eqz v9, :cond_1

    .line 50
    .line 51
    invoke-static {v5, v8, v7}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_2

    .line 61
    .line 62
    const/4 v7, 0x1

    .line 63
    invoke-virtual {v5, v2, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_3

    .line 68
    .line 69
    :cond_2
    move-object v5, v2

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    const-string v5, "external"

    .line 72
    .line 73
    :goto_1
    new-instance v7, Lx1/l;

    .line 74
    .line 75
    invoke-static {v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-direct {v7, v5, v6}, Lx1/l;-><init>(Ljava/lang/String;Ljava/util/regex/Pattern;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    iput-object v3, v0, Lx1/f;->a:Ljava/util/ArrayList;

    .line 89
    .line 90
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    .line 91
    .line 92
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string v4, "rules"

    .line 96
    .line 97
    invoke-virtual {v3, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 98
    .line 99
    .line 100
    const-string p1, "regexintext.json"

    .line 101
    .line 102
    invoke-virtual {p0, p1, v3}, Lx1/a;->e(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :catch_0
    move-exception p1

    .line 107
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 108
    .line 109
    .line 110
    :cond_6
    :goto_2
    new-instance p1, Lx1/l;

    .line 111
    .line 112
    const-string v3, "https?://([-\\w]+\\.)*median.dev(/.*)?$"

    .line 113
    .line 114
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-direct {p1, v2, v3}, Lx1/l;-><init>(Ljava/lang/String;Ljava/util/regex/Pattern;)V

    .line 119
    .line 120
    .line 121
    iget-object v3, v0, Lx1/f;->a:Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-virtual {v3, v1, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    const-string p1, "splashpage.json"

    .line 127
    .line 128
    invoke-virtual {p0, p1}, Lx1/a;->n(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-eqz p1, :cond_7

    .line 133
    .line 134
    const-string v3, "splashPageRegex"

    .line 135
    .line 136
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-eqz v4, :cond_7

    .line 141
    .line 142
    :try_start_1
    new-instance v4, Lx1/l;

    .line 143
    .line 144
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-direct {v4, v2, p1}, Lx1/l;-><init>(Ljava/lang/String;Ljava/util/regex/Pattern;)V

    .line 153
    .line 154
    .line 155
    iget-object p1, v0, Lx1/f;->a:Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-virtual {p1, v1, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :catch_1
    move-exception p1

    .line 162
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 163
    .line 164
    .line 165
    :cond_7
    :goto_3
    return-void
.end method

.method public final m(Lorg/json/JSONObject;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lx1/a;->Q:Ljava/util/ArrayList;

    .line 3
    .line 4
    iput-object v0, p0, Lx1/a;->P:Ljava/util/ArrayList;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    const-string v2, "active"

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    new-instance v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v2, p0, Lx1/a;->P:Ljava/util/ArrayList;

    .line 23
    .line 24
    new-instance v2, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Lx1/a;->Q:Ljava/util/ArrayList;

    .line 30
    .line 31
    const-string v2, "levels"

    .line 32
    .line 33
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    move v2, v1

    .line 40
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-ge v2, v3, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    const-string v4, "regex"

    .line 53
    .line 54
    invoke-static {v3, v4, v0}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    const-string v5, "level"

    .line 59
    .line 60
    const/4 v6, -0x1

    .line 61
    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v4, :cond_0

    .line 66
    .line 67
    if-eq v3, v6, :cond_0

    .line 68
    .line 69
    iget-object v5, p0, Lx1/a;->P:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    iget-object v4, p0, Lx1/a;->Q:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    iget-object p1, p0, Lx1/a;->U:Lx1/f;

    .line 91
    .line 92
    monitor-enter p1

    .line 93
    :try_start_0
    iget-object v0, p1, Lx1/f;->a:Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    :goto_1
    if-ge v1, v2, :cond_2

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    add-int/lit8 v1, v1, 0x1

    .line 106
    .line 107
    check-cast v3, Lx1/e;

    .line 108
    .line 109
    invoke-virtual {v3}, Lx1/e;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :catchall_0
    move-exception v0

    .line 114
    goto :goto_2

    .line 115
    :cond_2
    monitor-exit p1

    .line 116
    return-void

    .line 117
    :goto_2
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    throw v0
.end method

.method public final n(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Lx1/a;->j(Ljava/lang/String;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    .line 7
    .line 8
    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/io/InputStream;->available()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    new-array v0, v0, [B

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Ljava/io/InputStream;->read([B)I

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 21
    .line 22
    .line 23
    new-instance v2, Ljava/lang/String;

    .line 24
    .line 25
    const-string v3, "UTF-8"

    .line 26
    .line 27
    invoke-direct {v2, v0, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lorg/json/JSONObject;

    .line 31
    .line 32
    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :catch_0
    move-exception v0

    .line 37
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v3, "Error reading "

    .line 42
    .line 43
    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    const-string v4, "co.median.median_core.AppConfig"

    .line 48
    .line 49
    invoke-virtual {v2, v4, v3, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lx1/a;->j(Ljava/lang/String;)Ljava/io/File;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 57
    .line 58
    .line 59
    :catch_1
    return-object v1
.end method

.method public final o(Lorg/json/JSONArray;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lx1/a;->m:Ljava/util/ArrayList;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lx1/a;->n:Ljava/util/ArrayList;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-ge v0, v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    const-string v2, "regex"

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-static {v1, v2, v3}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const-string v4, "userAgent"

    .line 47
    .line 48
    invoke-static {v1, v4, v3}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    :try_start_0
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iget-object v3, p0, Lx1/a;->m:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, Lx1/a;->n:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    iput-boolean v1, p0, Lx1/a;->W0:Z
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :catch_0
    move-exception v1

    .line 75
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const-string v3, "co.median.median_core.AppConfig"

    .line 80
    .line 81
    const-string v4, "Syntax error with user agent regex"

    .line 82
    .line 83
    invoke-virtual {v2, v3, v4, v1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 84
    .line 85
    .line 86
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    :goto_2
    return-void
.end method

.method public final p(Lorg/json/JSONObject;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lx1/a;->R:Ljava/util/ArrayList;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz p1, :cond_3

    .line 6
    .line 7
    const-string v2, "active"

    .line 8
    .line 9
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v2, p0, Lx1/a;->R:Ljava/util/ArrayList;

    .line 21
    .line 22
    const-string v2, "titles"

    .line 23
    .line 24
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    move v2, v1

    .line 31
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-ge v2, v3, :cond_3

    .line 36
    .line 37
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    if-nez v3, :cond_0

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_0
    const-string v4, "regex"

    .line 45
    .line 46
    invoke-static {v3, v4, v0}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-nez v4, :cond_1

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_1
    :try_start_0
    new-instance v5, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const-string v6, "regex"

    .line 63
    .line 64
    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    const-string v4, "title"

    .line 68
    .line 69
    invoke-static {v3, v4, v0}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const-string v6, "showImage"

    .line 74
    .line 75
    invoke-virtual {v3, v6, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v4, :cond_2

    .line 80
    .line 81
    const-string v6, "title"

    .line 82
    .line 83
    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catch_0
    move-exception v3

    .line 88
    goto :goto_2

    .line 89
    :cond_2
    :goto_1
    const-string v4, "showImage"

    .line 90
    .line 91
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v5, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    iget-object v3, p0, Lx1/a;->R:Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :goto_2
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual {v3}, Ljava/util/regex/PatternSyntaxException;->getMessage()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    const-string v6, "co.median.median_core.AppConfig"

    .line 113
    .line 114
    invoke-virtual {v4, v6, v5, v3}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 115
    .line 116
    .line 117
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_3
    iget-object p1, p0, Lx1/a;->U:Lx1/f;

    .line 121
    .line 122
    monitor-enter p1

    .line 123
    :try_start_1
    iget-object v0, p1, Lx1/f;->a:Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    :goto_4
    if-ge v1, v2, :cond_4

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    add-int/lit8 v1, v1, 0x1

    .line 136
    .line 137
    check-cast v3, Lx1/e;

    .line 138
    .line 139
    invoke-virtual {v3}, Lx1/e;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 140
    .line 141
    .line 142
    goto :goto_4

    .line 143
    :catchall_0
    move-exception v0

    .line 144
    goto :goto_5

    .line 145
    :cond_4
    monitor-exit p1

    .line 146
    return-void

    .line 147
    :goto_5
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 148
    throw v0
.end method

.method public final q(Lorg/json/JSONArray;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iput-object p1, p0, Lx1/a;->O0:Lorg/json/JSONArray;

    .line 5
    .line 6
    iget-object p1, p0, Lx1/a;->U:Lx1/f;

    .line 7
    .line 8
    monitor-enter p1

    .line 9
    :try_start_0
    iget-object v0, p1, Lx1/f;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    check-cast v3, Lx1/e;

    .line 25
    .line 26
    invoke-virtual {v3}, Lx1/e;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    monitor-exit p1

    .line 33
    return-void

    .line 34
    :goto_1
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw v0
.end method

.method public final r(Lorg/json/JSONObject;)V
    .locals 10

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_6

    .line 4
    .line 5
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lx1/a;->G:Ljava/util/HashMap;

    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lx1/a;->N:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lx1/a;->O:Ljava/util/ArrayList;

    .line 25
    .line 26
    const-string v0, "menuIcon"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, Lx1/a;->K:Ljava/lang/String;

    .line 33
    .line 34
    const-string v0, "menus"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v1, 0x0

    .line 41
    const/4 v2, 0x1

    .line 42
    const/4 v3, 0x0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    move v4, v3

    .line 46
    move v5, v4

    .line 47
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-ge v4, v6, :cond_4

    .line 52
    .line 53
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    if-eqz v6, :cond_2

    .line 58
    .line 59
    const-string v7, "active"

    .line 60
    .line 61
    invoke-virtual {v6, v7, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-nez v7, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 69
    .line 70
    const-string v7, "name"

    .line 71
    .line 72
    invoke-static {v6, v7, v1}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    const-string v8, "items"

    .line 77
    .line 78
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    if-eqz v7, :cond_2

    .line 83
    .line 84
    if-eqz v6, :cond_2

    .line 85
    .line 86
    iget-object v8, p0, Lx1/a;->G:Ljava/util/HashMap;

    .line 87
    .line 88
    invoke-virtual {v8, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    const-string v6, "default"

    .line 92
    .line 93
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-eqz v6, :cond_2

    .line 98
    .line 99
    iput-boolean v2, p0, Lx1/a;->H:Z

    .line 100
    .line 101
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    move v5, v3

    .line 105
    :cond_4
    iget-object v0, p0, Lx1/a;->U:Lx1/f;

    .line 106
    .line 107
    invoke-virtual {v0}, Lx1/f;->f()V

    .line 108
    .line 109
    .line 110
    const-string v0, "userIdRegex"

    .line 111
    .line 112
    invoke-static {p1, v0, v1}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iput-object v0, p0, Lx1/a;->L:Ljava/lang/String;

    .line 117
    .line 118
    const-string v0, "menuSelectionConfig"

    .line 119
    .line 120
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    const-string v4, "regex"

    .line 125
    .line 126
    if-gt v5, v2, :cond_5

    .line 127
    .line 128
    iget-boolean v5, p0, Lx1/a;->G0:Z

    .line 129
    .line 130
    if-eqz v5, :cond_7

    .line 131
    .line 132
    :cond_5
    if-eqz v0, :cond_7

    .line 133
    .line 134
    const-string v5, "testURL"

    .line 135
    .line 136
    invoke-static {v0, v5, v1}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    iput-object v5, p0, Lx1/a;->M:Ljava/lang/String;

    .line 141
    .line 142
    const-string v5, "redirectLocations"

    .line 143
    .line 144
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_7

    .line 149
    .line 150
    move v5, v3

    .line 151
    :goto_2
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    if-ge v5, v6, :cond_7

    .line 156
    .line 157
    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    if-eqz v6, :cond_6

    .line 162
    .line 163
    invoke-static {v6, v4, v1}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    if-eqz v7, :cond_6

    .line 168
    .line 169
    iget-object v8, p0, Lx1/a;->N:Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    iget-object v7, p0, Lx1/a;->O:Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    .line 187
    .line 188
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 189
    .line 190
    .line 191
    iput-object v0, p0, Lx1/a;->I:Ljava/util/ArrayList;

    .line 192
    .line 193
    new-instance v0, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 196
    .line 197
    .line 198
    iput-object v0, p0, Lx1/a;->J:Ljava/util/ArrayList;

    .line 199
    .line 200
    const-string v0, "sidebarEnabledRegex"

    .line 201
    .line 202
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    if-eqz p1, :cond_d

    .line 207
    .line 208
    instance-of v0, p1, Ljava/lang/String;

    .line 209
    .line 210
    const-string v5, "co.median.median_core.AppConfig"

    .line 211
    .line 212
    if-eqz v0, :cond_8

    .line 213
    .line 214
    :try_start_0
    iget-object v0, p0, Lx1/a;->I:Ljava/util/ArrayList;

    .line 215
    .line 216
    check-cast p1, Ljava/lang/String;

    .line 217
    .line 218
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    iget-object p1, p0, Lx1/a;->J:Ljava/util/ArrayList;

    .line 226
    .line 227
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 228
    .line 229
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :catch_0
    move-exception p1

    .line 234
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    const-string v1, "Invalid regex for sidebarEnabledRegex"

    .line 239
    .line 240
    invoke-virtual {v0, v5, v1, p1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 241
    .line 242
    .line 243
    goto :goto_6

    .line 244
    :cond_8
    instance-of v0, p1, Lorg/json/JSONArray;

    .line 245
    .line 246
    if-eqz v0, :cond_d

    .line 247
    .line 248
    check-cast p1, Lorg/json/JSONArray;

    .line 249
    .line 250
    :goto_3
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-ge v3, v0, :cond_d

    .line 255
    .line 256
    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    if-nez v0, :cond_9

    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_9
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 264
    .line 265
    instance-of v7, v0, Ljava/lang/String;

    .line 266
    .line 267
    if-eqz v7, :cond_a

    .line 268
    .line 269
    check-cast v0, Ljava/lang/String;

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_a
    instance-of v7, v0, Lorg/json/JSONObject;

    .line 273
    .line 274
    if-eqz v7, :cond_b

    .line 275
    .line 276
    check-cast v0, Lorg/json/JSONObject;

    .line 277
    .line 278
    invoke-static {v0, v4, v1}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    const-string v7, "value"

    .line 283
    .line 284
    invoke-virtual {v0, v7, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    move-object v9, v6

    .line 293
    move-object v6, v0

    .line 294
    move-object v0, v9

    .line 295
    goto :goto_4

    .line 296
    :cond_b
    move-object v0, v1

    .line 297
    :goto_4
    if-nez v0, :cond_c

    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_c
    :try_start_1
    iget-object v7, p0, Lx1/a;->I:Ljava/util/ArrayList;

    .line 301
    .line 302
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    iget-object v0, p0, Lx1/a;->J:Ljava/util/ArrayList;

    .line 310
    .line 311
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_1 .. :try_end_1} :catch_1

    .line 312
    .line 313
    .line 314
    goto :goto_5

    .line 315
    :catch_1
    move-exception v0

    .line 316
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    const-string v7, "Invalid regex in sidebarEnabledRegex"

    .line 321
    .line 322
    invoke-virtual {v6, v5, v7, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 323
    .line 324
    .line 325
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 326
    .line 327
    goto :goto_3

    .line 328
    :cond_d
    :goto_6
    return-void
.end method

.method public final s(Lorg/json/JSONObject;)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lx1/a;->Y:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lx1/a;->a0:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lx1/a;->Z:Ljava/util/ArrayList;

    .line 24
    .line 25
    const-string v0, "active"

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    :goto_0
    return-void

    .line 34
    :cond_1
    const-string v0, "tabMenus"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "id"

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    const/4 v3, 0x0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    move v4, v2

    .line 47
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-ge v4, v5, :cond_3

    .line 52
    .line 53
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    if-eqz v5, :cond_2

    .line 58
    .line 59
    invoke-static {v5, v1, v3}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    const-string v7, "items"

    .line 64
    .line 65
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    if-eqz v6, :cond_2

    .line 70
    .line 71
    if-eqz v5, :cond_2

    .line 72
    .line 73
    iget-object v7, p0, Lx1/a;->Y:Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-virtual {v7, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    const-string v0, "tabSelectionConfig"

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-eqz p1, :cond_5

    .line 88
    .line 89
    :goto_2
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-ge v2, v0, :cond_5

    .line 94
    .line 95
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    const-string v4, "regex"

    .line 102
    .line 103
    invoke-static {v0, v4, v3}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-static {v0, v1, v3}, Lx1/a;->y(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-eqz v4, :cond_4

    .line 112
    .line 113
    if-eqz v0, :cond_4

    .line 114
    .line 115
    :try_start_0
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    iget-object v5, p0, Lx1/a;->Z:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    iget-object v4, p0, Lx1/a;->a0:Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :catch_0
    move-exception v0

    .line 131
    new-instance v4, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    const-string v5, "Problem with tabSelectionConfig pattern. "

    .line 134
    .line 135
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/util/regex/PatternSyntaxException;->getMessage()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    const-string v4, "co.median.median_core.AppConfig"

    .line 150
    .line 151
    invoke-static {v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 152
    .line 153
    .line 154
    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_5
    iget-object p1, p0, Lx1/a;->U:Lx1/f;

    .line 158
    .line 159
    invoke-virtual {p1}, Lx1/f;->g()V

    .line 160
    .line 161
    .line 162
    return-void
.end method

.method public final t()Ljava/lang/String;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lx1/a;->d1:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-string v0, "splashpage.json"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lx1/a;->n(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, "splashPageUrl"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Lx1/a;->d1:Z

    .line 29
    .line 30
    new-instance v0, Ljava/util/Timer;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lx1/m;

    .line 36
    .line 37
    invoke-direct {v1, p0, v0}, Lx1/m;-><init>(Lx1/a;Ljava/util/Timer;)V

    .line 38
    .line 39
    .line 40
    const-wide/16 v2, 0x7d0

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 43
    .line 44
    .line 45
    :cond_1
    iget-object v0, p0, Lx1/a;->d:Ljava/lang/String;

    .line 46
    .line 47
    return-object v0
.end method

.method public final v()F
    .locals 4

    .line 1
    const-string v0, "webview-zoom.json"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lx1/a;->n(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lx1/a;->A:F

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    float-to-double v1, v1

    .line 13
    const-string v3, "initialZoom"

    .line 14
    .line 15
    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    double-to-float v0, v0

    .line 20
    return v0
.end method

.method public final w()Lorg/json/JSONObject;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/a;->G:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :catch_0
    const/4 v0, 0x0

    .line 10
    return-object v0
.end method

.method public final z(Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string v0, "://"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const-string v0, "http://"

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :cond_1
    iput-object p1, p0, Lx1/a;->d:Ljava/lang/String;

    .line 23
    .line 24
    const-string p1, "splashpage.json"

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lx1/a;->n(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const-string v0, "splashPageUrl"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :goto_0
    iget-boolean v0, p0, Lx1/a;->d1:Z

    .line 41
    .line 42
    const-string v1, "initialUrl"

    .line 43
    .line 44
    if-nez v0, :cond_5

    .line 45
    .line 46
    iget-object v0, p0, Lx1/a;->V:Ljava/util/HashMap;

    .line 47
    .line 48
    if-eqz v0, :cond_5

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_5

    .line 61
    .line 62
    iget-object v0, p0, Lx1/a;->V:Ljava/util/HashMap;

    .line 63
    .line 64
    const-string v2, "*"

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->clearQuery()Landroid/net/Uri$Builder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eqz v4, :cond_4

    .line 102
    .line 103
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    check-cast v4, Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-nez v5, :cond_3

    .line 114
    .line 115
    invoke-virtual {p1, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-virtual {v0, v4, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    iget-object p1, p0, Lx1/a;->d:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v0, v1, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    iget-object v0, p0, Lx1/a;->V:Ljava/util/HashMap;

    .line 137
    .line 138
    invoke-virtual {v0, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    invoke-static {p1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    new-instance v0, Lx1/l;

    .line 150
    .line 151
    const-string v2, "internal"

    .line 152
    .line 153
    invoke-direct {v0, v2, p1}, Lx1/l;-><init>(Ljava/lang/String;Ljava/util/regex/Pattern;)V

    .line 154
    .line 155
    .line 156
    const/4 p1, 0x0

    .line 157
    iget-object v2, p0, Lx1/a;->T:Lx1/f;

    .line 158
    .line 159
    iget-object v2, v2, Lx1/f;->a:Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-virtual {v2, p1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :cond_5
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    .line 165
    .line 166
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 167
    .line 168
    .line 169
    iget-object v0, p0, Lx1/a;->d:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 172
    .line 173
    .line 174
    const-string v0, "initurl.json"

    .line 175
    .line 176
    invoke-virtual {p0, v0, p1}, Lx1/a;->e(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :catch_0
    move-exception p1

    .line 181
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 182
    .line 183
    .line 184
    return-void
.end method
