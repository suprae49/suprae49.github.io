.class public final Landroidx/activity/h0;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroidx/activity/c;


# instance fields
.field public final f:Landroidx/fragment/app/m0;

.field public final synthetic g:Landroidx/activity/j0;


# direct methods
.method public constructor <init>(Landroidx/activity/j0;Landroidx/fragment/app/m0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/activity/h0;->g:Landroidx/activity/j0;

    .line 8
    .line 9
    iput-object p2, p0, Landroidx/activity/h0;->f:Landroidx/fragment/app/m0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/activity/h0;->g:Landroidx/activity/j0;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/activity/j0;->b:Lh3/c;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/activity/h0;->f:Landroidx/fragment/app/m0;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lh3/c;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Landroidx/activity/j0;->c:Landroidx/fragment/app/m0;

    .line 11
    .line 12
    invoke-static {v1, v2}, Lr3/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iput-object v3, v0, Landroidx/activity/j0;->c:Landroidx/fragment/app/m0;

    .line 23
    .line 24
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v0, v2, Landroidx/fragment/app/m0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    iget-object v0, v2, Landroidx/fragment/app/m0;->c:Landroidx/activity/i0;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-interface {v0}, Lq3/a;->a()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_1
    iput-object v3, v2, Landroidx/fragment/app/m0;->c:Landroidx/activity/i0;

    .line 40
    .line 41
    return-void
.end method
