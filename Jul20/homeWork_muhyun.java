package Jul20Homework;

import java.util.Scanner;

public class homeWork_muhyun {
    /*
        현재 섭씨온도를 입력하면, 화씨온도로 바꿔주는 함수를 만드시오(3분안에, return 쓸것)
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Current temperature in Celcius?: ");
        int Celcius = sc.nextInt();
        System.out.println("Temperature in Fahrenheit: " + changed_temperature(Celcius));
    }
    public static int changed_temperature(int Celcius) {
        int Fahrenheit = Celcius * 9/5 + 32;
        return Fahrenheit;
    }
}

