.class public final synthetic Lcom/google/android/material/datepicker/u;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/datepicker/x;Lcom/google/android/material/datepicker/MaterialCalendarGridView;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/google/android/material/datepicker/u;->f:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 5
    .line 6
    iput p3, p0, Lcom/google/android/material/datepicker/u;->g:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/u;->f:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    iget v1, p0, Lcom/google/android/material/datepicker/u;->g:I

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b()Lcom/google/android/material/datepicker/t;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x1

    .line 18
    const/4 v4, -0x1

    .line 19
    if-ne v1, v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/google/android/material/datepicker/t;->f()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/2addr v1, v3

    .line 26
    invoke-virtual {v2, v1}, Lcom/google/android/material/datepicker/t;->b(I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-ne v1, v4, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2}, Lcom/google/android/material/datepicker/t;->f()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v2}, Lcom/google/android/material/datepicker/t;->c()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    sub-int/2addr v1, v3

    .line 42
    invoke-virtual {v2, v1}, Lcom/google/android/material/datepicker/t;->a(I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-ne v1, v4, :cond_1

    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/google/android/material/datepicker/t;->c()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :cond_1
    :goto_0
    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setSelection(I)V

    .line 53
    .line 54
    .line 55
    :cond_2
    return-void
.end method
