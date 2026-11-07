.class public Lco/median/android/MainActivity;
.super Le/j;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/util/Observer;
.implements Lx1/g;
.implements Lw1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/median/android/MainActivity$a;
    }
.end annotation


# static fields
.field public static final synthetic G0:I


# instance fields
.field public A0:Ljava/lang/String;

.field public B0:Ljava/lang/String;

.field public C0:Lu1/x1;

.field public D0:Lu1/r1;

.field public E:Z

.field public E0:F

.field public F:Lco/median/android/widget/WebViewContainerView;

.field public F0:F

.field public G:Lx1/i;

.field public H:Z

.field public final I:Ljava/util/Stack;

.field public J:Landroid/view/View;

.field public K:Ljava/lang/String;

.field public L:Lco/median/android/widget/MedianProgressView;

.field public M:Lco/median/android/MySwipeRefreshLayout;

.field public N:Lco/median/android/widget/SwipeHistoryNavigationLayout;

.field public O:Landroid/widget/RelativeLayout;

.field public P:Landroid/net/ConnectivityManager;

.field public Q:Lu1/w1;

.field public R:Lu1/e;

.field public S:Lu1/q1;

.field public T:Z

.field public U:Z

.field public final V:Landroid/os/Handler;

.field public W:F

.field public X:Ljava/lang/String;

.field public final Y:Lu1/x0;

.field public Z:Lu1/o;

.field public a0:Lu1/w;

.field public b0:Lu1/s0;

.field public c0:Landroidx/emoji2/text/x;

.field public d0:Le/z;

.field public e0:Lu1/k0;

.field public final f0:Lu1/x;

.field public g0:Z

.field public h0:Ljava/lang/String;

.field public i0:Ljava/lang/String;

.field public j0:Ljava/util/Stack;

.field public k0:Lu1/r0;

.field public final l0:Ljava/util/ArrayList;

.field public final m0:Ljava/util/ArrayList;

.field public n0:Ljava/lang/String;

.field public o0:Ljava/lang/String;

.field public p0:Lu1/z0;

.field public q0:Landroid/telephony/SignalStrength;

.field public r0:Z

.field public s0:Lb/g;

.field public t0:Lb/g;

.field public u0:Ljava/lang/String;

.field public v0:Z

.field public w0:Z

.field public x0:La3/h0;

.field public y0:Ljava/lang/String;

