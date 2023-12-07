package org.example.homework2911;
//Реализовать метод search() у написанной на занятии очереди CustomArrayQueue (см. код в репозитории).
//public int search(int element) -  определяет, существует ли объект в очереди.
//  Если элемент найден, возвращает позицию элемента с вершины стека. В противном случае он возвращает -1.

public class CustomArrayQueueHW2911 {

    private int[] data;
    private int tail;
    private int head;
    private int count;

    public CustomArrayQueueHW2911(int capacity) {
        data = new int[capacity];
        count = 0;
        head = -1;
        tail = -1;
    }

    public void enqueue(int element) { // O(1)
        if (count >= data.length) throw new RuntimeException("Queue is full");
        if (++tail == data.length) tail = 0;
        data[tail] = element;
        if (head == -1) head++;
        count++;
    }

    public int dequeue() { // O(1)
        if (count == 0) throw new RuntimeException("Queue is empty");
        int result = data[head];
        if (++head == data.length) head = 0;
        if (--count == 0) {
            head = -1;
            tail = -1;
        }
        return result;
    }

    public int search(int element) { // TODO
            if (count == 0) {
                return -1; // Очередь пуста, элемент не найден
            }

            int currentPosition = 0; // текущая позиция элемента в цикле
            int currentPosFromTop = count - 1; //позиция элемента относительно вершины стека
            int currentIdx = head;//начинает с головы очереди и двигаемся вправо

            while (currentPosition < count) {
                if (data[currentIdx] == element) {
                    return currentPosFromTop;
                }

                currentIdx = (currentIdx + 1) % data.length;
                currentPosition++;
                currentPosFromTop--;
            }

            return -1; // Элемент не найден
        }

    public static void main(String[] args) {
        CustomArrayQueueHW2911 queue = new CustomArrayQueueHW2911(5);
    }
}