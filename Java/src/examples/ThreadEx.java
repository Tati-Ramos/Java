package examples;

//A code example where the value of the variable amount is unpredictable:
public class ThreadEx  extends Thread{
    public static int amount = 0;

    public static void main(String[] args) {
        ThreadEx thread = new ThreadEx();
        thread.start();

//        System.out.println(amount);
//        amount++;
//        System.out.println(amount);
//    }
//
//    public void run() {
//        amount++;
//    }

        // Wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    public void run() {
        amount++;
    }

}

/*

 */

/*
Concurrency Problems

Because threads run at the same time as other parts of the program, there is no way to know in which order
the code will run. When the threads and main program are reading and writing the same variables,
 the values are unpredictable. The problems that result from this are called concurrency problems.
 */

/*
To avoid concurrency problems, it is best to share as few attributes between threads as possible.
If attributes need to be shared, one possible solution is to use the isAlive() method of the thread
to check whether the thread has finished running before using any attributes that the thread can change.
*/