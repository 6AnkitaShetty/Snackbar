package nl.realworks.www.snackbar

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            Snackbar.make(it, "Floating Action button clicked", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }


        button1.setOnClickListener {
            val snackbar = Snackbar.make(coordinatorLayout, "Message is deleted", Snackbar.LENGTH_LONG)
                    .setAction("UNDO") {
                        val snackbar1 = Snackbar.make(coordinatorLayout, "Message is restore", Snackbar.LENGTH_LONG)
                        snackbar1.show()
                    }
            snackbar.show()
        }
        button2.setOnClickListener {
            val snackbar = Snackbar
                    .make(coordinatorLayout, "www.google.com", Snackbar.LENGTH_LONG)
            snackbar.show()
        }

        button3.setOnClickListener {
            val snackbar = Snackbar.make(coordinatorLayout, "Try again", Snackbar.LENGTH_LONG)
                    .setAction("RETRY") { }
            snackbar.setActionTextColor(Color.RED)
            val sbview = snackbar.view
            val textView = sbview.findViewById<TextView>(com.google.android.material.R.id.snackbar_text)
            textView.setTextColor(Color.YELLOW)
            snackbar.show()
        }
    }
}
