package basic.human5;

class Egyptian implements Human {

    private String name;

    public Egyptian(String name){
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println(" اَلسَّلَامُ عَلَيْكُمْ." + name + "اِسمِي");
    }
}
