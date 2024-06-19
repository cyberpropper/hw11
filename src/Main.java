public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Сергей", "Лукьяненко");
        Author author2 = new Author("Ирвин", "Уэлш");

        Book book1 = new Book("Лабиринт отрожений", author1, 1997);
        Book book2 = new Book("Кошмары аиста Марабу", author2, 1996);

        book2.setPublicationYear(1995);

        System.out.println(book1);
        System.out.println(book2);
    }
}



