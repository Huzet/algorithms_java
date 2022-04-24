
/*
 * Beginner Series #1 School Paperwork
 * https://www.codewars.com/kata/55f9b48403f6b87a7c0000bd/train/java
 */

public class Main {
    public static void main(String[] args) {
        int answer = paperwork(1,5);
        System.out.println(answer);
    }
    public static int paperwork(int n, int m){
        int answer;
        //Happy Coding! ^_^
        if (n <= 0 || m <= 0){
            answer = 0;
        }
        else{
            answer = n * m;
        }
        return answer;
    }
}
