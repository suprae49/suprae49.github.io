.class public abstract Le/a0;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Le/a0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v1, Lv2/p;

    .line 12
    .line 13
    invoke-direct {v1}, Lv2/p;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Le/a0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le/d0;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/a0;->b:Ljava/lang/Object;

    return-void
.end method

.method public static g(III)F
    .locals 0

    .line 1
    sub-int/2addr p0, p1

    .line 2
    int-to-float p0, p0

    .line 3
    int-to-float p1, p2

    .line 4
    div-float/2addr p0, p1

    .line 5
    const/4 p1, 0x0

    .line 6
    const/high16 p2, 0x3f800000    # 1.0f

    .line 7
    .line 8
    invoke-static {p0, p1, p2}, Lu1/h0;->i(FFF)F

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method


# virtual methods
.method public abstract c()V
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/a0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Le/z;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object v1, p0, Le/a0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Le/d0;

    .line 10
    .line 11
    iget-object v1, v1, Le/d0;->p:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    :catch_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Le/a0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public abstract e()Landroid/content/IntentFilter;
.end method

.method public abstract f()I
.end method

.method public h(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    .line 1
    instance-of v0, p1, Lh0/a;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, Lh0/a;

    .line 6
    .line 7
    iget-object v0, p0, Le/a0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lp/k;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lp/k;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, Lp/k;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Le/a0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Le/a0;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lp/k;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lp/k;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroid/view/MenuItem;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    new-instance v0, Lj/t;

    .line 34
    .line 35
    iget-object v1, p0, Le/a0;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Landroid/content/Context;

    .line 38
    .line 39
    invoke-direct {v0, v1, p1}, Lj/t;-><init>(Landroid/content/Context;Lh0/a;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Le/a0;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lp/k;

    .line 45
    .line 46
    invoke-virtual {v1, p1, v0}, Lp/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_1
    return-object v0

    .line 50
    :cond_2
    return-object p1
.end method

.method public abstract i()V
.end method

.method public abstract j()V
.end method

.method public abstract k(Lv2/d;)V
.end method

.method public abstract l()V
.end method

.method public m()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Le/a0;->d()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Le/a0;->e()Landroid/content/IntentFilter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/content/IntentFilter;->countActions()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v1, p0, Le/a0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Le/z;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    new-instance v1, Le/z;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, v2, p0}, Le/z;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Le/a0;->a:Ljava/lang/Object;

    .line 28
    .line 29
    :cond_1
    iget-object v1, p0, Le/a0;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Le/d0;

    .line 32
    .line 33
    iget-object v1, v1, Le/d0;->p:Landroid/content/Context;

    .line 34
    .line 35
    iget-object v2, p0, Le/a0;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, Le/z;

    .line 38
    .line 39
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public abstract n()V
.end method

.method public abstract o()V
.end method
