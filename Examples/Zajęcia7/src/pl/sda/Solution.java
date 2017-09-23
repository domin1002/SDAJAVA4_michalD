package pl.sda;

public class Solution{
    public static void main(String[] args){
        Author author1 = new Author("Michał Dominiak", "xxxx", 'm');


        String adresEmail = "michaldominiak@gmail.com";
        author1.setEmail(adresEmail);

        System.out.println(author1);

        Book book = new Book("Java podstawy", author1, 99, 1);

        System.out.println(book);

        Author[] authors = new Author[]{
                new Author("Adam Wożniak", "wożniak@wp.pl", 'm'),
                new Author("Wojciech Kowalski","kowalski@wp.pl", 'm')
        };

        BookWithAuthors bookWithAuthors = new BookWithAuthors("Java4all", authors, 35, 1);
        System.out.println(bookWithAuthors);
        System.out.println(bookWithAuthors.getNumber(authors));

    }
}
