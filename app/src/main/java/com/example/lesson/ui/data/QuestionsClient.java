package com.example.lesson.ui.data;

import java.util.ArrayList;
import java.util.List;

public class QuestionsClient {
    public static ArrayList<QuestionsModel> questionList = new ArrayList<>();

    public static List <QuestionsModel> getListOfQuestions(){

        questionList.add(new QuestionsModel("First question", "Keanu Reeves's age?", "57", "59", "54", "41", "he is immortal", "57"));
        questionList.add(new QuestionsModel("Second question", "How many letters in russian alphabet?", "35", "33", "32", "34", "idk)))", "33"));
        questionList.add(new QuestionsModel("Third question", "Caloplaca obamae is...", "Ex-president of USA", "animal", "lichen", "song", "greek name", "lichen"));
        questionList.add(new QuestionsModel("Fourth question", "Name of champagne wire?", "musley", "toror", "colok", "muzzle", "tf is dis?", "muzzle"));
        questionList.add(new QuestionsModel("Fifth question", "Banana tree is...", "50m high", "yellow", "berry", "plant", "grass", "grass"));
        questionList.add(new QuestionsModel("Sixth question", "Who is the most beautiful?", "idk", "someone", "you", "Michael", "Kunai", "you"));

        return questionList;
    }
}
