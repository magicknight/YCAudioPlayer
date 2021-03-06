package cn.ycbjie.ycaudioplayer.kotlin.view.fragment

import android.annotation.SuppressLint
import android.view.View
import cn.ycbjie.ycaudioplayer.R
import cn.ycbjie.ycaudioplayer.base.view.BaseLazyFragment
import cn.ycbjie.ycaudioplayer.kotlin.view.activity.AndroidAboutActivity
import cn.ycbjie.ycaudioplayer.kotlin.view.activity.AndroidLoginActivity
import com.blankj.utilcode.util.ActivityUtils
import com.blankj.utilcode.util.AppUtils
import kotlinx.android.synthetic.main.fragment_android_profile.*

class AndroidProfileFragment : BaseLazyFragment(), View.OnClickListener {

    override fun getContentView(): Int {
        return R.layout.fragment_android_profile
    }

    @SuppressLint("SetTextI18n")
    override fun initView(view: View) {
        tvVersionName.text = "v" + AppUtils.getAppVersionCode()
    }

    override fun initListener() {
        llProfile.setOnClickListener(this)
        rlTheme.setOnClickListener(this)
        rlCollect.setOnClickListener(this)
        rlAbout.setOnClickListener(this)
    }

    override fun initData() {

    }


    override fun onLazyLoad() {

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.llProfile ->{
                ActivityUtils.startActivity(AndroidLoginActivity::class.java)
            }
            R.id.rlTheme ->{

            }
            R.id.rlCollect ->{

            }
            R.id.rlAbout ->{
                AndroidAboutActivity.lunch(activity)
            }
        }
    }

}