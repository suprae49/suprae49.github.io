.class public final Lk/g;
.super Lj/w;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic m:I

.field public final synthetic n:Landroidx/appcompat/widget/b;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/b;Landroid/content/Context;Lj/e0;Landroid/view/View;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lk/g;->m:I

    .line 3
    .line 4
    iput-object p1, p0, Lk/g;->n:Landroidx/appcompat/widget/b;

    .line 5
    .line 6
    const v2, 0x7f040022

    .line 7
    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    move-object v1, p0

    .line 12
    move-object v4, p2

    .line 13
    move-object v6, p3

    .line 14
    move-object v5, p4

    .line 15
    invoke-direct/range {v1 .. v7}, Lj/w;-><init>(IILandroid/content/Context;Landroid/view/View;Lj/m;Z)V

    .line 16
    .line 17
    .line 18
    iget-object p2, v6, Lj/e0;->A:Lj/o;

    .line 19
    .line 20
    iget p2, p2, Lj/o;->x:I

    .line 21
    .line 22
    const/16 p3, 0x20

    .line 23
    .line 24
    and-int/2addr p2, p3

    .line 25
    if-ne p2, p3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object p2, p1, Landroidx/appcompat/widget/b;->o:Lk/j;

    .line 29
    .line 30
    if-nez p2, :cond_1

    .line 31
    .line 32
    iget-object p2, p1, Landroidx/appcompat/widget/b;->m:Lj/a0;

    .line 33
    .line 34
    check-cast p2, Landroid/view/View;

    .line 35
    .line 36
    :cond_1
    iput-object p2, v1, Lj/w;->f:Landroid/view/View;

    .line 37
    .line 38
    :goto_0
    iget-object p1, p1, Landroidx/appcompat/widget/b;->C:La3/h0;

    .line 39
    .line 40
    iput-object p1, v1, Lj/w;->i:Lj/x;

    .line 41
    .line 42
    iget-object p2, v1, Lj/w;->j:Lj/u;

    .line 43
    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    invoke-interface {p2, p1}, Lj/y;->l(Lj/x;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/widget/b;Landroid/content/Context;Lj/m;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x1

    iput v0, p0, Lk/g;->m:I

    .line 50
    iput-object p1, p0, Lk/g;->n:Landroidx/appcompat/widget/b;

    const v2, 0x7f040022

    const/4 v3, 0x0

    const/4 v7, 0x1

    move-object v1, p0

    move-object v4, p2

    move-object v6, p3

    move-object v5, p4

    .line 51
    invoke-direct/range {v1 .. v7}, Lj/w;-><init>(IILandroid/content/Context;Landroid/view/View;Lj/m;Z)V

    const p2, 0x800005

    .line 52
    iput p2, v1, Lj/w;->g:I

    .line 53
    iget-object p1, p1, Landroidx/appcompat/widget/b;->C:La3/h0;

    .line 54
    iput-object p1, v1, Lj/w;->i:Lj/x;

    .line 55
    iget-object p2, v1, Lj/w;->j:Lj/u;

    if-eqz p2, :cond_0

    .line 56
    invoke-interface {p2, p1}, Lj/y;->l(Lj/x;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    .line 1
    iget v0, p0, Lk/g;->m:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk/g;->n:Landroidx/appcompat/widget/b;

    .line 7
    .line 8
    iget-object v1, v0, Landroidx/appcompat/widget/b;->h:Lj/m;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v1, v2}, Lj/m;->c(Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    iput-object v1, v0, Landroidx/appcompat/widget/b;->y:Lk/g;

    .line 18
    .line 19
    invoke-super {p0}, Lj/w;->c()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    const/4 v0, 0x0

    .line 24
    iget-object v1, p0, Lk/g;->n:Landroidx/appcompat/widget/b;

    .line 25
    .line 26
    iput-object v0, v1, Landroidx/appcompat/widget/b;->z:Lk/g;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput v0, v1, Landroidx/appcompat/widget/b;->D:I

    .line 30
    .line 31
    invoke-super {p0}, Lj/w;->c()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
