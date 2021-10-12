package basic.human4;

class English extends Human{

    public English(String name) {
        super(name);//Human(name)と同じ
    }

    @Override
    public void sayHello(){
        System.out.println("Hello.I`m " + name +".");
    }
}
