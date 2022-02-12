package assertDemo;

import org.hamcrest.core.StringEndsWith;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.core.StringStartsWith.startsWith;

public class endsDemo {
    @Test
    public void ending()
    {
        String abc = "akshay.meshram@collabera.com";
        assertThat(abc,  endsWith(".comhhhh"));
    }

}
