package LearningArrays;


public class CountItemMatch {
    public static void main(String[] args) {
        String[][] items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items, ruleKey, ruleValue));

    }
    public static int countMatches(String[][] items, String ruleKey, String ruleValue) {
        int x = 0;
        if (ruleKey.equals("color")) x = 1;
        else if (ruleKey.equals("name")) x = 2;

        int count = 0;
        for (String[] item: items) {
            if (item[x].equals(ruleValue)) ++count;
        }

        return count;
    }
}
