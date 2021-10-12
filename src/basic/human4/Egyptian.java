package basic.human4;

class Egyptian extends Human {

    public Egyptian(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println(" اَلسَّلَامُ عَلَيْكُمْ." + name + "اِسمِي");
    }
}
