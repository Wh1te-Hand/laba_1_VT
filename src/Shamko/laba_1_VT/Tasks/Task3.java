package Shamko.laba_1_VT.Tasks;

import Shamko.laba_1_VT.Interfaces.ITask;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 implements ITask {
    private double a;
    private double b;
    private double h;

    private Map<Double, Double> Function(double a, double b, double h) {
        double e = 0.000001;
        Map<Double, Double> result = new LinkedHashMap<>();
        if (a >= b) {
            throw new IllegalArgumentException("parameter a >= b");
        }
        if (h <= 0) {
            throw new IllegalArgumentException("parameter h <= 0");
        }
        for (double i = a; i <= b - e; i += h) {
            result.put(i, Math.tan(i));
        }
        result.put(b, Math.tan(b));
        return result;
    }

    @Override
    public void GetInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter \"a\" value: ");
        this.a = in.nextDouble();
        System.out.println("Enter b value: ");
        this.b = in.nextDouble();
        System.out.println("Enter step h: ");
        this.h = in.nextDouble();
    }

    @Override
    public void SolveTask() {
        Map<Double, Double> Answer = new LinkedHashMap<>();
        Answer = Function(this.a, this.b, this.h);
        for (Map.Entry item :
                Answer.entrySet()) {
            System.out.printf("%3.3f || %3.3f \n", item.getKey(), item.getValue());
        }
    }
}
