package demo.project.mylibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {

   companion object {
       fun getToast(context: Context, message: String) {
           Toast.makeText(context, message, Toast.LENGTH_LONG).show()
       }
   }

}