.field public z0:Landroidx/emoji2/text/t;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Le/j;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lco/median/android/MainActivity;->E:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lco/median/android/MainActivity;->H:Z

    .line 8
    .line 9
    new-instance v1, Ljava/util/Stack;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/Stack;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lco/median/android/MainActivity;->I:Ljava/util/Stack;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-object v1, p0, Lco/median/android/MainActivity;->P:Landroid/net/ConnectivityManager;

    .line 18
    .line 19
    iput-boolean v0, p0, Lco/median/android/MainActivity;->U:Z

    .line 20
    .line 21
    new-instance v1, Landroid/os/Handler;

    .line 22
    .line 23
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lco/median/android/MainActivity;->V:Landroid/os/Handler;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput v1, p0, Lco/median/android/MainActivity;->W:F

    .line 30
    .line 31
    new-instance v1, Lu1/x0;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v1, p0, v2}, Lu1/x0;-><init>(Lco/median/android/MainActivity;I)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lco/median/android/MainActivity;->Y:Lu1/x0;

    .line 38
    .line 39
    new-instance v1, Lu1/x;

    .line 40
    .line 41
    invoke-direct {v1, p0}, Lu1/x;-><init>(Lco/median/android/MainActivity;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lco/median/android/MainActivity;->f0:Lu1/x;

    .line 45
    .line 46
    iput-boolean v0, p0, Lco/median/android/MainActivity;->g0:Z

    .line 47
    .line 48
    new-instance v1, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lco/median/android/MainActivity;->l0:Ljava/util/ArrayList;

    .line 54
    .line 55
    new-instance v1, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object v1, p0, Lco/median/android/MainActivity;->m0:Ljava/util/ArrayList;

    .line 61
    .line 62
    iput-boolean v0, p0, Lco/median/android/MainActivity;->r0:Z

    .line 63
    .line 64
    const-string v1, ""

    .line 65
    .line 66
    iput-object v1, p0, Lco/median/android/MainActivity;->u0:Ljava/lang/String;

    .line 67
    .line 68
    iput-boolean v0, p0, Lco/median/android/MainActivity;->v0:Z

    .line 69
    .line 70
    const/high16 v0, 0x40400000    # 3.0f

    .line 71
    .line 72
    iput v0, p0, Lco/median/android/MainActivity;->E0:F

    .line 73
    .line 74
    const/high16 v0, -0x40800000    # -1.0f

    .line 75
    .line 76
    iput v0, p0, Lco/median/android/MainActivity;->F0:F

    .line 77
    .line 78
    return-void
.end method

.method public static H(Landroid/content/Intent;)Ljava/lang/String;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    const-string v0, "targetUrl"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    const-string v0, "android.intent.action.VIEW"

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_6

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_5

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v2, ".http"

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    const-string v3, ".https"

    .line 48
    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_5

    .line 60
    .line 61
    :cond_2
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    const-string v0, "https"

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    const-string v0, "http"

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 94
    .line 95
    .line 96
    :cond_4
    :goto_0
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :cond_5
    invoke-virtual {p0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 111
    return-object p0
.end method


# virtual methods
.method public final A()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lco/median/android/MainActivity;->E()Landroidx/emoji2/text/x;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lu1/g0;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-boolean v0, v0, Lu1/g0;->b:Z

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    if-nez v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public final B()V
    .locals 5

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->Q:Lu1/w1;

    .line 2
    .line 3
    iget-object v0, v0, Lu1/w1;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/material/navigation/d;->getMenu()Landroid/view/Menu;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-interface {v0, v1, v2, v1}, Landroid/view/Menu;->setGroupCheckable(IZZ)V

    .line 12
    .line 13
    .line 14
    move v3, v1

    .line 15
    :goto_0
    invoke-interface {v0}, Landroid/view/Menu;->size()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-ge v3, v4, :cond_0

    .line 20
    .line 21
    invoke-interface {v0, v3}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-interface {v4, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 26
    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-interface {v0, v1, v2, v2}, Landroid/view/Menu;->setGroupCheckable(IZZ)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final C(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->Z:Lu1/o;

    .line 2
    .line 3
    iget-object v1, v0, Lu1/o;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    const-string p1, "u1.o"

    .line 12
    .line 13
    const-string p2, "downloadFile: Url empty!"

    .line 14
    .line 15
    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    const-string p1, "URL cannot be empty."

    .line 19
    .line 20
    invoke-static {v1, p5, p1}, Lu1/o;->g(Lx1/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const-string v2, "blob:"

    .line 25
    .line 26
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    iget p3, v0, Lu1/o;->b:I

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    if-ne p3, v2, :cond_1

    .line 36
    .line 37
    const/4 p4, 0x1

    .line 38
    :cond_1
    new-instance p3, Lu1/n;

    .line 39
    .line 40
    invoke-direct {p3, p1, p2, p4, p5}, Lu1/n;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p3}, Lu1/o;->h(Lu1/n;)Z

    .line 44
    .line 45
    .line 46
    move-result p3

    .line 47
    if-eqz p3, :cond_2

    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    iget-object p3, v1, Lco/median/android/MainActivity;->a0:Lu1/w;

    .line 51
    .line 52
    invoke-virtual {p3, p1, p2, p4, p5}, Lu1/w;->d(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {p1}, Landroid/webkit/MimeTypeMap;->getFileExtensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-nez v3, :cond_4

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    :goto_0
    move-object v2, p2

    .line 79
    move v4, p3

    .line 80
    move v5, p4

    .line 81
    move-object v6, p5

    .line 82
    move-object v3, v1

    .line 83
    move-object v1, p1

    .line 84
    goto :goto_1

    .line 85
    :cond_4
    const-string v1, "*/*"

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :goto_1
    invoke-virtual/range {v0 .. v6}, Lu1/o;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final D(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lt1/l;->o(Lco/median/android/MainActivity;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-static {p0}, Lt1/l;->b(Lco/median/android/MainActivity;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final E()Landroidx/emoji2/text/x;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 6
    .line 7
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->j:Landroidx/emoji2/text/x;

    .line 8
    .line 9
    return-object v0
.end method

.method public final F(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->e0:Lu1/k0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->e0:Lu1/k0;

    .line 13
    .line 14
    invoke-virtual {v0}, Lu1/k0;->a()Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p1, v0}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p0, p1, v0}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    return-void
.end method

.method public final G([Ljava/lang/String;Lu1/a1;)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget-object v3, p1, v2

    .line 7
    .line 8
    invoke-static {p0, v3}, Lc0/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    new-instance v0, Lu1/b1;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, Lu1/b1;->a:[Ljava/lang/String;

    .line 20
    .line 21
    iput-object p2, v0, Lu1/b1;->b:Lu1/a1;

    .line 22
    .line 23
    iget-object p2, p0, Lco/median/android/MainActivity;->l0:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    const/16 p2, 0xc7

    .line 29
    .line 30
    invoke-static {p0, p1, p2}, Lb0/a;->a(Landroidx/fragment/app/e0;[Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    array-length v0, p1

    .line 38
    new-array v2, v0, [I

    .line 39
    .line 40
    move v3, v1

    .line 41
    :goto_1
    if-ge v3, v0, :cond_2

    .line 42
    .line 43
    aput v1, v2, v3

    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    invoke-interface {p2, p1, v2}, Lu1/a1;->c([Ljava/lang/String;[I)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final I()V
    .locals 4

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "webviewDatabase"

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v2, "databasePath "

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v0, " exists"

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v1, "co.median.android.MainActivity"

    .line 42
    .line 43
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-static {}, Landroidx/emoji2/text/p;->l()Landroidx/emoji2/text/p;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v1, v1, Lx1/a;->L:Ljava/lang/String;

    .line 58
    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_1

    .line 66
    .line 67
    :try_start_0
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iput-object v1, v0, Landroidx/emoji2/text/p;->g:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catch_0
    move-exception v0

    .line 75
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    const-string v2, "androidx.emoji2.text.p"

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/util/regex/PatternSyntaxException;->getMessage()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v1, v2, v3, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    :goto_0
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-boolean v0, v0, Lx1/a;->o:Z

    .line 93
    .line 94
    if-eqz v0, :cond_2

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    new-instance v0, Lu1/h;

    .line 98
    .line 99
    const/4 v1, 0x0

    .line 100
    invoke-direct {v0, v1}, Lu1/h;-><init>(I)V

    .line 101
    .line 102
    .line 103
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 104
    .line 105
    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iput-object v2, v0, Lu1/h;->b:Ljava/lang/Object;

    .line 109
    .line 110
    new-array v1, v1, [Ljava/lang/Void;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 113
    .line 114
    .line 115
    :goto_1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 120
    .line 121
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->g:Landroidx/emoji2/text/x;

    .line 122
    .line 123
    iput-object v0, p0, Lco/median/android/MainActivity;->c0:Landroidx/emoji2/text/x;

    .line 124
    .line 125
    return-void
.end method

.method public final J()V
    .locals 4

    .line 1
    const-string v0, "co.median.android.MainActivity"

    .line 2
    .line 3
    iget-object v1, p0, Lco/median/android/MainActivity;->p0:Lu1/z0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v1, Lu1/z0;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Lu1/z0;-><init>(Lco/median/android/MainActivity;)V

    .line 11
    .line 12
    .line 13
    iput-object v1, p0, Lco/median/android/MainActivity;->p0:Lu1/z0;

    .line 14
    .line 15
    :try_start_0
    const-string v1, "phone"

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "Error getting system telephony manager"

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-virtual {v1, v0, v2, v3}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_0
    move-exception v1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v2, p0, Lco/median/android/MainActivity;->p0:Lu1/z0;

    .line 39
    .line 40
    const/16 v3, 0x100

    .line 41
    .line 42
    invoke-virtual {v1, v2, v3}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :goto_0
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const-string v3, "Error listening for signal strength"

    .line 51
    .line 52
    invoke-virtual {v2, v0, v3, v1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final K(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->C0:Lu1/x1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1, v1}, Lu1/x1;->b(Ljava/lang/String;ZZ)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final L()Z
    .locals 4

    .line 1
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lx1/a;->X:Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 12
    .line 13
    check-cast v0, Lu1/o0;

    .line 14
    .line 15
    iget-object v0, v0, Lu1/o0;->h:Landroid/webkit/WebChromeClient;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    instance-of v2, v0, Lu1/e0;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    check-cast v0, Lu1/e0;

    .line 24
    .line 25
    iget-boolean v2, v0, Lu1/e0;->e:Z

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Lu1/e0;->onHideCustomView()V

    .line 30
    .line 31
    .line 32
    return v1

    .line 33
    :cond_1
    iget-object v0, p0, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    iget-object v3, v0, Lu1/q1;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 39
    .line 40
    iget-object v0, v0, Lu1/q1;->d:Lcom/google/android/material/navigation/NavigationView;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Ly0/f;->l(Landroid/view/View;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    iget-object v0, p0, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 52
    .line 53
    iget-object v0, v0, Lu1/q1;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Ly0/f;->d(Z)V

    .line 56
    .line 57
    .line 58
    return v1

    .line 59
    :cond_2
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 60
    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    move v0, v2

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-interface {v0}, Lx1/i;->canGoBack()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    :goto_0
    if-eqz v0, :cond_5

    .line 70
    .line 71
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 72
    .line 73
    if-nez v0, :cond_4

    .line 74
    .line 75
    :goto_1
    return v1

    .line 76
    :cond_4
    sget v2, Lu1/o0;->u:I

    .line 77
    .line 78
    check-cast v0, Lu1/o0;

    .line 79
    .line 80
    invoke-virtual {v0}, Lu1/o0;->goBack()V

    .line 81
    .line 82
    .line 83
    return v1

    .line 84
    :cond_5
    iget-object v0, p0, Lco/median/android/MainActivity;->j0:Ljava/util/Stack;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_6

    .line 91
    .line 92
    iget-object v0, p0, Lco/median/android/MainActivity;->j0:Ljava/util/Stack;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Landroid/os/Bundle;

    .line 99
    .line 100
    new-instance v3, Lu1/o0;

    .line 101
    .line 102
    invoke-direct {v3, p0}, Lu1/o0;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v0}, Landroid/webkit/WebView;->restoreState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v3, v2, v1}, Lco/median/android/MainActivity;->r0(Lx1/i;ZZ)V

    .line 109
    .line 110
    .line 111
    return v1

    .line 112
    :cond_6
    return v2
.end method

.method public final M(Ljava/lang/String;)Z
    .locals 10

    .line 1
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lco/median/android/MainActivity;->E()Landroidx/emoji2/text/x;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-boolean v2, v0, Lx1/a;->F:Z

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    if-eqz v2, :cond_a

    .line 14
    .line 15
    invoke-virtual {v0}, Lx1/a;->t()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    const-string v6, "/+$"

    .line 29
    .line 30
    const-string v7, ""

    .line 31
    .line 32
    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2, v6, v7}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    :goto_0
    move v2, v4

    .line 50
    :goto_1
    if-eqz v2, :cond_a

    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    iput-boolean v2, p0, Lco/median/android/MainActivity;->T:Z

    .line 54
    .line 55
    iget-object v5, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v6, v1, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, Ljava/util/LinkedHashMap;

    .line 60
    .line 61
    iget-object v7, v1, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v7, Ljava/util/LinkedHashMap;

    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_3

    .line 78
    .line 79
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    check-cast v8, Ljava/util/Map$Entry;

    .line 84
    .line 85
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    check-cast v9, Lu1/g0;

    .line 90
    .line 91
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    check-cast v8, Ljava/lang/CharSequence;

    .line 96
    .line 97
    invoke-static {v5, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-eqz v8, :cond_2

    .line 102
    .line 103
    iput-boolean v2, v9, Lu1/g0;->b:Z

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_2
    iput-boolean v4, v9, Lu1/g0;->b:Z

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    iget-object v5, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v7, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    check-cast v5, Lu1/g0;

    .line 116
    .line 117
    if-eqz v5, :cond_4

    .line 118
    .line 119
    const/4 v6, -0x1

    .line 120
    iput v6, v5, Lu1/g0;->c:I

    .line 121
    .line 122
    iput v6, v5, Lu1/g0;->d:I

    .line 123
    .line 124
    :cond_4
    invoke-virtual {p0}, Lco/median/android/MainActivity;->I()V

    .line 125
    .line 126
    .line 127
    iget-object v5, p0, Lco/median/android/MainActivity;->R:Lu1/e;

    .line 128
    .line 129
    if-eqz v5, :cond_5

    .line 130
    .line 131
    iget-boolean v6, p0, Lco/median/android/MainActivity;->T:Z

    .line 132
    .line 133
    invoke-virtual {v5, v6}, Lu1/e;->d(Z)V

    .line 134
    .line 135
    .line 136
    iget-object v5, p0, Lco/median/android/MainActivity;->R:Lu1/e;

    .line 137
    .line 138
    invoke-virtual {v5, p1, v2}, Lu1/e;->c(Ljava/lang/String;Z)V

    .line 139
    .line 140
    .line 141
    :cond_5
    iget-object v5, p0, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 142
    .line 143
    if-eqz v5, :cond_8

    .line 144
    .line 145
    iget-boolean v6, p0, Lco/median/android/MainActivity;->T:Z

    .line 146
    .line 147
    invoke-virtual {v5, v6}, Lu1/q1;->c(Z)V

    .line 148
    .line 149
    .line 150
    iget-object v5, p0, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 151
    .line 152
    iget-boolean v0, v0, Lx1/a;->H:Z

    .line 153
    .line 154
    iget-object v6, v5, Lu1/q1;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 155
    .line 156
    if-eqz v0, :cond_6

    .line 157
    .line 158
    invoke-virtual {v6, v4}, Ly0/f;->setDrawerLockMode(I)V

    .line 159
    .line 160
    .line 161
    iget-object v0, v5, Lu1/q1;->c:Lu1/p1;

    .line 162
    .line 163
    if-eqz v0, :cond_7

    .line 164
    .line 165
    invoke-virtual {v6, v0}, Ly0/f;->a(Ly0/b;)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_6
    invoke-virtual {v6, v2}, Ly0/f;->setDrawerLockMode(I)V

    .line 170
    .line 171
    .line 172
    iget-object v0, v5, Lu1/q1;->c:Lu1/p1;

    .line 173
    .line 174
    if-eqz v0, :cond_7

    .line 175
    .line 176
    invoke-virtual {v6, v0}, Ly0/f;->p(Ly0/b;)V

    .line 177
    .line 178
    .line 179
    :cond_7
    :goto_3
    iget-object v0, p0, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 180
    .line 181
    iget-object v0, v0, Lu1/q1;->c:Lu1/p1;

    .line 182
    .line 183
    if-eqz v0, :cond_8

    .line 184
    .line 185
    invoke-virtual {v0}, Lu1/p1;->e()V

    .line 186
    .line 187
    .line 188
    :cond_8
    iget-object v0, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 189
    .line 190
    invoke-virtual {v7, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    check-cast v0, Lu1/g0;

    .line 195
    .line 196
    if-eqz v0, :cond_9

    .line 197
    .line 198
    iput-boolean v2, v0, Lu1/g0;->e:Z

    .line 199
    .line 200
    :cond_9
    invoke-virtual {v1, v3}, Landroidx/emoji2/text/x;->c(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    new-instance v0, Lu1/y;

    .line 204
    .line 205
    invoke-direct {v0, p0, p1, v1}, Lu1/y;-><init>(Lco/median/android/MainActivity;Ljava/lang/String;Landroidx/emoji2/text/x;)V

    .line 206
    .line 207
    .line 208
    iput-object v0, v1, Landroidx/emoji2/text/x;->c:Ljava/lang/Object;

    .line 209
    .line 210
    return v2

    .line 211
    :cond_a
    iget-object p1, v1, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast p1, Ljava/util/LinkedHashMap;

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-eqz v0, :cond_c

    .line 228
    .line 229
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    check-cast v0, Ljava/util/Map$Entry;

    .line 234
    .line 235
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    check-cast v0, Lu1/g0;

    .line 240
    .line 241
    iget-boolean v2, v0, Lu1/g0;->b:Z

    .line 242
    .line 243
    if-eqz v2, :cond_b

    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_b
    iget-object v3, v0, Lu1/g0;->a:Ljava/lang/String;

    .line 247
    .line 248
    :cond_c
    invoke-virtual {v1, v3}, Landroidx/emoji2/text/x;->c(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1, v3}, Landroidx/emoji2/text/x;->f(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    return v4
.end method

.method public final N()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lco/median/android/MainActivity;->R()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-boolean v0, v0, Lx1/a;->B0:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Landroid/os/Handler;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lu1/x0;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v1, p0, v2}, Lu1/x0;-><init>(Lco/median/android/MainActivity;I)V

    .line 21
    .line 22
    .line 23
    const/16 v2, 0x3e8

    .line 24
    .line 25
    int-to-long v2, v2

    .line 26
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->M:Lco/median/android/MySwipeRefreshLayout;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {v0, v1}, Lw1/h;->setRefreshing(Z)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final O(Landroid/net/Uri;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const v0, 0x7f060037

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-static {p0, v0}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/high16 v1, -0x1000000

    .line 12
    .line 13
    or-int/2addr v0, v1

    .line 14
    const v1, 0x7f0603e3

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v1}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    new-instance v2, Lo/c;

    .line 22
    .line 23
    invoke-direct {v2}, Lo/c;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v3, Landroid/os/Bundle;

    .line 27
    .line 28
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v4, "android.support.customtabs.extra.TOOLBAR_COLOR"

    .line 32
    .line 33
    invoke-virtual {v3, v4, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    const-string v0, "android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR"

    .line 37
    .line 38
    invoke-virtual {v3, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    iput-object v3, v2, Lo/c;->d:Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-virtual {v2}, Lo/c;->a()La3/h0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v0, v0, La3/h0;->g:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Landroid/content/Intent;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lco/median/android/MainActivity;->t0:Lb/g;

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Lb/g;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catch_0
    move-exception v0

    .line 61
    instance-of v1, v0, Landroid/content/ActivityNotFoundException;

    .line 62
    .line 63
    const-string v2, "co.median.android.MainActivity"

    .line 64
    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    const/4 p1, 0x1

    .line 68
    const v1, 0x7f110025

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v1, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 76
    .line 77
    .line 78
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {p1, v2, v1, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    new-instance v3, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v4, "openAppBrowser: launchError - uri: "

    .line 97
    .line 98
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {v1, v2, p1, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 109
    .line 110
    .line 111
    :goto_0
    return-void
.end method

.method public final P(Landroid/net/Uri;)V
    .locals 5

    .line 1
    const-string v0, "android.intent.action.VIEW"

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_5

    .line 6
    .line 7
    :cond_0
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    .line 8
    .line 9
    invoke-direct {v1, v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 10
    .line 11
    .line 12
    const/high16 v2, 0x10000000

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v2, v2, Lx1/a;->f0:Ljava/util/ArrayList;

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    :goto_0
    const/4 v2, 0x0

    .line 42
    :goto_1
    if-eqz v2, :cond_4

    .line 43
    .line 44
    new-instance v2, Landroid/content/Intent;

    .line 45
    .line 46
    const-string v3, "http://www.google.com"

    .line 47
    .line 48
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const/high16 v3, 0x10000

    .line 60
    .line 61
    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    const/4 v0, 0x0

    .line 75
    :goto_2
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 76
    .line 77
    .line 78
    goto :goto_3

    .line 79
    :catch_0
    move-exception v0

    .line 80
    goto :goto_4

    .line 81
    :cond_4
    :goto_3
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :goto_4
    instance-of v1, v0, Landroid/content/ActivityNotFoundException;

    .line 86
    .line 87
    const-string v2, "co.median.android.MainActivity"

    .line 88
    .line 89
    if-eqz v1, :cond_5

    .line 90
    .line 91
    const/4 p1, 0x1

    .line 92
    const v1, 0x7f110025

    .line 93
    .line 94
    .line 95
    invoke-static {p0, v1, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 100
    .line 101
    .line 102
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {p1, v2, v1, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_5
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    new-instance v3, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string v4, "openExternalBrowser: launchError - uri: "

    .line 121
    .line 122
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {v1, v2, p1, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 133
    .line 134
    .line 135
    :goto_5
    return-void
.end method

.method public final Q(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "internal"

    .line 13
    .line 14
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lco/median/android/MainActivity;->K(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const-string v1, "external"

    .line 25
    .line 26
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lco/median/android/MainActivity;->P(Landroid/net/Uri;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    const-string v1, "appbrowser"

    .line 37
    .line 38
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-eqz p2, :cond_3

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lco/median/android/MainActivity;->O(Landroid/net/Uri;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_3
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    iget-boolean v0, p2, Lx1/a;->D:Z

    .line 53
    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    iget v0, p2, Lx1/a;->E:I

    .line 57
    .line 58
    if-lez v0, :cond_4

    .line 59
    .line 60
    invoke-virtual {p0}, Lco/median/android/MainActivity;->E()Landroidx/emoji2/text/x;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v0, v0, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/util/AbstractMap;->size()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget p2, p2, Lx1/a;->E:I

    .line 73
    .line 74
    if-lt v0, p2, :cond_4

    .line 75
    .line 76
    invoke-virtual {p0, p1}, Lco/median/android/MainActivity;->M(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-eqz p2, :cond_4

    .line 81
    .line 82
    :goto_0
    return-void

    .line 83
    :cond_4
    new-instance p2, Landroid/content/Intent;

    .line 84
    .line 85
    const-class v0, Lco/median/android/MainActivity;

    .line 86
    .line 87
    invoke-direct {p2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 88
    .line 89
    .line 90
    const-string v0, "isRoot"

    .line 91
    .line 92
    const/4 v1, 0x0

    .line 93
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 94
    .line 95
    .line 96
    const-string v0, "url"

    .line 97
    .line 98
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 99
    .line 100
    .line 101
    const-string p1, "ignoreInterceptMaxWindows"

    .line 102
    .line 103
    const/4 v0, 0x1

    .line 104
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 105
    .line 106
    .line 107
    const/16 p1, 0x190

    .line 108
    .line 109
    invoke-virtual {p0, p2, p1}, Landroidx/activity/q;->startActivityForResult(Landroid/content/Intent;I)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final R()V
    .locals 6

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lx1/i;->getUrl()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    const-string v1, "file:///android_asset/offline.html"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_5

    .line 16
    .line 17
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 18
    .line 19
    invoke-interface {v0}, Lx1/i;->canGoBack()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 26
    .line 27
    check-cast v0, Lu1/o0;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    :try_start_0
    invoke-virtual {v0}, Landroid/webkit/WebView;->copyBackForwardList()Landroid/webkit/WebBackForwardList;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    add-int/lit8 v3, v3, -0x1

    .line 41
    .line 42
    :goto_0
    if-ltz v3, :cond_1

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-nez v5, :cond_0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    add-int/lit8 v3, v3, -0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 v4, 0x0

    .line 63
    :goto_1
    if-eqz v4, :cond_2

    .line 64
    .line 65
    invoke-virtual {v4}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iput-object v1, v0, Lu1/o0;->j:Ljava/lang/String;

    .line 70
    .line 71
    :cond_2
    invoke-virtual {v0}, Lu1/o0;->goBack()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    iget-object v0, p0, Lco/median/android/MainActivity;->K:Ljava/lang/String;

    .line 76
    .line 77
    if-eqz v0, :cond_4

    .line 78
    .line 79
    iget-object v1, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 80
    .line 81
    check-cast v1, Lu1/o0;

    .line 82
    .line 83
    invoke-virtual {v1, v0}, Lu1/o0;->loadUrl(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :catch_0
    :cond_4
    :goto_2
    iget-object v0, p0, Lco/median/android/MainActivity;->b0:Lu1/s0;

    .line 87
    .line 88
    invoke-virtual {v0}, Lu1/s0;->c()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_5
    iget-object v1, p0, Lco/median/android/MainActivity;->i0:Ljava/lang/String;

    .line 93
    .line 94
    iput-object v1, p0, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v1, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 97
    .line 98
    check-cast v1, Lu1/o0;

    .line 99
    .line 100
    invoke-virtual {v1, v0}, Lu1/o0;->loadUrl(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public final S()V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->x0:La3/h0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, La3/h0;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroidx/emoji2/text/p;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/emoji2/text/p;->n()Landroid/view/ViewGroup;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    new-array v2, v2, [F

    .line 17
    .line 18
    fill-array-data v2, :array_0

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    .line 26
    .line 27
    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 31
    .line 32
    .line 33
    const-wide/16 v1, 0x64

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 36
    .line 37
    .line 38
    new-instance v1, Lb3/f;

    .line 39
    .line 40
    const/16 v2, 0x9

    .line 41
    .line 42
    invoke-direct {v1, v2, p0}, Lb3/f;-><init>(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void

    .line 52
    nop

    .line 53
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final T()V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {v0}, Lx1/i;->getProgress()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x64

    .line 11
    .line 12
    if-ge v0, v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 16
    .line 17
    invoke-interface {v0}, Lx1/i;->getUrl()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-string v1, "file:///android_asset/offline.html"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iget-object v0, p0, Lco/median/android/MainActivity;->I:Ljava/util/Stack;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    :goto_0
    return-void

    .line 41
    :cond_3
    iget-object v1, p0, Lco/median/android/MainActivity;->P:Landroid/net/ConnectivityManager;

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-eqz v1, :cond_5

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_4

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lco/median/android/MainActivity;->K(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_5
    :goto_1
    return-void
.end method

.method public final U(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lco/median/android/MainActivity;->u0:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p1, p0, Lco/median/android/MainActivity;->s0:Lb/g;

    .line 6
    .line 7
    const-string p2, "android.permission.READ_PHONE_STATE"

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lb/g;->a(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {p0}, Lu1/h0;->y(Landroid/content/Context;)Ljava/util/HashMap;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 22
    .line 23
    iget-boolean v0, v0, Lco/median/android/GoNativeApplication;->l:Z

    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "isFirstLaunch"

    .line 30
    .line 31
    invoke-virtual {p2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 39
    .line 40
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance v1, Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lu1/x;->a()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-nez v2, :cond_1

    .line 65
    .line 66
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 67
    .line 68
    .line 69
    new-instance v0, Lorg/json/JSONObject;

    .line 70
    .line 71
    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1, v0}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const/4 p2, 0x0

    .line 79
    invoke-virtual {p0, p1, p2}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_1
    invoke-static {v0}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    throw p1
.end method

.method public final V(Ljava/lang/String;Lu1/y1;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    check-cast v0, Lu1/o0;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    check-cast v0, Lu1/o0;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-virtual {v0, p1, p2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final W(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->Q:Lu1/w1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, v0, Lu1/w1;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 7
    .line 8
    if-ltz p1, :cond_2

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/google/android/material/navigation/d;->getMenu()Landroid/view/Menu;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-interface {v2}, Landroid/view/Menu;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-lt p1, v2, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v2, 0x0

    .line 22
    iput-boolean v2, v0, Lu1/w1;->q:Z

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Lcom/google/android/material/navigation/d;->setSelectedItemId(I)V

    .line 25
    .line 26
    .line 27
    :cond_2
    :goto_0
    return-void
.end method

.method public final X(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->P:Landroid/net/ConnectivityManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const-string v0, "DISCONNECTED"

    .line 26
    .line 27
    :goto_1
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    .line 28
    .line 29
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v3, "connected"

    .line 33
    .line 34
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    const-string v1, "type"

    .line 38
    .line 39
    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lco/median/android/MainActivity;->q0:Landroid/telephony/SignalStrength;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    new-instance v0, Lorg/json/JSONObject;

    .line 47
    .line 48
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 49
    .line 50
    .line 51
    const-string v1, "cdmaDbm"

    .line 52
    .line 53
    iget-object v3, p0, Lco/median/android/MainActivity;->q0:Landroid/telephony/SignalStrength;

    .line 54
    .line 55
    invoke-virtual {v3}, Landroid/telephony/SignalStrength;->getCdmaDbm()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    const-string v1, "cdmaEcio"

    .line 63
    .line 64
    iget-object v3, p0, Lco/median/android/MainActivity;->q0:Landroid/telephony/SignalStrength;

    .line 65
    .line 66
    invoke-virtual {v3}, Landroid/telephony/SignalStrength;->getCdmaEcio()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    const-string v1, "evdoDbm"

    .line 74
    .line 75
    iget-object v3, p0, Lco/median/android/MainActivity;->q0:Landroid/telephony/SignalStrength;

    .line 76
    .line 77
    invoke-virtual {v3}, Landroid/telephony/SignalStrength;->getEvdoDbm()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 82
    .line 83
    .line 84
    const-string v1, "evdoEcio"

    .line 85
    .line 86
    iget-object v3, p0, Lco/median/android/MainActivity;->q0:Landroid/telephony/SignalStrength;

    .line 87
    .line 88
    invoke-virtual {v3}, Landroid/telephony/SignalStrength;->getEvdoEcio()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 93
    .line 94
    .line 95
    const-string v1, "evdoSnr"

    .line 96
    .line 97
    iget-object v3, p0, Lco/median/android/MainActivity;->q0:Landroid/telephony/SignalStrength;

    .line 98
    .line 99
    invoke-virtual {v3}, Landroid/telephony/SignalStrength;->getEvdoSnr()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 104
    .line 105
    .line 106
    const-string v1, "gsmBitErrorRate"

    .line 107
    .line 108
    iget-object v3, p0, Lco/median/android/MainActivity;->q0:Landroid/telephony/SignalStrength;

    .line 109
    .line 110
    invoke-virtual {v3}, Landroid/telephony/SignalStrength;->getGsmBitErrorRate()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    const-string v1, "gsmSignalStrength"

    .line 118
    .line 119
    iget-object v3, p0, Lco/median/android/MainActivity;->q0:Landroid/telephony/SignalStrength;

    .line 120
    .line 121
    invoke-virtual {v3}, Landroid/telephony/SignalStrength;->getGsmSignalStrength()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 126
    .line 127
    .line 128
    const-string v1, "level"

    .line 129
    .line 130
    iget-object v3, p0, Lco/median/android/MainActivity;->q0:Landroid/telephony/SignalStrength;

    .line 131
    .line 132
    invoke-virtual {v3}, Landroid/telephony/SignalStrength;->getLevel()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    const-string v1, "cellSignalStrength"

    .line 140
    .line 141
    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :catch_0
    move-exception p1

    .line 146
    goto :goto_3

    .line 147
    :cond_2
    :goto_2
    invoke-static {p1, v2}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    const/4 v0, 0x0

    .line 152
    invoke-virtual {p0, p1, v0}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :goto_3
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    const-string v1, "co.median.android.MainActivity"

    .line 161
    .line 162
    const-string v2, "JSON error sending connectivity"

    .line 163
    .line 164
    invoke-virtual {v0, v1, v2, p1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public final Y(Ljava/lang/String;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iput-object p1, p0, Lco/median/android/MainActivity;->o0:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v0, p0, Lco/median/android/MainActivity;->p0:Lu1/z0;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lco/median/android/MainActivity;->X(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_1
    invoke-virtual {p0}, Lco/median/android/MainActivity;->J()V

    .line 15
    .line 16
    .line 17
    new-instance p1, Landroid/os/Handler;

    .line 18
    .line 19
    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lu1/x0;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    invoke-direct {v0, p0, v1}, Lu1/x0;-><init>(Lco/median/android/MainActivity;I)V

    .line 26
    .line 27
    .line 28
    const-wide/16 v1, 0x1f4

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final Z(FLjava/lang/String;)V
    .locals 9

    .line 1
    const-string v0, "(function() {  var targetScale = "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v1, p1, v1

    .line 5
    .line 6
    const-string v2, "error"

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const-string v4, "success"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    if-gtz v1, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_3

    .line 19
    .line 20
    new-instance p1, Lorg/json/JSONObject;

    .line 21
    .line 22
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    const-string v0, "Invalid value"

    .line 29
    .line 30
    invoke-virtual {p1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    invoke-static {p2, p1}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0, p1, v5}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catch_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    new-instance v6, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, ";  var meta = document.querySelector(\'meta[name=viewport]\');  if (!meta) {    meta = document.createElement(\'meta\');    meta.name = \'viewport\';    document.head.appendChild(meta);  }  var deviceWidth = window.screen.width;  var newWidth = deviceWidth / targetScale;  var content = meta.getAttribute(\'content\') || \'\';  var parts = content.split(\',\').map(function(p) { return p.trim(); });  var foundScale = false;  var foundWidth = false;  for (var i = 0; i < parts.length; i++) {    if (parts[i].startsWith(\'initial-scale=\')) {      parts[i] = \'initial-scale=\' + targetScale;      foundScale = true;    } else if (parts[i].startsWith(\'width=\')) {      parts[i] = \'width=\' + newWidth;      foundWidth = true;    }  }  if (!foundScale) {    parts.push(\'initial-scale=\' + targetScale);  }  if (!foundWidth) {    parts.push(\'width=\' + newWidth);  }  meta.setAttribute(\'content\', parts.join(\', \'));})();"

    .line 52
    .line 53
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p0, v0, v5}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 61
    .line 62
    .line 63
    if-gtz v1, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    iget v0, p0, Lco/median/android/MainActivity;->E0:F

    .line 67
    .line 68
    mul-float/2addr v0, p1

    .line 69
    iget v1, p0, Lco/median/android/MainActivity;->F0:F
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    div-float/2addr v0, v1

    .line 72
    :try_start_1
    iget-object v1, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 73
    .line 74
    check-cast v1, Landroid/webkit/WebView;

    .line 75
    .line 76
    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->zoomBy(F)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catch_1
    move-exception v0

    .line 81
    :try_start_2
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const-string v6, "co.median.android.MainActivity"

    .line 86
    .line 87
    const-string v7, "setAbsoluteZoom: "

    .line 88
    .line 89
    invoke-virtual {v1, v6, v7, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 90
    .line 91
    .line 92
    :goto_0
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput p1, v0, Lx1/a;->A:F
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 97
    .line 98
    :try_start_3
    new-instance v1, Lorg/json/JSONObject;

    .line 99
    .line 100
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v6, "initialZoom"

    .line 104
    .line 105
    float-to-double v7, p1

    .line 106
    invoke-virtual {v1, v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 107
    .line 108
    .line 109
    const-string p1, "webview-zoom.json"

    .line 110
    .line 111
    invoke-virtual {v0, p1, v1}, Lx1/a;->e(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 112
    .line 113
    .line 114
    :catch_2
    :try_start_4
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-nez p1, :cond_3

    .line 119
    .line 120
    new-instance p1, Lorg/json/JSONObject;

    .line 121
    .line 122
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 123
    .line 124
    .line 125
    const/4 v0, 0x1

    .line 126
    invoke-virtual {p1, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 127
    .line 128
    .line 129
    invoke-static {p2, p1}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p0, p1, v5}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :goto_1
    instance-of v0, p1, Lorg/json/JSONException;

    .line 138
    .line 139
    if-eqz v0, :cond_2

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_2
    :try_start_5
    new-instance v0, Lorg/json/JSONObject;

    .line 143
    .line 144
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {v0, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 155
    .line 156
    .line 157
    invoke-static {p2, v0}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p0, p1, v5}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_3

    .line 162
    .line 163
    .line 164
    :catch_3
    :cond_3
    :goto_2
    return-void
.end method

.method public final a0(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lco/median/android/MainActivity;->setTitle(Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const p1, 0x7f110024

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final b0(I)V
    .locals 1

    .line 1
    invoke-static {p1}, Ls/e;->b(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p1, v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/4 p1, 0x6

    .line 15
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_2
    const/4 p1, -0x1

    .line 24
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final c0()V
    .locals 3

    .line 1
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, v0, Lx1/a;->p1:I

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lco/median/android/MainActivity;->b0(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const v2, 0x7f050003

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget v1, v0, Lx1/a;->r1:I

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Lco/median/android/MainActivity;->b0(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    iget v1, v0, Lx1/a;->q1:I

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lco/median/android/MainActivity;->b0(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    iget-boolean v0, v0, Lx1/a;->t:Z

    .line 43
    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    invoke-virtual {p0, v0}, Lco/median/android/MainActivity;->b0(I)V

    .line 48
    .line 49
    .line 50
    :cond_3
    return-void
.end method

.method public final d0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput-boolean p1, v0, Lu1/q1;->i:Z

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lu1/q1;->b(Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final e0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lu1/r1;->c(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final f0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lu1/r1;->c(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lu1/r1;->d(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final g0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lu1/r1;->d(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final h0(Lorg/json/JSONObject;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->Q:Lu1/w1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lu1/w1;->p:Z

    .line 8
    .line 9
    const-string v1, "items"

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lu1/w1;->e(Lorg/json/JSONArray;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    const/4 v2, -0x1

    .line 21
    if-eq p2, v2, :cond_3

    .line 22
    .line 23
    iget-object v2, v0, Lu1/w1;->k:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {v2, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Lu1/v1;

    .line 34
    .line 35
    if-eqz p2, :cond_4

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    iget-object p2, p2, Lu1/v1;->a:Lorg/json/JSONArray;

    .line 41
    .line 42
    invoke-virtual {v0, p2}, Lu1/w1;->e(Lorg/json/JSONArray;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    const-string p2, "enabled"

    .line 46
    .line 47
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    instance-of p2, p1, Ljava/lang/Boolean;

    .line 52
    .line 53
    if-eqz p2, :cond_4

    .line 54
    .line 55
    check-cast p1, Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-virtual {v0, p1}, Lu1/w1;->f(Z)V

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_0
    return-void
.end method

.method public final i0(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

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
    invoke-static {p0}, Le4/a;->x(Landroid/content/ContextWrapper;)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const-string v2, "io.gonative.android.appTheme"

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 41
    .line 42
    .line 43
    :goto_0
    iput-object p1, p0, Lco/median/android/MainActivity;->A0:Ljava/lang/String;

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    iput-boolean v0, p0, Lco/median/android/MainActivity;->v0:Z

    .line 47
    .line 48
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 49
    .line 50
    const/16 v1, 0x1f

    .line 51
    .line 52
    if-lt v0, v1, :cond_2

    .line 53
    .line 54
    invoke-static {p0, p1}, Lt2/i;->N(Landroid/content/ContextWrapper;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-static {p1}, Lt2/i;->M(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :goto_1
    invoke-virtual {p0}, Lco/median/android/MainActivity;->j0()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final j0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->A0:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "document.documentElement.setAttribute(\'data-color-scheme-option\', \'"

    .line 4
    .line 5
    const-string v2, "\');"

    .line 6
    .line 7
    invoke-static {v1, v0, v2}, Landroidx/fragment/app/u;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 12
    .line 13
    check-cast v1, Lu1/o0;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, v0, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final k0(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "FORCE_DARK"

    .line 2
    .line 3
    invoke-static {v0}, Le4/a;->R(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string p1, "co.median.android.MainActivity"

    .line 10
    .line 11
    const-string v0, "Dark mode feature is not supported"

    .line 12
    .line 13
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 18
    .line 19
    invoke-interface {v0}, Lx1/i;->getSettings()Landroid/webkit/WebSettings;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string v0, "dark"

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x2

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object p1, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 36
    .line 37
    invoke-interface {p1}, Lx1/i;->getSettings()Landroid/webkit/WebSettings;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1, v1}, Ls1/a;->b(Landroid/webkit/WebSettings;I)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const-string v0, "light"

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    const/4 v0, 0x0

    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    iget-object p1, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 55
    .line 56
    invoke-interface {p1}, Lx1/i;->getSettings()Landroid/webkit/WebSettings;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1, v0}, Ls1/a;->b(Landroid/webkit/WebSettings;I)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-virtual {p0}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 73
    .line 74
    and-int/lit8 p1, p1, 0x30

    .line 75
    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    const/16 v2, 0x10

    .line 79
    .line 80
    if-eq p1, v2, :cond_5

    .line 81
    .line 82
    const/16 v0, 0x20

    .line 83
    .line 84
    if-eq p1, v0, :cond_4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    iget-object p1, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 88
    .line 89
    invoke-interface {p1}, Lx1/i;->getSettings()Landroid/webkit/WebSettings;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1, v1}, Ls1/a;->b(Landroid/webkit/WebSettings;I)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    iget-object p1, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 98
    .line 99
    invoke-interface {p1}, Lx1/i;->getSettings()Landroid/webkit/WebSettings;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1, v0}, Ls1/a;->b(Landroid/webkit/WebSettings;I)V

    .line 104
    .line 105
    .line 106
    :goto_0
    const-string p1, "FORCE_DARK_STRATEGY"

    .line 107
    .line 108
    invoke-static {p1}, Le4/a;->R(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_7

    .line 113
    .line 114
    iget-object p1, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 115
    .line 116
    invoke-interface {p1}, Lx1/i;->getSettings()Landroid/webkit/WebSettings;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    sget-object v0, Lt1/i;->c:Lt1/b;

    .line 121
    .line 122
    invoke-virtual {v0}, Lt1/c;->b()Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-eqz v0, :cond_6

    .line 127
    .line 128
    invoke-static {p1}, Ls1/a;->a(Landroid/webkit/WebSettings;)Lr0/b;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Lr0/b;->f()V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_6
    const-string p1, "This method is not supported by the current version of the framework and the current WebView APK"

    .line 137
    .line 138
    invoke-static {p1}, Landroidx/fragment/app/q;->t(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_7
    :goto_1
    invoke-virtual {p0}, Lco/median/android/MainActivity;->j0()V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public final l0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lx1/i;->getUrl()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    move-object p1, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    :try_start_0
    new-instance v1, Ljava/net/URI;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/net/URI;->isAbsolute()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    new-instance v2, Ljava/net/URI;

    .line 28
    .line 29
    invoke-direct {v2, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v1}, Ljava/net/URI;->resolve(Ljava/net/URI;)Ljava/net/URI;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    :catch_0
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :goto_1
    new-instance p2, Landroid/content/Intent;

    .line 77
    .line 78
    const-string v0, "android.intent.action.SEND"

    .line 79
    .line 80
    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string v0, "text/plain"

    .line 84
    .line 85
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 86
    .line 87
    .line 88
    const-string v0, "android.intent.extra.TEXT"

    .line 89
    .line 90
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    const p1, 0x7f110021

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {p2, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final m0()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lco/median/android/MainActivity;->g0:Z

    .line 3
    .line 4
    iget-boolean v1, p0, Lco/median/android/MainActivity;->U:Z

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lco/median/android/MainActivity;->L:Lco/median/android/widget/MedianProgressView;

    .line 9
    .line 10
    const/high16 v1, 0x3f800000    # 1.0f

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iput-boolean v0, p0, Lco/median/android/MainActivity;->U:Z

    .line 21
    .line 22
    iget-object v0, p0, Lco/median/android/MainActivity;->J:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-wide/16 v2, 0x12c

    .line 34
    .line 35
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-wide/16 v2, 0x96

    .line 40
    .line 41
    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lco/median/android/MainActivity;->L:Lco/median/android/widget/MedianProgressView;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v2, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-wide v2, v0, Lco/median/android/widget/MedianProgressView;->f:J

    .line 55
    .line 56
    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    new-instance v2, Landroidx/activity/k;

    .line 61
    .line 62
    const/16 v3, 0x11

    .line 63
    .line 64
    invoke-direct {v2, v3, v0}, Landroidx/activity/k;-><init>(ILjava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final n0(D)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmpl-double v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lu1/t0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, Lu1/t0;-><init>(Lco/median/android/MainActivity;I)V

    .line 11
    .line 12
    .line 13
    const-wide v1, 0x408f400000000000L    # 1000.0

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    mul-double/2addr p1, v1

    .line 19
    double-to-int p1, p1

    .line 20
    int-to-long p1, p1

    .line 21
    iget-object v1, p0, Lco/median/android/MainActivity;->V:Landroid/os/Handler;

    .line 22
    .line 23
    invoke-virtual {v1, v0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {p0}, Lco/median/android/MainActivity;->m0()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final o0()V
    .locals 5

    .line 1
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lco/median/android/MainActivity;->R:Lu1/e;

    .line 6
    .line 7
    iget-object v2, v1, Lu1/e;->c:Lu1/h0;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v2}, Lu1/h0;->J()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v2, v3

    .line 18
    :goto_0
    const/4 v4, 0x1

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-boolean v1, v1, Lu1/e;->r:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    move v1, v4

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v1, v3

    .line 28
    :goto_1
    if-eqz v1, :cond_3

    .line 29
    .line 30
    iget-object v1, p0, Lco/median/android/MainActivity;->R:Lu1/e;

    .line 31
    .line 32
    iget-object v2, v1, Lu1/e;->a:Lco/median/android/MainActivity;

    .line 33
    .line 34
    invoke-static {v2}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-boolean v2, v2, Lx1/a;->n0:Z

    .line 39
    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    iget-object v1, v1, Lu1/e;->d:Lcom/google/android/material/appbar/AppBarLayout;

    .line 43
    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-virtual {v1, v4, v4, v4}, Lcom/google/android/material/appbar/AppBarLayout;->e(ZZZ)V

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_2
    iget-boolean v0, v0, Lx1/a;->o0:Z

    .line 51
    .line 52
    if-eqz v0, :cond_6

    .line 53
    .line 54
    iget-object v0, p0, Lco/median/android/MainActivity;->R:Lu1/e;

    .line 55
    .line 56
    iget-object v1, v0, Lu1/e;->c:Lu1/h0;

    .line 57
    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    invoke-virtual {v1}, Lu1/h0;->J()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    move v1, v3

    .line 66
    :goto_3
    if-eqz v1, :cond_5

    .line 67
    .line 68
    iget-boolean v0, v0, Lu1/e;->r:Z

    .line 69
    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    move v3, v4

    .line 73
    :cond_5
    if-nez v3, :cond_6

    .line 74
    .line 75
    iget-object v0, p0, Lco/median/android/MainActivity;->Q:Lu1/w1;

    .line 76
    .line 77
    invoke-virtual {v0}, Lu1/w1;->g()V

    .line 78
    .line 79
    .line 80
    :cond_6
    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/e0;->onActivityResult(IILandroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 9
    .line 10
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 11
    .line 12
    invoke-virtual {v0}, Lu1/x;->a()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_8

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    if-eqz p3, :cond_0

    .line 30
    .line 31
    const-string v1, "exit"

    .line 32
    .line 33
    invoke-virtual {p3, v1, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 40
    .line 41
    .line 42
    :cond_0
    if-eqz p3, :cond_1

    .line 43
    .line 44
    const-string v1, "url"

    .line 45
    .line 46
    invoke-virtual {p3, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v2, "success"

    .line 51
    .line 52
    invoke-virtual {p3, v2, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const/4 v1, 0x0

    .line 58
    move v2, v0

    .line 59
    :goto_0
    const/16 v3, 0x12c

    .line 60
    .line 61
    const/4 v4, -0x1

    .line 62
    if-ne p1, v3, :cond_3

    .line 63
    .line 64
    if-ne p2, v4, :cond_3

    .line 65
    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0, v1}, Lco/median/android/MainActivity;->K(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    iget-object v3, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 73
    .line 74
    check-cast v3, Lu1/o0;

    .line 75
    .line 76
    invoke-virtual {v3, v0}, Lu1/o0;->setCheckLoginSignup(Z)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 80
    .line 81
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v3}, Lx1/a;->t()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v0, Lu1/o0;

    .line 90
    .line 91
    invoke-virtual {v0, v3}, Lu1/o0;->loadUrl(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :goto_1
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget-boolean v0, v0, Lx1/a;->H:Z

    .line 99
    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    invoke-virtual {p0, v2}, Lco/median/android/MainActivity;->v0(Z)V

    .line 103
    .line 104
    .line 105
    :cond_3
    const/16 v0, 0x190

    .line 106
    .line 107
    if-ne p1, v0, :cond_7

    .line 108
    .line 109
    if-ne p2, v4, :cond_7

    .line 110
    .line 111
    if-eqz v1, :cond_7

    .line 112
    .line 113
    const-string p1, "urlLevel"

    .line 114
    .line 115
    invoke-virtual {p3, p1, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    invoke-virtual {p0}, Lco/median/android/MainActivity;->E()Landroidx/emoji2/text/x;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    iget-object v0, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 124
    .line 125
    iget-object p2, p2, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p2, Ljava/util/LinkedHashMap;

    .line 128
    .line 129
    invoke-virtual {p2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    check-cast p2, Lu1/g0;

    .line 134
    .line 135
    if-eqz p2, :cond_4

    .line 136
    .line 137
    iget p2, p2, Lu1/g0;->d:I

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_4
    move p2, v4

    .line 141
    :goto_2
    if-eq p1, v4, :cond_6

    .line 142
    .line 143
    if-eq p2, v4, :cond_6

    .line 144
    .line 145
    if-le p1, p2, :cond_5

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_5
    invoke-virtual {p0, v4, p3}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_6
    :goto_3
    const-string p1, "postLoadJavascript"

    .line 156
    .line 157
    invoke-virtual {p3, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    iput-object p1, p0, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {p0, v1}, Lco/median/android/MainActivity;->K(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    :cond_7
    return-void

    .line 167
    :cond_8
    invoke-static {v0}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    throw p1
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Le/j;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 9
    .line 10
    iget-object v0, p0, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-boolean v0, v0, Lx1/a;->H:Z

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, Lu1/q1;->c:Lu1/p1;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v1, v0, Lu1/p1;->a:Le/s;

    .line 32
    .line 33
    invoke-virtual {v1}, Le/s;->b()Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lu1/p1;->e()V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 44
    .line 45
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 46
    .line 47
    invoke-virtual {v0}, Lu1/x;->a()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_9

    .line 62
    .line 63
    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 64
    .line 65
    and-int/lit8 p1, p1, 0x30

    .line 66
    .line 67
    const/16 v0, 0x10

    .line 68
    .line 69
    if-eq p1, v0, :cond_2

    .line 70
    .line 71
    const/16 v0, 0x20

    .line 72
    .line 73
    if-eq p1, v0, :cond_1

    .line 74
    .line 75
    const-string p1, ""

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    const-string p1, "dark"

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    const-string p1, "light"

    .line 82
    .line 83
    :goto_0
    iget-object v0, p0, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object v1, v0, Lu1/r1;->a:Lco/median/android/MainActivity;

    .line 89
    .line 90
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v1}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    const v4, 0x7f0603d5

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v4, v2}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-virtual {v0, v3}, Lu1/r1;->c(I)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const v3, 0x7f0603df

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v3, v2}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-virtual {v0, v1}, Lu1/r1;->d(I)V

    .line 120
    .line 121
    .line 122
    invoke-static {p1}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    const/4 v2, 0x0

    .line 127
    const-string v3, "insetsController"

    .line 128
    .line 129
    if-eqz v1, :cond_3

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    iput-object p1, v0, Lu1/r1;->l:Ljava/lang/String;

    .line 133
    .line 134
    iget-object v1, v0, Lu1/r1;->e:La3/h0;

    .line 135
    .line 136
    if-eqz v1, :cond_8

    .line 137
    .line 138
    invoke-virtual {v0, p1}, Lu1/r1;->b(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    iget-object v1, v1, La3/h0;->g:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v1, Le4/a;

    .line 145
    .line 146
    invoke-virtual {v1, v4}, Le4/a;->c0(Z)V

    .line 147
    .line 148
    .line 149
    :goto_1
    invoke-static {p1}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_4

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    iput-object p1, v0, Lu1/r1;->m:Ljava/lang/String;

    .line 157
    .line 158
    iget-object v1, v0, Lu1/r1;->e:La3/h0;

    .line 159
    .line 160
    if-eqz v1, :cond_7

    .line 161
    .line 162
    invoke-virtual {v0, p1}, Lu1/r1;->b(Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    iget-object v0, v1, La3/h0;->g:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Le4/a;

    .line 169
    .line 170
    invoke-virtual {v0, p1}, Le4/a;->b0(Z)V

    .line 171
    .line 172
    .line 173
    :goto_2
    iget-object p1, p0, Lco/median/android/MainActivity;->R:Lu1/e;

    .line 174
    .line 175
    iget-object v0, p1, Lu1/e;->a:Lco/median/android/MainActivity;

    .line 176
    .line 177
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    const v2, 0x7f0603e3

    .line 182
    .line 183
    .line 184
    invoke-static {v0, v2}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    iput v2, p1, Lu1/e;->k:I

    .line 189
    .line 190
    iget-object v2, p1, Lu1/e;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 191
    .line 192
    invoke-virtual {v0}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    const v4, 0x7f060037

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3, v4, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    if-eqz v1, :cond_5

    .line 211
    .line 212
    iget v2, p1, Lu1/e;->k:I

    .line 213
    .line 214
    invoke-static {v2}, Le4/a;->n(I)Landroid/graphics/ColorFilter;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 219
    .line 220
    .line 221
    :cond_5
    iget-object p1, p1, Lu1/e;->f:Landroid/widget/ImageView;

    .line 222
    .line 223
    const v1, 0x7f08009f

    .line 224
    .line 225
    .line 226
    invoke-static {v0, v1}, Lu1/h0;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Le/j;->invalidateOptionsMenu()V

    .line 234
    .line 235
    .line 236
    iget-object p1, p0, Lco/median/android/MainActivity;->Q:Lu1/w1;

    .line 237
    .line 238
    iget-object v0, p1, Lu1/w1;->a:Lco/median/android/MainActivity;

    .line 239
    .line 240
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    iget-object v2, p1, Lu1/w1;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 245
    .line 246
    invoke-virtual {v0}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    const v4, 0x7f0603e0

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3, v4, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    const v4, 0x7f0603e2

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3, v4, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 268
    .line 269
    .line 270
    move-result v3

    .line 271
    iput v3, p1, Lu1/w1;->m:I

    .line 272
    .line 273
    invoke-virtual {v0}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    const v4, 0x7f0603e1

    .line 278
    .line 279
    .line 280
    invoke-virtual {v3, v4, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    const v3, 0x10100a0

    .line 285
    .line 286
    .line 287
    filled-new-array {v3}, [I

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    const v5, -0x10100a0

    .line 292
    .line 293
    .line 294
    filled-new-array {v5}, [I

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    filled-new-array {v4, v5}, [[I

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    iget p1, p1, Lu1/w1;->m:I

    .line 303
    .line 304
    filled-new-array {v1, p1}, [I

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    new-instance v5, Landroid/content/res/ColorStateList;

    .line 309
    .line 310
    invoke-direct {v5, v4, p1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, v5}, Lcom/google/android/material/navigation/d;->setItemIconTintList(Landroid/content/res/ColorStateList;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2, v5}, Lcom/google/android/material/navigation/d;->setItemTextColor(Landroid/content/res/ColorStateList;)V

    .line 317
    .line 318
    .line 319
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 320
    .line 321
    const/16 v4, 0x1d

    .line 322
    .line 323
    if-lt p1, v4, :cond_6

    .line 324
    .line 325
    invoke-virtual {v0}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    invoke-static {p1}, Lp0/c1;->a(Landroid/content/res/Resources;)F

    .line 330
    .line 331
    .line 332
    move-result p1

    .line 333
    goto :goto_3

    .line 334
    :cond_6
    const p1, 0x3ec28f5c    # 0.38f

    .line 335
    .line 336
    .line 337
    :goto_3
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    int-to-float v0, v0

    .line 342
    mul-float/2addr v0, p1

    .line 343
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    const v4, 0xffffff

    .line 348
    .line 349
    .line 350
    and-int/2addr v4, v1

    .line 351
    shl-int/lit8 v0, v0, 0x18

    .line 352
    .line 353
    or-int/2addr v0, v4

    .line 354
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    int-to-float v1, v1

    .line 359
    mul-float/2addr v1, p1

    .line 360
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 361
    .line 362
    .line 363
    move-result p1

    .line 364
    shl-int/lit8 p1, p1, 0x18

    .line 365
    .line 366
    or-int/2addr p1, v4

    .line 367
    const v1, 0x10102fe

    .line 368
    .line 369
    .line 370
    filled-new-array {v1}, [I

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    filled-new-array {v3}, [I

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    filled-new-array {v1, v3}, [[I

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    filled-new-array {v0, p1}, [I

    .line 383
    .line 384
    .line 385
    move-result-object p1

    .line 386
    new-instance v0, Landroid/content/res/ColorStateList;

    .line 387
    .line 388
    invoke-direct {v0, v1, p1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 389
    .line 390
    .line 391
    const/4 p1, 0x1

    .line 392
    invoke-virtual {v2, p1}, Lcom/google/android/material/navigation/d;->setItemActiveIndicatorEnabled(Z)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v2, v0}, Lcom/google/android/material/navigation/d;->setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V

    .line 396
    .line 397
    .line 398
    iget-object p1, p0, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 399
    .line 400
    iget-object v0, p1, Lu1/q1;->a:Lco/median/android/MainActivity;

    .line 401
    .line 402
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    iget-object v2, p1, Lu1/q1;->d:Lcom/google/android/material/navigation/NavigationView;

    .line 407
    .line 408
    invoke-virtual {v0}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    const v3, 0x7f0603d0

    .line 413
    .line 414
    .line 415
    invoke-virtual {v0, v3, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 416
    .line 417
    .line 418
    move-result v0

    .line 419
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 420
    .line 421
    .line 422
    iget-object p1, p1, Lu1/q1;->f:Lu1/i0;

    .line 423
    .line 424
    iget-object v0, p1, Lu1/i0;->a:Lco/median/android/MainActivity;

    .line 425
    .line 426
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    invoke-virtual {v0}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    const v4, 0x7f0603d1

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2, v4, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    iput v2, p1, Lu1/i0;->f:I

    .line 442
    .line 443
    invoke-virtual {v0}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    invoke-virtual {v2, v3, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 448
    .line 449
    .line 450
    move-result v2

    .line 451
    iput v2, p1, Lu1/i0;->g:I

    .line 452
    .line 453
    invoke-virtual {v0}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    const v2, 0x7f0603d2

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    iput v0, p1, Lu1/i0;->e:I

    .line 465
    .line 466
    invoke-virtual {p1}, Landroid/widget/BaseExpandableListAdapter;->notifyDataSetChanged()V

    .line 467
    .line 468
    .line 469
    iget-object p1, p0, Lco/median/android/MainActivity;->A0:Ljava/lang/String;

    .line 470
    .line 471
    invoke-virtual {p0, p1}, Lco/median/android/MainActivity;->k0(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    return-void

    .line 475
    :cond_7
    invoke-static {v3}, Lr3/g;->c(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    throw v2

    .line 479
    :cond_8
    invoke-static {v3}, Lr3/g;->c(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    throw v2

    .line 483
    :cond_9
    invoke-static {v0}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 484
    .line 485
    .line 486
    move-result-object p1

    .line 487
    throw p1
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-static {v1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 14
    .line 15
    iget-object v4, v0, Lco/median/android/GoNativeApplication;->j:Landroidx/emoji2/text/x;

    .line 16
    .line 17
    iget-object v5, v0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    const-string v7, "isRoot"

    .line 24
    .line 25
    const/4 v8, 0x1

    .line 26
    invoke-virtual {v6, v7, v8}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    iput-boolean v6, v1, Lco/median/android/MainActivity;->T:Z

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    const-string v9, "source"

    .line 37
    .line 38
    invoke-virtual {v6, v9}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    iput-object v6, v1, Lco/median/android/MainActivity;->y0:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    const-string v6, "default"

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object v6, v1, Lco/median/android/MainActivity;->y0:Ljava/lang/String;

    .line 54
    .line 55
    :goto_0
    iput-object v6, v1, Lco/median/android/MainActivity;->y0:Ljava/lang/String;

    .line 56
    .line 57
    iget-boolean v6, v1, Lco/median/android/MainActivity;->T:Z

    .line 58
    .line 59
    const/4 v9, 0x2

    .line 60
    const/4 v10, 0x0

    .line 61
    if-eqz v6, :cond_4

    .line 62
    .line 63
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 64
    .line 65
    const/16 v11, 0x1f

    .line 66
    .line 67
    if-lt v6, v11, :cond_1

    .line 68
    .line 69
    new-instance v6, Lm0/f;

    .line 70
    .line 71
    invoke-direct {v6, v1}, Lm0/f;-><init>(Lco/median/android/MainActivity;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    new-instance v6, Li1/a;

    .line 76
    .line 77
    invoke-direct {v6, v1}, Li1/a;-><init>(Lco/median/android/MainActivity;)V

    .line 78
    .line 79
    .line 80
    :goto_1
    invoke-virtual {v6}, Li1/a;->a()V

    .line 81
    .line 82
    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    const-string v11, "configurationChanged"

    .line 86
    .line 87
    invoke-virtual {v2, v11, v10}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 88
    .line 89
    .line 90
    move-result v11

    .line 91
    if-eqz v11, :cond_2

    .line 92
    .line 93
    move v11, v8

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    move v11, v10

    .line 96
    :goto_2
    iget-object v12, v3, Lx1/a;->z0:Lz1/f;

    .line 97
    .line 98
    iget-boolean v12, v12, Lz1/f;->a:Z

    .line 99
    .line 100
    if-eqz v12, :cond_3

    .line 101
    .line 102
    if-nez v11, :cond_3

    .line 103
    .line 104
    new-instance v11, Lp1/h;

    .line 105
    .line 106
    invoke-direct {v11, v1, v0}, Lp1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6, v11}, Li1/a;->e(Lp1/h;)V

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_3
    new-instance v11, Lu1/v0;

    .line 114
    .line 115
    invoke-direct {v11, v1, v10}, Lu1/v0;-><init>(Lco/median/android/MainActivity;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6, v11}, Li1/a;->d(Lu1/v0;)V

    .line 119
    .line 120
    .line 121
    new-instance v6, Landroid/os/Handler;

    .line 122
    .line 123
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    invoke-direct {v6, v11}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 128
    .line 129
    .line 130
    new-instance v11, Lu1/t0;

    .line 131
    .line 132
    invoke-direct {v11, v1, v9}, Lu1/t0;-><init>(Lco/median/android/MainActivity;I)V

    .line 133
    .line 134
    .line 135
    const-wide/16 v12, 0x1b58

    .line 136
    .line 137
    invoke-virtual {v6, v11, v12, v13}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 138
    .line 139
    .line 140
    :cond_4
    :goto_3
    new-instance v6, Lu1/r1;

    .line 141
    .line 142
    invoke-direct {v6, v1}, Lu1/r1;-><init>(Lco/median/android/MainActivity;)V

    .line 143
    .line 144
    .line 145
    iput-object v6, v1, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 146
    .line 147
    invoke-virtual {v1}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    const v12, 0x7f0603d5

    .line 152
    .line 153
    .line 154
    const/4 v13, 0x0

    .line 155
    invoke-virtual {v11, v12, v13}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    iget-object v12, v6, Lu1/r1;->l:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6, v11, v12}, Lu1/r1;->a(ILjava/lang/String;)Landroidx/activity/m0;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    iput-object v11, v6, Lu1/r1;->f:Landroidx/activity/m0;

    .line 169
    .line 170
    invoke-virtual {v1}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 171
    .line 172
    .line 173
    move-result-object v11

    .line 174
    const v12, 0x7f0603df

    .line 175
    .line 176
    .line 177
    invoke-virtual {v11, v12, v13}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 178
    .line 179
    .line 180
    move-result v11

    .line 181
    iget-object v12, v6, Lu1/r1;->m:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6, v11, v12}, Lu1/r1;->a(ILjava/lang/String;)Landroidx/activity/m0;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    iput-object v11, v6, Lu1/r1;->g:Landroidx/activity/m0;

    .line 191
    .line 192
    iget-object v6, v6, Lu1/r1;->f:Landroidx/activity/m0;

    .line 193
    .line 194
    if-eqz v6, :cond_2c

    .line 195
    .line 196
    invoke-static {v1, v6, v11}, Landroidx/activity/t;->a(Landroidx/activity/q;Landroidx/activity/m0;Landroidx/activity/m0;)V

    .line 197
    .line 198
    .line 199
    iget-boolean v6, v3, Lx1/a;->s:Z

    .line 200
    .line 201
    iget-boolean v11, v3, Lx1/a;->l1:Z

    .line 202
    .line 203
    if-eqz v6, :cond_5

    .line 204
    .line 205
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    const/16 v12, 0x80

    .line 210
    .line 211
    invoke-virtual {v6, v12}, Landroid/view/Window;->addFlags(I)V

    .line 212
    .line 213
    .line 214
    :cond_5
    iget v6, v3, Lx1/a;->y0:F

    .line 215
    .line 216
    iput v6, v1, Lco/median/android/MainActivity;->W:F

    .line 217
    .line 218
    invoke-static {v1}, Lt2/i;->j(Landroid/content/ContextWrapper;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    iput-object v6, v1, Lco/median/android/MainActivity;->A0:Ljava/lang/String;

    .line 223
    .line 224
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 225
    .line 226
    const/16 v12, 0x1e

    .line 227
    .line 228
    const-string v14, "co.median.android.MainActivity"

    .line 229
    .line 230
    if-gt v6, v12, :cond_8

    .line 231
    .line 232
    if-eqz v2, :cond_6

    .line 233
    .line 234
    const-string v12, "ignoreThemeSetup"

    .line 235
    .line 236
    invoke-virtual {v2, v12, v10}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 237
    .line 238
    .line 239
    move-result v12

    .line 240
    goto :goto_4

    .line 241
    :cond_6
    move v12, v10

    .line 242
    :goto_4
    if-eqz v12, :cond_7

    .line 243
    .line 244
    const-string v12, "onCreate: configuration change from setupAppTheme(), ignoring theme setup"

    .line 245
    .line 246
    invoke-static {v14, v12}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 247
    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_7
    iget-object v12, v1, Lco/median/android/MainActivity;->A0:Ljava/lang/String;

    .line 251
    .line 252
    invoke-static {v12}, Lt2/i;->M(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    :cond_8
    :goto_5
    invoke-super/range {p0 .. p1}, Landroidx/fragment/app/e0;->onCreate(Landroid/os/Bundle;)V

    .line 256
    .line 257
    .line 258
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 259
    .line 260
    .line 261
    move-result-object v12

    .line 262
    invoke-virtual {v12}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v12

    .line 266
    iput-object v12, v1, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 269
    .line 270
    .line 271
    move-result-object v12

    .line 272
    const-string v15, "urlLevel"

    .line 273
    .line 274
    move-object/from16 v16, v13

    .line 275
    .line 276
    const/4 v13, -0x1

    .line 277
    invoke-virtual {v12, v15, v13}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 278
    .line 279
    .line 280
    move-result v12

    .line 281
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    const-string v9, "parentUrlLevel"

    .line 286
    .line 287
    invoke-virtual {v8, v9, v13}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 288
    .line 289
    .line 290
    move-result v8

    .line 291
    if-eqz v2, :cond_9

    .line 292
    .line 293
    const-string v13, "activityId"

    .line 294
    .line 295
    iget-object v10, v1, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 296
    .line 297
    invoke-virtual {v2, v13, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v10

    .line 301
    iput-object v10, v1, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 302
    .line 303
    iget-boolean v10, v1, Lco/median/android/MainActivity;->T:Z

    .line 304
    .line 305
    invoke-virtual {v2, v7, v10}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 306
    .line 307
    .line 308
    move-result v7

    .line 309
    iput-boolean v7, v1, Lco/median/android/MainActivity;->T:Z

    .line 310
    .line 311
    invoke-virtual {v2, v15, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 312
    .line 313
    .line 314
    move-result v12

    .line 315
    invoke-virtual {v2, v9, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 316
    .line 317
    .line 318
    move-result v8

    .line 319
    :cond_9
    iget-object v7, v1, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 320
    .line 321
    iget-boolean v9, v1, Lco/median/android/MainActivity;->T:Z

    .line 322
    .line 323
    iget-object v10, v4, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v10, Ljava/util/LinkedHashMap;

    .line 326
    .line 327
    iget-object v4, v4, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v4, Ljava/util/LinkedHashMap;

    .line 330
    .line 331
    new-instance v13, Lu1/g0;

    .line 332
    .line 333
    invoke-direct {v13, v7, v9}, Lu1/g0;-><init>(Ljava/lang/String;Z)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v10, v7, v13}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    iget-object v7, v1, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 340
    .line 341
    invoke-virtual {v4, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    check-cast v7, Lu1/g0;

    .line 346
    .line 347
    if-eqz v7, :cond_a

    .line 348
    .line 349
    iput v12, v7, Lu1/g0;->c:I

    .line 350
    .line 351
    iput v8, v7, Lu1/g0;->d:I

    .line 352
    .line 353
    :cond_a
    iget-boolean v7, v3, Lx1/a;->D:Z

    .line 354
    .line 355
    if-eqz v7, :cond_b

    .line 356
    .line 357
    iget-object v7, v1, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 358
    .line 359
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 360
    .line 361
    .line 362
    move-result-object v8

    .line 363
    const-string v9, "ignoreInterceptMaxWindows"

    .line 364
    .line 365
    const/4 v10, 0x0

    .line 366
    invoke-virtual {v8, v9, v10}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 367
    .line 368
    .line 369
    move-result v8

    .line 370
    invoke-virtual {v4, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    check-cast v4, Lu1/g0;

    .line 375
    .line 376
    if-eqz v4, :cond_b

    .line 377
    .line 378
    iput-boolean v8, v4, Lu1/g0;->e:Z

    .line 379
    .line 380
    :cond_b
    iget-boolean v4, v1, Lco/median/android/MainActivity;->T:Z

    .line 381
    .line 382
    if-eqz v4, :cond_c

    .line 383
    .line 384
    invoke-virtual {v1}, Lco/median/android/MainActivity;->I()V

    .line 385
    .line 386
    .line 387
    :cond_c
    iget-object v4, v0, Lco/median/android/GoNativeApplication;->f:Lu1/s0;

    .line 388
    .line 389
    iput-object v4, v1, Lco/median/android/MainActivity;->b0:Lu1/s0;

    .line 390
    .line 391
    new-instance v4, Lu1/w;

    .line 392
    .line 393
    invoke-direct {v4, v1}, Lu1/w;-><init>(Lco/median/android/MainActivity;)V

    .line 394
    .line 395
    .line 396
    iput-object v4, v1, Lco/median/android/MainActivity;->a0:Lu1/w;

    .line 397
    .line 398
    new-instance v4, Lu1/o;

    .line 399
    .line 400
    invoke-direct {v4, v1}, Lu1/o;-><init>(Lco/median/android/MainActivity;)V

    .line 401
    .line 402
    .line 403
    iput-object v4, v1, Lco/median/android/MainActivity;->Z:Lu1/o;

    .line 404
    .line 405
    new-instance v4, Landroidx/emoji2/text/t;

    .line 406
    .line 407
    invoke-direct {v4, v1}, Landroidx/emoji2/text/t;-><init>(Lco/median/android/MainActivity;)V

    .line 408
    .line 409
    .line 410
    iput-object v4, v1, Lco/median/android/MainActivity;->z0:Landroidx/emoji2/text/t;

    .line 411
    .line 412
    new-instance v4, Landroidx/fragment/app/r0;

    .line 413
    .line 414
    const/4 v7, 0x2

    .line 415
    invoke-direct {v4, v7}, Landroidx/fragment/app/r0;-><init>(I)V

    .line 416
    .line 417
    .line 418
    new-instance v8, Lu1/v0;

    .line 419
    .line 420
    const/4 v9, 0x1

    .line 421
    invoke-direct {v8, v1, v9}, Lu1/v0;-><init>(Lco/median/android/MainActivity;I)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v1, v4, v8}, Landroidx/activity/q;->s(Lc/a;Lb/b;)Lb/c;

    .line 425
    .line 426
    .line 427
    move-result-object v4

    .line 428
    check-cast v4, Lb/g;

    .line 429
    .line 430
    iput-object v4, v1, Lco/median/android/MainActivity;->s0:Lb/g;

    .line 431
    .line 432
    new-instance v4, Landroidx/fragment/app/r0;

    .line 433
    .line 434
    const/4 v8, 0x3

    .line 435
    invoke-direct {v4, v8}, Landroidx/fragment/app/r0;-><init>(I)V

    .line 436
    .line 437
    .line 438
    new-instance v9, Lu1/v0;

    .line 439
    .line 440
    invoke-direct {v9, v1, v7}, Lu1/v0;-><init>(Lco/median/android/MainActivity;I)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v1, v4, v9}, Landroidx/activity/q;->s(Lc/a;Lb/b;)Lb/c;

    .line 444
    .line 445
    .line 446
    move-result-object v4

    .line 447
    check-cast v4, Lb/g;

    .line 448
    .line 449
    iput-object v4, v1, Lco/median/android/MainActivity;->t0:Lb/g;

    .line 450
    .line 451
    new-instance v4, Lu1/r0;

    .line 452
    .line 453
    invoke-direct {v4, v1}, Lu1/r0;-><init>(Lco/median/android/MainActivity;)V

    .line 454
    .line 455
    .line 456
    iput-object v4, v1, Lco/median/android/MainActivity;->k0:Lu1/r0;

    .line 457
    .line 458
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->h:Lu1/h2;

    .line 459
    .line 460
    iget-boolean v4, v0, Lu1/h2;->b:Z

    .line 461
    .line 462
    if-eqz v4, :cond_d

    .line 463
    .line 464
    goto :goto_6

    .line 465
    :cond_d
    const/4 v9, 0x1

    .line 466
    iput-boolean v9, v0, Lu1/h2;->b:Z

    .line 467
    .line 468
    new-instance v4, Lk/a;

    .line 469
    .line 470
    invoke-direct {v4, v1}, Lk/a;-><init>(Lco/median/android/MainActivity;)V

    .line 471
    .line 472
    .line 473
    iput-object v4, v0, Lu1/h2;->a:Lk/a;

    .line 474
    .line 475
    new-instance v4, Ljava/util/HashMap;

    .line 476
    .line 477
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 478
    .line 479
    .line 480
    iput-object v4, v0, Lu1/h2;->c:Ljava/util/HashMap;

    .line 481
    .line 482
    new-instance v4, Ljava/util/HashMap;

    .line 483
    .line 484
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 485
    .line 486
    .line 487
    iput-object v4, v0, Lu1/h2;->d:Ljava/util/HashMap;

    .line 488
    .line 489
    new-instance v4, Ljava/util/ArrayList;

    .line 490
    .line 491
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 492
    .line 493
    .line 494
    iput-object v4, v0, Lu1/h2;->f:Ljava/util/ArrayList;

    .line 495
    .line 496
    new-instance v4, Ljava/util/HashSet;

    .line 497
    .line 498
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 499
    .line 500
    .line 501
    iput-object v4, v0, Lu1/h2;->g:Ljava/util/HashSet;

    .line 502
    .line 503
    invoke-static {v1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    new-instance v7, Lu1/g2;

    .line 508
    .line 509
    invoke-direct {v7, v0, v1}, Lu1/g2;-><init>(Lu1/h2;Lco/median/android/MainActivity;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v4, v7}, Lx1/a;->i(Lx1/e;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v0, v1}, Lu1/h2;->b(Lco/median/android/MainActivity;)V

    .line 516
    .line 517
    .line 518
    :goto_6
    const-string v0, "connectivity"

    .line 519
    .line 520
    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 525
    .line 526
    iput-object v0, v1, Lco/median/android/MainActivity;->P:Landroid/net/ConnectivityManager;

    .line 527
    .line 528
    const v0, 0x7f0c001c

    .line 529
    .line 530
    .line 531
    invoke-virtual {v1, v0}, Le/j;->setContentView(I)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v5}, Lu1/x;->a()Ljava/util/List;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    check-cast v0, Ljava/util/ArrayList;

    .line 539
    .line 540
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 545
    .line 546
    .line 547
    move-result v4

    .line 548
    if-nez v4, :cond_2b

    .line 549
    .line 550
    const v0, 0x1020002

    .line 551
    .line 552
    .line 553
    invoke-virtual {v1, v0}, Le/j;->findViewById(I)Landroid/view/View;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    move-object v4, v0

    .line 558
    check-cast v4, Landroid/view/ViewGroup;

    .line 559
    .line 560
    iget-object v0, v1, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 561
    .line 562
    iget-object v7, v0, Lu1/r1;->a:Lco/median/android/MainActivity;

    .line 563
    .line 564
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    const v9, 0x7f09011a

    .line 568
    .line 569
    .line 570
    invoke-virtual {v4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 571
    .line 572
    .line 573
    move-result-object v9

    .line 574
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    check-cast v9, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 578
    .line 579
    iput-object v9, v0, Lu1/r1;->j:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 580
    .line 581
    const v9, 0x7f0901f4

    .line 582
    .line 583
    .line 584
    invoke-virtual {v4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 585
    .line 586
    .line 587
    move-result-object v9

    .line 588
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    iput-object v9, v0, Lu1/r1;->h:Landroid/view/View;

    .line 592
    .line 593
    const v9, 0x7f0901fd

    .line 594
    .line 595
    .line 596
    invoke-virtual {v4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 597
    .line 598
    .line 599
    move-result-object v9

    .line 600
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    iput-object v9, v0, Lu1/r1;->i:Landroid/view/View;

    .line 604
    .line 605
    const v9, 0x7f09015f

    .line 606
    .line 607
    .line 608
    invoke-virtual {v4, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 609
    .line 610
    .line 611
    move-result-object v9

    .line 612
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    iput-object v9, v0, Lu1/r1;->k:Landroid/view/View;

    .line 616
    .line 617
    iget-boolean v9, v0, Lu1/r1;->b:Z

    .line 618
    .line 619
    const/16 v10, 0x8

    .line 620
    .line 621
    if-nez v9, :cond_10

    .line 622
    .line 623
    iget-object v9, v0, Lu1/r1;->h:Landroid/view/View;

    .line 624
    .line 625
    if-eqz v9, :cond_f

    .line 626
    .line 627
    invoke-virtual {v9, v10}, Landroid/view/View;->setVisibility(I)V

    .line 628
    .line 629
    .line 630
    iget-object v9, v0, Lu1/r1;->i:Landroid/view/View;

    .line 631
    .line 632
    if-eqz v9, :cond_e

    .line 633
    .line 634
    invoke-virtual {v9, v10}, Landroid/view/View;->setVisibility(I)V

    .line 635
    .line 636
    .line 637
    goto :goto_7

    .line 638
    :cond_e
    const-string v0, "systemNavBarBackgroundView"

    .line 639
    .line 640
    invoke-static {v0}, Lr3/g;->c(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    throw v16

    .line 644
    :cond_f
    const-string v0, "statusBarBackgroundView"

    .line 645
    .line 646
    invoke-static {v0}, Lr3/g;->c(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    throw v16

    .line 650
    :cond_10
    :goto_7
    new-instance v9, Ld3/a0;

    .line 651
    .line 652
    invoke-direct {v9, v10, v0}, Ld3/a0;-><init>(ILjava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    sget-object v10, Lp0/p0;->a:Ljava/util/WeakHashMap;

    .line 656
    .line 657
    invoke-static {v4, v9}, Lp0/h0;->c(Landroid/view/View;Lp0/q;)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v7}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 661
    .line 662
    .line 663
    move-result-object v9

    .line 664
    invoke-virtual {v7}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 665
    .line 666
    .line 667
    move-result-object v10

    .line 668
    invoke-virtual {v10}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 669
    .line 670
    .line 671
    move-result-object v10

    .line 672
    new-instance v12, La3/h0;

    .line 673
    .line 674
    invoke-direct {v12, v9, v10}, La3/h0;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 675
    .line 676
    .line 677
    iput-object v12, v0, Lu1/r1;->e:La3/h0;

    .line 678
    .line 679
    const/16 v0, 0x1d

    .line 680
    .line 681
    if-lt v6, v0, :cond_11

    .line 682
    .line 683
    invoke-virtual {v7}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 684
    .line 685
    .line 686
    move-result-object v7

    .line 687
    invoke-static {v7}, Lp0/c1;->k(Landroid/view/Window;)V

    .line 688
    .line 689
    .line 690
    :cond_11
    iget-boolean v7, v3, Lx1/a;->t:Z

    .line 691
    .line 692
    if-eqz v7, :cond_12

    .line 693
    .line 694
    const/4 v9, 0x1

    .line 695
    invoke-virtual {v1, v9}, Lco/median/android/MainActivity;->s0(Z)V

    .line 696
    .line 697
    .line 698
    :cond_12
    invoke-virtual {v1}, Lco/median/android/MainActivity;->c0()V

    .line 699
    .line 700
    .line 701
    const v7, 0x7f0900e3

    .line 702
    .line 703
    .line 704
    invoke-virtual {v1, v7}, Le/j;->findViewById(I)Landroid/view/View;

    .line 705
    .line 706
    .line 707
    move-result-object v7

    .line 708
    check-cast v7, Landroid/widget/RelativeLayout;

    .line 709
    .line 710
    iput-object v7, v1, Lco/median/android/MainActivity;->O:Landroid/widget/RelativeLayout;

    .line 711
    .line 712
    const v7, 0x7f0901fb

    .line 713
    .line 714
    .line 715
    invoke-virtual {v1, v7}, Le/j;->findViewById(I)Landroid/view/View;

    .line 716
    .line 717
    .line 718
    move-result-object v7

    .line 719
    check-cast v7, Lco/median/android/MySwipeRefreshLayout;

    .line 720
    .line 721
    iput-object v7, v1, Lco/median/android/MainActivity;->M:Lco/median/android/MySwipeRefreshLayout;

    .line 722
    .line 723
    iget-boolean v9, v3, Lx1/a;->B:Z

    .line 724
    .line 725
    invoke-virtual {v7, v9}, Lw1/h;->setEnabled(Z)V

    .line 726
    .line 727
    .line 728
    iget-object v7, v1, Lco/median/android/MainActivity;->M:Lco/median/android/MySwipeRefreshLayout;

    .line 729
    .line 730
    invoke-virtual {v7, v1}, Lw1/h;->setOnRefreshListener(Lw1/g;)V

    .line 731
    .line 732
    .line 733
    iget-object v7, v1, Lco/median/android/MainActivity;->M:Lco/median/android/MySwipeRefreshLayout;

    .line 734
    .line 735
    new-instance v9, Lu1/v0;

    .line 736
    .line 737
    invoke-direct {v9, v1, v8}, Lu1/v0;-><init>(Lco/median/android/MainActivity;I)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v7, v9}, Lco/median/android/MySwipeRefreshLayout;->setCanChildScrollUpCallback(Lu1/i1;)V

    .line 741
    .line 742
    .line 743
    iget-object v7, v3, Lx1/a;->a:Landroid/content/Context;

    .line 744
    .line 745
    if-ge v6, v0, :cond_14

    .line 746
    .line 747
    :cond_13
    :goto_8
    const/4 v0, 0x0

    .line 748
    goto :goto_9

    .line 749
    :cond_14
    :try_start_0
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    const-string v6, "config_navBarInteractionMode"

    .line 754
    .line 755
    const-string v8, "integer"

    .line 756
    .line 757
    const-string v9, "android"

    .line 758
    .line 759
    invoke-virtual {v0, v6, v8, v9}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 760
    .line 761
    .line 762
    move-result v0

    .line 763
    if-lez v0, :cond_13

    .line 764
    .line 765
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 766
    .line 767
    .line 768
    move-result-object v6

    .line 769
    invoke-virtual {v6, v0}, Landroid/content/res/Resources;->getInteger(I)I

    .line 770
    .line 771
    .line 772
    move-result v0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 773
    const/4 v7, 0x2

    .line 774
    if-ne v0, v7, :cond_13

    .line 775
    .line 776
    const/4 v0, 0x1

    .line 777
    goto :goto_9

    .line 778
    :catch_0
    move-exception v0

    .line 779
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 780
    .line 781
    .line 782
    move-result-object v6

    .line 783
    const-string v7, "co.median.median_core.AppConfig"

    .line 784
    .line 785
    const-string v8, "isAndroidGestureEnabled: "

    .line 786
    .line 787
    invoke-virtual {v6, v7, v8, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 788
    .line 789
    .line 790
    goto :goto_8

    .line 791
    :goto_9
    if-eqz v0, :cond_15

    .line 792
    .line 793
    const/4 v10, 0x0

    .line 794
    iput-boolean v10, v3, Lx1/a;->C:Z

    .line 795
    .line 796
    :cond_15
    const v0, 0x7f0901fa

    .line 797
    .line 798
    .line 799
    invoke-virtual {v1, v0}, Le/j;->findViewById(I)Landroid/view/View;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    check-cast v0, Lco/median/android/widget/SwipeHistoryNavigationLayout;

    .line 804
    .line 805
    iput-object v0, v1, Lco/median/android/MainActivity;->N:Lco/median/android/widget/SwipeHistoryNavigationLayout;

    .line 806
    .line 807
    iget-boolean v6, v3, Lx1/a;->C:Z

    .line 808
    .line 809
    invoke-virtual {v0, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 810
    .line 811
    .line 812
    iget-object v0, v1, Lco/median/android/MainActivity;->N:Lco/median/android/widget/SwipeHistoryNavigationLayout;

    .line 813
    .line 814
    new-instance v6, Landroidx/emoji2/text/p;

    .line 815
    .line 816
    const/16 v7, 0x10

    .line 817
    .line 818
    const/4 v10, 0x0

    .line 819
    invoke-direct {v6, v1, v3, v7, v10}, Landroidx/emoji2/text/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 820
    .line 821
    .line 822
    invoke-virtual {v0, v6}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->setSwipeNavListener(Lw1/k;)V

    .line 823
    .line 824
    .line 825
    iget-object v0, v1, Lco/median/android/MainActivity;->M:Lco/median/android/MySwipeRefreshLayout;

    .line 826
    .line 827
    const v6, 0x7f0603c9

    .line 828
    .line 829
    .line 830
    invoke-static {v1, v6}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 831
    .line 832
    .line 833
    move-result v7

    .line 834
    filled-new-array {v7}, [I

    .line 835
    .line 836
    .line 837
    move-result-object v7

    .line 838
    invoke-virtual {v0, v7}, Lw1/h;->setColorSchemeColors([I)V

    .line 839
    .line 840
    .line 841
    iget-object v0, v1, Lco/median/android/MainActivity;->N:Lco/median/android/widget/SwipeHistoryNavigationLayout;

    .line 842
    .line 843
    invoke-static {v1, v6}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 844
    .line 845
    .line 846
    move-result v6

    .line 847
    invoke-virtual {v0, v6}, Lco/median/android/widget/SwipeHistoryNavigationLayout;->setActiveColor(I)V

    .line 848
    .line 849
    .line 850
    iget-object v0, v1, Lco/median/android/MainActivity;->M:Lco/median/android/MySwipeRefreshLayout;

    .line 851
    .line 852
    const v6, 0x7f0603d7

    .line 853
    .line 854
    .line 855
    invoke-static {v1, v6}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 856
    .line 857
    .line 858
    move-result v7

    .line 859
    invoke-virtual {v0, v7}, Lw1/h;->setProgressBackgroundColorSchemeColor(I)V

    .line 860
    .line 861
    .line 862
    iget-object v0, v1, Lco/median/android/MainActivity;->N:Lco/median/android/widget/SwipeHistoryNavigationLayout;

    .line 863
    .line 864
    invoke-static {v1, v6}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 865
    .line 866
    .line 867
    move-result v6

    .line 868
    invoke-virtual {v0, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 869
    .line 870
    .line 871
    const v0, 0x7f0901a5

    .line 872
    .line 873
    .line 874
    invoke-virtual {v1, v0}, Le/j;->findViewById(I)Landroid/view/View;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    check-cast v0, Lco/median/android/widget/MedianProgressView;

    .line 879
    .line 880
    iput-object v0, v1, Lco/median/android/MainActivity;->L:Lco/median/android/widget/MedianProgressView;

    .line 881
    .line 882
    invoke-virtual {v5}, Lu1/x;->a()Ljava/util/List;

    .line 883
    .line 884
    .line 885
    move-result-object v0

    .line 886
    check-cast v0, Ljava/util/ArrayList;

    .line 887
    .line 888
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 893
    .line 894
    .line 895
    move-result v6

    .line 896
    if-nez v6, :cond_2a

    .line 897
    .line 898
    iget-object v0, v1, Lco/median/android/MainActivity;->L:Lco/median/android/widget/MedianProgressView;

    .line 899
    .line 900
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 901
    .line 902
    .line 903
    new-instance v6, Lv2/k;

    .line 904
    .line 905
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 906
    .line 907
    .line 908
    move-result-object v7

    .line 909
    invoke-direct {v6, v7}, Lv2/e;-><init>(Landroid/content/Context;)V

    .line 910
    .line 911
    .line 912
    new-instance v7, Lv2/f;

    .line 913
    .line 914
    iget-object v8, v6, Lv2/e;->f:Lv2/l;

    .line 915
    .line 916
    invoke-direct {v7, v8}, Lv2/f;-><init>(Lv2/l;)V

    .line 917
    .line 918
    .line 919
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 920
    .line 921
    .line 922
    move-result-object v9

    .line 923
    new-instance v10, Lv2/s;

    .line 924
    .line 925
    iget v12, v8, Lv2/l;->q:I

    .line 926
    .line 927
    const/4 v13, 0x1

    .line 928
    if-ne v12, v13, :cond_16

    .line 929
    .line 930
    new-instance v12, Lv2/j;

    .line 931
    .line 932
    invoke-direct {v12, v9, v8}, Lv2/j;-><init>(Landroid/content/Context;Lv2/l;)V

    .line 933
    .line 934
    .line 935
    goto :goto_a

    .line 936
    :cond_16
    new-instance v12, Lv2/h;

    .line 937
    .line 938
    invoke-direct {v12, v8}, Lv2/h;-><init>(Lv2/l;)V

    .line 939
    .line 940
    .line 941
    :goto_a
    invoke-direct {v10, v9, v8}, Lv2/o;-><init>(Landroid/content/Context;Lv2/l;)V

    .line 942
    .line 943
    .line 944
    iput-object v7, v10, Lv2/s;->s:Lv2/f;

    .line 945
    .line 946
    iput-object v12, v10, Lv2/s;->t:Le/a0;

    .line 947
    .line 948
    iput-object v10, v12, Le/a0;->a:Ljava/lang/Object;

    .line 949
    .line 950
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 951
    .line 952
    .line 953
    move-result-object v9

    .line 954
    new-instance v12, Lq1/o;

    .line 955
    .line 956
    invoke-direct {v12}, Lq1/o;-><init>()V

    .line 957
    .line 958
    .line 959
    sget-object v13, Le0/l;->a:Ljava/lang/ThreadLocal;

    .line 960
    .line 961
    const v13, 0x7f0800b8

    .line 962
    .line 963
    .line 964
    move-object/from16 v15, v16

    .line 965
    .line 966
    invoke-virtual {v9, v13, v15}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 967
    .line 968
    .line 969
    move-result-object v9

    .line 970
    iput-object v9, v12, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 971
    .line 972
    new-instance v9, Lq1/n;

    .line 973
    .line 974
    iget-object v13, v12, Lq1/f;->f:Landroid/graphics/drawable/Drawable;

    .line 975
    .line 976
    invoke-virtual {v13}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 977
    .line 978
    .line 979
    move-result-object v13

    .line 980
    invoke-direct {v9, v13}, Lq1/n;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V

    .line 981
    .line 982
    .line 983
    iput-object v12, v10, Lv2/s;->u:Lq1/o;

    .line 984
    .line 985
    invoke-virtual {v6, v10}, Lv2/e;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 986
    .line 987
    .line 988
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 989
    .line 990
    .line 991
    move-result-object v9

    .line 992
    new-instance v10, Lv2/m;

    .line 993
    .line 994
    invoke-direct {v10, v9, v8, v7}, Lv2/m;-><init>(Landroid/content/Context;Lv2/l;Lv2/f;)V

    .line 995
    .line 996
    .line 997
    invoke-virtual {v6, v10}, Lv2/e;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 998
    .line 999
    .line 1000
    const/4 v9, 0x1

    .line 1001
    iput-boolean v9, v6, Lv2/e;->n:Z

    .line 1002
    .line 1003
    invoke-virtual {v6, v9}, Lv2/e;->setIndeterminate(Z)V

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v7

    .line 1010
    const v8, 0x7f0603c8

    .line 1011
    .line 1012
    .line 1013
    invoke-static {v7, v8}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 1014
    .line 1015
    .line 1016
    move-result v7

    .line 1017
    filled-new-array {v7}, [I

    .line 1018
    .line 1019
    .line 1020
    move-result-object v7

    .line 1021
    invoke-virtual {v6, v7}, Lv2/e;->setIndicatorColor([I)V

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1025
    .line 1026
    .line 1027
    new-instance v0, Lu1/j2;

    .line 1028
    .line 1029
    const/4 v15, 0x0

    .line 1030
    invoke-direct {v0, v15, v15}, Ljava/net/CookieManager;-><init>(Ljava/net/CookieStore;Ljava/net/CookiePolicy;)V

    .line 1031
    .line 1032
    .line 1033
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v6

    .line 1037
    iput-object v6, v0, Lu1/j2;->a:Landroid/webkit/CookieManager;

    .line 1038
    .line 1039
    invoke-static {v0}, Ljava/net/CookieHandler;->setDefault(Ljava/net/CookieHandler;)V

    .line 1040
    .line 1041
    .line 1042
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v0

    .line 1046
    const-string v6, "postLoadJavascript"

    .line 1047
    .line 1048
    invoke-virtual {v0, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v0

    .line 1052
    iput-object v0, v1, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 1053
    .line 1054
    iput-object v0, v1, Lco/median/android/MainActivity;->i0:Ljava/lang/String;

    .line 1055
    .line 1056
    new-instance v0, Ljava/util/Stack;

    .line 1057
    .line 1058
    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 1059
    .line 1060
    .line 1061
    iput-object v0, v1, Lco/median/android/MainActivity;->j0:Ljava/util/Stack;

    .line 1062
    .line 1063
    new-instance v0, Lu1/w1;

    .line 1064
    .line 1065
    const v6, 0x7f09006e

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v1, v6}, Le/j;->findViewById(I)Landroid/view/View;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v6

    .line 1072
    check-cast v6, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 1073
    .line 1074
    invoke-direct {v0, v1, v6}, Lu1/w1;-><init>(Lco/median/android/MainActivity;Lcom/google/android/material/bottomnavigation/BottomNavigationView;)V

    .line 1075
    .line 1076
    .line 1077
    iput-object v0, v1, Lco/median/android/MainActivity;->Q:Lu1/w1;

    .line 1078
    .line 1079
    const/4 v10, 0x0

    .line 1080
    invoke-virtual {v0, v10}, Lu1/w1;->f(Z)V

    .line 1081
    .line 1082
    .line 1083
    new-instance v0, Lu1/e;

    .line 1084
    .line 1085
    invoke-direct {v0, v1}, Lu1/e;-><init>(Lco/median/android/MainActivity;)V

    .line 1086
    .line 1087
    .line 1088
    iput-object v0, v1, Lco/median/android/MainActivity;->R:Lu1/e;

    .line 1089
    .line 1090
    iget-boolean v6, v1, Lco/median/android/MainActivity;->T:Z

    .line 1091
    .line 1092
    invoke-virtual {v0, v6}, Lu1/e;->d(Z)V

    .line 1093
    .line 1094
    .line 1095
    new-instance v0, Lu1/q1;

    .line 1096
    .line 1097
    invoke-direct {v0, v1}, Lu1/q1;-><init>(Lco/median/android/MainActivity;)V

    .line 1098
    .line 1099
    .line 1100
    iput-object v0, v1, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 1101
    .line 1102
    iget-boolean v6, v1, Lco/median/android/MainActivity;->T:Z

    .line 1103
    .line 1104
    invoke-virtual {v0, v6}, Lu1/q1;->c(Z)V

    .line 1105
    .line 1106
    .line 1107
    iget-boolean v0, v3, Lx1/a;->m0:Z

    .line 1108
    .line 1109
    if-nez v0, :cond_17

    .line 1110
    .line 1111
    iget-boolean v0, v3, Lx1/a;->H:Z

    .line 1112
    .line 1113
    if-nez v0, :cond_17

    .line 1114
    .line 1115
    invoke-virtual {v1}, Le/j;->v()Lu1/h0;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v0

    .line 1119
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {v0}, Lu1/h0;->E()V

    .line 1123
    .line 1124
    .line 1125
    :cond_17
    const v0, 0x7f090246

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {v1, v0}, Le/j;->findViewById(I)Landroid/view/View;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v0

    .line 1132
    iput-object v0, v1, Lco/median/android/MainActivity;->J:Landroid/view/View;

    .line 1133
    .line 1134
    const v0, 0x7f090245

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v1, v0}, Le/j;->findViewById(I)Landroid/view/View;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0

    .line 1141
    check-cast v0, Lco/median/android/widget/WebViewContainerView;

    .line 1142
    .line 1143
    iput-object v0, v1, Lco/median/android/MainActivity;->F:Lco/median/android/widget/WebViewContainerView;

    .line 1144
    .line 1145
    invoke-virtual {v0}, Lco/median/android/widget/WebViewContainerView;->getWebview()Lx1/i;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v0

    .line 1149
    iput-object v0, v1, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 1150
    .line 1151
    new-instance v0, Lu1/x1;

    .line 1152
    .line 1153
    iget-boolean v6, v3, Lx1/a;->z:Z

    .line 1154
    .line 1155
    const/16 v17, 0x1

    .line 1156
    .line 1157
    xor-int/lit8 v6, v6, 0x1

    .line 1158
    .line 1159
    invoke-direct {v0, v1, v6}, Lu1/x1;-><init>(Lco/median/android/MainActivity;Z)V

    .line 1160
    .line 1161
    .line 1162
    iput-object v0, v1, Lco/median/android/MainActivity;->C0:Lu1/x1;

    .line 1163
    .line 1164
    iget-object v0, v1, Lco/median/android/MainActivity;->F:Lco/median/android/widget/WebViewContainerView;

    .line 1165
    .line 1166
    iget-boolean v6, v1, Lco/median/android/MainActivity;->T:Z

    .line 1167
    .line 1168
    invoke-virtual {v0, v1, v6}, Lco/median/android/widget/WebViewContainerView;->a(Lco/median/android/MainActivity;Z)V

    .line 1169
    .line 1170
    .line 1171
    if-nez v11, :cond_18

    .line 1172
    .line 1173
    iget-object v0, v1, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 1174
    .line 1175
    check-cast v0, Lu1/o0;

    .line 1176
    .line 1177
    new-instance v6, Lu1/v0;

    .line 1178
    .line 1179
    const/4 v7, 0x4

    .line 1180
    invoke-direct {v6, v1, v7}, Lu1/v0;-><init>(Lco/median/android/MainActivity;I)V

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v0, v6}, Lu1/o0;->setOnScrollYEndListener(Lu1/m0;)V

    .line 1184
    .line 1185
    .line 1186
    :cond_18
    iget-object v0, v1, Lco/median/android/MainActivity;->A0:Ljava/lang/String;

    .line 1187
    .line 1188
    invoke-virtual {v1, v0}, Lco/median/android/MainActivity;->k0(Ljava/lang/String;)V

    .line 1189
    .line 1190
    .line 1191
    if-eqz v2, :cond_1a

    .line 1192
    .line 1193
    const-string v0, "webViewState"

    .line 1194
    .line 1195
    invoke-virtual {v2, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v0

    .line 1199
    if-eqz v0, :cond_19

    .line 1200
    .line 1201
    :try_start_1
    iget-object v6, v1, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 1202
    .line 1203
    check-cast v6, Lu1/o0;

    .line 1204
    .line 1205
    invoke-virtual {v6, v0}, Landroid/webkit/WebView;->restoreState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 1206
    .line 1207
    .line 1208
    const/4 v0, 0x1

    .line 1209
    goto :goto_b

    .line 1210
    :catch_1
    move-exception v0

    .line 1211
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v6

    .line 1215
    const-string v7, "Failed to restore webview state"

    .line 1216
    .line 1217
    invoke-virtual {v6, v14, v7, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1218
    .line 1219
    .line 1220
    :cond_19
    const/4 v0, 0x0

    .line 1221
    :goto_b
    const-string v6, "scrollX"

    .line 1222
    .line 1223
    const/4 v10, 0x0

    .line 1224
    invoke-virtual {v2, v6, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1225
    .line 1226
    .line 1227
    move-result v6

    .line 1228
    const-string v7, "scrollY"

    .line 1229
    .line 1230
    invoke-virtual {v2, v7, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1231
    .line 1232
    .line 1233
    move-result v2

    .line 1234
    iget-object v7, v1, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 1235
    .line 1236
    check-cast v7, Lu1/o0;

    .line 1237
    .line 1238
    invoke-virtual {v7, v6, v2}, Landroid/view/View;->scrollTo(II)V

    .line 1239
    .line 1240
    .line 1241
    goto :goto_c

    .line 1242
    :cond_1a
    const/4 v0, 0x0

    .line 1243
    :goto_c
    if-eqz v0, :cond_1b

    .line 1244
    .line 1245
    iget-object v0, v1, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 1246
    .line 1247
    invoke-interface {v0}, Lx1/i;->getUrl()Ljava/lang/String;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v0

    .line 1251
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1252
    .line 1253
    .line 1254
    move-result v0

    .line 1255
    if-nez v0, :cond_1b

    .line 1256
    .line 1257
    iget-object v0, v1, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 1258
    .line 1259
    invoke-interface {v0}, Lx1/i;->getUrl()Ljava/lang/String;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    goto/16 :goto_10

    .line 1264
    .line 1265
    :cond_1b
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v0

    .line 1269
    invoke-static {v0}, Lco/median/android/MainActivity;->H(Landroid/content/Intent;)Ljava/lang/String;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v2

    .line 1273
    if-nez v2, :cond_1c

    .line 1274
    .line 1275
    iget-boolean v6, v1, Lco/median/android/MainActivity;->T:Z

    .line 1276
    .line 1277
    if-eqz v6, :cond_1c

    .line 1278
    .line 1279
    invoke-virtual {v3}, Lx1/a;->t()Ljava/lang/String;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v2

    .line 1283
    :cond_1c
    if-nez v2, :cond_1d

    .line 1284
    .line 1285
    const-string v2, "url"

    .line 1286
    .line 1287
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    goto :goto_d

    .line 1292
    :cond_1d
    move-object v0, v2

    .line 1293
    :goto_d
    if-eqz v0, :cond_22

    .line 1294
    .line 1295
    new-instance v2, Ljava/util/HashMap;

    .line 1296
    .line 1297
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {v5}, Lu1/x;->a()Ljava/util/List;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v5

    .line 1304
    check-cast v5, Ljava/util/ArrayList;

    .line 1305
    .line 1306
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v5

    .line 1310
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1311
    .line 1312
    .line 1313
    move-result v6

    .line 1314
    if-nez v6, :cond_21

    .line 1315
    .line 1316
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 1317
    .line 1318
    .line 1319
    move-result v5

    .line 1320
    if-nez v5, :cond_1e

    .line 1321
    .line 1322
    move-object v13, v2

    .line 1323
    goto :goto_e

    .line 1324
    :cond_1e
    const/4 v13, 0x0

    .line 1325
    :goto_e
    if-eqz v13, :cond_20

    .line 1326
    .line 1327
    invoke-interface {v13}, Ljava/util/Map;->isEmpty()Z

    .line 1328
    .line 1329
    .line 1330
    move-result v2

    .line 1331
    if-nez v2, :cond_20

    .line 1332
    .line 1333
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v0

    .line 1337
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v0

    .line 1341
    invoke-interface {v13}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v2

    .line 1345
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v2

    .line 1349
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1350
    .line 1351
    .line 1352
    move-result v5

    .line 1353
    if-eqz v5, :cond_1f

    .line 1354
    .line 1355
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v5

    .line 1359
    check-cast v5, Ljava/util/Map$Entry;

    .line 1360
    .line 1361
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v6

    .line 1365
    check-cast v6, Ljava/lang/String;

    .line 1366
    .line 1367
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v5

    .line 1371
    check-cast v5, Ljava/lang/String;

    .line 1372
    .line 1373
    invoke-virtual {v0, v6, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 1374
    .line 1375
    .line 1376
    goto :goto_f

    .line 1377
    :cond_1f
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v0

    .line 1381
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v0

    .line 1385
    :cond_20
    iput-object v0, v1, Lco/median/android/MainActivity;->K:Ljava/lang/String;

    .line 1386
    .line 1387
    iget-object v2, v1, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 1388
    .line 1389
    check-cast v2, Lu1/o0;

    .line 1390
    .line 1391
    invoke-virtual {v2, v0}, Lu1/o0;->loadUrl(Ljava/lang/String;)V

    .line 1392
    .line 1393
    .line 1394
    goto :goto_10

    .line 1395
    :cond_21
    invoke-static {v5}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v0

    .line 1399
    throw v0

    .line 1400
    :cond_22
    invoke-virtual {v1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v2

    .line 1404
    const-string v5, "io.gonative.android.MainActivity.Extra.WEBVIEW_WINDOW_OPEN"

    .line 1405
    .line 1406
    const/4 v10, 0x0

    .line 1407
    invoke-virtual {v2, v5, v10}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1408
    .line 1409
    .line 1410
    move-result v2

    .line 1411
    if-eqz v2, :cond_23

    .line 1412
    .line 1413
    goto :goto_10

    .line 1414
    :cond_23
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v2

    .line 1418
    const-string v5, "No url specified for MainActivity"

    .line 1419
    .line 1420
    const/4 v15, 0x0

    .line 1421
    invoke-virtual {v2, v14, v5, v15}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 1422
    .line 1423
    .line 1424
    :goto_10
    iget-object v2, v1, Lco/median/android/MainActivity;->R:Lu1/e;

    .line 1425
    .line 1426
    const/4 v9, 0x1

    .line 1427
    invoke-virtual {v2, v0, v9}, Lu1/e;->c(Ljava/lang/String;Z)V

    .line 1428
    .line 1429
    .line 1430
    iget-object v0, v1, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 1431
    .line 1432
    iget-boolean v2, v1, Lco/median/android/MainActivity;->T:Z

    .line 1433
    .line 1434
    if-eqz v2, :cond_24

    .line 1435
    .line 1436
    iget-boolean v2, v3, Lx1/a;->H:Z

    .line 1437
    .line 1438
    if-eqz v2, :cond_24

    .line 1439
    .line 1440
    const/4 v2, 0x1

    .line 1441
    goto :goto_11

    .line 1442
    :cond_24
    const/4 v2, 0x0

    .line 1443
    :goto_11
    iget-object v5, v0, Lu1/q1;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 1444
    .line 1445
    if-eqz v2, :cond_25

    .line 1446
    .line 1447
    const/4 v10, 0x0

    .line 1448
    invoke-virtual {v5, v10}, Ly0/f;->setDrawerLockMode(I)V

    .line 1449
    .line 1450
    .line 1451
    iget-object v0, v0, Lu1/q1;->c:Lu1/p1;

    .line 1452
    .line 1453
    if-eqz v0, :cond_26

    .line 1454
    .line 1455
    invoke-virtual {v5, v0}, Ly0/f;->a(Ly0/b;)V

    .line 1456
    .line 1457
    .line 1458
    goto :goto_12

    .line 1459
    :cond_25
    const/4 v9, 0x1

    .line 1460
    invoke-virtual {v5, v9}, Ly0/f;->setDrawerLockMode(I)V

    .line 1461
    .line 1462
    .line 1463
    iget-object v0, v0, Lu1/q1;->c:Lu1/p1;

    .line 1464
    .line 1465
    if-eqz v0, :cond_26

    .line 1466
    .line 1467
    invoke-virtual {v5, v0}, Ly0/f;->p(Ly0/b;)V

    .line 1468
    .line 1469
    .line 1470
    :cond_26
    :goto_12
    new-instance v0, Lu1/k0;

    .line 1471
    .line 1472
    invoke-direct {v0, v1, v4}, Lu1/k0;-><init>(Lco/median/android/MainActivity;Landroid/view/ViewGroup;)V

    .line 1473
    .line 1474
    .line 1475
    iput-object v0, v1, Lco/median/android/MainActivity;->e0:Lu1/k0;

    .line 1476
    .line 1477
    new-instance v0, Lu1/y0;

    .line 1478
    .line 1479
    const/4 v10, 0x0

    .line 1480
    invoke-direct {v0, v10, v1}, Lu1/y0;-><init>(ILjava/lang/Object;)V

    .line 1481
    .line 1482
    .line 1483
    invoke-virtual {v3, v0}, Lx1/a;->i(Lx1/e;)V

    .line 1484
    .line 1485
    .line 1486
    invoke-virtual {v1}, Lco/median/android/MainActivity;->E()Landroidx/emoji2/text/x;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v0

    .line 1490
    new-instance v2, Lu1/w0;

    .line 1491
    .line 1492
    invoke-direct {v2, v1}, Lu1/w0;-><init>(Lco/median/android/MainActivity;)V

    .line 1493
    .line 1494
    .line 1495
    iget-object v0, v0, Landroidx/emoji2/text/x;->b:Ljava/lang/Object;

    .line 1496
    .line 1497
    check-cast v0, Ljava/util/ArrayList;

    .line 1498
    .line 1499
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1500
    .line 1501
    .line 1502
    if-eqz v11, :cond_27

    .line 1503
    .line 1504
    invoke-virtual {v1}, Lco/median/android/MainActivity;->S()V

    .line 1505
    .line 1506
    .line 1507
    :cond_27
    iget-object v0, v3, Lx1/a;->I0:Lz1/b;

    .line 1508
    .line 1509
    iget-boolean v0, v0, Lz1/b;->a:Z

    .line 1510
    .line 1511
    iget-object v2, v1, Lco/median/android/MainActivity;->F:Lco/median/android/widget/WebViewContainerView;

    .line 1512
    .line 1513
    if-nez v2, :cond_28

    .line 1514
    .line 1515
    goto :goto_13

    .line 1516
    :cond_28
    if-eqz v0, :cond_29

    .line 1517
    .line 1518
    invoke-virtual {v1, v2}, Landroid/app/Activity;->registerForContextMenu(Landroid/view/View;)V

    .line 1519
    .line 1520
    .line 1521
    goto :goto_13

    .line 1522
    :cond_29
    invoke-virtual {v1, v2}, Landroid/app/Activity;->unregisterForContextMenu(Landroid/view/View;)V

    .line 1523
    .line 1524
    .line 1525
    :goto_13
    invoke-virtual {v1}, Landroidx/activity/q;->a()Landroidx/activity/j0;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v0

    .line 1529
    new-instance v2, Landroidx/fragment/app/m0;

    .line 1530
    .line 1531
    invoke-direct {v2, v1}, Landroidx/fragment/app/m0;-><init>(Lco/median/android/MainActivity;)V

    .line 1532
    .line 1533
    .line 1534
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1535
    .line 1536
    .line 1537
    invoke-virtual {v0, v2}, Landroidx/activity/j0;->b(Landroidx/fragment/app/m0;)Landroidx/activity/h0;

    .line 1538
    .line 1539
    .line 1540
    return-void

    .line 1541
    :cond_2a
    invoke-static {v0}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v0

    .line 1545
    throw v0

    .line 1546
    :cond_2b
    invoke-static {v0}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v0

    .line 1550
    throw v0

    .line 1551
    :cond_2c
    const-string v0, "statusBarStyle"

    .line 1552
    .line 1553
    invoke-static {v0}, Lr3/g;->c(Ljava/lang/String;)V

    .line 1554
    .line 1555
    .line 1556
    const/16 v16, 0x0

    .line 1557
    .line 1558
    throw v16
.end method

.method public final onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 2
    .line 3
    invoke-interface {p1}, Lx1/i;->getHitTestResult()Landroid/webkit/WebView$HitTestResult;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/webkit/WebView$HitTestResult;->getExtra()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p1}, Landroid/webkit/WebView$HitTestResult;->getType()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    if-nez p3, :cond_4

    .line 20
    .line 21
    const/4 p3, 0x7

    .line 22
    if-eq p1, p3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iput-object p2, p0, Lco/median/android/MainActivity;->B0:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p1, p1, Lx1/a;->I0:Lz1/b;

    .line 32
    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    iget-object p2, p1, Lz1/b;->b:Lz1/c;

    .line 36
    .line 37
    iget-boolean p1, p1, Lz1/b;->a:Z

    .line 38
    .line 39
    if-eqz p1, :cond_4

    .line 40
    .line 41
    iget-boolean p1, p2, Lz1/c;->a:Z

    .line 42
    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    iget-boolean p3, p2, Lz1/c;->b:Z

    .line 52
    .line 53
    if-eqz p3, :cond_2

    .line 54
    .line 55
    const p3, 0x7f11001c

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :cond_2
    iget-boolean p2, p2, Lz1/c;->c:Z

    .line 66
    .line 67
    if-eqz p2, :cond_3

    .line 68
    .line 69
    const p2, 0x7f11001d

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    :cond_3
    const/4 p2, 0x0

    .line 80
    new-array p2, p2, [Ljava/lang/CharSequence;

    .line 81
    .line 82
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    check-cast p2, [Ljava/lang/CharSequence;

    .line 87
    .line 88
    new-instance p3, Ln2/b;

    .line 89
    .line 90
    invoke-direct {p3, p0}, Ln2/b;-><init>(Landroid/content/Context;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lco/median/android/MainActivity;->B0:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v1, p3, Le/f;->g:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, Le/b;

    .line 98
    .line 99
    iput-object v0, v1, Le/b;->d:Ljava/lang/CharSequence;

    .line 100
    .line 101
    new-instance v0, Lu1/z;

    .line 102
    .line 103
    const/4 v2, 0x1

    .line 104
    invoke-direct {v0, p0, p1, v2}, Lu1/z;-><init>(Landroid/view/KeyEvent$Callback;Ljava/lang/Object;I)V

    .line 105
    .line 106
    .line 107
    iput-object p2, v1, Le/b;->m:[Ljava/lang/CharSequence;

    .line 108
    .line 109
    iput-object v0, v1, Le/b;->o:Landroid/content/DialogInterface$OnClickListener;

    .line 110
    .line 111
    new-instance p1, Lu1/a0;

    .line 112
    .line 113
    const/4 p2, 0x1

    .line 114
    invoke-direct {p1, p2, p0}, Lu1/a0;-><init>(ILjava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iput-object p1, v1, Le/b;->k:Landroid/content/DialogInterface$OnDismissListener;

    .line 118
    .line 119
    invoke-virtual {p3}, Ln2/b;->a()Le/g;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 124
    .line 125
    .line 126
    :cond_4
    :goto_0
    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 27

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Le/j;->getMenuInflater()Landroid/view/MenuInflater;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/high16 v2, 0x7f0e0000

    .line 8
    .line 9
    invoke-virtual {v1, v2, v0}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p0

    .line 13
    .line 14
    iget-object v2, v1, Lco/median/android/MainActivity;->R:Lu1/e;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget v4, v2, Lu1/e;->i:I

    .line 19
    .line 20
    iget-object v5, v2, Lu1/e;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 21
    .line 22
    iget-object v6, v2, Lu1/e;->a:Lco/median/android/MainActivity;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iput-object v0, v2, Lu1/e;->l:Landroid/view/Menu;

    .line 28
    .line 29
    iget-object v7, v2, Lu1/e;->h:Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {v7}, Ljava/util/HashMap;->clear()V

    .line 32
    .line 33
    .line 34
    iget-boolean v8, v2, Lu1/e;->o:Z

    .line 35
    .line 36
    const/4 v9, 0x0

    .line 37
    const/4 v10, 0x0

    .line 38
    if-eqz v8, :cond_0

    .line 39
    .line 40
    invoke-virtual {v5, v9}, Lcom/google/android/material/appbar/MaterialToolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5, v9}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 44
    .line 45
    .line 46
    iput-boolean v10, v2, Lu1/e;->o:Z

    .line 47
    .line 48
    :cond_0
    invoke-static {v6}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    iget-object v11, v8, Lx1/a;->b0:Ljava/util/HashMap;

    .line 53
    .line 54
    if-eqz v11, :cond_1

    .line 55
    .line 56
    iget-object v12, v2, Lu1/e;->n:Ljava/lang/String;

    .line 57
    .line 58
    if-nez v12, :cond_2

    .line 59
    .line 60
    :cond_1
    :goto_0
    const/4 v11, 0x1

    .line 61
    goto/16 :goto_14

    .line 62
    .line 63
    :cond_2
    invoke-virtual {v11, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    check-cast v11, Lorg/json/JSONObject;

    .line 68
    .line 69
    if-nez v11, :cond_3

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    const-string v12, "items"

    .line 73
    .line 74
    invoke-virtual {v11, v12}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 75
    .line 76
    .line 77
    move-result-object v12

    .line 78
    if-eqz v12, :cond_1

    .line 79
    .line 80
    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    .line 81
    .line 82
    .line 83
    move-result v13

    .line 84
    if-nez v13, :cond_4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    const-string v13, "allowLeftMenu"

    .line 88
    .line 89
    invoke-virtual {v11, v13}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    new-instance v13, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    .line 99
    .line 100
    .line 101
    move-result v14

    .line 102
    move v15, v10

    .line 103
    move/from16 v16, v15

    .line 104
    .line 105
    :goto_1
    const-string v9, "icon"

    .line 106
    .line 107
    if-ge v15, v14, :cond_24

    .line 108
    .line 109
    invoke-virtual {v12, v15}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    .line 114
    .line 115
    .line 116
    move-result v17

    .line 117
    sub-int v3, v17, v15

    .line 118
    .line 119
    if-nez v16, :cond_5

    .line 120
    .line 121
    invoke-interface {v0}, Landroid/view/Menu;->size()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    move/from16 v17, v11

    .line 126
    .line 127
    const/4 v11, 0x1

    .line 128
    if-ne v1, v11, :cond_6

    .line 129
    .line 130
    if-le v3, v11, :cond_6

    .line 131
    .line 132
    const/16 v16, 0x1

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    move/from16 v17, v11

    .line 136
    .line 137
    :cond_6
    :goto_2
    if-eqz v16, :cond_7

    .line 138
    .line 139
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-object/from16 v26, v5

    .line 146
    .line 147
    move-object v1, v7

    .line 148
    move-object/from16 v22, v8

    .line 149
    .line 150
    move-object/from16 v18, v12

    .line 151
    .line 152
    move-object/from16 v20, v13

    .line 153
    .line 154
    move/from16 v19, v14

    .line 155
    .line 156
    move v11, v15

    .line 157
    move-object v7, v0

    .line 158
    goto/16 :goto_f

    .line 159
    .line 160
    :cond_7
    const-string v1, "search"

    .line 161
    .line 162
    const-string v3, "fa fa-search"

    .line 163
    .line 164
    const-string v11, "fa-rotate-right"

    .line 165
    .line 166
    move-object/from16 v18, v12

    .line 167
    .line 168
    const-string v12, "system"

    .line 169
    .line 170
    move/from16 v19, v14

    .line 171
    .line 172
    const-string v14, "url"

    .line 173
    .line 174
    move-object/from16 v20, v13

    .line 175
    .line 176
    const-string v13, "refresh"

    .line 177
    .line 178
    move-object/from16 v21, v7

    .line 179
    .line 180
    const-string v7, "share"

    .line 181
    .line 182
    if-nez v15, :cond_15

    .line 183
    .line 184
    if-eqz v17, :cond_15

    .line 185
    .line 186
    iget-boolean v0, v2, Lu1/e;->o:Z

    .line 187
    .line 188
    if-nez v0, :cond_15

    .line 189
    .line 190
    iget-boolean v0, v8, Lx1/a;->H:Z

    .line 191
    .line 192
    if-nez v0, :cond_15

    .line 193
    .line 194
    if-nez v10, :cond_8

    .line 195
    .line 196
    goto/16 :goto_8

    .line 197
    .line 198
    :cond_8
    iget-boolean v0, v2, Lu1/e;->b:Z

    .line 199
    .line 200
    if-nez v0, :cond_9

    .line 201
    .line 202
    move-object/from16 v22, v8

    .line 203
    .line 204
    move/from16 v24, v15

    .line 205
    .line 206
    :goto_3
    const/4 v11, 0x1

    .line 207
    goto/16 :goto_6

    .line 208
    .line 209
    :cond_9
    new-instance v0, Lr3/k;

    .line 210
    .line 211
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 212
    .line 213
    .line 214
    move-object/from16 v22, v8

    .line 215
    .line 216
    invoke-virtual {v10, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    iput-object v8, v0, Lr3/k;->f:Ljava/lang/Object;

    .line 221
    .line 222
    invoke-virtual {v10, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    move-object/from16 v23, v8

    .line 227
    .line 228
    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    if-eqz v8, :cond_a

    .line 233
    .line 234
    invoke-static {v8}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 235
    .line 236
    .line 237
    move-result v24

    .line 238
    if-eqz v24, :cond_b

    .line 239
    .line 240
    :cond_a
    move/from16 v24, v15

    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_b
    move/from16 v24, v15

    .line 244
    .line 245
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 246
    .line 247
    .line 248
    move-result v15

    .line 249
    move-object/from16 v25, v3

    .line 250
    .line 251
    const v3, -0x36059a58    # -2051253.0f

    .line 252
    .line 253
    .line 254
    if-eq v15, v3, :cond_12

    .line 255
    .line 256
    const v3, 0x6854fdf

    .line 257
    .line 258
    .line 259
    if-eq v15, v3, :cond_f

    .line 260
    .line 261
    const v1, 0x40b292db

    .line 262
    .line 263
    .line 264
    if-eq v15, v1, :cond_c

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_c
    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-nez v1, :cond_d

    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_d
    iput-object v13, v0, Lr3/k;->f:Ljava/lang/Object;

    .line 275
    .line 276
    if-eqz v23, :cond_14

    .line 277
    .line 278
    invoke-static/range {v23 .. v23}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-eqz v1, :cond_e

    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_e
    move-object v3, v11

    .line 286
    goto :goto_5

    .line 287
    :cond_f
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-nez v1, :cond_10

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_10
    iput-object v7, v0, Lr3/k;->f:Ljava/lang/Object;

    .line 295
    .line 296
    if-eqz v23, :cond_14

    .line 297
    .line 298
    invoke-static/range {v23 .. v23}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-eqz v1, :cond_11

    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_11
    move-object/from16 v3, v25

    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_12
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    if-nez v3, :cond_13

    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_13
    const-string v0, "ActionManager"

    .line 316
    .line 317
    const-string v3, "addAsLeftActionMenu: The \"search\" system menu is not supported as a left-menu yet."

    .line 318
    .line 319
    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 320
    .line 321
    .line 322
    goto :goto_9

    .line 323
    :cond_14
    :goto_4
    move-object/from16 v3, v23

    .line 324
    .line 325
    :goto_5
    new-instance v1, Lv1/b;

    .line 326
    .line 327
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    iget v7, v2, Lu1/e;->k:I

    .line 331
    .line 332
    invoke-direct {v1, v6, v4, v7, v3}, Lv1/b;-><init>(Landroid/content/Context;IILjava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v1}, Lv1/b;->d()Landroid/graphics/drawable/Drawable;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    invoke-virtual {v5, v1}, Lcom/google/android/material/appbar/MaterialToolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 340
    .line 341
    .line 342
    iget v1, v2, Lu1/e;->k:I

    .line 343
    .line 344
    invoke-virtual {v5, v1}, Lcom/google/android/material/appbar/MaterialToolbar;->setNavigationIconTint(I)V

    .line 345
    .line 346
    .line 347
    new-instance v1, Lu1/d;

    .line 348
    .line 349
    invoke-direct {v1, v0, v2}, Lu1/d;-><init>(Lr3/k;Lu1/e;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v5, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 353
    .line 354
    .line 355
    goto/16 :goto_3

    .line 356
    .line 357
    :goto_6
    iput-boolean v11, v2, Lu1/e;->o:Z

    .line 358
    .line 359
    :goto_7
    move-object/from16 v7, p1

    .line 360
    .line 361
    move-object/from16 v26, v5

    .line 362
    .line 363
    move-object/from16 v1, v21

    .line 364
    .line 365
    move/from16 v11, v24

    .line 366
    .line 367
    goto/16 :goto_f

    .line 368
    .line 369
    :cond_15
    :goto_8
    move-object/from16 v25, v3

    .line 370
    .line 371
    move-object/from16 v22, v8

    .line 372
    .line 373
    move/from16 v24, v15

    .line 374
    .line 375
    :goto_9
    if-nez v10, :cond_16

    .line 376
    .line 377
    goto :goto_7

    .line 378
    :cond_16
    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    const-string v8, "label"

    .line 387
    .line 388
    if-eqz v3, :cond_18

    .line 389
    .line 390
    :cond_17
    move-object/from16 v7, p1

    .line 391
    .line 392
    move-object/from16 v26, v5

    .line 393
    .line 394
    :goto_a
    move-object/from16 v1, v21

    .line 395
    .line 396
    move/from16 v11, v24

    .line 397
    .line 398
    goto/16 :goto_e

    .line 399
    .line 400
    :cond_18
    invoke-virtual {v10, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    invoke-virtual {v10, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v12

    .line 408
    invoke-virtual {v10, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v15

    .line 412
    if-eqz v0, :cond_17

    .line 413
    .line 414
    move-object/from16 v23, v3

    .line 415
    .line 416
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    move-object/from16 v26, v5

    .line 421
    .line 422
    const v5, -0x36059a58    # -2051253.0f

    .line 423
    .line 424
    .line 425
    if-eq v3, v5, :cond_1d

    .line 426
    .line 427
    const v5, 0x6854fdf

    .line 428
    .line 429
    .line 430
    if-eq v3, v5, :cond_1b

    .line 431
    .line 432
    const v5, 0x40b292db

    .line 433
    .line 434
    .line 435
    if-eq v3, v5, :cond_19

    .line 436
    .line 437
    :goto_b
    move-object/from16 v7, p1

    .line 438
    .line 439
    goto :goto_a

    .line 440
    :cond_19
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    if-nez v0, :cond_1a

    .line 445
    .line 446
    goto :goto_b

    .line 447
    :cond_1a
    new-instance v0, Lg3/e;

    .line 448
    .line 449
    const-string v3, "Refresh"

    .line 450
    .line 451
    invoke-direct {v0, v13, v11, v3}, Lg3/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Comparable;)V

    .line 452
    .line 453
    .line 454
    goto :goto_c

    .line 455
    :cond_1b
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v0

    .line 459
    if-nez v0, :cond_1c

    .line 460
    .line 461
    goto :goto_b

    .line 462
    :cond_1c
    new-instance v0, Lg3/e;

    .line 463
    .line 464
    const-string v3, "fa-share"

    .line 465
    .line 466
    const-string v5, "Share"

    .line 467
    .line 468
    invoke-direct {v0, v7, v3, v5}, Lg3/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Comparable;)V

    .line 469
    .line 470
    .line 471
    goto :goto_c

    .line 472
    :cond_1d
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v0

    .line 476
    if-nez v0, :cond_1e

    .line 477
    .line 478
    goto :goto_b

    .line 479
    :cond_1e
    new-instance v0, Lg3/e;

    .line 480
    .line 481
    const-string v3, "Search"

    .line 482
    .line 483
    move-object/from16 v5, v25

    .line 484
    .line 485
    invoke-direct {v0, v1, v5, v3}, Lg3/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Comparable;)V

    .line 486
    .line 487
    .line 488
    :goto_c
    iget-object v3, v0, Lg3/e;->h:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v3, Ljava/lang/String;

    .line 491
    .line 492
    invoke-static/range {v23 .. v23}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 493
    .line 494
    .line 495
    move-result v5

    .line 496
    if-eqz v5, :cond_1f

    .line 497
    .line 498
    goto :goto_d

    .line 499
    :cond_1f
    move-object/from16 v3, v23

    .line 500
    .line 501
    :goto_d
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 502
    .line 503
    .line 504
    move-result v5

    .line 505
    if-eqz v5, :cond_20

    .line 506
    .line 507
    iget-object v12, v0, Lg3/e;->g:Ljava/lang/String;

    .line 508
    .line 509
    :cond_20
    new-instance v5, Lv1/b;

    .line 510
    .line 511
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    iget v7, v2, Lu1/e;->k:I

    .line 515
    .line 516
    invoke-direct {v5, v6, v4, v7, v12}, Lv1/b;-><init>(Landroid/content/Context;IILjava/lang/String;)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v5}, Lv1/b;->d()Landroid/graphics/drawable/Drawable;

    .line 520
    .line 521
    .line 522
    move-result-object v5

    .line 523
    move-object/from16 v7, p1

    .line 524
    .line 525
    move/from16 v11, v24

    .line 526
    .line 527
    const/4 v8, 0x0

    .line 528
    invoke-interface {v7, v8, v11, v8, v3}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    invoke-interface {v3, v5}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    const/4 v5, 0x1

    .line 537
    invoke-interface {v3, v5}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    iget-object v0, v0, Lg3/e;->f:Ljava/lang/String;

    .line 545
    .line 546
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v1

    .line 550
    if-eqz v1, :cond_23

    .line 551
    .line 552
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    new-instance v1, Landroidx/appcompat/widget/e;

    .line 556
    .line 557
    invoke-direct {v1, v6}, Landroidx/appcompat/widget/e;-><init>(Landroid/content/Context;)V

    .line 558
    .line 559
    .line 560
    new-instance v5, Lk/h3;

    .line 561
    .line 562
    const/4 v8, -0x1

    .line 563
    invoke-direct {v5, v8}, Lk/h3;-><init>(I)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 567
    .line 568
    .line 569
    const v5, 0x7fffffff

    .line 570
    .line 571
    .line 572
    invoke-virtual {v1, v5}, Landroidx/appcompat/widget/e;->setMaxWidth(I)V

    .line 573
    .line 574
    .line 575
    new-instance v5, Landroidx/emoji2/text/p;

    .line 576
    .line 577
    const/16 v8, 0xe

    .line 578
    .line 579
    invoke-direct {v5, v2, v8, v15}, Landroidx/emoji2/text/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v1, v5}, Landroidx/appcompat/widget/e;->setOnQueryTextListener(Lk/s2;)V

    .line 583
    .line 584
    .line 585
    new-instance v5, Lu1/a;

    .line 586
    .line 587
    invoke-direct {v5, v1, v2}, Lu1/a;-><init>(Landroidx/appcompat/widget/e;Lu1/e;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v1, v5}, Landroidx/appcompat/widget/e;->setOnQueryTextFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 591
    .line 592
    .line 593
    const v5, 0x7f0901c9

    .line 594
    .line 595
    .line 596
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 597
    .line 598
    .line 599
    move-result-object v5

    .line 600
    check-cast v5, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 601
    .line 602
    if-eqz v5, :cond_21

    .line 603
    .line 604
    iget v8, v2, Lu1/e;->k:I

    .line 605
    .line 606
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 607
    .line 608
    .line 609
    iget v8, v2, Lu1/e;->k:I

    .line 610
    .line 611
    invoke-static {v8}, Landroid/graphics/Color;->red(I)I

    .line 612
    .line 613
    .line 614
    move-result v9

    .line 615
    invoke-static {v8}, Landroid/graphics/Color;->green(I)I

    .line 616
    .line 617
    .line 618
    move-result v10

    .line 619
    invoke-static {v8}, Landroid/graphics/Color;->blue(I)I

    .line 620
    .line 621
    .line 622
    move-result v8

    .line 623
    const/16 v12, 0xc0

    .line 624
    .line 625
    invoke-static {v12, v9, v10, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 626
    .line 627
    .line 628
    move-result v8

    .line 629
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 630
    .line 631
    .line 632
    :cond_21
    const v5, 0x7f0901c4

    .line 633
    .line 634
    .line 635
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 636
    .line 637
    .line 638
    move-result-object v5

    .line 639
    check-cast v5, Landroid/widget/ImageView;

    .line 640
    .line 641
    if-eqz v5, :cond_22

    .line 642
    .line 643
    iget v8, v2, Lu1/e;->k:I

    .line 644
    .line 645
    invoke-virtual {v5, v8}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 646
    .line 647
    .line 648
    :cond_22
    iput-object v1, v2, Lu1/e;->m:Landroidx/appcompat/widget/e;

    .line 649
    .line 650
    invoke-interface {v3, v1}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    .line 651
    .line 652
    .line 653
    const/16 v1, 0x9

    .line 654
    .line 655
    invoke-interface {v3, v1}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    .line 656
    .line 657
    .line 658
    new-instance v1, Lj/r;

    .line 659
    .line 660
    invoke-direct {v1, v2, v3}, Lj/r;-><init>(Lu1/e;Landroid/view/MenuItem;)V

    .line 661
    .line 662
    .line 663
    invoke-interface {v3, v1}, Landroid/view/MenuItem;->setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;

    .line 664
    .line 665
    .line 666
    :cond_23
    move-object/from16 v1, v21

    .line 667
    .line 668
    invoke-virtual {v1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    goto :goto_f

    .line 672
    :goto_e
    invoke-virtual {v10, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    invoke-virtual {v10, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v3

    .line 680
    invoke-virtual {v10, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v5

    .line 684
    new-instance v8, Lv1/b;

    .line 685
    .line 686
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 687
    .line 688
    .line 689
    iget v9, v2, Lu1/e;->k:I

    .line 690
    .line 691
    invoke-direct {v8, v6, v4, v9, v3}, Lv1/b;-><init>(Landroid/content/Context;IILjava/lang/String;)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v8}, Lv1/b;->d()Landroid/graphics/drawable/Drawable;

    .line 695
    .line 696
    .line 697
    move-result-object v3

    .line 698
    const/4 v8, 0x0

    .line 699
    invoke-interface {v7, v8, v11, v8, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 704
    .line 705
    .line 706
    move-result-object v0

    .line 707
    const/4 v3, 0x2

    .line 708
    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 713
    .line 714
    .line 715
    invoke-virtual {v1, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    :goto_f
    add-int/lit8 v15, v11, 0x1

    .line 719
    .line 720
    move-object v0, v7

    .line 721
    move/from16 v11, v17

    .line 722
    .line 723
    move-object/from16 v12, v18

    .line 724
    .line 725
    move/from16 v14, v19

    .line 726
    .line 727
    move-object/from16 v13, v20

    .line 728
    .line 729
    move-object/from16 v8, v22

    .line 730
    .line 731
    move-object/from16 v5, v26

    .line 732
    .line 733
    const/4 v10, 0x0

    .line 734
    move-object v7, v1

    .line 735
    move-object/from16 v1, p0

    .line 736
    .line 737
    goto/16 :goto_1

    .line 738
    .line 739
    :cond_24
    move-object/from16 v26, v5

    .line 740
    .line 741
    move-object v1, v7

    .line 742
    move-object/from16 v20, v13

    .line 743
    .line 744
    move-object v7, v0

    .line 745
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->isEmpty()Z

    .line 746
    .line 747
    .line 748
    move-result v0

    .line 749
    if-eqz v0, :cond_25

    .line 750
    .line 751
    goto/16 :goto_0

    .line 752
    .line 753
    :cond_25
    invoke-virtual/range {v26 .. v26}, Landroidx/appcompat/widget/Toolbar;->getOverflowIcon()Landroid/graphics/drawable/Drawable;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    if-eqz v0, :cond_26

    .line 758
    .line 759
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    if-eqz v0, :cond_26

    .line 764
    .line 765
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    if-eqz v0, :cond_26

    .line 770
    .line 771
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    goto :goto_10

    .line 776
    :cond_26
    const/4 v0, 0x0

    .line 777
    :goto_10
    if-eqz v0, :cond_27

    .line 778
    .line 779
    iget v3, v2, Lu1/e;->k:I

    .line 780
    .line 781
    invoke-static {v3}, Le4/a;->n(I)Landroid/graphics/ColorFilter;

    .line 782
    .line 783
    .line 784
    move-result-object v3

    .line 785
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 786
    .line 787
    .line 788
    :cond_27
    const/16 v3, 0x63

    .line 789
    .line 790
    const-string v4, "Overflow"

    .line 791
    .line 792
    const/4 v8, 0x0

    .line 793
    invoke-interface {v7, v8, v3, v8, v4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 794
    .line 795
    .line 796
    move-result-object v3

    .line 797
    invoke-interface {v3, v0}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    const/4 v3, 0x2

    .line 802
    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setShowAsActionFlags(I)Landroid/view/MenuItem;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 807
    .line 808
    .line 809
    const-string v3, "overflow"

    .line 810
    .line 811
    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    const v1, 0x7f0c007a

    .line 819
    .line 820
    .line 821
    const/4 v3, 0x0

    .line 822
    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    const v1, 0x7f090135

    .line 827
    .line 828
    .line 829
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 830
    .line 831
    .line 832
    move-result-object v1

    .line 833
    check-cast v1, Landroid/widget/ListView;

    .line 834
    .line 835
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->size()I

    .line 836
    .line 837
    .line 838
    move-result v3

    .line 839
    move v4, v8

    .line 840
    :goto_11
    move-object/from16 v5, v20

    .line 841
    .line 842
    if-ge v4, v3, :cond_2a

    .line 843
    .line 844
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    move-result-object v7

    .line 848
    add-int/lit8 v4, v4, 0x1

    .line 849
    .line 850
    check-cast v7, Lorg/json/JSONObject;

    .line 851
    .line 852
    invoke-virtual {v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v7

    .line 856
    if-eqz v7, :cond_29

    .line 857
    .line 858
    invoke-static {v7}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 859
    .line 860
    .line 861
    move-result v7

    .line 862
    if-eqz v7, :cond_28

    .line 863
    .line 864
    goto :goto_12

    .line 865
    :cond_28
    const/4 v10, 0x1

    .line 866
    goto :goto_13

    .line 867
    :cond_29
    :goto_12
    move-object/from16 v20, v5

    .line 868
    .line 869
    goto :goto_11

    .line 870
    :cond_2a
    move v10, v8

    .line 871
    :goto_13
    new-instance v3, Lu1/j1;

    .line 872
    .line 873
    invoke-direct {v3, v6, v5, v10}, Lu1/j1;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Z)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v1, v3}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 877
    .line 878
    .line 879
    new-instance v3, Landroid/widget/PopupWindow;

    .line 880
    .line 881
    const/4 v4, -0x2

    .line 882
    const/4 v11, 0x1

    .line 883
    invoke-direct {v3, v0, v4, v4, v11}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 884
    .line 885
    .line 886
    iget v0, v2, Lu1/e;->j:I

    .line 887
    .line 888
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 889
    .line 890
    .line 891
    const/high16 v0, 0x41200000    # 10.0f

    .line 892
    .line 893
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setElevation(F)V

    .line 894
    .line 895
    .line 896
    iput-object v3, v2, Lu1/e;->p:Landroid/widget/PopupWindow;

    .line 897
    .line 898
    new-instance v0, Lu1/b;

    .line 899
    .line 900
    invoke-direct {v0, v5, v2}, Lu1/b;-><init>(Ljava/util/ArrayList;Lu1/e;)V

    .line 901
    .line 902
    .line 903
    invoke-virtual {v1, v0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 904
    .line 905
    .line 906
    :goto_14
    return v11
.end method

.method public final onDestroy()V
    .locals 3

    .line 1
    invoke-super {p0}, Le/j;->onDestroy()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 9
    .line 10
    iget-object v1, v0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 11
    .line 12
    invoke-virtual {v1}, Lu1/x;->a()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->j:Landroidx/emoji2/text/x;

    .line 29
    .line 30
    iget-object v1, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroidx/emoji2/text/x;->f(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lco/median/android/MainActivity;->Z:Lu1/o;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    iget-boolean v1, v0, Lu1/o;->g:Z

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    iget-object v1, v0, Lu1/o;->a:Lco/median/android/MainActivity;

    .line 44
    .line 45
    iget-object v2, v0, Lu1/o;->i:Lu1/m;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    iput-boolean v1, v0, Lu1/o;->g:Z

    .line 52
    .line 53
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    invoke-interface {v0}, Lx1/i;->stopLoading()V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 61
    .line 62
    invoke-interface {v0}, Lx1/i;->getParent()Landroid/view/ViewParent;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Landroid/view/ViewGroup;

    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    iget-object v1, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 71
    .line 72
    check-cast v1, Landroid/view/View;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    :cond_1
    iget-boolean v0, p0, Lco/median/android/MainActivity;->H:Z

    .line 78
    .line 79
    if-nez v0, :cond_2

    .line 80
    .line 81
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 82
    .line 83
    invoke-interface {v0}, Lx1/i;->destroy()V

    .line 84
    .line 85
    .line 86
    :cond_2
    iget-object v0, p0, Lco/median/android/MainActivity;->b0:Lu1/s0;

    .line 87
    .line 88
    invoke-virtual {v0, p0}, Ljava/util/Observable;->deleteObserver(Ljava/util/Observer;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    invoke-static {v1}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    throw v0
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x21

    .line 7
    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lco/median/android/MainActivity;->L()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 23
    .line 24
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 25
    .line 26
    invoke-virtual {v0}, Lu1/x;->a()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1

    .line 47
    :cond_1
    invoke-static {v0}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    throw p1
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/q;->onNewIntent(Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 9
    .line 10
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 11
    .line 12
    invoke-virtual {v0}, Lu1/x;->a()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_7

    .line 27
    .line 28
    invoke-static {p1}, Lco/median/android/MainActivity;->H(Landroid/content/Intent;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_6

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_6

    .line 39
    .line 40
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 41
    .line 42
    invoke-interface {v0}, Lx1/i;->getUrl()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lco/median/android/MainActivity;->K(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lco/median/android/MainActivity;->K:Ljava/lang/String;

    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 59
    .line 60
    invoke-interface {v0}, Lx1/i;->getUrl()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const/4 v1, 0x0

    .line 65
    const/4 v2, 0x1

    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    move v0, v1

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    const-string v3, "/"

    .line 71
    .line 72
    invoke-virtual {p1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_2

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    sub-int/2addr v4, v2

    .line 83
    invoke-virtual {p1, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    goto :goto_0

    .line 88
    :cond_2
    move-object v4, p1

    .line 89
    :goto_0
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_3

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    sub-int/2addr v3, v2

    .line 100
    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    :cond_3
    const-string v3, "http://"

    .line 105
    .line 106
    invoke-virtual {v4, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-eqz v3, :cond_4

    .line 111
    .line 112
    const/4 v3, 0x7

    .line 113
    invoke-virtual {v4, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    const-string v4, "https://"

    .line 118
    .line 119
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    :cond_4
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    :goto_1
    if-nez v0, :cond_5

    .line 128
    .line 129
    iget-object v0, p0, Lco/median/android/MainActivity;->C0:Lu1/x1;

    .line 130
    .line 131
    invoke-virtual {v0, p1, v2, v1}, Lu1/x1;->b(Ljava/lang/String;ZZ)V

    .line 132
    .line 133
    .line 134
    :cond_5
    return-void

    .line 135
    :cond_6
    const-string p1, "co.median.android.MainActivity"

    .line 136
    .line 137
    const-string v0, "Received intent without url"

    .line 138
    .line 139
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_7
    invoke-static {v0}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    throw p1
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 2
    .line 3
    const v1, 0x102002c

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, Lu1/q1;->c:Lu1/p1;

    .line 13
    .line 14
    if-eqz v0, :cond_5

    .line 15
    .line 16
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-ne v3, v1, :cond_5

    .line 21
    .line 22
    iget-object p1, v0, Lu1/p1;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 23
    .line 24
    const v0, 0x800003

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ly0/f;->g(I)I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-virtual {p1, v0}, Ly0/f;->e(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    invoke-static {v3}, Ly0/f;->n(Landroid/view/View;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v3, 0x0

    .line 43
    :goto_0
    const-string v4, "No drawer view found with gravity "

    .line 44
    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    const/4 v3, 0x2

    .line 48
    if-eq v1, v3, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Ly0/f;->e(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {p1, v1, v2}, Ly0/f;->c(Landroid/view/View;Z)V

    .line 57
    .line 58
    .line 59
    return v2

    .line 60
    :cond_1
    invoke-static {v0}, Ly0/f;->j(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1, v4}, Landroidx/fragment/app/q;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    const/4 p1, 0x0

    .line 68
    return p1

    .line 69
    :cond_2
    if-eq v1, v2, :cond_4

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Ly0/f;->e(I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    invoke-virtual {p1, v1}, Ly0/f;->o(Landroid/view/View;)V

    .line 78
    .line 79
    .line 80
    return v2

    .line 81
    :cond_3
    invoke-static {v0}, Ly0/f;->j(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {p1, v4}, Landroidx/fragment/app/q;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    return v2

    .line 90
    :cond_5
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-ne v0, v1, :cond_8

    .line 95
    .line 96
    iget-object p1, p0, Lco/median/android/MainActivity;->R:Lu1/e;

    .line 97
    .line 98
    if-eqz p1, :cond_7

    .line 99
    .line 100
    iget-object v0, p1, Lu1/e;->m:Landroidx/appcompat/widget/e;

    .line 101
    .line 102
    if-eqz v0, :cond_7

    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_7

    .line 109
    .line 110
    iget-object v0, p1, Lu1/e;->m:Landroidx/appcompat/widget/e;

    .line 111
    .line 112
    if-eqz v0, :cond_6

    .line 113
    .line 114
    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/e;->setIconified(Z)V

    .line 115
    .line 116
    .line 117
    :cond_6
    iget-object p1, p1, Lu1/e;->a:Lco/median/android/MainActivity;

    .line 118
    .line 119
    invoke-virtual {p1}, Le/j;->invalidateOptionsMenu()V

    .line 120
    .line 121
    .line 122
    return v2

    .line 123
    :cond_7
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 124
    .line 125
    .line 126
    return v2

    .line 127
    :cond_8
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    return p1
.end method

.method public final onPause()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/e0;->onPause()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 9
    .line 10
    iget-object v1, v0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 11
    .line 12
    invoke-virtual {v1}, Lu1/x;->a()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_3

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    iput-boolean v1, p0, Lco/median/android/MainActivity;->E:Z

    .line 30
    .line 31
    iget-object v1, p0, Lco/median/android/MainActivity;->V:Landroid/os/Handler;

    .line 32
    .line 33
    iget-object v2, p0, Lco/median/android/MainActivity;->Y:Lu1/x0;

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 43
    .line 44
    invoke-virtual {v0}, Lu1/x;->a()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_0

    .line 59
    .line 60
    iget-object v0, p0, Lco/median/android/MainActivity;->f0:Lu1/x;

    .line 61
    .line 62
    iget-boolean v0, v0, Lu1/x;->a:Z

    .line 63
    .line 64
    if-nez v0, :cond_1

    .line 65
    .line 66
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 67
    .line 68
    invoke-interface {v0}, Lx1/i;->onPause()V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    invoke-static {v0}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    throw v0

    .line 77
    :cond_1
    :goto_0
    iget-object v0, p0, Lco/median/android/MainActivity;->d0:Le/z;

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Landroid/webkit/CookieManager;->flush()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_3
    invoke-static {v1}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    throw v0
.end method

.method public final onPostCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Le/j;->onPostCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lco/median/android/GoNativeApplication;

    .line 9
    .line 10
    iget-object p1, p1, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 11
    .line 12
    invoke-virtual {p1}, Lu1/x;->a()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    iget-object p1, p1, Lu1/q1;->c:Lu1/p1;

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    invoke-virtual {p1}, Lu1/p1;->e()V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void

    .line 40
    :cond_1
    invoke-static {p1}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    throw p1
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 5

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/e0;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 9
    .line 10
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 11
    .line 12
    invoke-virtual {v0}, Lu1/x;->a()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_6

    .line 27
    .line 28
    const/16 v0, 0xc7

    .line 29
    .line 30
    if-eq p1, v0, :cond_0

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_0
    iget-object p1, p0, Lco/median/android/MainActivity;->l0:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lu1/b1;

    .line 50
    .line 51
    iget-object v2, v1, Lu1/b1;->a:[Ljava/lang/String;

    .line 52
    .line 53
    array-length v2, v2

    .line 54
    array-length v3, p2

    .line 55
    if-eq v2, v3, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 v2, 0x0

    .line 59
    :goto_1
    iget-object v3, v1, Lu1/b1;->a:[Ljava/lang/String;

    .line 60
    .line 61
    array-length v4, v3

    .line 62
    if-ge v2, v4, :cond_3

    .line 63
    .line 64
    array-length v4, p2

    .line 65
    if-ge v2, v4, :cond_3

    .line 66
    .line 67
    aget-object v3, v3, v2

    .line 68
    .line 69
    aget-object v4, p2, v2

    .line 70
    .line 71
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-nez v3, :cond_2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    iget-object v1, v1, Lu1/b1;->b:Lu1/a1;

    .line 82
    .line 83
    invoke-interface {v1, p2, p3}, Lu1/a1;->c([Ljava/lang/String;[I)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-nez p1, :cond_5

    .line 95
    .line 96
    iget-object p1, p0, Lco/median/android/MainActivity;->m0:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-lez p2, :cond_5

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-eqz p2, :cond_5

    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    check-cast p2, Landroid/content/Intent;

    .line 119
    .line 120
    invoke-virtual {p0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    :goto_3
    return-void

    .line 128
    :cond_6
    invoke-static {v0}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    throw p1
.end method

.method public final onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lco/median/android/GoNativeApplication;

    .line 9
    .line 10
    iget-object p1, p1, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 11
    .line 12
    invoke-virtual {p1}, Lu1/x;->a()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-static {p1}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    throw p1
.end method

.method public final onResume()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/e0;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lco/median/android/MainActivity;->E()Landroidx/emoji2/text/x;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v1, v0, Landroidx/emoji2/text/x;->d:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 22
    .line 23
    invoke-virtual {v0}, Lu1/x;->a()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_5

    .line 38
    .line 39
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-interface {v0}, Lx1/i;->onResume()V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-boolean v1, p0, Lco/median/android/MainActivity;->E:Z

    .line 51
    .line 52
    const/4 v2, 0x0

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    iput-boolean v1, p0, Lco/median/android/MainActivity;->E:Z

    .line 57
    .line 58
    iget-boolean v0, v0, Lx1/a;->z:Z

    .line 59
    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    const-string v0, "median_app_resumed"

    .line 63
    .line 64
    invoke-static {v0, v2}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p0, v0, v2}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 69
    .line 70
    .line 71
    const-string v0, "gonative_app_resumed"

    .line 72
    .line 73
    invoke-static {v0, v2}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p0, v0, v2}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    const-string v0, "_median_app_resumed"

    .line 82
    .line 83
    invoke-static {v0, v2}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {p0, v0, v2}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lco/median/android/MainActivity;->T()V

    .line 91
    .line 92
    .line 93
    new-instance v0, Le/z;

    .line 94
    .line 95
    const/4 v1, 0x1

    .line 96
    invoke-direct {v0, v1, p0}, Le/z;-><init>(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iput-object v0, p0, Lco/median/android/MainActivity;->d0:Le/z;

    .line 100
    .line 101
    new-instance v1, Landroid/content/IntentFilter;

    .line 102
    .line 103
    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 104
    .line 105
    invoke-direct {v1, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lco/median/android/MainActivity;->b0:Lu1/s0;

    .line 112
    .line 113
    invoke-virtual {v0}, Lu1/s0;->c()V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lco/median/android/MainActivity;->Z:Lu1/o;

    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    sget-object v1, Lu1/o;->j:Landroid/net/Uri;

    .line 122
    .line 123
    if-eqz v1, :cond_4

    .line 124
    .line 125
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    if-nez v1, :cond_3

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    const-string v3, "onAppResume: Deleting file after viewing: "

    .line 135
    .line 136
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    sget-object v3, Lu1/o;->j:Landroid/net/Uri;

    .line 140
    .line 141
    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    const-string v3, "u1.o"

    .line 153
    .line 154
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    iget-object v0, v0, Lu1/o;->a:Lco/median/android/MainActivity;

    .line 158
    .line 159
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    sget-object v1, Lu1/o;->j:Landroid/net/Uri;

    .line 164
    .line 165
    invoke-virtual {v0, v1, v2, v2}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 166
    .line 167
    .line 168
    :cond_4
    :goto_1
    return-void

    .line 169
    :cond_5
    invoke-static {v0}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    throw v0
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    const-string v0, "configurationChanged"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    new-instance v0, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 17
    .line 18
    check-cast v2, Lu1/o0;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Landroid/webkit/WebView;->saveState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    .line 21
    .line 22
    .line 23
    const-string v2, "webViewState"

    .line 24
    .line 25
    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "activityId"

    .line 29
    .line 30
    iget-object v2, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lco/median/android/MainActivity;->E()Landroidx/emoji2/text/x;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v2, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v0, v0, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lu1/g0;

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    iget-boolean v0, v0, Lu1/g0;->b:Z

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    const/4 v0, 0x0

    .line 57
    :goto_0
    const-string v2, "isRoot"

    .line 58
    .line 59
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lco/median/android/MainActivity;->E()Landroidx/emoji2/text/x;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-object v2, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v0, v0, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Lu1/g0;

    .line 77
    .line 78
    const/4 v2, -0x1

    .line 79
    if-eqz v0, :cond_1

    .line 80
    .line 81
    iget v0, v0, Lu1/g0;->c:I

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    move v0, v2

    .line 85
    :goto_1
    const-string v3, "urlLevel"

    .line 86
    .line 87
    invoke-virtual {p1, v3, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lco/median/android/MainActivity;->E()Landroidx/emoji2/text/x;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-object v3, p0, Lco/median/android/MainActivity;->X:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v0, v0, Landroidx/emoji2/text/x;->a:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 99
    .line 100
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Lu1/g0;

    .line 105
    .line 106
    if-eqz v0, :cond_2

    .line 107
    .line 108
    iget v2, v0, Lu1/g0;->d:I

    .line 109
    .line 110
    :cond_2
    const-string v0, "parentUrlLevel"

    .line 111
    .line 112
    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 116
    .line 117
    check-cast v0, Lu1/o0;

    .line 118
    .line 119
    invoke-virtual {v0}, Lu1/o0;->getWebViewScrollX()I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    const-string v2, "scrollX"

    .line 124
    .line 125
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 129
    .line 130
    check-cast v0, Lu1/o0;

    .line 131
    .line 132
    invoke-virtual {v0}, Lu1/o0;->getWebViewScrollY()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    const-string v2, "scrollY"

    .line 137
    .line 138
    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 139
    .line 140
    .line 141
    :cond_3
    iget-boolean v0, p0, Lco/median/android/MainActivity;->v0:Z

    .line 142
    .line 143
    if-eqz v0, :cond_4

    .line 144
    .line 145
    const-string v0, "ignoreThemeSetup"

    .line 146
    .line 147
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 148
    .line 149
    .line 150
    :cond_4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 155
    .line 156
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 157
    .line 158
    invoke-virtual {v0}, Lu1/x;->a()Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-nez v1, :cond_6

    .line 173
    .line 174
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, Landroid/os/Parcel;->marshall()[B

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 186
    .line 187
    .line 188
    array-length v0, v1

    .line 189
    const v1, 0x7d000

    .line 190
    .line 191
    .line 192
    if-le v0, v1, :cond_5

    .line 193
    .line 194
    invoke-virtual {p1}, Landroid/os/Bundle;->clear()V

    .line 195
    .line 196
    .line 197
    :cond_5
    invoke-super {p0, p1}, Landroidx/activity/q;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :cond_6
    invoke-static {v0}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    throw p1
.end method

.method public final onStart()V
    .locals 5

    .line 1
    invoke-super {p0}, Le/j;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 9
    .line 10
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 11
    .line 12
    invoke-virtual {v0}, Lu1/x;->a()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v0, v0, Lx1/a;->J0:Lz1/d;

    .line 33
    .line 34
    iget-boolean v0, v0, Lz1/d;->d:Z

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    new-instance v0, Ljava/lang/Object;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    const-string v1, "audio"

    .line 44
    .line 45
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Landroid/media/AudioManager;

    .line 50
    .line 51
    if-nez v1, :cond_0

    .line 52
    .line 53
    const-string v2, "t1.l"

    .line 54
    .line 55
    const-string v3, "AudioManager is null. Aborting initAudioFocusListener()"

    .line 56
    .line 57
    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 58
    .line 59
    .line 60
    :cond_0
    new-instance v2, Lu1/f;

    .line 61
    .line 62
    invoke-direct {v2, v0, p0}, Lu1/f;-><init>(Ljava/lang/Object;Lco/median/android/MainActivity;)V

    .line 63
    .line 64
    .line 65
    sput-object v2, Lt1/l;->c:Lu1/f;

    .line 66
    .line 67
    new-instance v2, Landroid/media/AudioAttributes$Builder;

    .line 68
    .line 69
    invoke-direct {v2}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 70
    .line 71
    .line 72
    const/4 v3, 0x2

    .line 73
    invoke-virtual {v2, v3}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    new-instance v3, Landroid/media/AudioFocusRequest$Builder;

    .line 82
    .line 83
    const/4 v4, 0x3

    .line 84
    invoke-direct {v3, v4}, Landroid/media/AudioFocusRequest$Builder;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v2}, Landroid/media/AudioFocusRequest$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    const/4 v3, 0x1

    .line 92
    invoke-virtual {v2, v3}, Landroid/media/AudioFocusRequest$Builder;->setAcceptsDelayedFocusGain(Z)Landroid/media/AudioFocusRequest$Builder;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    sget-object v4, Lt1/l;->c:Lu1/f;

    .line 97
    .line 98
    invoke-virtual {v2, v4}, Landroid/media/AudioFocusRequest$Builder;->setOnAudioFocusChangeListener(Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v2}, Landroid/media/AudioFocusRequest$Builder;->build()Landroid/media/AudioFocusRequest;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    sput-object v2, Lt1/l;->a:Landroid/media/AudioFocusRequest;

    .line 107
    .line 108
    invoke-virtual {v1, v2}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioFocusRequest;)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    monitor-enter v0

    .line 113
    if-ne v1, v3, :cond_1

    .line 114
    .line 115
    :try_start_0
    const-string v1, "t1.l"

    .line 116
    .line 117
    const-string v2, "AudioFocusListener REQUEST GRANTED"

    .line 118
    .line 119
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :catchall_0
    move-exception v1

    .line 124
    goto :goto_1

    .line 125
    :cond_1
    :goto_0
    monitor-exit v0

    .line 126
    return-void

    .line 127
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    throw v1

    .line 129
    :cond_2
    return-void

    .line 130
    :cond_3
    invoke-static {v0}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    throw v0
.end method

.method public final onStop()V
    .locals 2

    .line 1
    invoke-super {p0}, Le/j;->onStop()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lco/median/android/GoNativeApplication;

    .line 9
    .line 10
    iget-object v0, v0, Lco/median/android/GoNativeApplication;->m:Lu1/x;

    .line 11
    .line 12
    invoke-virtual {v0}, Lu1/x;->a()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    iget-boolean v0, p0, Lco/median/android/MainActivity;->T:Z

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-boolean v0, v0, Lx1/a;->q:Z

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-interface {v0, v1}, Lx1/i;->clearCache(Z)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void

    .line 47
    :cond_1
    invoke-static {v0}, Landroidx/fragment/app/u;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    throw v0
.end method

.method public final p0(Ljava/lang/String;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lco/median/android/MainActivity;->n0:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lco/median/android/MainActivity;->J()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lb0/b;

    .line 12
    .line 13
    const/4 v2, 0x7

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v1, p0, p1, v2, v3}, Lb0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 16
    .line 17
    .line 18
    const-wide/16 v2, 0x1f4

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final q0(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->z0:Landroidx/emoji2/text/t;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :cond_0
    :try_start_1
    iget-object v1, v0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v1, v0, Landroidx/emoji2/text/t;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lorg/json/JSONObject;

    .line 40
    .line 41
    invoke-virtual {v0, p1, v1}, Landroidx/emoji2/text/t;->q(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    monitor-exit v0

    .line 48
    return-void

    .line 49
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    throw p1

    .line 51
    :cond_2
    return-void
.end method

.method public final r0(Lx1/i;ZZ)V
    .locals 4

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->F:Lco/median/android/widget/WebViewContainerView;

    .line 2
    .line 3
    iget-boolean v1, p0, Lco/median/android/MainActivity;->T:Z

    .line 4
    .line 5
    invoke-virtual {v0, p0, v1}, Lco/median/android/widget/WebViewContainerView;->a(Lco/median/android/MainActivity;Z)V

    .line 6
    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Landroid/view/View;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1, v1}, Landroid/view/View;->scrollTo(II)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 16
    .line 17
    check-cast v1, Landroid/view/View;

    .line 18
    .line 19
    if-nez p3, :cond_0

    .line 20
    .line 21
    new-instance p3, Landroid/os/Bundle;

    .line 22
    .line 23
    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 27
    .line 28
    check-cast v2, Lu1/o0;

    .line 29
    .line 30
    invoke-virtual {v2, p3}, Landroid/webkit/WebView;->saveState(Landroid/os/Bundle;)Landroid/webkit/WebBackForwardList;

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lco/median/android/MainActivity;->j0:Ljava/util/Stack;

    .line 34
    .line 35
    invoke-virtual {v2, p3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_0
    const/4 p3, 0x0

    .line 39
    if-eq p1, v1, :cond_2

    .line 40
    .line 41
    invoke-interface {p1}, Lx1/i;->getParent()Landroid/view/ViewParent;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 46
    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    check-cast v2, Landroid/view/ViewGroup;

    .line 50
    .line 51
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Landroid/view/ViewGroup;

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 75
    .line 76
    .line 77
    move-object v0, v1

    .line 78
    check-cast v0, Lu1/o0;

    .line 79
    .line 80
    invoke-virtual {v0, p3}, Lu1/o0;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p3}, Lu1/o0;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 84
    .line 85
    .line 86
    iget-boolean v0, p0, Lco/median/android/MainActivity;->H:Z

    .line 87
    .line 88
    if-nez v0, :cond_2

    .line 89
    .line 90
    check-cast v1, Lx1/i;

    .line 91
    .line 92
    invoke-interface {v1}, Lx1/i;->destroy()V

    .line 93
    .line 94
    .line 95
    :cond_2
    iput-boolean p2, p0, Lco/median/android/MainActivity;->H:Z

    .line 96
    .line 97
    iput-object p1, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 98
    .line 99
    iget-object p1, p0, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 100
    .line 101
    if-eqz p1, :cond_3

    .line 102
    .line 103
    invoke-virtual {p0, p1, p3}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 104
    .line 105
    .line 106
    iput-object p3, p0, Lco/median/android/MainActivity;->h0:Ljava/lang/String;

    .line 107
    .line 108
    :cond_3
    return-void
.end method

.method public final s0(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Le/j;->v()Lu1/h0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Lu1/h0;->E()V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-boolean v1, v1, Lx1/a;->m0:Z

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Lu1/h0;->o0()V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lco/median/android/MainActivity;->G:Lx1/i;

    .line 27
    .line 28
    invoke-interface {v0}, Lx1/i;->clearFocus()V

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_0
    iget-object v0, p0, Lco/median/android/MainActivity;->D0:Lu1/r1;

    .line 32
    .line 33
    if-eqz v0, :cond_6

    .line 34
    .line 35
    iget-object v0, v0, Lu1/r1;->e:La3/h0;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    const-string v2, "insetsController"

    .line 39
    .line 40
    if-eqz p1, :cond_4

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    iget-object v0, v0, La3/h0;->g:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Le4/a;

    .line 47
    .line 48
    invoke-virtual {v0}, Le4/a;->M()V

    .line 49
    .line 50
    .line 51
    const/4 v1, 0x2

    .line 52
    invoke-virtual {v0, v1}, Le4/a;->f0(I)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {v2}, Lr3/g;->c(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :cond_4
    if-eqz v0, :cond_5

    .line 61
    .line 62
    iget-object v0, v0, La3/h0;->g:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Le4/a;

    .line 65
    .line 66
    const/16 v1, 0x207

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Le4/a;->h0(I)V

    .line 69
    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    invoke-virtual {v0, v1}, Le4/a;->f0(I)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_5
    invoke-static {v2}, Lr3/g;->c(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v1

    .line 80
    :cond_6
    :goto_1
    if-eqz p1, :cond_7

    .line 81
    .line 82
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iget p1, p1, Lx1/a;->p1:I

    .line 87
    .line 88
    const/4 v0, 0x3

    .line 89
    if-eq p1, v0, :cond_7

    .line 90
    .line 91
    const/4 p1, 0x4

    .line 92
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_7
    invoke-virtual {p0}, Lco/median/android/MainActivity;->c0()V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lco/median/android/MainActivity;->R:Lu1/e;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v1, v0, Lu1/e;->f:Landroid/widget/ImageView;

    .line 22
    .line 23
    const/16 v2, 0x8

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, Lu1/e;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    return-void
.end method

.method public final t0()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lco/median/android/MainActivity;->n0:Ljava/lang/String;

    .line 3
    .line 4
    return-void
.end method

.method public final u0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->z0:Landroidx/emoji2/text/t;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/emoji2/text/t;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final update(Ljava/util/Observable;Ljava/lang/Object;)V
    .locals 0

    .line 1
    instance-of p2, p1, Lu1/s0;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    check-cast p1, Lu1/s0;

    .line 6
    .line 7
    iget-boolean p1, p1, Lu1/s0;->c:Z

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lco/median/android/MainActivity;->v0(Z)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final v0(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    :try_start_0
    const-string p1, "loggedIn"

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lu1/q1;->d(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catch_0
    move-exception p1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const-string p1, "default"

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lu1/q1;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :goto_0
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "co.median.android.MainActivity"

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v0, v1, v2, p1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final w(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->e0:Lu1/k0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-object p1, v0, Lu1/k0;->c:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final w0(Ljava/lang/String;)I
    .locals 3

    .line 1
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lx1/a;->P:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ge v1, v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/util/regex/Pattern;

    .line 21
    .line 22
    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-static {p0}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p1, p1, Lx1/a;->Q:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1

    .line 49
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 p1, -0x1

    .line 53
    return p1
.end method

.method public final x(Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lco/median/android/MainActivity;->Z:Lu1/o;

    .line 2
    .line 3
    iget-object v0, v0, Lu1/o;->e:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_5

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lco/median/android/MainActivity;->R:Lu1/e;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, Lu1/e;->c(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lco/median/android/MainActivity;->Q:Lu1/w1;

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lu1/w1;->b(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    iget-object v0, p0, Lco/median/android/MainActivity;->R:Lu1/e;

    .line 29
    .line 30
    if-eqz v0, :cond_a

    .line 31
    .line 32
    iget-object v2, v0, Lu1/e;->a:Lco/median/android/MainActivity;

    .line 33
    .line 34
    invoke-static {p1}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_3
    invoke-static {v2}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    iget-object v4, v3, Lx1/a;->Y0:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_4

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    invoke-virtual {v0, p1, v1}, Lu1/e;->c(Ljava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    iget-object v1, v3, Lx1/a;->c0:Ljava/util/ArrayList;

    .line 58
    .line 59
    iget-object v3, v3, Lx1/a;->d0:Ljava/util/ArrayList;

    .line 60
    .line 61
    if-eqz v1, :cond_8

    .line 62
    .line 63
    if-nez v3, :cond_5

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    const/4 v5, 0x0

    .line 71
    :goto_0
    if-ge v5, v4, :cond_a

    .line 72
    .line 73
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    check-cast v6, Ljava/util/regex/Pattern;

    .line 78
    .line 79
    invoke-virtual {v6, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_7

    .line 88
    .line 89
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, Ljava/lang/String;

    .line 94
    .line 95
    iget-object v3, v0, Lu1/e;->n:Ljava/lang/String;

    .line 96
    .line 97
    if-nez v3, :cond_6

    .line 98
    .line 99
    if-eqz v1, :cond_a

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_6
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-nez v3, :cond_a

    .line 107
    .line 108
    :goto_1
    iput-object v1, v0, Lu1/e;->n:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v2}, Le/j;->invalidateOptionsMenu()V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_8
    :goto_2
    iget-object v1, v0, Lu1/e;->n:Ljava/lang/String;

    .line 118
    .line 119
    if-nez v1, :cond_9

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_9
    const/4 v3, 0x0

    .line 123
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-nez v1, :cond_a

    .line 128
    .line 129
    iput-object v3, v0, Lu1/e;->n:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v2}, Le/j;->invalidateOptionsMenu()V

    .line 132
    .line 133
    .line 134
    :cond_a
    :goto_3
    iget-object v0, p0, Lco/median/android/MainActivity;->c0:Landroidx/emoji2/text/x;

    .line 135
    .line 136
    if-eqz v0, :cond_c

    .line 137
    .line 138
    iput-object p1, v0, Landroidx/emoji2/text/x;->c:Ljava/lang/Object;

    .line 139
    .line 140
    iget-object v0, v0, Landroidx/emoji2/text/x;->d:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Ljava/util/LinkedList;

    .line 143
    .line 144
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    :cond_b
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_c

    .line 153
    .line 154
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    check-cast v1, Lu1/n1;

    .line 159
    .line 160
    iget-object v2, v1, Lu1/n1;->b:Ljava/util/LinkedList;

    .line 161
    .line 162
    invoke-static {p1, v2}, Lt2/i;->P(Ljava/lang/String;Ljava/util/LinkedList;)Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-eqz v2, :cond_b

    .line 167
    .line 168
    invoke-virtual {v1}, Lu1/n1;->a()V

    .line 169
    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_c
    iget-object v0, p0, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 173
    .line 174
    if-eqz v0, :cond_d

    .line 175
    .line 176
    invoke-virtual {v0, p1}, Lu1/q1;->a(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :cond_d
    :goto_5
    return-void
.end method

.method public final y(Lorg/json/JSONArray;)Ljava/util/LinkedHashMap;
    .locals 7

    .line 1
    sget-object v0, Lu1/k1;->a:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    new-instance v3, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    move v4, v1

    .line 16
    :goto_0
    if-ge v4, v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    add-int/lit8 v4, v4, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v3, 0x0

    .line 29
    :cond_1
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    if-eqz v3, :cond_5

    .line 35
    .line 36
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    :cond_3
    :goto_1
    if-ge v1, v2, :cond_6

    .line 48
    .line 49
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    check-cast v4, Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, Ljava/lang/String;

    .line 62
    .line 63
    if-eqz v5, :cond_3

    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    if-nez v6, :cond_4

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    invoke-static {p0, v5}, Lu1/k1;->a(Lco/median/android/MainActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-interface {p1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_5
    :goto_2
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_6

    .line 93
    .line 94
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Ljava/util/Map$Entry;

    .line 99
    .line 100
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Ljava/lang/String;

    .line 105
    .line 106
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {p0, v1}, Lu1/k1;->a(Lco/median/android/MainActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_6
    return-object p1
.end method

.method public final z(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    new-instance v0, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "clipboard"

    .line 13
    .line 14
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroid/content/ClipboardManager;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const-string v3, "error"

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {v1, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    const-string v2, "data"

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const-string v1, "Clipboard item is not a string."

    .line 54
    .line 55
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    const-string v1, "No Clipboard item available."

    .line 60
    .line 61
    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :goto_0
    new-instance v1, Lorg/json/JSONObject;

    .line 65
    .line 66
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1, v1}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const/4 v0, 0x0

    .line 74
    invoke-virtual {p0, p1, v0}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    return-void
.end method
