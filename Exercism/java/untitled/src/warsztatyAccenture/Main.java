package warsztatyAccenture;

public class Main
{
    public static void main(String[] args) {
        ChocolateFactory chocolate = new Milka();
        chocolate.createChocolate(ChocolateType.DARK);
    }

}
