package pl.sda;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String n, Author a, double p){
        this.name = n;
        this.author = a;
        this.price = p;
    }

    public Book(String n, Author a, double p, int q){
        this.name = n;
        this.author = a;
        this.price = p;
        this.qty = q;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double p){
        this.price = p;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int q){
        this.qty = q;
    }

    public String toString(){
        return "Book[name="+getName()+", "+author+", price: "+getPrice()+", qty="+getQty();
    }
}
