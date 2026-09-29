public class BuddyInfo {
    private String name;
    private String address;
    private String number;

    public BuddyInfo(){
        this.name = "N/A";
        this.address = "homeless";
        this.number = "0000000000";
    }

    public BuddyInfo(String name, String addr, String num){
        this.name = name;
        this.address = addr;
        this.number = num;
    }

    static void main() {
      //  System.out.println("Hello World");
        BuddyInfo buddy = new BuddyInfo("Tony", "A real Address", "101292614");
        System.out.println("Hello " + buddy.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
