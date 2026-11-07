.class public final Lu1/h1;
.super Landroid/print/PrintDocumentAdapter;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"


# instance fields
.field public final a:Landroid/print/PrintDocumentAdapter;

.field public final synthetic b:Lu1/x;


# direct methods
.method public constructor <init>(Lu1/x;Landroid/print/PrintDocumentAdapter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu1/h1;->b:Lu1/x;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/print/PrintDocumentAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lu1/h1;->a:Landroid/print/PrintDocumentAdapter;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onFinish()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu1/h1;->a:Landroid/print/PrintDocumentAdapter;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/print/PrintDocumentAdapter;->onFinish()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lu1/h1;->b:Lu1/x;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-boolean v1, v0, Lu1/x;->a:Z

    .line 10
    .line 11
    return-void
.end method

.method public final onLayout(Landroid/print/PrintAttributes;Landroid/print/PrintAttributes;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$LayoutResultCallback;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lu1/h1;->a:Landroid/print/PrintDocumentAdapter;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move-object v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move-object v5, p5

    .line 8
    invoke-virtual/range {v0 .. v5}, Landroid/print/PrintDocumentAdapter;->onLayout(Landroid/print/PrintAttributes;Landroid/print/PrintAttributes;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$LayoutResultCallback;Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onStart()V
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/h1;->a:Landroid/print/PrintDocumentAdapter;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/print/PrintDocumentAdapter;->onStart()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onWrite([Landroid/print/PageRange;Landroid/os/ParcelFileDescriptor;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$WriteResultCallback;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu1/h1;->a:Landroid/print/PrintDocumentAdapter;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/print/PrintDocumentAdapter;->onWrite([Landroid/print/PageRange;Landroid/os/ParcelFileDescriptor;Landroid/os/CancellationSignal;Landroid/print/PrintDocumentAdapter$WriteResultCallback;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
