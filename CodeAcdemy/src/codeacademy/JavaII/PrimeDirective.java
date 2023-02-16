package codeacademy.JavaII;
import java.util.ArrayList;
class PrimeDirective {

    public static boolean isPrime(int number) {
        if(number == 2){
            return true;
        }else if (number < 2){
            return false;
        }
        // check divisibility here
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> onlyPrimes(int numbers[]){
        ArrayList<Integer> primes= new ArrayList<>();
        for(int number: numbers){
            if(isPrime(number)){
                primes.add(number);
            }
        }
        return primes;
    }


    public static void main(String[] args) {
        PrimeDirective pd = new PrimeDirective();
        System.out.println(isPrime(29));
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

    }

}
