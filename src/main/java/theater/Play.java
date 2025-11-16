package theater;

/**
 * Class representing a play with a name and type.
 */
public class Play {

    private final String name;
    private final String type;

    /**
     * Constructs a Play object.
     *
     * @param name the play's name
     * @param type the play's type (e.g., "tragedy", "comedy")
     */
    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Returns the play's name.
     *
     * @return the name of the play
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the play's type.
     *
     * @return the type of the play
     */
    public String getType() {
        return type;
    }
}
