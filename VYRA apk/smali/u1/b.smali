.class public final synthetic Lu1/b;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic f:Ljava/util/ArrayList;

.field public final synthetic g:Lu1/e;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Lu1/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu1/b;->f:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object p2, p0, Lu1/b;->g:Lu1/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lu1/b;->f:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lorg/json/JSONObject;

    .line 8
    .line 9
    const-string p2, "system"

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const-string p3, "url"

    .line 16
    .line 17
    invoke-virtual {p1, p3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    invoke-static {p2}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-eqz p3, :cond_6

    .line 28
    .line 29
    :cond_0
    if-eqz p2, :cond_6

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    const p4, -0x36059a58    # -2051253.0f

    .line 36
    .line 37
    .line 38
    if-eq p3, p4, :cond_4

    .line 39
    .line 40
    const p4, 0x6854fdf

    .line 41
    .line 42
    .line 43
    if-eq p3, p4, :cond_3

    .line 44
    .line 45
    const p4, 0x40b292db

    .line 46
    .line 47
    .line 48
    if-eq p3, p4, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const-string p3, "refresh"

    .line 52
    .line 53
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-nez p2, :cond_2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move-object p1, p3

    .line 61
    goto :goto_0

    .line 62
    :cond_3
    const-string p3, "share"

    .line 63
    .line 64
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-nez p2, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    const-string p3, "search"

    .line 72
    .line 73
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-nez p2, :cond_5

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_5
    const-string p1, "ActionManager"

    .line 81
    .line 82
    const-string p2, "setupOverflowMenu: The \"search\" system menu is not supported on the custom overflow menu yet."

    .line 83
    .line 84
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    const-string p1, ""

    .line 88
    .line 89
    :cond_6
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, Ly3/j;->w(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    iget-object p3, p0, Lu1/b;->g:Lu1/e;

    .line 97
    .line 98
    if-nez p2, :cond_7

    .line 99
    .line 100
    invoke-virtual {p3, p1}, Lu1/e;->b(Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    :cond_7
    iget-object p1, p3, Lu1/e;->p:Landroid/widget/PopupWindow;

    .line 104
    .line 105
    if-eqz p1, :cond_8

    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 108
    .line 109
    .line 110
    :cond_8
    return-void
.end method
