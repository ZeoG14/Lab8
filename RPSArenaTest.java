import java.util.LinkedHashMap;

/**
 * Lab 
 *
 * Test suite for the RPSArena class.
 *
 * @author Stephen
 * @version 2018-03-12
 *
 */
public class RPSArenaTest {

    /**
     * The RPSArena instance to test.
     */
    private static RPSArena arena;

    /**
     * Creates a RPSArena instance for testing.
     */
    public static void initialize() throws AssertException
    {
    	 arena = new RPSArena();
    }

    
    /**
     * Tests the constructor and the contestant lists
     */
    public void testContestantList() throws AssertException {
    	Assert.assertEquals(Contestant.GEORGE, arena.getContestant("GEO"));
    	Assert.assertEquals(Contestant.JILL, arena.getContestant("JIL"));
    	Assert.assertEquals(Contestant.MATTHEW, arena.getContestant("MAT"));
    	Assert.assertEquals(Contestant.BETTY, arena.getContestant("BET"));
    	
    }

    /**
     * Tests getting the abbreviations.
     */
    public void testContestantAbbreviations() throws AssertException {
    	Assert.assertEquals("[GEO, JIL, MAT, BET]", arena.getContestantAbbreivations().toString());
    }
    
    /**
     * Tests getting the contestants that exist in the map.
     */
    public void testGetContestantExists() throws AssertException {
    	Assert.assertEquals(Contestant.GEORGE, arena.getContestant("GEO"));
    	Assert.assertEquals(Contestant.JILL, arena.getContestant("JIL"));
    	Assert.assertEquals(Contestant.MATTHEW, arena.getContestant("MAT"));
    	Assert.assertEquals(Contestant.BETTY, arena.getContestant("BET"));
    }
    
    /**
     * Tests getting a contestant that does not exist in the map.
     * Note: there is an assertNull method within Assert.java you can use
     */
    public void testGetContestantDoesNotExist() throws AssertException {
    	Assert.assertNull(arena.getContestant("JAC"));
    }
    
    /**
     * Tests a contestant battle ending in a tie.
     * Note: there is an assertNull method within Assert.java you can use
     */
    public void testContestantBattleTie() throws AssertException {
    	Assert.assertNull(RPSArena.battleContestants(Contestant.GEORGE, Contestant.JILL));
    }
    
    /**
     * Tests a contestant battle ending in George winning.
     */
    public void testContestantBattleGeorgeWins() throws AssertException {
    	Assert.assertEquals(Contestant.GEORGE, RPSArena.battleContestants(Contestant.GEORGE, Contestant.MATTHEW));
    }
    
    /**
     * Tests a contestant battle ending in Betty winning.
     */
    public void testContestantBattleBettyWins() throws AssertException {
    	Assert.assertEquals(Contestant.BETTY, RPSArena.battleContestants(Contestant.BETTY, Contestant.GEORGE));
    }
}
