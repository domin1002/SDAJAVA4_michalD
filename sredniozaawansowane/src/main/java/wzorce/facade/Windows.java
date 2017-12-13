package wzorce.facade;

//widoczność pakietowa w związku z czym tylko fasada ma dp nich dostęp
class Windows {
    void open() {
        System.out.println("Window open");
    }

    void close() {
        System.out.println("Window close");
    }
}
