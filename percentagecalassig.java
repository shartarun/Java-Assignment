public class percentagecalassig {
    public static void main(String[] args) {
        // take input values totalMarks and ObtainedMarks
        int totalMarks = 700;
        int obtainedMarks = 550;
        // calculate percentage
        int percentage = obtainedMarks * 100 / totalMarks;
        //print percentage
        System.out.println(percentage);
        //check grade through percentage
        if (percentage <= 59) {
            System.out.print("Grade F, GPA = 0.0");

        } else if (percentage <= 69) {
            System.out.print("Grade D, GPA = 1.0");
        } else if (percentage <= 79) {
            System.out.print("Grade C, GPA = 2.0");
        } else if (percentage <= 89) {
            System.out.print("Grade B, GPA = 3.0");
        } else if (percentage <= 100) {
            System.out.print("Grade  A , GPA = 4.0");
        }

    }
}
