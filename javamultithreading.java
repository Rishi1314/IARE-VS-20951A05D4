

// public class javamultithreading extends Thread {
//     public void run() {
//         System.out.println("Current Thread Name: " + Thread.currentThread().getName());
//         System.out.println("Current Thread ID: " + Thread.currentThread().getId());
//     }
//     public javamultithreading(String x){
//         System.out.println(x);
//     }

//     public static void main(String[] args) throws InterruptedException {
//         javamultithreading t1 = new javamultithreading("A");
//         javamultithreading t2 = new javamultithreading("B");
//         javamultithreading t3 = new javamultithreading("C");
//         t1.start();
//         t1.join();
//         t2.start();
//         t2.join();
//         t3.start();

//     }
// }


public class javamultithreading implements Runnable{
    public void run() {
        System.out.println("Current Thread Name: " + Thread.currentThread().getName());
        System.out.println("Current Thread ID: " + Thread.currentThread().getId());
    }
    public javamultithreading(String x){
        System.out.println(x);
    }

    public static void main(String[] args)
    {
          // Runnable target
        javamultithreading t = new javamultithreading("ckubcikb");
        
          // create threads
        Thread t1 = new Thread(t, "First Thread");
        Thread t2 = new Thread(t, "Second Thread");
            
          // start threads
        t1.start();
        t2.start();
    }
}
