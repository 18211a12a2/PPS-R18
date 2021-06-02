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

public class quiz3 extends AppCompatActivity {


    private TextView countLabel, questionLabel;
    private Button answerBtn1, answerBtn2, answerBtn3, answerBtn4;

    private String rightAnswer;
    private int rightAnswerCount = 0;
    private int quizCount = 1;
    static final private int QUIZ_COUNT = 5;

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();

    String quizData[][] = {
            // {"Country", "Right Answer", "Choice1", "Choice2", "Choice3"}
            {"  Which keyword can be used for coming out of recursion?", "return", "break", "exit", "Both (a) and (b)"},
            {"  Choose the correct answer.", "Recursion uses more memory compared to iteration.", "Recursion is always better than iteration.", "Recursion uses less memory compared to iteration.", "Iterative function is always better and simpler to write than recursion."},
            {"  How many functions are required to create a recursive functionality.?", "One", "Two", "More than two", "None of the above"},
            {"  Choose a correct statement about Recursive Function in C language.", "Pointers can also be used with Recursion but with difficulty", "Each recursion creates new variables at same memory locations", "There is limit on the number of Recursive calls", "All the above"},
            {"  What is an Array in C language.?", "All the above.", "A group of elements of same data type.", "An array contains more than one element", "Array elements are stored in memory in continuous or contiguous locations."},
            {"  An entire array is always passed by _ to a called function.", "Call by reference", "Call by value", "Address relocation", "Address restructure"},
            {"  Can we change the starting index of an array from 0 to 1 in any way.?", "None of the above.", "Yes. Through pointers.", "Yes. Through Call by Value", "Yes. Through Call by Reference."},
            {"  If an integer array pointer is incremented, how many bytes will be skipped to reach next element location.?", "2", "1", "8", "None of the above"},
            {"  Difference between C Arrays, ary[10] and cry[10][10] is.?", "ary[10] is a single dimensional array. cry[10][10] is a Multidimensional array.", "ary[10] is a multidimensional array. cry[10][10] is a single dimensional array.", "Size of ary[10] is sizeof(10* int). Size of cry[10][10] is sizeof(10*int).", "None of the above."},
            {"  Array of Arrays is also called.?", "Multi Dimensional Array", "Multi Data Array", "Multi Size Array", "Multi Byte Array"},
            {"  Recursion is a method in which the solution of a problem depends on ____", "Smaller instances of the same problem", "Larger instances of different problems", "Larger instances of the same problem", "Smaller instances of different problems"},
            {"  Which of the following problems can’t be solved using recursion?", "Problems without base case", "Factorial of a number", "Nth fibonacci number", "Length of a string"},
            {"  Recursion is similar to which of the following?", "Loop", "Switch Case", "If-else", "if elif else"},
            {"  In recursion, the condition for which the function will stop calling itself is ____", "Base case", "Best case", "Worst case", "There is no such condition"},
            {"  The data structure used to implement recursive function calls __", "Stack", "Array", "Linked list", "Binary tree"}
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);

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
                    Intent intent = new Intent(getApplicationContext(), ResultActivity3.class);
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
