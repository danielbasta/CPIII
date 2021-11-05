class Books {
  String title;
  String color;
  String author;
  double price;
  int page=0;

  void displayBookInfo(){
    System.out.println(title+" "+color+" "+author+" "+price);
  }

  void nextPage(){
    this.page++;

  }

  void displayPage(){
    System.out.println("Page: "+page);    

  }
  public static void main(String[] args) {
      Books b1 = new Books();
      book1.title="MW2";
      book1.color="black";
      book1.author="Daniel";
      book1.price=119,95;

      b1.displayBookInfo();
      b1.displayPage();
      b1.nextPage();
      b1.displayPage();
  }
  }
