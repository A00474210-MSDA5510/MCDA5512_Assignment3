import com.smu.mscda.CaptilizeAndGenerateMD5Hex;
import org.junit.Assert;
import org.junit.Test;

public class CaptilizeAndGenerateMD5HexTest {
    private String INPUT = "smu";
    @Test
    public void testCapitalize(){
        Assert.assertEquals("Smu", CaptilizeAndGenerateMD5Hex.Capitalize(INPUT));
    }
    @Test
    public void testGenerateMD5Hex(){
        Assert.assertEquals("3773300c2f413cc7136f8d74b305519c", CaptilizeAndGenerateMD5Hex.GenerateMD5Hex(INPUT));
    }

}
