import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

try {

    Urs urs = new Urs();
    urs.getInfo();
    Cal cal = new Cal();
    cal.kg("exprimata in ce vrei tu!");
    Animal animal = cal;
    cal.kg();
    animal.descriere("domesticit");
    Ras ras = new Ras();
}catch (Exception e){
    e.printStackTrace();
}
    }
    public static void stack() {

        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);

        System.out.println(myStack);
    }
}
