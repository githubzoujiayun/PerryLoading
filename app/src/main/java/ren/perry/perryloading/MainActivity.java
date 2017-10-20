package ren.perry.perryloading;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ren.perry.perry.LoadingDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showLoading(View view) {

        LoadingDialog dialog = new LoadingDialog(this);
        dialog.setMsg("请稍等...");
        dialog.setNotCancel();//设置dialog不自动消失
        dialog.show();
    }
}
