package com.example.hoontaryi.guessanime;


public class QuizList {

    //text for quiz
    public static String[] questions = new String [] {
            "Her Real Identity Is Altair who named from stars name.",
            "Is this an opening song?",
            "Gundam Series",
            "King Arthur",
            "The sword void is from Kaij.",
            "Is this the original team from lovelive?",
            "The Key visual project.",
            "Her eye's ability is stone gaze.",
            "Did he die at the end?",
    };

    // images for quiz
    public static int[] images = new int [] {
            R.drawable.altair, R.drawable.alice, R.drawable.macross, R.drawable.saber,
            R.drawable.crown, R.drawable.idolmaster, R.drawable.littlebuster, R.drawable.momo,
            R.drawable.valvare
    };

    //answer of quiz
    public static boolean[] answers = new boolean[]{
            true, true, false, true, false, false, true, false, true
    };
}