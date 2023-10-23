package com.example.mad_practical5_21012011082

import androidx.appcompat.app.AppCompatActivity import android.os.Bundle
import android.util.Log import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() { val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMsg("onCreate method is called.")
    }

    override fun onStart() { super.onStart()
        showMsg("onStart method is called.")
    }

    override fun onResume() { super.onResume()
        showMsg("onResume method is called.")
    }

    override fun onPause() { super.onPause()
        showMsg("onPause method is called.")
    }

    override fun onStop() { super.onStop()
        showMsg("onStop method is called.")
    }

    override fun onDestroy() { super.onDestroy()
        showMsg("onDestroy method is called.")
    }

    override fun onRestart() { super.onRestart()
        showMsg("onRestart method is called.")
    }

    fun showMsg(message: String) { Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        val constraint : ConstraintLayout? =
            findViewById(R.id.mainConstraint)
        if (constraint != null){

            Snackbar.make(constraint,message,Snackbar.LENGTH_SHORT).show()
        }
    }
}
