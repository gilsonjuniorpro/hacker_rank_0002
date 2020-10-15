import java.util.Scanner;

public class Starter {

    /*
    A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become .

    Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.

    Function Description

    Complete the function rotLeft in the editor below. It should return the resulting array of integers.

    rotLeft has the following parameter(s):

    An array of integers .
    An integer , the number of rotations.
    Input Format

    The first line contains two space-separated integers  and , the size of  and the number of left rotations you must perform.
    The second line contains  space-separated integers .
    */

    private static final Scanner scanner = new Scanner(System.in);

    //Function to left rotate arr[] of size n by d
    void leftRotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

    void leftRotatebyOne(int arr[], int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

    // utility function to print an array
    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        Starter starter = new Starter();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int arraySize = arr.length;

        System.out.println("\nGiven an Array");
        starter.printArray(arr, arraySize);

        System.out.println("\nHow many times you want to try");
        int times = scanner.nextInt();

        if(times > 0){
            starter.leftRotate(arr, times, arraySize);
            starter.printArray(arr, arraySize);
        }
    }
}