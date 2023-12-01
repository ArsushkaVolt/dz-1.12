public class Stavka extends Person {
    int money, days;

    public Stavka(String name, String surname, String form,  int money, int days){
        super(name, surname, form);
        this.money = money;
        this.days = days;
    }

    public int getSalary(){
        return money * days;
    }
}
