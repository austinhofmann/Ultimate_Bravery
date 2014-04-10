package com.example.ubapplicationsample1;


import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.*;


public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		items.runMain();
		
		Button rand = (Button)findViewById(R.id.btnRandom);
		rand.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{
				//items boots1 = new items("Boots of Speed", "http://img1.wikia.nocookie.net/__cb20130319090217/leagueoflegends/images/4/4e/Boots_of_Speed_item.png", "Common", "Basic", null, "Unique - Enhanced Movement: +25 movement speed", null, null, null, null, "Movement", "325g", "227g");

				
				TextView display1 = (TextView)findViewById(R.id.display1);
				TextView display2 = (TextView)findViewById(R.id.display2);
				TextView display3 = (TextView)findViewById(R.id.display3);
				TextView display4 = (TextView)findViewById(R.id.display4);
				TextView display5 = (TextView)findViewById(R.id.display5);
				TextView display6 = (TextView)findViewById(R.id.display6);

				//EditText val = (EditText)findViewById(R.id.value);
				
				//double valu = Double.parseDouble(val.getText().toString());
				
				String name1 = items.getName(items.itemsArray[items.getBoots()]);
				String name2 = items.getName(items.itemsArray[items.getItems()]);
				String name3 = items.getName(items.itemsArray[items.getItems()]);
				String name4 = items.getName(items.itemsArray[items.getItems()]);
				String name5 = items.getName(items.itemsArray[items.getItems()]);
				String name6 = items.getName(items.itemsArray[items.getItems()]);
				
				display1.setText(name1);
				display2.setText(name2);
				display3.setText(name3);
				display4.setText(name4);
				display5.setText(name5);
				display6.setText(name6);
			}
		});
		
		
		
		
		
		
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
