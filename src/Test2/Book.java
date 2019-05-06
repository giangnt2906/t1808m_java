package Test2;

public class Book {
    public Integer id;
    public String bname;
    public String author;
    public Double price;

    public Book(Integer id, String name, String author, Double price) {
        this.id = id;
        this.bname = name;
        this.author = author;
        this.price = price;
    }

    public Book() {
    }

    public Book(String bname, String author, Double price) {
        this.bname = bname;
        this.author = author;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
