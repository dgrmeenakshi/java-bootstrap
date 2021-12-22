package Strings;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;


public class RemoveStringDuplicateTest {
    @Test
    public void shouldCountNumberOfCharinWordWithCorrectInput() {
        Map<Character, Integer> actual = RemoveStringDuplicate.countNumberOfCharsInString("abbcch");
        Assert.assertEquals(java.util.Optional.ofNullable(actual.get('a')),1);
        Assert.assertEquals(java.util.Optional.ofNullable(actual.get('b')),2);
        Assert.assertEquals(java.util.Optional.ofNullable(actual.get('c')),2);
        Assert.assertEquals(java.util.Optional.ofNullable(actual.get('h')),1);

    }
}
