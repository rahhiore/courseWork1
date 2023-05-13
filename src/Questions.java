public class Questions {
    //1. Какие условные операторы вы знаете? Дайте краткое определение каждому из них.
    public static void first() {
        int a = 1;
        if(a < 2) {
            System.out.println(a);
        } else {
            System.out.println("Wrong");
        }
        switch (a) {
            case 1:
                System.out.println(a);
                break;
            default:
                System.out.println("Wrong");
        }
    }
    //2. Что такое массив?
    public static void second() {
        int[] integer = new int[10];
        integer[1] = 0;
        int[] integer2 = {0, 2, 3};
    }
    //3. Дайте определение сеттерам. Расскажите, для чего они нужны?
    private int priv = 0;
    public Questions(int priv) {
        this.priv = priv;
    }

    public int getPriv() {
        return priv;
    }

    public void setPriv(int priv) {
        this.priv = priv;
    }
}
