/**@author mihaela
 * Клас room съдържа аксесори и мутатори отнасящи се за стаята.  
 */
class room {
 
    String mainName;
    int guestsInRoom;
    String getName;
 
    public room(String a) {
        mainName = a;
        System.out.println("made a room ");
    }
 
    public room() {
        mainName = "x";
        System.out.println("made a room ");
    }
 
    public void setName(String aName) {
        System.out.println("add name class method ");
        mainName = aName;
    }
 
    public String getName() {
        return mainName;
    }
}