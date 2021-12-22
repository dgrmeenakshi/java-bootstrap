package Strings;

import org.testng.Assert;
import org.testng.annotations.*;

public  class StringReverseTest {

    @Test
    public void shouldReverseStringOptimally() {
        String actual = StringReverse.reversStringUsingCharArray("Vamika");
        String expected = "akimaV";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void shouldReverseStringUsingStringBuilder(){
        var actual = StringReverse.reverseStringUsingStringBuilder("abc");
        String expected = "cba";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReverseWordsAndSentence() {
        String actual = StringReverse.reversStringUsingCharArray("I am Vamika");
        String expected = "akimaV ma I";
        Assert .assertEquals(expected, actual);
    }

    @Test
    public void shouldReverseSentence() {
        String actual = StringReverse.reverseSentenceUsingExtraSpace("i like this program very much");
        String expected = "much very program this like i";
        Assert.assertEquals(expected, actual);
    }

}