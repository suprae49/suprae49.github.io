.class public final Ly3/b;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/util/Iterator;
.implements Ls3/a;


# instance fields
.field public f:I

.field public g:I

.field public h:I

.field public i:Lv3/b;

.field public final synthetic j:Lx3/l;


# direct methods
.method public constructor <init>(Lx3/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly3/b;->j:Lx3/l;

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, Ly3/b;->f:I

    .line 8
    .line 9
    iget-object p1, p1, Lx3/l;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Ljava/lang/CharSequence;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-ltz p1, :cond_1

    .line 18
    .line 19
    if-gez p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_0
    iput p1, p0, Ly3/b;->g:I

    .line 24
    .line 25
    iput p1, p0, Ly3/b;->h:I

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    const-string v0, "Cannot coerce value to an empty range: maximum "

    .line 29
    .line 30
    const-string v1, " is less than minimum 0."

    .line 31
    .line 32
    invoke-static {v0, p1, v1}, Landroidx/fragment/app/q;->k(Ljava/lang/String;ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-object v0, p0, Ly3/b;->j:Lx3/l;

    .line 2
    .line 3
    iget-object v1, v0, Lx3/l;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/lang/CharSequence;

    .line 6
    .line 7
    iget v2, p0, Ly3/b;->h:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-gez v2, :cond_0

    .line 11
    .line 12
    iput v3, p0, Ly3/b;->f:I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Ly3/b;->i:Lv3/b;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, -0x1

    .line 23
    const/4 v6, 0x1

    .line 24
    if-le v2, v4, :cond_1

    .line 25
    .line 26
    new-instance v0, Lv3/b;

    .line 27
    .line 28
    iget v2, p0, Ly3/b;->g:I

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    sub-int/2addr v1, v6

    .line 38
    invoke-direct {v0, v2, v1, v6}, Lv3/b;-><init>(III)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Ly3/b;->i:Lv3/b;

    .line 42
    .line 43
    iput v5, p0, Ly3/b;->h:I

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-object v0, v0, Lx3/l;->c:Lg3/a;

    .line 47
    .line 48
    check-cast v0, Ly3/i;

    .line 49
    .line 50
    iget v2, p0, Ly3/b;->h:I

    .line 51
    .line 52
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v0, v1, v2}, Ly3/i;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lg3/b;

    .line 61
    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    new-instance v0, Lv3/b;

    .line 65
    .line 66
    iget v2, p0, Ly3/b;->g:I

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    sub-int/2addr v1, v6

    .line 76
    invoke-direct {v0, v2, v1, v6}, Lv3/b;-><init>(III)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Ly3/b;->i:Lv3/b;

    .line 80
    .line 81
    iput v5, p0, Ly3/b;->h:I

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    iget-object v1, v0, Lg3/b;->f:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Ljava/lang/Number;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    iget-object v0, v0, Lg3/b;->g:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget v2, p0, Ly3/b;->g:I

    .line 101
    .line 102
    const/high16 v4, -0x80000000

    .line 103
    .line 104
    if-gt v1, v4, :cond_3

    .line 105
    .line 106
    sget-object v2, Lv3/b;->i:Lv3/b;

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_3
    new-instance v4, Lv3/b;

    .line 110
    .line 111
    add-int/lit8 v5, v1, -0x1

    .line 112
    .line 113
    invoke-direct {v4, v2, v5, v6}, Lv3/b;-><init>(III)V

    .line 114
    .line 115
    .line 116
    move-object v2, v4

    .line 117
    :goto_0
    iput-object v2, p0, Ly3/b;->i:Lv3/b;

    .line 118
    .line 119
    add-int/2addr v1, v0

    .line 120
    iput v1, p0, Ly3/b;->g:I

    .line 121
    .line 122
    if-nez v0, :cond_4

    .line 123
    .line 124
    move v3, v6

    .line 125
    :cond_4
    add-int/2addr v1, v3

    .line 126
    iput v1, p0, Ly3/b;->h:I

    .line 127
    .line 128
    :goto_1
    iput v6, p0, Ly3/b;->f:I

    .line 129
    .line 130
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Ly3/b;->f:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Ly3/b;->a()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget v0, p0, Ly3/b;->f:I

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    return v1

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ly3/b;->f:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Ly3/b;->a()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget v0, p0, Ly3/b;->f:I

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Ly3/b;->i:Lv3/b;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    iput-object v2, p0, Ly3/b;->i:Lv3/b;

    .line 20
    .line 21
    iput v1, p0, Ly3/b;->f:I

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 27
    .line 28
    .line 29
    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
