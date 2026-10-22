public class If {
    public static void main (String[] args) {
        int score = 85;
        boolean isAttendanceGood = true;
        if (score >= 60) {
            System.out.println("You passed the exam.");
            if (isAttendanceGood) {
                System.out.println("Bonus: Excellent attendance!");
            }
        } else {
            System.out.println("You shall not pass.");
        }
    }
}