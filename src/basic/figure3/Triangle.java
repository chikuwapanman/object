package basic.figure3;

class Triangle implements IfGetArea {
    //フィールド
    private double height;
    private double base;

    //コンストラクタ
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    //ゲッター
    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }


    @Override
    public String toString() {
        return String.format("三角形　底辺:%.2f 高さ:%.2f 面積:%.2f",
                base,height,getArea());
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }
}
