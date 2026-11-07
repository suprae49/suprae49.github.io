.class public final Landroidx/fragment/app/o;
.super Landroidx/fragment/app/g0;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic f:Landroidx/fragment/app/g0;

.field public final synthetic g:Landroidx/fragment/app/p;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/p;Landroidx/fragment/app/g0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/p;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/fragment/app/o;->f:Landroidx/fragment/app/g0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final n(I)Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/o;->f:Landroidx/fragment/app/g0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/g0;->o()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroidx/fragment/app/g0;->n(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/p;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroidx/fragment/app/p;->onFindViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
.end method

.method public final o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/o;->f:Landroidx/fragment/app/g0;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/g0;->o()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/fragment/app/o;->g:Landroidx/fragment/app/p;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/fragment/app/p;->onHasView()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    return v0
.end method
