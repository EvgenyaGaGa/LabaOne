

/**
 * Класс контейнер, позволяющий хранить произвольное количество объектов.
 * Позволяет добавлять, извлекать и удалять элементы.
 * @autor Toloknova Evgenia
 */
public class CreateContainer {
    /** массив для хранения входных данных */
    private Object[] array;
    /** поле с размером массива */
    private int size;

    /** константная начальная размерность массива */
    private final int DEFAULT_CAPACITY = 10;

    /**
     * Дефолтный конструктор класса без параметров
     * @autor Toloknova Evgenia
     * */
    public CreateContainer() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Добавление элемента в контейнер
     * @param elem добавляемый элемент
     * @autor Toloknova Evgenia
     * */
    public void add(Object elem) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }

        array[size] = elem;
        size++;
    }



    /**
     * Извлечение элемента из контейнера по индексу
     * @param index  позиция искомого элемента
     * @throws IndexOutOfBoundsException
     * @autor Toloknova Evgenia
     * */
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        return array[index];
    }



    /**
     * Удаление элемента из контейнера по индексу
     * @param index  позиция искомого элемента
     * @throws IndexOutOfBoundsException
     * @autor Toloknova Evgenia
     * */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[size - 1] = null;
        size--;
    }

    /**
     * @return size размер
     * */
    public int size() {
        return size;
    }


}




