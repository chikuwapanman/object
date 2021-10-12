package basic.human4;

//中国人クラス
class Chinese extends Human {

    public Chinese(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("你好、我叫" + name + "。");
    }
}
