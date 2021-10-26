package ex.person2;

import sample.enumsample.Gender;

import java.util.*;

public class ViewPerson {
    public static void main(String[] args) {
        Map<Birthplace, List<Person>> personBirthPlaceMap = new HashMap<>();

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("さくらい",Birthplace.HOKKAIDO, Gender.MEN,29));
        personList.add(new Person("たなか",Birthplace.HOKKAIDO, Gender.WOMEN,56));
        personList.add(new Person("よもぎ",Birthplace.HOKKAIDO, Gender.WOMEN,80));
        personList.add(new Person("うらしま",Birthplace.TOKYO, Gender.MEN,77));
        personList.add(new Person("たけとり",Birthplace.TOKYO, Gender.WOMEN,40));
        personList.add(new Person("キン",Birthplace.TOKYO, Gender.WOMEN,30));
        personList.add(new Person("うら",Birthplace.OSAKA, Gender.MEN,45));
        personList.add(new Person("おすぎ",Birthplace.OSAKA, Gender.WOMEN,90));
        personList.add(new Person("てんめん",Birthplace.OSAKA, Gender.MEN,16));
        personList.add(new Person("ピーコ",Birthplace.FUKUOKA, Gender.MEN,46));
        personList.add(new Person("ベル",Birthplace.FUKUOKA, Gender.WOMEN,18));
        personList.add(new Person("あいかわ",Birthplace.FUKUOKA, Gender.MEN,60));

        //出身地ごとの分類してマップに
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
