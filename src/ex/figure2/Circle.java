package ex.figure2;

class Circle extends Figure {
    //フィールド
    private double radius;

    //コンストラクタ
    public Circle(double radius) {
        this.radius = radius;
    }

    //ゲッター
    public double getRadius() {
        return radius;
    }

    //面積
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return String.format("円　半径:%.2f 面積:%.2f",
                radius,getArea());
    }
}
