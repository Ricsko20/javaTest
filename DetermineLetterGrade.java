package tests;

public class DetermineLetterGrade {
    public char determine(int szam) {
        if(szam < 0 || szam > 100) {
            throw new IllegalArgumentException();
        }
        if(szam >= 90) {
            return 'A';
        }
        if(szam >= 80) {
            return 'B';
        }
        if(szam >= 70) {
            return 'C';
        }
        if(szam >= 60) {
            return 'D';
        }
        if(szam >= 50) {
            return 'E';
        }

        return 'F';
    }
}