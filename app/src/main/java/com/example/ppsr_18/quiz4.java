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

public class quiz4 extends AppCompatActivity {


    private TextView countLabel, questionLabel;
    private Button answerBtn1, answerBtn2, answerBtn3, answerBtn4;

    private String rightAnswer;
    private int rightAnswerCount = 0;
    private int quizCount = 1;
    static final private int QUIZ_COUNT = 5;

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();

    String quizData[][] = {
            // {"Country", "Right Answer", "Choice1", "Choice2", "Choice3"}
            {"  What is a pointer?", " A variable used to store address of other variable", "A keyword used to create variables", " A variable used to store address of an instruction", " A variable used to store address of a structure"},
            {"  Which of the following is the proper declaration of a pointer?", "int *x;", "int x;", "int &x;", "ptr x;"},
            {"  Which of the following gives the memory address of integer variable a?", "&a;", "*a;", "a;", "address(a);"},
            {"  Which of the following is the proper keyword to allocate memory in C?", "malloc", "create", "value", "new"},
            {"  Which of the following is the proper keyword to deallocate memory?", "free", "delete", "clear", "remove"},
            {"  What is the function used to allocate memory to an array at run time without initializing array elements.?", "malloc()", "calloc()", "palloc()", "kalloc()"},
            {"  Which of the following gives the memory address of a variable pointed to by pointer a?", " a;", "*a;", "&a", "address(a)"},
            {"  Which of the following reads in a string named x with one hundred characters?", "fgets(x, 101, stdin);", "fgets(x, 100, stdin);", "readline(x, 100, '\\n');", "read(x); "},
            {"  Which of the following functions compares two strings?", "strcmp();", "compare();", "stringcompare();", " cmp();"},
            {"  What does the argument count variable store?", "the number of arguments plus one", "the number of arguments", "the number of arguments minus one", "The total size of the argument array"},
            {"  Which of the following adds one string to the end of another?", "strcat();", "stradd();", "append();", "stringadd();"},
            {"  What variables stores the number of arguments to a program?", "argc", "argv", "count", "arglen"},
            {"  What is argv[0]?", "The name of the program", "The number of arguments to the program", "The first argument to the program", "This syntax is illegal"},
            {"  What type is argv?", "char **", "char *", "int", "HIt's not a variable"},
            {"  In what order do the two command line variables appear in the definition of main?", "Count then argument array", " Argument array then count", "They don't appear in the definition of main", "There is only one argument"}
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);

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
                    Intent intent = new Intent(getApplicationContext(), ResultActivity4.class);
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
