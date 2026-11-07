.class public final Lk1/f1;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final d:Lo0/c;


# instance fields
.field public a:I

.field public b:Lk1/g0;

.field public c:Lk1/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lo0/c;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lo0/c;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lk1/f1;->d:Lo0/c;

    .line 9
    .line 10
    return-void
.end method

.method public static a()Lk1/f1;
    .locals 1

    .line 1
    sget-object v0, Lk1/f1;->d:Lo0/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lo0/c;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lk1/f1;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lk1/f1;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object v0
.end method
