public class Main {

    public static void main(String[] args) {
        try{
            // write your code here
            String str = null;
            str.length();
        }
        catch(NullPointerException i){
            System.out.println("NullPointException が発生しました。");
            System.out.println(i.getMessage());
        }

    }
}
