.class public final synthetic Lb4/q;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lq3/p;


# instance fields
.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb4/q;->f:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lb4/q;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    check-cast p2, Li3/e;

    .line 12
    .line 13
    return-object p1

    .line 14
    :pswitch_0
    check-cast p1, Li3/g;

    .line 15
    .line 16
    check-cast p2, Li3/e;

    .line 17
    .line 18
    invoke-interface {p1, p2}, Li3/g;->b(Li3/g;)Li3/g;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_1
    check-cast p1, Li3/g;

    .line 24
    .line 25
    check-cast p2, Li3/e;

    .line 26
    .line 27
    invoke-interface {p1, p2}, Li3/g;->b(Li3/g;)Li3/g;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :pswitch_2
    check-cast p1, Li3/g;

    .line 33
    .line 34
    check-cast p2, Li3/e;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-interface {p2}, Li3/e;->getKey()Li3/f;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {p1, v0}, Li3/g;->f(Li3/f;)Li3/g;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    sget-object v0, Li3/h;->f:Li3/h;

    .line 48
    .line 49
    if-ne p1, v0, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    sget-object v1, Li3/d;->f:Li3/d;

    .line 53
    .line 54
    invoke-interface {p1, v1}, Li3/g;->a(Li3/f;)Li3/e;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Lz3/h;

    .line 59
    .line 60
    if-nez v2, :cond_1

    .line 61
    .line 62
    new-instance v0, Li3/b;

    .line 63
    .line 64
    invoke-direct {v0, p2, p1}, Li3/b;-><init>(Li3/e;Li3/g;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    move-object p2, v0

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-interface {p1, v1}, Li3/g;->f(Li3/f;)Li3/g;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v0, :cond_2

    .line 74
    .line 75
    new-instance p1, Li3/b;

    .line 76
    .line 77
    invoke-direct {p1, v2, p2}, Li3/b;-><init>(Li3/e;Li3/g;)V

    .line 78
    .line 79
    .line 80
    move-object p2, p1

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    new-instance v0, Li3/b;

    .line 83
    .line 84
    new-instance v1, Li3/b;

    .line 85
    .line 86
    invoke-direct {v1, p2, p1}, Li3/b;-><init>(Li3/e;Li3/g;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {v0, v2, v1}, Li3/b;-><init>(Li3/e;Li3/g;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :goto_1
    return-object p2

    .line 94
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 95
    .line 96
    check-cast p2, Li3/e;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_3

    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    goto :goto_2

    .line 112
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string p1, ", "

    .line 121
    .line 122
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    :goto_2
    return-object p1

    .line 133
    :pswitch_4
    check-cast p1, Lb4/s;

    .line 134
    .line 135
    check-cast p2, Li3/e;

    .line 136
    .line 137
    return-object p1

    .line 138
    :pswitch_5
    if-nez p1, :cond_4

    .line 139
    .line 140
    check-cast p2, Li3/e;

    .line 141
    .line 142
    :goto_3
    const/4 p1, 0x0

    .line 143
    goto :goto_4

    .line 144
    :cond_4
    invoke-static {}, Landroidx/fragment/app/q;->c()V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :goto_4
    return-object p1

    .line 149
    :pswitch_6
    check-cast p2, Li3/e;

    .line 150
    .line 151
    return-object p1

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
