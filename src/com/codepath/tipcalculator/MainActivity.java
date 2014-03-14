package com.codepath.tipcalculator;



import java.text.DecimalFormat;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
//import android.support.v7.app.ActionBar;
//import android.support.v4.app.Fragment;
//import android.view.LayoutInflater;
//import android.view.MenuItem;
//import android.view.ViewGroup;
//import android.os.Build;

public class MainActivity extends ActionBarActivity {

	private EditText etBillAmount;
	private String strBillAmount;
	private double dblBillAmount;
//	private String strTipAmount;
    private EditText etTipAmount;
    private String strTipAmount;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
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
//	public void calculateTip(View v) {
//        String btnName = v.getResources().getResourceEntryName(v.getId());
//		switch(btnName) {
//	      case: btnName = "btn_tip_10pct";
//	        tip_pct = 10;
//	      case: btn_tip_15pct
//	        tip_pct = 15;
//	      case: btn_tip_20pct
//	        tip_pct = 20;
//	    }
//	    textField.getText().toString()
//		tip_amount = amount * 
//	    // set text field to 
//	    // calculate tip
//	    // set tipAmount field value to this amount
//	}	


//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//		// Handle action bar item clicks here. The action bar will
//		// automatically handle clicks on the Home/Up button, so long
//		// as you specify a parent activity in AndroidManifest.xml.
//		int id = item.getItemId();
//		if (id == R.id.action_settings) {
//			return true;
//		}
//		return super.onOptionsItemSelected(item);
//	}
}
