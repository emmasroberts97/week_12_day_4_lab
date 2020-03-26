import java.util.ArrayList;
import java.util.Random;

public class Quest {

    private ArrayList<Room> rooms;

    public Quest(){
        this.rooms = new ArrayList<Room>();
        this.generateRooms();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int numberOfRooms(){
        return this.rooms.size();
    }

    public void generateRooms(){
        Random r = new Random();
        int position = r.nextInt((6 - 1) + 1) + 1;
        int i = 0;
        while (i < position){
            rooms.add(new Room());
            i++;
        }
    }

    public boolean isQuestComplete(){
        if (rooms.size() == 0){
            return true;
        } else {
            return false;
        }
    }

}
