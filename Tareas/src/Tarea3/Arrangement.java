package Tarea3;
import java.util.Scanner;

public class Arrangement {
    private int number;
    private int [] arrangement;
    public void arrangementIntroduceNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the size of the array: ");
        int size = scanner.nextInt();
        arrangement = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". Introduce the number: ");
            number = scanner.nextInt();
            arrangement[i] = number;
        }
    }
    public void printArrangement(){
        System.out.print("\nThe array is: ");
        for (int i = 0; i < arrangement.length; i++) {
            System.out.print(arrangement[i] + ", ");
        }
    }
    public void mostFrequent(){
        int counter =0;
        for(int i=0;i<arrangement.length;i++) {
            int count=0;
            for(int j=0;j<arrangement.length;j++) {
                if(arrangement[i] == arrangement[j])
                    count++;
            }
            if(count> counter) {
                counter =count;
                number = arrangement[i];
            }
        }
        System.out.println("\nThe most frequent number in the arrangement is "+number+" and it occurs "+ counter +" times.");
    }
}