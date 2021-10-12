package basic.human5;

class English implements Human {

    private String name;

    public English(String name){
        this.name = name;
    }

    @Override
    public void sayHello(){
        System.out.println("Hello.I`m " + name +".");
    }
}
