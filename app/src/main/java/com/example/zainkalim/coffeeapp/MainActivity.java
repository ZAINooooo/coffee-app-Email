package com.example.zainkalim.coffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int no = 0;
    int priceofcoffee = 80;
    int priceoftea = 60;
    int priceofgreentea = 40;


    public void decrementcoffee1(View view) {
        display(--no);
        priceofcoffee = no * 80;
        displayPrice("Rs." + priceofcoffee);

    }

    public void incrementcoffee1(View view) {

        display(++no);
        priceofcoffee = no * 80;
        displayPrice("Rs." + priceofcoffee);

    }

    public void decreamenttea1(View view) {
        display2(--no);
        priceoftea = no * 60;
        displayPrice2("Rs." + priceoftea);

    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.coffeequantity_1);
        quantityTextView.setText("" + number);

    }

    private void displayPrice(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.coffeeprice_1);
        priceTextView.setText(message);
    }


    public void incrementtea1(View view) {

        display2(++no);
        priceoftea = no * 60;
        displayPrice2("Rs." + priceoftea);


    }

    private void display2(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teaquantity_1);
        quantityTextView.setText("" + number);

    }

    private void displayPrice2(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.teaprice_1);
        priceTextView.setText(message);
    }


    public void decrementgreen1(View view) {
        display3(--no);
        priceofgreentea = no * 2;
        displayPrice3("Rs." + priceofgreentea);

    }


    public void incrementgreen1(View view) {

        display3(++no);
        priceofgreentea = no * 2;
        displayPrice3("Rs." + priceofgreentea);


    }

    private void displayPrice3(String message) {


        TextView priceTextView = (TextView) findViewById(R.id.greenteaprice_1);
        priceTextView.setText(message);

    }

    private void display3(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.greenteaquantity_1);
        quantityTextView.setText("" + number);

    }


    public void finalmessage(View view) {


        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"zainkalim92@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "subject of email");
        i.putExtra(Intent.EXTRA_TEXT, "body of email");

        String message = "Thank for placing the order please wait, Total bill is Rs:" + priceofcoffee;
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, "Login to your account to get your order id.", Toast.LENGTH_SHORT).show();

        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {


        }
    }


    public void finalmessage2(View view) {

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"zainkalim92@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "subject of email");
        i.putExtra(Intent.EXTRA_TEXT, "body of email");

        String message = "Thank for placing the order please wait, Total bill is Rs:" + priceoftea;
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, "Login to your account to get your order id.", Toast.LENGTH_SHORT).show();

        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {


        }
    }

    public void finalmessage3(View view) {

        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"zainkalim92@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "subject of email");
        i.putExtra(Intent.EXTRA_TEXT, "body of email");

        String message = "Thank for placing the order please wait, Total bill is Rs:" + priceofgreentea;
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, "Login to your account to get your order id.", Toast.LENGTH_SHORT).show();

        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {


        }
    }
}



    /**
     * This method displays the given quantity value on the screen.
     */


    /**
     * This method displays the given price on the screen.
     */











    /*
     * This method displays the given price on the screen.
     */
