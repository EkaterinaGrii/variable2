public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double dog = 8.0;
        double cat = 3.6;
        int paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        double dog2 = dog + 4.0;
        double cat2 = cat + 4.0;
        int paper2 = paper + 4;
        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(paper2);

        double dog3 = dog - 3.5;
        double cat3 = cat - 1.6;
        int paper3 = paper - 7639;
        System.out.println(dog3);
        System.out.println(cat3);
        System.out.println(paper3);

        int friend = 19;
        System.out.println(friend);
        friend -= 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        double frog = 3.5;
        System.out.println(frog);
        frog *= 10.0;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4.0;
        System.out.println(frog);

        double boxerWeightOne = 78.2;
        double boxerWeightTwo = 82.7;
        double result1 = boxerWeightOne + boxerWeightTwo;
        System.out.println(result1);
        double result2 = boxerWeightTwo - boxerWeightOne;
        System.out.println(result2);
        double result3 = boxerWeightTwo % boxerWeightOne;
        System.out.println(result3);

        int hourWorkAll = 640;
        int hourEvery = 8;
        int worker = hourWorkAll / hourEvery;
        System.out.println("Всего работников в компании - " + worker + " человек");
        int worker2 = worker + 94;
        int hourWorkAll2 = worker2 * hourEvery;
        System.out.println("Если в компании работает " + worker2 + " человека,то всего " + hourWorkAll2 + " часов работы может быть поделено между сотрудниками");
    }
}