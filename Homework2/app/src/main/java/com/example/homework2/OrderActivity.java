package com.example.homework2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {
    private ImageView orderImageView;
    private TextView nameTextView;
    private TextView orderNumberTextView;
    private TextView totalTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity2);

        Intent intent = getIntent();
        //this is the amount of burgers ordered in that particular button click
        String totalPrice = intent.getStringExtra(BurgerDetailActivity.TOTAL_PRICE);
        String orderNumber = intent.getStringExtra(BurgerDetailActivity.ORDER_NUMBER);
        String burgerID = intent.getStringExtra(BurgerDetailActivity.BURGER_ID);

        int burgerIDD = Integer.parseInt(burgerID);

        Burger burger = MenuDatabase.getBurgerById(burgerIDD);

        nameTextView = findViewById(R.id.orderBurgerName);
        orderNumberTextView = findViewById(R.id.numberOfOrders);
        totalTextView = findViewById(R.id.totalPrice);
        orderImageView = findViewById(R.id.orderBurgerImage);


        orderImageView.setImageResource(burger.getImageID());
        nameTextView.setText(burger.getName());
        orderNumberTextView.setText(orderNumber);
        totalTextView.setText(totalPrice);

    }

}
