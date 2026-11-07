.class public final Lu1/i0;
.super Landroid/widget/BaseExpandableListAdapter;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/widget/ExpandableListView$OnGroupClickListener;
.implements Landroid/widget/ExpandableListView$OnChildClickListener;


# instance fields
.field public final a:Lco/median/android/MainActivity;

.field public final b:Landroid/widget/ExpandableListView;

.field public final c:I

.field public final d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Lorg/json/JSONArray;

.field public i:Z

.field public j:Z

.field public k:I


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;Landroid/widget/ExpandableListView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseExpandableListAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lu1/i0;->i:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lu1/i0;->j:Z

    .line 8
    .line 9
    iput-object p1, p0, Lu1/i0;->a:Lco/median/android/MainActivity;

    .line 10
    .line 11
    new-instance v0, Lorg/json/JSONArray;

    .line 12
    .line 13
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lu1/i0;->h:Lorg/json/JSONArray;

    .line 17
    .line 18
    invoke-virtual {p1}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const v1, 0x7f0a004f

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, Lu1/i0;->c:I

    .line 30
    .line 31
    invoke-virtual {p1}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const v1, 0x7f0a004e

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iput v0, p0, Lu1/i0;->d:I

    .line 43
    .line 44
    iput-object p2, p0, Lu1/i0;->b:Landroid/widget/ExpandableListView;

    .line 45
    .line 46
    const v0, 0x7f0603d1

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v0}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iput v0, p0, Lu1/i0;->f:I

    .line 54
    .line 55
    const v0, 0x7f0603d0

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v0}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iput v0, p0, Lu1/i0;->g:I

    .line 63
    .line 64
    const v0, 0x7f0603d2

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v0}, Lc0/c;->getColor(Landroid/content/Context;I)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iput p1, p0, Lu1/i0;->e:I

    .line 72
    .line 73
    invoke-virtual {p2, p0}, Landroid/widget/ExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2, p0}, Landroid/widget/ExpandableListView;->setOnGroupClickListener(Landroid/widget/ExpandableListView$OnGroupClickListener;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, p0}, Landroid/widget/ExpandableListView;->setOnChildClickListener(Landroid/widget/ExpandableListView$OnChildClickListener;)V

    .line 80
    .line 81
    .line 82
    const/4 p1, 0x5

    .line 83
    invoke-virtual {p2, p1}, Landroid/widget/ListView;->setDividerHeight(I)V

    .line 84
    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/drawable/RippleDrawable;
    .locals 9

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x42c80000    # 100.0f

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 9
    .line 10
    .line 11
    iget v2, p0, Lu1/i0;->e:I

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 14
    .line 15
    .line 16
    const/16 v2, 0x64

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setAlpha(I)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Landroid/graphics/drawable/StateListDrawable;

    .line 22
    .line 23
    invoke-direct {v2}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 24
    .line 25
    .line 26
    const v3, 0x10102fe

    .line 27
    .line 28
    .line 29
    filled-new-array {v3}, [I

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v2, v3, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 34
    .line 35
    .line 36
    const v3, 0x10100a1

    .line 37
    .line 38
    .line 39
    filled-new-array {v3}, [I

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v2, v3, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lu1/i0;->a:Lco/median/android/MainActivity;

    .line 47
    .line 48
    invoke-virtual {v0}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 57
    .line 58
    and-int/lit8 v0, v0, 0x30

    .line 59
    .line 60
    const/16 v3, 0x10

    .line 61
    .line 62
    if-eq v0, v3, :cond_1

    .line 63
    .line 64
    const/16 v3, 0x20

    .line 65
    .line 66
    if-eq v0, v3, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    const v0, 0x3e4ccccd    # 0.2f

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    :goto_0
    const v0, -0x41b33333    # -0.2f

    .line 74
    .line 75
    .line 76
    :goto_1
    iget v3, p0, Lu1/i0;->g:I

    .line 77
    .line 78
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    iget v4, p0, Lu1/i0;->g:I

    .line 83
    .line 84
    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    iget v5, p0, Lu1/i0;->g:I

    .line 89
    .line 90
    invoke-static {v5}, Landroid/graphics/Color;->green(I)I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    iget v6, p0, Lu1/i0;->g:I

    .line 95
    .line 96
    invoke-static {v6}, Landroid/graphics/Color;->blue(I)I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    const/4 v7, 0x0

    .line 101
    cmpl-float v7, v0, v7

    .line 102
    .line 103
    if-lez v7, :cond_2

    .line 104
    .line 105
    int-to-float v7, v4

    .line 106
    const/16 v8, 0xff

    .line 107
    .line 108
    rsub-int v4, v4, 0xff

    .line 109
    .line 110
    int-to-float v4, v4

    .line 111
    mul-float/2addr v4, v0

    .line 112
    add-float/2addr v4, v7

    .line 113
    float-to-int v4, v4

    .line 114
    invoke-static {v4, v8}, Ljava/lang/Math;->min(II)I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    int-to-float v7, v5

    .line 119
    rsub-int v5, v5, 0xff

    .line 120
    .line 121
    int-to-float v5, v5

    .line 122
    mul-float/2addr v5, v0

    .line 123
    add-float/2addr v5, v7

    .line 124
    float-to-int v5, v5

    .line 125
    invoke-static {v5, v8}, Ljava/lang/Math;->min(II)I

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    int-to-float v7, v6

    .line 130
    rsub-int v6, v6, 0xff

    .line 131
    .line 132
    int-to-float v6, v6

    .line 133
    mul-float/2addr v6, v0

    .line 134
    add-float/2addr v6, v7

    .line 135
    float-to-int v0, v6

    .line 136
    invoke-static {v0, v8}, Ljava/lang/Math;->min(II)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    goto :goto_2

    .line 141
    :cond_2
    int-to-float v4, v4

    .line 142
    const/high16 v7, 0x3f800000    # 1.0f

    .line 143
    .line 144
    add-float/2addr v0, v7

    .line 145
    mul-float/2addr v4, v0

    .line 146
    float-to-int v4, v4

    .line 147
    const/4 v7, 0x0

    .line 148
    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    int-to-float v5, v5

    .line 153
    mul-float/2addr v5, v0

    .line 154
    float-to-int v5, v5

    .line 155
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    int-to-float v6, v6

    .line 160
    mul-float/2addr v6, v0

    .line 161
    float-to-int v0, v6

    .line 162
    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    :goto_2
    invoke-static {v3, v4, v5, v0}, Landroid/graphics/Color;->argb(IIII)I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    .line 175
    .line 176
    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 183
    .line 184
    .line 185
    new-instance v1, Landroid/graphics/drawable/RippleDrawable;

    .line 186
    .line 187
    invoke-direct {v1, v0, v2, v3}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 188
    .line 189
    .line 190
    return-object v1
.end method

.method public final b(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lu1/i0;->h:Lorg/json/JSONArray;

    .line 3
    .line 4
    invoke-virtual {v1, p1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lorg/json/JSONObject;

    .line 9
    .line 10
    const-string v1, "isGrouping"

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return p1

    .line 17
    :catch_0
    move-exception p1

    .line 18
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "u1.i0"

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v1, v2, v3, p1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    return v0
.end method

.method public final c(ILjava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lu1/i0;->h:Lorg/json/JSONArray;

    .line 3
    .line 4
    invoke-virtual {v1, p1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    return-object p1

    .line 25
    :catch_0
    move-exception p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-object v0

    .line 28
    :goto_0
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    const-string v1, "u1.i0"

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {p2, v1, v2, p1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method public final d(Ljava/lang/String;II)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lu1/i0;->h:Lorg/json/JSONArray;

    .line 3
    .line 4
    invoke-virtual {v1, p2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    check-cast p2, Lorg/json/JSONObject;

    .line 9
    .line 10
    const-string v1, "subLinks"

    .line 11
    .line 12
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2, p3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    if-nez p3, :cond_0

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    return-object p1

    .line 35
    :catch_0
    move-exception p1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-object v0

    .line 38
    :goto_0
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    const-string p3, "u1.i0"

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {p2, p3, v1, p1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 49
    .line 50
    .line 51
    return-object v0
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Landroidx/emoji2/text/p;->l()Landroidx/emoji2/text/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Landroidx/emoji2/text/p;->l()Landroidx/emoji2/text/p;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    const-string v1, "GONATIVE_USERID"

    .line 20
    .line 21
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    iget-object v1, p0, Lu1/i0;->a:Lco/median/android/MainActivity;

    .line 27
    .line 28
    if-nez p2, :cond_1

    .line 29
    .line 30
    iget-object p2, v1, Lco/median/android/MainActivity;->C0:Lu1/x1;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-virtual {p2, p1, v2, v0}, Lu1/x1;->b(Ljava/lang/String;ZZ)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-object v2, v1, Lco/median/android/MainActivity;->C0:Lu1/x1;

    .line 38
    .line 39
    invoke-virtual {v2, p1, p2, v0}, Lu1/x1;->c(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object p1, v1, Lco/median/android/MainActivity;->S:Lu1/q1;

    .line 43
    .line 44
    iget-object p1, p1, Lu1/q1;->b:Lco/median/android/widget/GoNativeDrawerLayout;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ly0/f;->d(Z)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final getChild(II)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public final getChildId(II)J
    .locals 0

    .line 1
    const-wide/16 p1, 0x0

    .line 2
    .line 3
    return-wide p1
.end method

.method public final getChildType(II)I
    .locals 0

    .line 1
    iget-boolean p1, p0, Lu1/i0;->i:Z

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, Lu1/i0;->j:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 13
    return p1
.end method

.method public final getChildTypeCount()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method

.method public final getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .line 1
    iget-object p3, p0, Lu1/i0;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p4, :cond_2

    .line 5
    .line 6
    invoke-virtual {p3}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 7
    .line 8
    .line 9
    move-result-object p4

    .line 10
    iget-boolean v1, p0, Lu1/i0;->i:Z

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-boolean v1, p0, Lu1/i0;->j:Z

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const v1, 0x7f0c0050

    .line 20
    .line 21
    .line 22
    invoke-virtual {p4, v1, p5, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    const v1, 0x7f0c004f

    .line 28
    .line 29
    .line 30
    invoke-virtual {p4, v1, p5, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p4

    .line 34
    :cond_2
    :goto_1
    const p5, 0x7f090137

    .line 35
    .line 36
    .line 37
    invoke-virtual {p4, p5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object p5

    .line 41
    check-cast p5, Landroid/widget/RelativeLayout;

    .line 42
    .line 43
    invoke-virtual {p0}, Lu1/i0;->a()Landroid/graphics/drawable/RippleDrawable;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {p5, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 48
    .line 49
    .line 50
    iget-object p5, p0, Lu1/i0;->b:Landroid/widget/ExpandableListView;

    .line 51
    .line 52
    invoke-static {p1, p2}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 53
    .line 54
    .line 55
    move-result-wide v1

    .line 56
    invoke-virtual {p5, v1, v2}, Landroid/widget/ExpandableListView;->getFlatListPosition(J)I

    .line 57
    .line 58
    .line 59
    move-result p5

    .line 60
    iget v1, p0, Lu1/i0;->k:I

    .line 61
    .line 62
    if-ne v1, p5, :cond_3

    .line 63
    .line 64
    const/4 p5, 0x1

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move p5, v0

    .line 67
    :goto_2
    if-eqz p5, :cond_4

    .line 68
    .line 69
    iget v1, p0, Lu1/i0;->e:I

    .line 70
    .line 71
    const-string v2, "activeIcon"

    .line 72
    .line 73
    invoke-virtual {p0, v2, p1, p2}, Lu1/i0;->d(Ljava/lang/String;II)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    goto :goto_3

    .line 78
    :cond_4
    iget v1, p0, Lu1/i0;->f:I

    .line 79
    .line 80
    const-string v2, "inactiveIcon"

    .line 81
    .line 82
    invoke-virtual {p0, v2, p1, p2}, Lu1/i0;->d(Ljava/lang/String;II)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    :goto_3
    if-eqz v2, :cond_5

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eqz v3, :cond_6

    .line 93
    .line 94
    :cond_5
    const-string v2, "icon"

    .line 95
    .line 96
    invoke-virtual {p0, v2, p1, p2}, Lu1/i0;->d(Ljava/lang/String;II)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :cond_6
    const v3, 0x7f090139

    .line 101
    .line 102
    .line 103
    invoke-virtual {p4, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    check-cast v3, Landroid/widget/TextView;

    .line 108
    .line 109
    const-string v4, "label"

    .line 110
    .line 111
    invoke-virtual {p0, v4, p1, p2}, Lu1/i0;->d(Ljava/lang/String;II)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 119
    .line 120
    .line 121
    const-string p1, "sans-serif-medium"

    .line 122
    .line 123
    invoke-static {p1, p5}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 128
    .line 129
    .line 130
    const p1, 0x7f090138

    .line 131
    .line 132
    .line 133
    invoke-virtual {p4, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, Landroid/widget/ImageView;

    .line 138
    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    if-eqz v2, :cond_7

    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    if-nez p2, :cond_7

    .line 148
    .line 149
    new-instance p2, Lv1/b;

    .line 150
    .line 151
    iget p5, p0, Lu1/i0;->c:I

    .line 152
    .line 153
    invoke-direct {p2, p3, p5, v1, v2}, Lv1/b;-><init>(Landroid/content/Context;IILjava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2}, Lv1/b;->d()Landroid/graphics/drawable/Drawable;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 164
    .line 165
    .line 166
    return-object p4

    .line 167
    :cond_7
    const/4 p2, 0x4

    .line 168
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 169
    .line 170
    .line 171
    :cond_8
    return-object p4
.end method

.method public final getChildrenCount(I)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lu1/i0;->h:Lorg/json/JSONArray;

    .line 3
    .line 4
    invoke-virtual {v1, p1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lorg/json/JSONObject;

    .line 9
    .line 10
    const-string v1, "isGrouping"

    .line 11
    .line 12
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const-string v1, "subLinks"

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 25
    .line 26
    .line 27
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    return p1

    .line 29
    :catch_0
    move-exception p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return v0

    .line 32
    :goto_0
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "u1.i0"

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v1, v2, v3, p1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 43
    .line 44
    .line 45
    return v0
.end method

.method public final getGroup(I)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public final getGroupCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/i0;->h:Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getGroupId(I)J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getGroupType(I)I
    .locals 0

    .line 1
    iget-boolean p1, p0, Lu1/i0;->i:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 p1, 0x1

    .line 8
    return p1
.end method

.method public final getGroupTypeCount()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method

.method public final getGroupView(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .line 1
    iget-object p4, p0, Lu1/i0;->a:Lco/median/android/MainActivity;

    .line 2
    .line 3
    if-nez p3, :cond_1

    .line 4
    .line 5
    invoke-virtual {p4}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    iget-boolean v0, p0, Lu1/i0;->i:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const v0, 0x7f0c0051

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const v0, 0x7f0c0052

    .line 18
    .line 19
    .line 20
    :goto_0
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p3, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    :cond_1
    const v0, 0x7f090137

    .line 26
    .line 27
    .line 28
    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 33
    .line 34
    invoke-virtual {p0}, Lu1/i0;->a()Landroid/graphics/drawable/RippleDrawable;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 39
    .line 40
    .line 41
    iget v0, p0, Lu1/i0;->k:I

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    if-ne v0, p1, :cond_2

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move v0, v1

    .line 49
    :goto_1
    if-eqz v0, :cond_3

    .line 50
    .line 51
    iget v2, p0, Lu1/i0;->e:I

    .line 52
    .line 53
    const-string v3, "activeIcon"

    .line 54
    .line 55
    invoke-virtual {p0, p1, v3}, Lu1/i0;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    iget v2, p0, Lu1/i0;->f:I

    .line 61
    .line 62
    const-string v3, "inactiveIcon"

    .line 63
    .line 64
    invoke-virtual {p0, p1, v3}, Lu1/i0;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    :goto_2
    if-eqz v3, :cond_4

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_5

    .line 75
    .line 76
    :cond_4
    const-string v3, "icon"

    .line 77
    .line 78
    invoke-virtual {p0, p1, v3}, Lu1/i0;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    :cond_5
    const v4, 0x7f090136

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    check-cast v4, Landroid/widget/ImageView;

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Lu1/i0;->b(I)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_7

    .line 96
    .line 97
    if-eqz p2, :cond_6

    .line 98
    .line 99
    const-string p2, "fas fa-angle-up"

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_6
    const-string p2, "fas fa-angle-down"

    .line 103
    .line 104
    :goto_3
    new-instance v5, Lv1/b;

    .line 105
    .line 106
    iget v6, p0, Lu1/i0;->d:I

    .line 107
    .line 108
    invoke-direct {v5, p4, v6, v2, p2}, Lv1/b;-><init>(Landroid/content/Context;IILjava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5}, Lv1/b;->d()Landroid/graphics/drawable/Drawable;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-virtual {v4, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 119
    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_7
    const/16 p2, 0x8

    .line 123
    .line 124
    invoke-virtual {v4, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 125
    .line 126
    .line 127
    :goto_4
    const p2, 0x7f090139

    .line 128
    .line 129
    .line 130
    invoke-virtual {p3, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    check-cast p2, Landroid/widget/TextView;

    .line 135
    .line 136
    const-string v4, "label"

    .line 137
    .line 138
    invoke-virtual {p0, p1, v4}, Lu1/i0;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 146
    .line 147
    .line 148
    const-string p1, "sans-serif-medium"

    .line 149
    .line 150
    invoke-static {p1, v0}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 155
    .line 156
    .line 157
    const p1, 0x7f090138

    .line 158
    .line 159
    .line 160
    invoke-virtual {p3, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    check-cast p1, Landroid/widget/ImageView;

    .line 165
    .line 166
    if-eqz p1, :cond_9

    .line 167
    .line 168
    if-eqz v3, :cond_8

    .line 169
    .line 170
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    if-nez p2, :cond_8

    .line 175
    .line 176
    new-instance p2, Lv1/b;

    .line 177
    .line 178
    iget v0, p0, Lu1/i0;->c:I

    .line 179
    .line 180
    invoke-direct {p2, p4, v0, v2, v3}, Lv1/b;-><init>(Landroid/content/Context;IILjava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p2}, Lv1/b;->d()Landroid/graphics/drawable/Drawable;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 191
    .line 192
    .line 193
    return-object p3

    .line 194
    :cond_8
    const/4 p2, 0x4

    .line 195
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 196
    .line 197
    .line 198
    :cond_9
    return-object p3
.end method

.method public final hasStableIds()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final isChildSelectable(II)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public final onChildClick(Landroid/widget/ExpandableListView;Landroid/view/View;IIJ)Z
    .locals 0

    .line 1
    invoke-static {p3, p4}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 2
    .line 3
    .line 4
    move-result-wide p5

    .line 5
    invoke-virtual {p1, p5, p6}, Landroid/widget/ExpandableListView;->getFlatListPosition(J)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/4 p5, 0x1

    .line 10
    invoke-virtual {p1, p2, p5}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 11
    .line 12
    .line 13
    iput p2, p0, Lu1/i0;->k:I

    .line 14
    .line 15
    const-string p1, "url"

    .line 16
    .line 17
    invoke-virtual {p0, p1, p3, p4}, Lu1/i0;->d(Ljava/lang/String;II)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string p2, "javascript"

    .line 22
    .line 23
    invoke-virtual {p0, p2, p3, p4}, Lu1/i0;->d(Ljava/lang/String;II)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    new-instance p3, Landroid/util/Pair;

    .line 28
    .line 29
    invoke-direct {p3, p1, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Ljava/lang/String;

    .line 35
    .line 36
    iget-object p2, p3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p2, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p0, p1, p2}, Lu1/i0;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return p5
.end method

.method public final onGroupClick(Landroid/widget/ExpandableListView;Landroid/view/View;IJ)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, p3}, Lu1/i0;->b(I)Z

    .line 3
    .line 4
    .line 5
    move-result p2

    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    return p1

    .line 9
    :cond_0
    const-string p2, "url"

    .line 10
    .line 11
    invoke-virtual {p0, p3, p2}, Lu1/i0;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const-string p4, "javascript"

    .line 16
    .line 17
    invoke-virtual {p0, p3, p4}, Lu1/i0;->c(ILjava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    new-instance p4, Landroid/util/Pair;

    .line 22
    .line 23
    invoke-direct {p4, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p2, Ljava/lang/String;

    .line 29
    .line 30
    iget-object p3, p4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p3, Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p0, p2, p3}, Lu1/i0;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    return p1

    .line 39
    :catch_0
    move-exception p2

    .line 40
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    const-string p4, "u1.i0"

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p5

    .line 50
    invoke-virtual {p3, p4, p5, p2}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 51
    .line 52
    .line 53
    return p1
.end method
