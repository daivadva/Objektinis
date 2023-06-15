import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Book book1 = new Book();
        book1.setTitle("Book1Title");
        book1.setPages(100);
        book1.setReleaseYear(2014);

        Book book2 = new Book();
        book2.setTitle("Book2Title");
        book2.setPages(150);
        book2.setReleaseYear(2015);

        Book book3 = new Book();
        book3.setTitle("Book3Title");
        book3.setPages(160);
        book3.setReleaseYear(2016);

        Book book4 = new Book("Book4Title", 250, 2015);

        Book book5 = new Book ("Book5Title", 399, 2016);

        Book book6 = new Book ("Book6Title", 300, 2020);

//        System.out.println(book1.getTitle() + ", " + book1.getPages() + ", " + book1.getReleaseYear());
//        System.out.println(book2.getTitle() + ", " + book2.getPages() + ", " + book2.getReleaseYear());
//        System.out.println(book3.getTitle() + ", " + book3.getPages() + ", " + book3.getReleaseYear());
//        System.out.println(book4.getTitle() + ", " + book4.getPages() + ", " + book4.getReleaseYear());
//        System.out.println(book5.getTitle() + ", " + book5.getPages() + ", " + book5.getReleaseYear());
//        System.out.println(book6.getTitle() + ", " + book6.getPages() + ", " + book6.getReleaseYear());

        ArrayList<Book> knygynas = new ArrayList<>();
        knygynas.add(book1);
        knygynas.add(book2);
        knygynas.add(book3);
        knygynas.add(book4);
        knygynas.add(book5);
        knygynas.add(book6);

        for (int i = 0; i < knygynas.size(); i++) {
            System.out.println(knygynas.get(i).getTitle() + ", " +knygynas.get(i).getPages() + ", " +knygynas.get(i).getReleaseYear());
        }



    }


}