public class Coin {
    private final int HEADS = 0;  // tails is 1

    private int face;  // current side showing

    //-----------------------------------------------------------------
    //  Sets up this coin by flipping it initially.
    //-----------------------------------------------------------------
    public Coin()
    {
        flip();
    }

    //-----------------------------------------------------------------
    //  Flips this coin by randomly choosing a face value.
    //-----------------------------------------------------------------
    public void flip()
    {
        face = (int) (Math.random() * 2);
    }
    public static boolean isHeads()
    {
        return (face == HEADS);
    }

    //-----------------------------------------------------------------
    //  Returns the current face of this coin as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return (face == HEADS) ? "Heads" : "Tails";
    }

}
