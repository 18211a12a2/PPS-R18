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

public class quiz2 extends AppCompatActivity {


    private TextView countLabel, questionLabel;
    private Button answerBtn1, answerBtn2, answerBtn3, answerBtn4;

    private String rightAnswer;
    private int rightAnswerCount = 0;
    private int quizCount = 1;
    static final private int QUIZ_COUNT = 5;

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();

    String quizData[][] = {
            // {"Country", "Right Answer", "Choice1", "Choice2", "Choice3"}
            {"  Which of the following is a complete function?", "int funct(int x) {return x=x+1;}", "int funct();", "void funct(int) { printf( \"Hello\");", "void funct(x) { printf( \"Hello\"); }"},
            {"  Switch statement accepts.", "All of the above", "int", "char", "long "},
            {"  Choose a correct statement about C Language Functions.", "All the above.", "A function name can not be same as a predefined C Keyword.", "A function name can start with an Underscore( _ ) or A to Z or a to z.", "Default return type of any function is an Integer."},
            {"  Every C Program should contain which function.?", "main()", "printf()", "show()", "scanf()"},
            {"  Which of the following statements about functions is false?", "The maximum number of arguments a function can take is 128", "The main() function can be called recursively", "Functions cannot return more than one value at a time", "A function can have multiple return statements with different return values"},
            {"  Which is not a storage class?", "Struct", "Auto", "Typedef", "Static"},
            {"  In case of a conflict between the names of a local and global variable what happens?", "The local variable is given a priority.", "The global variable is given a priority.", "Which one will get a priority depends upon which one is defined first.", "The compiler reports an error."},
            {"  Processor Directive in C language starts with.?", "# symbol (HASH)", "$ symbol (DOLLAR)", "@ symbol (At The Rate)", "& symbol (Ampersand)"},
            {"  One disadvantage of pass-by-reference is that the called function may inadvertently corrupt the caller's data. This can be avoided by :", "declared the formal parameters constant", "passing pointers", "declared the actual parameters constant", "all of the above"},
            {"  Which loop is faster in C Language, for, while or Do While.?", "All work at same speed", "while", "do while", "for"},
            {"  Choose a correct C Statement regarding for loop.for(; ;);", "for loop works infinite number of times", " for loop works exactly first time", "Compiler error", "None of the above"},
            {"  Which of the following is not a loop control statement?", "if-else", "while", "do-while", "for"},
            {"  A copy of data is made and stored by the way of the name of the parameter is __ mechanism", "pass by value", "pass by reference", "pass by referance-value", "none of the above"},
            {"  All pre-processor directives starts with __ symbol", "#", "*", "@", "%"},
            {"  Which of the following is a loop control statement?", "continue", "if-else", "nested if else", "switch"}
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

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
                    Intent intent = new Intent(getApplicationContext(), ResultActivity2.class);
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
