package Section_1;
import java.util.StringTokenizer;

class StringStudy {
    ///String 변수선언,할당
    public static void main(String[] args) {
        String name1= "Seo Coding";
        String name2 = "Seo Coding";
        String name3= new String("Seo Coding");
        String name4 = new String("Seo Coding");
        System.out.print(name1);
        System.out.println(name2);

        boolean comparison1 = name1 == "Kim Coding";      // true
        boolean comparison2 = name1 == name2;             // true
        boolean comparison3 = name1 == name3;             // false
        boolean comparison4 = name3 == name4;             // false
        boolean comparison5 = name1.equals("Kim Coding"); // true
        boolean comparison6 = name1.equals(name3);        // true
        boolean comparison7 = name3.equals(name4);        // true

        System.out.printf("%s %s %s %s %s %s %s\n",comparison1,comparison2,comparison3,comparison4,comparison5
                ,comparison6,comparison7);
        ///charAT() 메서드
        String str = new String("Java");
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        ///compareTo() 메서드
        System.out.println(str.compareTo("java"));
        System.out.println(str.compareTo("java")+"\n");
        System.out.println(str.compareToIgnoreCase("java"));
        ///concat() 메서드
        System.out.println(str.concat("공부"));
        ///indexOf() 메서드
        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("Java"));
        ///trim() 메서드 - 앞뒤공백제거
        str = new String("  Java  ");
        System.out.println(str);
        System.out.println(str.trim());
        str = str.trim();
        ///toLowerCase() toUpperCase() 메서드
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        ///StringTokenizer
        String str2 = "This is a string example using StringTokenizer";
        StringTokenizer tokenizer = new StringTokenizer(str2);
        System.out.println(str2);
        System.out.println();
        System.out.println("total tokens:"+tokenizer.countTokens());
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }
        System.out.println("total tokens:"+tokenizer.countTokens());
        ///StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("문자열 ").append("연결");
        str2 = stringBuilder.toString();
        System.out.println(stringBuilder);
        System.out.println(str2);
        ///StringBuffer
        //append() 메서드
        StringBuffer str3 = new StringBuffer("Java");
        System.out.println("문자열 : " + str3);
        System.out.println(str3.append(" programming"));
        System.out.println("append() 메서드 호출 후 문자열 : " + str3);
        //capicity() 메서드 - Stringbuffer 인스턴스의 현재버퍼크기
        StringBuffer str01 = new StringBuffer();
        StringBuffer str02 = new StringBuffer("Java");
        System.out.println(str01.capacity());
        System.out.println(str02.capacity());
        //delete() 메서드
        StringBuffer str4 = new StringBuffer("Java Oracle");
        System.out.println("문자열 : " + str4);
        System.out.println(str4.delete(4, 8));
        System.out.println(str4.deleteCharAt(1));
        System.out.println("deleteCharAt() 메소드 호출 후 문자열 : " + str4);
        //insert() 메서드
        StringBuffer str5 = new StringBuffer("Java Programming!!");
        System.out.println("문자열 : " + str5);
        System.out.println(str5.insert(4, "Script"));
        System.out.println("insert() 메서드 호출 후 문자열 : " + str5);
    }
}


