import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.multiset.HashMultiSet;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;


import java.util.Set;

public class Test {


    MultiSet<String> multiset = new HashMultiSet<>();
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Type something...");
        String input = scn.nextLine();
        System.out.println(StringUtils.reverse(input));
        System.out.println(StringUtils.capitalize(input));
        System.out.println(StringUtils.isNumeric(input));

}

}
