package com.master.killercode.toolboxmsg;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

/**
 * Created by John on 09/12/2017.
 */

public class msg {


    //
    // 1° Context
    // 2° MSG para o Toast
    //



    public static void Funcao_TOAST(Context context, String texto) {
        Toast.makeText(
                context,
                texto,
                Toast.LENGTH_LONG
        ).show();
    }






    //
    // 1° Activity a receber o Alert
    // 2° MSG para o Alert
    // 3° Evento de Click para receber no evento ok
    // 4° Evento de Click para receber no evento Cancelar
    //
    //Evento Exenplo
    //    DialogInterface.OnClickListener acao = new DialogInterface.OnClickListener() {
    //        @Override
    //        public void onClick(DialogInterface dialogInterface, int i) {
    //            Açoes do evento
    //        }
    //    };

    public static void Funcao_Dialog_OK_CANCEL(Activity activity, String message, DialogInterface.OnClickListener okListener, DialogInterface.OnClickListener cancelListener) {
        new AlertDialog.Builder(activity)
                .setMessage(message)
                .setPositiveButton("Permitir", okListener)
                .setNegativeButton("Cancelar", cancelListener)
                .create()
                .show();
    }

    public static void Funcao_Dialog_OK(Activity activity, String message, String btn_text, DialogInterface.OnClickListener okListener) {
        new AlertDialog.Builder(activity)
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton(btn_text, okListener)
                .create()
                .show();
    }



}
