import java.util.Arrays;

public class TestBook {
    //GABRIEL KENJI UTIYAMA CB3012069
    public static void main(String[] args){
        Author[] authors = new Author[2];
        authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
        authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');
        Book testeBook = new Book("Java for Dummy", authors, 19.99, 99);
        Book testeBook1 = new Book("Java for Dummy", authors, 19.99);
        System.out.println(testeBook);
        System.out.println(testeBook1);

        System.out.println(testeBook.getName());
        System.out.println(testeBook1.getName());

        System.out.println(Arrays.toString(testeBook.getAuthor()));
        System.out.println(Arrays.toString(testeBook1.getAuthor()));

        System.out.println(testeBook.getQty());
        System.out.println(testeBook1.getQty());

        System.out.println(testeBook.getPrice());
        System.out.println(testeBook1.getPrice());

        System.out.println(testeBook.getAuthorsNames());
        System.out.println(testeBook1.getAuthorsNames());
    }
}
