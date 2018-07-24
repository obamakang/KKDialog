package me.obamakang.bottomdialogexample;

import android.view.View;
import me.obamakang.bottomdialog.BaseBottomDialog;

/**
 * Created by obamakang on 16/10/11.
 */

public class ShareBottomDialog extends BaseBottomDialog{

    @Override
    public int getLayoutRes() {
        return R.layout.dialog_layout;
    }

    @Override
    public void bindView(View v) {
        // do any thing you want
    }
}
