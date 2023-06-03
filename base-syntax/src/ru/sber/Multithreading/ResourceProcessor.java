package ru.sber.Multithreading;

public class ResourceProcessor {
    private Resource resource;
    private int value;

    public ResourceProcessor(Resource resource) {
        this.resource = resource;
    }

    public synchronized void increase() {
        while (resource.getValue() < 5) {
            resource.setValue(resource.getValue() + 1);
            System.out.println("Increased to " + resource.getValue());
        }
    }

    public synchronized void decrease() {
        while (resource.getValue() > 0 && resource.getValue() <= 1) {
            resource.setValue(resource.getValue() - 1);
            System.out.println("Decreased to " + resource.getValue());
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
