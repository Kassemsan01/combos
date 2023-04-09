    import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Pedido p = new Pedido();
        System.out.println("Selecione seu compo");
        System.out.println("1. Combo Master");
        System.out.println("2. Super Combo");
        System.out.print("Sua escolha: ");

        Scanner input = new Scanner(System.in);

        int tipo = input.nextInt();

        if (tipo == 1){
            p.Combo_Master();

        }

        else if(tipo == 2){
            p.Super_Combo();
        }

        else{
            System.out.println("Combo invalido");
        }
    }
}
