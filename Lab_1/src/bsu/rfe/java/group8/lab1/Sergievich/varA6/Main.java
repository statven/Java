package bsu.rfe.java.group8.lab1.Sergievich.varA6;
public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);

            } else if (parts[0].equals("Coffee")) {
                breakfast[itemsSoFar] = new Coffee(parts[1]);
            }
            itemsSoFar++;
        }
        countFood(breakfast, new Apple(""));
        countFood(breakfast, new Cheese());
        countFood(breakfast, new Coffee(""));
        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
                System.out.println();

            } else {
                break;
            }
        }
        System.out.println("Всего хорошего!");
    }

    public static void countFood(Food[] foods, Food food) {
        int count = 0;
        for (Food f : foods) {
            if (f != null && f.equals(food)) {
                count++;
            }

        }
        System.out.println("There are " + count + " products of type " + food.getClass().getSimpleName() + " in the breakfast");
    }
}