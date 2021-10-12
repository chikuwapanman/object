package basic.human5;

class HumanSample {
    public static void main(String[] args) {
        //Human型の配列を作成
        Human[] humans = {
                new English("Ayame"),
                new Japanese("ひろし"),
                new Chinese("李"),
                new Danish("Laura"),
                new Egyptian("أَدِيب")
        };

        for (Human human : humans) {
            human.sayHello();
        }
    }
}
