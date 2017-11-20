package pl.sda.wzorce.facade;

public class Facade {
    private Light light = new Light();
    private Windows windows = new Windows();

    public void activate(){
        light.on();
        windows.open();
    }

    public void deactivate() {
        light.off();
        windows.close();
    }
}
