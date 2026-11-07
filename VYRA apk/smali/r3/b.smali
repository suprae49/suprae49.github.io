.class public abstract Lr3/b;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lw3/a;
.implements Ljava/io/Serializable;


# instance fields
.field public transient f:Lw3/a;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Class;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr3/b;->g:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lr3/b;->h:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, Lr3/b;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lr3/b;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p5, p0, Lr3/b;->k:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final c()Lr3/c;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lr3/b;->k:Z

    .line 2
    .line 3
    iget-object v1, p0, Lr3/b;->h:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lr3/l;->a:Lr3/m;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, Lr3/i;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lr3/i;-><init>(Ljava/lang/Class;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    sget-object v0, Lr3/l;->a:Lr3/m;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v0, Lr3/d;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lr3/d;-><init>(Ljava/lang/Class;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method
