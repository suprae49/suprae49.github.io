.class public Lp0/n1;
.super Lp0/m1;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public s:Lf0/c;

.field public t:Lf0/c;

.field public u:Lf0/c;


# direct methods
.method public constructor <init>(Lp0/y1;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lp0/m1;-><init>(Lp0/y1;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lp0/n1;->s:Lf0/c;

    .line 6
    .line 7
    iput-object p1, p0, Lp0/n1;->t:Lf0/c;

    .line 8
    .line 9
    iput-object p1, p0, Lp0/n1;->u:Lf0/c;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public j()Lf0/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/n1;->t:Lf0/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lp0/k1;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lp0/c1;->p(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lf0/c;->d(Landroid/graphics/Insets;)Lf0/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lp0/n1;->t:Lf0/c;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lp0/n1;->t:Lf0/c;

    .line 18
    .line 19
    return-object v0
.end method

.method public l()Lf0/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/n1;->s:Lf0/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lp0/k1;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lp0/c1;->t(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lf0/c;->d(Landroid/graphics/Insets;)Lf0/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lp0/n1;->s:Lf0/c;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lp0/n1;->s:Lf0/c;

    .line 18
    .line 19
    return-object v0
.end method

.method public n()Lf0/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/n1;->u:Lf0/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lp0/k1;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lp0/c1;->c(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lf0/c;->d(Landroid/graphics/Insets;)Lf0/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lp0/n1;->u:Lf0/c;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lp0/n1;->u:Lf0/c;

    .line 18
    .line 19
    return-object v0
.end method

.method public q(IIII)Lp0/y1;
    .locals 1

    .line 1
    iget-object v0, p0, Lp0/k1;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3, p4}, Lp0/c1;->e(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-static {p2, p1}, Lp0/y1;->h(Landroid/view/View;Landroid/view/WindowInsets;)Lp0/y1;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public w(Lf0/c;)V
    .locals 0

    .line 1
    return-void
.end method
