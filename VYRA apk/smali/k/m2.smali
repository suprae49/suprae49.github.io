.class public final Lk/m2;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Landroidx/appcompat/widget/e;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/widget/e;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk/m2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lk/m2;->g:Landroidx/appcompat/widget/e;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lk/m2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk/m2;->g:Landroidx/appcompat/widget/e;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/appcompat/widget/e;->U:Lu0/b;

    .line 9
    .line 10
    instance-of v1, v0, Lk/x2;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Lu0/b;->b(Landroid/database/Cursor;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void

    .line 19
    :pswitch_0
    iget-object v0, p0, Lk/m2;->g:Landroidx/appcompat/widget/e;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/appcompat/widget/e;->s()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
