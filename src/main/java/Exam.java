import java.util.Random;
import java.util.Scanner;
public class Exam{
    //question 1
    public static void oddNums(){
        for(int i = 10; i >= 0; i--){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    // question 2
    public static int sum(int [] arr){
        int answer = 0;
        for (int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
    //question 3
    public static void average(int[] arr){
        int answer = 0;
        for (int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        System.out.println(answer / arr.length);
    }
    //question 4
    public static void randomNum(){
        Random random = new Random();
        System.out.println("roll dice " + (random.nextInt(6) + 1));
    }
    //question 5
    public static void sumOfEvens(int[] arr){
        int evens = 0;
        int numOfEvens = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                evens += arr[i];
                numOfEvens++;
            }
        }
        int answer = evens / numOfEvens;
        System.out.println(answer);
    }
    //question 6
    public static void cubeVol(int area){
        System.out.println(area * area * area);
    }
    //question 7
    public static void charCount(String arg, char lett){
        int count = 0;
        for(int i =0; i < arg.length(); i++){
            if(arg.charAt(i) == lett){
                count++;
            }
        }
        System.out.println(count);
    }
    //question 8
    public static void pallindrome(String arg){
        boolean isPal = false;
        int firstlet = 0;
        int lastlet = arg.length() - 1;
        while(firstlet < lastlet){
            if(arg.charAt(firstlet) != arg.charAt(lastlet)){
                isPal = false;
            }
            else {
                isPal = true;
            }
            firstlet++;
            lastlet--;
        }
        System.out.println(isPal);
    }
    //question 9
    public static void leapYear(int year){
        boolean isLeap = false;
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            isLeap = true;
        }
        System.out.println(isLeap);
    }
    //question 100
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3,4};
        oddNums();
        System.out.println(sum(array));
        average(array);
        randomNum();
        sumOfEvens(array);
        cubeVol(3);
        charCount("Rashawn", 'a');
        pallindrome("girafarig");
        leapYear(2024);
        System.out.println("enter ticket number ");
        int ticketNum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter destination ");
        String destination = scanner.nextLine();
        System.out.println("now serving customer number " + ticketNum + ". Enjoy your trip too " + destination);
        scanner.close();
    }
}