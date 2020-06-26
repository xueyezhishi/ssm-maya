package com.MS.queue;

public class QueueTest {
public static void main(String[] args) {
    Queue T = new Queue(5);
    System.out.println(T.delete());
    T.add(1);
    T.add(2);
    T.add(3);
    T.add(4);
    T.add(5);
    T.add(6); //队满
    System.out.println(T.delete());
    T.add(6);
    System.out.println(T.delete());
    System.out.println(T.delete());
    T.add(5);
    T.add(6);
    System.out.println(T.delete());
    System.out.println(T.delete());
    System.out.println(T.delete());
    System.out.println(T.delete());
    System.out.println(T.delete());
    System.out.println(T.delete());
}
}
