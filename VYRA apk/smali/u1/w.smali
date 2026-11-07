.class public final Lu1/w;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final synthetic f:I


# instance fields
.field public final a:I

.field public b:Ljava/lang/String;

.field public final c:Lu1/v;

.field public final d:Lco/median/android/MainActivity;

.field public final e:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Lco/median/android/MainActivity;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lu1/v;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lu1/v;-><init>(Lu1/w;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lu1/w;->c:Lu1/v;

    .line 10
    .line 11
    iput-object p1, p0, Lu1/w;->d:Lco/median/android/MainActivity;

    .line 12
    .line 13
    new-instance v0, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lu1/w;->e:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-static {p1}, Lx1/a;->u(Landroid/content/Context;)Lx1/a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p1, p1, Lx1/a;->J0:Lz1/d;

    .line 25
    .line 26
    iget-boolean p1, p1, Lz1/d;->b:Z

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    iput p1, p0, Lu1/w;->a:I

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const/4 p1, 0x2

    .line 35
    iput p1, p0, Lu1/w;->a:I

    .line 36
    .line 37
    return-void
.end method

.method public static a(Lu1/w;Lorg/json/JSONObject;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lu1/w;->e:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "id"

    .line 4
    .line 5
    invoke-static {v1, p1}, Lt2/i;->F(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lu1/u;

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-string v3, "data"

    .line 26
    .line 27
    invoke-static {v3, p1}, Lt2/i;->F(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const-string v3, ";base64,"

    .line 35
    .line 36
    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/4 v4, -0x1

    .line 41
    if-ne v3, v4, :cond_3

    .line 42
    .line 43
    :goto_0
    return-void

    .line 44
    :cond_3
    add-int/lit8 v3, v3, 0x8

    .line 45
    .line 46
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-static {p1, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-wide v3, v2, Lu1/u;->i:J

    .line 56
    .line 57
    array-length v5, p1

    .line 58
    int-to-long v5, v5

    .line 59
    add-long/2addr v3, v5

    .line 60
    iget-wide v5, v2, Lu1/u;->c:J

    .line 61
    .line 62
    cmp-long v3, v3, v5

    .line 63
    .line 64
    iget-object v4, v2, Lu1/u;->h:Ljava/io/OutputStream;

    .line 65
    .line 66
    if-lez v3, :cond_4

    .line 67
    .line 68
    :try_start_0
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    .line 69
    .line 70
    .line 71
    iget-object p1, v2, Lu1/u;->f:Ljava/io/File;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    .line 79
    :catch_0
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v1, "Received too many bytes. Expected "

    .line 86
    .line 87
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-wide v3, v2, Lu1/u;->c:J

    .line 91
    .line 92
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const/4 v3, 0x0

    .line 100
    const-string v4, "w"

    .line 101
    .line 102
    invoke-virtual {p1, v4, v0, v3}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, Lu1/w;->d:Lco/median/android/MainActivity;

    .line 106
    .line 107
    iget-object p1, v2, Lu1/u;->j:Ljava/lang/String;

    .line 108
    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    iget-wide v1, v2, Lu1/u;->c:J

    .line 115
    .line 116
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {p0, p1, v0}, Lu1/o;->g(Lx1/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_4
    invoke-virtual {v4, p1}, Ljava/io/OutputStream;->write([B)V

    .line 128
    .line 129
    .line 130
    iget-wide v0, v2, Lu1/u;->i:J

    .line 131
    .line 132
    array-length p0, p1

    .line 133
    int-to-long p0, p0

    .line 134
    add-long/2addr v0, p0

    .line 135
    iput-wide v0, v2, Lu1/u;->i:J

    .line 136
    .line 137
    return-void
.end method

.method public static b(Lu1/w;Lorg/json/JSONObject;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lu1/w;->d:Lco/median/android/MainActivity;

    .line 2
    .line 3
    const-string v1, "id"

    .line 4
    .line 5
    invoke-static {v1, p1}, Lt2/i;->F(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    const-string v4, "Unable to retrieve download info on file end."

    .line 15
    .line 16
    const-string v5, " for fileEnd"

    .line 17
    .line 18
    const-string v6, "Invalid identifier "

    .line 19
    .line 20
    const-string v7, "w"

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {v6, v1, v5}, Landroidx/fragment/app/u;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {p1, v7, v1, v3}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Lu1/w;->b:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, p0, v4}, Lu1/o;->g(Lx1/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    iget-object v2, p0, Lu1/w;->e:Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lu1/u;

    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {v6, v1, v5}, Landroidx/fragment/app/u;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {p1, v7, v1, v3}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Lu1/w;->b:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0, p0, v4}, Lu1/o;->g(Lx1/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    iget-object v1, v2, Lu1/u;->h:Ljava/io/OutputStream;

    .line 69
    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 73
    .line 74
    .line 75
    :cond_2
    const-string v1, "error"

    .line 76
    .line 77
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_3

    .line 86
    .line 87
    iget-object p0, v2, Lu1/u;->j:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v0, p0, p1}, Lu1/o;->g(Lx1/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    iget-boolean p1, v2, Lu1/u;->k:Z

    .line 94
    .line 95
    if-eqz p1, :cond_4

    .line 96
    .line 97
    new-instance p1, Landroidx/activity/p;

    .line 98
    .line 99
    const/4 v1, 0x7

    .line 100
    invoke-direct {p1, p0, v1, v2}, Landroidx/activity/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    iget-object p0, v2, Lu1/u;->b:Ljava/lang/String;

    .line 108
    .line 109
    if-eqz p0, :cond_5

    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    if-nez p0, :cond_5

    .line 116
    .line 117
    const p0, 0x7f11006c

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    new-instance p1, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    iget-object v1, v2, Lu1/u;->b:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const/16 v1, 0x2e

    .line 135
    .line 136
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    iget-object v1, v2, Lu1/u;->e:Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    goto :goto_0

    .line 157
    :cond_5
    const p0, 0x7f11006a

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    :goto_0
    const/4 p1, 0x0

    .line 165
    invoke-static {v0, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 170
    .line 171
    .line 172
    :goto_1
    iget-object p0, v2, Lu1/u;->j:Ljava/lang/String;

    .line 173
    .line 174
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-eqz p1, :cond_6

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_6
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    .line 182
    .line 183
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 184
    .line 185
    .line 186
    const-string v1, "success"

    .line 187
    .line 188
    const/4 v2, 0x1

    .line 189
    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 190
    .line 191
    .line 192
    new-instance v1, Landroidx/emoji2/text/l;

    .line 193
    .line 194
    invoke-direct {v1, v0, p0, p1, v2}, Landroidx/emoji2/text/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 198
    .line 199
    .line 200
    :catch_0
    :goto_2
    return-void
.end method

.method public static c(Lu1/w;Lorg/json/JSONObject;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lu1/w;->d:Lco/median/android/MainActivity;

    .line 2
    .line 3
    const-string v1, "id"

    .line 4
    .line 5
    invoke-static {v1, p1}, Lt2/i;->F(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    const-string v4, "Unable to retrieve download info on file start."

    .line 15
    .line 16
    const-string v5, "w"

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v1, "Invalid file id"

    .line 25
    .line 26
    invoke-virtual {p1, v5, v1, v3}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lu1/w;->b:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0, p0, v4}, Lu1/o;->g(Lx1/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-object v2, p0, Lu1/w;->e:Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lu1/u;

    .line 42
    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    iget-object p0, p0, Lu1/w;->b:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v0, p0, v4}, Lu1/o;->g(Lx1/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    iget-object v2, v1, Lu1/u;->b:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v6, 0x1

    .line 59
    const-string v7, "download"

    .line 60
    .line 61
    if-nez v2, :cond_3

    .line 62
    .line 63
    iget-object v2, v1, Lu1/u;->b:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v2}, Lu1/o;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iput-object v2, v1, Lu1/u;->e:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-nez v2, :cond_4

    .line 76
    .line 77
    iget-object v2, v1, Lu1/u;->e:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v8, v1, Lu1/u;->b:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v2, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_2

    .line 86
    .line 87
    iput-object v7, v1, Lu1/u;->b:Ljava/lang/String;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    iget-object v2, v1, Lu1/u;->b:Ljava/lang/String;

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    iget-object v8, v1, Lu1/u;->e:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    add-int/2addr v8, v6

    .line 103
    sub-int/2addr v7, v8

    .line 104
    invoke-virtual {v2, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    iput-object v2, v1, Lu1/u;->b:Ljava/lang/String;

    .line 109
    .line 110
    :goto_0
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    iget-object v7, v1, Lu1/u;->e:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v2, v7}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    iput-object v2, v1, Lu1/u;->d:Ljava/lang/String;

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    const-string v2, "name"

    .line 124
    .line 125
    invoke-static {v2, p1}, Lt2/i;->F(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    iput-object v2, v1, Lu1/u;->b:Ljava/lang/String;

    .line 130
    .line 131
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-eqz v2, :cond_4

    .line 136
    .line 137
    iput-object v7, v1, Lu1/u;->b:Ljava/lang/String;

    .line 138
    .line 139
    :cond_4
    :goto_1
    const-string v2, "size"

    .line 140
    .line 141
    const-wide/16 v7, -0x1

    .line 142
    .line 143
    invoke-virtual {p1, v2, v7, v8}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 144
    .line 145
    .line 146
    move-result-wide v7

    .line 147
    const-wide/16 v9, 0x0

    .line 148
    .line 149
    cmp-long v2, v7, v9

    .line 150
    .line 151
    if-lez v2, :cond_9

    .line 152
    .line 153
    const-wide/32 v9, 0x40000000

    .line 154
    .line 155
    .line 156
    cmp-long v2, v7, v9

    .line 157
    .line 158
    if-lez v2, :cond_5

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_5
    iput-wide v7, v1, Lu1/u;->c:J

    .line 162
    .line 163
    iget-object v2, v1, Lu1/u;->d:Ljava/lang/String;

    .line 164
    .line 165
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-eqz v2, :cond_6

    .line 170
    .line 171
    const-string v2, "type"

    .line 172
    .line 173
    invoke-static {v2, p1}, Lt2/i;->F(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iput-object p1, v1, Lu1/u;->d:Ljava/lang/String;

    .line 178
    .line 179
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    if-eqz p1, :cond_6

    .line 184
    .line 185
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    const-string p1, "Invalid file type"

    .line 190
    .line 191
    invoke-virtual {p0, v5, p1, v3}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 192
    .line 193
    .line 194
    iget-object p0, v1, Lu1/u;->j:Ljava/lang/String;

    .line 195
    .line 196
    const-string p1, "Invalid file type."

    .line 197
    .line 198
    invoke-static {v0, p0, p1}, Lu1/o;->g(Lx1/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_6
    iget-object p1, v1, Lu1/u;->e:Ljava/lang/String;

    .line 203
    .line 204
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-eqz p1, :cond_7

    .line 209
    .line 210
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    iget-object v2, v1, Lu1/u;->d:Ljava/lang/String;

    .line 215
    .line 216
    invoke-virtual {p1, v2}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    iput-object p1, v1, Lu1/u;->e:Ljava/lang/String;

    .line 221
    .line 222
    :cond_7
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 223
    .line 224
    const/16 v2, 0x1d

    .line 225
    .line 226
    if-ge p1, v2, :cond_8

    .line 227
    .line 228
    iget p1, p0, Lu1/w;->a:I

    .line 229
    .line 230
    if-ne p1, v6, :cond_8

    .line 231
    .line 232
    const-string p1, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 233
    .line 234
    filled-new-array {p1}, [Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    new-instance v2, Lp1/h;

    .line 239
    .line 240
    invoke-direct {v2, p0, v1}, Lp1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, p1, v2}, Lco/median/android/MainActivity;->G([Ljava/lang/String;Lu1/a1;)V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_8
    invoke-virtual {p0, v1, v6}, Lu1/w;->e(Lu1/u;Z)V

    .line 248
    .line 249
    .line 250
    new-instance p1, Lu1/t;

    .line 251
    .line 252
    invoke-direct {p1, p0, v4}, Lu1/t;-><init>(Lu1/w;I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :cond_9
    :goto_2
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    const-string p1, "Invalid file size"

    .line 264
    .line 265
    invoke-virtual {p0, v5, p1, v3}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 266
    .line 267
    .line 268
    iget-object p0, v1, Lu1/u;->j:Ljava/lang/String;

    .line 269
    .line 270
    const-string p1, "Invalid file size."

    .line 271
    .line 272
    invoke-static {v0, p0, p1}, Lu1/o;->g(Lx1/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lu1/w;->d:Lco/median/android/MainActivity;

    .line 2
    .line 3
    const-string v1, "medianDownloadBlobUrl("

    .line 4
    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const-string v2, "blob:"

    .line 8
    .line 9
    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_0
    iput-object p4, p0, Lu1/w;->b:Ljava/lang/String;

    .line 18
    .line 19
    new-instance v2, Lu1/u;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iput-object v3, v2, Lu1/u;->a:Ljava/lang/String;

    .line 33
    .line 34
    iput-object p2, v2, Lu1/u;->b:Ljava/lang/String;

    .line 35
    .line 36
    iput-object p4, v2, Lu1/u;->j:Ljava/lang/String;

    .line 37
    .line 38
    iput-boolean p3, v2, Lu1/u;->k:Z

    .line 39
    .line 40
    iget-object p2, p0, Lu1/w;->e:Ljava/util/HashMap;

    .line 41
    .line 42
    invoke-virtual {p2, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :try_start_0
    new-instance p2, Ljava/io/ByteArrayOutputStream;

    .line 46
    .line 47
    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance p3, Ljava/io/BufferedInputStream;

    .line 51
    .line 52
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const-string v4, "BlobDownloader.js"

    .line 57
    .line 58
    invoke-virtual {v3, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-direct {p3, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 63
    .line 64
    .line 65
    const/16 v3, 0x400

    .line 66
    .line 67
    new-array v3, v3, [B

    .line 68
    .line 69
    :goto_0
    invoke-virtual {p3, v3}, Ljava/io/InputStream;->read([B)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-lez v4, :cond_1

    .line 74
    .line 75
    const/4 v5, 0x0

    .line 76
    invoke-virtual {p2, v3, v5, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    const/4 p3, 0x0

    .line 85
    invoke-virtual {v0, p2, p3}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p1}, Lt2/i;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object p2, v2, Lu1/u;->a:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v2, v2, Lu1/u;->b:Ljava/lang/String;

    .line 95
    .line 96
    new-instance v3, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string p1, ", \'"

    .line 105
    .line 106
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string p1, "\', \'"

    .line 113
    .line 114
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string p1, "\')"

    .line 121
    .line 122
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {v0, p1, p3}, Lco/median/android/MainActivity;->V(Ljava/lang/String;Lu1/y1;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :catch_0
    move-exception p1

    .line 134
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    const-string p3, "w"

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {p2, p3, v1, p1}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 145
    .line 146
    .line 147
    new-instance p2, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string p3, "IO Error - "

    .line 150
    .line 151
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-static {v0, p4, p1}, Lu1/o;->g(Lx1/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    :cond_2
    :goto_1
    return-void
.end method

.method public final e(Lu1/u;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu1/w;->d:Lco/median/android/MainActivity;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    iget p2, p0, Lu1/w;->a:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne p2, v1, :cond_1

    .line 9
    .line 10
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v1, 0x1c

    .line 13
    .line 14
    if-le p2, v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iget-object v0, p1, Lu1/u;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v1, p1, Lu1/u;->d:Ljava/lang/String;

    .line 27
    .line 28
    sget-object v2, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p2, v0, v1, v2}, Lu1/o;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p2, v0}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iput-object p2, p1, Lu1/u;->h:Ljava/io/OutputStream;

    .line 41
    .line 42
    iput-object v0, p1, Lu1/u;->g:Landroid/net/Uri;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    sget-object p2, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {p2}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    iget-object v0, p1, Lu1/u;->b:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v1, p1, Lu1/u;->e:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {p2, v0, v1}, Lu1/o;->b(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iput-object p2, p1, Lu1/u;->f:Ljava/io/File;

    .line 60
    .line 61
    new-instance p2, Ljava/io/BufferedOutputStream;

    .line 62
    .line 63
    new-instance v0, Ljava/io/FileOutputStream;

    .line 64
    .line 65
    iget-object v1, p1, Lu1/u;->f:Ljava/io/File;

    .line 66
    .line 67
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p2, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 71
    .line 72
    .line 73
    iput-object p2, p1, Lu1/u;->h:Ljava/io/OutputStream;

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    iget-object v0, p1, Lu1/u;->b:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v1, p1, Lu1/u;->e:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {p2, v0, v1}, Lu1/o;->b(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    iput-object p2, p1, Lu1/u;->f:Ljava/io/File;

    .line 89
    .line 90
    new-instance p2, Ljava/io/BufferedOutputStream;

    .line 91
    .line 92
    new-instance v0, Ljava/io/FileOutputStream;

    .line 93
    .line 94
    iget-object v1, p1, Lu1/u;->f:Ljava/io/File;

    .line 95
    .line 96
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 97
    .line 98
    .line 99
    invoke-direct {p2, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 100
    .line 101
    .line 102
    iput-object p2, p1, Lu1/u;->h:Ljava/io/OutputStream;

    .line 103
    .line 104
    :cond_2
    :goto_0
    const-wide/16 v0, 0x0

    .line 105
    .line 106
    iput-wide v0, p1, Lu1/u;->i:J

    .line 107
    .line 108
    iget-object p2, p0, Lu1/w;->e:Ljava/util/HashMap;

    .line 109
    .line 110
    iget-object v0, p1, Lu1/u;->a:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {p2, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    return-void
.end method
