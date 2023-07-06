package main;

public class Threads {
        private int count;

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Count: " + count);
                count++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public static void main(String[] args) {
            Threads counter = new Threads();

            Thread thread1 = new Thread(counter.toString());
            Thread thread2 = new Thread(counter.toString());

            thread1.start();
            thread2.start();
        }
    }

}
