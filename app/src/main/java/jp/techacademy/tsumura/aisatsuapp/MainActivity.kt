package jp.techacademy.tsumura.aisatsuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.app.TimePickerDialog
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
    }
    override fun onClick(v:View){
        showTimePickerDialog()
    }

    private fun showTimePickerDialog(){
        val timePickerDialog=TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener() { view, hour, minute
                ->
                Log.d("UI_PARTS", "$hour:$minute")
            },
            13,0,true)
        timePickerDialog.show()

        //時刻によってあいさつを変えるメソッド案①
        val AAA= timePickerDialig.show() {
            if (2:00..9:59){
            textview.text = "おはよう"
        }else if(10:00..17:59){
            textview.text = "こんにちわ"
        }else if(18:00..1:59){
            textview.text = "こんばんわ"
        }else { textview.text = "error" }
        }

        //時刻によってあいさつを変えるメソッド案②
        val BBB=when(timePickerDialog.show()){
            2:00..9:59->"おはよう"
            10:00..17:59->"こんにちは"
            18:00..1:59->"こんばんは"
            else->"エラー"
        }
        textview.text="BBB"
    }

}
