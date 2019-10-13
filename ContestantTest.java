/**
 * Lab 8
 *
 * Test suite for the Contestant enum.
 *
 * @author Stephen
 * @version 2018-03-12
 *
 */
public class ContestantTest
{
    /**
     * Tests that George's region is the expected value.
     */
    public void contestantGeorgeGetRegionTest() throws AssertException
    {
    	 Assert.assertEquals(Region.NORTH, Contestant.GEORGE.getRegion());
    }
    
    /**
     * Tests that Jill's region is the expected value.
     */
    public void contestantJillGetRegionTest() throws AssertException
    {
    	Assert.assertEquals(Region.SOUTH, Contestant.JILL.getRegion());
    }

    /**
     * Tests that Matthew's region is the expected value.
     */
    public void contestantMatthewGetRegionTest() throws AssertException
    {
    	Assert.assertEquals(Region.EAST, Contestant.MATTHEW.getRegion());
    }

    /**
     * Tests that Betty's region is the expected value.
     */
    public void contestantBettyGetRegionTest() throws AssertException
    {
    	Assert.assertEquals(Region.WEST, Contestant.BETTY.getRegion());
    }

    /**
     * Tests that George's hand choice is the expected value.
     */
    public void contestantGeorgeGetChoiceTest() throws AssertException
    {
    	Assert.assertEquals(HandChoice.ROCK, Contestant.GEORGE.getChoice());
    }
    
    /**
     * Tests that Jill's hand choice is the expected value.
     */

    public void contestantJillGetChoiceTest() throws AssertException
    { 
    	Assert.assertEquals(HandChoice.ROCK, Contestant.JILL.getChoice());
    }

    /**
     * Tests that Matthew's hand choice is the expected value.
     */
    public void contestantMatthewGetChoiceTest() throws AssertException
    {
    	Assert.assertEquals(HandChoice.SCISSORS, Contestant.MATTHEW.getChoice());
    }

    /**
     * Tests that Betty's hand choice is the expected value.
     */
    public void contestantBettyGetChoiceTest() throws AssertException
    {
    	Assert.assertEquals(HandChoice.PAPER, Contestant.BETTY.getChoice());
    }

    /**
     * Tests that Supercontestant.toString() returns the expected value for each contestant.
     */
    public void contestantToStringTest() throws AssertException
    {
    	Assert.assertEquals("george: contestant from north throwing rock", Contestant.GEORGE.toString());
    	Assert.assertEquals("jill: contestant from south throwing rock", Contestant.JILL.toString());
    	Assert.assertEquals("matthew: contestant from east throwing scissors", Contestant.MATTHEW.toString());
    	Assert.assertEquals("betty: contestant from west throwing paper", Contestant.BETTY.toString());
    }
}
