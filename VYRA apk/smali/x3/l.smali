.class public final Lx3/l;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Lx3/g;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Lg3/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ly3/i;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lx3/l;->a:I

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lx3/l;->b:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, p0, Lx3/l;->c:Lg3/a;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lx3/g;Lq3/l;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lx3/l;->a:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/l;->b:Ljava/lang/Object;

    iput-object p2, p0, Lx3/l;->c:Lg3/a;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, Lx3/l;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ly3/b;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Ly3/b;-><init>(Lx3/l;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lx3/k;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lx3/k;-><init>(Lx3/l;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
