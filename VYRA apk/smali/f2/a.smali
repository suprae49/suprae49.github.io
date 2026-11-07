.class public final Lf2/a;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lf2/a;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lf2/a;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget p1, p0, Lf2/a;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lf2/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroidx/appcompat/widget/e;

    .line 9
    .line 10
    iget-object p2, p1, Landroidx/appcompat/widget/e;->u:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 11
    .line 12
    iget-object p3, p1, Landroidx/appcompat/widget/e;->C:Landroid/view/View;

    .line 13
    .line 14
    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result p4

    .line 18
    const/4 p5, 0x1

    .line 19
    if-le p4, p5, :cond_3

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p4

    .line 25
    invoke-virtual {p4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object p4

    .line 29
    iget-object p6, p1, Landroidx/appcompat/widget/e;->w:Landroid/view/View;

    .line 30
    .line 31
    invoke-virtual {p6}, Landroid/view/View;->getPaddingLeft()I

    .line 32
    .line 33
    .line 34
    move-result p6

    .line 35
    new-instance p7, Landroid/graphics/Rect;

    .line 36
    .line 37
    invoke-direct {p7}, Landroid/graphics/Rect;-><init>()V

    .line 38
    .line 39
    .line 40
    sget-boolean p8, Lk/p3;->a:Z

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 43
    .line 44
    .line 45
    move-result p8

    .line 46
    const/4 p9, 0x0

    .line 47
    if-ne p8, p5, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move p5, p9

    .line 51
    :goto_0
    iget-boolean p1, p1, Landroidx/appcompat/widget/e;->S:Z

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    const p1, 0x7f070029

    .line 56
    .line 57
    .line 58
    invoke-virtual {p4, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    const p8, 0x7f07002a

    .line 63
    .line 64
    .line 65
    invoke-virtual {p4, p8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 66
    .line 67
    .line 68
    move-result p4

    .line 69
    add-int p9, p4, p1

    .line 70
    .line 71
    :cond_1
    invoke-virtual {p2}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1, p7}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 76
    .line 77
    .line 78
    iget p1, p7, Landroid/graphics/Rect;->left:I

    .line 79
    .line 80
    if-eqz p5, :cond_2

    .line 81
    .line 82
    neg-int p1, p1

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    add-int/2addr p1, p9

    .line 85
    sub-int p1, p6, p1

    .line 86
    .line 87
    :goto_1
    invoke-virtual {p2, p1}, Landroid/widget/AutoCompleteTextView;->setDropDownHorizontalOffset(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    iget p3, p7, Landroid/graphics/Rect;->left:I

    .line 95
    .line 96
    add-int/2addr p1, p3

    .line 97
    iget p3, p7, Landroid/graphics/Rect;->right:I

    .line 98
    .line 99
    add-int/2addr p1, p3

    .line 100
    add-int/2addr p1, p9

    .line 101
    sub-int/2addr p1, p6

    .line 102
    invoke-virtual {p2, p1}, Landroid/widget/AutoCompleteTextView;->setDropDownWidth(I)V

    .line 103
    .line 104
    .line 105
    :cond_3
    return-void

    .line 106
    :pswitch_0
    const/4 p1, 0x0

    .line 107
    throw p1

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
