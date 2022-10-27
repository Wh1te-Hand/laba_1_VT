package Shamko.laba_1_VT.Tasks;

import Shamko.laba_1_VT.Interfaces.ITask;

import java.util.Scanner;


    public class Task1 implements ITask {
        private double x;
        private double y;

        private double Function(double x, double y){
            double result = (1 + Math.pow(Math.sin(x + y),2))/(2+Math.abs(x-(2*x/(1+Math.pow(x,2)*Math.pow(y,2))))) + x;
            return result;
        }

        @Override
        public void GetInput() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter x value: ");
            this.x = in.nextDouble();
            System.out.println("Enter y value: ");
            this.y = in.nextDouble();
        }

        @Override
        public void SolveTask() {
            System.out.printf("Answer: %.3f \n", Function(this.x, this.y));
        }
    }
