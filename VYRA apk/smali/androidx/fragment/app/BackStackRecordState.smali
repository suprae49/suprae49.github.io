.class final Landroidx/fragment/app/BackStackRecordState;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "BanParcelableUsage"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/fragment/app/BackStackRecordState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:[I

.field public final g:Ljava/util/ArrayList;

.field public final h:[I

.field public final i:[I

.field public final j:I

.field public final k:Ljava/lang/String;

.field public final l:I

.field public final m:I

.field public final n:Ljava/lang/CharSequence;

.field public final o:I

.field public final p:Ljava/lang/CharSequence;

.field public final q:Ljava/util/ArrayList;

.field public final r:Ljava/util/ArrayList;

.field public final s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/fragment/app/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/fragment/app/b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/fragment/app/BackStackRecordState;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 172
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->f:[I

    .line 173
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->g:Ljava/util/ArrayList;

    .line 174
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->h:[I

    .line 175
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->i:[I

    .line 176
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/BackStackRecordState;->j:I

    .line 177
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->k:Ljava/lang/String;

    .line 178
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/BackStackRecordState;->l:I

    .line 179
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/BackStackRecordState;->m:I

    .line 180
    sget-object v0, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    iput-object v1, p0, Landroidx/fragment/app/BackStackRecordState;->n:Ljava/lang/CharSequence;

    .line 181
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, p0, Landroidx/fragment/app/BackStackRecordState;->o:I

    .line 182
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->p:Ljava/lang/CharSequence;

    .line 183
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->q:Ljava/util/ArrayList;

    .line 184
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->r:Ljava/util/ArrayList;

    .line 185
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Landroidx/fragment/app/BackStackRecordState;->s:Z

    return-void
.end method

.method public constructor <init>(Landroidx/fragment/app/a;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Landroidx/fragment/app/c1;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    mul-int/lit8 v1, v0, 0x6

    .line 11
    .line 12
    new-array v1, v1, [I

    .line 13
    .line 14
    iput-object v1, p0, Landroidx/fragment/app/BackStackRecordState;->f:[I

    .line 15
    .line 16
    iget-boolean v1, p1, Landroidx/fragment/app/c1;->g:Z

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Landroidx/fragment/app/BackStackRecordState;->g:Ljava/util/ArrayList;

    .line 26
    .line 27
    new-array v1, v0, [I

    .line 28
    .line 29
    iput-object v1, p0, Landroidx/fragment/app/BackStackRecordState;->h:[I

    .line 30
    .line 31
    new-array v1, v0, [I

    .line 32
    .line 33
    iput-object v1, p0, Landroidx/fragment/app/BackStackRecordState;->i:[I

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    move v2, v1

    .line 37
    :goto_0
    if-ge v1, v0, :cond_1

    .line 38
    .line 39
    iget-object v3, p1, Landroidx/fragment/app/c1;->a:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Landroidx/fragment/app/b1;

    .line 46
    .line 47
    iget-object v4, p0, Landroidx/fragment/app/BackStackRecordState;->f:[I

    .line 48
    .line 49
    add-int/lit8 v5, v2, 0x1

    .line 50
    .line 51
    iget v6, v3, Landroidx/fragment/app/b1;->a:I

    .line 52
    .line 53
    aput v6, v4, v2

    .line 54
    .line 55
    iget-object v4, p0, Landroidx/fragment/app/BackStackRecordState;->g:Ljava/util/ArrayList;

    .line 56
    .line 57
    iget-object v6, v3, Landroidx/fragment/app/b1;->b:Landroidx/fragment/app/Fragment;

    .line 58
    .line 59
    if-eqz v6, :cond_0

    .line 60
    .line 61
    iget-object v6, v6, Landroidx/fragment/app/Fragment;->mWho:Ljava/lang/String;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_0
    const/4 v6, 0x0

    .line 65
    :goto_1
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    iget-object v4, p0, Landroidx/fragment/app/BackStackRecordState;->f:[I

    .line 69
    .line 70
    add-int/lit8 v6, v2, 0x2

    .line 71
    .line 72
    iget-boolean v7, v3, Landroidx/fragment/app/b1;->c:Z

    .line 73
    .line 74
    aput v7, v4, v5

    .line 75
    .line 76
    add-int/lit8 v5, v2, 0x3

    .line 77
    .line 78
    iget v7, v3, Landroidx/fragment/app/b1;->d:I

    .line 79
    .line 80
    aput v7, v4, v6

    .line 81
    .line 82
    add-int/lit8 v6, v2, 0x4

    .line 83
    .line 84
    iget v7, v3, Landroidx/fragment/app/b1;->e:I

    .line 85
    .line 86
    aput v7, v4, v5

    .line 87
    .line 88
    add-int/lit8 v5, v2, 0x5

    .line 89
    .line 90
    iget v7, v3, Landroidx/fragment/app/b1;->f:I

    .line 91
    .line 92
    aput v7, v4, v6

    .line 93
    .line 94
    add-int/lit8 v2, v2, 0x6

    .line 95
    .line 96
    iget v6, v3, Landroidx/fragment/app/b1;->g:I

    .line 97
    .line 98
    aput v6, v4, v5

    .line 99
    .line 100
    iget-object v4, p0, Landroidx/fragment/app/BackStackRecordState;->h:[I

    .line 101
    .line 102
    iget-object v5, v3, Landroidx/fragment/app/b1;->h:Landroidx/lifecycle/n;

    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    aput v5, v4, v1

    .line 109
    .line 110
    iget-object v4, p0, Landroidx/fragment/app/BackStackRecordState;->i:[I

    .line 111
    .line 112
    iget-object v3, v3, Landroidx/fragment/app/b1;->i:Landroidx/lifecycle/n;

    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    aput v3, v4, v1

    .line 119
    .line 120
    add-int/lit8 v1, v1, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_1
    iget v0, p1, Landroidx/fragment/app/c1;->f:I

    .line 124
    .line 125
    iput v0, p0, Landroidx/fragment/app/BackStackRecordState;->j:I

    .line 126
    .line 127
    iget-object v0, p1, Landroidx/fragment/app/c1;->h:Ljava/lang/String;

    .line 128
    .line 129
    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->k:Ljava/lang/String;

    .line 130
    .line 131
    iget v0, p1, Landroidx/fragment/app/a;->r:I

    .line 132
    .line 133
    iput v0, p0, Landroidx/fragment/app/BackStackRecordState;->l:I

    .line 134
    .line 135
    iget v0, p1, Landroidx/fragment/app/c1;->i:I

    .line 136
    .line 137
    iput v0, p0, Landroidx/fragment/app/BackStackRecordState;->m:I

    .line 138
    .line 139
    iget-object v0, p1, Landroidx/fragment/app/c1;->j:Ljava/lang/CharSequence;

    .line 140
    .line 141
    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->n:Ljava/lang/CharSequence;

    .line 142
    .line 143
    iget v0, p1, Landroidx/fragment/app/c1;->k:I

    .line 144
    .line 145
    iput v0, p0, Landroidx/fragment/app/BackStackRecordState;->o:I

    .line 146
    .line 147
    iget-object v0, p1, Landroidx/fragment/app/c1;->l:Ljava/lang/CharSequence;

    .line 148
    .line 149
    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->p:Ljava/lang/CharSequence;

    .line 150
    .line 151
    iget-object v0, p1, Landroidx/fragment/app/c1;->m:Ljava/util/ArrayList;

    .line 152
    .line 153
    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->q:Ljava/util/ArrayList;

    .line 154
    .line 155
    iget-object v0, p1, Landroidx/fragment/app/c1;->n:Ljava/util/ArrayList;

    .line 156
    .line 157
    iput-object v0, p0, Landroidx/fragment/app/BackStackRecordState;->r:Ljava/util/ArrayList;

    .line 158
    .line 159
    iget-boolean p1, p1, Landroidx/fragment/app/c1;->o:Z

    .line 160
    .line 161
    iput-boolean p1, p0, Landroidx/fragment/app/BackStackRecordState;->s:Z

    .line 162
    .line 163
    return-void

    .line 164
    :cond_2
    const-string p1, "Not on back stack"

    .line 165
    .line 166
    invoke-static {p1}, Landroidx/fragment/app/q;->j(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const/4 p1, 0x0

    .line 170
    throw p1
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->f:[I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->g:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->h:[I

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->i:[I

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 19
    .line 20
    .line 21
    iget p2, p0, Landroidx/fragment/app/BackStackRecordState;->j:I

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->k:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget p2, p0, Landroidx/fragment/app/BackStackRecordState;->l:I

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 34
    .line 35
    .line 36
    iget p2, p0, Landroidx/fragment/app/BackStackRecordState;->m:I

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 39
    .line 40
    .line 41
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->n:Ljava/lang/CharSequence;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-static {p2, p1, v0}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 45
    .line 46
    .line 47
    iget p2, p0, Landroidx/fragment/app/BackStackRecordState;->o:I

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->p:Ljava/lang/CharSequence;

    .line 53
    .line 54
    invoke-static {p2, p1, v0}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->q:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p0, Landroidx/fragment/app/BackStackRecordState;->r:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 65
    .line 66
    .line 67
    iget-boolean p2, p0, Landroidx/fragment/app/BackStackRecordState;->s:Z

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 70
    .line 71
    .line 72
    return-void
.end method
