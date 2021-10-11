package basic.figure2;

class FigureSample {
    public static void main(String[] args) {
        //インスタンスの作成
        Figure[] figures = {
                new Rectangle(10,20),
                new Triangle(8,15),
                new Circle(4.2)
        };

        //出力
        for (Figure figure:figures){
            System.out.println(figure);
        }
    }
}
