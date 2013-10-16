package is.blikar.blikinn;

import is.blikar.blikinn.R;
import is.blikar.blikinn.NewsScreenActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_screen);
	
		//BUTTONS
		
		//Button for 'Fréttir'
		Button btnNewsMainScreen = (Button) findViewById(R.id.btnNewsMainScreen);
    
		//Listening to button event
		btnNewsMainScreen.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				//Starting a new Intent
				Intent NewsScreen = new Intent(getApplicationContext(), NewsScreenActivity.class);

				startActivity(NewsScreen);
			}
		});
		
		//Button for 'Leikir & úrslit'
		Button btnGamesResultsMainScreen = (Button) findViewById(R.id.btnGamesResultsMainScreen);
	    
		//Listening to button event
		btnGamesResultsMainScreen.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				//Starting a new Intent
				Intent GamesResultsScreen = new Intent(getApplicationContext(), GamesResultsScreenActivity.class);

				startActivity(GamesResultsScreen);
			}
		});
		
		//Button for 'Leikmenn'
		Button btnPlayersMainScreen = (Button) findViewById(R.id.btnPlayersMainScreen);
	    
		//Listening to button event
		btnPlayersMainScreen.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				//Starting a new Intent
				Intent PlayersMenScreen = new Intent(getApplicationContext(), PlayersMenScreenActivity.class);

				startActivity(PlayersMenScreen);
			}
		});
		
		//Button for 'Bikaraskápurinn'
		Button btnTrophiesMainScreen = (Button) findViewById(R.id.btnTrophiesMainScreen);
	    
		//Listening to button event
		btnTrophiesMainScreen.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				//Starting a new Intent
				Intent TrophiesMenScreen = new Intent(getApplicationContext(), TrophiesMenScreenActivity.class);

				startActivity(TrophiesMenScreen);
			}
		});
		
		//Button for 'Myndir'
		Button btnPicturesMainScreen = (Button) findViewById(R.id.btnPicturesMainScreen);
	    
		//Listening to button event
		btnPicturesMainScreen.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				//Starting a new Intent
				Intent PicturesScreen = new Intent(getApplicationContext(), PicturesScreenActivity.class);

				startActivity(PicturesScreen);
			}
		});
		
		//Button for 'Útvarp'
		Button btnRadioMainScreen = (Button) findViewById(R.id.btnRadioMainScreen);
	    
		//Listening to button event
		btnRadioMainScreen.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				//Starting a new Intent
				Intent RadioScreen = new Intent(getApplicationContext(), RadioScreenActivity.class);

				startActivity(RadioScreen);
			}
		});
		
		//Button for 'Blikar TV'
		Button btnTvMainScreen = (Button) findViewById(R.id.btnTvMainScreen);
	    
		//Listening to button event
		btnTvMainScreen.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				//Starting a new Intent
				Intent TvScreen = new Intent(getApplicationContext(), TvScreenActivity.class);

				startActivity(TvScreen);
			}
		});			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_screen, menu);
		return true;
	}

}
