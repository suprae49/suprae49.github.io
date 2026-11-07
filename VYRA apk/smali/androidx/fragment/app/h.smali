.class public final Landroidx/fragment/app/h;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:Landroidx/fragment/app/o1;

.field public final synthetic g:Landroidx/fragment/app/o1;

.field public final synthetic h:Z


# direct methods
.method public constructor <init>(Landroidx/fragment/app/o1;Landroidx/fragment/app/o1;ZLp/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/h;->f:Landroidx/fragment/app/o1;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/fragment/app/h;->g:Landroidx/fragment/app/o1;

    .line 7
    .line 8
    iput-boolean p3, p0, Landroidx/fragment/app/h;->h:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/h;->f:Landroidx/fragment/app/o1;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/Fragment;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/fragment/app/h;->g:Landroidx/fragment/app/o1;

    .line 6
    .line 7
    iget-object v1, v1, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    sget-object v2, Landroidx/fragment/app/d1;->a:Landroidx/fragment/app/i1;

    .line 10
    .line 11
    iget-boolean v2, p0, Landroidx/fragment/app/h;->h:Z

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Lb0/r;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Lb0/r;

    .line 20
    .line 21
    .line 22
    return-void
.end method
