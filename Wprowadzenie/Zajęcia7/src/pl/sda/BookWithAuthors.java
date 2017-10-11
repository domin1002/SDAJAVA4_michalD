package pl.sda;

public class BookWithAuthors {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public BookWithAuthors(String n, Author[] a, double p){
        this.name = n;
        this.authors = a;
        this.price = p;
    }

    public BookWithAuthors(String n, Author[] a, double p, int q){
        this.name = n;
        this.authors = a;
        this.price = p;
        this.qty = q;
    }

    public String getName(){
        return name;
    }

    public Author[] getAuthors(){
       return authors;

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

    public String toString(){
        String names ="Book: "+name+", ";
        for(Author au: authors){
            names+=au+", ";
        }
        names += ", price= "+price+", qty="+qty;
        return names;
    }

    public String getAuthorNames(){
        String a="";
        for(Author b : authors){
            a += b.getName();
        }
        return a;
    }
    public String getNumber(Author[] autorzy){
        int male=0;
        int female=0;
        for(Author a : autorzy){
            if('m' == a.getGender()){
                male+=1;
            }
            else if('f' == a.getGender()){
                female+=1;
            }
        }
        return "Liczba autorów mężczyzn to: "+male+", liczba autorów kobiet to: "+female;
    }

}
