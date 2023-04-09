public class Pedido {
    private Burger burger = new Burger();
    private Sobremesa sobremesa = new Sobremesa();
    private Bebida bebida = new Bebida();

    public void Combo_Master(){

        burger.setGramas(500);
        sobremesa.setTamanho("Medio");
        bebida.setML(250);

        System.out.println("Gramas Burger: " + burger.getGramas());
        System.out.println("Tamanho Sobremesa: " + sobremesa.getTamanho());
        System.out.println("Ml da bebida: " + bebida.getML());
    }

    public void Super_Combo(){

        burger.setGramas(700);
        sobremesa.setTamanho("Grande");
        bebida.setML(600);

        System.out.println("Gramas Burger: " + burger.getGramas());
        System.out.println("Tamanho Sobremesa: " + sobremesa.getTamanho());
        System.out.println("Ml da bebida: " + bebida.getML());
    }
}
