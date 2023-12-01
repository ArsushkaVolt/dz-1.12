
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Stavka sergey = new Stavka("Сергей", "Иванов", "Ставка", 3000, 5);
        Pochasovaya michail = new Pochasovaya("Михаил", "Петров", "Почасовая", 1500, 5);
        Sdelnaya aleksei = new Sdelnaya("Алексей", "Николаев", "Сдельная", 2200, 5);


        Person[] employees = new Person[]{sergey, michail, aleksei};

        System.out.println("Имя" + " " +"Фамилия"  + " " + "Вид"  + " " + "Сумма");
        for(Person person: employees){

            System.out.println(person.getName() + " "  + person.getForm() + " " + person.getSalary());
            sum += person.getSalary();
        }
        System.out.println("Итого:" + sum);

    }
}