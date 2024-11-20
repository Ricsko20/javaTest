package tests;

public class Palindrom {
    public boolean isPalindrom(String sz) {
        String reversedString = new StringBuilder(sz).reverse().toString();
        if(reversedString.equals(sz)) {
            return true;
        }
        else {
            return false;
        }
    }
}
