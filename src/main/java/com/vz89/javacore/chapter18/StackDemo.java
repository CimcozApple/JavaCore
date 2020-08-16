package main.java.com.vz89.javacore.chapter18;

import java.util.EmptyStackException;
import java.util.Stack;

class StackDemo {
    static void showpush(Stack<Integer> st, int a) {
        st.push(a);
        System.out.println("push (" + a + ")");
        System.out.println("стек: " + st);
    }
    static void showpop(Stack<Integer> st) {
        System.out.println("pop ->");
        Integer a = st.pop();
        System.out.println(a);
        System.out.println("стек: " + st);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("Стек: " + st);

        showpush(st, 42);
        showpush(st, 62);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);

        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("стек пуст");
        }
    }

}
