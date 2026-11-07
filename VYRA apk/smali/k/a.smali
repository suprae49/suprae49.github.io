.class public final Lk/a;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lp0/s0;


# instance fields
.field public a:I

.field public b:Z

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lk/a;->a:I

    .line 6
    .line 7
    iput-boolean v0, p0, Lk/a;->b:Z

    .line 8
    .line 9
    invoke-virtual {p1}, Le/j;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget v0, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 18
    .line 19
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 20
    .line 21
    int-to-float v0, v0

    .line 22
    div-float/2addr v0, p1

    .line 23
    float-to-int p1, v0

    .line 24
    iput p1, p0, Lk/a;->a:I

    .line 25
    .line 26
    return-void
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const-string v0, "; *"

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    array-length v0, p0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, v0, :cond_2

    .line 17
    .line 18
    aget-object v2, p0, v1

    .line 19
    .line 20
    const-string v3, "charset="

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    const/16 p0, 0x8

    .line 29
    .line 30
    invoke-virtual {v2, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public static f(Ljava/lang/String;FD)Ljava/lang/String;
    .locals 7

    .line 1
    if-eqz p0, :cond_7

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    cmpg-float v1, p1, v0

    .line 5
    .line 6
    if-gtz v1, :cond_0

    .line 7
    .line 8
    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    :cond_0
    const-string v1, "<meta[^>]*name=[\"\']viewport[\"\'][^>]*>"

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    invoke-static {v1, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_1

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    cmpl-float v0, p1, v0

    .line 39
    .line 40
    const-string v2, "\""

    .line 41
    .line 42
    const-string v3, "content=\"$1, "

    .line 43
    .line 44
    const-string v4, "content\\s*=\\s*\"([^\"]*)\""

    .line 45
    .line 46
    if-lez v0, :cond_3

    .line 47
    .line 48
    const-string v0, "initial-scale"

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const-string v5, "initial-scale="

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-string v0, "initial-scale\\s*=\\s*[^,\"]+"

    .line 71
    .line 72
    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    goto :goto_0

    .line 77
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p0, v4, p1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    :cond_3
    :goto_0
    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-nez p1, :cond_6

    .line 113
    .line 114
    double-to-int p1, p2

    .line 115
    int-to-double v5, p1

    .line 116
    cmpl-double v0, p2, v5

    .line 117
    .line 118
    if-nez v0, :cond_4

    .line 119
    .line 120
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    goto :goto_1

    .line 125
    :cond_4
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    :goto_1
    const-string p2, "width"

    .line 130
    .line 131
    invoke-virtual {p0, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    const-string p3, "width="

    .line 136
    .line 137
    if-eqz p2, :cond_5

    .line 138
    .line 139
    new-instance p2, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    const-string p2, "width\\s*=\\s*[^,\"]+"

    .line 152
    .line 153
    invoke-virtual {p0, p2, p1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    goto :goto_2

    .line 158
    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    new-instance p2, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p0, v4, p1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    :cond_6
    :goto_2
    invoke-virtual {v1, p0}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    :cond_7
    :goto_3
    return-object p0
.end method

.method public static g(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "/"

    .line 2
    .line 3
    if-eqz p0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x1

    .line 23
    if-le v0, v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sub-int/2addr v0, v1

    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :cond_1
    return-object p0

    .line 36
    :cond_2
    :goto_0
    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lk/a;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lk/a;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, v0, Landroidx/appcompat/widget/ActionBarContextView;->k:Lp0/r0;

    .line 12
    .line 13
    iget v1, p0, Lk/a;->a:I

    .line 14
    .line 15
    invoke-static {v0, v1}, Landroidx/appcompat/widget/ActionBarContextView;->b(Landroidx/appcompat/widget/ActionBarContextView;I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lk/a;->b:Z

    .line 3
    .line 4
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    .line 4
    .line 5
    invoke-static {v0}, Landroidx/appcompat/widget/ActionBarContextView;->a(Landroidx/appcompat/widget/ActionBarContextView;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lk/a;->b:Z

    .line 10
    .line 11
    return-void
.end method

.method public e(Landroid/app/Activity;Lx1/i;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    const-string v4, "text/html"

    .line 10
    .line 11
    invoke-static/range {p1 .. p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    iget-object v6, v5, Lx1/a;->E0:Ljava/util/ArrayList;

    .line 16
    .line 17
    iget-object v7, v5, Lx1/a;->k:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v6, :cond_1

    .line 20
    .line 21
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v10

    .line 25
    const/4 v11, 0x0

    .line 26
    :cond_0
    if-ge v11, v10, :cond_1

    .line 27
    .line 28
    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v12

    .line 32
    add-int/lit8 v11, v11, 0x1

    .line 33
    .line 34
    check-cast v12, Ljava/util/regex/Pattern;

    .line 35
    .line 36
    invoke-virtual {v12, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 37
    .line 38
    .line 39
    move-result-object v12

    .line 40
    invoke-virtual {v12}, Ljava/util/regex/Matcher;->matches()Z

    .line 41
    .line 42
    .line 43
    move-result v12

    .line 44
    if-eqz v12, :cond_0

    .line 45
    .line 46
    const/16 v16, 0x0

    .line 47
    .line 48
    goto/16 :goto_a

    .line 49
    .line 50
    :cond_1
    iget v6, v5, Lx1/a;->A:F

    .line 51
    .line 52
    iget-wide v10, v5, Lx1/a;->k0:D

    .line 53
    .line 54
    iget-object v12, v5, Lx1/a;->u:Ljava/util/HashMap;

    .line 55
    .line 56
    const/4 v13, 0x1

    .line 57
    if-eqz v12, :cond_2

    .line 58
    .line 59
    invoke-virtual {v12}, Ljava/util/HashMap;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v12

    .line 63
    if-nez v12, :cond_2

    .line 64
    .line 65
    move v12, v13

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    const/4 v12, 0x0

    .line 68
    :goto_0
    const/4 v14, 0x0

    .line 69
    cmpl-float v14, v6, v14

    .line 70
    .line 71
    if-gtz v14, :cond_4

    .line 72
    .line 73
    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    .line 74
    .line 75
    .line 76
    move-result v15

    .line 77
    if-nez v15, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    const/4 v15, 0x0

    .line 81
    :goto_1
    const/16 v16, 0x0

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    :goto_2
    move v15, v13

    .line 85
    goto :goto_1

    .line 86
    :goto_3
    iget-boolean v9, v5, Lx1/a;->W0:Z

    .line 87
    .line 88
    if-nez v9, :cond_5

    .line 89
    .line 90
    if-nez v12, :cond_5

    .line 91
    .line 92
    if-nez v15, :cond_5

    .line 93
    .line 94
    goto/16 :goto_a

    .line 95
    .line 96
    :cond_5
    iget-boolean v9, v1, Lk/a;->b:Z

    .line 97
    .line 98
    if-nez v9, :cond_6

    .line 99
    .line 100
    iput-object v2, v1, Lk/a;->c:Ljava/lang/Object;

    .line 101
    .line 102
    iput-boolean v13, v1, Lk/a;->b:Z

    .line 103
    .line 104
    :cond_6
    iget-object v9, v1, Lk/a;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v9, Ljava/lang/String;

    .line 107
    .line 108
    if-eqz v9, :cond_a

    .line 109
    .line 110
    if-nez v2, :cond_7

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_7
    :try_start_0
    new-instance v12, Ljava/net/URL;

    .line 114
    .line 115
    invoke-direct {v12, v9}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance v9, Ljava/net/URL;

    .line 119
    .line 120
    invoke-direct {v9, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v15

    .line 127
    invoke-virtual {v9}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v13

    .line 131
    if-nez v15, :cond_9

    .line 132
    .line 133
    if-nez v13, :cond_8

    .line 134
    .line 135
    const/4 v13, 0x1

    .line 136
    goto :goto_4

    .line 137
    :cond_8
    const/4 v13, 0x0

    .line 138
    goto :goto_4

    .line 139
    :cond_9
    invoke-virtual {v15, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 140
    .line 141
    .line 142
    move-result v13

    .line 143
    :goto_4
    if-nez v13, :cond_b

    .line 144
    .line 145
    :catch_0
    :cond_a
    :goto_5
    const/4 v8, 0x0

    .line 146
    goto :goto_9

    .line 147
    :cond_b
    invoke-virtual {v12}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v13

    .line 151
    invoke-virtual {v9}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v15

    .line 155
    if-nez v13, :cond_d

    .line 156
    .line 157
    if-nez v15, :cond_c

    .line 158
    .line 159
    const/4 v13, 0x1

    .line 160
    goto :goto_6

    .line 161
    :cond_c
    const/4 v13, 0x0

    .line 162
    goto :goto_6

    .line 163
    :cond_d
    invoke-virtual {v13, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result v13

    .line 167
    :goto_6
    if-nez v13, :cond_e

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_e
    invoke-virtual {v12}, Ljava/net/URL;->getPort()I

    .line 171
    .line 172
    .line 173
    move-result v13

    .line 174
    const/4 v15, -0x1

    .line 175
    if-eq v13, v15, :cond_f

    .line 176
    .line 177
    invoke-virtual {v12}, Ljava/net/URL;->getPort()I

    .line 178
    .line 179
    .line 180
    move-result v13

    .line 181
    goto :goto_7

    .line 182
    :cond_f
    invoke-virtual {v12}, Ljava/net/URL;->getDefaultPort()I

    .line 183
    .line 184
    .line 185
    move-result v13

    .line 186
    :goto_7
    invoke-virtual {v9}, Ljava/net/URL;->getPort()I

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    if-eq v8, v15, :cond_10

    .line 191
    .line 192
    invoke-virtual {v9}, Ljava/net/URL;->getPort()I

    .line 193
    .line 194
    .line 195
    move-result v8

    .line 196
    goto :goto_8

    .line 197
    :cond_10
    invoke-virtual {v9}, Ljava/net/URL;->getDefaultPort()I

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    :goto_8
    if-eq v13, v8, :cond_11

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_11
    invoke-virtual {v12}, Ljava/net/URL;->getQuery()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    invoke-virtual {v9}, Ljava/net/URL;->getQuery()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v13

    .line 212
    invoke-static {v8, v13}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    if-nez v8, :cond_12

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_12
    invoke-virtual {v12}, Ljava/net/URL;->getPath()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v8

    .line 223
    invoke-static {v8}, Lk/a;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v8

    .line 227
    invoke-virtual {v9}, Ljava/net/URL;->getPath()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    invoke-static {v9}, Lk/a;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v8
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 239
    :goto_9
    if-nez v8, :cond_13

    .line 240
    .line 241
    :goto_a
    return-object v16

    .line 242
    :cond_13
    :try_start_1
    new-instance v8, Ljava/net/URL;

    .line 243
    .line 244
    invoke-direct {v8, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v8}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v9

    .line 251
    const-string v12, "http"

    .line 252
    .line 253
    invoke-virtual {v9, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 254
    .line 255
    .line 256
    move-result v12

    .line 257
    if-nez v12, :cond_14

    .line 258
    .line 259
    const-string v12, "https"

    .line 260
    .line 261
    invoke-virtual {v9, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 262
    .line 263
    .line 264
    move-result v9

    .line 265
    if-nez v9, :cond_14

    .line 266
    .line 267
    return-object v16

    .line 268
    :catchall_0
    move-exception v0

    .line 269
    move-object/from16 v9, v16

    .line 270
    .line 271
    goto/16 :goto_1a

    .line 272
    .line 273
    :catch_1
    move-exception v0

    .line 274
    move-object/from16 v2, v16

    .line 275
    .line 276
    move-object v5, v2

    .line 277
    goto/16 :goto_19

    .line 278
    .line 279
    :cond_14
    invoke-virtual {v8}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    check-cast v9, Ljava/net/HttpURLConnection;

    .line 284
    .line 285
    const/4 v12, 0x0

    .line 286
    invoke-virtual {v9, v12}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v8}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    invoke-virtual {v5, v8}, Lx1/a;->G(Ljava/lang/String;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v8
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 297
    const-string v12, "User-Agent"

    .line 298
    .line 299
    if-eqz v8, :cond_15

    .line 300
    .line 301
    :try_start_2
    invoke-virtual {v9, v12, v8}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    goto :goto_b

    .line 305
    :cond_15
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 306
    .line 307
    .line 308
    move-result v8

    .line 309
    if-nez v8, :cond_16

    .line 310
    .line 311
    invoke-virtual {v9, v12, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    goto :goto_b

    .line 315
    :cond_16
    new-instance v7, Ljava/lang/StringBuilder;

    .line 316
    .line 317
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 318
    .line 319
    .line 320
    move-object v8, v0

    .line 321
    check-cast v8, Lu1/o0;

    .line 322
    .line 323
    invoke-virtual {v8}, Lu1/o0;->getDefaultUserAgent()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v8

    .line 327
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    const-string v8, " "

    .line 331
    .line 332
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    iget-object v5, v5, Lx1/a;->j:Ljava/lang/String;

    .line 336
    .line 337
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    invoke-virtual {v9, v12, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    :goto_b
    const-string v5, "Cache-Control"

    .line 348
    .line 349
    const-string v7, "no-cache"

    .line 350
    .line 351
    invoke-virtual {v9, v5, v7}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    if-eqz v3, :cond_17

    .line 355
    .line 356
    const-string v5, "Referer"

    .line 357
    .line 358
    invoke-virtual {v9, v5, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    :cond_17
    const-string v3, "Accept-Language"

    .line 362
    .line 363
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    invoke-virtual {v5}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    invoke-virtual {v9, v3, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    invoke-static/range {p1 .. p1}, Lt2/i;->k(Landroid/app/Activity;)Ljava/util/HashMap;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    if-eqz v3, :cond_18

    .line 379
    .line 380
    invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 389
    .line 390
    .line 391
    move-result v5

    .line 392
    if-eqz v5, :cond_18

    .line 393
    .line 394
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    check-cast v5, Ljava/util/Map$Entry;

    .line 399
    .line 400
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v7

    .line 404
    check-cast v7, Ljava/lang/String;

    .line 405
    .line 406
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    check-cast v5, Ljava/lang/String;

    .line 411
    .line 412
    invoke-virtual {v9, v7, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    goto :goto_c

    .line 416
    :cond_18
    invoke-virtual {v9}, Ljava/net/URLConnection;->connect()V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    const/16 v5, 0x12d

    .line 424
    .line 425
    if-eq v3, v5, :cond_27

    .line 426
    .line 427
    const/16 v5, 0x12e

    .line 428
    .line 429
    if-eq v3, v5, :cond_27

    .line 430
    .line 431
    const/16 v5, 0x12f

    .line 432
    .line 433
    if-eq v3, v5, :cond_27

    .line 434
    .line 435
    const/16 v5, 0x133

    .line 436
    .line 437
    if-ne v3, v5, :cond_19

    .line 438
    .line 439
    goto/16 :goto_17

    .line 440
    .line 441
    :cond_19
    invoke-virtual {v9}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 445
    if-nez v0, :cond_1a

    .line 446
    .line 447
    :try_start_3
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 448
    .line 449
    invoke-virtual {v9}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    invoke-direct {v0, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 454
    .line 455
    .line 456
    :goto_d
    move-object v2, v0

    .line 457
    goto :goto_e

    .line 458
    :catch_2
    :try_start_4
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 459
    .line 460
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    invoke-direct {v0, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 465
    .line 466
    .line 467
    goto :goto_d

    .line 468
    :goto_e
    :try_start_5
    invoke-static {v2}, Ljava/net/URLConnection;->guessContentTypeFromStream(Ljava/io/InputStream;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    goto :goto_f

    .line 473
    :catchall_1
    move-exception v0

    .line 474
    move-object v9, v2

    .line 475
    goto/16 :goto_1a

    .line 476
    .line 477
    :catch_3
    move-exception v0

    .line 478
    move-object/from16 v5, v16

    .line 479
    .line 480
    goto/16 :goto_19

    .line 481
    .line 482
    :cond_1a
    move-object/from16 v2, v16

    .line 483
    .line 484
    :goto_f
    if-eqz v0, :cond_26

    .line 485
    .line 486
    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 487
    .line 488
    .line 489
    move-result v3

    .line 490
    if-nez v3, :cond_1b

    .line 491
    .line 492
    goto/16 :goto_16

    .line 493
    .line 494
    :cond_1b
    invoke-static {v0}, Lk/a;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    if-nez v0, :cond_1c

    .line 499
    .line 500
    const-string v0, "UTF-8"

    .line 501
    .line 502
    goto :goto_10

    .line 503
    :cond_1c
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    const-string v5, "iso-8859-1"

    .line 508
    .line 509
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    move-result v3

    .line 513
    if-eqz v3, :cond_1d

    .line 514
    .line 515
    const-string v0, "windows-1252"
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 516
    .line 517
    :cond_1d
    :goto_10
    if-nez v2, :cond_1e

    .line 518
    .line 519
    :try_start_6
    new-instance v3, Ljava/io/BufferedInputStream;

    .line 520
    .line 521
    invoke-virtual {v9}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 522
    .line 523
    .line 524
    move-result-object v5

    .line 525
    invoke-direct {v3, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 526
    .line 527
    .line 528
    :goto_11
    move-object v2, v3

    .line 529
    goto :goto_12

    .line 530
    :catch_4
    :try_start_7
    new-instance v3, Ljava/io/BufferedInputStream;

    .line 531
    .line 532
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 533
    .line 534
    .line 535
    move-result-object v5

    .line 536
    invoke-direct {v3, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 537
    .line 538
    .line 539
    goto :goto_11

    .line 540
    :cond_1e
    :goto_12
    invoke-virtual {v9}, Ljava/net/URLConnection;->getContentLength()I

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    if-gez v3, :cond_1f

    .line 545
    .line 546
    const/16 v3, 0x2800

    .line 547
    .line 548
    :cond_1f
    new-instance v5, Ljava/io/ByteArrayOutputStream;

    .line 549
    .line 550
    invoke-direct {v5, v3}, Ljava/io/ByteArrayOutputStream;-><init>(I)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 551
    .line 552
    .line 553
    const/16 v3, 0x400

    .line 554
    .line 555
    :try_start_8
    new-array v3, v3, [B

    .line 556
    .line 557
    :goto_13
    invoke-virtual {v2, v3}, Ljava/io/InputStream;->read([B)I

    .line 558
    .line 559
    .line 560
    move-result v7

    .line 561
    if-lez v7, :cond_20

    .line 562
    .line 563
    const/4 v12, 0x0

    .line 564
    invoke-virtual {v5, v3, v12, v7}, Ljava/io/OutputStream;->write([BII)V

    .line 565
    .line 566
    .line 567
    goto :goto_13

    .line 568
    :cond_20
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 573
    .line 574
    const/16 v7, 0x21

    .line 575
    .line 576
    if-lt v3, v7, :cond_21

    .line 577
    .line 578
    invoke-static {v5, v0}, Landroidx/activity/r;->i(Ljava/io/ByteArrayOutputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    goto :goto_14

    .line 583
    :catchall_2
    move-exception v0

    .line 584
    move-object v9, v2

    .line 585
    move-object/from16 v16, v5

    .line 586
    .line 587
    goto/16 :goto_1a

    .line 588
    .line 589
    :catch_5
    move-exception v0

    .line 590
    goto/16 :goto_19

    .line 591
    .line 592
    :cond_21
    new-instance v3, Ljava/lang/String;

    .line 593
    .line 594
    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 595
    .line 596
    .line 597
    move-result-object v7

    .line 598
    invoke-direct {v3, v7, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 599
    .line 600
    .line 601
    move-object v0, v3

    .line 602
    :goto_14
    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    .line 603
    .line 604
    .line 605
    move-result v3

    .line 606
    if-nez v3, :cond_22

    .line 607
    .line 608
    goto :goto_15

    .line 609
    :cond_22
    if-lez v14, :cond_23

    .line 610
    .line 611
    iget v3, v1, Lk/a;->a:I

    .line 612
    .line 613
    int-to-float v3, v3

    .line 614
    div-float/2addr v3, v6

    .line 615
    float-to-double v10, v3

    .line 616
    goto :goto_15

    .line 617
    :cond_23
    const-wide/high16 v10, 0x7ff8000000000000L    # Double.NaN

    .line 618
    .line 619
    :goto_15
    if-gtz v14, :cond_24

    .line 620
    .line 621
    invoke-static {v10, v11}, Ljava/lang/Double;->isNaN(D)Z

    .line 622
    .line 623
    .line 624
    move-result v3

    .line 625
    if-nez v3, :cond_25

    .line 626
    .line 627
    :cond_24
    invoke-static {v0, v6, v10, v11}, Lk/a;->f(Ljava/lang/String;FD)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    :cond_25
    new-instance v3, Landroid/webkit/WebResourceResponse;

    .line 632
    .line 633
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 634
    .line 635
    invoke-virtual {v6}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v7

    .line 639
    new-instance v8, Ljava/io/ByteArrayInputStream;

    .line 640
    .line 641
    invoke-virtual {v0, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    invoke-direct {v8, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 646
    .line 647
    .line 648
    invoke-direct {v3, v4, v7, v8}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 649
    .line 650
    .line 651
    invoke-static {v2}, Lt1/l;->e(Ljava/io/Closeable;)V

    .line 652
    .line 653
    .line 654
    invoke-static {v5}, Lt1/l;->e(Ljava/io/Closeable;)V

    .line 655
    .line 656
    .line 657
    return-object v3

    .line 658
    :cond_26
    :goto_16
    invoke-static {v2}, Lt1/l;->e(Ljava/io/Closeable;)V

    .line 659
    .line 660
    .line 661
    return-object v16

    .line 662
    :cond_27
    :goto_17
    :try_start_9
    const-string v3, "Location"

    .line 663
    .line 664
    invoke-virtual {v9, v3}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v3

    .line 668
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 669
    .line 670
    .line 671
    :try_start_a
    new-instance v4, Ljava/net/URL;

    .line 672
    .line 673
    invoke-direct {v4, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/net/MalformedURLException; {:try_start_a .. :try_end_a} :catch_6
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 674
    .line 675
    .line 676
    goto :goto_18

    .line 677
    :catch_6
    :try_start_b
    new-instance v4, Ljava/net/URL;

    .line 678
    .line 679
    invoke-direct {v4, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    new-instance v5, Ljava/net/URL;

    .line 683
    .line 684
    invoke-direct {v5, v4, v3}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v5}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v3

    .line 691
    :goto_18
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 692
    .line 693
    .line 694
    move-result v4

    .line 695
    if-nez v4, :cond_28

    .line 696
    .line 697
    move-object/from16 v4, p1

    .line 698
    .line 699
    invoke-virtual {v1, v4, v0, v3, v2}, Lk/a;->e(Landroid/app/Activity;Lx1/i;Ljava/lang/String;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;

    .line 700
    .line 701
    .line 702
    move-result-object v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 703
    return-object v0

    .line 704
    :cond_28
    return-object v16

    .line 705
    :goto_19
    :try_start_c
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 706
    .line 707
    .line 708
    move-result-object v3

    .line 709
    const-string v4, "k.a"

    .line 710
    .line 711
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v6

    .line 715
    invoke-virtual {v3, v4, v6, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 716
    .line 717
    .line 718
    invoke-static {v2}, Lt1/l;->e(Ljava/io/Closeable;)V

    .line 719
    .line 720
    .line 721
    invoke-static {v5}, Lt1/l;->e(Ljava/io/Closeable;)V

    .line 722
    .line 723
    .line 724
    return-object v16

    .line 725
    :goto_1a
    invoke-static {v9}, Lt1/l;->e(Ljava/io/Closeable;)V

    .line 726
    .line 727
    .line 728
    invoke-static/range {v16 .. v16}, Lt1/l;->e(Ljava/io/Closeable;)V

    .line 729
    .line 730
    .line 731
    throw v0
.end method
