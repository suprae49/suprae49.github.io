.class public final Lx3/j;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ls3/a;


# instance fields
.field public final synthetic f:Lx3/l;


# direct methods
.method public constructor <init>(Lx3/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx3/j;->f:Lx3/l;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Ly3/b;

    .line 2
    .line 3
    iget-object v1, p0, Lx3/j;->f:Lx3/l;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ly3/b;-><init>(Lx3/l;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
