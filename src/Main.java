//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Dough dough = new Dough("wheat","Bakingsoda","Hotwater","Xyz");
        System.out.println(dough.getFlour());
        dough.mix();
        dough.rest();


    }

}