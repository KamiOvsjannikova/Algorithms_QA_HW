package org.example.homework2211;

import java.util.Iterator;
    public class CustomDynamicArray implements Iterable<Integer> {
        private int[] array;
        private int size;
        private int capacity;

        public CustomDynamicArray() {
            capacity = 10;
            array = new int[capacity];
            size = 0;
        }

        public void add(int data) {
            if (size >= capacity) {
                expandSize();
            }
            array[size++] = data;
        }

        private void expandSize() {
            capacity *= 2;
            int[] newArray = new int[capacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        public void removeAt(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index is out of bounds");
            }
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }

        public void shrinkSize() {
            int newCapacity = size;
            int[] newArray = new int[newCapacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
            capacity = newCapacity;
        }

        public void set(int index, int data) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index is out of bounds");
            }
            array[index] = data;
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index is out of bounds");
            }
            return array[index];
        }

        public void clear() {
            size = 0;
        }

        public boolean contains(int data) {
            for (int i = 0; i < size; i++) {
                if (array[i] == data) {
                    return true;
                }
            }
            return false;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new ArrayIterator();
        }

        private class ArrayIterator implements Iterator<Integer> {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                return array[currentIndex++];
            }
        }
    }

