.class public final Landroidx/activity/c0;
.super Lr3/h;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lq3/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroidx/activity/j0;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/j0;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/c0;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/activity/c0;->h:Landroidx/activity/j0;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lr3/h;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/activity/c0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/activity/c0;->h:Landroidx/activity/j0;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/activity/j0;->d()V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lg3/g;->a:Lg3/g;

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    iget-object v0, p0, Landroidx/activity/c0;->h:Landroidx/activity/j0;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/activity/j0;->c()V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lg3/g;->a:Lg3/g;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    iget-object v0, p0, Landroidx/activity/c0;->h:Landroidx/activity/j0;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/activity/j0;->d()V

    .line 25
    .line 26
    .line 27
    sget-object v0, Lg3/g;->a:Lg3/g;

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
