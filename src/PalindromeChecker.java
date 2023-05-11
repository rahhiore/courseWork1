public class PalindromeChecker {
    //Задача на проверку строки, является ли она палиндромом.
    public static void isPalindrome(String word) {
        String temp = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            temp += word.charAt(i);
        }
        System.out.println(word.equals(temp));
    }
}
