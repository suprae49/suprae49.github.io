.class public final Lcom/google/android/material/datepicker/d;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lcom/google/android/material/datepicker/x;

.field public final synthetic h:Lcom/google/android/material/datepicker/l;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/datepicker/l;Lcom/google/android/material/datepicker/x;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/google/android/material/datepicker/d;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/material/datepicker/d;->h:Lcom/google/android/material/datepicker/l;

    .line 4
    .line 5
    iput-object p2, p0, Lcom/google/android/material/datepicker/d;->g:Lcom/google/android/material/datepicker/x;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, Lcom/google/android/material/datepicker/d;->f:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/material/datepicker/d;->h:Lcom/google/android/material/datepicker/l;

    .line 7
    .line 8
    iget-object v0, p1, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lk1/l0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->L0()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v1, p0, Lcom/google/android/material/datepicker/d;->g:Lcom/google/android/material/datepicker/x;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    iput v2, v1, Lcom/google/android/material/datepicker/x;->i:I

    .line 24
    .line 25
    sub-int/2addr v0, v2

    .line 26
    invoke-virtual {v1, v0}, Lcom/google/android/material/datepicker/x;->g(I)Lcom/google/android/material/datepicker/Month;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/l;->i(Lcom/google/android/material/datepicker/Month;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/d;->h:Lcom/google/android/material/datepicker/l;

    .line 35
    .line 36
    iget-object v0, p1, Lcom/google/android/material/datepicker/l;->m:Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lk1/l0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-virtual {v0}, Lk1/l0;->v()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {v0, v1, v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->N0(IZI)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-nez v0, :cond_0

    .line 54
    .line 55
    const/4 v0, -0x1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-static {v0}, Lk1/l0;->H(Landroid/view/View;)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    :goto_0
    const/4 v1, 0x2

    .line 62
    iget-object v2, p0, Lcom/google/android/material/datepicker/d;->g:Lcom/google/android/material/datepicker/x;

    .line 63
    .line 64
    iput v1, v2, Lcom/google/android/material/datepicker/x;->i:I

    .line 65
    .line 66
    add-int/lit8 v0, v0, 0x1

    .line 67
    .line 68
    invoke-virtual {v2, v0}, Lcom/google/android/material/datepicker/x;->g(I)Lcom/google/android/material/datepicker/Month;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/l;->i(Lcom/google/android/material/datepicker/Month;)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
