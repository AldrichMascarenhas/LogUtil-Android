import android.util.Log

/**
 * Created by aldrichmascarenhas on 06/12/2017.
 */
class ErrorUtl {

    private val tag : String = "ErrorUtil"

    fun e(message : String) {
        Log.e(tag, message)
    }
}