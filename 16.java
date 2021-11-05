class Rectangles{
    double a;
    double b;

    void displayDimensions(){
        System.out.println(a+" x "+b); 
    }
    
    void showPerimeter(){
        double perim=2*a+2*b;
        System.out.println("Perimeter: "+perim);
    }

    void showArea(){
        System.out.println("Area: "+a*b);

    }
    public static void main(String[] args) {
        Rectangles rec1 = new Rectangles();
        rec1.a=3;
        rec1.b=2;
        rec1.displayDimensions();
        rec1.showPerimeter();
        rec1.showArea();
    }

}
