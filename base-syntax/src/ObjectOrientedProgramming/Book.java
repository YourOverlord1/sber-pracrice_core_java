package ObjectOrientedProgramming;

public class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        title = title;
        author = author;
        year = year;
    }
    public Book(){
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setYear(int year){
        this.year = year;
    }
}
