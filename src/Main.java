public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Сергей", "Лукьяненко");
        Author author2 = new Author("Ирвин", "Уэлш");

        Book book1 = new Book("Лабиринт отрожений", author1, 1997);
        Book book2 = new Book("Кошмары аиста Марабу", author2, 1996);

        book2.setPublicationYear(1995);

        System.out.println(book1.getTitle() + " - " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", год " + book1.getPublicationYear());
        System.out.println(book2.getTitle() + " - " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", год " + book2.getPublicationYear());
    }
}

class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}

