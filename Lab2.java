public class Lab2 {
    public static void main(String[] args) {
        String imie = args[0];
        String pseudomin = args[1];
        System.out.println("Hello world");
        System.out.println(Podmiana(imie)+" "+Podmiana(pseudomin));

    }
    public static String Podmiana (String podaneslowo){
        String zmienioneslowo=podaneslowo.replace('a','z');
        zmienioneslowo=zmienioneslowo.replace('e','z');
        zmienioneslowo=zmienioneslowo.replace('i','z');
        zmienioneslowo=zmienioneslowo.replace('u','z');
        zmienioneslowo=zmienioneslowo.replace('o','z');
        return zmienioneslowo;
    }

}
