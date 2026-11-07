.class public final Lx1/m;
.super Ljava/util/TimerTask;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic f:Ljava/util/Timer;

.field public final synthetic g:Lx1/a;


# direct methods
.method public constructor <init>(Lx1/a;Ljava/util/Timer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx1/m;->g:Lx1/a;

    .line 2
    .line 3
    iput-object p2, p0, Lx1/m;->f:Ljava/util/Timer;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/m;->g:Lx1/a;

    .line 2
    .line 3
    iget-object v1, v0, Lx1/a;->e1:Ljava/util/HashMap;

    .line 4
    .line 5
    iput-object v1, v0, Lx1/a;->V:Ljava/util/HashMap;

    .line 6
    .line 7
    iget-object v0, p0, Lx1/m;->f:Ljava/util/Timer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
