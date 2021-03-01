package ru.netology;

public class Main {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("Group");
        Thread myThread1 = new MyThread(threadGroup, "Поток 1");
        Thread myThread2 = new MyThread(threadGroup, "Поток 2");
        Thread myThread3 = new MyThread(threadGroup, "Поток 3");
        Thread myThread4 = new MyThread(threadGroup, "Поток 4");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException ex) {
        }
        threadGroup.interrupt();
    }
}
