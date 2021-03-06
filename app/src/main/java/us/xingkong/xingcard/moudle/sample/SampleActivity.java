package us.xingkong.xingcard.moudle.sample;

import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import us.xingkong.xingcard.R;
import us.xingkong.xingcard.base.BaseActivity;

/**
 * @author hugeterry(http://hugeterry.cn)
 * 这只是mvp的例子，做其他界面可以再这个基础上根据提示写功能
 */
public class SampleActivity extends BaseActivity<SampleContract.Presenter> implements SampleContract.View {

    @BindView(R.id.tv_sample_text)
    TextView mTvSample;

    @Override
    protected SampleContract.Presenter createPresenter() {
        return new SamplePresenter(this);
    }

    @Override
    protected int bindLayout() {
        //TODO:添加视图，记得添加androidmanifest
        return R.layout.activity_sample;
    }

    @Override
    protected void prepareData() {
        //TODO:准备数据 比如：从数据库加载数据，或者网络请求数据等等
    }

    @Override
    protected void initView() {
        //TODO:初始化视图 比如：recycleview的准备，添加adapter等等
        mTvSample.setText("这是一个sample");
    }

    @Override
    protected void initData(Bundle savedInstanceState) {
        //TODO:初始化数据 比如：将数据加入到view中
    }

    @Override
    protected void initEvent() {
        //TODO:初始化事件监听 比如：增加监听器，下拉刷新，加载更多等等
    }
}
