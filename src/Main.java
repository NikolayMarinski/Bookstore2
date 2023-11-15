import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int bookNumber = sc.nextInt();
        for (int i = 0; i < bookNumber; i++) {
            String type = sc.nextLine();
            BookType t = BookType.valueOf(type);
            Book book;
            switch (t) {
                case CHILDREN_BOOK:
                    book = new ChildrenBook();
                    break;

                case COMIC_BOOK:
                    book = new ComicBook();
                    break;

                default:
                    book = new Book();
            }
            System.out.println("Title : ");
            book.setTitle(sc.nextLine());

            Author author = new Author();

            System.out.println("Author name: ");
            author.setName(sc.nextLine());
            System.out.println("Author age: ");
            author.setAge(sc.nextInt());
            book.setAuthor(author);

            //TODO : Set availability and price
        }

        for (int i = 0; i < bookNumber; i = i + 2) {
            //TODO : do the sell method d
        }
    }
}