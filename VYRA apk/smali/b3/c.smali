.class public final synthetic Lb3/c;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lb3/c;->f:I

    .line 2
    .line 3
    iput-object p3, p0, Lb3/c;->h:Ljava/lang/Object;

    .line 4
    .line 5
    iput p1, p0, Lb3/c;->g:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lb3/c;->f:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, Lb3/c;->g:I

    .line 5
    .line 6
    iget-object v3, p0, Lb3/c;->h:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v3, Lu1/w1;

    .line 12
    .line 13
    iget-object v0, v3, Lu1/w1;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 14
    .line 15
    if-ltz v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/android/material/navigation/d;->getMenu()Landroid/view/Menu;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-interface {v4}, Landroid/view/Menu;->size()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-lt v2, v4, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iput-boolean v1, v3, Lu1/w1;->q:Z

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Lcom/google/android/material/navigation/d;->setSelectedItemId(I)V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    return-void

    .line 34
    :pswitch_0
    check-cast v3, Lcom/google/android/material/button/MaterialButton;

    .line 35
    .line 36
    sget-object v0, Lcom/google/android/material/button/MaterialButton;->S:[I

    .line 37
    .line 38
    invoke-virtual {v3, v2}, Lcom/google/android/material/button/MaterialButton;->setIconSize(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_1
    check-cast v3, Le0/b;

    .line 43
    .line 44
    invoke-virtual {v3, v2}, Le0/b;->h(I)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_2
    check-cast v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 49
    .line 50
    iget-object v0, v3, Lcom/google/android/material/sidesheet/SideSheetBehavior;->u:Ljava/lang/ref/WeakReference;

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Landroid/view/View;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const/4 v0, 0x0

    .line 62
    :goto_1
    if-eqz v0, :cond_3

    .line 63
    .line 64
    invoke-virtual {v3, v0, v2, v1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->z(Landroid/view/View;IZ)V

    .line 65
    .line 66
    .line 67
    :cond_3
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
