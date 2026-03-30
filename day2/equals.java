package Daily_code.day2;

public class equals {
    public static void main(String[] args) {

        // 🧪 题1
        String a1 = "a";
        String b1 = "a";
        System.out.println(a1 == b1);
        System.out.println(a1.equals(b1));

        // 🧪 题2
        String a2 = new String("a");
        String b2 = new String("a");
        System.out.println(a2 == b2);
        System.out.println(a2.equals(b2));

        // 🧪 题3
        String a3 = "a";
        String b3 = new String("a");
        System.out.println(a3 == b3);
        System.out.println(a3.equals(b3));

        // 🧪 题4
        String a4 = "ab";
        String b4 = "a" + "b";
        System.out.println(a4 == b4);

        // 🧪 题5
        String x5 = "a";
        String a5 = x5 + "b";
        String b5 = "ab";
        System.out.println(a5 == b5);
        System.out.println(a5.equals(b5));

        // 🧪 题6
        String a6 = "abc";
        String b6 = "abc";
        String c6 = new String("abc");
        System.out.println(a6 == b6);
        System.out.println(b6 == c6);
        System.out.println(a6.equals(c6));
    }
}





//题1:
//true
//true
//题2:
//false
//true
//题3:
//false
//true
//题4:
//true
//题5:
//false
//true
//题6:
//true
//false
//true