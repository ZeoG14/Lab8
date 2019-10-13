/**
 * Lab 8
 *
 * Test suite for the ContestantInfo class.
 *
 * @author Stephen
 * @version 2018-03-12
 *
 */
public class ContestantInfoTest
{
    /**
     * The ContestantInfo instance to test.
     */
    private static ContestantInfo info;

    /**
     * Creates a ContestantInfo instance for testing.
     */
    public static void initialize() throws AssertException
    {
    	info = new ContestantInfo(Region.SOUTH, HandChoice.ROCK);
    }

    /**
     * Tests the ContestantInfo constructor.
     */
    public void contestantInfoConstructorTest() throws AssertException
    {
    	Assert.assertEquals(Region.SOUTH, info.getRegion());
    	Assert.assertEquals(HandChoice.ROCK, info.getChoice());
    }

    /**
     * Tests that ContestantInfo.toString() returns the expected value.
     */
    public void contestantInfoToStringTest() throws AssertException
    {
    	Assert.assertEquals("contestant from south throwing rock", info.toString());
    }
}
