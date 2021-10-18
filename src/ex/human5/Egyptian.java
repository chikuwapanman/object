package ex.human5;

import basic.human5.IfSayHello;

class Egyptian implements IfSayHello {

    private String name;

    public Egyptian(String name){
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println(" اَلسَّلَامُ عَلَيْكُمْ." + name + "اِسمِي");
    }
}
