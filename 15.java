class Lamp{

    boolean isOn=false;
   
    void switchOff(){
        isOn=false;
    }
    void switchOn(){
        isOn=true;
    }
    void showStatus(){

        System.out.println("is lamp on? " + isOn);
    }

    public static void main(String[] args) {
        Lamp lamp1=new Lamp();
        Lamp lamp2=new Lamp();
        lamp2.switchOff();
        lamp1.switchOn();
        lamp1.showStatus();
        lamp2.showStatus();
    }

}
