package tom;


public class Stack implements StackInterface {
    private Object[] elements;
    private int size = 0;


    public Object push(Object item) {
        elements[size++] = item;
        return item;
    }

    public Object pop() {
        Object item = peek();
        elements[--size] = null;
        return item;
    }

    public Object peek() {
        return elements[size - 1];
    }

    public int size() {
        return size;
    }

}