package ru.sber.ObjectOrientedProgramming;

public class MainBookAuthor {
    public static void main(String[] args){
        Book book1 = new Book();
        book1.setTitle("Капитанская дочка");
        book1.setAuthor("А.С.Пушкин");
        book1.setYear(1836);

        Author author1 = new Author();
        author1.setName("Ф.М Достоевский");
        author1.setSex("Мужской");
        author1.setEmail("fmdostoevskiy217@gmail.com");

        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getYear());

        System.out.println(author1.getName());
        System.out.println(author1.getSex());
        System.out.println(author1.getEmail());
    }
}
