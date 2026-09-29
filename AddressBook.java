import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddies ;

    public AddressBook(){
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if (buddy != null){buddies.add(buddy);}
    }

    public void removeBuddy(BuddyInfo buddy){
        if (buddies.contains(buddy)) {
            buddies.remove(buddy);
        }
        else {
            System.out.println("Buddy does not exist");
        }
    }

    static void main() {
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        // This is the branch version
        // Test update
    }
}

