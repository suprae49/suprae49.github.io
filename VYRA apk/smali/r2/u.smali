.class public abstract Lr2/u;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public f:Landroid/graphics/drawable/Drawable;

.field public g:Landroid/graphics/Rect;

.field public h:Landroid/graphics/Rect;

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Z


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lr2/u;->h:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    iget-object v3, p0, Lr2/u;->g:Landroid/graphics/Rect;

    .line 15
    .line 16
    if-eqz v3, :cond_4

    .line 17
    .line 18
    iget-object v3, p0, Lr2/u;->f:Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    if-eqz v3, :cond_4

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    int-to-float v4, v4

    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    int-to-float v5, v5

    .line 36
    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 37
    .line 38
    .line 39
    iget-boolean v4, p0, Lr2/u;->i:Z

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    iget-object v4, p0, Lr2/u;->g:Landroid/graphics/Rect;

    .line 45
    .line 46
    iget v4, v4, Landroid/graphics/Rect;->top:I

    .line 47
    .line 48
    invoke-virtual {v0, v5, v5, v1, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 49
    .line 50
    .line 51
    iget-object v4, p0, Lr2/u;->f:Landroid/graphics/drawable/Drawable;

    .line 52
    .line 53
    invoke-virtual {v4, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 54
    .line 55
    .line 56
    iget-object v4, p0, Lr2/u;->f:Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    iget-boolean v4, p0, Lr2/u;->j:Z

    .line 62
    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    iget-object v4, p0, Lr2/u;->g:Landroid/graphics/Rect;

    .line 66
    .line 67
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 68
    .line 69
    sub-int v4, v2, v4

    .line 70
    .line 71
    invoke-virtual {v0, v5, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 72
    .line 73
    .line 74
    iget-object v4, p0, Lr2/u;->f:Landroid/graphics/drawable/Drawable;

    .line 75
    .line 76
    invoke-virtual {v4, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 77
    .line 78
    .line 79
    iget-object v4, p0, Lr2/u;->f:Landroid/graphics/drawable/Drawable;

    .line 80
    .line 81
    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 82
    .line 83
    .line 84
    :cond_1
    iget-boolean v4, p0, Lr2/u;->k:Z

    .line 85
    .line 86
    if-eqz v4, :cond_2

    .line 87
    .line 88
    iget-object v4, p0, Lr2/u;->g:Landroid/graphics/Rect;

    .line 89
    .line 90
    iget v6, v4, Landroid/graphics/Rect;->top:I

    .line 91
    .line 92
    iget v7, v4, Landroid/graphics/Rect;->left:I

    .line 93
    .line 94
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 95
    .line 96
    sub-int v4, v2, v4

    .line 97
    .line 98
    invoke-virtual {v0, v5, v6, v7, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 99
    .line 100
    .line 101
    iget-object v4, p0, Lr2/u;->f:Landroid/graphics/drawable/Drawable;

    .line 102
    .line 103
    invoke-virtual {v4, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 104
    .line 105
    .line 106
    iget-object v4, p0, Lr2/u;->f:Landroid/graphics/drawable/Drawable;

    .line 107
    .line 108
    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    iget-boolean v4, p0, Lr2/u;->l:Z

    .line 112
    .line 113
    if-eqz v4, :cond_3

    .line 114
    .line 115
    iget-object v4, p0, Lr2/u;->g:Landroid/graphics/Rect;

    .line 116
    .line 117
    iget v5, v4, Landroid/graphics/Rect;->right:I

    .line 118
    .line 119
    sub-int v5, v1, v5

    .line 120
    .line 121
    iget v6, v4, Landroid/graphics/Rect;->top:I

    .line 122
    .line 123
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 124
    .line 125
    sub-int/2addr v2, v4

    .line 126
    invoke-virtual {v0, v5, v6, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 127
    .line 128
    .line 129
    iget-object v1, p0, Lr2/u;->f:Landroid/graphics/drawable/Drawable;

    .line 130
    .line 131
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, Lr2/u;->f:Landroid/graphics/drawable/Drawable;

    .line 135
    .line 136
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 137
    .line 138
    .line 139
    :cond_3
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 140
    .line 141
    .line 142
    :cond_4
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr2/u;->f:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr2/u;->f:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setDrawBottomInsetForeground(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr2/u;->j:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDrawLeftInsetForeground(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr2/u;->k:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDrawRightInsetForeground(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr2/u;->l:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDrawTopInsetForeground(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr2/u;->i:Z

    .line 2
    .line 3
    return-void
.end method

.method public setScrimInsetForeground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr2/u;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-void
.end method
