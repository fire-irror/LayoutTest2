package kr.hs.emirim.layouttest2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import org.w3c.dom.Text

class Direct5_3_Activity : AppCompatActivity() {
    lateinit var edit : EditText
    lateinit var text : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val linear2 = LinearLayout(this)
        linear2.orientation = LinearLayout.VERTICAL
        val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
        setContentView(linear2, params)


        edit = EditText(this)
        edit.hint = "Enter any text..."
        edit.textSize = 20f
        linear2.addView(edit)

        var txt = TextView(this)
        var btn = Button(this)
        btn.text="Clike me!"
        btn.setBackgroundColor(Color.rgb(255,0,255))
        linear2.addView(btn)

        text = TextView(this)
        text.text = "part of result"
        text.textSize = 20f
        text.setTextColor(Color.rgb(120,0,128))
        linear2.addView(text)

        btn.setOnClickListener {

            text.text = edit.text
        }
    }
}