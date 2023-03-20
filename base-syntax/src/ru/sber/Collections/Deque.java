package ru.sber.Collections;
import java.util.NoSuchElementException;
public interface Deque {
    void addFirst(Object item);
    void addLast(Object item);
    Object getFirst() throws NoSuchElementException;
    Object getLast() throws NoSuchElementException;
    Object pollFirst();
    Object pollLast();
    Object removeFirst() throws NoSuchElementException;
    Object removeLast() throws NoSuchElementException;
}

