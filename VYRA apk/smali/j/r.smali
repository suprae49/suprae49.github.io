.class public final Lj/r;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/view/MenuItem$OnActionExpandListener;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final synthetic c:Landroid/view/MenuItem;


# direct methods
.method public constructor <init>(Lj/t;Landroid/view/MenuItem$OnActionExpandListener;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lj/r;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lj/r;->c:Landroid/view/MenuItem;

    .line 8
    .line 9
    iput-object p2, p0, Lj/r;->b:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lu1/e;Landroid/view/MenuItem;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lj/r;->a:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lj/r;->b:Ljava/lang/Object;

    iput-object p2, p0, Lj/r;->c:Landroid/view/MenuItem;

    return-void
.end method


# virtual methods
.method public final onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
    .locals 2

    .line 1
    iget v0, p0, Lj/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lj/r;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lu1/e;

    .line 12
    .line 13
    iget-object v0, p1, Lu1/e;->m:Landroidx/appcompat/widget/e;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/e;->setIconified(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object p1, p1, Lu1/e;->a:Lco/median/android/MainActivity;

    .line 22
    .line 23
    invoke-virtual {p1}, Le/j;->invalidateOptionsMenu()V

    .line 24
    .line 25
    .line 26
    return v1

    .line 27
    :pswitch_0
    iget-object v0, p0, Lj/r;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Landroid/view/MenuItem$OnActionExpandListener;

    .line 30
    .line 31
    iget-object v1, p0, Lj/r;->c:Landroid/view/MenuItem;

    .line 32
    .line 33
    check-cast v1, Lj/t;

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Le/a0;->h(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {v0, p1}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionCollapse(Landroid/view/MenuItem;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onMenuItemActionExpand(Landroid/view/MenuItem;)Z
    .locals 5

    .line 1
    iget v0, p0, Lj/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lj/r;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lu1/e;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p1, p1, Lu1/e;->l:Landroid/view/Menu;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    invoke-interface {p1}, Landroid/view/Menu;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    move v2, v1

    .line 27
    :goto_0
    if-ge v2, v0, :cond_2

    .line 28
    .line 29
    invoke-interface {p1, v2}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v4, p0, Lj/r;->c:Landroid/view/MenuItem;

    .line 37
    .line 38
    if-ne v3, v4, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-interface {v3, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 42
    .line 43
    .line 44
    invoke-interface {v3, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 45
    .line 46
    .line 47
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    :goto_2
    const/4 p1, 0x1

    .line 51
    return p1

    .line 52
    :pswitch_0
    iget-object v0, p0, Lj/r;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Landroid/view/MenuItem$OnActionExpandListener;

    .line 55
    .line 56
    iget-object v1, p0, Lj/r;->c:Landroid/view/MenuItem;

    .line 57
    .line 58
    check-cast v1, Lj/t;

    .line 59
    .line 60
    invoke-virtual {v1, p1}, Le/a0;->h(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-interface {v0, p1}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    return p1

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
