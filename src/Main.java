public class Main {
    public static void main(String[] args) {

        Urs urs = new Urs();
        urs.getInfo();
        Cal cal = new Cal();
        cal.kg("exprimata in ce vrei tu!");
        Animal animal = cal;
        cal.kg();
        animal.descriere("domesticit");

    }
}
