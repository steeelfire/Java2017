package lesson170728;

public class X implements LongProtocol {

    private LongProtocol _y;

    public X(LongProtocol  y) {
        _y = y;
    }

    @Override
    public void a() {
        _y.a();
    }

    @Override
    public void b() {
        _y.b();
    }

    @Override
    public void c() {
        _y.c();
    }

    @Override
    public void d() {
        _y.d();
    }
}
