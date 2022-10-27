package Shamko.laba_1_VT.StartProgram;
import Shamko.laba_1_VT.Interfaces.ITask;
import Shamko.laba_1_VT.Tasks.*;
import Shamko.laba_1_VT.Tasks.Tasks9_11.Task9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartProgram {
    public static void main(String[] args) {
        List<ITask> tasks = new ArrayList<>();
        tasks.add(new Task1());
        tasks.add(new Task2());
        tasks.add(new Task3());
        tasks.add(new Task4());
        tasks.add(new Task5());
        tasks.add(new Task6());
        tasks.add(new Task7());
        tasks.add(new Task8());
        tasks.add(new Task9());

        for (ITask task :
                tasks) {
            task.GetInput();
            task.SolveTask();
        }
    }
}
