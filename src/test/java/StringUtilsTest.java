import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilsTest {

    @Test
    public void testUpdateLight() {
        Assert.assertEquals(org.example.StringUtils.updateLight("green"), "yellow");
        Assert.assertEquals(org.example.StringUtils.updateLight("red"), "green");
    }

    @Test
    public void testRemove() {
        Assert.assertEquals(org.example.StringUtils.remove("String"), "trin");
    }

    @Test
    public void testStringUtils() {
        Assert.assertEquals(StringUtils.capitalize(null), null);
        Assert.assertEquals(StringUtils.capitalize(""), "");
        Assert.assertEquals(StringUtils.capitalize("cat"), "Cat");
        Assert.assertEquals(StringUtils.capitalize("cAt"), "CAt");
        Assert.assertEquals(StringUtils.capitalize("'cat'"), "'cat'");
    }
}
