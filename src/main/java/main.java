public class main {
    public static void main(String[] args) {
        CreateContainer container = new CreateContainer();

        Object item;

        container.add("Item 1");
        container.add("Item 2");
        container.add("Item 3");

        System.out.println("Container size: " + container.size()); // Выводит "Container size: 3"

        item = container.get(1);
        System.out.println("Item at index 1: " + item); // Выводит "Item at index 1: Item 2"

        container.remove(1);
        System.out.println("Container size after removal: " + container.size()); // Выводит "Container size after removal: 2"

    }
}