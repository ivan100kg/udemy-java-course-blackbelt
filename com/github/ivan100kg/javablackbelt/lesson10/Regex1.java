package com.github.ivan100kg.javablackbelt.lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String celebs = """
                        name         |    country    |  birthday
                ---------------------+---------------+------------
                 Abbey_Lee           | Australia     | 1987-06-12
                 Abbie(12)           | Russia        | 1993-04-14
                 Abbie_Cornish       | Australia     | 1982-08-07
                 Abella_Danger       | United States | 1995-11-19
                 Adriana_Chechik     | United States | 1991-11-04
                 Adrianne_Palicki    | United States | 1983-05-06
                 Alaina_Huffman      | Canada        | 1980-04-17
                 Aleksandra_Bortich  | Belarus       | 1994-09-24
                 Alessandra_Ambrosio | Brazil        | 1981-04-11
                 Alex_Grey           | United States | 1996-04-20""";

//        String reg = "\\d{0,4}-\\d{1,2}-\\d{1,2}";
//        String reg = "[A-Za-z]+";
//        String reg = "\\b\\d{2}\\b";
//        String reg = "\\S+";
        String reg = "Rus[a-z]*";

        Pattern p1 = Pattern.compile(reg);
        Matcher matcher = p1.matcher(celebs);

        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
            System.out.println(matcher.group());
        }
    }
}
