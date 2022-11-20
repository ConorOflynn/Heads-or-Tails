/*
Conor O'Flynn
CSC1060680
This program plays heads or tails
10/23/22
*/
import java.util.Scanner;
public class Main {
    public static char[] toBinaryChars(short number) {


        char[] result = new char[9];

        int i = result.length - 1;
        while (number != 0) {
            if (number % 2 == 0) {
                result[i--] = '0';
            } else {
                result[i--] = '1';
            }
            number /= 2;
        }
        for (int k = i; k >= 0; k--) {
            result[k] = '0';
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("enter a number between 0 and 511");
        Scanner input = new Scanner(System.in);
        short number = input.nextShort();
        var binary = toBinaryChars(number);
        var joined = String.valueOf(binary);
        var length = binary.length;
        var i = 0;
        char[][] matrix = new char[3][3];
        // /*
        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = binary[i];
                i++;
            }
        }

        for (char[] k : matrix) {
            for(char j : k) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    }
// */

