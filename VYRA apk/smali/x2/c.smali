.class public final Lx2/c;
.super Lt1/l;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:Landroid/text/TextPaint;

.field public final synthetic i:Lt1/l;

.field public final synthetic j:Lx2/d;


# direct methods
.method public constructor <init>(Lx2/d;Landroid/content/Context;Landroid/text/TextPaint;Lt1/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx2/c;->j:Lx2/d;

    .line 5
    .line 6
    iput-object p2, p0, Lx2/c;->g:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lx2/c;->h:Landroid/text/TextPaint;

    .line 9
    .line 10
    iput-object p4, p0, Lx2/c;->i:Lt1/l;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final l(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/c;->i:Lt1/l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lt1/l;->l(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final m(Landroid/graphics/Typeface;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lx2/c;->g:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lx2/c;->h:Landroid/text/TextPaint;

    .line 4
    .line 5
    iget-object v2, p0, Lx2/c;->j:Lx2/d;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1, p1}, Lx2/d;->f(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lx2/c;->i:Lt1/l;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Lt1/l;->m(Landroid/graphics/Typeface;Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
