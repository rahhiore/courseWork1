public class Main2 {
    public static void main(String[] args) {
        Questions.first();
        Questions.second();
        Questions quest = new Questions(1);
        System.out.println(quest.getPriv());

        quest.setPriv(5);
        System.out.println(quest.getPriv());
        System.out.println(PalindromeChecker.isPalindrome("weew"));
    }
}