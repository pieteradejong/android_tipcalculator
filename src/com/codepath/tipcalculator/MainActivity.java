package com.codepath.tipcalculator;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	private EditText etBillAmount;
	private String strBillAmount;
	private double dblBillAmount;
    private EditText etTipAmount;
    private String strTipAmount;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void calculateTip10Pct(View v) {
		double dblBillAmount = getBillAmount();
		setTextfieldToTipAmount(dblBillAmount, 0.10);
	}
	
	public void calculateTip15Pct(View v) {
		double dblBillAmount = getBillAmount();
		setTextfieldToTipAmount(dblBillAmount, 0.15);
	}
	
	public void calculateTip20Pct(View v) {
		double dblBillAmount = getBillAmount();
		setTextfieldToTipAmount(dblBillAmount, 0.20);
	}
	
	public double getBillAmount() {
		etBillAmount = (EditText) findViewById(R.id.etAmount);
		strBillAmount = etBillAmount.getText().toString();
		dblBillAmount = Double.parseDouble(strBillAmount);
		return dblBillAmount;
	}
	
	public void setTextfieldToTipAmount(double dblBillAmount, double pct) {
		DecimalFormat df = new DecimalFormat("#.00");
		strTipAmount = df.format(dblBillAmount * pct);
		etTipAmount = (EditText) findViewById(R.id.etTipAmount);
		etTipAmount.setText(strTipAmount);
	}
}
