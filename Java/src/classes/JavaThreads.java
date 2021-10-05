package classes;

//If the class extends the Thread class,
// the thread can be run by creating an instance of the class and call its start() method:

public class JavaThreads extends Thread {

    public static void main(String[] args) {
        JavaThreads thread = new JavaThreads();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }

}


/*
Java Threads
Threads allows a program to operate more efficiently by doing multiple things at the same time.

Threads can be used to perform complicated tasks in the background without interrupting the main program.
 */

/*
Creating a Thread

There are two ways to create a thread.

It can be created by extending the Thread class and overriding its run() method:

Extend Syntax

public class Main extends Thread {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}

Another way to create a thread is to implement the Runnable interface:

Implement Syntax

public class Main implements Runnable {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
 */

/*
Differences between "extending" and "implementing" Threads

The major difference is that when a class extends the Thread class, you cannot extend any other class,
 but by implementing the Runnable interface, it is possible to extend from another class as well, like:
 class MyClass extends OtherClass implements Runnable.


 */