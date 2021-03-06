package tw.edu.pu.s410754469.beargohome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //intent 按下shape到第3-1頁
        shape.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                intent = Intent(this@MainActivity2, MainActivity31::class.java)
                startActivity(intent)
            }
        })
        //intent 按下color到第3-2頁
        color.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                intent = Intent(this@MainActivity2, MainActivity32::class.java)
                startActivity(intent)
            }
        })
    }
}