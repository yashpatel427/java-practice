public class Book{

    String name ;
    int page ;

    public Book(String name, int page) {
        this.name = name;
        this.page = page;
    }

    String displayInfo(){
       return this.name + " (" + this.page + ")";
    }
}