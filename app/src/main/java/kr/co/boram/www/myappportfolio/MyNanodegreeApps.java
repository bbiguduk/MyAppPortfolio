package kr.co.boram.www.myappportfolio;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MyNanodegreeApps extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_nanodegree_apps);

        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);
        Button btn3 = (Button)findViewById(R.id.btn3);
        Button btn4 = (Button)findViewById(R.id.btn4);
        Button btn5 = (Button)findViewById(R.id.btn5);
        Button btn6 = (Button)findViewById(R.id.btn6);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Resources resources = this.getResources();
        String message = "";

        Button btn = (Button)v;
        String btnName = btn.getText().toString();

        switch (v.getId()) {
            case R.id.btn1:
                message = String.format(resources.getString(R.string.btn_toast), btnName);
                break;
            case R.id.btn2:
                message = String.format(resources.getString(R.string.btn_toast), btnName);
                break;
            case R.id.btn3:
                message = String.format(resources.getString(R.string.btn_toast), btnName);
                break;
            case R.id.btn4:
                message = String.format(resources.getString(R.string.btn_toast), btnName);
                break;
            case R.id.btn5:
                message = String.format(resources.getString(R.string.btn_toast), btnName);
                break;
            case R.id.btn6:
                message = String.format(resources.getString(R.string.btn_toast), btnName);
                break;
        }

        Toast.makeText(this, message,Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_nanodegree_apps, menu);
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
