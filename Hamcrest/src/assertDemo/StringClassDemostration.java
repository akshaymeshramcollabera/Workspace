package assertDemo;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
public class StringClassDemostration {
    @Test
    public void testClassDemo(){
        assertThat("abc@gmail.com", containsString("abc"));
    }

}
