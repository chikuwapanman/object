package basic.inspection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ViewResult {
    public static void main(String[] args) {
        List<Result> results = new ArrayList<>();
        results.addAll(Arrays.asList(
                new Result("202010090508","丞司猛",
                        "2021-12-24T15:37:32",36.5,82,146,83)
        ));

        for (Result result:results){
            System.out.println(result);
        }
    }
}
