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

public class quiz5 extends AppCompatActivity {


    private TextView countLabel, questionLabel;
    private Button answerBtn1, answerBtn2, answerBtn3, answerBtn4;

    private String rightAnswer;
    private int rightAnswerCount = 0;
    private int quizCount = 1;
    static final private int QUIZ_COUNT = 5;

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();

    String quizData[][] = {
            // {"Country", "Right Answer", "Choice1", "Choice2", "Choice3"}
            {"  Which of the following accesses a variable in structure b?", "b.var;", "b->var;", "b-var;", "b>var;"},
            {"  Which of the following accesses a variable in structure *b?", "b->var;", "b.var;", "b-var;", "b>var;"},
            {"  Which of the following is a properly defined struct?", "struct a_struct {int a;};", "struct {int a;}", "struct a_struct {int a;}", "struct a_struct int a;"},
            {"  Which properly declares a variable of struct foo?", "struct foo var;", "struct foo;", "foo;", "int foo;"},
            {"  Which of the following operators can be applied on structure variables?", "Assignment ( = )", "Equality comparison ( == )", "Both of the above", "None of the above"},
            {"  What is the size of a C structure.?", "Size of C structure is the total bytes of all elements of structure.", "C structure is always 128 bytes.", "Size of C structure is the size of largest element.", "None of the above"},
            {"  Choose a correct statement about C structures.", "Structure members can not be initialized at the time of declaration", "Structure elements can be initialized at the time of declaration", "C Only integer members of structure can be initialized at the time of declaraion", "None of the above"},
            {"  Choose a correct statement about C structures.", "All the above.", "A structure can contain same structure type member.", "A structure size is limited by only physical memory of that PC.", "You can define an unlimited number of members inside a structure."},
            {"  What is the similarity between a structure, union and enumeration?", "All of them let you define new data types", "All of them let you define new values", "All of them let you define new pointers", "All of them let you define new structures"},
            {"  User-defined data type can be derived by_____.", "All of the mentioned", "struct", "enum", "typedef"},
            {"  Which of the following cannot be a structure member?", "Function", "Another structure", "None of the mentioned", "Array"},
            {"  Size of a union is determined by size of the.", "Biggest member in the union", "First member in the union", "Last member in the union", "Sum of the sizes of all members"},
            {"  Members of a union are accessed as______.", "Both ", "union-name.member", "union-pointer->member", "None of the mentioned"},
            {"  Which of the following share a similarity in syntax? 1. Union, 2. Structure, 3. Arrays and 4. Pointers", "1 and 2", "3 and 4", "1 and 3", "1, 3 and 4"},
            {"  Which of the following is not allowed?", "None of the mentioned", "Arrays of bit fields", "Pointers to bit fields", "Functions returning bit fields"}
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);

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
                    Intent intent = new Intent(getApplicationContext(), ResultActivity5.class);
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

