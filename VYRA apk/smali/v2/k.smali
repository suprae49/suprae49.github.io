.class public final Lv2/k;
.super Lv2/e;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# virtual methods
.method public getIndeterminateAnimationType()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v0, v0, Lv2/l;->q:I

    .line 4
    .line 5
    return v0
.end method

.method public getIndicatorDirection()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v0, v0, Lv2/l;->t:I

    .line 4
    .line 5
    return v0
.end method

.method public getIndicatorInset()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v0, v0, Lv2/l;->s:I

    .line 4
    .line 5
    return v0
.end method

.method public getIndicatorSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v0, v0, Lv2/l;->r:I

    .line 4
    .line 5
    return v0
.end method

.method public setIndeterminateAnimationType(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v1, v0, Lv2/l;->q:I

    .line 4
    .line 5
    if-ne v1, p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Lv2/e;->b()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string p1, "Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode."

    .line 22
    .line 23
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_2
    :goto_0
    iput p1, v0, Lv2/l;->q:I

    .line 28
    .line 29
    invoke-virtual {v0}, Lv2/l;->b()V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    if-ne p1, v1, :cond_3

    .line 34
    .line 35
    new-instance p1, Lv2/j;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {p1, v1, v0}, Lv2/j;-><init>(Landroid/content/Context;Lv2/l;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    new-instance p1, Lv2/h;

    .line 46
    .line 47
    invoke-direct {p1, v0}, Lv2/h;-><init>(Lv2/l;)V

    .line 48
    .line 49
    .line 50
    :goto_1
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object p1, v0, Lv2/s;->t:Le/a0;

    .line 55
    .line 56
    iput-object v0, p1, Le/a0;->a:Ljava/lang/Object;

    .line 57
    .line 58
    invoke-virtual {p0}, Lv2/e;->getProgressDrawable()Lv2/m;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0}, Lv2/e;->getIndeterminateDrawable()Lv2/s;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object p1, p1, Lv2/s;->t:Le/a0;

    .line 75
    .line 76
    iget-object v0, p0, Lv2/e;->r:Lv2/d;

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Le/a0;->k(Lv2/d;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    invoke-virtual {p0}, Lv2/e;->invalidate()V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public setIndicatorDirection(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iput p1, v0, Lv2/l;->t:I

    .line 4
    .line 5
    invoke-virtual {p0}, Lv2/e;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setIndicatorInset(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 2
    .line 3
    iget v1, v0, Lv2/l;->s:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    iput p1, v0, Lv2/l;->s:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lv2/e;->invalidate()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setIndicatorSize(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv2/e;->getTrackThickness()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Lv2/e;->f:Lv2/l;

    .line 12
    .line 13
    iget v1, v0, Lv2/l;->r:I

    .line 14
    .line 15
    if-eq v1, p1, :cond_0

    .line 16
    .line 17
    iput p1, v0, Lv2/l;->r:I

    .line 18
    .line 19
    invoke-virtual {v0}, Lv2/l;->b()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lv2/e;->invalidate()V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public setTrackThickness(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lv2/e;->setTrackThickness(I)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lv2/e;->f:Lv2/l;

    .line 5
    .line 6
    invoke-virtual {p1}, Lv2/l;->b()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
