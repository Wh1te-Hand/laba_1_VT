package Shamko.laba_1_VT.Tasks.Tasks9_11;

import Shamko.laba_1_VT.Interfaces.ITask;

import java.awt.*;

public class Task9 implements ITask {
    private Basket basket;
    @Override
    public void GetInput() {
        this.basket = new Basket();
        this.basket.AddBall(new Ball(Color.BLUE, 1.0));
        this.basket.AddBall(new Ball(Color.YELLOW, 2.0));
        this.basket.AddBall(new Ball(Color.BLUE, 1.0));
        this.basket.AddBall(new Ball(Color.RED, 5.0));
        this.basket.AddBall(new Ball(Color.ORANGE, 3.0));
        this.basket.AddBall(new Ball(Color.GREEN, 6.0));
        this.basket.AddBall(new Ball(Color.BLUE, 1.0));
    }

    @Override
    public void SolveTask() {
        System.out.printf("Weight of balls in basket: %.2f   \n", this.basket.getWeight());
        System.out.printf("Count of blue balls in basket: %d   \n", this.basket.getCountOfBallsOfColor(Color.BLUE));
    }

}
