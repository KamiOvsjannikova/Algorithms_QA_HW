package org.example.homework2911;
//Имеется класс RandomizedQueue (см. код в репозитории). Это тип очереди, из которой данные извлекаются в случайном порядке.
// Проанализировать класс и провести оценку эффективности методов RandomizedQueue с ростом числа элементов в очереди
// асимптотическим и амортизированным анализом:
// is the randomized queue empty?
import java.util.Iterator;
import java.util.NoSuchElementException;

public class RandomizedQueue {
//    public boolean isEmpty() {
//        return realNumberOfItems == 0;
//    } // O(1) - просто проверка условия.
//
//    // return the number of items on the randomized queue
//    public int size() {
//        return realNumberOfItems;
//    } //  O(1) - просто проверка условия.
//
//    // add the item
//    public void enqueue(Item item) {
//        if (item == null) throw new NullPointerException();
//        if (numberOfItems == 0) resize(1);
//        else if (numberOfItems == itemArray.length) resize(2 * itemArray.length);
//        itemArray[numberOfItems++] = item;
//        realNumberOfItems++; //O(1) амортизировано, т.к можно  добавить элемент в массив. Если размер массива изменяется,то реальное время увелич.
//        //O(N) - в худшем случае, где N - текущее количество элементов, если массив заполнился, и требуется увеличение его размера.
//
//
//        // remove and return a random item
//        public Item dequeue () {
//            if (realNumberOfItems > 0) {
//                RandomOutput randomOutput = new RandomOutput(itemArray, numberOfItems).get();
//                itemArray[randomOutput.randomIndex] = null;
//                if (--realNumberOfItems == itemArray.length / 4) resize(itemArray.length / 2);
//                return randomOutput.randomItem;
//            } else {
//                throw new NoSuchElementException();
//            }
//        }
////O(1) амортизировано, т.к. удаляю элемент из массива. Если размер массива изменяется,то реальное время увелич.
//// O(N) - в худшем случае, где N - текущее количество элементов, если массив заполнился, и требуется уменьшение его размера.
//
//        // return a random item (but do not remove it)
//        public Item sample () {
//            if (realNumberOfItems > 0) {
//                RandomOutput randomOutput = new RandomOutput(itemArray, numberOfItems).get();
//                return randomOutput.randomItem;
//            } else {
//                throw new NoSuchElementException();
//            }
//        }
//        //O(1) - просто возвращает случайный элемент без его удаления.
//
//        // return an independent iterator over items in random order
////        public Iterator<Item> iterator () {
////            return new Iterator<Item>() {
////                private Item[] copy = getRandomCopy(itemArray, numberOfItems, realNumberOfItems);
////                private int copyNumberOfItems = copy.length;
////
////                @Override
////                public boolean hasNext() {
////                    return copyNumberOfItems > 0;
////                }
////
////                @Override
////                public Item next() {
////                    if (copyNumberOfItems == 0) throw new NoSuchElementException();
////                    return copy[--copyNumberOfItems];
//                }
//            }; // O(N) - создание итератора, где N - текущее количество элементов. Итератор создает копию массива и перемешивает ее. Нужно доп.место.
//        }
//    }
}
