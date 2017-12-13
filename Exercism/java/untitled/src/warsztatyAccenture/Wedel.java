package warsztatyAccenture;

import static warsztatyAccenture.ChocolateType.DARK;

public class Wedel implements ChocolateFactory {

    public Czekolada createChocolate(ChocolateType type) {
        Czekolada czekolada = null;
        switch(type){
            case DARK:
                 czekolada = new Gorzka();
                 break;
            case MLECZNA:
                czekolada = new Mleczna();
                break;
        }
        return czekolada;
    }


}
