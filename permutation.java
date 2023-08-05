public class permutation {
    public static void findPermutation(String str, String ans) {
        // bsace case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recussion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde"=>"ab" = "abde"
            String NewStr = str.substring(0, 1) + str.substring(i + 1);
            findPermutation(NewStr, ans + curr);

        }

    }

    public static void main(String args[]) {
        String str = "abc";
        findPermutation(str, "");
    }

}
    

