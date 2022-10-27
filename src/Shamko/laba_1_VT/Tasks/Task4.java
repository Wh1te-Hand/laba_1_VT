package Shamko.laba_1_VT.Tasks;

import Shamko.laba_1_VT.Interfaces.ITask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 implements ITask {
    private int count_of_elements;
    private int[] numbers;
    private boolean IsPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    private List<Integer> define_prime_number(int [] numbers){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++){
            if(IsPrime(numbers[i])){
                result.add(i);
            }
        }
        return result;
    }

    @Override
    public void GetInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of numbers: ");
        this.count_of_elements = in.nextInt();
        this.numbers = new int[this.count_of_elements];
        for(int i = 0; i < this.count_of_elements; i++){
            System.out.println("Enter number: ");
            this.numbers[i] = in.nextInt();
        }
    }

    @Override
    public void SolveTask() {
        List<Integer> Answer = new ArrayList<>();
        Answer = define_prime_number(this.numbers);
        System.out.println("Prime numbers with index: ");
        for (int index:
                Answer) {
            System.out.printf("%d, ", index);
        }
        System.out.println();
    }
}