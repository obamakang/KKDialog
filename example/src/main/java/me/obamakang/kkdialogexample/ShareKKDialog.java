package me.obamakang.kkdialogexample;

import android.view.View;
import me.obamakang.kkdialog.BaseKKDialog;

/**
 * Created by obamakang on 16/10/11.
 */

public class ShareKKDialog extends BaseKKDialog {

    @Override
    public int getLayoutRes() {
        return R.layout.dialog_layout;
    }

    @Override
    public void bindView(View v) {
        // do any thing you want
    }
}
