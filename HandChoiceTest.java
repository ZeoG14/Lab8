/**
 * Lab 8
 *
 * Test suite for the HandChoice enum.
 *
 * @author Stephen
 * @version 2018-03-12
 *
 */
public class HandChoiceTest
{
    /**
     * Tests that the enum returns the expected HandChoice
     * as being weak against the PAPER type.
     */
    public void paperEffectiveAgainstTest() throws AssertException
    {
    	Assert.assertEquals(HandChoice.ROCK, HandChoice.PAPER.winsAgainst());
    }

    /**
     * Tests that the enum returns the expected HandChoice
     * as being weak against the ROCK type.
     */
    public void rockEffectiveAgainstTest() throws AssertException
    {
    	Assert.assertEquals(HandChoice.SCISSORS, HandChoice.ROCK.winsAgainst());
    
    }

    /**
     * Tests that the enum returns the expected HandChoice
     * as being weak against the SCISSORS type.
     */
    public void scissorsEffectiveAgainstTest() throws AssertException
    {
    	Assert.assertEquals(HandChoice.PAPER, HandChoice.SCISSORS.winsAgainst());
    }

    /**
     * Tests that HandChoice.toString() returns the expected value.
     */
    public void handChoiceToStringTest() throws AssertException
    {
    	Assert.assertEquals("rock", HandChoice.ROCK.toString());
    	Assert.assertEquals("paper", HandChoice.PAPER.toString());
    	Assert.assertEquals("scissors", HandChoice.SCISSORS.toString());
    	
    }
}
