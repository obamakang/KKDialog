package me.obamakang.kkdialogexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import me.obamakang.kkdialog.KKDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.show_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
                //shareDialog();

            }
        });
    }

    private void shareDialog() {
        //ShareKKDialog dialog = new ShareKKDialog();
        //dialog.show(getSupportFragmentManager());
        EditTextDialog dialog = new EditTextDialog();
        dialog.show(getSupportFragmentManager());
    }

    private void showDialog() {
        KKDialog.create(getSupportFragmentManager())
                .setViewListener(new KKDialog.ViewListener() {
                    @Override
                    public void bindView(View v) {
                        initView(v);
                    }
                })
                .setLayoutRes(R.layout.dialog_layout)
                .setDimAmount(0.9f)
                .setTag("KKDialog")
                .show();
    }

    private void initView(final View view) {
        //final EditText editText = (EditText) view.findViewById(R.id.edit_text);
        //editText.post(new Runnable() {
        //    @Override
        //    public void run() {
        //        InputMethodManager inputMethodManager =
        //                (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        //        inputMethodManager.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT);
        //    }
        //});
        //editText.setText("Hello world");
    }
}
