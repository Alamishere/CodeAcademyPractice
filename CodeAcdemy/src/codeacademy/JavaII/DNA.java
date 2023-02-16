package codeacademy.JavaII;

public class DNA {

        public static void main(String args[])
        {
            String dna1= "ATGCGATACGCTTGA";
            String dna2="ATGCGATACGTGA";
            String dna3="ATTAATATGTACTGA";
            String dna = dna2;
            //String dna= dna1.concat(dna2.concat(dna3));
            System.out.println("Length: "+ dna.length());

            //find start codon:
            int start = dna.indexOf("ATG");
            System.out.println("Start: " + start);

            // Find stop codon:
            int stop = dna.indexOf("TGA");
            System.out.println("Stop: " + stop);

            if(start != -1 && stop != -1 && (stop - start) % 3 == 0){
                String protein= dna.substring(start, stop+3);
                System.out.println("This is a Proton!!!"+ protein);
            }
            else{
                System.out.println("No protein!");
            }
        }
    }

