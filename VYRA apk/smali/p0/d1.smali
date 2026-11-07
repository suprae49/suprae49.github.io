.class public Lp0/d1;
.super Lp0/j1;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final e:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Lp0/j1;-><init>()V

    .line 23
    invoke-static {}, Landroidx/activity/x;->l()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, Lp0/d1;->e:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Lp0/y1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lp0/j1;-><init>(Lp0/y1;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lp0/y1;->g()Landroid/view/WindowInsets;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lp0/c1;->d(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {}, Landroidx/activity/x;->l()Landroid/view/WindowInsets$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    iput-object p1, p0, Lp0/d1;->e:Landroid/view/WindowInsets$Builder;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public b()Lp0/y1;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lp0/j1;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lp0/d1;->e:Landroid/view/WindowInsets$Builder;

    .line 5
    .line 6
    invoke-static {v0}, Landroidx/activity/x;->m(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v1, v0}, Lp0/y1;->h(Landroid/view/View;Landroid/view/WindowInsets;)Lp0/y1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v2, p0, Lp0/j1;->b:[Lf0/c;

    .line 16
    .line 17
    iget-object v3, v0, Lp0/y1;->a:Lp0/t1;

    .line 18
    .line 19
    invoke-virtual {v3, v2}, Lp0/t1;->u([Lf0/c;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v1}, Lp0/t1;->t(Lp0/j;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lp0/j1;->c:[[Landroid/graphics/Rect;

    .line 26
    .line 27
    invoke-virtual {v3, v1}, Lp0/t1;->y([[Landroid/graphics/Rect;)V

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Lp0/j1;->d:[[Landroid/graphics/Rect;

    .line 31
    .line 32
    invoke-virtual {v3, v1}, Lp0/t1;->z([[Landroid/graphics/Rect;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public e(Lf0/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/d1;->e:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lf0/c;->e()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lp0/c1;->l(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public f(Lf0/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/d1;->e:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lf0/c;->e()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Landroidx/activity/x;->A(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public g(Lf0/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/d1;->e:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lf0/c;->e()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Landroidx/activity/x;->C(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public h(Lf0/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/d1;->e:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lf0/c;->e()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Landroidx/activity/x;->u(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public i(Lf0/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/d1;->e:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lf0/c;->e()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lp0/c1;->s(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
