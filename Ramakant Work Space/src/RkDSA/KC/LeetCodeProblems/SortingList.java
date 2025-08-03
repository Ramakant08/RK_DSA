package RkDSA.KC.LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SortingList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("CN/SAR-2023-2");
        list.add("CN/SAR-2023-3");
        list.add("CN/SAR-2023-4");
        list.add("CN/SAR-2023-5");
        list.add("CN/SAR-2023-6");
        list.add("CN/SAR-2023-7");
        list.add("CN/SAR-2023-8");
        list.add("CN/SAR-2023-9");
        list.add("CN/SAR-2023-10");

        StringBuffer stringBuffer;
        Pattern pattern = Pattern.compile("[^0-9]+([0-9]+)[^0-9]+([0-9]+)");
        for (int i = 0; i < list.size(); i++) {
            stringBuffer = new StringBuffer();
            Matcher m = pattern.matcher(list.get(i).toString());
            while (m.find()) {
                stringBuffer.append(m.group());
            }
            System.out.println(stringBuffer);
        }
    }
}
