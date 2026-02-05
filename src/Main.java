public class Main {
    public static void main(String[] args) {
        //Задание1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задание2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задание3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задание4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Задание5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Задание6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println(totalWeight);
        var weightDifference = boxer2 - boxer1;
        System.out.println(weightDifference);
        //Задание7
        var remains = boxer2 % boxer1;
        System.out.println(remains);
        //Задание8
        var time = 640;
        var human = time / 8;
        System.out.println("Всего работников в компании - " + human + " человек.");
        human = human + 94;
        time = human * 8;
        System.out.println("Если в компании работает " + human + " человек, то всего " + time + " часов работы может быть поделено между сотрудниками");
    }
}