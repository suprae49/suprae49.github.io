.class public final Ld3/g;
.super La3/h;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final q:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(La3/o;Landroid/graphics/RectF;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, La3/h;-><init>(La3/m;)V

    .line 10
    iput-object p2, p0, Ld3/g;->q:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Ld3/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, La3/h;-><init>(La3/h;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Ld3/g;->q:Landroid/graphics/RectF;

    .line 5
    .line 6
    iput-object p1, p0, Ld3/g;->q:Landroid/graphics/RectF;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    new-instance v0, Ld3/h;

    .line 2
    .line 3
    invoke-direct {v0, p0}, La3/j;-><init>(La3/h;)V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Ld3/h;->M:Ld3/g;

    .line 7
    .line 8
    invoke-virtual {v0}, La3/j;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
