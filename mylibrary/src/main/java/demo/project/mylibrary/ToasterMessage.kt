package demo.project.mylibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {

    fun toastMessage(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

}