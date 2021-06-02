package com.example.ppsr_18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_ps );
        configurebutton32();
        configurebutton29();
        configurebutton30();
        configurebutton31();
        configurebutton33();
        configurebutton35();
        configurebutton36();
        configurebutton2();
        configurebutton3();
        configurebutton4();
        configurebutton5();
        configurebutton86();
        configurebutton218();
    }

    private void configurebutton218() {
        Button button218 = (Button) findViewById(R.id.button218);
        button218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ps.this, quiz1.class));
            }

        });
    }

    private void configurebutton86() {
        Button button86 = (Button) findViewById(R.id.button86);
        button86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ps.this, operators.class));
            }

        });
    }

    private void configurebutton5() {
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ps.this, inputoutputstats.class));
            }

        });
    }

    private void configurebutton4() {
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ps.this, variables.class));
            }

        });
    }

    private void configurebutton3() {
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ps.this, datatypes.class));
            }
        });
    }

    private void configurebutton2() {
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ps.this, ctokens.class));
            }

        });
    }


    private void configurebutton36() {
        Button button36 = (Button) findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ps.this, structureofc.class));
            }

        });
    }


    private void configurebutton35() {
        Button button35 = (Button) findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ps.this, history.class));
            }

        });
    }

    private void configurebutton33() {
        Button button33 = (Button) findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ps.this, cnrprogs.class));
            }

        });
    }

    private void configurebutton31() {
        Button button31 = (Button) findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ps.this, programdsteps.class));
            }

        });
    }

    private void configurebutton30() {
        Button button30 = (Button) findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ps.this, flowchart.class));
            }

        });
    }

    private void configurebutton29() {
        Button button29 = (Button) findViewById(R.id.button29);
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ps.this, algorithm.class));
            }

        });

    }

    private void configurebutton32() {
        Button button32 = (Button) findViewById( R.id.button32 );
        button32.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( ps.this, cl.class ) );
            }

        } );
    }
}