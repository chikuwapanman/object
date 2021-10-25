package ex.bmi;

import sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ViewMember {
    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>();
        memberList.addAll(Arrays.asList(
                new Member("かわしま", Gender.WOMEN,26,1.59,45.5)
        ));

        for (Member member : memberList){
            System.out.println(member);
        }
    }
}
