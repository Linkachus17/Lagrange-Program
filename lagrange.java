import java.lang.reflect.Array;
import java.util.Scanner;

public class lagrange {
    double arrayX[];
    double arrayY[];
    int X;
    int data_length;
    double result;
    double term;

    public void lagrange() {
        Scanner input = new Scanner(System.in);

        System.out.print("Input X Value: ");
        X = input.nextInt();

        System.out.print("Input Data length: ");
        data_length = input.nextInt();

        arrayX = new double[data_length];
        arrayY = new double[data_length];

        for(int index = 0; index < data_length; index++){
            System.out.print("Input X" + index + ": ");
            arrayX[index] = input.nextDouble();

            System.out.print("Input Y" + index + ": ");
            arrayY[index] = input.nextDouble();
        }

        for(int i = 0; i < data_length; i++){

            term = arrayY[i];

            for(int j = 0; j < data_length; j++){
                
                if(j != i){
                    term = term*(X - arrayX[j])/(arrayX[i] - arrayX[j]);
                }
            }

            result = result + term;
        }

        System.out.println("Result at X = " + X +": " + result);
    }



    public static void main(String[] args) {
        lagrange lagrange = new lagrange();
        lagrange.lagrange();
    }
}
