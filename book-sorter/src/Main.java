import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> tSet = new TreeSet<>();

        TreeSet<Book> tSet2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNum() - o2.getPageNum();
            }
        });

        Book b1 = new Book(100,"The House of Mirth","Edith Wharton",1905);
        Book b2 = new Book(120,"East of Eden","John Steinbeck",1952);
        Book b3 = new Book(130,"Brave New World","Aldous Huxley",1910);
        Book b4 = new Book(145,"Pale Fire","Vladımır Nabokov",1980);
        Book b5 = new Book(300,"In Cold Blood","Truman Capote",1990);

        tSet.add(b1);
        tSet.add(b2);
        tSet.add(b3);
        tSet.add(b4);
        tSet.add(b5);

        System.out.println("----Alphabetical Order----");
        for (Book b: tSet) {
            System.out.println(b.getName());
        }

        tSet2.addAll(tSet);

        System.out.println("----Order of Page Number----");
        for (Book b: tSet2) {
            System.out.println(b.getPageNum() + " page -> " + b.getName());
        }
    }
}
