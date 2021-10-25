package sample.map.student;

import sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentMapSample {
    public static void main(String[] args) {
        //クラスごとのマップ
        Map<String, List<Student>> studentGroupMap = new HashMap<>(40);
        //学生のリスト
        List<Student> studentList = new ArrayList<>(100);
        studentList.add(new Student("1-1", "すぎもと", Gender.WOMEN, 75, 88, 92));
        studentList.add(new Student("1-1", "やまもと", Gender.MEN, 62, 58, 70));
        studentList.add(new Student("1-1", "ながい", Gender.MEN, 45, 28, 38));
        studentList.add(new Student("1-2", "よしだ", Gender.MEN, 87, 79, 66));
        studentList.add(new Student("1-2", "まきの", Gender.WOMEN, 75, 69, 98));
        studentList.add(new Student("1-2", "ほうじょう", Gender.WOMEN, 72, 36, 70));
        studentList.add(new Student("1-3", "たけうち", Gender.MEN, 86, 88, 95));
        studentList.add(new Student("1-3", "なかがわ", Gender.MEN, 50, 35, 62));
        studentList.add(new Student("1-3", "えんどう", Gender.WOMEN, 93, 76, 78));
        studentList.add(new Student("1-4", "こんどう", Gender.MEN, 88, 80, 70));
        studentList.add(new Student("1-4", "みうら", Gender.MEN, 90, 96, 86));
        studentList.add(new Student("1-4", "はっとり", Gender.WOMEN, 85, 70, 82));
        studentList.add(new Student("1-5", "いけだ", Gender.MEN, 94, 90, 88));
        studentList.add(new Student("1-5", "さとう", Gender.WOMEN, 62, 58, 58));
        studentList.add(new Student("1-5", "たけなか", Gender.WOMEN, 70, 65, 68));

        for (Student student : studentList) {
            //マップに存在するクラスの生徒が出現
            if (studentGroupMap.containsKey(student.getGroup())) {
                //リストに追加
                studentGroupMap.get(student.getGroup()).add(student);
            } else {
                //新しいキーを作成
                //空のリストをセット
                List<Student> list = new ArrayList<>();
                list.add(student);
                studentGroupMap.put(student.getGroup(), list);
            }
        }

        for (Map.Entry entry : studentGroupMap.entrySet()) {
            double sumJap = 0,sumMath = 0,sumEng = 0;
            for (Student student:(List<Student>) entry.getValue()){
            sumJap += student.getJap();
            sumMath += student.getMath();
            sumEng += student.getEng();
            }

            double aveJap = sumJap /  ((List<?>) entry.getValue()).size();
            double aveMath = sumMath / ((List<?>) entry.getValue()).size();
            double aveEng = sumEng / ((List) entry.getValue()).size();

            System.out.println(String.format("%s %.2f %.2f %.2f",
                    entry.getKey(),aveJap,aveMath,aveEng));

        }
    }
}
