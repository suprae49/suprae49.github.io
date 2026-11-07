.class public final Landroidx/lifecycle/SavedStateHandleController;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroidx/lifecycle/r;


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:Landroidx/lifecycle/j0;

.field public h:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroidx/lifecycle/j0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/lifecycle/SavedStateHandleController;->f:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/lifecycle/SavedStateHandleController;->g:Landroidx/lifecycle/j0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/t;Landroidx/lifecycle/m;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    iput-boolean p2, p0, Landroidx/lifecycle/SavedStateHandleController;->h:Z

    .line 7
    .line 8
    invoke-interface {p1}, Landroidx/lifecycle/t;->getLifecycle()Landroidx/lifecycle/o;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1, p0}, Landroidx/lifecycle/o;->b(Landroidx/lifecycle/s;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final b(Landroidx/lifecycle/o;Ll1/c;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/lifecycle/SavedStateHandleController;->h:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Landroidx/lifecycle/SavedStateHandleController;->h:Z

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/s;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Landroidx/lifecycle/SavedStateHandleController;->g:Landroidx/lifecycle/j0;

    .line 18
    .line 19
    iget-object p1, p1, Landroidx/lifecycle/j0;->e:Ll1/b;

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/lifecycle/SavedStateHandleController;->f:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p2, v0, p1}, Ll1/c;->c(Ljava/lang/String;Ll1/b;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const-string p1, "Already attached to lifecycleOwner"

    .line 28
    .line 29
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
