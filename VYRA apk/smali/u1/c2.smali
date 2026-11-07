.class public final Lu1/c2;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lx1/i;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lu1/e2;


# direct methods
.method public synthetic constructor <init>(Lu1/e2;Lx1/i;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p4, p0, Lu1/c2;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lu1/c2;->i:Lu1/e2;

    .line 4
    .line 5
    iput-object p2, p0, Lu1/c2;->g:Lx1/i;

    .line 6
    .line 7
    iput-object p3, p0, Lu1/c2;->h:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lu1/c2;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu1/c2;->i:Lu1/e2;

    .line 7
    .line 8
    iget-object v0, v0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object v3, p0, Lu1/c2;->g:Lx1/i;

    .line 13
    .line 14
    invoke-virtual {v0, v3, v1, v2}, Lco/median/android/MainActivity;->r0(Lx1/i;ZZ)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lu1/c2;->h:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lco/median/android/MainActivity;->x(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iget-object v0, p0, Lu1/c2;->i:Lu1/e2;

    .line 24
    .line 25
    iget-object v0, v0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    const/4 v2, 0x0

    .line 29
    iget-object v3, p0, Lu1/c2;->g:Lx1/i;

    .line 30
    .line 31
    invoke-virtual {v0, v3, v1, v2}, Lco/median/android/MainActivity;->r0(Lx1/i;ZZ)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lu1/c2;->h:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lco/median/android/MainActivity;->x(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    iget-object v0, p0, Lu1/c2;->i:Lu1/e2;

    .line 41
    .line 42
    iget-object v0, v0, Lu1/e2;->a:Lco/median/android/MainActivity;

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    const/4 v2, 0x0

    .line 46
    iget-object v3, p0, Lu1/c2;->g:Lx1/i;

    .line 47
    .line 48
    invoke-virtual {v0, v3, v1, v2}, Lco/median/android/MainActivity;->r0(Lx1/i;ZZ)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lu1/c2;->h:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lco/median/android/MainActivity;->x(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
