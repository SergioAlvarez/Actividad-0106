import java.util.HashMap;
import java.util.Set;
/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */
public class Room 
{
    private String description;
    private HashMap<String, Room> exits;
    private String objeto;
    private float peso;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description, String objeto, float peso) 
    {
        this.description = description;
        exits = new HashMap<>();
        this.objeto = objeto;
        this.peso = peso;
    }

    /**
     * 
     */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

    public Room getExit(String direction)
    {
        return exits.get(direction);
    }

    /**
     * Return a description of the room's exits.
     * For example: "Exits: north east west"
     *
     * @ return A description of the available exits.
     */
    public String getExitString()
    {
        Set<String> nameOfdirection = exits.keySet();
        String exit = "Exits :";
        for(String direction : nameOfdirection)
        {
            exit += direction + " ";
        }
        return exit;
    }

    /**
     * Return a long description of this room, of the form:
     *     You are in the 'name of room'
     *     Exits: north west southwest
     * @return A description of the room, including exits.
     */
    public String getLongDescription()
    {
        String cadena = "Tu est�s ";
        System.out.println(cadena + getDescription());
        System.out.println(getExitString());
        System.out.println("Objeto : " + getObjeto());
        System.out.println("Peso : " + getPeso());
        return cadena;
    }

    public String getObjeto()
    {
        return objeto;
    }

    public float getPeso()
    {
        return peso;
    }
}
