package ren.perry.perry;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.TextView;

/**
 * Email: pl.w@outlook.com
 * Created by perry on 2017/9/20.
 */

@SuppressWarnings("unused")
public class LoadingDialog extends Dialog {

    private String msg;
    private boolean isBackDismiss;

    public LoadingDialog(@NonNull Context context) {
        super(context, R.style.loading_dialog);
    }

    public LoadingDialog(@NonNull Context context, String msg) {
        super(context, R.style.loading_dialog);
        this.msg = msg;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_loading);
        setCanceledOnTouchOutside(false);
        ((TextView) findViewById(R.id.progress_tv)).setText(msg);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LoadingDialog notCancel() {
        isBackDismiss = true;
        return this;
    }

    public void setNotCancel() {
        isBackDismiss = true;
    }

    @Override
    public void onBackPressed() {
        if (!isBackDismiss) super.onBackPressed();
    }
}
