.class public final Lu1/d1;
.super Lk3/e;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lq3/p;


# instance fields
.field public final synthetic j:Lr0/b;

.field public final synthetic k:Landroid/content/Context;

.field public final synthetic l:Ljava/io/File;


# direct methods
.method public constructor <init>(Lr0/b;Landroid/content/Context;Ljava/io/File;Li3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu1/d1;->j:Lr0/b;

    .line 2
    .line 3
    iput-object p2, p0, Lu1/d1;->k:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Lu1/d1;->l:Ljava/io/File;

    .line 6
    .line 7
    invoke-direct {p0, p4}, Lk3/e;-><init>(Li3/c;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lz3/j;

    .line 2
    .line 3
    check-cast p2, Li3/c;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lu1/d1;->h(Li3/c;Ljava/lang/Object;)Li3/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu1/d1;

    .line 10
    .line 11
    sget-object p2, Lg3/g;->a:Lg3/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu1/d1;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final h(Li3/c;Ljava/lang/Object;)Li3/c;
    .locals 3

    .line 1
    new-instance p2, Lu1/d1;

    .line 2
    .line 3
    iget-object v0, p0, Lu1/d1;->k:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, Lu1/d1;->l:Ljava/io/File;

    .line 6
    .line 7
    iget-object v2, p0, Lu1/d1;->j:Lr0/b;

    .line 8
    .line 9
    invoke-direct {p2, v2, v0, v1, p1}, Lu1/d1;-><init>(Lr0/b;Landroid/content/Context;Ljava/io/File;Li3/c;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, Lu1/h0;->q0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lu1/d1;->k:Landroid/content/Context;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, ".fileprovider"

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, Lu1/d1;->l:Ljava/io/File;

    .line 35
    .line 36
    invoke-static {p1, v0, v1}, Landroidx/core/content/FileProvider;->d(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lu1/d1;->j:Lr0/b;

    .line 44
    .line 45
    iget-object v0, v0, Lr0/b;->f:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lu1/e2;

    .line 48
    .line 49
    iget-object v1, v0, Lu1/e2;->r:Landroid/webkit/ValueCallback;

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    filled-new-array {p1}, [Landroid/net/Uri;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-interface {v1, p1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    iput-object p1, v0, Lu1/e2;->r:Landroid/webkit/ValueCallback;

    .line 62
    .line 63
    :cond_0
    sget-object p1, Lg3/g;->a:Lg3/g;

    .line 64
    .line 65
    return-object p1
.end method
