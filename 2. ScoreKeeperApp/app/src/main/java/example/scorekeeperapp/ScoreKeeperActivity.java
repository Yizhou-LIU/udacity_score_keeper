package example.scorekeeperapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ScoreKeeperActivity extends AppCompatActivity {

    int num1 = 0, num2 = 0;
    int count = 0;
    TextView tvTeam1, tvTeam2, tvCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.action_name);
        setSupportActionBar(toolbar);

        tvTeam1 = (TextView)findViewById(R.id.tv_team1);
        tvTeam2 = (TextView)findViewById(R.id.tv_team2);
        tvCount = (TextView)findViewById(R.id.tv_count);

        Button btnPoint1 = (Button)findViewById(R.id.btn_point1);
        btnPoint1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = num1 + 1;
                tvTeam1.setText(Integer.toString(num1));
            }
        });

        Button btnPoint2 = (Button)findViewById(R.id.btn_point2);
        btnPoint2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = num1 + 2;
                tvTeam1.setText(Integer.toString(num1));
            }
        });

        Button btnPoint3 = (Button)findViewById(R.id.btn_point3);
        btnPoint3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = num1 + 3;
                tvTeam1.setText(Integer.toString(num1));
            }
        });

        Button btnTPoint1 = (Button)findViewById(R.id.btn_tpoint1);
        btnTPoint1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = num2 + 1;
                tvTeam2.setText(Integer.toString(num2));
            }
        });

        Button btnTPoint2 = (Button)findViewById(R.id.btn_tpoint2);
        btnTPoint2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = num2 + 2;
                tvTeam2.setText(Integer.toString(num2));
            }
        });

        Button btnTPoint3 = (Button)findViewById(R.id.btn_tpoint3);
        btnTPoint3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = num2 + 3;
                tvTeam2.setText(Integer.toString(num2));
            }
        });

        Button btnReset = (Button)findViewById(R.id.btn_reset);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = 0;
                num2 = 0;
                count = 0;
                tvTeam1.setText(Integer.toString(num1));
                tvTeam2.setText(Integer.toString(num2));
                tvCount.setText(Integer.toString(count));
            }
        });

        Button btnCount1 = (Button)findViewById(R.id.btn_countplus);
        btnCount1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tvCount.setText(Integer.toString(count));
            }
        });

        Button btnCount2 = (Button)findViewById(R.id.btn_countminus);
        btnCount2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(count < 1) {
                    Toast.makeText(ScoreKeeperActivity.this, "Level Zero", Toast.LENGTH_SHORT).show();
                }
                else {
                    count--;
                    tvCount.setText(Integer.toString(count));
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
