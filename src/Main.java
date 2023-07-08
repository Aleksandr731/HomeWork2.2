public class Main {

    private static Gryffindor harryPotter;
    private static Gryffindor hermioneGranger;
    private static Gryffindor ronWeasley;
    private static Slytherin dracoMalfoy;
    private static Slytherin grahamMontagu;
    private static Slytherin gregoryGoyle;
    private static Hufflepuff zachariahSmith;
    private static Hufflepuff cedricDiggory;
    private static Hufflepuff justinFinchFletchley;
    private static Ravenclaw zhouChang;
    private static Ravenclaw padmaPatil;
    private static Ravenclaw marcusBelby;

    public static void main(String[] args) {

        Hogwarts [] Hogwarts = {
                harryPotter = new Gryffindor("Гарри", 78, 89,
                        70, 90, 68),
                hermioneGranger = new Gryffindor( "Гермиона",72,68,
                        43, 67, 56),
                ronWeasley = new Gryffindor("Рон",56, 78,
                        67, 64, 43),

                dracoMalfoy = new Slytherin("Драко",56, 78,
                        67, 64, 43,
                        23, 67),
                grahamMontagu = new Slytherin("Грэхэм",54, 34,
                        65, 34, 86,
                        96, 57),
                gregoryGoyle = new Slytherin("Грегори",34, 24,
                        45, 53, 56,
                        32, 67),

                zachariahSmith = new Hufflepuff("Захария",34, 39,
                        61, 24, 68),
                cedricDiggory = new Hufflepuff("Седрик",24, 75,
                        68, 41, 35),
                justinFinchFletchley = new Hufflepuff("Джастин",24, 75,
                        68, 41, 35),

                zhouChang = new Ravenclaw("Чжоу",65, 35,
                        64, 35, 64, 87),
                padmaPatil = new Ravenclaw("Падма",53, 26,
                        74, 36, 57, 81),
                marcusBelby =  new Ravenclaw("Маркус",43, 53,
                        52, 74, 36, 26),
        };
        System.out.println("Описание студента 'Гарри Потер' - " + harryPotter.printStudent());
        System.out.println("Описание студента 'Драко Малфой' - " + dracoMalfoy.printStudent());
        System.out.println("Описание студента 'Захария Смит' - " + zachariahSmith.printStudent());
        System.out.println("Описание студента 'Чжоу Чанг' - " + zhouChang.printStudent());
        System.out.println("======================================================================================================");
        harryPotter.compareStudent(hermioneGranger);
        dracoMalfoy.compareStudent(grahamMontagu);
        zachariahSmith.compareStudent(cedricDiggory);
        zhouChang.compareStudent(padmaPatil);
        System.out.println("======================================================================================================");
        harryPotter.compareStudent(dracoMalfoy);



    }
}