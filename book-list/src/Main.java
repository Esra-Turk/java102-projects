import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Kürk Mantolu Madonna","Sabahattin Ali",160,1913));
        bookList.add(new Book("Hayvan Çiftliği","George Orwell",152,1945));
        bookList.add(new Book("Satranç","Stefan Zweig",83,1940));
        bookList.add(new Book("Küçük Prens","Antoine de Saint-Exupéry",112,1943));
        bookList.add(new Book("Şeker Portakalı","Posé Mauro de Vasconcelos",184,1968));
        bookList.add(new Book("Dönüşüm","Franz Kafka",74,1915));
        bookList.add(new Book("Simyacı","Paula Coelho",188,1988));
        bookList.add(new Book("Bilinmeyen Bir Kadının Mektubu","Stefan Zweig",68,1922));
        bookList.add(new Book("İnsan Neyle Yaşar","Lev",96,1913));
        bookList.add(new Book("Kuyucaklı Yusuf","Sabahattin Ali",222,1937));

        //Using the stream structure and lambda expressions, a new Map<String, String> was created with the author name opposite the book name.
        Map<String,String> map = new HashMap<>();
        bookList.forEach(book -> map.put(book.getBookName(), book.getAuthorName()));
        map.forEach((name,author) -> System.out.println("Book: " + name + " | Author: " + author));
        System.out.println();

        //filter books with more than 100 pages from the 10-item Book list and create a new list.
        bookList.stream().filter(book -> book.getPageNumber() > 100)
                        .toList().forEach(book -> System.out.println(book.getBookName() + " page number: " + book.getPageNumber()));

    }
}