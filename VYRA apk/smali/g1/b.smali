.class public Lg1/b;
.super Landroidx/lifecycle/p0;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# static fields
.field public static final e:La3/f;


# instance fields
.field public final d:Lp/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La3/f;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, La3/f;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lg1/b;->e:La3/f;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/p0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lp/l;

    .line 5
    .line 6
    invoke-direct {v0}, Lp/l;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lg1/b;->d:Lp/l;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, Lg1/b;->d:Lp/l;

    .line 2
    .line 3
    iget v1, v0, Lp/l;->h:I

    .line 4
    .line 5
    iget-object v2, v0, Lp/l;->g:[Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-gtz v1, :cond_1

    .line 9
    .line 10
    move v4, v3

    .line 11
    :goto_0
    if-ge v4, v1, :cond_0

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    aput-object v5, v2, v4

    .line 15
    .line 16
    add-int/lit8 v4, v4, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iput v3, v0, Lp/l;->h:I

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    aget-object v0, v2, v3

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {}, Landroidx/fragment/app/q;->c()V

    .line 28
    .line 29
    .line 30
    return-void
.end method
