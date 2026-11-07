.class public final synthetic Lx1/k;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:Landroid/widget/PopupWindow;

.field public final synthetic g:Landroid/view/ViewGroup;

.field public final synthetic h:Lr3/j;

.field public final synthetic i:Lz1/g;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/PopupWindow;Landroid/view/ViewGroup;Lr3/j;Lz1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx1/k;->f:Landroid/widget/PopupWindow;

    .line 5
    .line 6
    iput-object p2, p0, Lx1/k;->g:Landroid/view/ViewGroup;

    .line 7
    .line 8
    iput-object p3, p0, Lx1/k;->h:Lr3/j;

    .line 9
    .line 10
    iput-object p4, p0, Lx1/k;->i:Lz1/g;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lx1/k;->h:Lr3/j;

    .line 2
    .line 3
    iget v0, v0, Lr3/j;->f:I

    .line 4
    .line 5
    const/16 v1, 0x51

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    iget-object v3, p0, Lx1/k;->f:Landroid/widget/PopupWindow;

    .line 9
    .line 10
    iget-object v4, p0, Lx1/k;->g:Landroid/view/ViewGroup;

    .line 11
    .line 12
    invoke-virtual {v3, v4, v1, v2, v0}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iget-object v1, p0, Lx1/k;->i:Lz1/g;

    .line 17
    .line 18
    iput-boolean v0, v1, Lz1/g;->g:Z

    .line 19
    .line 20
    return-void
.end method
