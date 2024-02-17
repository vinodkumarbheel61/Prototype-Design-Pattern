public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating object using prototype design");

        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.4.4");
        networkConnection.loadVeryImportantData();

        System.out.println(networkConnection);

        // we need new object of network connection
        try {
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2);

            NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
