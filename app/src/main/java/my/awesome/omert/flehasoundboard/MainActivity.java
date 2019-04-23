package my.awesome.omert.flehasoundboard;

import android.app.ListActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

    private ArrayList<Sound> mSounds  = null;
    private SoundAdapter     mAdapter = null;
    static  MediaPlayer      mMediaPlayer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	AppCenter.start(getApplication(), "524bc87b-6427-41fb-a461-d475cfd66ff1",
                  Analytics.class, Crashes.class);

        // Creating the list
        mSounds = new ArrayList<Sound>();

        // Adding a new sound (repeat for each felha sound there is
        Sound s1 = new Sound();
        s1.setDescription("Fleha 1");
        s1.setIconResourceId(R.mipmap.ic_goku);
        s1.setSoundResourceId(R.raw.fleha1);
        mSounds.add(s1);

        Sound s2 = new Sound();
        s2.setDescription("Fleha 2");
        s2.setIconResourceId(R.mipmap.ic_goku);
        s2.setSoundResourceId(R.raw.fleha2);
        mSounds.add(s2);

        Sound s3 = new Sound();
        s3.setDescription("Fleha 3");
        s3.setIconResourceId(R.mipmap.ic_goku);
        s3.setSoundResourceId(R.raw.fleha3);
        mSounds.add(s3);

        Sound s4 = new Sound();
        s4.setDescription("Fleha-Harit 1");
        s4.setIconResourceId(R.mipmap.ic_goku);
        s4.setSoundResourceId(R.raw.fleha4);
        mSounds.add(s4);

        Sound s5 = new Sound();
        s5.setDescription("Fleha-Harit 2");
        s5.setIconResourceId(R.mipmap.ic_goku);
        s5.setSoundResourceId(R.raw.fleha5);
        mSounds.add(s5);

        Sound s6 = new Sound();
        s6.setDescription("Fleha-Harit 3");
        s6.setIconResourceId(R.mipmap.ic_goku);
        s6.setSoundResourceId(R.raw.fleha6);
        mSounds.add(s6);

        Sound s7 = new Sound();
        s7.setDescription("Fleha-Harit 4");
        s7.setIconResourceId(R.mipmap.ic_goku);
        s7.setSoundResourceId(R.raw.fleha7);
        mSounds.add(s7);

        Sound s8 = new Sound();
        s8.setDescription("Fleha-Harit 5");
        s8.setIconResourceId(R.mipmap.ic_goku);
        s8.setSoundResourceId(R.raw.fleha8);
        mSounds.add(s8);

        Sound s9 = new Sound();
        s9.setDescription("Fleha-Idan 1");
        s9.setIconResourceId(R.mipmap.ic_goku);
        s9.setSoundResourceId(R.raw.fleha9);
        mSounds.add(s9);

        Sound s10 = new Sound();
        s10.setDescription("Fleha-Idan 2");
        s10.setIconResourceId(R.mipmap.ic_goku);
        s10.setSoundResourceId(R.raw.fleha10);
        mSounds.add(s10);

        Sound s11 = new Sound();
        s11.setDescription("Fleha-Idan 3");
        s11.setIconResourceId(R.mipmap.ic_goku);
        s11.setSoundResourceId(R.raw.fleha11);
        mSounds.add(s11);

        Sound s12 = new Sound();
        s12.setDescription("Fleha-Idan 4");
        s12.setIconResourceId(R.mipmap.ic_goku);
        s12.setSoundResourceId(R.raw.fleha12);
        mSounds.add(s12);

        Sound s13 = new Sound();
        s13.setDescription("Fleha-Idan 5");
        s13.setIconResourceId(R.mipmap.ic_goku);
        s13.setSoundResourceId(R.raw.fleha13);
        mSounds.add(s13);

        mAdapter = new SoundAdapter(this, R.layout.list_row, mSounds);
        setListAdapter(mAdapter);
    }

    @Override
    public void onListItemClick(ListView parent, View v, int position, long id) {
        Sound s = (Sound)mSounds.get(position);
        MediaPlayer mp = MediaPlayer.create(this, s.getSoundResourceId());

        mp.start();;
    }
}
