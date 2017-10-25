package ut.com.nclandrei.tutorial.pluginTest;

import org.junit.Test;
import com.nclandrei.tutorial.pluginTest.api.MyPluginComponent;
import com.nclandrei.tutorial.pluginTest.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}