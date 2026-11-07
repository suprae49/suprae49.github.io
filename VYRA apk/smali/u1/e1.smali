.class public final Lu1/e1;
.super Lk3/e;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lq3/p;


# instance fields
.field public final synthetic j:Lr0/b;

.field public final synthetic k:Ljava/lang/Exception;


# direct methods
.method public constructor <init>(Lr0/b;Ljava/lang/Exception;Li3/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu1/e1;->j:Lr0/b;

    .line 2
    .line 3
    iput-object p2, p0, Lu1/e1;->k:Ljava/lang/Exception;

    .line 4
    .line 5
    invoke-direct {p0, p3}, Lk3/e;-><init>(Li3/c;)V

    .line 6
    .line 7
    .line 8
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
    invoke-virtual {p0, p2, p1}, Lu1/e1;->h(Li3/c;Ljava/lang/Object;)Li3/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu1/e1;

    .line 10
    .line 11
    sget-object p2, Lg3/g;->a:Lg3/g;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu1/e1;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final h(Li3/c;Ljava/lang/Object;)Li3/c;
    .locals 2

    .line 1
    new-instance p2, Lu1/e1;

    .line 2
    .line 3
    iget-object v0, p0, Lu1/e1;->j:Lr0/b;

    .line 4
    .line 5
    iget-object v1, p0, Lu1/e1;->k:Ljava/lang/Exception;

    .line 6
    .line 7
    invoke-direct {p2, v0, v1, p1}, Lu1/e1;-><init>(Lr0/b;Ljava/lang/Exception;Li3/c;)V

    .line 8
    .line 9
    .line 10
    return-object p2
.end method

.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, Lu1/h0;->q0(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const-string p1, "u1.e2"

    .line 5
    .line 6
    const-string v0, "onFailure: "

    .line 7
    .line 8
    iget-object v1, p0, Lu1/e1;->k:Ljava/lang/Exception;

    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lu1/e1;->j:Lr0/b;

    .line 14
    .line 15
    iget-object p1, p1, Lr0/b;->f:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Lu1/e2;

    .line 18
    .line 19
    iget-object v0, p1, Lu1/e2;->r:Landroid/webkit/ValueCallback;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p1, Lu1/e2;->r:Landroid/webkit/ValueCallback;

    .line 28
    .line 29
    :cond_0
    sget-object p1, Lg3/g;->a:Lg3/g;

    .line 30
    .line 31
    return-object p1
.end method
