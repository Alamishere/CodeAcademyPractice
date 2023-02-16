package codeacademy.JavaI;//this needs a redo

public class Droid {
    int batteryLevel;
    String name;
    public Droid(String droidName){
        batteryLevel=100;

    }

    public String toString() {
        return "Hello, I’m the droid:";
    }

    public void performTask(String task){

    }

    public static void main(String [] args){
        Droid newDroid = new Droid("Codey");
        System.out.println(newDroid);

    }
}
