package otus.gpb.homework.activities

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract


class ContractFillEdit : ActivityResultContract<String, DTOuser?>() {

    override fun createIntent(context: Context, input: String): Intent {
        return Intent(context, FillFormActivity::class.java)
    }

    override fun parseResult(resultCode: Int, intent: Intent?): DTOuser? {
        if (intent == null) return null
        if (resultCode != Activity.RESULT_OK) return null

        return intent.getParcelableExtra("UserData")
    }

}