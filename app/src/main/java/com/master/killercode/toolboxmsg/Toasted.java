package com.master.killercode.toolboxmsg;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.master.killercode.msg.R;

public class Toasted extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public Toasted(Context context) {
        super(context);
    }

    public static void makeAlert(Activity activity , String msg){
//        Toast ToastMessage = Toast.makeText(context,msg,Toast.LENGTH_SHORT);
//        View toastView = ToastMessage.getView();
//        toastView.setBackgroundColor(context.getResources().getColor(R.color.yellow_primary_dark));
//        toastView.setCol(context.getResources().getColor(R.color.yellow_primary_dark));
//        ToastMessage.show();

        LayoutInflater inflater = activity.getLayoutInflater();
        View toastLayout = inflater.inflate(R.layout.toast, (ViewGroup) activity.findViewById(R.id.llCustom));
        Toast toast = new Toast(activity);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastLayout);
        toast.show();
    }

    public static void makeLongAlert(Context context , String msg){
        Toast.makeText(
                context,
                msg,
                Toast.LENGTH_LONG
        ).show();
    }


}
