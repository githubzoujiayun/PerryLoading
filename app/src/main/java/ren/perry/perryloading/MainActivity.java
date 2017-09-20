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
//        new LoadingDialog(this, "请稍候").notCancel().show();

        LoadingDialog dialog = new LoadingDialog(this);
        dialog.setMsg("msg");
        dialog.setNotCancel();
        dialog.show();
    }
}
