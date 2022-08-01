package Tarea4;

public class Solution {
    public static int sumGroups(int[] arr){
        if (arr.length > 0) {
            int number, suma, suma1;
            suma1 = suma = number = arr[0] & 1;
            int totalSuma = 1;
            int numAux = 0;
            for (int i = 1; i < arr.length; i++) {
                if (number == (arr[i]%2)) {
                    suma = suma + arr[i]%2;
                } else {
                    totalSuma += (suma1 ^ suma) & numAux;
                    suma1 = suma;
                    suma = number = arr[i]%2;
                    numAux = 1;
                }
            }
            totalSuma += (suma1 ^ suma) & numAux;
            return totalSuma;
        }
        return 0;
    }
}

