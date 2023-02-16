package codeacademy.JavaI;

class Coffee{

    public Coffee(){
    }

    public void stir(){
        String stirring = "Stirring the coffee!";
    }

    public static void main(String[] args){
        Coffee myCup = new Coffee();
        myCup.stir();
        //System.out.println(stirring);
    }


}