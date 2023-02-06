public class stringstartswith {
    public static void main(String[] args) {
        String str = "mani";

        System.out.println(str.startsWith("J"));


        System.out.println(str.startsWith("a"));
        // offset is 1
        System.out.println(str.startsWith("a",1));
    }

}
