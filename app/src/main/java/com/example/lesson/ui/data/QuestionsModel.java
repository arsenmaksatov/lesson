package com.example.lesson.ui.data;

import java.io.Serializable;

public class QuestionsModel implements Serializable {
    private String questionNum, quiz, firstAnswer, secondAnswer, thirdAnswer, fourthAnswer, correctAnswer, fifthAnswer;

    public String getQuestionNum() {
        return questionNum;
    }

    public String getQuiz() {
        return quiz;
    }

    public String getFirstAnswer() {
        return firstAnswer;
    }

    public String getSecondAnswer() {
        return secondAnswer;
    }

    public String getThirdAnswer() {
        return thirdAnswer;
    }

    public String getFourthAnswer() {
        return fourthAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getFifthAnswer() {
        return fifthAnswer;
    }
    public QuestionsModel (String questionNum, String quiz, String firstAnswer, String secondAnswer,
                           String thirdAnswer, String fourthAnswer, String  fifthAnswer, String correctAnswer){
        this.questionNum = questionNum;
        this.quiz = quiz;
        this.firstAnswer = firstAnswer;
        this.secondAnswer = secondAnswer;
        this.thirdAnswer = thirdAnswer;
        this.fourthAnswer = fourthAnswer;
        this.fifthAnswer = fifthAnswer;
        this.correctAnswer = correctAnswer;
    }
}
