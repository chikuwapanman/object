package basic.human5;

import basic.human2.Human;

class HumanSample {
    public static void main(String[] args) {
        //Human型の配列を作成
        IfSayHello[] humans = {
                new English("Ayame"),
                new Japanese("ひろし"),
                new Chinese("李"),
                new Danish("Laura"),
                new Egyptian("أَدِيب")
        };

        for (IfSayHello human : humans) {
            human.sayHello();
        }
    }
}
