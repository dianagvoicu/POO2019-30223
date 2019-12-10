public class TestFacebook {
	public static void main(String[] args) {
		FacebookAccount f = new FacebookAccount("Dean Winchester", 30, "Kansas");
		FacebookAccount f1 = new FacebookAccount("Sam Winchester", 25, "Kansas");
		FacebookAccount f2 = new FacebookAccount("Jeane Johnson", 20, "Cluj");
		FacebookAccount f3 = new FacebookAccount("Frank Castle", 35, "New York");
		FacebookAccount f4 = new FacebookAccount("Katherine Arch", 22, "Kansas");

		f.addFriend(f1);
		f.addFriend(f2);
		f.addFriend(f3);
		f.addFriend(f4);

		System.out.println("Listeaza prietenii:");
		f.listFriends();
		System.out.println();

		System.out.println("Listeaza prietenii care au locatia Kansas a lui f:");
		f.findFriends("Kansas");
		System.out.println();

		f.removeFriend(f1);
		System.out.println("Listeaza prietenii dupa remove:");
		f.listFriends();
		System.out.println();
	}
}
