package wzorce.facade;

//widoczność pakietowa w związku z czym tylko fasada ma dp nich dostęp
class Light {

    void on(){
        System.out.println("Light on");
    }

    void off() {
        System.out.println("Light off");
    }
}
