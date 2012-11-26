package nl.computerhuys.simplescore;

import nl.computerhuys.simplescore.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button scoretoevoegenButton; 
	RadioButton radio11RadioButton;
	RadioButton radio12RadioButton;
	RadioButton radio13RadioButton;
	RadioButton radio21RadioButton;
	RadioButton radio22RadioButton;
	RadioButton radio23RadioButton;
	RadioButton radio31RadioButton;
	RadioButton radio32RadioButton;
	RadioButton radio33RadioButton;
	RadioGroup radioGroup1;
	RadioGroup radioGroup2;
	RadioGroup radioGroup3;
	RadioGroup testgit;
	
	TextView textView15;
	TextView textView16;
	TextView textView17;
	TextView textView18;
	TextView textView19;
	TextView textView20;
	TextView textView21;
	TextView textView22;
	TextView textView23;
	TextView textView24;
	TextView textView25;
	TextView textView26;
	
	TextView textView27;
	TextView textView28;
	TextView textView29;
	TextView textView30;
	TextView textView31;
	TextView textView32;
	TextView textView33;
	TextView textView34;
	TextView textView35;
	TextView textView36;
	TextView textView37;
	TextView textView38;
	
	int speler1score = 0;
	int speler2score = 0;
	int speler3score = 0;

	int speler1score123 = 0;
	int speler1score12 = 0;
	int speler1score13 = 0;
	int speler1score23 = 0;
	int speler2score123 = 0;
	int speler2score12 = 0;
	int speler2score13 = 0;
	int speler2score23 = 0;
	int speler3score123 = 0;
	int speler3score12 = 0;
	int speler3score13 = 0;
	int speler3score23 = 0;
	
	int speler1sumscore123 = 0;
	int speler1sumscore12 = 0;
	int speler1sumscore13 = 0;
	int speler1sumscore23 = 0;
	int speler2sumscore123 = 0;
	int speler2sumscore12 = 0;
	int speler2sumscore13 = 0;
	int speler2sumscore23 = 0;
	int speler3sumscore123 = 0;
	int speler3sumscore12 = 0;
	int speler3sumscore13 = 0;
	int speler3sumscore23 = 0;
	
	int kolom = 0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        scoretoevoegenButton = (Button) this.findViewById(R.id.button1);
        radio11RadioButton = (RadioButton) this.findViewById(R.id.radio11);
        radio12RadioButton = (RadioButton) this.findViewById(R.id.radio12);
        radio13RadioButton = (RadioButton) this.findViewById(R.id.radio13);
        radio21RadioButton = (RadioButton) this.findViewById(R.id.radio21);
        radio22RadioButton = (RadioButton) this.findViewById(R.id.radio22);
        radio23RadioButton = (RadioButton) this.findViewById(R.id.radio23);
        radio31RadioButton = (RadioButton) this.findViewById(R.id.radio31);
        radio32RadioButton = (RadioButton) this.findViewById(R.id.radio32);
        radio33RadioButton = (RadioButton) this.findViewById(R.id.radio33);

        radioGroup1 = (RadioGroup) this.findViewById(R.id.radioGroup1);
        radioGroup2 = (RadioGroup) this.findViewById(R.id.radioGroup2);
        radioGroup3 = (RadioGroup) this.findViewById(R.id.radioGroup3);
        
    	textView15 = (TextView) this.findViewById(R.id.textView15);
    	textView16 = (TextView) this.findViewById(R.id.textView16);
    	textView17 = (TextView) this.findViewById(R.id.textView17);
    	textView18 = (TextView) this.findViewById(R.id.textView18);
    	textView19 = (TextView) this.findViewById(R.id.textView19);
    	textView20 = (TextView) this.findViewById(R.id.textView20);
    	textView21 = (TextView) this.findViewById(R.id.textView21);
    	textView22 = (TextView) this.findViewById(R.id.textView22);
    	textView23 = (TextView) this.findViewById(R.id.textView23);
    	textView24 = (TextView) this.findViewById(R.id.textView24);
    	textView25 = (TextView) this.findViewById(R.id.textView25);
    	textView26 = (TextView) this.findViewById(R.id.textView26);

     	textView27 = (TextView) this.findViewById(R.id.textView27);
    	textView28 = (TextView) this.findViewById(R.id.textView28);
    	textView29 = (TextView) this.findViewById(R.id.textView29);
    	textView30 = (TextView) this.findViewById(R.id.textView30);
    	textView31 = (TextView) this.findViewById(R.id.textView31);
    	textView32 = (TextView) this.findViewById(R.id.textView32);
    	textView33 = (TextView) this.findViewById(R.id.textView33);
    	textView34 = (TextView) this.findViewById(R.id.textView34);
    	textView35 = (TextView) this.findViewById(R.id.textView35);
    	textView36 = (TextView) this.findViewById(R.id.textView36);
    	textView37 = (TextView) this.findViewById(R.id.textView37);
    	textView38 = (TextView) this.findViewById(R.id.textView38);
    }

    public void radio11ClickHandler(View v) {
    	speler1score = 3;
    }

    public void radio12ClickHandler(View v) {
    	speler1score = 2;
    }

    public void radio13ClickHandler(View v) {
    	speler1score = 1;
    }

    public void radio21ClickHandler(View v) {
    	speler2score = 3;
    }

    public void radio22ClickHandler(View v) {
    	speler2score = 2;
    }

    public void radio23ClickHandler(View v) {
    	speler2score = 1;
    }

    public void radio31ClickHandler(View v) {
    	speler3score = 3;
    }

    public void radio32ClickHandler(View v) {
    	speler3score = 2;
    }

    public void radio33ClickHandler(View v) {
    	speler3score = 1;
    }

    public void scoretoevoegenClickHandler(View v) {
    	scoreTonen();
    }
    
    public void resetClickHandler(View v) {
    	speler1score = 0;
    	speler2score = 0;
    	speler3score = 0;
    	
    	radioGroup1.clearCheck();
    	radioGroup2.clearCheck();
    	radioGroup3.clearCheck();
        
    	textView15.setText(null);
    	textView16.setText(null);
    	textView17.setText(null);
    	textView18.setText(null);
    	textView19.setText(null);
    	textView20.setText(null);
    	textView21.setText(null);
    	textView22.setText(null);
    	textView23.setText(null);
    	textView24.setText(null);
    	textView25.setText(null);
    	textView26.setText(null);

    }
    
    public void scoreTonen() {
    	
    	kolom = 0;
    	if (speler1score!=0) {
    		if (speler2score!=0 && speler3score!=0) {
    			kolom = 123;
    		}
    		if (speler2score!=0 && speler3score==0) {
    			kolom = 12;
    		}
    		if (speler2score==0 && speler3score!=0) {
    			kolom = 13;
    		}
    		switch (kolom) {
    		case 123: 
    	    	textView15.setText(Integer.toString(speler1score));
    	    	break;
    		case 12:	
    	    	textView16.setText(Integer.toString(speler1score));
    	    	break;
    		case 13:
    	    	textView17.setText(Integer.toString(speler1score));
    	    	break;
    	    default: // niets doen	
    		}
    	}
    	
    	kolom = 0;
    	if (speler2score!=0) {
    		if (speler1score!=0 && speler3score!=0) {
    			kolom = 123;
    		}
    		if (speler1score!=0 && speler3score==0) {
    			kolom = 12;
    		}
    		if (speler1score==0 && speler3score!=0) {
    			kolom = 23;
    		}
    		switch (kolom) {
    		case 123: 
    	    	textView19.setText(Integer.toString(speler2score));
    	    	break;
    		case 12:	
    	    	textView20.setText(Integer.toString(speler2score));
    	    	break;
    		case 23:
    	    	textView22.setText(Integer.toString(speler2score));
    	    	break;
    	    default: // niets doen	
    		}
    	}
    	
    	kolom = 0;
    	if (speler3score!=0) {
    		if (speler1score!=0 && speler2score!=0) {
    			kolom = 123;
    		}
    		if (speler1score!=0 && speler2score==0) {
    			kolom = 13;
    		}
    		if (speler1score==0 && speler2score!=0) {
    			kolom = 23;
    		}
    		switch (kolom) {
    		case 123: 
    	    	textView23.setText(Integer.toString(speler3score));
    	    	break;
    		case 13:	
    	    	textView25.setText(Integer.toString(speler3score));
    	    	break;
    		case 23:
    	    	textView26.setText(Integer.toString(speler3score));
    	    	break;
    	    default: // niets doen	
    		}
    	}
    }
    
    public void saveClickHandler(View v) {
    	
    	kolom = 0;
    	if (speler1score!=0) {
    		if (speler2score!=0 && speler3score!=0) {
    			kolom = 123;
    		}
    		if (speler2score!=0 && speler3score==0) {
    			kolom = 12;
    		}
    		if (speler2score==0 && speler3score!=0) {
    			kolom = 13;
    		}
    		switch (kolom) {
    		case 123: 
    	    	speler1sumscore123 = speler1sumscore123 + speler1score;
    	    	textView27.setText(Integer.toString(speler1sumscore123));
    	    	break;
    		case 12:	
    	    	speler1sumscore12 = speler1sumscore12 + speler1score;
    	    	textView28.setText(Integer.toString(speler1sumscore12));
    	    	break;
    		case 13:
    	    	speler1sumscore13 = speler1sumscore13 + speler1score;
    	    	textView29.setText(Integer.toString(speler1sumscore13));
    	    	break;
    	    default: // niets doen	
    		}
    	}
    	
    	kolom = 0;
    	if (speler2score!=0) {
    		if (speler1score!=0 && speler3score!=0) {
    			kolom = 123;
    		}
    		if (speler1score!=0 && speler3score==0) {
    			kolom = 12;
    		}
    		if (speler1score==0 && speler3score!=0) {
    			kolom = 23;
    		}
    		switch (kolom) {
    		case 123: 
    	    	speler2sumscore123 = speler2sumscore123 + speler2score;
    	    	textView31.setText(Integer.toString(speler2sumscore123));
    	    	break;
    		case 12:	
    	    	speler2sumscore12 = speler2sumscore12 + speler2score;
    	    	textView32.setText(Integer.toString(speler2sumscore12));
    	    	break;
    		case 23:
    	    	speler2sumscore23 = speler2sumscore23 + speler2score;
    	    	textView34.setText(Integer.toString(speler2sumscore23));
    	    	break;
    	    default: // niets doen	
    		}
    	}
    	
    	kolom = 0;
    	if (speler3score!=0) {
    		if (speler1score!=0 && speler2score!=0) {
    			kolom = 123;
    		}
    		if (speler1score!=0 && speler2score==0) {
    			kolom = 13;
    		}
    		if (speler1score==0 && speler2score!=0) {
    			kolom = 23;
    		}
    		switch (kolom) {
    		case 123: 
    	    	speler3sumscore123 = speler3sumscore123 + speler3score;
    	    	textView35.setText(Integer.toString(speler3sumscore123));
    	    	break;
    		case 13:	
    	    	speler3sumscore13 = speler3sumscore13 + speler3score;
    	    	textView37.setText(Integer.toString(speler3sumscore13));
    	    	break;
    		case 23:
    	    	speler3sumscore23 = speler3sumscore23 + speler3score;
    	    	textView38.setText(Integer.toString(speler3sumscore23));
    	    	break;
    	    default: // niets doen	
    		}
    	}
    	
    	sumScoreTonen();
    }

    public void sumScoreTonen() {
    	
    	textView27.setText(Integer.toString(speler1sumscore123));
    	textView28.setText(Integer.toString(speler1sumscore12));
    	textView29.setText(Integer.toString(speler1sumscore13));
    	textView30.setText(Integer.toString(speler1sumscore23));
    	textView31.setText(Integer.toString(speler2sumscore123));
    	textView32.setText(Integer.toString(speler2sumscore12));
    	textView33.setText(Integer.toString(speler2sumscore13));
    	textView34.setText(Integer.toString(speler2sumscore23));
    	textView35.setText(Integer.toString(speler3sumscore123));
    	textView36.setText(Integer.toString(speler3sumscore12));
    	textView37.setText(Integer.toString(speler3sumscore13));
    	textView38.setText(Integer.toString(speler3sumscore23));
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
