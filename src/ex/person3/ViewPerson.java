package ex.person3;

import sample.enumsample.Gender;

import java.util.*;

public class ViewPerson {
    public static void main(String[] args) {
        Map<Birthplace, List<Person>> personBirthPlaceMap = new HashMap<>();

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("やまだ", Birthplace.HOKKAIDO, Gender.MEN, 35));
        personList.add(new Person("いけだ", Birthplace.HOKKAIDO, Gender.WOMEN, 26));
        personList.add(new Person("いのうえ", Birthplace.FUKUOKA, Gender.MEN, 32));
        personList.add(new Person("たむら", Birthplace.FUKUOKA, Gender.WOMEN, 22));
        personList.add(new Person("わだ", Birthplace.TOKYO, Gender.MEN, 42));
        personList.add(new Person("くどう", Birthplace.TOKYO, Gender.WOMEN, 55));
        personList.add(new Person("さらど",Birthplace.OSAKA,Gender.MEN,31));
        personList.add(new Person("あいざわ",Birthplace.OSAKA,Gender.WOMEN,44));

        //出身地ごとの分類してマップ
        for (Person person:personList) {
            if (personBirthPlaceMap.containsKey(person.getBirthplace())) {
                personBirthPlaceMap.get(person.getBirthplace()).add(person);
            } else {
                List<Person> list = new ArrayList<>();
                list.add(person);
                personBirthPlaceMap.put(person.getBirthplace(),list);
            }
        }

        //分類できたか
        for (Map.Entry entry:personBirthPlaceMap.entrySet()) {
            System.out.println(((Birthplace)entry.getKey()).getName());
            for (Person person:(List<Person>)entry.getValue())
                System.out.println(person);
        }

        //平均年齢
        for (Map.Entry entry : personBirthPlaceMap.entrySet()) {
            double sumAge = 0;//年齢の合計
            double count = 0;//人数
            for (Person person:(List<Person>) entry.getValue()) {
                count++;
                sumAge += person.getAge();
            }

            double aveAge = sumAge / count;

            System.out.println(String.format("%s \n平均年齢:%.1f",
                    (((Birthplace)entry.getKey()).getName()),aveAge));

            //男女別
            double sumMen =0,sumWomen =0;
            double countMen =0,countWomen =0;
            for (Person person:(List<Person>) entry.getValue()) {
                if (person.getGender().equals(Gender.MEN)) {
                    countMen++;
                    sumMen += person.getAge();
                } else {
                    countWomen++;
                    sumWomen += person.getAge();
                }
            }

            System.out.println(String.format("男性の平均年齢:%.1f",sumMen/countMen));
            System.out.println(String.format("女性の平均年齢:%.1f",sumWomen/countWomen));
        }
    }
}
