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

public class quiz6 extends AppCompatActivity {


    private TextView countLabel, questionLabel;
    private Button answerBtn1, answerBtn2, answerBtn3, answerBtn4;

    private String rightAnswer;
    private int rightAnswerCount = 0;
    private int quizCount = 1;
    static final private int QUIZ_COUNT = 5;

    ArrayList<ArrayList<String>> quizArray = new ArrayList<>();

    String quizData[][] = {
            // {"Country", "Right Answer", "Choice1", "Choice2", "Choice3"}
            {"  Which one of the following is correct syntax for opening a file.", "FILE *fopen(const *filename, const char *mode)", "FILE *fopen(const *filename)", "FILE *open(const *filename, const char *mode)", "FILE open(const*filename)"},
            {"  What is the function of the mode ‘ w+’?", "create text file for update, discard previous contents if any", "create text file for writing, discard previous contents if any", "create text file for writing, do not discard previous contents if any", "create text file for update, do not discard previous contents if any"},
            {"  If the mode includes b after the initial letter, what does it indicates?", "binary file", "text file", "big text file", "blueprint text"},
            {"  ___removes the named file, so that a subsequent attempt to open it will fail.", "remove(const *filename)", "B remove(filename)", "remove()", "fclose(filename)"},
            {"  Which of the following mode argument is used to truncate?", "w", "a", "f", "t"},
            {"  Choose a C Formatted Input Output function below.", "All the above", "printf(), scanf()", "sprintf(), sscanf()", "fprintf(), fscanf()"},
            {"  What is the best case and worst case complexity of ordered linear search?", "O(1), O(n)", "O(nlogn), O(logn)", " O(logn), O(nlogn)", " O(n), O(1)"},
            {"  Where is linear searching used?", "When the list has only a few elements and When performing a single search in an unordered list", "Used all the time", "When performing a single search in an unordered list", "When the list has only a few elements"},
            {"  Which of the following is not a stable sorting algorithm?", "Selection sort", "Insertion sort", "Bubble sort", "Merge sort"},
            {"  Choose the right statement for fscanf() and scanf()", "fscanf() can specifies a stream from which to read whereas scanf() can read only from standard input", "fscanf() can read from standard input whereas scanf() specifies a stream from which to read", "fscanf() and scanf() has no difference in their functions", "fscanf() and scanf() can read from specified stream"},
            {"  Time complexity of bubble sort in best case is", "θ (n)", "θ (nlogn)", "θ (n2)", "θ (n(logn) 2)"},
            {"  The process of reversing the positions of two variables is called___.", "Swapping", "Sorting", "Inserting", "Selecting"},
            {"  Which of the following is not a stream", "standard file ", "standard input", "standard output", "standard error"},
            {"  One of the simplest sorting algorithms is called bubble sort. Do you know why?", "Smaller elements 'bubble' to the top", "The designer hoped more people would use his sort if it had a cute name", "It's a mystery. Why is anything called what it is, really?", "It encases each element in a 'bubble' before sorting them"},
            {"  What is the need for a File when you can store anything in memory.?", "All the above", "Memory (RAM) is limited in any computer.", "A file is stored on Hard Disk which can store Gigabytes of data.", "File stored on Hard Disk is safe even if PC is switched off. But Memory or RAM contents are cleared when PC is off."}
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz6);

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
                    Intent intent = new Intent(getApplicationContext(), ResultActivity6.class);
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


