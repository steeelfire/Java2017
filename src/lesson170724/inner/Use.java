package lesson170724.inner;

public class Use {
    public static void main(String[] args) {
        StaticExamples.X x = new StaticExamples.X();

        InnerExamples innerExamples = new InnerExamples();

        InnerExamples.Processor processor = innerExamples.new Processor();
        processor.process();
    }
}
