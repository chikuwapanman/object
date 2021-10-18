package ex.human5;

import basic.human5.IfSayHello;

//デンマーク人クラス
class Danish implements IfSayHello {

    private String name;

    public Danish(String name){
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hej.Jeg hedder " + name +".");
    }
}
