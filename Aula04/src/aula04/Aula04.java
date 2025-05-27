package aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);
        c1.status();
        
        c1.setModelo("BIC"); //chamando pelo método set
        c1.setPonta(0.5f); // chamando pelo método set
        System.out.println("Tenho uma caneta " + c1.getModelo()+ " de ponta " + c1.getPonta());
        
        Caneta c2 = new Caneta("KKK", "Laranja", 1.5f);
        c2.status();
    }
}
