.class public final synthetic Lu1/j0;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic f:Lu1/k0;


# direct methods
.method public synthetic constructor <init>(Lu1/k0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/j0;->f:Lu1/k0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 6

    .line 1
    iget-object v0, p0, Lu1/j0;->f:Lu1/k0;

    .line 2
    .line 3
    iget-object v1, v0, Lu1/k0;->a:Lco/median/android/MainActivity;

    .line 4
    .line 5
    new-instance v2, Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-object v3, v0, Lu1/k0;->b:Landroid/view/ViewGroup;

    .line 11
    .line 12
    invoke-virtual {v3, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 13
    .line 14
    .line 15
    iget v4, v0, Lu1/k0;->i:I

    .line 16
    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    invoke-virtual {v3}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    iget v5, v2, Landroid/graphics/Rect;->bottom:I

    .line 28
    .line 29
    sub-int/2addr v4, v5

    .line 30
    iput v4, v0, Lu1/k0;->i:I

    .line 31
    .line 32
    :cond_0
    invoke-virtual {v3}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    iput v4, v0, Lu1/k0;->f:I

    .line 41
    .line 42
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 43
    .line 44
    iget v4, v0, Lu1/k0;->i:I

    .line 45
    .line 46
    add-int/2addr v2, v4

    .line 47
    iput v2, v0, Lu1/k0;->g:I

    .line 48
    .line 49
    invoke-virtual {v3}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    iget v3, v0, Lu1/k0;->g:I

    .line 58
    .line 59
    sub-int/2addr v2, v3

    .line 60
    iput v2, v0, Lu1/k0;->e:I

    .line 61
    .line 62
    iget v3, v0, Lu1/k0;->i:I

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    if-ne v2, v3, :cond_1

    .line 66
    .line 67
    iput v4, v0, Lu1/k0;->e:I

    .line 68
    .line 69
    :cond_1
    iget v2, v0, Lu1/k0;->e:I

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    if-eqz v2, :cond_3

    .line 73
    .line 74
    iget v2, v0, Lu1/k0;->f:I

    .line 75
    .line 76
    iput v2, v0, Lu1/k0;->d:I

    .line 77
    .line 78
    iget-boolean v2, v0, Lu1/k0;->h:Z

    .line 79
    .line 80
    if-nez v2, :cond_5

    .line 81
    .line 82
    const/4 v2, 0x1

    .line 83
    iput-boolean v2, v0, Lu1/k0;->h:Z

    .line 84
    .line 85
    iget-object v2, v0, Lu1/k0;->c:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_2

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    iget-object v2, v0, Lu1/k0;->c:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v0}, Lu1/k0;->a()Lorg/json/JSONObject;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v2, v0}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v1, v0, v3}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_3
    iput v4, v0, Lu1/k0;->d:I

    .line 109
    .line 110
    iget-boolean v2, v0, Lu1/k0;->h:Z

    .line 111
    .line 112
    if-eqz v2, :cond_5

    .line 113
    .line 114
    iput-boolean v4, v0, Lu1/k0;->h:Z

    .line 115
    .line 116
    iget-object v2, v0, Lu1/k0;->c:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_4

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    iget-object v2, v0, Lu1/k0;->c:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v0}, Lu1/k0;->a()Lorg/json/JSONObject;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v2, v0}, Lt2/i;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v1, v0, v3}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 136
    .line 137
    .line 138
    :cond_5
    :goto_0
    return-void
.end method
