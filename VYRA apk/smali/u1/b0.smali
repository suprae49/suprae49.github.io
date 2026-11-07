.class public final synthetic Lu1/b0;
.super Ljava/lang/Object;
.source "r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Landroid/webkit/JsResult;


# direct methods
.method public synthetic constructor <init>(Landroid/webkit/JsResult;I)V
    .locals 0

    .line 1
    iput p2, p0, Lu1/b0;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lu1/b0;->g:Landroid/webkit/JsResult;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    iget p1, p0, Lu1/b0;->f:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lu1/b0;->g:Landroid/webkit/JsResult;

    .line 7
    .line 8
    check-cast p1, Landroid/webkit/JsPromptResult;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/webkit/JsResult;->cancel()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p1, p0, Lu1/b0;->g:Landroid/webkit/JsResult;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/webkit/JsResult;->cancel()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    iget-object p1, p0, Lu1/b0;->g:Landroid/webkit/JsResult;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/webkit/JsResult;->confirm()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_2
    iget-object p1, p0, Lu1/b0;->g:Landroid/webkit/JsResult;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/webkit/JsResult;->confirm()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
