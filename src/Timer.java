public class Timer extends Thread{
    int time =10;
    static volatile boolean examFinished=false;

    @Override
    public void run(){
        try {
            while (time >= 0) {

                System.out.println("Time left: " + time);
                Thread.sleep(1000);
                time--;
            }
            examFinished=true;
            System.out.println("Times Up");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
