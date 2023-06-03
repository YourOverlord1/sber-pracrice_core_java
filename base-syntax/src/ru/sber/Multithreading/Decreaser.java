package ru.sber.Multithreading;

public class Decreaser implements Runnable {
    private ResourceProcessor processor;

    public Decreaser(ResourceProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (processor) {
                try {
                    while (processor.getValue() > 0 && processor.getValue() < 1) {
                        processor.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (processor.getValue() == 0) {
                    processor.increase();
                } else if (processor.getValue() >= 5) {
                    processor.decrease();
                }
            }
        }
    }
}