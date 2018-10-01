package supxx.com.retrofitdemo;

import android.app.Instrumentation;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;

import org.junit.Before;
import org.junit.runner.RunWith;

/**
 * zhouxiaoping
 * 2018/10/1/001
 * qq:2275188085
 */
@RunWith(AndroidJUnit4.class)
public class Test {

    public Instrumentation instrumentation;
    public UiDevice uiDevice;

    @Before
    public void init(){

        instrumentation = InstrumentationRegistry.getInstrumentation();
        uiDevice = UiDevice.getInstance(instrumentation);
    }

    @org.junit.Test
    public void test() throws RemoteException {
        uiDevice.pressRecentApps();
    }
}
