package com.oop.assignment1;

public class PhoneNumberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list = { "Becky Warren, 555-1223", "Joe Looney, 555-0097", "Geri Palmer, 555-8787",
				"Lynn Presnell, 555-1212", "Holly Gaddis, 555-8878", "Sam Wiggins, 555-0998", "Bob Kain, 555-8712",
				"Tim Haynes, 555-7676", "Warren Gaddis, 555-9037", "Jean James, 555-4939", "Ron Palmer, 555-2783", };
		searchDirectory(list, "abcd");

	}

	private static void searchDirectory(String[] list, String string) {
		String userString[] = string.split("\\s");
		for (int i = 0; i < list.length; i++) {
			int firstPart = list[i].indexOf(" ");
			int secondPart = list[i].indexOf(",");
			String str1 = list[i].substring(0, firstPart);
			String str2 = list[i].substring(firstPart + 1, secondPart);

			if (userString.length == 2) {
				if (userString[0].equalsIgnoreCase(str1) && userString[1].equalsIgnoreCase(str2)) {
					System.out.println(list[i]);
					break;

				}
			} else if (string.equalsIgnoreCase(str1) || string.equalsIgnoreCase(str2)) {
				System.out.println(list[i]);

			} else {
				System.out.println("Not found");
				break;
			}
		}

	}
}
