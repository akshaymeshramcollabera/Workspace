import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Test;

public class Hemcrest {
    @Test
    public void testEmailID() {  // JUnit Test case
        String email = "tbarua1@gmail.com";
        Assert.assertTrue(email.contains("@"));
    }

    @Test
    public void testEmailIDHamcrest() {  // Hamcrest Test case
        String email = "tbarua1@gmail.com";
        Assert.assertThat(email, StringContains.containsString("gmail.com"));
    }

    @Test
    public void endsWiths()
    {
        String name = "Akshay";
        Assert.assertTrue(name, name.endsWith("y"));
    }

    @Test
    public void containsMethod()
    {
        String mailId = "akshay.meshram@collabera.com";
        Assert.assertTrue(mailId, mailId.contains("@"));
    }


}