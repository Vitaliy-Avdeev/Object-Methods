public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Author author1 = new Author("Вячеслав", "Лем");
        Author author2 = new Author("Федор", "Достоевский");

        Book bookName1 = new Book("Солярис", author1, 1961);
        Book bookName2 = new Book("Идиот", author2, 1868);
        bookName1.setYearPublication(1960);


        System.out.println(" Автор - " + author1.getFirstName() + " " + author1.getLastName() + " , название книги - " + bookName1.getTitle() + ", год публикации - " + bookName1.getYearPublication());
        System.out.println(" Автор - " + author2.getFirstName() + " " + author2.getLastName() + " , название книги - " + bookName2.getTitle() + ", год публикации - " + bookName2.getYearPublication());

        System.out.println(bookName1);
        System.out.println(bookName2);

        System.out.println(bookName1.equals(bookName2));

        System.out.println(bookName1.hashCode());
        System.out.println(bookName2.hashCode());


    }

}

