.class public final synthetic Ly3/i;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lq3/p;


# instance fields
.field public final synthetic f:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly3/i;->f:Ljava/util/List;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, Ljava/lang/CharSequence;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Ly3/i;->f:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x1

    .line 20
    const/4 v4, 0x0

    .line 21
    if-ne v1, v3, :cond_4

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    if-ne v1, v3, :cond_2

    .line 30
    .line 31
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/String;

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    invoke-static {p1, v0, p2, v1}, Ly3/j;->v(Ljava/lang/CharSequence;Ljava/lang/String;II)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-gez p1, :cond_1

    .line 43
    .line 44
    :cond_0
    :goto_0
    move-object p2, v4

    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance p2, Lg3/b;

    .line 52
    .line 53
    invoke-direct {p2, p1, v0}, Lg3/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :cond_2
    const-string p1, "List has more than one element."

    .line 59
    .line 60
    invoke-static {p1}, Landroidx/fragment/app/q;->q(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    return-object p1

    .line 65
    :cond_3
    new-instance p1, Ljava/util/NoSuchElementException;

    .line 66
    .line 67
    const-string p2, "List is empty."

    .line 68
    .line 69
    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1

    .line 73
    :cond_4
    new-instance v1, Lv3/b;

    .line 74
    .line 75
    if-gez p2, :cond_5

    .line 76
    .line 77
    move p2, v2

    .line 78
    :cond_5
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    invoke-direct {v1, p2, v5, v3}, Lv3/b;-><init>(III)V

    .line 83
    .line 84
    .line 85
    instance-of v3, p1, Ljava/lang/String;

    .line 86
    .line 87
    iget v1, v1, Lv3/b;->g:I

    .line 88
    .line 89
    if-eqz v3, :cond_a

    .line 90
    .line 91
    if-le p2, v1, :cond_6

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_6
    :goto_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    :cond_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-eqz v5, :cond_8

    .line 103
    .line 104
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    move-object v6, v5

    .line 109
    check-cast v6, Ljava/lang/String;

    .line 110
    .line 111
    move-object v7, p1

    .line 112
    check-cast v7, Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    invoke-virtual {v6, v2, v7, p2, v8}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    if-eqz v6, :cond_7

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_8
    move-object v5, v4

    .line 126
    :goto_2
    check-cast v5, Ljava/lang/String;

    .line 127
    .line 128
    if-eqz v5, :cond_9

    .line 129
    .line 130
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    new-instance p2, Lg3/b;

    .line 135
    .line 136
    invoke-direct {p2, p1, v5}, Lg3/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_9
    if-eq p2, v1, :cond_0

    .line 141
    .line 142
    add-int/lit8 p2, p2, 0x1

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_a
    if-le p2, v1, :cond_b

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_b
    :goto_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    :cond_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_d

    .line 157
    .line 158
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    move-object v6, v5

    .line 163
    check-cast v6, Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    invoke-static {v6, p1, p2, v7, v2}, Ly3/j;->x(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZ)Z

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    if-eqz v6, :cond_c

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_d
    move-object v5, v4

    .line 177
    :goto_4
    check-cast v5, Ljava/lang/String;

    .line 178
    .line 179
    if-eqz v5, :cond_e

    .line 180
    .line 181
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    new-instance p2, Lg3/b;

    .line 186
    .line 187
    invoke-direct {p2, p1, v5}, Lg3/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_e
    if-eq p2, v1, :cond_0

    .line 192
    .line 193
    add-int/lit8 p2, p2, 0x1

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :goto_5
    if-eqz p2, :cond_f

    .line 197
    .line 198
    iget-object p1, p2, Lg3/b;->f:Ljava/lang/Object;

    .line 199
    .line 200
    iget-object p2, p2, Lg3/b;->g:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast p2, Ljava/lang/String;

    .line 203
    .line 204
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 205
    .line 206
    .line 207
    move-result p2

    .line 208
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    new-instance v0, Lg3/b;

    .line 213
    .line 214
    invoke-direct {v0, p1, p2}, Lg3/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    return-object v0

    .line 218
    :cond_f
    return-object v4
.end method
