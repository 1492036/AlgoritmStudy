package kakao.test2020.textcompress;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        String example = "aaabbccbcbcccc";
        List<String> list = new ArrayList<>();
        List<Integer> sizeList = new ArrayList<>();

        int check = 1;
        String result = "";
        String little = "";

        if (example.length() == 1) {
            System.out.println(example);
            System.out.println("1");
            return;
        }

        for (int flag = 1; flag <= example.length() / 2; flag++) {

            result = "";
            list.clear();
            check = 1;

            for (int i = 0; i < example.length(); i += flag) {

                if (i + flag < example.length()) {
                    little = example.substring(i, i + flag);
                    list.add(little);
                } else {
                    little = example.substring(i, example.length());
                    list.add(little);
                }
            }

            for (int j = 0; j < list.size() - 1; j++) {
                String first = list.get(j);
                String second = list.get(j + 1);

                if (first.equals(second)) {
                    check++;
                }

                else {
                    if (check == 1)
                        result += first;
                    else {
                        result += check + first;
                        check = 1;
                    }
                }

                if (j == (list.size() - 2)) {
                    if (check == 1)
                        result += second;
                    else {
                        result += check + second;
                    }
                }

            }
            sizeList.add(result.length());
            System.out.println(result);

        }

        Collections.sort(sizeList);
        System.out.println(sizeList.get(0));

    }

}