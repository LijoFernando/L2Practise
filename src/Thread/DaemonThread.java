package Thread;

//For example, the HotJava browser uses up to four daemon threads named "Image Fetcher" to fetch images from the file system or network for any thread that needs one.
//
//        Daemon threads are typically used to perform services for your application/applet (such as loading the "fiddley bits"). The core difference between user threads and daemon threads is that the JVM will only shut down a program when all user threads have terminated. Daemon threads are terminated by the JVM when there are no longer any user threads running, including the main thread of execution.
//
//        setDaemon(true/false) ? This method is used to specify that a thread is daemon thread.
//
//public boolean isDaemon() ? This method is used to determine the thread is daemon thread or

public class DaemonThread extends Thread {
    public void run() {
        System.out.println("Entering run method");

        try {
            System.out.println("In run Method: currentThread() is" + Thread.currentThread());

            while (true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException x) {
                }

                System.out.println("In run method: woke up again");
            }
        } finally {
            System.out.println("Leaving run Method");
        }
    }

    public static void main(String[] args) {
        System.out.println("Entering main Method");

        DaemonThread t = new DaemonThread();
        t.setDaemon(true);
        t.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException x) {
        }

        System.out.println("Leaving main method");
    }

}

