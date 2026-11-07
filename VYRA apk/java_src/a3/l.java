package a3;

/* JADX INFO: compiled from: r8-map-id-aefec9452575bf3ce628382b7406055789804c2b29c30cc55857652ccdc8c5e1 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends e4.a {
    @Override // e4.a
    public final void w(y yVar, float f, float f4) {
        float f5 = f4 * f;
        yVar.d(f5, 180.0f, 90.0f);
        float f6 = f5 * 2.0f;
        u uVar = new u(0.0f, 0.0f, f6, f6);
        uVar.f = 180.0f;
        uVar.f157g = 90.0f;
        yVar.f.add(uVar);
        s sVar = new s(uVar);
        yVar.a(180.0f);
        yVar.f168g.add(sVar);
        yVar.f166d = 270.0f;
        float f7 = (0.0f + f6) * 0.5f;
        float f8 = (f6 - 0.0f) / 2.0f;
        double d5 = 270.0f;
        yVar.f164b = (((float) Math.cos(Math.toRadians(d5))) * f8) + f7;
        yVar.f165c = (f8 * ((float) Math.sin(Math.toRadians(d5)))) + f7;
    }
}
