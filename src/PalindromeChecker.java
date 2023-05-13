public class PalindromeChecker {
    //Задача на проверку строки, является ли она палиндромом.
    public static boolean isPalindrome(String word) {
//        String temp = "";
//        for (int i = word.length() - 1; i >= 0; i--) {
//            temp += word.charAt(i);
//        }
//        System.out.println(word.equals(temp));
//        if (word.contentEquals(new StringBuilder(word).reverse())) {
//            return true;
//        } else {
//            return false;
//        }
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
