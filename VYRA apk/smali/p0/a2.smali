.class public Lp0/a2;
.super Le4/a;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final h:Landroid/view/WindowInsetsController;

.field public final i:La3/h0;

.field public final j:Landroid/view/Window;


# direct methods
.method public constructor <init>(Landroid/view/Window;La3/h0;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lp0/u1;->c(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lp0/a2;->h:Landroid/view/WindowInsetsController;

    .line 9
    .line 10
    iput-object p2, p0, Lp0/a2;->i:La3/h0;

    .line 11
    .line 12
    iput-object p1, p0, Lp0/a2;->j:Landroid/view/Window;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp0/a2;->h:Landroid/view/WindowInsetsController;

    .line 2
    .line 3
    const/16 v1, 0x207

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/a;->C(Landroid/view/WindowInsetsController;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b0(Z)V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    iget-object v1, p0, Lp0/a2;->j:Landroid/view/Window;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    or-int/2addr v0, v1

    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {p0, v0}, Lp0/a2;->o0(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object v1, p0, Lp0/a2;->h:Landroid/view/WindowInsetsController;

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    invoke-static {v1, v0, v0}, Lp0/u1;->g(Landroid/view/WindowInsetsController;II)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    invoke-static {v1, v0}, Lp0/u1;->f(Landroid/view/WindowInsetsController;I)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public c0(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp0/a2;->j:Landroid/view/Window;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/16 v1, 0x2000

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    or-int/2addr v0, v1

    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {p0, v1}, Lp0/a2;->o0(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object v0, p0, Lp0/a2;->h:Landroid/view/WindowInsetsController;

    .line 27
    .line 28
    const/16 v1, 0x8

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    invoke-static {v0, v1, v1}, Lp0/u1;->g(Landroid/view/WindowInsetsController;II)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    invoke-static {v0, v1}, Lp0/u1;->f(Landroid/view/WindowInsetsController;I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public f0(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lp0/a2;->j:Landroid/view/Window;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const v2, 0x1538b9a6

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v1, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    const/16 v2, 0x1000

    .line 23
    .line 24
    const/16 v3, 0x800

    .line 25
    .line 26
    if-eq p1, v1, :cond_1

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    if-eq p1, v1, :cond_0

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-virtual {p0, v3}, Lp0/a2;->o0(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    or-int/2addr v0, v2

    .line 44
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    invoke-virtual {p0, v2}, Lp0/a2;->o0(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    or-int/2addr v0, v3

    .line 60
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_2
    const/16 p1, 0x1800

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Lp0/a2;->o0(I)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    iget-object v0, p0, Lp0/a2;->h:Landroid/view/WindowInsetsController;

    .line 71
    .line 72
    invoke-static {v0, p1}, Lp0/u1;->j(Landroid/view/WindowInsetsController;I)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final h0(I)V
    .locals 1

    .line 1
    and-int/lit8 v0, p1, 0x8

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lp0/a2;->i:La3/h0;

    .line 6
    .line 7
    iget-object v0, v0, La3/h0;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La3/h0;

    .line 10
    .line 11
    invoke-virtual {v0}, La3/h0;->B()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lp0/a2;->h:Landroid/view/WindowInsetsController;

    .line 15
    .line 16
    and-int/lit8 p1, p1, -0x9

    .line 17
    .line 18
    invoke-static {v0, p1}, Lcom/google/android/gms/common/api/a;->y(Landroid/view/WindowInsetsController;I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final o0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp0/a2;->j:Landroid/view/Window;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    not-int p1, p1

    .line 12
    and-int/2addr p1, v1

    .line 13
    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
