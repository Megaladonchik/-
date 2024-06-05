package com.example.mycat;

import android.content.Context;
import android.view.View;

public class StyleDialog extends View {
    private String StyleName;

    public StyleDialog(Context context) {
        super(context);
    }


    public String getStyleName() {
        return StyleName;
    }
    public void setStyleName(String styleName) {
        this.StyleName = styleName;
    }
}
