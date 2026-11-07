.class public final Lx3/e;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lx3/g;


# instance fields
.field public final a:Lx3/g;

.field public final b:Lq3/l;

.field public final c:Lu1/q;


# direct methods
.method public constructor <init>(Lx3/g;Lq3/l;Lu1/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx3/e;->a:Lx3/g;

    .line 5
    .line 6
    iput-object p2, p0, Lx3/e;->b:Lq3/l;

    .line 7
    .line 8
    iput-object p3, p0, Lx3/e;->c:Lu1/q;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lx3/c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lx3/c;-><init>(Lx3/e;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
