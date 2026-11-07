.class public abstract Landroidx/fragment/app/e0;
.super Landroidx/activity/q;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public A:Z

.field public B:Z

.field public C:Z

.field public final y:Landroidx/fragment/app/w;

.field public final z:Landroidx/lifecycle/v;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/activity/q;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/fragment/app/d0;

    .line 5
    .line 6
    move-object v1, p0

    .line 7
    check-cast v1, Le/j;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Landroidx/fragment/app/d0;-><init>(Le/j;)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Landroidx/fragment/app/w;

    .line 13
    .line 14
    const/4 v3, 0x3

    .line 15
    invoke-direct {v2, v3, v0}, Landroidx/fragment/app/w;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object v2, p0, Landroidx/fragment/app/e0;->y:Landroidx/fragment/app/w;

    .line 19
    .line 20
    new-instance v0, Landroidx/lifecycle/v;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Landroidx/lifecycle/v;-><init>(Landroidx/lifecycle/t;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Landroidx/fragment/app/e0;->z:Landroidx/lifecycle/v;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Landroidx/fragment/app/e0;->C:Z

    .line 29
    .line 30
    iget-object v0, p0, Landroidx/activity/q;->i:Ll1/d;

    .line 31
    .line 32
    iget-object v0, v0, Ll1/d;->b:Ll1/c;

    .line 33
    .line 34
    new-instance v2, Landroidx/activity/f;

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-direct {v2, v3, v1}, Landroidx/activity/f;-><init>(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const-string v3, "android:support:lifecycle"

    .line 41
    .line 42
    invoke-virtual {v0, v3, v2}, Ll1/c;->c(Ljava/lang/String;Ll1/b;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Landroidx/fragment/app/c0;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct {v0, v1, v2}, Landroidx/fragment/app/c0;-><init>(Le/j;I)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Landroidx/activity/q;->o:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 52
    .line 53
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    new-instance v0, Landroidx/fragment/app/c0;

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    invoke-direct {v0, v1, v2}, Landroidx/fragment/app/c0;-><init>(Le/j;I)V

    .line 60
    .line 61
    .line 62
    iget-object v2, p0, Landroidx/activity/q;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 63
    .line 64
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    new-instance v0, Landroidx/activity/g;

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    invoke-direct {v0, v1, v2}, Landroidx/activity/g;-><init>(Landroidx/fragment/app/e0;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v0}, Landroidx/activity/q;->o(La/b;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public static t(Landroidx/fragment/app/u0;)Z
    .locals 7

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/u0;->c:Landroidx/fragment/app/a1;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/a1;->f()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_4

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getHost()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/u0;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v2}, Landroidx/fragment/app/e0;->t(Landroidx/fragment/app/u0;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    or-int/2addr v0, v2

    .line 42
    :cond_2
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Landroidx/fragment/app/l1;

    .line 43
    .line 44
    const-string v3, "setCurrentState"

    .line 45
    .line 46
    sget-object v4, Landroidx/lifecycle/n;->h:Landroidx/lifecycle/n;

    .line 47
    .line 48
    const/4 v5, 0x1

    .line 49
    sget-object v6, Landroidx/lifecycle/n;->i:Landroidx/lifecycle/n;

    .line 50
    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    invoke-virtual {v2}, Landroidx/fragment/app/l1;->c()V

    .line 54
    .line 55
    .line 56
    iget-object v2, v2, Landroidx/fragment/app/l1;->h:Landroidx/lifecycle/v;

    .line 57
    .line 58
    iget-object v2, v2, Landroidx/lifecycle/v;->c:Landroidx/lifecycle/n;

    .line 59
    .line 60
    invoke-virtual {v2, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-ltz v2, :cond_3

    .line 65
    .line 66
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->mViewLifecycleOwner:Landroidx/fragment/app/l1;

    .line 67
    .line 68
    iget-object v0, v0, Landroidx/fragment/app/l1;->h:Landroidx/lifecycle/v;

    .line 69
    .line 70
    invoke-virtual {v0, v3}, Landroidx/lifecycle/v;->d(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v4}, Landroidx/lifecycle/v;->f(Landroidx/lifecycle/n;)V

    .line 74
    .line 75
    .line 76
    move v0, v5

    .line 77
    :cond_3
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->mLifecycleRegistry:Landroidx/lifecycle/v;

    .line 78
    .line 79
    iget-object v2, v2, Landroidx/lifecycle/v;->c:Landroidx/lifecycle/n;

    .line 80
    .line 81
    invoke-virtual {v2, v6}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-ltz v2, :cond_0

    .line 86
    .line 87
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->mLifecycleRegistry:Landroidx/lifecycle/v;

    .line 88
    .line 89
    invoke-virtual {v0, v3}, Landroidx/lifecycle/v;->d(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v4}, Landroidx/lifecycle/v;->f(Landroidx/lifecycle/n;)V

    .line 93
    .line 94
    .line 95
    move v0, v5

    .line 96
    goto :goto_0

    .line 97
    :cond_4
    return v0
.end method


# virtual methods
.method public final dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p4, :cond_5

    .line 6
    .line 7
    array-length v1, p4

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    aget-object v1, p4, v0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    sparse-switch v2, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :sswitch_0
    const-string v2, "--autofill"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_4

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :sswitch_1
    const-string v2, "--contentcapture"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 40
    .line 41
    const/16 v2, 0x1d

    .line 42
    .line 43
    if-lt v1, v2, :cond_5

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :sswitch_2
    const-string v2, "--list-dumpables"

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :sswitch_3
    const-string v2, "--dump-dumpable"

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 65
    .line 66
    const/16 v2, 0x21

    .line 67
    .line 68
    if-lt v1, v2, :cond_5

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :sswitch_4
    const-string v2, "--translation"

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 81
    .line 82
    const/16 v2, 0x1f

    .line 83
    .line 84
    if-lt v1, v2, :cond_5

    .line 85
    .line 86
    :cond_4
    :goto_0
    return-void

    .line 87
    :cond_5
    :goto_1
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const-string v1, "Local FragmentActivity "

    .line 91
    .line 92
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const-string v1, " State:"

    .line 107
    .line 108
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    new-instance v1, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v2, "  "

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    const-string v2, "mCreated="

    .line 132
    .line 133
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    iget-boolean v2, p0, Landroidx/fragment/app/e0;->A:Z

    .line 137
    .line 138
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 139
    .line 140
    .line 141
    const-string v2, " mResumed="

    .line 142
    .line 143
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    iget-boolean v2, p0, Landroidx/fragment/app/e0;->B:Z

    .line 147
    .line 148
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 149
    .line 150
    .line 151
    const-string v2, " mStopped="

    .line 152
    .line 153
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    iget-boolean v2, p0, Landroidx/fragment/app/e0;->C:Z

    .line 157
    .line 158
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    if-eqz v2, :cond_9

    .line 166
    .line 167
    invoke-interface {p0}, Landroidx/lifecycle/u0;->getViewModelStore()Landroidx/lifecycle/t0;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    new-instance v3, Landroidx/emoji2/text/t;

    .line 172
    .line 173
    sget-object v4, Lg1/b;->e:La3/f;

    .line 174
    .line 175
    invoke-direct {v3, v2, v4}, Landroidx/emoji2/text/t;-><init>(Landroidx/lifecycle/t0;Landroidx/lifecycle/s0;)V

    .line 176
    .line 177
    .line 178
    const-class v2, Lg1/b;

    .line 179
    .line 180
    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    if-eqz v4, :cond_8

    .line 185
    .line 186
    const-string v5, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 187
    .line 188
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v3, v4, v2}, Landroidx/emoji2/text/t;->e(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/p0;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    check-cast v2, Lg1/b;

    .line 197
    .line 198
    iget-object v2, v2, Lg1/b;->d:Lp/l;

    .line 199
    .line 200
    iget v3, v2, Lp/l;->h:I

    .line 201
    .line 202
    if-lez v3, :cond_9

    .line 203
    .line 204
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    const-string v3, "Loaders:"

    .line 208
    .line 209
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    iget v3, v2, Lp/l;->h:I

    .line 213
    .line 214
    if-gtz v3, :cond_6

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_6
    iget-object p1, v2, Lp/l;->g:[Ljava/lang/Object;

    .line 218
    .line 219
    aget-object p1, p1, v0

    .line 220
    .line 221
    if-eqz p1, :cond_7

    .line 222
    .line 223
    invoke-static {}, Landroidx/fragment/app/q;->c()V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_7
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    const-string p1, "  #"

    .line 231
    .line 232
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    iget-object p1, v2, Lp/l;->f:[I

    .line 236
    .line 237
    aget p1, p1, v0

    .line 238
    .line 239
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(I)V

    .line 240
    .line 241
    .line 242
    const-string p1, ": "

    .line 243
    .line 244
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    const/4 p1, 0x0

    .line 248
    throw p1

    .line 249
    :cond_8
    const-string p1, "Local and anonymous classes can not be ViewModels"

    .line 250
    .line 251
    invoke-static {p1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :cond_9
    :goto_2
    iget-object v0, p0, Landroidx/fragment/app/e0;->y:Landroidx/fragment/app/w;

    .line 256
    .line 257
    iget-object v0, v0, Landroidx/fragment/app/w;->g:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v0, Landroidx/fragment/app/d0;

    .line 260
    .line 261
    iget-object v0, v0, Landroidx/fragment/app/h0;->i:Landroidx/fragment/app/v0;

    .line 262
    .line 263
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/u0;->u(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :sswitch_data_0
    .sparse-switch
        -0x2673d6ef -> :sswitch_4
        0x5fd0f67 -> :sswitch_3
        0x1c2b8816 -> :sswitch_2
        0x4519f64d -> :sswitch_1
        0x56b9c952 -> :sswitch_0
    .end sparse-switch
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/e0;->y:Landroidx/fragment/app/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/w;->a()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/q;->onActivityResult(IILandroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/q;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/fragment/app/e0;->z:Landroidx/lifecycle/v;

    .line 5
    .line 6
    sget-object v0, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/lifecycle/v;->e(Landroidx/lifecycle/m;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/fragment/app/e0;->y:Landroidx/fragment/app/w;

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/fragment/app/w;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Landroidx/fragment/app/d0;

    .line 16
    .line 17
    iget-object p1, p1, Landroidx/fragment/app/h0;->i:Landroidx/fragment/app/v0;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p1, Landroidx/fragment/app/u0;->E:Z

    .line 21
    .line 22
    iput-boolean v0, p1, Landroidx/fragment/app/u0;->F:Z

    .line 23
    .line 24
    iget-object v1, p1, Landroidx/fragment/app/u0;->L:Landroidx/fragment/app/w0;

    .line 25
    .line 26
    iput-boolean v0, v1, Landroidx/fragment/app/w0;->i:Z

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    invoke-virtual {p1, v0}, Landroidx/fragment/app/u0;->t(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 24
    iget-object v0, p0, Landroidx/fragment/app/e0;->y:Landroidx/fragment/app/w;

    .line 25
    iget-object v0, v0, Landroidx/fragment/app/w;->g:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/d0;

    .line 26
    iget-object v0, v0, Landroidx/fragment/app/h0;->i:Landroidx/fragment/app/v0;

    .line 27
    iget-object v0, v0, Landroidx/fragment/app/u0;->f:Landroidx/fragment/app/j0;

    .line 28
    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/j0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 29
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/e0;->y:Landroidx/fragment/app/w;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/fragment/app/w;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroidx/fragment/app/d0;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/fragment/app/h0;->i:Landroidx/fragment/app/v0;

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/fragment/app/u0;->f:Landroidx/fragment/app/j0;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1, p1, p2, p3}, Landroidx/fragment/app/j0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/e0;->y:Landroidx/fragment/app/w;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/fragment/app/w;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/d0;

    .line 9
    .line 10
    iget-object v0, v0, Landroidx/fragment/app/h0;->i:Landroidx/fragment/app/v0;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/u0;->k()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Landroidx/fragment/app/e0;->z:Landroidx/lifecycle/v;

    .line 16
    .line 17
    sget-object v1, Landroidx/lifecycle/m;->ON_DESTROY:Landroidx/lifecycle/m;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroidx/lifecycle/v;->e(Landroidx/lifecycle/m;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/activity/q;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 v0, 0x6

    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Landroidx/fragment/app/e0;->y:Landroidx/fragment/app/w;

    .line 13
    .line 14
    iget-object p1, p1, Landroidx/fragment/app/w;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Landroidx/fragment/app/d0;

    .line 17
    .line 18
    iget-object p1, p1, Landroidx/fragment/app/h0;->i:Landroidx/fragment/app/v0;

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroidx/fragment/app/u0;->i(Landroid/view/MenuItem;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1

    .line 25
    :cond_1
    const/4 p1, 0x0

    .line 26
    return p1
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/e0;->B:Z

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/fragment/app/e0;->y:Landroidx/fragment/app/w;

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/fragment/app/w;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Landroidx/fragment/app/d0;

    .line 12
    .line 13
    iget-object v0, v0, Landroidx/fragment/app/h0;->i:Landroidx/fragment/app/v0;

    .line 14
    .line 15
    const/4 v1, 0x5

    .line 16
    invoke-virtual {v0, v1}, Landroidx/fragment/app/u0;->t(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Landroidx/fragment/app/e0;->z:Landroidx/lifecycle/v;

    .line 20
    .line 21
    sget-object v1, Landroidx/lifecycle/m;->ON_PAUSE:Landroidx/lifecycle/m;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroidx/lifecycle/v;->e(Landroidx/lifecycle/m;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public onPostResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/e0;->z:Landroidx/lifecycle/v;

    .line 5
    .line 6
    sget-object v1, Landroidx/lifecycle/m;->ON_RESUME:Landroidx/lifecycle/m;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/lifecycle/v;->e(Landroidx/lifecycle/m;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/fragment/app/e0;->y:Landroidx/fragment/app/w;

    .line 12
    .line 13
    iget-object v0, v0, Landroidx/fragment/app/w;->g:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Landroidx/fragment/app/d0;

    .line 16
    .line 17
    iget-object v0, v0, Landroidx/fragment/app/h0;->i:Landroidx/fragment/app/v0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-boolean v1, v0, Landroidx/fragment/app/u0;->E:Z

    .line 21
    .line 22
    iput-boolean v1, v0, Landroidx/fragment/app/u0;->F:Z

    .line 23
    .line 24
    iget-object v2, v0, Landroidx/fragment/app/u0;->L:Landroidx/fragment/app/w0;

    .line 25
    .line 26
    iput-boolean v1, v2, Landroidx/fragment/app/w0;->i:Z

    .line 27
    .line 28
    const/4 v1, 0x7

    .line 29
    invoke-virtual {v0, v1}, Landroidx/fragment/app/u0;->t(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/e0;->y:Landroidx/fragment/app/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/w;->a()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/q;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/e0;->y:Landroidx/fragment/app/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/w;->a()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Landroidx/fragment/app/e0;->B:Z

    .line 11
    .line 12
    iget-object v0, v0, Landroidx/fragment/app/w;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroidx/fragment/app/d0;

    .line 15
    .line 16
    iget-object v0, v0, Landroidx/fragment/app/h0;->i:Landroidx/fragment/app/v0;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/fragment/app/u0;->x(Z)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onStart()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/e0;->y:Landroidx/fragment/app/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/w;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Landroidx/fragment/app/w;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/fragment/app/d0;

    .line 9
    .line 10
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, p0, Landroidx/fragment/app/e0;->C:Z

    .line 15
    .line 16
    iget-boolean v2, p0, Landroidx/fragment/app/e0;->A:Z

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iput-boolean v3, p0, Landroidx/fragment/app/e0;->A:Z

    .line 22
    .line 23
    iget-object v2, v0, Landroidx/fragment/app/h0;->i:Landroidx/fragment/app/v0;

    .line 24
    .line 25
    iput-boolean v1, v2, Landroidx/fragment/app/u0;->E:Z

    .line 26
    .line 27
    iput-boolean v1, v2, Landroidx/fragment/app/u0;->F:Z

    .line 28
    .line 29
    iget-object v4, v2, Landroidx/fragment/app/u0;->L:Landroidx/fragment/app/w0;

    .line 30
    .line 31
    iput-boolean v1, v4, Landroidx/fragment/app/w0;->i:Z

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    invoke-virtual {v2, v4}, Landroidx/fragment/app/u0;->t(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v2, v0, Landroidx/fragment/app/h0;->i:Landroidx/fragment/app/v0;

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Landroidx/fragment/app/u0;->x(Z)Z

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Landroidx/fragment/app/e0;->z:Landroidx/lifecycle/v;

    .line 43
    .line 44
    sget-object v3, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Landroidx/lifecycle/v;->e(Landroidx/lifecycle/m;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, v0, Landroidx/fragment/app/h0;->i:Landroidx/fragment/app/v0;

    .line 50
    .line 51
    iput-boolean v1, v0, Landroidx/fragment/app/u0;->E:Z

    .line 52
    .line 53
    iput-boolean v1, v0, Landroidx/fragment/app/u0;->F:Z

    .line 54
    .line 55
    iget-object v2, v0, Landroidx/fragment/app/u0;->L:Landroidx/fragment/app/w0;

    .line 56
    .line 57
    iput-boolean v1, v2, Landroidx/fragment/app/w0;->i:Z

    .line 58
    .line 59
    const/4 v1, 0x5

    .line 60
    invoke-virtual {v0, v1}, Landroidx/fragment/app/u0;->t(I)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final onStateNotSaved()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/e0;->y:Landroidx/fragment/app/w;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/w;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onStop()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/e0;->C:Z

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/e0;->y:Landroidx/fragment/app/w;

    .line 8
    .line 9
    iget-object v2, v1, Landroidx/fragment/app/w;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Landroidx/fragment/app/d0;

    .line 12
    .line 13
    iget-object v2, v2, Landroidx/fragment/app/h0;->i:Landroidx/fragment/app/v0;

    .line 14
    .line 15
    invoke-static {v2}, Landroidx/fragment/app/e0;->t(Landroidx/fragment/app/u0;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iget-object v1, v1, Landroidx/fragment/app/w;->g:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Landroidx/fragment/app/d0;

    .line 24
    .line 25
    iget-object v1, v1, Landroidx/fragment/app/h0;->i:Landroidx/fragment/app/v0;

    .line 26
    .line 27
    iput-boolean v0, v1, Landroidx/fragment/app/u0;->F:Z

    .line 28
    .line 29
    iget-object v2, v1, Landroidx/fragment/app/u0;->L:Landroidx/fragment/app/w0;

    .line 30
    .line 31
    iput-boolean v0, v2, Landroidx/fragment/app/w0;->i:Z

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    invoke-virtual {v1, v0}, Landroidx/fragment/app/u0;->t(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Landroidx/fragment/app/e0;->z:Landroidx/lifecycle/v;

    .line 38
    .line 39
    sget-object v1, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroidx/lifecycle/v;->e(Landroidx/lifecycle/m;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
