package demo_package;

public class Threadimp extends Thread{
    public static int amount = 0;
    public static void main(String [] arg) {
    	Threadimp t= new Threadimp();
    	t.start();
    	amount++;
    	System.out.println(amount+"outside");
    }
    public void run() {
    	amount++;
    	System.out.println(amount+"inside");
    }
}
