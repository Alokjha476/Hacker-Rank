package Java_8.OptionalClasses;

import java.util.Optional;
/*4. Write a program to demonstrate flatMap by finding the address of a person
using Optional. If the person or their address is null, return "Address Not Found".
*/
class Address {

    private final String city;

    public Address(String city) {
        this.city = city;
    }
    public String getCity(){
        return city;
    }
}

class Person {
    private Address address;
    public Person(Address address){
        this.address=address;

    }
    public Optional<Address> getAddress(){
        return Optional.ofNullable(address);
    }

}

public class FlatMapUses {
    public static String getCityName(Person person){
        return Optional.of(person)
                .flatMap(Person::getAddress)
                .map(Address::getCity)
                .orElse("Address not found:");
    }
    public static void main(String[] args) {
        Address address = new Address("Bareilly");
        Person personWithAddress = new Person(address);
        Person personWithoutAddress = new Person(null);

        System.out.println(getCityName(personWithAddress));
        System.out.println(getCityName(personWithoutAddress));





    }


}
