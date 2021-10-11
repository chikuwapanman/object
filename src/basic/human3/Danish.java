package basic.human3;

//デンマーク人クラス
class Danish extends Human{

    public Danish(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hej.Jeg hedder " + name +".");
    }
}
