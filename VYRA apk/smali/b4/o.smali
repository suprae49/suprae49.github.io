.class public Lb4/o;
.super Lz3/a;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lk3/b;


# instance fields
.field public final i:Lk3/e;


# direct methods
.method public constructor <init>(Li3/g;Lk3/e;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0}, Lz3/a;-><init>(Li3/g;Z)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Lb4/o;->i:Lk3/e;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final c()Lk3/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lb4/o;->i:Lk3/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    return-object v0
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb4/o;->i:Lk3/e;

    .line 2
    .line 3
    invoke-static {v0}, Le4/a;->N(Li3/c;)Li3/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1}, Lz3/l;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {v0, p1}, Lb4/d;->d(Li3/c;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public i(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb4/o;->i:Lk3/e;

    .line 2
    .line 3
    invoke-static {p1}, Lz3/l;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lk3/e;->e(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final w()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
