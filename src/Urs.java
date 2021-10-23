import java.util.Scanner;

public class Urs extends Animal implements Blanos {
    public Urs() throws Exception {

//        static {
//            System.out.println("Clasa animal a fost apelata");
//        }
        {
            System.out.println("Bloc non- static anonim");
        }
        Scanner textScan = new Scanner(System.in);
        Scanner nrScan = new Scanner(System.in);
//       super();
        System.out.printf("Introdu tipul animalului (Salbatic/Domestic): ");
        super.setTipAnimal(textScan.nextLine());
//        System.out.printf("Introdu hrana necesara animalului (Carnivor/Ierbivor): ");
        super.setTipHrana("Carnivor");
        System.out.printf("Introdu culoarea acestuia: ");
        super.setCuloare(textScan.nextLine());
        System.out.printf("Introdu greutatea animalului: ");
        super.setGreutate(textScan.nextDouble());
        System.out.printf("Introdu varsta acestui animal: ");
        super.setVarsta(textScan.nextFloat());
        System.out.printf("Este un animal salbatic? (true/false): ");
        super.setSalbatic(textScan.hasNext());
    }

    public void getInfo() {
        System.out.println("Ursul este un animal cu urmatoarele caracteristici: " + "\n" + "Un animan de tip: " + getTipAnimal() + " doar in salbaticie" +
                "\n" + "Mananca: " + getTipHrana() + " In functie de sezon" + "\n" + "Cu greutatea de: " + getGreutate() + " killo" +
                "\n" + "O varsta de: " + getVarsta() + " ani" + "\n" + "De culoare " + getCuloare() + "\n" + "Este un animal salbatic?" + getSalbatic());
    }

    public void blana() {
    }

}
