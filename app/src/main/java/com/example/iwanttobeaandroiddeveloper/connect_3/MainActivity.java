package com.example.iwanttobeaandroiddeveloper.connect_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean flag=true;
    int draw=-1;

    int number,counter=0;
    int a[]={11,11,11,11,11,11,11,11,11,11};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void checkWhoWon(int number, boolean flag) {
        if (flag == false)//red
        {
            a[number] = 1;
            counter++;
            if ((a[1] + a[2] + a[3]) == 3 || (a[1] + a[4] + a[7]) == 3 || (a[1] + a[5] + a[9]) == 3 ||
                    (a[2] + a[5] + a[8]) == 3 || (a[3] + a[6] + a[9]) == 3 || (a[3] + a[5] + a[7]) == 3 ||
                    (a[4] + a[5] + a[6]) == 3 || (a[7] + a[8] + a[9]) == 3) {
                draw = 1;

                Toast.makeText(this, "Red WONN", Toast.LENGTH_LONG).show();
            }
        } else

        {
            a[number] = -1;
            counter++;
            if ((a[1] + a[2] + a[3]) == -3 || (a[1] + a[4] + a[7]) == -3 || (a[1] + a[5] + a[9]) == -3 ||
                    (a[2] + a[5] + a[8]) == -3 || (a[3] + a[6] + a[9]) == -3 || (a[3] + a[5] + a[7]) == -3 ||
                    (a[4] + a[5] + a[6]) == -3 || (a[7] + a[8] + a[9]) == -3) {
                draw = 1;
                Toast.makeText(this, "YELLOW WONN", Toast.LENGTH_LONG).show();
            }
        }

        Log.i("counte", String.valueOf(counter));
        if (counter == 9 && draw == -1) {

            Toast.makeText(this, "MATCH DRAWN", Toast.LENGTH_LONG).show();

        }
    }
    public void flagvalue(boolean flag, View view)  //method called everywhere
    {
        ImageView oneD = (ImageView) view;

        if (flag==true)
            oneD.setImageResource(R.drawable.yellow);
        else
            oneD.setImageResource(R.drawable.red);


        }


    public void one(View view) {

        if (view.getAlpha() == 0f && draw!=1) {
            flagvalue(flag,view);
            ImageView oneD = (ImageView) findViewById(R.id.oneD);
            oneD.animate().alpha(.89f).setDuration(2001);
            checkWhoWon(1,flag);
            flag=!flag;



        }

    }

    public void two(View view) {

        if (view.getAlpha() == 0f && draw!=1) {
            flagvalue(flag,view);
            ImageView twoD = (ImageView) findViewById(R.id.twoD);
            twoD.animate().alpha(.89f).setDuration(2000);

            checkWhoWon(2,flag);

            flag = !flag;


        }

    }

    public void three(View view) {
        if (view.getAlpha() == 0f&& draw!=1) {
            flagvalue(flag,view);
            ImageView threeD = (ImageView) findViewById(R.id.threeD);
            threeD.animate().alpha(.89f).setDuration(2000);
            checkWhoWon(3,flag);

            flag = !flag;



        }
    }

    public void four(View view) {

        if (view.getAlpha() == 0f&& draw!=1) {
            flagvalue(flag,view);

        ImageView fourD = (ImageView) findViewById(R.id.fourD);
            fourD.animate().alpha(.89f).setDuration(2000);

            checkWhoWon(4,flag);

            flag = !flag;


    }
    }

    public void five(View view) {

        if (view.getAlpha() == 0f&& draw!=1) {
            flagvalue(flag,view);
            ImageView fiveD = (ImageView) findViewById(R.id.fiveD);
            fiveD.animate().alpha(.89f).setDuration(2000);
            checkWhoWon(5,flag);
            flag = !flag;

        }
    }

    public void six(View view) {

        if (view.getAlpha() == 0f&& draw!=1) {
            flagvalue(flag,view);
            ImageView sixD = (ImageView) findViewById(R.id.sixD);
            sixD.animate().alpha(.89f).setDuration(2000);

            checkWhoWon(6,flag);
            flag = !flag;


        }
    }

    public void seven(View view) {
        if (view.getAlpha() == 0f&& draw!=1) {
            flagvalue(flag,view);

            ImageView sevenD = (ImageView) findViewById(R.id.sevenD);
            sevenD.animate().alpha(.89f).setDuration(2000);
            checkWhoWon(7,flag);


            flag = !flag;

        }
    }

    public void eight(View view) {

        if (view.getAlpha() == 0f&& draw!=1) {
            flagvalue(flag,view);
            ImageView eightD = (ImageView) findViewById(R.id.eightD);
            eightD.animate().alpha(.89f).setDuration(2000);
            checkWhoWon(8,flag);


            flag = !flag;

        }
    }

    public void nine(View view) {

        if (view.getAlpha() == 0f&& draw!=1) {
            flagvalue(flag,view);
            ImageView nineD = (ImageView) findViewById(R.id.nineD);
            nineD.animate().alpha(.89f).setDuration(2000);

            checkWhoWon(9,flag);

            flag = !flag;


        }
    }
}
