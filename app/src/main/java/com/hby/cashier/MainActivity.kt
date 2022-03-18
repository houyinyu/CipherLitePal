package com.hby.cashier

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hby.cashier.Bean.LitePalMessageBean
import com.hby.cashier.auxiliary.ScreenManager
import com.hby.cashier.auxiliary.TextDisplay


/**
 * @author: Hyy - 825129541@qq.com <br/>
 * creatTime: 2022-3-16 10:58:57 <br/>
 *<p/>
 * Describe:  <br/>
 * Params: No IntentKEY <br/>
 */

class MainActivity : AppCompatActivity() {

    private val screenManager = ScreenManager.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        screenManager.init(this)
        val display = screenManager.getPresentationDisplays()
        val textDisplay = TextDisplay(this, display)
        textDisplay.show()

        val litepalMessage= LitePalMessageBean()

        litepalMessage.setSellerID("哈哈哈哈1");
        litepalMessage.setBuyerID("哈哈哈哈2");
        litepalMessage.setShopID("哈哈哈哈3");
        litepalMessage.setMessageJson("哈哈哈哈4");
        litepalMessage.save();
    }

}
