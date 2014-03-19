package com.codepath.tipcalculator;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	private EditText etBillAmount;
	private String strBillAmount;
	private double dblBillAmount;
    private EditText etTipAmount;
    private String strTipAmount;
    private int pct;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		etBillAmount = (EditText) findViewById(R.id.etAmount);
		etBillAmount.addTextChangedListener(new TextWatcher() {
	    	public void afterTextChanged(Editable s) {
	    		View v = getWindow().getDecorView();
	    		switch(pct) {
	    		  case 10: calculateTip10Pct(v); 
	    		  case 15: calculateTip15Pct(v);
	    		  case 20: calculateTip20Pct(v);
	    	      default: break;
	    		}
	    		return;	
	        }

	        @Override
	        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
	        }

	        @Override
	        public void onTextChanged(CharSequence s, int start, int before, int count) {
	        }
		});
	}
	
	public void calculateTip10Pct(View v) {
		pct = 10;
		double dblBillAmount = getBillAmount();
		setTextfieldToTipAmount(dblBillAmount, 0.10);
	}
	
	public void calculateTip15Pct(View v) {
		pct = 15;
		double dblBillAmount = getBillAmount();
		setTextfieldToTipAmount(dblBillAmount, 0.15);
	}
	
	public void calculateTip20Pct(View v) {
		pct = 20;
		double dblBillAmount = getBillAmount();
		setTextfieldToTipAmount(dblBillAmount, 0.20);
	}
	
	public double getBillAmount() {
		etBillAmount = (EditText) findViewById(R.id.etAmount);
		strBillAmount = etBillAmount.getText().toString();
		try {
		  dblBillAmount = Double.parseDouble(strBillAmount);	
		} catch(NumberFormatException e) {
	      Toast.makeText(getApplicationContext(), "Sorry, you didn't type an amount.", Toast.LENGTH_SHORT).show();
		}
		return dblBillAmount;
	}
	
	public void setTextfieldToTipAmount(double dblBillAmount, double pct) {
		DecimalFormat df = new DecimalFormat("#.00");
		strTipAmount = df.format(dblBillAmount * pct);
		etTipAmount = (EditText) findViewById(R.id.etTipAmount);
		etTipAmount.setText(strTipAmount);
	}
}
