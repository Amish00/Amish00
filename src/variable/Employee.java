package variable;

public class Employee {
    String companyName = "ABC LTD";
    static String contact = "9876543210";
    public void members(){
        int id[] = new int[5];
        id[0] = 10;
        id[1] = 20;
        id[2] = 30;
        id[3] = 40;
        id[4] = 50;

        String[] name = new String[5];
        name[0] = "Ram";
        name[1] = "Sam";
        name[2] = "Ham";
        name[3] = "Pam";
        name[4] = "Mam";

        String[] address = new String[5];
        address[0] = "Patan";
        address[1] = "Pokhara";
        address[2] = "Kathmandu";
        address[3] = "Tangal";
        address[4] = "Naxal";

        for (int i = 0; i<5; i++){
            System.out.println("id: "+ id[i]);
            System.out.println("name: " + name[i]);
            System.out.println("address:" + address[i]);
            System.out.println();
        }
    }
}
