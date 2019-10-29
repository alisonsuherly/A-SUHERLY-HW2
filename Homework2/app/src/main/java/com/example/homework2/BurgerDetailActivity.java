package com.example.homework2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BurgerDetailActivity extends AppCompatActivity {
    private ImageView burgerImageView;
    private TextView nameTextView;
    private TextView priceTextView;
    private TextView descriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.burger_detail_activity);

        Intent intent = getIntent();
        int burgerID = intent.getIntExtra("BurgerID", 0);
        Burger burger = MenuDatabase.getBurgerById(burgerID);

        burgerImageView = findViewById(R.id.burgerImage);
        nameTextView = findViewById(R.id.burgerName);
        priceTextView = findViewById(R.id.price);
        descriptionTextView = findViewById(R.id.burgerDescription);

        burgerImageView.setImageResource(burger.getImageID());
        nameTextView.setText(burger.getName());
        priceTextView.setText(burger.getPrice());
        descriptionTextView.setText(burger.getDescription());

    }

    int count=0;

    public void addButtonRespond(View view) {
        count++;
        TextView tv = findViewById(R.id.itemCount);
        tv.setText(String.valueOf(count));
    }

    public void minusButtonRespond(View view) {
        count--;
        TextView tv = findViewById(R.id.itemCount);
        tv.setText(String.valueOf(count));
    }

    public int getOrderNumber() {
        TextView itemCount = findViewById(R.id.itemCount);
        String getOrderNumber = itemCount.getText().toString();
        int orderNumberInt = Integer.parseInt(getOrderNumber);
        return orderNumberInt;
    }

    public int getTotalPrice() {
        TextView itemCount = findViewById(R.id.itemCount);
        TextView price = findViewById(R.id.price);
        String getPrice = price.getText().toString();
        int priceInt = Integer.parseInt(getPrice);
        String getOrderNumber = itemCount.getText().toString();
        int orderNumberInt = Integer.parseInt(getOrderNumber);
        int totalPrice = orderNumberInt*priceInt;
        return totalPrice;
    }

    public final static String TOTAL_PRICE = "total price";
    public final static String ORDER_NUMBER = "order number";
    public final static String BURGER_ID = "burger id";
    public final static String EXTRA_MESSAGE = "extra message";

    public void addToOrderButton2(View view) {
        int e = getTotalPrice();
        String totalPrice = Integer.toString(e);
        int d = getOrderNumber();
        String orderNumber = Integer.toString(d);

        Intent intent = getIntent();
        int burgerID = intent.getIntExtra("BurgerID", 0);
        Burger burger = MenuDatabase.getBurgerById(burgerID);
        String burgerIdString = Integer.toString(burgerID);

        Intent intent1 = new Intent(this, OrderActivity.class);
        intent1.putExtra(TOTAL_PRICE, totalPrice);
        intent1.putExtra(ORDER_NUMBER, orderNumber);
        intent1.putExtra(BURGER_ID, burgerIdString);
        startActivity(intent1);
    }

}
