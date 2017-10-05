package lesson170625.creation;

public class WholePicture {
    static class A{
        int i;
        int y = 10;
        final int z;

        {
            i = y + 30;
        }

        public A() {
            z = 30;
        }
    }
}
