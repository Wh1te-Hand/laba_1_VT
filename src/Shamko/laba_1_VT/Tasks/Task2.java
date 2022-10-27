package Shamko.laba_1_VT.Tasks;

import Shamko.laba_1_VT.Interfaces.ITask;

import java.util.Scanner;

public class Task2 implements ITask {
    private double x;
    private double y;

    private boolean IsInRange(double x, double y){
        return ((Math.abs(x) <= 6) && (y <= 0) && (y >= -3)||((Math.abs(x) <= 4) && (y <= 5) && (y >= 0)));
    }

    @Override
    public void GetInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x: ");
        this.x = in.nextDouble();
        System.out.println("Enter y: ");
        this.y = in.nextDouble();
    }

    @Override
    public void SolveTask() {
        System.out.print("Answer: ");
        System.out.println(IsInRange(this.x, this.y));
    }
}