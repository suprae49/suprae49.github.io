.class public final Lu1/k;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public c:Z

.field public d:Ljava/net/HttpURLConnection;

.field public e:Ljava/io/InputStream;

.field public f:Ljava/io/FileOutputStream;

.field public g:Ljava/io/File;

.field public h:Landroid/net/Uri;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Z

.field public m:Z

.field public final n:I

.field public final o:Landroidx/emoji2/text/p;

.field public final p:Ljava/util/concurrent/atomic/AtomicReference;

.field public q:Z

.field public final synthetic r:Lco/median/android/DownloadService;


# direct methods
.method public constructor <init>(Lco/median/android/DownloadService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILandroidx/emoji2/text/p;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/k;->r:Lco/median/android/DownloadService;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lu1/k;->g:Ljava/io/File;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lu1/k;->q:Z

    .line 11
    .line 12
    iget v1, p1, Lco/median/android/DownloadService;->i:I

    .line 13
    .line 14
    add-int/lit8 v2, v1, 0x1

    .line 15
    .line 16
    iput v2, p1, Lco/median/android/DownloadService;->i:I

    .line 17
    .line 18
    iput v1, p0, Lu1/k;->a:I

    .line 19
    .line 20
    iput-object p2, p0, Lu1/k;->b:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p3, p0, Lu1/k;->i:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p4, p0, Lu1/k;->k:Ljava/lang/String;

    .line 25
    .line 26
    iput-boolean v0, p0, Lu1/k;->c:Z

    .line 27
    .line 28
    iput-boolean p5, p0, Lu1/k;->l:Z

    .line 29
    .line 30
    iput-boolean p6, p0, Lu1/k;->m:Z

    .line 31
    .line 32
    iput p7, p0, Lu1/k;->n:I

    .line 33
    .line 34
    iput-object p8, p0, Lu1/k;->o:Landroidx/emoji2/text/p;

    .line 35
    .line 36
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 37
    .line 38
    invoke-direct {p1, p3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lu1/k;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lu1/k;->e:Ljava/io/InputStream;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception v0

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    :goto_0
    iget-object v0, p0, Lu1/k;->f:Ljava/io/FileOutputStream;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    .line 16
    .line 17
    .line 18
    :cond_1
    iget-object v0, p0, Lu1/k;->d:Ljava/net/HttpURLConnection;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    :cond_2
    return-void

    .line 26
    :goto_1
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "DownloadService"

    .line 31
    .line 32
    const-string v3, "startDownload: "

    .line 33
    .line 34
    invoke-virtual {v1, v2, v3, v0}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, Lu1/k;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, ";"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iput-object v2, p0, Lu1/k;->k:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v4, p0, Lu1/k;->k:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v2, v4}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iput-object v2, p0, Lu1/k;->j:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v2, p0, Lu1/k;->i:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const-string v4, "download"

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    const-string v2, "filename="

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/4 v5, -0x1

    .line 53
    if-eq v2, v5, :cond_1

    .line 54
    .line 55
    add-int/lit8 v2, v2, 0x9

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eq v1, v5, :cond_0

    .line 62
    .line 63
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :goto_0
    invoke-static {v1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iput-object v1, p0, Lu1/k;->i:Ljava/lang/String;

    .line 77
    .line 78
    :cond_1
    iget-object v1, p0, Lu1/k;->i:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_2

    .line 85
    .line 86
    iput-object v4, p0, Lu1/k;->i:Ljava/lang/String;

    .line 87
    .line 88
    :cond_2
    iget-object v1, p0, Lu1/k;->i:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v1, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_3

    .line 95
    .line 96
    iget-object v1, p0, Lu1/k;->i:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {v1}, Lu1/o;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-nez v2, :cond_3

    .line 107
    .line 108
    iput-object v1, p0, Lu1/k;->j:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v2, p0, Lu1/k;->i:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v2, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_3

    .line 117
    .line 118
    iget-object v2, p0, Lu1/k;->i:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    add-int/lit8 v1, v1, 0x1

    .line 129
    .line 130
    sub-int/2addr v4, v1

    .line 131
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    iput-object v1, p0, Lu1/k;->i:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iget-object v2, p0, Lu1/k;->j:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    iput-object v1, p0, Lu1/k;->k:Ljava/lang/String;

    .line 148
    .line 149
    :cond_3
    invoke-virtual {p0}, Lu1/k;->d()V

    .line 150
    .line 151
    .line 152
    const-string v1, ";base64"

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_4

    .line 159
    .line 160
    const-string v1, ";base64,"

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    add-int/lit8 v1, v1, 0x8

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {v0, v3}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iget-object v1, p0, Lu1/k;->f:Ljava/io/FileOutputStream;

    .line 177
    .line 178
    invoke-virtual {v1, v0}, Ljava/io/FileOutputStream;->write([B)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :cond_4
    const-string v1, ","

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    add-int/lit8 v1, v1, 0x1

    .line 189
    .line 190
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    iget-object v1, p0, Lu1/k;->f:Ljava/io/FileOutputStream;

    .line 195
    .line 196
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 197
    .line 198
    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {v1, v0}, Ljava/io/FileOutputStream;->write([B)V

    .line 203
    .line 204
    .line 205
    return-void
.end method

.method public final c()V
    .locals 10

    .line 1
    new-instance v0, Ljava/net/URL;

    .line 2
    .line 3
    iget-object v1, p0, Lu1/k;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 13
    .line 14
    iput-object v0, p0, Lu1/k;->d:Ljava/net/HttpURLConnection;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lu1/k;->d:Ljava/net/HttpURLConnection;

    .line 21
    .line 22
    iget-object v3, p0, Lu1/k;->r:Lco/median/android/DownloadService;

    .line 23
    .line 24
    iget-object v3, v3, Lco/median/android/DownloadService;->j:Ljava/lang/String;

    .line 25
    .line 26
    const-string v4, "User-Agent"

    .line 27
    .line 28
    invoke-virtual {v0, v4, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lu1/k;->d:Ljava/net/HttpURLConnection;

    .line 32
    .line 33
    const/16 v3, 0x1388

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lu1/k;->d:Ljava/net/HttpURLConnection;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lu1/k;->d:Ljava/net/HttpURLConnection;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/16 v3, 0xc8

    .line 50
    .line 51
    const-string v4, "DownloadService"

    .line 52
    .line 53
    const/4 v5, 0x0

    .line 54
    if-eq v0, v3, :cond_0

    .line 55
    .line 56
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v2, "Server returned HTTP "

    .line 63
    .line 64
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iget-object v2, p0, Lu1/k;->d:Ljava/net/HttpURLConnection;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v2, " "

    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    iget-object v2, p0, Lu1/k;->d:Ljava/net/HttpURLConnection;

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    const/4 v2, 0x0

    .line 95
    invoke-virtual {v0, v4, v1, v2}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 96
    .line 97
    .line 98
    iput-boolean v5, p0, Lu1/k;->c:Z

    .line 99
    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v1, "Response code: "

    .line 103
    .line 104
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, Lu1/k;->d:Ljava/net/HttpURLConnection;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v1, ". "

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, Lu1/k;->d:Ljava/net/HttpURLConnection;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iget-object v1, p0, Lu1/k;->o:Landroidx/emoji2/text/p;

    .line 135
    .line 136
    iget-object v2, v1, Landroidx/emoji2/text/p;->h:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v2, Lu1/o;

    .line 139
    .line 140
    iget-object v2, v2, Lu1/o;->a:Lco/median/android/MainActivity;

    .line 141
    .line 142
    iget-object v1, v1, Landroidx/emoji2/text/p;->g:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v1, Ljava/lang/String;

    .line 145
    .line 146
    invoke-static {v2, v1, v0}, Lu1/o;->g(Lx1/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_0
    iget-object v0, p0, Lu1/k;->d:Ljava/net/HttpURLConnection;

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentLength()I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    int-to-double v6, v0

    .line 157
    const-wide/high16 v8, 0x4130000000000000L    # 1048576.0

    .line 158
    .line 159
    div-double/2addr v6, v8

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v3, "startDownload: File size in MB: "

    .line 163
    .line 164
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-static {v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    .line 176
    .line 177
    iget-object v0, p0, Lu1/k;->d:Ljava/net/HttpURLConnection;

    .line 178
    .line 179
    const-string v3, "Content-Type"

    .line 180
    .line 181
    invoke-virtual {v0, v3}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    if-eqz v0, :cond_1

    .line 186
    .line 187
    iget-object v0, p0, Lu1/k;->d:Ljava/net/HttpURLConnection;

    .line 188
    .line 189
    invoke-virtual {v0, v3}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    iput-object v0, p0, Lu1/k;->k:Ljava/lang/String;

    .line 194
    .line 195
    :cond_1
    iget-object v0, p0, Lu1/k;->i:Ljava/lang/String;

    .line 196
    .line 197
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    const/4 v3, -0x1

    .line 202
    const-string v6, "download"

    .line 203
    .line 204
    if-nez v0, :cond_4

    .line 205
    .line 206
    iget-object v0, p0, Lu1/k;->i:Ljava/lang/String;

    .line 207
    .line 208
    invoke-static {v0}, Lu1/o;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    iput-object v0, p0, Lu1/k;->j:Ljava/lang/String;

    .line 213
    .line 214
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_2

    .line 219
    .line 220
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    iget-object v1, p0, Lu1/k;->k:Ljava/lang/String;

    .line 225
    .line 226
    invoke-virtual {v0, v1}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    iput-object v0, p0, Lu1/k;->j:Ljava/lang/String;

    .line 231
    .line 232
    goto/16 :goto_1

    .line 233
    .line 234
    :cond_2
    iget-object v0, p0, Lu1/k;->i:Ljava/lang/String;

    .line 235
    .line 236
    iget-object v1, p0, Lu1/k;->j:Ljava/lang/String;

    .line 237
    .line 238
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-eqz v0, :cond_3

    .line 243
    .line 244
    iput-object v6, p0, Lu1/k;->i:Ljava/lang/String;

    .line 245
    .line 246
    goto :goto_1

    .line 247
    :cond_3
    iget-object v0, p0, Lu1/k;->i:Ljava/lang/String;

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    iget-object v6, p0, Lu1/k;->j:Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    add-int/2addr v6, v2

    .line 260
    sub-int/2addr v1, v6

    .line 261
    invoke-virtual {v0, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    iput-object v0, p0, Lu1/k;->i:Ljava/lang/String;

    .line 266
    .line 267
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    iget-object v1, p0, Lu1/k;->j:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v0, v1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    iput-object v0, p0, Lu1/k;->k:Ljava/lang/String;

    .line 278
    .line 279
    goto :goto_1

    .line 280
    :cond_4
    iget-object v0, p0, Lu1/k;->d:Ljava/net/HttpURLConnection;

    .line 281
    .line 282
    const-string v7, "Content-Disposition"

    .line 283
    .line 284
    invoke-virtual {v0, v7}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    iget-object v7, p0, Lu1/k;->k:Ljava/lang/String;

    .line 289
    .line 290
    invoke-static {v1, v0, v7}, Lt2/i;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    const/16 v1, 0x2e

    .line 295
    .line 296
    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    if-ne v1, v3, :cond_5

    .line 301
    .line 302
    iput-object v0, p0, Lu1/k;->i:Ljava/lang/String;

    .line 303
    .line 304
    const-string v0, ""

    .line 305
    .line 306
    iput-object v0, p0, Lu1/k;->j:Ljava/lang/String;

    .line 307
    .line 308
    goto :goto_0

    .line 309
    :cond_5
    if-nez v1, :cond_6

    .line 310
    .line 311
    iput-object v6, p0, Lu1/k;->i:Ljava/lang/String;

    .line 312
    .line 313
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    iput-object v0, p0, Lu1/k;->j:Ljava/lang/String;

    .line 318
    .line 319
    goto :goto_0

    .line 320
    :cond_6
    invoke-virtual {v0, v5, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    iput-object v6, p0, Lu1/k;->i:Ljava/lang/String;

    .line 325
    .line 326
    add-int/2addr v1, v2

    .line 327
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    iput-object v0, p0, Lu1/k;->j:Ljava/lang/String;

    .line 332
    .line 333
    :goto_0
    iget-object v0, p0, Lu1/k;->j:Ljava/lang/String;

    .line 334
    .line 335
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-nez v0, :cond_7

    .line 340
    .line 341
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    iget-object v1, p0, Lu1/k;->j:Ljava/lang/String;

    .line 346
    .line 347
    invoke-virtual {v0, v1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    iput-object v0, p0, Lu1/k;->k:Ljava/lang/String;

    .line 352
    .line 353
    :cond_7
    :goto_1
    invoke-virtual {p0}, Lu1/k;->d()V

    .line 354
    .line 355
    .line 356
    iget-object v0, p0, Lu1/k;->d:Ljava/net/HttpURLConnection;

    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentLength()I

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    iget-object v1, p0, Lu1/k;->d:Ljava/net/HttpURLConnection;

    .line 363
    .line 364
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    iput-object v1, p0, Lu1/k;->e:Ljava/io/InputStream;

    .line 369
    .line 370
    const/16 v1, 0x1000

    .line 371
    .line 372
    new-array v1, v1, [B

    .line 373
    .line 374
    move v2, v5

    .line 375
    :goto_2
    iget-object v6, p0, Lu1/k;->e:Ljava/io/InputStream;

    .line 376
    .line 377
    invoke-virtual {v6, v1}, Ljava/io/InputStream;->read([B)I

    .line 378
    .line 379
    .line 380
    move-result v6

    .line 381
    if-eq v6, v3, :cond_8

    .line 382
    .line 383
    iget-boolean v7, p0, Lu1/k;->c:Z

    .line 384
    .line 385
    if-eqz v7, :cond_8

    .line 386
    .line 387
    iget-object v7, p0, Lu1/k;->f:Ljava/io/FileOutputStream;

    .line 388
    .line 389
    invoke-virtual {v7, v1, v5, v6}, Ljava/io/FileOutputStream;->write([BII)V

    .line 390
    .line 391
    .line 392
    add-int/2addr v2, v6

    .line 393
    mul-int/lit8 v6, v2, 0x64

    .line 394
    .line 395
    div-int/2addr v6, v0

    .line 396
    new-instance v7, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    const-string v8, "startDownload: Download progress: "

    .line 399
    .line 400
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v6

    .line 410
    invoke-static {v4, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 411
    .line 412
    .line 413
    goto :goto_2

    .line 414
    :cond_8
    return-void
.end method

.method public final d()V
    .locals 10

    .line 1
    iget-object v0, p0, Lu1/k;->p:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    iget-object v1, p0, Lu1/k;->r:Lco/median/android/DownloadService;

    .line 4
    .line 5
    iget v2, p0, Lu1/k;->n:I

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne v2, v3, :cond_6

    .line 9
    .line 10
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v3, 0x1c

    .line 13
    .line 14
    if-le v2, v3, :cond_4

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-boolean v2, p0, Lu1/k;->l:Z

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget-object v2, p0, Lu1/k;->k:Ljava/lang/String;

    .line 30
    .line 31
    const-string v5, "image"

    .line 32
    .line 33
    invoke-virtual {v2, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    iget-object v2, p0, Lu1/k;->i:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v5, p0, Lu1/k;->k:Ljava/lang/String;

    .line 42
    .line 43
    sget-object v6, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v3, v2, v5, v6}, Lu1/o;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iput-object v2, p0, Lu1/k;->h:Landroid/net/Uri;

    .line 50
    .line 51
    :goto_0
    move v2, v4

    .line 52
    goto :goto_1

    .line 53
    :cond_0
    iget-object v2, p0, Lu1/k;->i:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v5, p0, Lu1/k;->k:Ljava/lang/String;

    .line 56
    .line 57
    sget-object v6, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v3, v2, v5, v6}, Lu1/o;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iput-object v2, p0, Lu1/k;->h:Landroid/net/Uri;

    .line 64
    .line 65
    iput-boolean v4, p0, Lu1/k;->l:Z

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :goto_1
    iget-object v4, p0, Lu1/k;->h:Landroid/net/Uri;

    .line 69
    .line 70
    const/4 v9, 0x0

    .line 71
    if-eqz v4, :cond_3

    .line 72
    .line 73
    const-string v1, "_display_name"

    .line 74
    .line 75
    filled-new-array {v1}, [Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    const/4 v7, 0x0

    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v6, 0x0

    .line 82
    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-eqz v2, :cond_2

    .line 87
    .line 88
    :try_start_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_1

    .line 93
    .line 94
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    goto :goto_2

    .line 103
    :catchall_0
    move-exception v0

    .line 104
    goto :goto_3

    .line 105
    :cond_1
    :goto_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 106
    .line 107
    .line 108
    goto :goto_4

    .line 109
    :goto_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 110
    .line 111
    .line 112
    throw v0

    .line 113
    :cond_2
    :goto_4
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lu1/k;->h:Landroid/net/Uri;

    .line 117
    .line 118
    invoke-virtual {v3, v0}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Ljava/io/FileOutputStream;

    .line 123
    .line 124
    iput-object v0, p0, Lu1/k;->f:Ljava/io/FileOutputStream;

    .line 125
    .line 126
    return-void

    .line 127
    :cond_3
    iput-boolean v2, p0, Lu1/k;->c:Z

    .line 128
    .line 129
    iget-object v0, v1, Lco/median/android/DownloadService;->f:Landroid/os/Handler;

    .line 130
    .line 131
    new-instance v1, Lu1/j;

    .line 132
    .line 133
    const/4 v2, 0x1

    .line 134
    invoke-direct {v1, p0, v2}, Lu1/j;-><init>(Lu1/k;I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 138
    .line 139
    .line 140
    invoke-static {}, Lx1/f;->a()Lx1/f;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    new-instance v1, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    const-string v2, "Error creating file - filename: "

    .line 147
    .line 148
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iget-object v2, p0, Lu1/k;->i:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v2, ", mimetype: "

    .line 157
    .line 158
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    iget-object v2, p0, Lu1/k;->k:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    const-string v2, "DownloadService"

    .line 171
    .line 172
    invoke-virtual {v0, v2, v1, v9}, Lx1/f;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :cond_4
    iget-boolean v1, p0, Lu1/k;->l:Z

    .line 177
    .line 178
    if-eqz v1, :cond_5

    .line 179
    .line 180
    sget-object v1, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 181
    .line 182
    invoke-static {v1}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    iget-object v2, p0, Lu1/k;->i:Ljava/lang/String;

    .line 187
    .line 188
    iget-object v3, p0, Lu1/k;->j:Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {v1, v2, v3}, Lu1/o;->b(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    iput-object v1, p0, Lu1/k;->g:Ljava/io/File;

    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_5
    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 198
    .line 199
    invoke-static {v1}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    iget-object v2, p0, Lu1/k;->i:Ljava/lang/String;

    .line 204
    .line 205
    iget-object v3, p0, Lu1/k;->j:Ljava/lang/String;

    .line 206
    .line 207
    invoke-static {v1, v2, v3}, Lu1/o;->b(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    iput-object v1, p0, Lu1/k;->g:Ljava/io/File;

    .line 212
    .line 213
    :goto_5
    iget-object v1, p0, Lu1/k;->g:Ljava/io/File;

    .line 214
    .line 215
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    new-instance v0, Ljava/io/FileOutputStream;

    .line 223
    .line 224
    iget-object v1, p0, Lu1/k;->g:Ljava/io/File;

    .line 225
    .line 226
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 227
    .line 228
    .line 229
    iput-object v0, p0, Lu1/k;->f:Ljava/io/FileOutputStream;

    .line 230
    .line 231
    return-void

    .line 232
    :cond_6
    iput-boolean v3, p0, Lu1/k;->m:Z

    .line 233
    .line 234
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    iget-object v2, p0, Lu1/k;->i:Ljava/lang/String;

    .line 239
    .line 240
    iget-object v3, p0, Lu1/k;->j:Ljava/lang/String;

    .line 241
    .line 242
    invoke-static {v1, v2, v3}, Lu1/o;->b(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    iput-object v1, p0, Lu1/k;->g:Ljava/io/File;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    new-instance v0, Ljava/io/FileOutputStream;

    .line 256
    .line 257
    iget-object v1, p0, Lu1/k;->g:Ljava/io/File;

    .line 258
    .line 259
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 260
    .line 261
    .line 262
    iput-object v0, p0, Lu1/k;->f:Ljava/io/FileOutputStream;

    .line 263
    .line 264
    return-void
.end method
