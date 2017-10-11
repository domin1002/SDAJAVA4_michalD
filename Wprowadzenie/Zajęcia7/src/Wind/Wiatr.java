package Wind;

public class Wiatr {
    private double windSpeed;

    public Wiatr(double ws){
        this.windSpeed = ws;
    }
    public double km(){
        return winds
    }

    public double windSpeedInMile(){
        return this.windSpeed*0.621371192;
    }

    public double windSpeedInNode(){
        return this.windSpeed*1.852;
    }

    public String windPower(){
        String power ="";
        if(this.windSpeed<2){
            power = "lekki wiatr";
        }
        else if (this.windSpeed>120){
            power = "huragan";
        }
        else{
            power = "wiatr";
        }
        return power;
    }

    public int beaufort(int a){
        int beaufort = (int)(Math.pow)
    }

    public static void main(String[] args){
        Wiatr wiatr = new Wiatr(125);
        System.out.println("W milach: "+wiatr.windSpeedInMile());
        System.out.println("W węzłach: "+wiatr.windSpeedInNode());
        System.out.println("Dzisiaj jest: "+wiatr.windPower());
        System.out.println(wiatr.beaufort(12));
    }
}
