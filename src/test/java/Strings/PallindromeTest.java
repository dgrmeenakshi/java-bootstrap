package Strings;
import Strings.PallindromeDetetor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PallindromeTest {
    @Test
    public void isPallindrome_ForPallindromString_ReturnTrue() {
        boolean isPallindrome = PallindromeDetetor.IsPallindrome("AAA");
        Assert.assertTrue(isPallindrome);

    }

    @Test
    public void isPallindrome_ForIncorrectPallindromString_ReturnTrue() {
        boolean isPallindrome = PallindromeDetetor.IsPallindrome("ACS");
        Assert.assertFalse(isPallindrome, "Not a Pallindrome");

    }

    @Test
    public void isPallindrome_ForPallindromNumbrer_ReturnTrue() {

        boolean isPallindrome = PallindromeDetetor.IsPallindrome("333");
        Assert.assertTrue(isPallindrome, "Not a Pallindrome");

    }

    @Test
    public void isPallindrome_ForIncorrectPallindromNumbrer_ReturnTrue() {

        boolean isPallindrome = PallindromeDetetor.IsPallindrome("098");
        Assert.assertFalse(isPallindrome, "Not a Pallindrome");

    }


}
