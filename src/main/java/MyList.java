public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int minCapacity;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public boolean add(E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
        return true;
    }



    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        if (index >= 0 && index <= size) {
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;

        } else {
            System.out.println("Index out of size");
            throw new IndexOutOfBoundsException("massage0");

        }
    }

    public E remove(int index) {
        E result = (E) elements[index];
        if (index >= 0 && index <= size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            elements[size] = null;
            size--;
        } else {
            System.out.println("Index out of size");
            throw new IndexOutOfBoundsException("massage1");

        }

        return (E) result;
    }

    public int getSize() {
        return size;
    }

    public E get(int index) {
        return (E) elements[index];

    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        Object[] copyElement = new Object[newSize];
        for (int i = 0; i < size; i++) {
            copyElement[i] = elements[i];
        }
        elements = copyElement;
    }

    public E[] clone() {
        return (E[]) elements;
    }

    public boolean contains(E o) {
        for (Object e : elements) {
            if (e== o){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o){
        for (int i =0;i<size;i++) {
            if (elements[i]== o){
                return i;
            }
        }
        return -1;

    }

    public void ensureCapacity(int minCapacity){

    }

    public void clear(){
        for (Object o:elements){
            o=null;
        }
        size=0;
    }
}
