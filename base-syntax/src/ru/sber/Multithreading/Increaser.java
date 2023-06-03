package ru.sber.Multithreading;

public class Increaser extends Thread {
    private ResourceProcessor processor;

    public Increaser(ResourceProcessor processor) {
        this.processor = processor;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            processor.increase();
        }
    }
}
