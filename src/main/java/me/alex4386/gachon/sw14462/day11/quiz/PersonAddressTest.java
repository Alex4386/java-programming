package me.alex4386.gachon.sw14462.day11.quiz;

public class PersonAddressTest {
    public static void main(String[] args) {
        PersonAddress addr1 = new PersonAddress();
        PersonAddress addr2 = new PersonAddress();

        addr1.setName("Alex", "Lee");
        addr1.setEmailAddress("alex.lee@naver.com");
        addr1.setPhoneNumber("010-1234-5678");

        addr2.setName("Alex", "Lee");
        addr2.setEmailAddress("alex@gmail.com");
        addr2.setPhoneNumber("010-5678-1234");

        addr1.printPersonInfo();
        addr2.printPersonInfo();

        if (addr1.equals(addr2)) {
            System.out.println("Same person");
        } else {
            System.out.println("Different person");
        }
    }
}
