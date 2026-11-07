.class public final Le/p0;
.super Li/a;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lj/k;


# instance fields
.field public final h:Landroid/content/Context;

.field public final i:Lj/m;

.field public j:Landroidx/emoji2/text/p;

.field public k:Ljava/lang/ref/WeakReference;

.field public final synthetic l:Le/q0;


# direct methods
.method public constructor <init>(Le/q0;Landroid/content/Context;Landroidx/emoji2/text/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le/p0;->l:Le/q0;

    .line 5
    .line 6
    iput-object p2, p0, Le/p0;->h:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Le/p0;->j:Landroidx/emoji2/text/p;

    .line 9
    .line 10
    new-instance p1, Lj/m;

    .line 11
    .line 12
    invoke-direct {p1, p2}, Lj/m;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    iput p2, p1, Lj/m;->l:I

    .line 17
    .line 18
    iput-object p1, p0, Le/p0;->i:Lj/m;

    .line 19
    .line 20
    iput-object p0, p1, Lj/m;->e:Lj/k;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Le/p0;->l:Le/q0;

    .line 2
    .line 3
    iget-object v1, v0, Le/q0;->m:Le/p0;

    .line 4
    .line 5
    if-eq v1, p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v1, v0, Le/q0;->t:Z

    .line 9
    .line 10
    iget-boolean v2, v0, Le/q0;->u:Z

    .line 11
    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v1, p0, Le/p0;->j:Landroidx/emoji2/text/p;

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Landroidx/emoji2/text/p;->r(Li/a;)V

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_2
    :goto_0
    iput-object p0, v0, Le/q0;->n:Le/p0;

    .line 24
    .line 25
    iget-object v1, p0, Le/p0;->j:Landroidx/emoji2/text/p;

    .line 26
    .line 27
    iput-object v1, v0, Le/q0;->o:Landroidx/emoji2/text/p;

    .line 28
    .line 29
    :goto_1
    const/4 v1, 0x0

    .line 30
    iput-object v1, p0, Le/p0;->j:Landroidx/emoji2/text/p;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {v0, v2}, Le/q0;->u0(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v2, v0, Le/q0;->j:Landroidx/appcompat/widget/ActionBarContextView;

    .line 37
    .line 38
    iget-object v3, v2, Landroidx/appcompat/widget/ActionBarContextView;->p:Landroid/view/View;

    .line 39
    .line 40
    if-nez v3, :cond_3

    .line 41
    .line 42
    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    .line 43
    .line 44
    .line 45
    :cond_3
    iget-object v2, v0, Le/q0;->g:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 46
    .line 47
    iget-boolean v3, v0, Le/q0;->z:Z

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    .line 50
    .line 51
    .line 52
    iput-object v1, v0, Le/q0;->m:Le/p0;

    .line 53
    .line 54
    return-void
.end method

.method public final b()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Le/p0;->k:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/view/View;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public final c()Lj/m;
    .locals 1

    .line 1
    iget-object v0, p0, Le/p0;->i:Lj/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Landroid/view/MenuInflater;
    .locals 2

    .line 1
    new-instance v0, Li/h;

    .line 2
    .line 3
    iget-object v1, p0, Le/p0;->h:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li/h;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final e()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Le/p0;->l:Le/q0;

    .line 2
    .line 3
    iget-object v0, v0, Le/q0;->j:Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final f()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Le/p0;->l:Le/q0;

    .line 2
    .line 3
    iget-object v0, v0, Le/q0;->j:Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/p0;->l:Le/q0;

    .line 2
    .line 3
    iget-object v0, v0, Le/q0;->m:Le/p0;

    .line 4
    .line 5
    if-eq v0, p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Le/p0;->i:Lj/m;

    .line 9
    .line 10
    invoke-virtual {v0}, Lj/m;->y()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-object v1, p0, Le/p0;->j:Landroidx/emoji2/text/p;

    .line 14
    .line 15
    invoke-virtual {v1, p0, v0}, Landroidx/emoji2/text/p;->s(Li/a;Landroid/view/Menu;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lj/m;->x()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    invoke-virtual {v0}, Lj/m;->x()V

    .line 24
    .line 25
    .line 26
    throw v1
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/p0;->l:Le/q0;

    .line 2
    .line 3
    iget-object v0, v0, Le/q0;->j:Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    iget-boolean v0, v0, Landroidx/appcompat/widget/ActionBarContextView;->x:Z

    .line 6
    .line 7
    return v0
.end method

.method public final i(Lj/m;)V
    .locals 0

    .line 1
    iget-object p1, p0, Le/p0;->j:Landroidx/emoji2/text/p;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Le/p0;->g()V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Le/p0;->l:Le/q0;

    .line 10
    .line 11
    iget-object p1, p1, Le/q0;->j:Landroidx/appcompat/widget/ActionBarContextView;

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarContextView;->i:Landroidx/appcompat/widget/b;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/appcompat/widget/b;->n()Z

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    return-void
.end method

.method public final j(Lj/m;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Le/p0;->j:Landroidx/emoji2/text/p;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, Landroidx/emoji2/text/p;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Landroidx/emoji2/text/x;

    .line 8
    .line 9
    invoke-virtual {p1, p0, p2}, Landroidx/emoji2/text/x;->d(Li/a;Landroid/view/MenuItem;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
.end method

.method public final k(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/p0;->l:Le/q0;

    .line 2
    .line 3
    iget-object v0, v0, Le/q0;->j:Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Le/p0;->k:Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    return-void
.end method

.method public final l(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/p0;->l:Le/q0;

    .line 2
    .line 3
    iget-object v0, v0, Le/q0;->e:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Le/p0;->m(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final m(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/p0;->l:Le/q0;

    .line 2
    .line 3
    iget-object v0, v0, Le/q0;->j:Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final n(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/p0;->l:Le/q0;

    .line 2
    .line 3
    iget-object v0, v0, Le/q0;->e:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Le/p0;->o(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final o(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/p0;->l:Le/q0;

    .line 2
    .line 3
    iget-object v0, v0, Le/q0;->j:Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final p(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Li/a;->g:Z

    .line 2
    .line 3
    iget-object v0, p0, Le/p0;->l:Le/q0;

    .line 4
    .line 5
    iget-object v0, v0, Le/q0;->j:Landroidx/appcompat/widget/ActionBarContextView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
