.class public final La3/e;
.super Le4/a;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# virtual methods
.method public final w(La3/y;FF)V
    .locals 3

    .line 1
    mul-float/2addr p3, p2

    .line 2
    const/high16 p2, 0x43340000    # 180.0f

    .line 3
    .line 4
    const/high16 v0, 0x42b40000    # 90.0f

    .line 5
    .line 6
    invoke-virtual {p1, p3, p2, v0}, La3/y;->d(FFF)V

    .line 7
    .line 8
    .line 9
    float-to-double v0, v0

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    float-to-double p2, p3

    .line 19
    mul-double/2addr v0, p2

    .line 20
    double-to-float v0, v0

    .line 21
    const/4 v1, 0x0

    .line 22
    float-to-double v1, v1

    .line 23
    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    mul-double/2addr v1, p2

    .line 32
    double-to-float p2, v1

    .line 33
    invoke-virtual {p1, v0, p2}, La3/y;->c(FF)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
