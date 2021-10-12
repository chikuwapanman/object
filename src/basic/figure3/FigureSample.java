package basic.figure3;

class FigureSample {
    public static void main(String[] args) {
        IfGetArea[] figures = {
                new Rectangle(10,20),
                new Triangle(8,15),
                new Circle(4.2)
        };

        //出力
        for (IfGetArea figure:figures){
            System.out.println(figure.getArea());
        }
    }
}
