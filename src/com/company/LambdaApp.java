package com.company;

@FunctionalInterface
interface Cab{//When an (I) has ONLY 1 abs meth, it is considered Functional
    //void bookCab();// -> by default public abstract void bookCab();
    //void bookCab(String source, String destination);// -> by default public abstract void bookCab();
    double bookCab(String source, String destination);
}

/*class UberX implements Cab{
    @Override
    public void bookCab() {
        System.out.println("UberX. Arriving Soon! ");
    }
}*/

public class LambdaApp {
    int instanceVar = 10;
    static int sVar = 100;
    public static void main(String[] args) {

        /*Cab cab = new UberX(); //Polymorph as oppose to UberX uber = new UberX();?
	    cab.bookCab();*/

        //Anonymous Class Implementation
        /*Cab cab = new Cab() {
            @Override
            public void bookCab() {
                System.out.println("UberX. Arriving Soon! ");
            }
        }
        cab.bookCab();*/


        double fare = cab.bookCab("Austell,Ga ", "Lithonia,Ga");
        System.out.println("Fare Shall be :$" +fare);
    }
    //3.
    //Using a Lambda Expression --works w/--> F(n) I
    Cab cab =(source, destination)->{
        int localVar = 1000;
        System.out.println("UberX booked from " + source + "to " + destination + ". Arriving Soon! ");
        System.out.println("Local Var is: " +localVar);
        System.out.println("sVar is" +LambdaApp.sVar);
        return 48.75;
    };
}
