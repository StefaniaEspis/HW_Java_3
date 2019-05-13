import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Fruit> box = new Box<>();
        Box<Apple> boxa = new Box<>();
        boxa.addFruit(new Apple());
        boxa.transfer(box);

    }

    //Задача 1.Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа)
    public static void swap(Object[] arr, int x1, int x2) {
        Object temp = arr[x1];
        arr[x1] = arr[x2];
        arr[x2] = temp;

    }

    // Задача 2. Написать метод, который преобразует массив в ArrayList;
    public static <T> ArrayList<T> convert(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }


    }

