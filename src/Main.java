public class Main {
    public static void main(String[] args) {

        Sheep sheep = new Sheep(30,2,"male","Masha");
        Horse horse = new Horse(150,4,"male","Orhan");
        Cow cow = new Cow(100,3,"female","Burenka");

        Sheep [] sheeps = new Sheep[]{
                new Sheep(50,2,"female","David"),
                new Sheep(30,3,"male","Masha"),
                new Sheep(40,1,"famale","Stefan")};

        Cow [] cows = new Cow[]{
                new Cow(80,3,"famale","AVRORA"),
                new Cow(50,2,"famale","Belka"),
                new Cow(40,2,"famale","Burenka"),
                new Cow(85,4,"famale","Gal`ka"),
                new Cow(55,2,"famale","Assol")};

        Horse [] horses = new Horse[]{
                new Horse(80,2,"male","Gerkules"),
                new Horse(100,3,"female","Pseydon")};

        Farm farm = new Farm("Sh entuziastov 7",cows,horses,sheeps,"Gulnur");
        System.out.println(farm);

        Cow [] cows1 = new Cow []{
                 new Cow(60,3,"female","Masha")};
        Horse [] horses1 = new Horse[]{
                new Horse(60,3,"female","Gabriel")};
        Sheep [] sheep1 = new Sheep[]{
                new Sheep(20,2,"male","Gita")};

        Farm farm1 = new Farm("Ulianov 55",cows1,horses1,sheep1,"Meder");
        System.out.println(farm1);
    }
}