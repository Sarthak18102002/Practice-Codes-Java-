package MultiThreading;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Example extends Thread {
    @Override
    public void run() {
      for (int i = 0; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(" Exception Found ");
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) throws InterruptedException
    {
        Example e=new Example();
        Example e1=new Example();
        e.start();
        e.join();
        System.out.println(" Sarthak ");
        e1.start();


    }
}
