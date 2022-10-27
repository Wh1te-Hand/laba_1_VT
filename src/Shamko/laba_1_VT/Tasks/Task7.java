package Shamko.laba_1_VT.Tasks;

import Shamko.laba_1_VT.Interfaces.ITask;

import java.util.Scanner;

public class Task7 implements ITask {
    private int count_of_items;
    private double[] numbers;
    private void ShellSort(double[] numbers){
        for (int i = 0; i < numbers.length - 1; ) {
            if (numbers[i] <= numbers[i + 1]) {
                i++;
            } else {
                double temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
                if (i != 0)
                    i--;
            }
        }
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
        double[] Answer = this.numbers;
        ShellSort(Answer);
        for (int i = 0; i < Answer.length; i++){
            System.out.printf("%.2f   ", Answer[i]);
        }
        System.out.println();
    }
}

