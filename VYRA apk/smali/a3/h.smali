.class public La3/h;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public a:La3/m;

.field public b:Lp2/a;

.field public c:Landroid/content/res/ColorStateList;

.field public d:Landroid/content/res/ColorStateList;

.field public e:Landroid/content/res/ColorStateList;

.field public f:Landroid/graphics/PorterDuff$Mode;

.field public g:Landroid/graphics/Rect;

.field public final h:F

.field public i:F

.field public j:F

.field public k:I

.field public l:F

.field public m:F

.field public n:I

.field public o:I

.field public final p:Landroid/graphics/Paint$Style;


# direct methods
.method public constructor <init>(La3/h;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, La3/h;->c:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    iput-object v0, p0, La3/h;->d:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iput-object v0, p0, La3/h;->e:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 12
    .line 13
    iput-object v1, p0, La3/h;->f:Landroid/graphics/PorterDuff$Mode;

    .line 14
    .line 15
    iput-object v0, p0, La3/h;->g:Landroid/graphics/Rect;

    .line 16
    .line 17
    const/high16 v0, 0x3f800000    # 1.0f

    .line 18
    .line 19
    iput v0, p0, La3/h;->h:F

    .line 20
    .line 21
    iput v0, p0, La3/h;->i:F

    .line 22
    .line 23
    const/16 v0, 0xff

    .line 24
    .line 25
    iput v0, p0, La3/h;->k:I

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iput v0, p0, La3/h;->l:F

    .line 29
    .line 30
    iput v0, p0, La3/h;->m:F

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput v0, p0, La3/h;->n:I

    .line 34
    .line 35
    iput v0, p0, La3/h;->o:I

    .line 36
    .line 37
    sget-object v0, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 38
    .line 39
    iput-object v0, p0, La3/h;->p:Landroid/graphics/Paint$Style;

    .line 40
    .line 41
    iget-object v0, p1, La3/h;->a:La3/m;

    .line 42
    .line 43
    iput-object v0, p0, La3/h;->a:La3/m;

    .line 44
    .line 45
    iget-object v0, p1, La3/h;->b:Lp2/a;

    .line 46
    .line 47
    iput-object v0, p0, La3/h;->b:Lp2/a;

    .line 48
    .line 49
    iget v0, p1, La3/h;->j:F

    .line 50
    .line 51
    iput v0, p0, La3/h;->j:F

    .line 52
    .line 53
    iget-object v0, p1, La3/h;->c:Landroid/content/res/ColorStateList;

    .line 54
    .line 55
    iput-object v0, p0, La3/h;->c:Landroid/content/res/ColorStateList;

    .line 56
    .line 57
    iget-object v0, p1, La3/h;->d:Landroid/content/res/ColorStateList;

    .line 58
    .line 59
    iput-object v0, p0, La3/h;->d:Landroid/content/res/ColorStateList;

    .line 60
    .line 61
    iget-object v0, p1, La3/h;->f:Landroid/graphics/PorterDuff$Mode;

    .line 62
    .line 63
    iput-object v0, p0, La3/h;->f:Landroid/graphics/PorterDuff$Mode;

    .line 64
    .line 65
    iget-object v0, p1, La3/h;->e:Landroid/content/res/ColorStateList;

    .line 66
    .line 67
    iput-object v0, p0, La3/h;->e:Landroid/content/res/ColorStateList;

    .line 68
    .line 69
    iget v0, p1, La3/h;->k:I

    .line 70
    .line 71
    iput v0, p0, La3/h;->k:I

    .line 72
    .line 73
    iget v0, p1, La3/h;->h:F

    .line 74
    .line 75
    iput v0, p0, La3/h;->h:F

    .line 76
    .line 77
    iget v0, p1, La3/h;->o:I

    .line 78
    .line 79
    iput v0, p0, La3/h;->o:I

    .line 80
    .line 81
    iget v0, p1, La3/h;->i:F

    .line 82
    .line 83
    iput v0, p0, La3/h;->i:F

    .line 84
    .line 85
    iget v0, p1, La3/h;->l:F

    .line 86
    .line 87
    iput v0, p0, La3/h;->l:F

    .line 88
    .line 89
    iget v0, p1, La3/h;->m:F

    .line 90
    .line 91
    iput v0, p0, La3/h;->m:F

    .line 92
    .line 93
    iget v0, p1, La3/h;->n:I

    .line 94
    .line 95
    iput v0, p0, La3/h;->n:I

    .line 96
    .line 97
    iget-object v0, p1, La3/h;->p:Landroid/graphics/Paint$Style;

    .line 98
    .line 99
    iput-object v0, p0, La3/h;->p:Landroid/graphics/Paint$Style;

    .line 100
    .line 101
    iget-object v0, p1, La3/h;->g:Landroid/graphics/Rect;

    .line 102
    .line 103
    if-eqz v0, :cond_0

    .line 104
    .line 105
    new-instance v0, Landroid/graphics/Rect;

    .line 106
    .line 107
    iget-object p1, p1, La3/h;->g:Landroid/graphics/Rect;

    .line 108
    .line 109
    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 110
    .line 111
    .line 112
    iput-object v0, p0, La3/h;->g:Landroid/graphics/Rect;

    .line 113
    .line 114
    :cond_0
    return-void
.end method

.method public constructor <init>(La3/m;)V
    .locals 2

    .line 115
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    .line 116
    iput-object v0, p0, La3/h;->c:Landroid/content/res/ColorStateList;

    .line 117
    iput-object v0, p0, La3/h;->d:Landroid/content/res/ColorStateList;

    .line 118
    iput-object v0, p0, La3/h;->e:Landroid/content/res/ColorStateList;

    .line 119
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, La3/h;->f:Landroid/graphics/PorterDuff$Mode;

    .line 120
    iput-object v0, p0, La3/h;->g:Landroid/graphics/Rect;

    const/high16 v1, 0x3f800000    # 1.0f

    .line 121
    iput v1, p0, La3/h;->h:F

    .line 122
    iput v1, p0, La3/h;->i:F

    const/16 v1, 0xff

    .line 123
    iput v1, p0, La3/h;->k:I

    const/4 v1, 0x0

    .line 124
    iput v1, p0, La3/h;->l:F

    .line 125
    iput v1, p0, La3/h;->m:F

    const/4 v1, 0x0

    .line 126
    iput v1, p0, La3/h;->n:I

    .line 127
    iput v1, p0, La3/h;->o:I

    .line 128
    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iput-object v1, p0, La3/h;->p:Landroid/graphics/Paint$Style;

    .line 129
    iput-object p1, p0, La3/h;->a:La3/m;

    .line 130
    iput-object v0, p0, La3/h;->b:Lp2/a;

    return-void
.end method


# virtual methods
.method public final getChangingConfigurations()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    new-instance v0, La3/j;

    .line 2
    .line 3
    invoke-direct {v0, p0}, La3/j;-><init>(La3/h;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, La3/j;->k:Z

    .line 8
    .line 9
    iput-boolean v1, v0, La3/j;->l:Z

    .line 10
    .line 11
    return-object v0
.end method
