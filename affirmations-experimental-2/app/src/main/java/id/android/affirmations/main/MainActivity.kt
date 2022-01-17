package id.android.affirmations.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.android.affirmations.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

//    val values = resources.getStringArray(R.array.fruits)
    val values = mutableListOf<String>()
    for (value in 0 until 100.plus(1)) {
      values.add("Fruit $value")
    }

    val adapter = MainAdapter(values)
    rv_main.adapter = adapter
  }
}