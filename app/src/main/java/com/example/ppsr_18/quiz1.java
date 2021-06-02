package com.example.ppsr_18;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class quiz1 extends AppCompatActivity {


    private TextView countLabel, questionLabel;
    private Button answerBtn1, answerBtn2, answerBtn3, answerBtn4;

    private String rightAnswer;
    private int rightAnswerCount = 0;
    private int quizCount = 1;
    static final private int QUIZ_COUNT = 5;

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();

    String quizData[][] = {
            // {"Country", "Right Answer", "Choice1", "Choice2", "Choice3"}
            {"  Which among the following is NOT a logical or relational operator?", " =", "!=", "==", "||"},
            {"  If n has 3, then the statement a[++n]=n++;", "what is assigned is compiler dependent", "assigns 3 to a[5]", "assigns 4 to a[5]", "assigns 4 to a[4]"},
            {"  In C, two integers can be swapped using minimum", "0 extra variable", "1 extra variable", "2 extra variable", "4 extra variable"},
            {"  What is the return type of getchar()?", "int", "char", "unsigned char", "float"},
            {"  Who is the founder of C language", "Dennis Ritchie", "Bjarne Stroustrup", "Guido van Rossum", "James Gosling"},
            {"  Expand or Abbreviate ASCII with regard to C Language. ", "American Standard Code for Information Interchange", "Australian Standard Code for Information Interchange", "American Symbolic Code for Information Interchange", "Australian Symbolic Code for Information Interchange"},
            {"  Which symbol indicates start in a flowchart", "oval", "circle", "rectangle", "arrow"},
            {"  C is a __", "middle level language", "low level language", "high level language", "none of the above"},
            {"  Which of the following is not a section in a basic C program?", "detail section", "documentation section", "link section", "main function"},
            {"  Which of the following is a not a keyword in C language?", " Getchar", "Void ", "Volatile", "Sizeof"},
            {"  By default a real number is treated as a", "double", "float", "long double", "far double"},
            {"  The process of drawing a flowchart for an algorithm is called ___", "Flowcharting", "Performance", "Evaluation", "Algorithmic Representation"},
            {"  A box that can represent two different conditions.", "Diamond", "Rectangle", "Parallelogram", "circle"},
            {"  How many keywords are there in c ?", "32", "31", "64", "63"},
            {"  Which of the following special symbol allowed in a variable name?", "_ (underscore)", "| (pipeline)", "* (asterisk)", "- (hyphen)"}
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        countLabel = findViewById(R.id.countLabel);
        questionLabel = findViewById(R.id.questionLabel);
        answerBtn1 = findViewById(R.id.answerBtn1);
        answerBtn2 = findViewById(R.id.answerBtn2);
        answerBtn3 = findViewById(R.id.answerBtn3);
        answerBtn4 = findViewById(R.id.answerBtn4);

        // Receive quizCategory from StartActivity.
        int quizCategory = getIntent().getIntExtra("QUIZ_CATEGORY", 0);
        Log.v("CATEGORY", quizCategory + "");


        // Create quizArray from quizData.
        for (int i = 0; i < quizData.length; i++) {

            // Prepare array.
            ArrayList<String> tmpArray = new ArrayList<>();
            tmpArray.add(quizData[i][0]); // Country
            tmpArray.add(quizData[i][1]); // Right Answer
            tmpArray.add(quizData[i][2]); // Choice1
            tmpArray.add(quizData[i][3]); // Choice2
            tmpArray.add(quizData[i][4]); // Choice3

            // Add tmpArray to quizArray.
            quizArray.add(tmpArray);
        }

        showNextQuiz();
    }

    public void showNextQuiz() {

        // Update quizCountLabel.
        countLabel.setText("Q" + quizCount);

        // Generate random number between 0 and 14 (quizArray's size - 1)
        Random random = new Random();
        int randomNum = random.nextInt(quizArray.size());

        // Pick one quiz set.
        ArrayList<String> quiz = quizArray.get(randomNum);

        // Set question and right answer.
        // Array format: {"Country", "Right Answer", "Choice1", "Choice2", "Choice3"}
        questionLabel.setText(quiz.get(0));
        rightAnswer = quiz.get(1);

        // Remove "Country" from quiz and Shuffle choices.
        quiz.remove(0);
        Collections.shuffle(quiz);

        // Set choices.
        answerBtn1.setText(quiz.get(0));
        answerBtn2.setText(quiz.get(1));
        answerBtn3.setText(quiz.get(2));
        answerBtn4.setText(quiz.get(3));

        // Remove this quiz from quizArray.
        quizArray.remove(randomNum);
    }

    public void checkAnswer(View view) {

        // Get pushed button.
        Button answerBtn = findViewById(view.getId());
        String btnText = answerBtn.getText().toString();

        String alertTitle;

        if (btnText.equals(rightAnswer)) {
            // Correct
            alertTitle = "Correct!";
            rightAnswerCount++;

        } else {
            alertTitle = "Wrong...";
        }

        // Create AlertDialog.
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(alertTitle);
        builder.setMessage("Answer : " + rightAnswer);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (quizCount == QUIZ_COUNT) {
                    // Show Result.
                    Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                    intent.putExtra("RIGHT_ANSWER_COUNT", rightAnswerCount);
                    startActivity(intent);

                } else {
                    quizCount++;
                    showNextQuiz();
                }
            }
        });
        builder.setCancelable(false);
        builder.show();
    }

}