package ex.student2;

import sample.enumsample.Gender;

class Student {
    //フィールド
    private String name;//名前
    private Gender gender;//性別
    private int jap;//国語
    private int math;//数学
    private int eng;//英語

    //コンストラクタ
    public Student(String name, String gender, int jap, int math, int eng) {
        this.name = name;
        this.gender = gender;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getJap() {
        return jap;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    public int sum(){
        return jap + math + eng;
    }

    public double ave(){
        return sum() / 3.0;
    }


    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d %.2f",
        name,gender,jap,math,eng,sum(),ave());
    }
}

