package Shamko.laba_1_VT.Tasks;

import Shamko.laba_1_VT.Interfaces.ITask;

import java.util.Scanner;

public class Task6 implements ITask {
    private int count_of_items;
    private double[] numbers;
    private double[][] get_matrix(double[] numbers){
        double [][] result = new double[this.count_of_items][this.count_of_items];
        for (int i = 0; i < this.count_of_items; i++){
            for (int j = 0; j < this.count_of_items; j++){
                result[i][j] = numbers[(i+j) % this.count_of_items];
            }
        }
        return result;
    }

    @Override
    public void GetInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of number: ");
        this.count_of_items = in.nextInt();
        this.numbers = new double[this.count_of_items];
        for (int i = 0; i < this.numbers.length; i++){
            System.out.println("Enter number: ");
            this.numbers[i] = in.nextDouble();
        }
    }

    @Override
    public void SolveTask() {
        double[][] Answer = get_matrix(this.numbers);
        for(int i = 0; i < this.numbers.length; i++){
            for (int j = 0; j < this.numbers.length; j++){
                System.out.printf("%f   ",Answer[i][j]);
            }
            System.out.println();
        }
    }
}