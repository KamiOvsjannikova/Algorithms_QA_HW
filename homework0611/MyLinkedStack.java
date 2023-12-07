package org.example.homework0611;
//Написать собственную реализацию стека на основе связного списка - класс CustomLinkedStack. Класс хранит данные типа String.
// Структура данных должна обладать следующими методами, работающими согласно требованиям по алгоритмической сложности:
//public void push(String element) (Добавить элемент в стек) --- O(1)
//public String pop() (Извлечь и удалить элемент из стека) --- O(1)
//public String peek() (Извлечь, не удаляя элемент из стека) --- O(1)
//public boolean isEmpty() --- O(1)
//public int size() --- O(1)
//public int search(int element) (Определяет, существует ли объект в стеке.
//        Если элемент найден, возвращает позицию элемента с вершины стека. В противном случае он возвращает -1) --- O(n)
public class MyLinkedStack {
    private Node top;
    private int size;

    private class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(String element) { // O(1)
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public String pop() { // O(1)
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        String result = top.data;
        top = top.next;
        size--;
        return result;
    }

    public String peek() { // O(1)
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return top.data;
    }

    public boolean isEmpty() { // O(1)
        return size == 0;
    }

    public int size() { // O(1)
        return size;
    }

    public int search(String element) { // O(n)
        Node current = top;
        int position = 0;
        while (current != null) {
            if (current.data.equals(element)) {
                return position;
            }
            current = current.next;
            position++;
        }
        return -1;
    }

    public static void main(String[] args) {
        MyLinkedStack stack = new MyLinkedStack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");

        System.out.println("Search 5: " + stack.search("5"));
        System.out.println("Search 1: " + stack.search("1"));
        System.out.println("Search 10: " + stack.search("10"));
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
