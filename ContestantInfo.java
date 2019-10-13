/**
 * Lab 8
 *
 * Class that holds information about a Contestant.
 * This information includes the Contestant's region
 * and the Contestant's choice of hand to throw.
 *
 * @author Stephen
 * @version 2018-03-12
 */
public class ContestantInfo
{
    /**
     * The Contestant's region.
     */
    private Region region;

    /**
     * What choice the Contestant will make in Rock-Paper-Scissors.
     */
    private HandChoice choice;

    /**
     * Constructor 
     * 
     * @param region The Contestant's region.
     * @param choice The Contestant's hand choice.
     */
    public ContestantInfo(Region region, HandChoice choice)
    {
    	this.region = region;
    	this.choice = choice;
    }

    /**
     * Return the region
     * 
     * @return the region.
     */
    public Region getRegion()
    {
    	return region;
    }

    /**
     * Return the hand choice
     * 
     * @return the hand choice.
     */
    public HandChoice getChoice()
    {
    	return choice;
    }

    /**
     * Return "contestant from <contestant name> throwing <choice>"
     */
    @Override
    public String toString()
    {
    	return String.format("contestant from %s throwing %s", region, choice);
    }
}