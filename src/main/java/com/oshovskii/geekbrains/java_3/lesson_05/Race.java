package com.oshovskii.geekbrains.java_3.lesson_05;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {

    private ArrayList<Stage> stages;

    public ArrayList<Stage> getStages() { return stages; }

    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }
}
