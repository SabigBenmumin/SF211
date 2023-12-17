// Name (in English): Sabig Benmumin
// ID: 6510742197

import java.util.ArrayList;

public class Q2 {
  public static void main(String[] args) {
    Phonebook phonebook = new Phonebook();
    System.out.println(phonebook);
    phonebook.addPhone("Jaguar", "0885551234");
    phonebook.addPhone("Bella", "0885551234");
    phonebook.addPhone("Bella", "0885559999");
    phonebook.addPhone("Jesse", "0115551234");
    phonebook.addPhone("Jaguar", "0122334455");
    System.out.println(phonebook);
    System.out.println("0885551234 belongs to " + phonebook.getName("0885551234"));
    System.out.println("Jaguar's phone numbers:");
    for (String number : phonebook.getNumbers("Jaguar"))
      System.out.println(number);
    if (phonebook.removePhone("0115551234"))
      System.out.println(phonebook);
    if (phonebook.removePhone("0115551234"))
      System.out.println(phonebook);
  }
}

class Phone {
  private String name;
  private String number;

  public Phone(String name, String number) {
    setName(name);
    setNumber(number);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public String getNumber() {
    return number;
  }

  public String toString() {
    return name + " - " + number;
  }
}

class Phonebook{
  private ArrayList<Phone> phoneList;
  public Phonebook(){
    phoneList = new ArrayList<>();
  }
  public void addPhone(String name, String number){
    if(getName(number) == null){
      phoneList.add(new Phone(name, number));
    }
  }
  public boolean removePhone(String number){
    for (Phone p: phoneList){
      if (p.getNumber().equals(number)){
        phoneList.remove(p);
        return true;
      }
    }
    return false;
  }
  public ArrayList<String> getNumbers(String name){
    ArrayList<String> phones = new ArrayList<>();
    for (Phone p: phoneList){
      if (p.getName().equals(name)){
        phones.add(p.getNumber());
      }
    }
    return phones;
  }
  public String getName(String number){
    for(Phone p: phoneList){
      if(p.getNumber().equals(number)){
        return p.getName();
      }
    }
    return null;
  }
  public String toString(){
    if (phoneList.size() == 0) {
      return "Phonebook is Empty";
    }
    String s = phoneList.get(0) + "";
    for (int i = 1; i < phoneList.size() ; i++){
      s += "\n" + phoneList.get(i);
    }
    return s;
  }
}