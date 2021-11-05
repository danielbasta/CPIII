class Counter {

    int value;

    void inc(){
        value++;
    }

    void dec(){
        value--;
    }

    void incTen(){
        value+=10;
    }
    
    void decTen(){
        value-=10;
    }
    void reset(){
        value=10;
    }
    
    public static void main(String[] args) {
        Counter c1= new Counter();
        Counter c2= new Counter();
        c1.incTen();
        c1.inc();
        c1.inc(); 
        c2.decTen();
        c2.decTen();
        c2.decTen();
        c2.inc();
        c2.inc();
        c2.incTen();
        System.out.println(c2.value);  
    }

}
