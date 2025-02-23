package ficha1ex1;

public class Main {
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro();
        cilindro.setRaio(2);
        cilindro.setAltura(3);

        Cilindro cil2 = new Cilindro();
        cil2.setRaio(3);
        cil2.setAltura(4);

        System.out.println("Volume: "+ cilindro.CalcularVolume());
        System.out.println("Volume: "+ cil2.CalcularVolume());

    }
}
