.class public final synthetic Lu1/s1;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:Lu1/w1;

.field public final synthetic g:Z


# direct methods
.method public synthetic constructor <init>(Lu1/w1;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/s1;->f:Lu1/w1;

    .line 5
    .line 6
    iput-boolean p2, p0, Lu1/s1;->g:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lu1/s1;->f:Lu1/w1;

    .line 2
    .line 3
    iget-object v1, v0, Lu1/w1;->b:Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 4
    .line 5
    iget-boolean v2, p0, Lu1/s1;->g:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const/16 v2, 0x8

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, Lu1/w1;->f:Landroid/widget/RelativeLayout$LayoutParams;

    .line 20
    .line 21
    iput v3, v1, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 22
    .line 23
    iget-object v2, v0, Lu1/w1;->c:Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    .line 27
    .line 28
    iput v3, v0, Lu1/w1;->n:I

    .line 29
    .line 30
    return-void
.end method
