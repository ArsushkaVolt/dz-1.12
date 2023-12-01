public class Pochasovaya extends Person{
    int money, hours;

    public Pochasovaya(String name, String surname, String form,  int money, int hours){
        super(name, surname, form);
        this.money = money;
        this.hours = hours;


    }
    public int getSalary(){
        return money * hours;
    }

}
