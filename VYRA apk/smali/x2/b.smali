.class public final Lx2/b;
.super Le0/b;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic h:Lt1/l;

.field public final synthetic i:Lx2/d;


# direct methods
.method public constructor <init>(Lx2/d;Lt1/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx2/b;->i:Lx2/d;

    .line 5
    .line 6
    iput-object p2, p0, Lx2/b;->h:Lt1/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final h(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx2/b;->i:Lx2/d;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, v0, Lx2/d;->n:Z

    .line 5
    .line 6
    iget-object v0, p0, Lx2/b;->h:Lt1/l;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lt1/l;->l(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final i(Landroid/graphics/Typeface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx2/b;->i:Lx2/d;

    .line 2
    .line 3
    iget v1, v0, Lx2/d;->d:I

    .line 4
    .line 5
    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, v0, Lx2/d;->p:Landroid/graphics/Typeface;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, v0, Lx2/d;->n:Z

    .line 13
    .line 14
    iget-object v0, p0, Lx2/b;->h:Lt1/l;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, p1, v1}, Lt1/l;->m(Landroid/graphics/Typeface;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
