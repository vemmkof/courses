package mx.com.vemm.lambda;

public class RunnableLambda {

    private Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable 1");
        }
    };

    private Runnable runnable2 = () -> System.out.println("Runnable 2");

    public Runnable getRunnable1() {
        return runnable1;
    }

    public Runnable getRunnable2() {
        return runnable2;
    }
}
