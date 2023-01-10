public class Thread1 extends Thread {


    public static void main(String[] args) {

        Thread1 t = new Thread1();
        t.start();
        for (int i = 0; i <= 200; i++) {
            System.out.println("i->" + i + "\t");
        }
    }

    public void run() {
        for (int j = 0; j <= 200; j++) {
            System.out.println("j->" + j + "\t");
        }
    }
}