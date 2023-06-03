package ru.sber.Multithreading;
public class Main {
    public static void main(String[] args) {
        Resource resource = new Resource(0);
        ResourceProcessor processor = new ResourceProcessor(resource);

        Decreaser decreaser = new Decreaser(processor);
        Thread decreaserThread = new Thread(decreaser);
        decreaserThread.start();

        for (int i = 0; i < 100; i++) {
            synchronized (processor) {
                try {
                    while (processor.getValue() < 5) {
                        processor.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                processor.decrease();
                processor.notifyAll();
            }

            synchronized (processor) {
                try {
                    while (processor.getValue() > 0 && processor.getValue() < 1) {
                        processor.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                processor.increase();
                processor.notifyAll();
            }
        }
    }
}