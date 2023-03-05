public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        System.out.println("List Status: " + (list.isEmpty() ? "Empty" : "Full"));
        System.out.println("Number of elements in array : " + list.size());
        System.out.println("Capacity of array: " + list.getCapacity());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Number of elements in array : " + list.size());
        System.out.println("Value at index 2 : " + list.getIndex(2));

        list.remove(2);

        System.out.println(list.toString());
        System.out.println("Number of elements in array: " + list.size());

        list.add(60);
        list.set(0, 100);

        System.out.println("Value at index 2 : " + list.getIndex(2));
        System.out.println("Number of elements in array : " + list.size());
        System.out.println("Capacity of array : " + list.getCapacity());

        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);

        System.out.println("List Status : " + (list.isEmpty() ? "Empty" : "Fill"));
        System.out.println(list.toString());
        System.out.println("Number of elements in array : " + list.size());
        System.out.println("Capacity of array : " + list.getCapacity());

        // Returns the first index found
        System.out.println("Index : " + list.indexOf(20));

        // Returns -1 if not found
        System.out.println("Index : " + list.indexOf(100));

        // Returns the last index found
        System.out.println("Index : " + list.lastIndexOf(20));

        // Returns the list as an Object[] array.
        Object[] arr = list.toArray();
        System.out.println("First element of Object array :" + arr[0]);

        // Created a sublist of list data type
        MyList<Integer> mySubList = list.subList(0, 3);
        System.out.println(mySubList.toString());

        // Queries whether the value is in the list
        System.out.println("value 20 in my list : " + list.contains(20));
        System.out.println("value 120 in my list : " + list.contains(120));

        // Empties the list completely and reverts it to its default size
        list.clear();
        System.out.println(list.toString());
    }
}