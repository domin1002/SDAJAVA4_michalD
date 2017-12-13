package warsztatyAccenture;

public class Milka implements ChocolateFactory {

    @Override
    public Czekolada createChocolate(ChocolateType type) {
        Czekolada czekolada = null;
        switch(type){
            case NUTS:
                czekolada = new Orzech();
                break;
            case OREO:
                czekolada = new Oreo();
                break;
        }
        return czekolada;
    }
}
