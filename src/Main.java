public class Main {

    public static void main(String[] args) {


        Gryffindor harryPotter = new Gryffindor("Гарри", 78, 89,
                        70, 90, 68);
        Gryffindor hermioneGranger = new Gryffindor( "Гермиона",72,68,
                        43, 67, 56);
        Gryffindor ronWeasley = new Gryffindor("Рон",56, 78,
                        67, 64, 43);

        Slytherin dracoMalfoy = new Slytherin("Драко",56, 78,
                        67, 64, 43,
                        23, 67);
        Slytherin grahamMontagu = new Slytherin("Грэхэм",54, 34,
                        65, 34, 86,
                        96, 57);
        Slytherin gregoryGoyle = new Slytherin("Грегори",34, 24,
                        45, 53, 56,
                        32, 67);

        Hufflepuff zachariahSmith = new Hufflepuff("Захария",34, 39,
                        61, 24, 68);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик",24, 75,
                        68, 41, 35);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин",24, 75,
                        68, 41, 35);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу",65, 35,
                        64, 35, 64, 87);
        Ravenclaw padmaPatil = new Ravenclaw("Падма",53, 26,
                        74, 36, 57, 81);
        Ravenclaw marcusBelby =  new Ravenclaw("Маркус",43, 53,
                        52, 74, 36, 26);

        System.out.println("Описание студента 'Гарри Потер' - " + harryPotter.toString());
        System.out.println("Описание студента 'Драко Малфой' - " + dracoMalfoy.toString());
        System.out.println("Описание студента 'Захария Смит' - " + zachariahSmith.toString());
        System.out.println("Описание студента 'Чжоу Чанг' - " + zhouChang.toString());
        System.out.println("======================================================================================================");
        harryPotter.compareStudent(hermioneGranger);
        dracoMalfoy.compareStudent(grahamMontagu);
        zachariahSmith.compareStudent(cedricDiggory);
        zhouChang.compareStudent(padmaPatil);
        System.out.println("======================================================================================================");
        harryPotter.compareStudent(dracoMalfoy);



    }
}