public class stringsplit {
    public static void main(String args[]){
        String s1="java string split method by mani";
        String[] words=s1.split("\\s");

        for(String w:words){
            System.out.println(w);
        }
    }
}
